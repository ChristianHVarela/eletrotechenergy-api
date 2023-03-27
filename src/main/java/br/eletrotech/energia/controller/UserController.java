package br.eletrotech.energia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eletrotech.energia.dto.UserDTO;
import br.eletrotech.energia.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping
	public List<UserDTO> findAll(){
		return service.findAll();
	}
}
