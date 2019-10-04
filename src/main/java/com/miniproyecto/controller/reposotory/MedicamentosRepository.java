package com.miniproyecto.controller.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproyecto.controller.model.Medicamentos;

public interface MedicamentosRepository  extends JpaRepository<Medicamentos, Integer>{

}
