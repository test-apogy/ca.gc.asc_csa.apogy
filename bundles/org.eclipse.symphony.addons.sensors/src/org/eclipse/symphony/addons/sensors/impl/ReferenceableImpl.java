/**
 * Canadian Space Agency 2007.
 *
 * $Id: ReferenceableImpl.java,v 1.2.4.2 2015/05/21 15:49:36 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.addons.sensors.Referenceable;
import org.eclipse.symphony.addons.sensors.SensorsPackage;

import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenceable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.impl.ReferenceableImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceableImpl extends EObjectImpl implements Referenceable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The cached value of the '{@link #getReferenceFrame() <em>Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected Node referenceFrame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SensorsPackage.Literals.REFERENCEABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getReferenceFrame() {
		if (referenceFrame != null && referenceFrame.eIsProxy()) {
			InternalEObject oldReferenceFrame = (InternalEObject)referenceFrame;
			referenceFrame = (Node)eResolveProxy(oldReferenceFrame);
			if (referenceFrame != oldReferenceFrame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SensorsPackage.REFERENCEABLE__REFERENCE_FRAME, oldReferenceFrame, referenceFrame));
			}
		}
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetReferenceFrame() {
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceFrame(Node newReferenceFrame) {
		Node oldReferenceFrame = referenceFrame;
		referenceFrame = newReferenceFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SensorsPackage.REFERENCEABLE__REFERENCE_FRAME, oldReferenceFrame, referenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				if (resolve) return getReferenceFrame();
				return basicGetReferenceFrame();
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
			case SensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				setReferenceFrame((Node)newValue);
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
			case SensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				setReferenceFrame((Node)null);
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
			case SensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				return referenceFrame != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceableImpl
