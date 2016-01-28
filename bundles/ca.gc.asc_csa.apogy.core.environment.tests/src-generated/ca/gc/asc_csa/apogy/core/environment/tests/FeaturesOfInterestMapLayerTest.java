/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.core.FeatureOfInterest;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Features Of Interest Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}</li>
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createFeaturesOfInterestMapLayer());
		
		// Adds a few FOI.
		FeatureOfInterest foi1 = Symphony__CoreFactory.eINSTANCE.createFeatureOfInterest();		
		Matrix4d m1 = new Matrix4d();
		m1.set(new Vector3d(0, 0, 0));
		foi1.setPose(Symphony__CommonMathFacade.INSTANCE.createMatrix4x4(m1));
		getFixture().getFeatures().getFeaturesOfInterest().add(foi1);
		
		FeatureOfInterest foi2 = Symphony__CoreFactory.eINSTANCE.createFeatureOfInterest();		
		Matrix4d m2 = new Matrix4d();
		m2.set(new Vector3d(10, 20, -5));
		foi2.setPose(Symphony__CommonMathFacade.INSTANCE.createMatrix4x4(m2));
		getFixture().getFeatures().getFeaturesOfInterest().add(foi2);
		
		FeatureOfInterest foi3 = Symphony__CoreFactory.eINSTANCE.createFeatureOfInterest();		
		Matrix4d m3 = new Matrix4d();
		m3.set(new Vector3d(-5, -25, 10));
		foi3.setPose(Symphony__CommonMathFacade.INSTANCE.createMatrix4x4(m3));		
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegionProvider#getRegion() <em>Get Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegionProvider#getRegion()
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
