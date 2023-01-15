package org.SebaouneEtSaraoui.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("calculator")
public class CalculRS {
	@GET
	@Path("multiplie/{x}/{y}")
	public int add(@QueryParam("x") int a ,@QueryParam("y") int b  )
	{
		return a*b;  
	}
	@GET
	@Path("add/{a}/{b}")
	public int addWhithQuery (@QueryParam("a") int a ,@QueryParam("b") int b  )
	{
		return a+b;
	}


}
