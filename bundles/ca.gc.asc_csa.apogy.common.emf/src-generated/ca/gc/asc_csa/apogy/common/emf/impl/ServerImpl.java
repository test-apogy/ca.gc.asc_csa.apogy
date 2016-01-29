/**
 */
package ca.gc.asc_csa.apogy.common.emf.impl;

import org.eclipse.core.runtime.jobs.Job;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.ServerImpl#getServerJob <em>Server Job</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends StartableImpl implements Server {
	/**
	 * The default value of the '{@link #getServerJob() <em>Server Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerJob()
	 * @generated
	 * @ordered
	 */
	protected static final Job SERVER_JOB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerJob() <em>Server Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerJob()
	 * @generated
	 * @ordered
	 */
	protected Job serverJob = SERVER_JOB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job getServerJob() {
		return serverJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonEMFPackage.SERVER__SERVER_JOB:
				return getServerJob();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonEMFPackage.SERVER__SERVER_JOB:
				return SERVER_JOB_EDEFAULT == null ? serverJob != null : !SERVER_JOB_EDEFAULT.equals(serverJob);
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
		result.append(" (serverJob: ");
		result.append(serverJob);
		result.append(')');
		return result.toString();
	}

} //ServerImpl