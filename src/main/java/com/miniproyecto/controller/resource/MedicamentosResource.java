package com.miniproyecto.controller.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproyecto.controller.model.Users;
import com.miniproyecto.controller.reposotory.UsersRepository;

public class MedicamentosResource {
	

@RestController
@RequestMapping("/rest/medicamento")
public class UserResource {

	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping("/all")
	public List<Users> getAll(){
		return usersRepository.findAll();
		
	}
	
}

}
