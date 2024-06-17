package com.user_metadata.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user_metadata.Entity.UserMetaData;
import com.user_metadata.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserMetaData saveUserMetaDataToDB(UserMetaData metaData) {
		return userRepository.save(metaData);
	}
	
	public UserMetaData getUserDetailsFromDB(String userId) {
		return userRepository.findAllByUniqueId(userId);
	}
}
