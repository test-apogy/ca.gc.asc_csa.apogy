/**
 * Canadian Space Agency 2008
 *
 * $Id: DataSwitch.java,v 1.5.4.3 2015/09/22 19:39:40 rlarcheveque Exp $
 */
package ca.gc.space.mrt.geometry.data.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.gc.space.mrt.common.processors.Monitorable;
import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.geometry.data.Coordinates;
import ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape;
import ca.gc.space.mrt.geometry.data.CoordinatesSet;
import ca.gc.space.mrt.geometry.data.CoordinatesSetShapesSampler;
import ca.gc.space.mrt.geometry.data.DataPackage;
import ca.gc.space.mrt.geometry.data.Mesh;
import ca.gc.space.mrt.geometry.data.MeshCoordinatesShapesSampler;
import ca.gc.space.mrt.geometry.data.MeshPolygonShapesSampler;
import ca.gc.space.mrt.geometry.data.Polygon;
import ca.gc.space.mrt.geometry.data.PolygonSamplingShape;
import ca.gc.space.mrt.geometry.data.SamplingShape;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.data.DataPackage
 * @generated
 */
public class DataSwitch<T1> extends Switch<T1>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSwitch()
	{
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
  protected T1 doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID) {
			case DataPackage.COORDINATES: {
				Coordinates coordinates = (Coordinates)theEObject;
				T1 result = caseCoordinates(coordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.COORDINATES_SET: {
				CoordinatesSet<?> coordinatesSet = (CoordinatesSet<?>)theEObject;
				T1 result = caseCoordinatesSet(coordinatesSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.POLYGON: {
				Polygon<?> polygon = (Polygon<?>)theEObject;
				T1 result = casePolygon(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.MESH: {
				Mesh<?, ?> mesh = (Mesh<?, ?>)theEObject;
				T1 result = caseMesh(mesh);
				if (result == null) result = caseCoordinatesSet(mesh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.SAMPLING_SHAPE: {
				SamplingShape samplingShape = (SamplingShape)theEObject;
				T1 result = caseSamplingShape(samplingShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.COORDINATES_SAMPLING_SHAPE: {
				CoordinatesSamplingShape<?> coordinatesSamplingShape = (CoordinatesSamplingShape<?>)theEObject;
				T1 result = caseCoordinatesSamplingShape(coordinatesSamplingShape);
				if (result == null) result = caseSamplingShape(coordinatesSamplingShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.POLYGON_SAMPLING_SHAPE: {
				PolygonSamplingShape<?, ?> polygonSamplingShape = (PolygonSamplingShape<?, ?>)theEObject;
				T1 result = casePolygonSamplingShape(polygonSamplingShape);
				if (result == null) result = caseSamplingShape(polygonSamplingShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.COORDINATES_SET_SHAPES_SAMPLER: {
				CoordinatesSetShapesSampler<?> coordinatesSetShapesSampler = (CoordinatesSetShapesSampler<?>)theEObject;
				T1 result = caseCoordinatesSetShapesSampler(coordinatesSetShapesSampler);
				if (result == null) result = caseProcessor(coordinatesSetShapesSampler);
				if (result == null) result = caseMonitorable(coordinatesSetShapesSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.MESH_COORDINATES_SHAPES_SAMPLER: {
				MeshCoordinatesShapesSampler<?, ?> meshCoordinatesShapesSampler = (MeshCoordinatesShapesSampler<?, ?>)theEObject;
				T1 result = caseMeshCoordinatesShapesSampler(meshCoordinatesShapesSampler);
				if (result == null) result = caseProcessor(meshCoordinatesShapesSampler);
				if (result == null) result = caseMonitorable(meshCoordinatesShapesSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.MESH_POLYGON_SHAPES_SAMPLER: {
				MeshPolygonShapesSampler<?, ?> meshPolygonShapesSampler = (MeshPolygonShapesSampler<?, ?>)theEObject;
				T1 result = caseMeshPolygonShapesSampler(meshPolygonShapesSampler);
				if (result == null) result = caseProcessor(meshPolygonShapesSampler);
				if (result == null) result = caseMonitorable(meshPolygonShapesSampler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoordinates(Coordinates object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSet(CoordinatesSet<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 casePolygon(Polygon<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 caseMesh(Mesh<CoordinatesType, PolygonType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSamplingShape(SamplingShape object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSamplingShape(CoordinatesSamplingShape<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Set Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Set Shapes Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Coordinates> T1 caseCoordinatesSetShapesSampler(CoordinatesSetShapesSampler<T> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Polygon Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Polygon Shapes Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 caseMeshPolygonShapesSampler(MeshPolygonShapesSampler<CoordinatesType, PolygonType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh Coordinates Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh Coordinates Shapes Sampler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 caseMeshCoordinatesShapesSampler(MeshCoordinatesShapesSampler<CoordinatesType, PolygonType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Sampling Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 casePolygonSamplingShape(PolygonSamplingShape<CoordinatesType, PolygonType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMonitorable(Monitorable object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T1 caseProcessor(Processor<I, O> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
  public T1 defaultCase(EObject object)
	{
		return null;
	}

} //DataSwitch
