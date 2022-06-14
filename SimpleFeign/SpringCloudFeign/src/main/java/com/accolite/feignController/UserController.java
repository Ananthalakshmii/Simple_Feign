package com.accolite.feignController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.dto.UserDTO;
import com.accolite.feignclient.UserClient;

@RestController
public class UserController {
	
	@Autowired
	private UserClient userClient;
	
	@GetMapping("/findAllUsers")
	public List<UserDTO> getUsers(){
		return userClient.getUsers();
	}

}
