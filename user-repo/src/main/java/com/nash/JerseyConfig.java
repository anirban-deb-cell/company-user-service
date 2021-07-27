package com.nash;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.nash.resource.CompanyResource;
import com.nash.resource.UserResource;

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig(){
		register(CompanyResource.class);
		register(UserResource.class);
	}
}
