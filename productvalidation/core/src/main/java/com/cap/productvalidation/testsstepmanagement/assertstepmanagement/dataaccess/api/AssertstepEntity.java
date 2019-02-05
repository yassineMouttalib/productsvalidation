package com.cap.productvalidation.testsstepmanagement.assertstepmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cap.productvalidation.testsstepmanagement.assertstepmanagement.common.api.Assertstep;
import com.cap.productvalidation.testsstepmanagement.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Assertstep")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssertstepEntity extends ApplicationPersistenceEntity implements Assertstep {

	private String type;

	private static final long serialVersionUID = 1L;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}