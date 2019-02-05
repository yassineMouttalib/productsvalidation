package com.cap.productvalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.dataaccess.api.AssertstepEntity;
import com.devonfw.module.jpa.dataaccess.api.AdvancedRevisionEntity;
import com.devonfw.module.jpa.dataaccess.impl.data.GenericRepositoryFactoryBean;

/**
 * Main entry point of this {@link SpringBootApplication}. Simply run this class to start this app.
 */
@SpringBootApplication
@EntityScan(basePackages = { "com.cap.productvalidation" }, basePackageClasses = { AdvancedRevisionEntity.class })
@EnableJpaRepositories(repositoryFactoryBeanClass = GenericRepositoryFactoryBean.class)
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