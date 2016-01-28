/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.symphony.core.environment.RectangleShapeImageLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rectangle Shape Image Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RectangleShapeImageLayerTest extends AbstractShapeImageLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RectangleShapeImageLayerTest.class);
	}

	/**
	 * Constructs a new Rectangle Shape Image Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleShapeImageLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rectangle Shape Image Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RectangleShapeImageLayer getFixture() {
		return (RectangleShapeImageLayer)fixture;
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createRectangleShapeImageLayer());
				
		getFixture().setRectangleWidth(20.0);
		getFixture().setRectangleHeight(10.0);
		
		getFixture().setRequiredResolution(0.5);		
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
			assertEquals(40, getFixture().getImage().getWidth());
			assertEquals(20, getFixture().getImage().getHeight());
			
			saveImage(getFixture().getImage(), "RectangleShapeImageLayerTest");
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
		assertEquals(20.0, rectangularRegion.getXDimension());
		assertEquals(10.0, rectangularRegion.getYDimension());
	}
} //RectangleShapeImageLayerTest
