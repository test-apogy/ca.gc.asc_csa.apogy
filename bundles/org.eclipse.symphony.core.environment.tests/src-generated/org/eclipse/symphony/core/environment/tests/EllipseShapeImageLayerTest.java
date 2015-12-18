/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.symphony.core.environment.EllipseShapeImageLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ellipse Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EllipseShapeImageLayerTest extends AbstractShapeImageLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EllipseShapeImageLayerTest.class);
	}

	/**
	 * Constructs a new Ellipse Shape Image Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseShapeImageLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ellipse Shape Image Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EllipseShapeImageLayer getFixture() {
		return (EllipseShapeImageLayer)fixture;
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createEllipseShapeImageLayer());
			
		getFixture().setRequiredResolution(0.1);
		getFixture().setEllipseHeight(10.0);
		getFixture().setEllipseWidth(20.0);				
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

	@Override
	public void testUpdateImage__IProgressMonitor() 
	{
		try
		{
			getFixture().updateImage(new NullProgressMonitor());
			
			assertNotNull(getFixture().getImage());			
			
			// Width is 20 m, resolution is 0.1 m/pixel
			assertEquals(200, getFixture().getImage().getWidth());
			
			// Height is 10 m, resolution is 0.1 m/pixel
			assertEquals(100, getFixture().getImage().getHeight());
			
			saveImage(getFixture().getImage(), "EllipseShapeImageLayerTest");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}
	
	@Override
	public void testGetResolution() 
	{
		// Updates the image.
		getFixture().updateImage(new NullProgressMonitor());
			
		// Should be equal to the required resolution
		assertEquals(getFixture().getRequiredResolution(), getFixture().getResolution(), 1E-6);
	}
	
	@Override
	public void testGetRegion() 
	{
		RectangularRegion rectangularRegion = getFixture().getImageMapLayerRegion();
		
		assertNotNull(rectangularRegion);
		assertEquals(20.0, rectangularRegion.getXDimension());
		assertEquals(10.0, rectangularRegion.getYDimension());
	}
	
} //EllipseShapeImageLayerTest
