package org.bg.bpo.register.dbconnection;

import org.bg.bpo.register.entities.schema_tmview.Mark;

public class TestConnection {
	public static void main(String[] args) {
		DatabaseConnector dbConn = DatabaseConnector.getInstance();
		Mark m = dbConn.getAppNum("1952120001N");
		System.out.println(m.getIdmark());
	}
}