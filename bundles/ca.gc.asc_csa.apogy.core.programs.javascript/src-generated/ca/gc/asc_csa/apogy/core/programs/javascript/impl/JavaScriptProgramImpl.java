/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.javascript.impl;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.impl.ScriptBasedProgramImpl;
import ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Script Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.javascript.impl.JavaScriptProgramImpl#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.javascript.impl.JavaScriptProgramImpl#getScriptPath <em>Script Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaScriptProgramImpl extends ScriptBasedProgramImpl implements JavaScriptProgram {
	/**
	 * The cached value of the '{@link #getOperationCalls() <em>Operation Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationCall> operationCalls;

	/**
	 * The default value of the '{@link #getScriptPath() <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScriptPath() <em>Script Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptPath()
	 * @generated
	 * @ordered
	 */
	protected String scriptPath = SCRIPT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreJavaScriptProgramsPackage.Literals.JAVA_SCRIPT_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getOperationCalls() {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentWithInverseEList<OperationCall>(OperationCall.class, this, ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS, ApogyCoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER);
		}
		return operationCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptPath() {
		return scriptPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptPath(String newScriptPath) {
		String oldScriptPath = scriptPath;
		scriptPath = newScriptPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__SCRIPT_PATH, oldScriptPath, scriptPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationCalls()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS:
				return getOperationCalls();
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__SCRIPT_PATH:
				return getScriptPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__SCRIPT_PATH:
				setScriptPath((String)newValue);
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
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS:
				getOperationCalls().clear();
				return;
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__SCRIPT_PATH:
				setScriptPath(SCRIPT_PATH_EDEFAULT);
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
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__SCRIPT_PATH:
				return SCRIPT_PATH_EDEFAULT == null ? scriptPath != null : !SCRIPT_PATH_EDEFAULT.equals(scriptPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationCallContainer.class) {
			switch (derivedFeatureID) {
				case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS: return ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationCallContainer.class) {
			switch (baseFeatureID) {
				case ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS: return ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (scriptPath: ");
		result.append(scriptPath);
		result.append(')');
		return result.toString();
	}

} //JavaScriptProgramImpl
