//package com.incture.MasterBUPA.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import com.zaxxer.hikari.HikariDataSource;
//
//@Configuration
//@Profile("cloud")
//public class CloudDatabaseConfig {
//	
//	@Bean
//	public DataSource dataSource(@Value("${vcap.services.CF_DEMO.credentials.url}")final String url, @Value("${vcap.services.CF_DEMO.credentials.user}")final String user, @Value("${vcap.services.CF_DEMO.credentials.password}")final String password) {
//	
//		return DataSourceBuilder.create()
//				.type(HikariDataSource.class)
//				.driverClassName(com.sap.db.jdbc.Driver.class.getName())
//				.url(url)
//				.username(user)
//				.password(password)
//				.build();	
//		
//	}
//
//}
package com.incture.MasterBUPA.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@Profile("cloud")
public class CloudDatabaseConfig {
	
	@Bean
	public DataSource dataSource(@Value("${vcap.services.CF_DEMO.credentials.url}")final String url, @Value("${vcap.services.CF_DEMO.credentials.user}")final String user, @Value("${vcap.services.CF_DEMO.credentials.password}")final String password) {
	
		return DataSourceBuilder.create()
				.type(HikariDataSource.class)
				.driverClassName(com.sap.db.jdbc.Driver.class.getName())
				.url(url)
				.username(user)
				.password(password)
				.build();	
		
	}

}

