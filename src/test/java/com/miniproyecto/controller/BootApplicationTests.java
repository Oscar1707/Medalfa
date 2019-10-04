package com.miniproyecto.controller;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.miniproyecto.controller.model.Users;
import com.miniproyecto.controller.reposotory.UsersRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
	private UsersRepository repoUser;
//	@Autowired
//	private BCryptPasswordEncoder encoder;
	
	@Test
	public void creaUsuario() {
		Users us = new Users();
		us.setId(7);
		us.setName("oscar");
		us.setPassword("123");
		repoUser.save(us);
		//Users retorno =  repoUser.save(us);
		
		//assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}
