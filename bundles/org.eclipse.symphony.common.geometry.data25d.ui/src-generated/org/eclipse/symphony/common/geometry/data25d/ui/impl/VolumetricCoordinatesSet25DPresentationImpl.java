/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.geometry.data25d.ui.Data25DUIPackage;
import org.eclipse.symphony.common.geometry.data25d.ui.VolumetricCoordinatesSet25DPresentation;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volumetric Coordinates Set25 DPresentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data25d.ui.impl.VolumetricCoordinatesSet25DPresentationImpl#getPointsCloud <em>Points Cloud</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumetricCoordinatesSet25DPresentationImpl extends NodePresentationImpl implements VolumetricCoordinatesSet25DPresentation {
	/**
	 * The cached value of the '{@link #getPointsCloud() <em>Points Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsCloud()
	 * @generated
	 * @ordered
	 */
	protected VolumetricCoordinatesSet25D pointsCloud;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumetricCoordinatesSet25DPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data25DUIPackage.Literals.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricCoordinatesSet25D getPointsCloud() {
		if (pointsCloud != null && pointsCloud.eIsProxy()) {
			InternalEObject oldPointsCloud = (InternalEObject)pointsCloud;
			pointsCloud = (VolumetricCoordinatesSet25D)eResolveProxy(oldPointsCloud);
			if (pointsCloud != oldPointsCloud) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD, oldPointsCloud, pointsCloud));
			}
		}
		return pointsCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricCoordinatesSet25D basicGetPointsCloud() {
		return pointsCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsCloud(VolumetricCoordinatesSet25D newPointsCloud) {
		VolumetricCoordinatesSet25D oldPointsCloud = pointsCloud;
		pointsCloud = newPointsCloud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD, oldPointsCloud, pointsCloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD:
				if (resolve) return getPointsCloud();
				return basicGetPointsCloud();
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
			case Data25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD:
				setPointsCloud((VolumetricCoordinatesSet25D)newValue);
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
			case Data25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD:
				setPointsCloud((VolumetricCoordinatesSet25D)null);
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
			case Data25DUIPackage.VOLUMETRIC_COORDINATES_SET25_DPRESENTATION__POINTS_CLOUD:
				return pointsCloud != null;
		}
		return super.eIsSet(featureID);
	}

} //VolumetricCoordinatesSet25DPresentationImpl
