/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.BasicCartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Cartesian Triangular Mesh Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.BasicCartesianTriangularMeshMapLayerImpl#getMesh <em>Mesh</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicCartesianTriangularMeshMapLayerImpl extends CartesianTriangularMeshMapLayerImpl implements BasicCartesianTriangularMeshMapLayer {
	/**
	 * The cached value of the '{@link #getMesh() <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesh()
	 * @generated
	 * @ordered
	 */
	protected CartesianTriangularMesh mesh;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicCartesianTriangularMeshMapLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMesh getMesh() {
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMesh(CartesianTriangularMesh newMesh, NotificationChain msgs) {
		CartesianTriangularMesh oldMesh = mesh;
		mesh = newMesh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH, oldMesh, newMesh);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesh(CartesianTriangularMesh newMesh) {
		if (newMesh != mesh) {
			NotificationChain msgs = null;
			if (mesh != null)
				msgs = ((InternalEObject)mesh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH, null, msgs);
			if (newMesh != null)
				msgs = ((InternalEObject)newMesh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH, null, msgs);
			msgs = basicSetMesh(newMesh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH, newMesh, newMesh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH:
				return basicSetMesh(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH:
				return getMesh();
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
			case SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH:
				setMesh((CartesianTriangularMesh)newValue);
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
			case SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH:
				setMesh((CartesianTriangularMesh)null);
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
			case SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH:
				return mesh != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public CartesianTriangularMesh getCurrentMesh() 
	{
		return getMesh();
	}
} //BasicCartesianTriangularMeshMapLayerImpl