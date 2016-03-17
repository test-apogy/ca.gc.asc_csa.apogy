/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.tests;

import ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Acquire Image Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcquireImageSatelliteCommandTest extends AbstractRequestBasedSatelliteCommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcquireImageSatelliteCommandTest.class);
	}

	/**
	 * Constructs a new Acquire Image Satellite Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquireImageSatelliteCommandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Acquire Image Satellite Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AcquireImageSatelliteCommand getFixture() {
		return (AcquireImageSatelliteCommand)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyExamplesSatelliteFactory.eINSTANCE.createAcquireImageSatelliteCommand());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AcquireImageSatelliteCommandTest
