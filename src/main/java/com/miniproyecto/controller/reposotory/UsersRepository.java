package com.miniproyecto.controller.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproyecto.controller.model.Users;



public interface UsersRepository  extends JpaRepository<Users, Integer>{

}
