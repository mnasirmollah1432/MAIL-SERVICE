package com.openspace24.config;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPDataSource {

	private static BasicDataSource ds = new BasicDataSource();

	static {

		String url = "jdbc:elasticsearch://https://search-eduman6-es-ekmj5u3tgt7nn4zdfi7twocilm.ap-northeast-1.es.amazonaws.com";

		ds.setUrl(url);

//        ds.setUsername("user");
//        ds.setPassword("password");
		ds.setMinIdle(5);
		ds.setMaxIdle(10);
		ds.setMaxOpenPreparedStatements(100);
	}

	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

	private DBCPDataSource() {
	}
}