package com.suraj.restapi.Assignment3;

import java.util.ArrayList;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("valid")
public class Servicenfo {

	DatabaseClass obj =new DatabaseClass();
	
	Map<Integer, UserInformation> information=obj.getInfo();

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String getallInfo(@FormParam("zip")Integer u){
		String x="Invalid Zip";
		for (Map.Entry<Integer, UserInformation> entry : information.entrySet()) {
			
		   if(u==entry.getKey()){
			   UserInformation user=entry.getValue();
			    x= user.toString();
		   }			  
}
		 return x;
}
}