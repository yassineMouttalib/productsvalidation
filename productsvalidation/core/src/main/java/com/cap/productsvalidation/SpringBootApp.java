package com.cap.productsvalidation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.EndpointAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import com.cap.productsvalidation.productvalidationmanagement.dataaccess.api.ProductValidationEntity;
import com.cap.productsvalidation.testsstepmanagement.assertstepmanagement.dataaccess.api.AssertstepEntity;

import io.oasp.module.jpa.dataaccess.api.AdvancedRevisionEntity;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, SecurityFilterAutoConfiguration.class })
@SpringBootApplication(exclude = { EndpointAutoConfiguration.class })
@EntityScan(basePackages = { "com.cap.productsvalidation" }, basePackageClasses = { AdvancedRevisionEntity.class })
@EnableGlobalMethodSecurity(jsr250Enabled = true)
public class SpringBootApp implements CommandLineRunner {
	
	 @Autowired
	    JdbcTemplate jdbcTemplate;
  /**
   * Entry point for spring-boot based app
   *
   * @param args - arguments
   */
  public static void main(String[] args) {

    SpringApplication.run(SpringBootApp.class, args);
  AssertstepEntity a =  new AssertstepEntity();
  a.setName("Assertstep1");
    System.out.println(a.getName());
    
   
  }
  
  public void run(String... strings) throws Exception {

	  jdbcTemplate.update("insert into Assertstep(id, modificationCounter, name, type) values (1, 1, 'Assertstep1', 'type1');");
  }
}
