/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizer;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Colorizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CartesianTriangularMeshColorizerImpl extends ProcessorImpl<CartesianTriangularMesh, CartesianTriangularMesh> implements CartesianTriangularMeshColorizer 
{	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshColorizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_TRIANGULAR_MESH_COLORIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianTriangularMesh newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CartesianTriangularMesh newOutput) {
		super.setOutput(newOutput);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER___REPLACE__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES_COLOREDCARTESIANPOSITIONCOORDINATES:
				replace((CartesianTriangularMesh)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1), (ColoredCartesianPositionCoordinates)arguments.get(2));
				return null;
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER___COMPUTE_COLOR__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES:
				return computeColor((CartesianTriangularMesh)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}	

	@Override
	public void replace(CartesianTriangularMesh mesh, CartesianPositionCoordinates originalVertex, ColoredCartesianPositionCoordinates coloredVertex) 
	{
		// Adds the colored vextex to the mesh
		mesh.getPoints().add(coloredVertex);
		
		// First, gets the list of polygons sharing the original vertex.
		List<CartesianTriangle> polygons = mesh.getPolygonsSharingPoint(originalVertex);
						
		// For each polygon, replace the original vertex with its colored version.
		for(CartesianTriangle polygon : polygons)
		{						
			int index = polygon.getVertices().indexOf(originalVertex);
			polygon.getVertices().set(index, coloredVertex);
			
		}
		
		// Remove the original vertex from the mesh.
		mesh.getPoints().remove(originalVertex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public RGBAColor computeColor(CartesianTriangularMesh mesh, CartesianPositionCoordinates point);	

	@Override
	public CartesianTriangularMesh process(CartesianTriangularMesh input) throws Exception 
	{	
		// Sets the input.
		setInput(input);
		
		getProgressMonitor().beginTask("Colorizing mesh", input.getPoints().size());
		
		// First, makes a copy of the original mesh.
		CartesianTriangularMesh meshCopy = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangularMesh(input);
		
		// Goes throught the list of point and process them
		for(CartesianPositionCoordinates point : meshCopy.getPoints())
		{
			RGBAColor color = computeColor(meshCopy, point);
			ColoredCartesianPositionCoordinates coloredVertex = ApogyCommonGeometryData3DFacade.INSTANCE.createColoredCartesianPositionCoordinates(point.getX(), 
					point.getY(), point.getZ(), color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()); 
			
			replace(meshCopy, point, coloredVertex);
			
			getProgressMonitor().worked(1);
		}
				
		setOutput(meshCopy);
		
		return meshCopy; 
	}

} //CartesianTriangularMeshColorizerImpl
