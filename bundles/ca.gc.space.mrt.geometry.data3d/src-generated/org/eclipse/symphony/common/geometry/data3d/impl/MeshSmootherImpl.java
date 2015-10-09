/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import ca.gc.space.mrt.common.processors.impl.ProcessorImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.MeshSmoother;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh Smoother</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.impl.MeshSmootherImpl#getNumberOfIterations <em>Number Of Iterations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeshSmootherImpl extends ProcessorImpl<CartesianCoordinatesSet, CartesianTriangularMesh> implements MeshSmoother {
	/**
	 * The default value of the '{@link #getNumberOfIterations() <em>Number Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ITERATIONS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfIterations() <em>Number Of Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfIterations()
	 * @generated
	 * @ordered
	 */
	protected int numberOfIterations = NUMBER_OF_ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshSmootherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.MESH_SMOOTHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(CartesianCoordinatesSet newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(CartesianTriangularMesh newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfIterations() {
		return numberOfIterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfIterations(int newNumberOfIterations) {
		int oldNumberOfIterations = numberOfIterations;
		numberOfIterations = newNumberOfIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.MESH_SMOOTHER__NUMBER_OF_ITERATIONS, oldNumberOfIterations, numberOfIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.MESH_SMOOTHER__NUMBER_OF_ITERATIONS:
				return getNumberOfIterations();
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
			case Data3dPackage.MESH_SMOOTHER__NUMBER_OF_ITERATIONS:
				setNumberOfIterations((Integer)newValue);
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
			case Data3dPackage.MESH_SMOOTHER__NUMBER_OF_ITERATIONS:
				setNumberOfIterations(NUMBER_OF_ITERATIONS_EDEFAULT);
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
			case Data3dPackage.MESH_SMOOTHER__NUMBER_OF_ITERATIONS:
				return numberOfIterations != NUMBER_OF_ITERATIONS_EDEFAULT;
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
		result.append(" (numberOfIterations: ");
		result.append(numberOfIterations);
		result.append(')');
		return result.toString();
	}

} //MeshSmootherImpl
