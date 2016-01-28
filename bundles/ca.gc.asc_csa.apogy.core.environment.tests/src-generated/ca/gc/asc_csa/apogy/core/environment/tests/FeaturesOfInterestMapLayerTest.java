/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Features Of Interest Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FeaturesOfInterestMapLayerTest extends AbstractMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeaturesOfInterestMapLayerTest.class);
	}

	/**
	 * Constructs a new Features Of Interest Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Features Of Interest Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FeaturesOfInterestMapLayer getFixture() {
		return (FeaturesOfInterestMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated_NOT
	 */
	@Override
	protected void setUp() throws Exception 
	{
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createFeaturesOfInterestMapLayer());
		
		// Adds a few FOI.
		FeatureOfInterest foi1 = ApogyCoreFactory.eINSTANCE.createFeatureOfInterest();		
		Matrix4d m1 = new Matrix4d();
		m1.set(new Vector3d(0, 0, 0));
		foi1.setPose(ApogyCommonMathFacade.INSTANCE.createMatrix4x4(m1));
		getFixture().getFeatures().getFeaturesOfInterest().add(foi1);
		
		FeatureOfInterest foi2 = ApogyCoreFactory.eINSTANCE.createFeatureOfInterest();		
		Matrix4d m2 = new Matrix4d();
		m2.set(new Vector3d(10, 20, -5));
		foi2.setPose(ApogyCommonMathFacade.INSTANCE.createMatrix4x4(m2));
		getFixture().getFeatures().getFeaturesOfInterest().add(foi2);
		
		FeatureOfInterest foi3 = ApogyCoreFactory.eINSTANCE.createFeatureOfInterest();		
		Matrix4d m3 = new Matrix4d();
		m3.set(new Vector3d(-5, -25, 10));
		foi3.setPose(ApogyCommonMathFacade.INSTANCE.createMatrix4x4(m3));		
		getFixture().getFeatures().getFeaturesOfInterest().add(foi3);
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider#getRegion()
	 * @generated_NOT
	 */
	public void testGetRegion() 
	{
		RectangularRegion rectangularRegion = getFixture().getRegion();
		
		assertNotNull(rectangularRegion);
		assertEquals(-5.0, rectangularRegion.getXMin(), 1E-9);
		assertEquals(10.0, rectangularRegion.getXMax(), 1E-9);
		
		assertEquals(-25.0, rectangularRegion.getYMin(), 1E-9);
		assertEquals(20.0, rectangularRegion.getYMax(), 1E-9);		
	}

} //FeaturesOfInterestMapLayerTest
