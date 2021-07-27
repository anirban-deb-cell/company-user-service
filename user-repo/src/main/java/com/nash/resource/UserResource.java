package com.nash.resource;

import java.lang.reflect.InvocationTargetException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.nash.entity.CompanyUser;
import com.nash.service.UserServiceHandler;

@Path("/user")
public class UserResource {
	
	@Autowired
	UserServiceHandler userServhandler;

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean addUser(CompanyUser user) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		userServhandler.create(user);
		return true;
	}
	
	@POST
	@Path("/retrieve")
	@Produces(MediaType.APPLICATION_JSON)
	public void validateUser(CompanyUser user){
		CompanyUser userDetails = userServhandler.retrieveUser(user);
		System.out.println();
		if(user.getPassword().equalsIgnoreCase(userDetails.getPassword())) {
			System.out.println("Success");
		}
	}
	
}
