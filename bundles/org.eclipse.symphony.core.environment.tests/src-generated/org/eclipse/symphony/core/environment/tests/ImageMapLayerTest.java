/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.symphony.common.images.Symphony__CommonImagesFactory;
import org.eclipse.symphony.common.images.URLEImage;
import org.eclipse.symphony.core.environment.ImageMapLayer;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#getResolution() <em>Resolution</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor) <em>Update Image</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#getImageMapLayerRegion() <em>Get Image Map Layer Region</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}</li>
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createImageMapLayer());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#getResolution() <em>Resolution</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ImageMapLayer#getResolution()
	 * @generated_NOT
	 */
	public void testGetResolution() 
	{
		  getFixture().setWidth(400);
		  getFixture().setHeight(200);
		  
		  URLEImage eImage = Symphony__CommonImagesFactory.eINSTANCE.createURLEImage();
		  eImage.setUrl("platform:/plugin/ca.gc.asc_csa.symphony.environment.tests/data/imageA.gif");
		  getFixture().setImage(eImage);
		  
		  assertEquals(2.0, getFixture().getResolution(), 1E-6);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor) <em>Update Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ImageMapLayer#updateImage(org.eclipse.core.runtime.IProgressMonitor)
	 * @generated_NOT
	 */
	public void testUpdateImage__IProgressMonitor() 
	{
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#getImageMapLayerRegion() <em>Get Image Map Layer Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ImageMapLayer#getImageMapLayerRegion()
	 * @generated_NOT
	 */
	public void testGetImageMapLayerRegion() 
	{
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegionImage#getRegionImage()
	 * @generated_NOT
	 */
	public void testGetRegionImage() 
	{
		  getFixture().setWidth(400);
		  getFixture().setHeight(200);
		  
		  URLEImage eImage = Symphony__CommonImagesFactory.eINSTANCE.createURLEImage();
		  eImage.setUrl("platform:/plugin/ca.gc.asc_csa.symphony.environment.tests/data/imageA.gif");
		  getFixture().setImage(eImage);
		  
		  assertNotNull(getFixture().getRegionImage());	  
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegionProvider#getRegion()
	 * @generated_NOT
	 */
	public void testGetRegion() 
	{
		  getFixture().setWidth(400.0);
		  getFixture().setHeight(200.0);
		  
		  URLEImage eImage = Symphony__CommonImagesFactory.eINSTANCE.createURLEImage();
		  eImage.setUrl("platform:/plugin/ca.gc.asc_csa.symphony.environment.tests/data/imageA.gif");
		  getFixture().setImage(eImage);
		  
		  assertNotNull(getFixture().getRegion());
		  assertEquals(0.0, getFixture().getRegion().getXMin());	  
		  assertEquals(400.0, getFixture().getRegion().getXMax());
		  assertEquals(0.0, getFixture().getRegion().getYMin());	  
		  assertEquals(200.0, getFixture().getRegion().getYMax());
		  assertEquals(400.0, getFixture().getRegion().getXDimension());
		  assertEquals(200.0, getFixture().getRegion().getYDimension());
	}

} //ImageMapLayerTest
