package org.bg.bpo.register.dbconnection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.bg.bpo.register.entities.schema_tmview.Mark;


public class TestConnection {
	private static final String PERSISTENCE_UNIT_NAME = "bpo.register.ws.provider";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		final Map<String, String> props = new HashMap<String, String>();
		props.put("javax.persistence.jdbc.url", "jdbc:postgresql://192.168.0.37:5432/tmview");
		props.put("javax.persistence.jdbc.user", "postgres");
		props.put("javax.persistence.jdbc.password", "p0stGr#s");
		props.put("javax.persistence.jdbc.driver", "org.postgresql.Driver");
		props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, props);
		EntityManager em = factory.createEntityManager();
		
//		Mark mark = em.find(Mark.class,);
//		if (mark != null){
//			System.out.println(mark.getIdmark());
//		}
		
		// read the existing entries and write to console
//		Query agentsQuery = em.createQuery("SELECT a FROM Agent a");
//		List<Agent> agents = agentsQuery.getResultList();
//		
//		Query ownersQuery = em.createQuery("SELECT o FROM Owner o");
//		List<Owner> owners = ownersQuery.getResultList();
		
//		1952120001N
		Query mQuery = em.createQuery("SELECT m FROM Mark m").setMaxResults(1);
		List<Mark> marks = mQuery.getResultList();
		
		
		
//		System.out.println("Agents count: " + agents.size());
//		System.out.println("Owners count: " + owners.size());
		System.out.println("Marks count: " + marks.get(0).getIdappli());
		
	}
}