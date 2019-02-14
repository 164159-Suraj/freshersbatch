package com.suraj.restapi.Assignment2;

import java.util.ArrayList;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("valid")
public class AccessLayer {

	DatabaseClass obj=new DatabaseClass();
	
	ArrayList<UserPojo> users=obj.getUser();
	

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String isValid(@FormParam("uname") String name,@FormParam("password") String pass){
		String exit="InValid user";
		for(UserPojo index:users){
			if(name.equals(index.getUname())&& pass.equals(index.getPass())){
				exit ="valid user";
			}
		
		}
		return exit;
	}
	
	
}
