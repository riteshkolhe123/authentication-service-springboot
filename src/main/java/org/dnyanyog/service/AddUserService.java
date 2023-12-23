package org.dnyanyog.service;

import org.dnyanyog.dto.AddUserRequest;
import org.dnyanyog.dto.AddUserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class AddUserService {
	
	@PostMapping(path="/api/auth/add-user")
	public AddUserResponse addUser(AddUserRequest addUserRequest)
	{
		AddUserResponse response=new AddUserResponse();
		response.setStatus("Success");
		response.setMessage("User Successfully added");
		response.setUser_id(addUserRequest.getUser_id());
		response.setUser_name(addUserRequest.getUser_name());
		response.setUser_email(addUserRequest.getUser_email());
		response.setUser_age(addUserRequest.getUser_age());
		return response;
	}

}
