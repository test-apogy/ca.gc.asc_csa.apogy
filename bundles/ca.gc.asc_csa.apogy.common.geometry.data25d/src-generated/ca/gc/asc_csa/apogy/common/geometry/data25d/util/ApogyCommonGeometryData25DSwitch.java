/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data25d.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;
import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data.Mesh;
import ca.gc.asc_csa.apogy.common.geometry.data.Polygon;
import ca.gc.asc_csa.apogy.common.geometry.data25d.*;
import ca.gc.asc_csa.apogy.common.processors.Monitorable;
import ca.gc.asc_csa.apogy.common.processors.Processor;

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
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage
 * @generated
 */
public class ApogyCommonGeometryData25DSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCommonGeometryData25DPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData25DSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCommonGeometryData25DPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyCommonGeometryData25DPackage.COORDINATES25_D: {
				Coordinates25D coordinates25D = (Coordinates25D)theEObject;
				T1 result = caseCoordinates25D(coordinates25D);
				if (result == null) result = caseCoordinates(coordinates25D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_D: {
				CoordinatesSet25D coordinatesSet25D = (CoordinatesSet25D)theEObject;
				T1 result = caseCoordinatesSet25D(coordinatesSet25D);
				if (result == null) result = caseCoordinatesSet(coordinatesSet25D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.VOLUMETRIC_COORDINATES_SET25_D: {
				VolumetricCoordinatesSet25D volumetricCoordinatesSet25D = (VolumetricCoordinatesSet25D)theEObject;
				T1 result = caseVolumetricCoordinatesSet25D(volumetricCoordinatesSet25D);
				if (result == null) result = caseCoordinatesSet25D(volumetricCoordinatesSet25D);
				if (result == null) result = caseCoordinatesSet(volumetricCoordinatesSet25D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.POLYGON25_D: {
				Polygon25D polygon25D = (Polygon25D)theEObject;
				T1 result = casePolygon25D(polygon25D);
				if (result == null) result = casePolygon(polygon25D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.MESH25_D: {
				Mesh25D mesh25D = (Mesh25D)theEObject;
				T1 result = caseMesh25D(mesh25D);
				if (result == null) result = caseMesh(mesh25D);
				if (result == null) result = caseCoordinatesSet(mesh25D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.VOLUMETRIC_MESH25_D: {
				VolumetricMesh25D volumetricMesh25D = (VolumetricMesh25D)theEObject;
				T1 result = caseVolumetricMesh25D(volumetricMesh25D);
				if (result == null) result = caseMesh25D(volumetricMesh25D);
				if (result == null) result = caseMesh(volumetricMesh25D);
				if (result == null) result = caseCoordinatesSet(volumetricMesh25D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.COORDINATES_SET25_DFILTER: {
				CoordinatesSet25DFilter<?> coordinatesSet25DFilter = (CoordinatesSet25DFilter<?>)theEObject;
				T1 result = caseCoordinatesSet25DFilter(coordinatesSet25DFilter);
				if (result == null) result = caseProcessor(coordinatesSet25DFilter);
				if (result == null) result = caseMonitorable(coordinatesSet25DFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.APOGY_COMMON_GEOMETRY_DATA25_DFACADE: {
				ApogyCommonGeometryData25DFacade apogyCommonGeometryData25DFacade = (ApogyCommonGeometryData25DFacade)theEObject;
				T1 result = caseApogyCommonGeometryData25DFacade(apogyCommonGeometryData25DFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonGeometryData25DPackage.DATA25_DIO: {
				Data25DIO data25DIO = (Data25DIO)theEObject;
				T1 result = caseData25DIO(data25DIO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates25 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates25 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoordinates25D(Coordinates25D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Set25 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Set25 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoordinatesSet25D(CoordinatesSet25D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volumetric Coordinates Set25 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volumetric Coordinates Set25 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVolumetricCoordinatesSet25D(VolumetricCoordinatesSet25D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon25 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon25 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePolygon25D(Polygon25D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mesh25 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mesh25 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMesh25D(Mesh25D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volumetric Mesh25 D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volumetric Mesh25 D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVolumetricMesh25D(VolumetricMesh25D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Set25 DFilter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Set25 DFilter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends CoordinatesSet25D> T1 caseCoordinatesSet25DFilter(CoordinatesSet25DFilter<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApogyCommonGeometryData25DFacade(ApogyCommonGeometryData25DFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data25 DIO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data25 DIO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseData25DIO(Data25DIO object) {
		return null;
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
	public T1 caseCoordinates(Coordinates object) {
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
	public <T extends Coordinates> T1 caseCoordinatesSet(CoordinatesSet<T> object) {
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
	public <T extends Coordinates> T1 casePolygon(Polygon<T> object) {
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
	public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> T1 caseMesh(Mesh<CoordinatesType, PolygonType> object) {
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
	public T1 caseMonitorable(Monitorable object) {
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
	public <I, O> T1 caseProcessor(Processor<I, O> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ApogyCommonGeometryData25DSwitch
