/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.ui.util;

import ca.gc.asc_csa.symphony.tools.ui.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.symphony.tools.ui.Ruler3dToolNodePresentation;
import ca.gc.asc_csa.symphony.tools.ui.SunVector3DToolNodePresentation;
import ca.gc.asc_csa.symphony.tools.ui.SymphonyToolsUIPackage;
import ca.gc.space.topology.ui.NodePresentation;

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
 * @see ca.gc.asc_csa.symphony.tools.ui.SymphonyToolsUIPackage
 * @generated
 */
public class SymphonyToolsUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyToolsUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyToolsUISwitch() {
		if (modelPackage == null) {
			modelPackage = SymphonyToolsUIPackage.eINSTANCE;
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
			case SymphonyToolsUIPackage.RULER3D_TOOL_NODE_PRESENTATION: {
				Ruler3dToolNodePresentation ruler3dToolNodePresentation = (Ruler3dToolNodePresentation)theEObject;
				T result = caseRuler3dToolNodePresentation(ruler3dToolNodePresentation);
				if (result == null) result = caseNodePresentation(ruler3dToolNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyToolsUIPackage.SUN_VECTOR3_DTOOL_NODE_PRESENTATION: {
				SunVector3DToolNodePresentation sunVector3DToolNodePresentation = (SunVector3DToolNodePresentation)theEObject;
				T result = caseSunVector3DToolNodePresentation(sunVector3DToolNodePresentation);
				if (result == null) result = caseNodePresentation(sunVector3DToolNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyToolsUIPackage.TRAJECTORY3_DTOOL_NODE_PRESENTATION: {
				Trajectory3DToolNodePresentation trajectory3DToolNodePresentation = (Trajectory3DToolNodePresentation)theEObject;
				T result = caseTrajectory3DToolNodePresentation(trajectory3DToolNodePresentation);
				if (result == null) result = caseNodePresentation(trajectory3DToolNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruler3d Tool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruler3d Tool Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuler3dToolNodePresentation(Ruler3dToolNodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSunVector3DToolNodePresentation(SunVector3DToolNodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory3 DTool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory3 DTool Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectory3DToolNodePresentation(Trajectory3DToolNodePresentation object) {
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

} //SymphonyToolsUISwitch
