/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMeshPolygonSampler;
import org.eclipse.symphony.common.geometry.data3d.Data3DIO;
import org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFacade;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFactory;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.addons.primitives.SpherePrimitive;
import org.eclipse.symphony.common.topology.addons.primitives.Symphony__CommonTopologyAddonsPrimitivesFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Polygon Sampler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshPolygonSamplerTest extends TestCase {

	/**
	 * The fixture for this Cartesian Triangular Mesh Polygon Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshPolygonSampler fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshPolygonSamplerTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh Polygon Sampler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshPolygonSamplerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Triangular Mesh Polygon Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianTriangularMeshPolygonSampler fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Polygon Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshPolygonSampler getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMeshPolygonSampler());
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void testProcess() 
	{
		String terrainFileName = Activator.getDefault().getDataPath() + File.separator + "CSAMarsYardDEM100cm";
		TransformNode root = Symphony__CommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0,	0, 0);
		double radius = 5.0;
		CartesianPositionCoordinates center = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);

		CartesianTriangularMesh terrain = null;
		try 
		{
			
			terrain = Data3DIO.INSTANCE.loadTriangularMeshFromASCII(terrainFileName);
			System.out.println(this.getName() + " : Terrain " + terrainFileName	+ " loaded.");
			
			ContentNode<CartesianTriangularMesh> node = Symphony__CommonTopologyFactory.eINSTANCE.createContentNode();
			node.setContent(terrain);
			
			root.getChildren().add(node);
		} 
		catch (Exception e) 
		{
			fail(e.getMessage());
		}

		SphereSamplingShape samplingShape = Symphony__CommonGeometryData3DFactory.eINSTANCE.createSphereSamplingShape();
		samplingShape.setCenter(center);
		samplingShape.setRadius(radius);
		getFixture().getPolygonSamplingShapes().add(samplingShape);

		SpherePrimitive sphere1 = Symphony__CommonTopologyAddonsPrimitivesFactory.eINSTANCE.createSpherePrimitive();
		sphere1.setRadius(radius);
		TransformNode sphere1TransformNode = Symphony__CommonTopologyFacade.INSTANCE.createTransformNodeXYZ(center.getX(), center.getY(), center.getZ(), 0, 0, 0);
		sphere1TransformNode.getChildren().add(sphere1);
		root.getChildren().add(sphere1TransformNode);

		try 
		{
			CartesianTriangularMesh croppedMesh = (CartesianTriangularMesh) getFixture().process(terrain);
			ContentNode<CartesianTriangularMesh> croppedTerrain = Symphony__CommonTopologyFacade.INSTANCE.createContentNode(croppedMesh);
			croppedTerrain
					.setDescription("Cropped Terrain centered at ("
							+ center.asPoint3d().toString() + ") with radius "
							+ radius);
			root.getChildren().add(croppedTerrain);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Another sample.

		center.setX(10);
		center.setY(15);

		SpherePrimitive sphere2 = Symphony__CommonTopologyAddonsPrimitivesFactory.eINSTANCE.createSpherePrimitive();
		sphere2.setRadius(radius);

		TransformNode sphere2TransformNode = Symphony__CommonTopologyFacade.INSTANCE.createTransformNodeXYZ(center.getX(), center.getY(), center.getZ(), 0, 0, 0);
		sphere2TransformNode.getChildren().add(sphere2);
		root.getChildren().add(sphere2TransformNode);

		try {
			CartesianTriangularMesh croppedMesh = (CartesianTriangularMesh) getFixture().process(terrain);
			ContentNode<CartesianTriangularMesh> croppedTerrain = Symphony__CommonTopologyFacade.INSTANCE.createContentNode(croppedMesh);
			croppedTerrain
					.setDescription("Cropped Terrain centered at ("
							+ center.asPoint3d().toString() + ") with radius "
							+ radius);
			root.getChildren().add(croppedTerrain);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Saves the topology to file.
		System.out.println(this.getName() + " Saving topology...");

		Resource resource = null;
		try 
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			resource = resourceSet.createResource(URI.createFileURI(Activator
					.getDefault().getResultsPath()
					+ File.separator + terrainFileName + ".topo"));
			resource.getContents().add(root);
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Saved topology in : " + resource.getURI());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();		
		}		
	}
} //CartesianTriangularMeshPolygonSamplerTest
