/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.topology.addons.primitives.ui.LabelPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.SpherePrimitivePresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.Symphony__CommonTopologyAddonsPrimitivesUIPackage;
import org.eclipse.symphony.common.topology.addons.primitives.ui.VectorPresentation;
import org.eclipse.symphony.common.topology.addons.primitives.ui.WayPointPresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentation;

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
 * @see org.eclipse.symphony.common.topology.addons.primitives.ui.Symphony__CommonTopologyAddonsPrimitivesUIPackage
 * @generated
 */
public class Symphony__CommonTopologyAddonsPrimitivesUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__CommonTopologyAddonsPrimitivesUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyAddonsPrimitivesUISwitch() {
		if (modelPackage == null) {
			modelPackage = Symphony__CommonTopologyAddonsPrimitivesUIPackage.eINSTANCE;
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
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.VECTOR_PRESENTATION: {
				VectorPresentation vectorPresentation = (VectorPresentation)theEObject;
				T result = caseVectorPresentation(vectorPresentation);
				if (result == null) result = caseNodePresentation(vectorPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.WAY_POINT_PRESENTATION: {
				WayPointPresentation wayPointPresentation = (WayPointPresentation)theEObject;
				T result = caseWayPointPresentation(wayPointPresentation);
				if (result == null) result = caseNodePresentation(wayPointPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.LABEL_PRESENTATION: {
				LabelPresentation labelPresentation = (LabelPresentation)theEObject;
				T result = caseLabelPresentation(labelPresentation);
				if (result == null) result = caseNodePresentation(labelPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonTopologyAddonsPrimitivesUIPackage.SPHERE_PRIMITIVE_PRESENTATION: {
				SpherePrimitivePresentation spherePrimitivePresentation = (SpherePrimitivePresentation)theEObject;
				T result = caseSpherePrimitivePresentation(spherePrimitivePresentation);
				if (result == null) result = caseNodePresentation(spherePrimitivePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorPresentation(VectorPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Way Point Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Way Point Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWayPointPresentation(WayPointPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelPresentation(LabelPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sphere Primitive Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sphere Primitive Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpherePrimitivePresentation(SpherePrimitivePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePresentation(NodePresentation object) {
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

} //Symphony__CommonTopologyAddonsPrimitivesUISwitch