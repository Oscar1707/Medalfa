package com.miniproyecto.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.miniproyecto.controller.model.Medicamentos;
import com.miniproyecto.controller.reposotory.MedicamentosRepository;

@Controller
public class HomeController{

	@Autowired
	MedicamentosRepository medicamentosRepository;
	

	
	@GetMapping("/")
    public ModelAndView HomeLog(HttpServletRequest request, HttpServletResponse response) {
        	ModelAndView model = new ModelAndView();
        	System.out.println("2");        
        	
        	
        return new ModelAndView("home","model",model);
    }
    
     @GetMapping("/register")
    public String greetingForm(Model model) {
    	 
        model.addAttribute("greeting", new Register());
      
        return "register";
    }

     @PostMapping("/register")
    public String greetingSubmit(@ModelAttribute Register greeting, Model model) {
    	
    	
    	String name 		= greeting.getName();
    	String specif		= greeting.getSpecif();
    	String lote 		= greeting.getLote();
    	String date			= greeting.getDate();
    	int cantid			= greeting.getCantid();
    	
    	System.out.println("name:_ "+name);
    	System.out.println("specif:_ "+specif);
    	System.out.println("lote:_ "+lote);
    	System.out.println("date:_ "+date);

    	Medicamentos medic = new Medicamentos();
    	medic.setId(null);
    	medic.setName(name);
    	medic.setSpecif(specif);
    	medic.setLote(lote);
    	medic.setDate(date);
    	medic.setCantid(cantid);
    	
    	medicamentosRepository.save(medic);
    	
        model.addAttribute("listars", medicamentosRepository.findAll());

    	
    	return "inventory";
    }
     
     
      
    
    /***************** Inventario *****************/
    @GetMapping("/inventory")
    public String inventoryForm(Model model) {
    	 
        model.addAttribute("greeting", new Register());
        model.addAttribute("listars", medicamentosRepository.findAll());
        //model.addAttribute("listars", medicamentosRepository.findById(1));
        
        
        return "inventory";
    }

    @PostMapping("/inventory")
    public String inventorySubmit(@ModelAttribute Register greeting, Model model) {
    	
    	return "home";
    }
    
  
}