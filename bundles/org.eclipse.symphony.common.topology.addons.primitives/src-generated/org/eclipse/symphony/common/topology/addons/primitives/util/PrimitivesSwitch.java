/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Leaf;
import org.eclipse.symphony.common.topology.Node;

import org.eclipse.symphony.common.topology.addons.primitives.*;

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
 * @see org.eclipse.symphony.common.topology.addons.primitives.PrimitivesPackage
 * @generated
 */
public class PrimitivesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PrimitivesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitivesSwitch() {
		if (modelPackage == null) {
			modelPackage = PrimitivesPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PrimitivesPackage.VECTOR: {
				Vector vector = (Vector)theEObject;
				T result = caseVector(vector);
				if (result == null) result = caseNode(vector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.PICK_VECTOR: {
				PickVector pickVector = (PickVector)theEObject;
				T result = casePickVector(pickVector);
				if (result == null) result = caseVector(pickVector);
				if (result == null) result = caseNode(pickVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.PLANE: {
				Plane plane = (Plane)theEObject;
				T result = casePlane(plane);
				if (result == null) result = caseNode(plane);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.WAY_POINT: {
				WayPoint wayPoint = (WayPoint)theEObject;
				T result = caseWayPoint(wayPoint);
				if (result == null) result = caseAggregateGroupNode(wayPoint);
				if (result == null) result = caseGroupNode(wayPoint);
				if (result == null) result = caseNode(wayPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseNode(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.SPHERE_PRIMITIVE: {
				SpherePrimitive spherePrimitive = (SpherePrimitive)theEObject;
				T result = caseSpherePrimitive(spherePrimitive);
				if (result == null) result = caseAggregateGroupNode(spherePrimitive);
				if (result == null) result = caseGroupNode(spherePrimitive);
				if (result == null) result = caseNode(spherePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.LIGHT: {
				Light light = (Light)theEObject;
				T result = caseLight(light);
				if (result == null) result = caseLeaf(light);
				if (result == null) result = caseNode(light);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.AMBIENT_LIGHT: {
				AmbientLight ambientLight = (AmbientLight)theEObject;
				T result = caseAmbientLight(ambientLight);
				if (result == null) result = caseLight(ambientLight);
				if (result == null) result = caseLeaf(ambientLight);
				if (result == null) result = caseNode(ambientLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.DIRECTIONAL_LIGHT: {
				DirectionalLight directionalLight = (DirectionalLight)theEObject;
				T result = caseDirectionalLight(directionalLight);
				if (result == null) result = caseLight(directionalLight);
				if (result == null) result = caseLeaf(directionalLight);
				if (result == null) result = caseNode(directionalLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.POINT_LIGHT: {
				PointLight pointLight = (PointLight)theEObject;
				T result = casePointLight(pointLight);
				if (result == null) result = caseLight(pointLight);
				if (result == null) result = caseLeaf(pointLight);
				if (result == null) result = caseNode(pointLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.SPOT_LIGHT: {
				SpotLight spotLight = (SpotLight)theEObject;
				T result = caseSpotLight(spotLight);
				if (result == null) result = casePointLight(spotLight);
				if (result == null) result = caseLight(spotLight);
				if (result == null) result = caseLeaf(spotLight);
				if (result == null) result = caseNode(spotLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PrimitivesPackage.PRIMITIVES_FACADE: {
				PrimitivesFacade primitivesFacade = (PrimitivesFacade)theEObject;
				T result = casePrimitivesFacade(primitivesFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVector(Vector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePickVector(PickVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlane(Plane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWayPoint(WayPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sphere Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sphere Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpherePrimitive(SpherePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLight(Light object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ambient Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ambient Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmbientLight(AmbientLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directional Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directional Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionalLight(DirectionalLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointLight(PointLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spot Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spot Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpotLight(SpotLight object) {
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
	public T casePrimitivesFacade(PrimitivesFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupNode(GroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeaf(Leaf object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //PrimitivesSwitch
