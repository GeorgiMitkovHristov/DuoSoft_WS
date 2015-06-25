package org.bg.bpo.register.dbconnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.bg.bpo.register.entities.schema_public.Agent;
import org.bg.bpo.register.entities.schema_public.Owner;
import org.bg.bpo.register.entities.schema_tmview.Mark;

public class TestConnection {
	private static final String TMVIEW_SCHEMA_PU = "bpo.register.ws.provider";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
//		factory = Persistence.createEntityManagerFactory(TMVIEW_SCHEMA_PU);
//		EntityManager em = factory.createEntityManager();
//		
//		Query mQuery = em.createQuery("SELECT m FROM Mark m").setMaxResults(1);
//		List<Mark> marks = mQuery.getResultList();
//		System.out.println("Marks count: " + marks.get(0).getIdappli());
//		
//		mQuery = em.createQuery("SELECT m FROM Agent m").setMaxResults(1);
//		List<Agent> agents = mQuery.getResultList();
//		System.out.println("Agents count: " + agents.size());
//		System.out.println("Agent id: " + agents.get(0).getIdagent());
//		System.out.println("Agent tel: " + agents.get(0).getTelagent());
//
//		mQuery = em.createQuery("SELECT m FROM Owner m").setMaxResults(1);
//		List<Owner> owners = mQuery.getResultList();
//		System.out.println("Owners count: " + owners.size());
//		System.out.println("Owner id: " + owners.get(0).getIdowner());
//		System.out.println("Owner tel: " + owners.get(0).getTelowner());

		DatabaseConnector dbConn = DatabaseConnector.getInstance();
		Mark m = dbConn.getMarkByAppNum("1952120001N");
		System.out.println(m.getDeno());
		
		Vector<Mark> list = (Vector<Mark>) dbConn.getMarksByAppName("NIMONIC");
		System.out.println(list);
	}
}
