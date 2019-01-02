package com.cap.productsvalidation.testscasesmanagement.logic.api.to;

import com.cap.productsvalidation.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Testscases
 */
public class TestscasesCto extends AbstractCto {

	private static final long serialVersionUID = 1L;

	private TestscasesEto testscases;

	public TestscasesEto getTestscases() {
		return testscases;
	}

	public void setTestscases(TestscasesEto testscases) {
		this.testscases = testscases;
	}

}
