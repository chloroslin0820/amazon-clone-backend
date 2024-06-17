package com.user_metadata.Repository;

import org.springframework.data.repository.CrudRepository;

import com.user_metadata.Entity.UserMetaData;

public interface UserRepository extends CrudRepository<UserMetaData, Long> {
	
	UserMetaData findAllByUniqueId(String uniqueId);
}
