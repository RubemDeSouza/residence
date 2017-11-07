package br.com.automac.residence.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import br.com.automac.residence.EntityManager.JpaEntityManager;
import br.com.automac.residence.model.ClienteModel;

@Path("/service")
public class ClienteService {

	private JpaEntityManager JPAEM = new JpaEntityManager();
	private EntityManager objEM = JPAEM.getEntityManager();
	

	@GET
	@Path("/listar")
	//@Produces("application/json")
	
	/*
	public List<ClienteModel> listar() {
		
	

		try {
			String query = "select c from ClienteModel c";

			List<ClienteModel> clientes = objEM.createNativeQuery(query, ClienteModel.class).getResultList();
			objEM.close();

			return clientes;

		} catch (Exception e) {
			throw new WebApplicationException(500);
		}

	}
*/
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	  }
	
	
}
