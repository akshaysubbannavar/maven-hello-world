package com.as.mavenhelloworld;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.lang3.RandomStringUtils;

public class MavenHello {

	public static void main(String[] args) throws SQLException {
		
		System.out.println(RandomStringUtils.randomNumeric(6));
		System.out.println(RandomStringUtils.randomNumeric(6));
		System.out.println(RandomStringUtils.randomNumeric(6));
		
		DriverManager.getConnection("jdbc:postgresql://localhost:5432/Product", "postgres", "postgres" );
		System.out.println("Hello World");
	}

}
