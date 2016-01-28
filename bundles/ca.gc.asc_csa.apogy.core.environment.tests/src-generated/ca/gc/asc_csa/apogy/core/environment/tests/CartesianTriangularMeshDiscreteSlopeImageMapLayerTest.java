/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import junit.textui.TestRunner;

import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.SlopeRange;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Discrete Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshDiscreteSlopeImageMapLayerTest extends CartesianTriangularMeshSlopeImageMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshDiscreteSlopeImageMapLayerTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh Discrete Slope Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshDiscreteSlopeImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Discrete Slope Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangularMeshDiscreteSlopeImageMapLayer getFixture() {
		return (CartesianTriangularMeshDiscreteSlopeImageMapLayer)fixture;
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshDiscreteSlopeImageMapLayer());
		
		getFixture().setCartesianTriangularMeshMapLayer(super.createCartesianTriangularMeshMapLayer());
		getFixture().setRequiredResolution(2.0);
		
		SlopeRange okSlopeRange = ApogyCoreEnvironmentFactory.eINSTANCE.createSlopeRange();
		okSlopeRange.setSlopeLowerBound(0);
		okSlopeRange.setSlopeUpperBound(10.0);
		getFixture().getSlopeRanges().add(okSlopeRange);
		
		SlopeRange warningSlopeRange = ApogyCoreEnvironmentFactory.eINSTANCE.createSlopeRange();
		warningSlopeRange.setSlopeLowerBound(10.0);
		warningSlopeRange.setSlopeUpperBound(15.0);		
		getFixture().getSlopeRanges().add(warningSlopeRange);
		
		SlopeRange dangerSlopeRange = ApogyCoreEnvironmentFactory.eINSTANCE.createSlopeRange();
		dangerSlopeRange.setSlopeLowerBound(15.0);
		dangerSlopeRange.setSlopeUpperBound(90.0);		
		getFixture().getSlopeRanges().add(dangerSlopeRange);
		
		getFixture().setOpaque(true);
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
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}	
} //CartesianTriangularMeshDiscreteSlopeImageMapLayerTest
