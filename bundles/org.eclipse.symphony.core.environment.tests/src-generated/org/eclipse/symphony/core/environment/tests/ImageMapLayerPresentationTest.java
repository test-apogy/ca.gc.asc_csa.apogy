/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.symphony.core.environment.ImageMapLayer;
import org.eclipse.symphony.core.environment.ImageMapLayerPresentation;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayerPresentation#getImageMapLayer() <em>Get Image Map Layer</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegionImage#getResolution() <em>Get Resolution</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ImageMapLayerPresentationTest extends MapLayerPresentationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageMapLayerPresentationTest.class);
	}

	/**
	 * Constructs a new Image Map Layer Presentation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapLayerPresentationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Image Map Layer Presentation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImageMapLayerPresentation getFixture() {
		return (ImageMapLayerPresentation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createImageMapLayerPresentation());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.ImageMapLayerPresentation#getImageMapLayer() <em>Get Image Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ImageMapLayerPresentation#getImageMapLayer()
	 * @generated_NOT
	 */
	public void testGetImageMapLayer() 
	{
		ImageMapLayer layer = Symphony__CoreEnvironmentFactory.eINSTANCE.createImageMapLayer();
		getFixture().setMapLayer(layer);
		
		assertNotNull(getFixture().getImageMapLayer());		
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
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegionImage#getResolution() <em>Get Resolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegionImage#getResolution()
	 * @generated_NOT
	 */
	public void testGetResolution() 
	{	
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
	}

} //ImageMapLayerPresentationTest
