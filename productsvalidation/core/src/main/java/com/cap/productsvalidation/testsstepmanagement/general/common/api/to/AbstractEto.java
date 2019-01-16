package com.cap.productsvalidation.testsstepmanagement.general.common.api.to;

import net.sf.mmm.util.transferobject.api.EntityTo;

/**
 * Abstract base class for an <em>{@link EntityTo entity transfer-object}</em>
 * in this application.
 */
public class AbstractEto extends EntityTo<Long> {

	private static final long serialVersionUID = 1L;
	private String name; 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * The constructor.
	 */
	public AbstractEto() {

		super();
	}

}
