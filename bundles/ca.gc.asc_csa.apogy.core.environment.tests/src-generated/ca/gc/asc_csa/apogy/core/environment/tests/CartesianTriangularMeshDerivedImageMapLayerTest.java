/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Derived Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class CartesianTriangularMeshDerivedImageMapLayerTest extends ImageMapLayerTest {

	/**
	 * Constructs a new Cartesian Triangular Mesh Derived Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshDerivedImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Derived Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangularMeshDerivedImageMapLayer getFixture() 
	{
		return (CartesianTriangularMeshDerivedImageMapLayer)fixture;
	}
	
	@Override
	public void testGetResolution() 
	{
		// Updates the image.
		getFixture().updateImage(new NullProgressMonitor());
		
		// Should be equal to the required resolution
		assertEquals(getFixture().getRequiredResolution(), getFixture().getResolution(), 1E-6);
	}
	
	protected CartesianTriangularMeshMapLayer createCartesianTriangularMeshMapLayer()
	{
		CartesianTriangularMeshURLMapLayer layer = ApogyCoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshURLMapLayer();
		layer.setUrl("platform:/plugin/ca.gc.asc_csa.apogy.core.environment.tests/data/CSAMarsYardDEM100cm.tri");
		
		Map map = ApogyCoreEnvironmentFactory.eINSTANCE.createMap();
		map.setTransformation(ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4());
		map.getLayers().add(layer);
		
		return layer;
	}
		
	@Override
	public void testGetRegion() 
	{
		RectangularRegion rectangularRegion = getFixture().getImageMapLayerRegion();
		
		assertNotNull(rectangularRegion);
		assertEquals(60.0, rectangularRegion.getXDimension());
		assertEquals(120.0, rectangularRegion.getYDimension());
	}
} //CartesianTriangularMeshDerivedImageMapLayerTest
