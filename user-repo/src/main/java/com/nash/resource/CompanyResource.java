package com.nash.resource;

import java.lang.reflect.InvocationTargetException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.nash.entity.Company;
import com.nash.service.CompanyServiceHandler;

@Path("/")
public class CompanyResource {
	
	@Autowired
	CompanyServiceHandler csh;

	@POST
	@Path("add/company")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean createCompany(Company company) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		csh.create(company);
		return true;
	}
	
	@GET
	@Path("search/companies/pincode/{pincode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompaniesByPincode(@PathParam("pincode") Long pincode){
		
		Company cp =csh.getCompanyByPincode(pincode);
		System.out.println(cp.toString());
		return cp;
	}
	
}
