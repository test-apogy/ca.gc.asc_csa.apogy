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

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Digital Elevation Map Sampler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalElevationMapSamplerTest extends TestCase {

	/**
	 * The fixture for this Digital Elevation Map Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalElevationMapSampler fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DigitalElevationMapSamplerTest.class);
	}

	/**
	 * Constructs a new Digital Elevation Map Sampler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalElevationMapSamplerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Digital Elevation Map Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DigitalElevationMapSampler fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Digital Elevation Map Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalElevationMapSampler getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMapSampler());
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

	public void testProcess()
	{
		int xDimension = 20;
		int yDimension = 10;
		
		DigitalElevationMap input = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMap();		
		input.setXDimension(xDimension + 1);
		input.setYDimension(yDimension + 1);
							
		for(int i = 0; i <= xDimension; i++)
		{
			double x = i;
			for(int j = 0; j <= yDimension; j++)
			{
				double y = j;
				
				double z = 10 * Math.sin(y / 5);
				CartesianPositionCoordinates p = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, y, z);
				input.getPoints().add(p);
				
				// System.out.println(i + " " + j + " " + p);
			}
		}
		
		System.out.println("input.getPoints().size() : " + input.getPoints().size());
		
		getFixture().setTargetResolution(0.3);
		
		try
		{
			DigitalElevationMap output = getFixture().process(input);
			System.out.println("output.getPoints().size() : " + output.getPoints().size());
			
			// Saves the result.
			System.out.println("Saving results...");
			TransformNode root = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);			
			ContentNode<DigitalElevationMap> inputNode = ApogyCommonTopologyFacade.INSTANCE.createContentNode(input);
			inputNode.setDescription("Input");
			root.getChildren().add(inputNode);
		
			ContentNode<DigitalElevationMap> outputNode = ApogyCommonTopologyFacade.INSTANCE.createContentNode(output);
			outputNode.setDescription("Output");
			root.getChildren().add(outputNode);
			
			try
			{
				Resource resource = null;			
				ResourceSet resourceSet = new ResourceSetImpl();
				resource = resourceSet.createResource(URI.createFileURI(Activator.getDefault().getResultsPath() + File.separator + "DigitalElevationMapSamplerTest.topo"));			
				resource.getContents().add(root);
				resource.save(Collections.EMPTY_MAP);
				
				System.out.println("Saving results: Done.");
			}
			catch(Exception e)
			{				
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			fail();
		}						
	}
	
} //DigitalElevationMapSamplerTest
