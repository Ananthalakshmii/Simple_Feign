package com.accolite.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.accolite.dto.UserDTO;

@FeignClient(name="user-client",url = "https://jsonplaceholder.typicode.com")
public interface UserClient {

	@GetMapping("/users")
	public List<UserDTO> getUsers();
}
