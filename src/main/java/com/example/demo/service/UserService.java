package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface UserService {
	/**
	 * guarda un usuario
	 * @param user
	 * @return usuario guardado
	 */
	User save (User user);
/**
 * Recupera lista de usuarios
 * @return lista de usuarios
 */
	List<User> findAll();
	Optional<User> findbyCedula(Long id);
	
	/*eliminar un usuario con el id
	 * 
	 */

void deleteUser(long id);

	
	
}
