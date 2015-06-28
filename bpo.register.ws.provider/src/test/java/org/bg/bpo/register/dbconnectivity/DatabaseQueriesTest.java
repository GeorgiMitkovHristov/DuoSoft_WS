package org.bg.bpo.register.dbconnectivity;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.bg.bpo.register.db.connectivity.DatabaseConnector;
import org.bg.bpo.register.db.entities.schema.tmview.Mark;
import org.bg.bpo.register.exception.ResultSetTooBigException;
import org.junit.Before;
import org.junit.Test;

public class DatabaseQueriesTest {
	private DatabaseConnector dbConn;
	
	@Before
	public void setUp() {
		dbConn = DatabaseConnector.getInstance();
	}
	
	@Test
	public void getMarkByAppNum() {
		Mark mark = dbConn.getMarkByAppNum("1952120001N");
		
		assertEquals("Unexpected mark idappli attribute found !", "1952120001N", mark.getIdappli());
		assertEquals("Unexpected mark idmark attribute found !", "00000556", mark.getIdmark());
		assertEquals("Unexpected mark deno attribute found !", "NIMONIC", mark.getDeno());
	}

	@Test
	public void getMarksByAppName() throws ResultSetTooBigException {
		List<Mark> marks = dbConn.getMarksByAppName("NIMONIC");
		
		assertEquals("Unexpected size of found marks !", 1, marks.size());
		assertEquals("Unexpected mark idappli attribute found !", "1952120001N", marks.get(0).getIdappli());
		assertEquals("Unexpected mark idmark attribute found !", "00000556", marks.get(0).getIdmark());
		assertEquals("Unexpected mark deno attribute found !", "NIMONIC", marks.get(0).getDeno());
	}

	@Test
	public void getMarksByOwnerName() throws ResultSetTooBigException {
		List<Mark> marks = dbConn.getMarksByOwnerName("Ivan", "Ivanov", "Ivanov");
		
		assertEquals("Unexpected size of found marks !", 1, marks.size());
		assertEquals("Unexpected mark idappli attribute found !", "2002061560N", marks.get(0).getIdappli());
		assertEquals("Unexpected mark idmark attribute found !", "", marks.get(0).getIdmark());
		assertEquals("Unexpected mark deno attribute found !", "Сувенирный Белый Айст", marks.get(0).getDeno());
	}

	@Test
	public void getMarksByRegNum() throws ResultSetTooBigException {
		List<Mark> marks = dbConn.getMarksByRegNum(556);
		
		assertEquals("Unexpected size of found marks !", 2, marks.size());
		assertEquals("Unexpected mark idappli attribute found !", "1952120001N", marks.get(0).getIdappli());
		assertEquals("Unexpected mark idmark attribute found !", "00000556", marks.get(0).getIdmark());
		assertEquals("Unexpected mark deno attribute found !", "NIMONIC", marks.get(0).getDeno());
		assertEquals("Unexpected mark idappli attribute found !", "1989008065N", marks.get(1).getIdappli());
		assertEquals("Unexpected mark idmark attribute found !", "00000556", marks.get(1).getIdmark());
		assertEquals("Unexpected mark deno attribute found !", "BC BULCON", marks.get(1).getDeno());
	}
}
