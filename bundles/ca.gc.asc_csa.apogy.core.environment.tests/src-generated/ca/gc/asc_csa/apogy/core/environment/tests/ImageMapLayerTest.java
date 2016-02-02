package ca.gc.asc_csa.apogy.core.environment.tests;
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

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.URLEImage;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getResolution() <em>Resolution</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor) <em>Update Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getImageMapLayerRegion() <em>Get Image Map Layer Region</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ImageMapLayerTest extends AbstractMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageMapLayerTest.class);
	}

	/**
	 * Constructs a new Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImageMapLayer getFixture() {
		return (ImageMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createImageMapLayer());
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

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getResolution() <em>Resolution</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getResolution()
	 * @generated_NOT
	 */
	public void testGetResolution() 
	{
		  getFixture().setWidth(400);
		  getFixture().setHeight(200);
		  
		  URLEImage eImage = ApogyCommonImagesFactory.eINSTANCE.createURLEImage();
		  eImage.setUrl("platform:/plugin/" + Activator.PLUGIN_ID +"/data/imageA.gif");
		  getFixture().setImage(eImage);
		  
		  assertEquals(2.0, getFixture().getResolution(), 1E-6);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor) <em>Update Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor)
	 * @generated_NOT
	 */
	public void testUpdateImage__IProgressMonitor() 
	{
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getImageMapLayerRegion() <em>Get Image Map Layer Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer#getImageMapLayerRegion()
	 * @generated_NOT
	 */
	public void testGetImageMapLayerRegion() 
	{
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getRegionImage()
	 * @generated_NOT
	 */
	public void testGetRegionImage() 
	{
		  getFixture().setWidth(400);
		  getFixture().setHeight(200);
		  
		  URLEImage eImage = ApogyCommonImagesFactory.eINSTANCE.createURLEImage();
		  eImage.setUrl("platform:/plugin/" + Activator.PLUGIN_ID + "/data/imageA.gif");
		  getFixture().setImage(eImage);
		  
		  assertNotNull(getFixture().getRegionImage());	  
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion()
	 * @generated_NOT
	 */
	public void testGetRegion() 
	{
		  getFixture().setWidth(400.0);
		  getFixture().setHeight(200.0);
		  
		  URLEImage eImage = ApogyCommonImagesFactory.eINSTANCE.createURLEImage();
		  eImage.setUrl("platform:/plugin/" + Activator.PLUGIN_ID + "/data/imageA.gif");
		  getFixture().setImage(eImage);
		  		  
		  RectangularRegion rectangularRegion = getFixture().getRegion();
		  assertNotNull(rectangularRegion);
		  assertEquals(0.0, rectangularRegion.getXMin());	  
		  assertEquals(400.0, rectangularRegion.getXMax());
		  assertEquals(0.0, rectangularRegion.getYMin());	  
		  assertEquals(200.0, rectangularRegion.getYMax());
		  assertEquals(400.0, rectangularRegion.getXDimension());
		  assertEquals(200.0, rectangularRegion.getYDimension());
	}

	/**
	 * Save an image to file.
	 * @param image The image.
	 * @param fileName The file name.
	 * @throws Exception If an exception occurs during save.
	 */
	protected void saveImage(AbstractEImage image, String fileName) throws Exception
	{
		String path = Activator.getDefault().getTempDir() + File.separator + fileName;
				
		EImagesUtilities.INSTANCE.saveImageAsPNG(path, image);
	}
} //ImageMapLayerTest
