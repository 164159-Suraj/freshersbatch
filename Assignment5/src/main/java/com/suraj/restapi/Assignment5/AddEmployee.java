package com.suraj.restapi.Assignment5;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("add")
public class AddEmployee {

	DatabaseClass obj=new DatabaseClass();
	Map<Integer,Employeeinfo> index=obj.getEmployess();
	
	
	@Path("{id}/{name}/{dept}/{desg}/{sal}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String addEmployee( @PathParam ("id")Integer id,@PathParam ("name")String name,@PathParam ("dept")String dept,@PathParam ("desg")String desg,@PathParam ("sal")double sal){
		index.put(id, new Employeeinfo(name, dept, desg, sal));
		return index.toString()+"Employee Added";
	}
}
