package com.suraj.restapi.Assignment5;

import java.util.Map;




import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("remove")
public class DeleteEmployee {

	


		DatabaseClass obj=new DatabaseClass();
		Map<Integer,Employeeinfo> index=obj.getEmployess();
		
		
		@Path("{id}")
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String searchEmployee(@PathParam("id")Integer id){
			 index.remove(id); 
			 return index.toString();

			

	}
}
