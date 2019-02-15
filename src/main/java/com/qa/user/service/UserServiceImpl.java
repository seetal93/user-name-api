package com.qa.user.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.user.persistence.domain.UserName;
import com.qa.user.persistence.repository.UserRepository;
import com.qa.user.util.generators.CreateUser;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Autowired
	private CreateUser userCreator;

	public String createUserName() {
		List<String> allUserNames = getUserNameArray();
		userCreator.getGenerator().setUserNameList(allUserNames);
		
		String generatedUserName = userCreator.createUserName();
		repo.save(new UserName(generatedUserName));
		
		return generatedUserName;
	}
	private List<String> getUserNameArray() {
		List<UserName> objectList = repo.findAll();
		return objectList.stream().map(UserName::getUserName).collect(Collectors.toList());
	}
	

}
