/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import ca.gc.asc_csa.apogy.core.environment.ImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getImageMapLayer() <em>Get Image Map Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getRegionImage() <em>Get Region Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getResolution() <em>Get Resolution</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}</li>
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createImageMapLayerPresentation());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getImageMapLayer() <em>Get Image Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation#getImageMapLayer()
	 * @generated_NOT
	 */
	public void testGetImageMapLayer() 
	{
		ImageMapLayer layer = ApogyCoreEnvironmentFactory.eINSTANCE.createImageMapLayer();
		getFixture().setMapLayer(layer);
		
		assertNotNull(getFixture().getImageMapLayer());		
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
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getResolution() <em>Get Resolution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage#getResolution()
	 * @generated_NOT
	 */
	public void testGetResolution() 
	{	
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
	}

} //ImageMapLayerPresentationTest
