package com.cap.productvalidation.testsstepmanagement.reststepmanagement.logic.api.to;

import com.cap.productvalidation.testsstepmanagement.reststepmanagement.common.api.Reststep;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Reststep
 */
public class ReststepEto extends AbstractEto implements Reststep {

	private static final long serialVersionUID = 1L;

	private String url;

	@Override
	public String getUrl() {
		return url;
	}

	@Override
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.url == null) ? 0 : this.url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// class check will be done by super type EntityTo!
		if (!super.equals(obj)) {
			return false;
		}
		ReststepEto other = (ReststepEto) obj;
		if (this.url == null) {
			if (other.url != null) {
				return false;
			}
		} else if (!this.url.equals(other.url)) {
			return false;
		}
		return true;
	}
}
