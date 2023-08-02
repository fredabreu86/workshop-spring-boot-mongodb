package com.frederico.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frederico.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User ludmilla = new User("1", "Ludmilla Bernardo", "ludmillabernardo@gmail.com");
		User pedro	= new User("2", "Pedro Antonio", "pedroantonio@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(ludmilla, pedro));
		return ResponseEntity.ok().body(list);
	}
}
