package org.SebaouneEtSaraoui.rs;

import java.io.ObjectInputFilter.Status;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.SebaouneEtSaraoui.Ejb.CommuneEjb;
import org.SebaouneEtSaraoui.models.Commune;

@Path("commune")
public class CommuneRS {
	@EJB
	CommuneEjb communeejb;

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findById(@PathParam("id") long id) {
		Commune paris = communeejb.findById(id);
		if(paris != null) {
		return Response.ok(paris).build();
		}else {
			return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND.getStatusCode(),"la commune +"+ id +"introuvable" ).build();
		}
	}
	
	  @POST
	  @Path("create") 
	  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	  public Response createCommune(
			  @FormParam("cp") long cp,@FormParam("name") String name) {
	  Commune com = new Commune(name, cp); 
	  communeejb.createCommune(com);
	  
	  	return Response.ok(com).build(); 
	  	
	  }
	  
	  @PUT
	  @Path("{id}")
	  @Consumes(MediaType.APPLICATION_JSON)
	  public Response update(@PathParam("id") long id, Commune com) {
		  Commune c = communeejb.findById(id);
		  c.setName(com.getName());
		  //c.setId(com.getId());
	      communeejb.updateCommune(c);
	      return Response.status(Response.Status.OK).build();
	  }
	  @DELETE
		@Path("{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public Response deleteById(@PathParam("id") long id) {
		  Commune c = communeejb.findById(id);
		  if (c != null) {
			Commune paris = communeejb.deleteById(id);
			return Response.ok(paris).build();
			}else {
				return Response.status(javax.ws.rs.core.Response.Status.NOT_FOUND.getStatusCode(),"la commune :"+ id +" introuvable" ).build();
			}
		}
	  
	  @GET
	  @Path("{all}")
	  @Consumes(MediaType.APPLICATION_JSON)
	  public Response upate(@PathParam("id") long id, Commune com) {
		  Commune c = communeejb.findById(id);
		  c.setName(com.getName());
	      communeejb.updateCommune(c);
	      return Response.status(Response.Status.OK).build();
	  }
	  @GET
	  @Path("all")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response findAll() {
	      List<Commune> users = communeejb.findAll();
	      if(users != null) {
	          return Response.ok(users).build();
	      } else {
	          return Response.status(Response.Status.NOT_FOUND).build();
	      }
	  }

}
