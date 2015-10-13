/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.*;

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
 * @see org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyPackage
 * @generated
 */
public class EmfUiPropertySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmfUiPropertyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfUiPropertySwitch() {
		if (modelPackage == null) {
			modelPackage = EmfUiPropertyPackage.eINSTANCE;
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
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR: {
				PropertyCellEditorContributor propertyCellEditorContributor = (PropertyCellEditorContributor)theEObject;
				T result = casePropertyCellEditorContributor(propertyCellEditorContributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTORS: {
				PropertyCellEditorContributors propertyCellEditorContributors = (PropertyCellEditorContributors)theEObject;
				T result = casePropertyCellEditorContributors(propertyCellEditorContributors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR: {
				PropertyCellViewerContentContributor propertyCellViewerContentContributor = (PropertyCellViewerContentContributor)theEObject;
				T result = casePropertyCellViewerContentContributor(propertyCellViewerContentContributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS: {
				PropertyCellViewerContentContributors propertyCellViewerContentContributors = (PropertyCellViewerContentContributors)theEObject;
				T result = casePropertyCellViewerContentContributors(propertyCellViewerContentContributors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Cell Editor Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Cell Editor Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCellEditorContributor(PropertyCellEditorContributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Cell Editor Contributors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Cell Editor Contributors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCellEditorContributors(PropertyCellEditorContributors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Cell Viewer Content Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Cell Viewer Content Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCellViewerContentContributor(PropertyCellViewerContentContributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Cell Viewer Content Contributors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Cell Viewer Content Contributors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyCellViewerContentContributors(PropertyCellViewerContentContributors object) {
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

} //EmfUiPropertySwitch