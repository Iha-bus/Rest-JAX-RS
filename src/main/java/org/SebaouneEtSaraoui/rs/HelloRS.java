package org.SebaouneEtSaraoui.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloRS {
	@GET
	public String Hello() {
		return "Hello T3";
	}
	@GET
	@Path("{name}")
	public String HelloName(@PathParam("name") String nom) {
		return "Hello T3"+ " " + nom;
	}
	
	
}



