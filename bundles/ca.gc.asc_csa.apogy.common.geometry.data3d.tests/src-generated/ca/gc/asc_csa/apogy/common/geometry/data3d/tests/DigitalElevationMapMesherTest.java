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
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapMesher;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Digital Elevation Map Mesher</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DigitalElevationMapMesherTest extends TestCase {

	/**
	 * The fixture for this Digital Elevation Map Mesher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalElevationMapMesher fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DigitalElevationMapMesherTest.class);
	}

	/**
	 * Constructs a new Digital Elevation Map Mesher test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalElevationMapMesherTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Digital Elevation Map Mesher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DigitalElevationMapMesher fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Digital Elevation Map Mesher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalElevationMapMesher getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMapMesher());
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
		int xDimension = 60;
		int yDimension = 30;
		
		DigitalElevationMap input = ApogyCommonGeometryData3DFactory.eINSTANCE.createDigitalElevationMap();		
		input.setXDimension(xDimension);
		input.setYDimension(yDimension);
					
		for(int i = 0; i < xDimension; i++)
		{
			double x = i;
			for(int j = 0; j < yDimension; j++)
			{
				double y = j;
				double z = 10 * Math.sin(y / 5);
				CartesianPositionCoordinates p = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, y, z);
				input.getPoints().add(p);							
			}
		}
		
		System.out.println("input.getPoints().size() : " + input.getPoints().size());
		
		try 
		{						
			Date start = new Date();
			CartesianTriangularMesh output = getFixture().process(input);
			Date end = new Date();
			
			System.out.println("Meshing ran in : " + (end.getTime() - start.getTime()) + " ms");
			 
			// Saves the result.
			System.out.println("Saving results...");
			TransformNode root = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);			
			ContentNode<CartesianTriangularMesh> meshNode = ApogyCommonTopologyFacade.INSTANCE.createContentNode(output);
			root.getChildren().add(meshNode);
			
			Resource resource = null;
			try
			{
				ResourceSet resourceSet = new ResourceSetImpl();
				resource = resourceSet.createResource(URI.createFileURI(Activator.getDefault().getResultsPath() + File.separator + "DigitalElevationMapMesherTest.topo"));			
				resource.getContents().add(root);
				resource.save(Collections.EMPTY_MAP);
				
				System.out.println("Saving results: Done.");
			} 
			catch (Exception e)
			{
				e.printStackTrace();				
			}
			
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
	}

} //DigitalElevationMapMesherTest
