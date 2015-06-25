package org.bg.bpo.register.dbconnection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.bg.bpo.register.entities.schema_tmview.Mark;

public class DatabaseConnector {
	private static DatabaseConnector instance = null;
	
	private static final String PERSISTENCE_UNIT_NAME = "bpo.register.ws.provider";
	
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	private QueryMaker queryMaker;
	
	public static DatabaseConnector getInstance() {
		if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
	}
	
	private DatabaseConnector() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		queryMaker = new QueryMaker(entityManager);
	}
	
	public Mark getMarkByAppNum(String appNumber) {
		return queryMaker.makeAppNumQuery(appNumber);
	}
	
	public List<Mark> getMarksByOwnerName(String firstName, String middleName, String lastName) {
		return queryMaker.makeOwnerNameQuery(firstName, middleName, lastName);
	}
	
	public List<Mark> getMarksByAppName(String name) {
		return queryMaker.makeAppNameQuery(name);
	}
	
	public List<Mark> getMarksByRegNum(int number) {
		return queryMaker.makeAppRegNumQuery(number);
	}

}
