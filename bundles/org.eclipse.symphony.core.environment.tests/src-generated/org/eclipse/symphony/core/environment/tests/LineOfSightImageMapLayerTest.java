/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.core.environment.LineOfSightImageMapLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Line Of Sight Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LineOfSightImageMapLayerTest extends CartesianTriangularMeshDerivedImageMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LineOfSightImageMapLayerTest.class);
	}

	/**
	 * Constructs a new Line Of Sight Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineOfSightImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Line Of Sight Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LineOfSightImageMapLayer getFixture() {
		return (LineOfSightImageMapLayer)fixture;
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createLineOfSightImageMapLayer());
		getFixture().setCartesianTriangularMeshMapLayer(super.createCartesianTriangularMeshMapLayer());
		
		getFixture().setRequiredResolution(2.0);
		
		Matrix4d observerPose = new Matrix4d();
		observerPose.set(new Vector3d(30, 60, 5.0));
		getFixture().setObserverPose(Symphony__CommonMathFacade.INSTANCE.createMatrix4x4(observerPose));
		
		getFixture().setOpaque(true);
		getFixture().setTargetHeightAboveGround(1.8);
		getFixture().setUseHeightPerpendicularToGround(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated_NOT
	 */
	@Override
	protected void tearDown() throws Exception 
	{
		getFixture().setCartesianTriangularMeshMapLayer(null);
		setFixture(null);
	}
	
	@Override
	public void testUpdateImage__IProgressMonitor() 
	{
		try
		{
			getFixture().updateImage(new NullProgressMonitor());
			
			assertNotNull(getFixture().getImage());			
			
			// Width is 60 m, resolution is 2.0 m/pixel
			assertEquals(30, getFixture().getImage().getWidth());
			
			// Width is 120 m, resolution is 2.0 m/pixel
			assertEquals(60, getFixture().getImage().getHeight());
			
			saveImage(getFixture().getImage(), "LineOfSightImageMapLayerTest");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}
		
	@Override
	public void testGetRegion() 
	{
		RectangularRegion rectangularRegion = getFixture().getImageMapLayerRegion();
		
		assertNotNull(rectangularRegion);
		assertEquals(60.0, rectangularRegion.getXDimension());
		assertEquals(120.0, rectangularRegion.getYDimension());
	}
} //LineOfSightImageMapLayerTest
