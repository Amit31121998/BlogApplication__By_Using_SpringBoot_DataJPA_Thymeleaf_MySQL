package com.amit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entity.UserDtlsEntity;

public interface UserDtlsRepo extends JpaRepository<UserDtlsEntity, Integer>{
	
	public UserDtlsEntity findByEmailAndPwd(String email,String pwd);

}
