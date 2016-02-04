package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Voxel Based3 DPoint Cloud Resampler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VoxelBased3DPointCloudResamplerTest extends TestCase {

	/**
	 * The fixture for this Voxel Based3 DPoint Cloud Resampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoxelBased3DPointCloudResampler fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VoxelBased3DPointCloudResamplerTest.class);
	}

	/**
	 * Constructs a new Voxel Based3 DPoint Cloud Resampler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoxelBased3DPointCloudResamplerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Voxel Based3 DPoint Cloud Resampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VoxelBased3DPointCloudResampler fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Voxel Based3 DPoint Cloud Resampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoxelBased3DPointCloudResampler getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createVoxelBased3DPointCloudResampler());
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

} //VoxelBased3DPointCloudResamplerTest
