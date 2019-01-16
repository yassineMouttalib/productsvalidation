package com.cap.productsvalidation.productvalidationmanagement.logic.api.to;

import java.util.List;

import com.cap.productsvalidation.general.common.api.to.AbstractCto;
import com.cap.productsvalidation.testscasesmanagement.logic.api.to.TestscasesEto;

/**
 * Composite transport object of ProductValidation
 */
public class ProductValidationCto extends AbstractCto {

	private static final long serialVersionUID = 1L;

	private ProductValidationEto productValidation;

	private List<TestscasesEto> testscases;

	public ProductValidationEto getProductValidation() {
		return productValidation;
	}

	public void setProductValidation(ProductValidationEto productValidation) {
		this.productValidation = productValidation;
	}

	public List<TestscasesEto> getTestscases() {
		return testscases;
	}

	public void setTestscases(List<TestscasesEto> testscases) {
		this.testscases = testscases;
	}

}
