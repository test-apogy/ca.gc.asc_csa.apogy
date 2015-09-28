/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.eclipse.emf.ui.property.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.eclipse.emf.ui.property.EmfUiPropertyPackage;
import ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributor;
import ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Cell Editor Contributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorImpl#getCellEditorProvider <em>Cell Editor Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyCellEditorContributorImpl extends EObjectImpl implements PropertyCellEditorContributor {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Class<?> target;

	/**
	 * The default value of the '{@link #getCellEditorProvider() <em>Cell Editor Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellEditorProvider()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyCellEditorProvider CELL_EDITOR_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellEditorProvider() <em>Cell Editor Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellEditorProvider()
	 * @generated
	 * @ordered
	 */
	protected PropertyCellEditorProvider cellEditorProvider = CELL_EDITOR_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCellEditorContributorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfUiPropertyPackage.Literals.PROPERTY_CELL_EDITOR_CONTRIBUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Class<?> newTarget) {
		Class<?> oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellEditorProvider getCellEditorProvider() {
		return cellEditorProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellEditorProvider(PropertyCellEditorProvider newCellEditorProvider) {
		PropertyCellEditorProvider oldCellEditorProvider = cellEditorProvider;
		cellEditorProvider = newCellEditorProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER, oldCellEditorProvider, cellEditorProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET:
				return getTarget();
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER:
				return getCellEditorProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET:
				setTarget((Class<?>)newValue);
				return;
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER:
				setCellEditorProvider((PropertyCellEditorProvider)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET:
				setTarget((Class<?>)null);
				return;
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER:
				setCellEditorProvider(CELL_EDITOR_PROVIDER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET:
				return target != null;
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER:
				return CELL_EDITOR_PROVIDER_EDEFAULT == null ? cellEditorProvider != null : !CELL_EDITOR_PROVIDER_EDEFAULT.equals(cellEditorProvider);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (target: ");
		result.append(target);
		result.append(", cellEditorProvider: ");
		result.append(cellEditorProvider);
		result.append(')');
		return result.toString();
	}

} //PropertyCellEditorContributorImpl