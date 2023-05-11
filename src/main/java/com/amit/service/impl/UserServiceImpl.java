package com.amit.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.binding.LoginForm;
import com.amit.binding.SignupForm;
import com.amit.entity.UserDtlsEntity;
import com.amit.repo.UserDtlsRepo;
import com.amit.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDtlsRepo userDtlsRepo;

	@Override
	public boolean signUp(SignupForm form) {

		UserDtlsEntity entity = new UserDtlsEntity();
		BeanUtils.copyProperties(form, entity);
		userDtlsRepo.save(entity);
		return true;
	}

	@Override
	public String login(LoginForm form) {
		UserDtlsEntity entity = userDtlsRepo.findByEmailAndPwd(form.getEmail(), form.getPwd());
		if (entity == null) {
			return "Invalid Credentials";
		} else {
			return "success";
		}
	}
}
