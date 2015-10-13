/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyPackage;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentContributor;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellViewerContentProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Cell Viewer Content Contributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorImpl#getCellViewerContentProvider <em>Cell Viewer Content Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyCellViewerContentContributorImpl extends EObjectImpl implements PropertyCellViewerContentContributor {
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
	 * The default value of the '{@link #getCellViewerContentProvider() <em>Cell Viewer Content Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellViewerContentProvider()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyCellViewerContentProvider CELL_VIEWER_CONTENT_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellViewerContentProvider() <em>Cell Viewer Content Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellViewerContentProvider()
	 * @generated
	 * @ordered
	 */
	protected PropertyCellViewerContentProvider cellViewerContentProvider = CELL_VIEWER_CONTENT_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCellViewerContentContributorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfUiPropertyPackage.Literals.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellViewerContentProvider getCellViewerContentProvider() {
		return cellViewerContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellViewerContentProvider(PropertyCellViewerContentProvider newCellViewerContentProvider) {
		PropertyCellViewerContentProvider oldCellViewerContentProvider = cellViewerContentProvider;
		cellViewerContentProvider = newCellViewerContentProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER, oldCellViewerContentProvider, cellViewerContentProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET:
				return getTarget();
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER:
				return getCellViewerContentProvider();
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
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET:
				setTarget((Class<?>)newValue);
				return;
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER:
				setCellViewerContentProvider((PropertyCellViewerContentProvider)newValue);
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
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET:
				setTarget((Class<?>)null);
				return;
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER:
				setCellViewerContentProvider(CELL_VIEWER_CONTENT_PROVIDER_EDEFAULT);
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
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET:
				return target != null;
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER:
				return CELL_VIEWER_CONTENT_PROVIDER_EDEFAULT == null ? cellViewerContentProvider != null : !CELL_VIEWER_CONTENT_PROVIDER_EDEFAULT.equals(cellViewerContentProvider);
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
		result.append(", cellViewerContentProvider: ");
		result.append(cellViewerContentProvider);
		result.append(')');
		return result.toString();
	}

} //PropertyCellViewerContentContributorImpl