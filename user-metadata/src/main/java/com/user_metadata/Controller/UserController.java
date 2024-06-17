package com.user_metadata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user_metadata.Entity.UserMetaData;
import com.user_metadata.Service.UserService;

@RestController
@RequestMapping("/amazon/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save_user_details")
	public UserMetaData saveUserDetails(@RequestBody UserMetaData userData) {
		UserMetaData user = userService.saveUserMetaDataToDB(userData);
		return user;
	}
	
	@GetMapping("/get_user_details/{userId}")
	public UserMetaData getUserDetails(@PathVariable String userId) {
		UserMetaData user = userService.getUserDetailsFromDB(userId);
		return user;
	}
	
}
