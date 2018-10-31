package com.example.demo.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	private ObjectMapper mapper;
	
/* metodo editar y guardar*/ 

	@SuppressWarnings("rawtypes")
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public ResponseEntity saveOrUpdate(@RequestBody String userJson)
			throws JsonParseException, JsonMappingException, IOException {

         User user = new User();
		
         this.mapper = new ObjectMapper();
		try {
			user = this.mapper.readValue(userJson, User.class);
			System.out.println(user);
			
			if (!this.validate(user)) {
				System.out.println("if");
				return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
			}
			this.userService.save(user);
			System.out.println("save");
			return new ResponseEntity(HttpStatus.OK);

		} catch (Exception e) {
			System.out.println(e);				
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)

	/*metodo buscar*/
	
	public List<User> getUsers() {
		
		return this.userService.findAll();
	}
	
	@RequestMapping(value="/deleteUser", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson) 
	throws Exception 
	 {
	this.mapper = new ObjectMapper();
	  User user = this.mapper.readValue(userJson, User.class);
	   if (user.getId()== 0L) {
		   throw new Exception ("El Id esta nulo");
	   }
	this.userService.deleteUser(user.getId());
	}
	 
	private boolean validate(User user) {
		boolean isValid = true;

		if (user.getFirstName() == "" || user.getFirstName()==null) {
			isValid = false;
		}
		if (user.getFirstSurname() == "" || user.getFirstSurname()==null) {
			isValid = false;
		}
		if (user.getAddress() == "" || user.getAddress()== null) {
			isValid = false;
		}
		if (user.getCedula() == "" || user.getCedula()== null) {
			isValid = false;
		}
		if (user.getcorreoPersonal() == "" || user.getcorreoPersonal()== null) {
			isValid = false;
		}
		if (user.getcorreoEspe() == "" || user.getcorreoEspe()== null ) {
			isValid = false;
		}
		if (user.getextTelefono() == "" || user.getextTelefono()== null) {
			isValid = false;
		}
		if (user.getnameComputer() == "" || user.getnameComputer()== null) {
			isValid = false;
		}
		if (user.getsistemaOperativo() == "" || user.getsistemaOperativo()== null) {
			isValid = false;
		}
		if (user.getdominio() == "" || user.getdominio()== null) {
			isValid = false;
		}
		if (user.getoutlook() == "" || user.getoutlook()== null) {
			isValid = false;
		}
		return isValid;
	}
}
