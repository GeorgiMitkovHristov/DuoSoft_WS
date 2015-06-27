package org.bg.bpo.register.db.connectivity;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.bg.bpo.register.db.entities.schema.tmview.Mark;
import org.bg.bpo.register.exception.ResultSetTooBigException;

public class DatabaseConnector {
	private static DatabaseConnector instance = null;
	private static final String PERSISTENCE_UNIT_NAME = "bpo.register.ws.provider";
	private static final String MAX_QUERY_RESULT_SIZE = "maxQueryResultSize";
	
	public static DatabaseConnector getInstance() {
		if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
	}
	
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	private DatabaseQueries queryMaker;
	
	private DatabaseConnector() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		Map<String, Object> customProperties = factory.getProperties();
		
		if(customProperties.containsKey(MAX_QUERY_RESULT_SIZE)) {
			queryMaker = new DatabaseQueries(entityManager, Integer.valueOf((String)customProperties.get(MAX_QUERY_RESULT_SIZE)));
		} else {
			queryMaker = new DatabaseQueries(entityManager, 100);
		}
	}
	
	public Mark getMarkByAppNum(String appNumber) {
		return queryMaker.makeMarkNumberQuery(appNumber);
	}
	
	public List<Mark> getMarksByOwnerName(String firstName, String middleName, String lastName) throws ResultSetTooBigException {
		return queryMaker.makeMarkOwnerNameQuery(firstName, middleName, lastName);
	}
	
	public List<Mark> getMarksByAppName(String name) throws ResultSetTooBigException {
		return queryMaker.makeMarkNameQuery(name);
	}
	
	public List<Mark> getMarksByRegNum(int number) throws ResultSetTooBigException {
		return queryMaker.makeMarkRegistrationNumberQuery(number);
	}

	public String getMarkCurrentStatusCodeForMark(Integer lgstmark) {
		return queryMaker.makeMarkCurrentStatusCodeQuery(lgstmark);
	}
	
	public String getImageCategory(String idappli) {
		return queryMaker.makeMarkImageCategoryQuery(idappli);
	}
	
	public void setPersistenceUnitName(final String persistenceUnitName) {
		factory = Persistence.createEntityManagerFactory(persistenceUnitName);
	}
}
