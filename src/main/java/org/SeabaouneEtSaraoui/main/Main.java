package org.SeabaouneEtSaraoui.main;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.SebaouneEtSaraoui.models.Commune;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client =ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Tp_Java_Web_Service_2023/rest");
		WebTarget communeUpdate = target.path("commune/7500");
		Invocation.Builder builder = communeUpdate.request(MediaType.APPLICATION_JSON);
		Commune paris = new Commune("paris",7500);
		Entity<Commune> entity = Entity.entity(paris , MediaType.APPLICATION_JSON);
		builder.put(entity);
		
	}

}
