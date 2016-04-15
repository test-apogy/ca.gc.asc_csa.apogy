/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizer;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor;
import ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Colorizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CartesianTriangularMeshColorizerImpl extends ProcessorImpl<CartesianTriangularMesh, ColoredCartesianTriangularMesh> implements CartesianTriangularMeshColorizer 
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
	public void setOutput(ColoredCartesianTriangularMesh newOutput) {
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
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH_COLORIZER___COMPUTE_COLOR__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES:
				return computeColor((CartesianTriangularMesh)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public RGBAColor computeColor(CartesianTriangularMesh mesh, CartesianPositionCoordinates point);	

	@Override
	public ColoredCartesianTriangularMesh process(CartesianTriangularMesh input) throws Exception 
	{	
		// Sets the input.
		setInput(input);
		
		getProgressMonitor().beginTask("Colorizing mesh", input.getPoints().size());
		
		// Gets the color assigned to each point.
		Map<CartesianPositionCoordinates, ColoredCartesianPositionCoordinates> originalToColoredPointMap = new HashMap<CartesianPositionCoordinates, ColoredCartesianPositionCoordinates>();
		for(CartesianPositionCoordinates point : input.getPoints())
		{
			RGBAColor color = computeColor(input, point);
			
			ColoredCartesianPositionCoordinates coloredPoint = ApogyCommonGeometryData3DFacade.INSTANCE.createColoredCartesianPositionCoordinates(point.getX(), point.getY(), point.getZ(), color.getRed(), color.getGreen(), color.getBlue());
			originalToColoredPointMap.put(point, coloredPoint);
		}
		
		// Create a new mesh with the colored point.
		ColoredCartesianTriangularMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createColoredCartesianTriangularMesh();
		mesh.getPoints().addAll(originalToColoredPointMap.values());
		
		for(CartesianTriangle triangle : input.getPolygons())
		{
			CartesianTriangle newTriangle = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle();
			
			for(CartesianPositionCoordinates vertex : triangle.getVertices())
			{
				ColoredCartesianPositionCoordinates cc = originalToColoredPointMap.get(vertex);
				if(cc != null)
				{
					newTriangle.getVertices().add(cc);
				}
			}
			
			mesh.getPolygons().add(newTriangle);
		}
		
		
		setOutput(mesh);
		return mesh;
	}

} //CartesianTriangularMeshColorizerImpl
