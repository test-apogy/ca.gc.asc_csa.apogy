/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshURLMapLayer;
import org.eclipse.symphony.core.environment.Map;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

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
		CartesianTriangularMeshURLMapLayer layer = Symphony__CoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshURLMapLayer();
		layer.setUrl("platform:/plugin/org.eclipse.symphony.core.environment.tests/data/CSAMarsYardDEM100cm.tri");
		
		Map map = Symphony__CoreEnvironmentFactory.eINSTANCE.createMap();
		map.setTransformation(Symphony__CommonMathFacade.INSTANCE.createIdentityMatrix4x4());
		map.getLayers().add(layer);
		
		return layer;
	}
		
} //CartesianTriangularMeshDerivedImageMapLayerTest
