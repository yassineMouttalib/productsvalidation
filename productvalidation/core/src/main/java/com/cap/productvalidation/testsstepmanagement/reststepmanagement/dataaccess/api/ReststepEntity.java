package com.cap.productvalidation.testsstepmanagement.reststepmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cap.productvalidation.testsstepmanagement.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.productvalidation.testsstepmanagement.reststepmanagement.common.api.Reststep;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Reststep")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReststepEntity extends ApplicationPersistenceEntity implements Reststep {

	private String url;

	private static final long serialVersionUID = 1L;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
