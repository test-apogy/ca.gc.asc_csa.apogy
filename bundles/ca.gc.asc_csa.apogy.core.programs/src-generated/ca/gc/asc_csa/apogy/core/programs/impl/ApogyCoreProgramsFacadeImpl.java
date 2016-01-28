/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.programs.Symphony__CoreProgramsPackage;
import org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsFacadeImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsFacadeImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Symphony__CoreProgramsFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CoreProgramsFacade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CoreProgramsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreProgramsPackage.Literals.SYMPHONY_CORE_PROGRAMS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getSession() {
		InvocatorSession session = basicGetSession();
		return session != null && session.eIsProxy() ? (InvocatorSession)eResolveProxy((InternalEObject)session) : session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession basicGetSession() {
		// TODO: implement this method to return the 'Session' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		// TODO: implement this method to return the 'Variables' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object exec(OperationCall operationCall) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CoreProgramsPackage.SYMPHONY_CORE_PROGRAMS_FACADE__SESSION:
				if (resolve) return getSession();
				return basicGetSession();
			case Symphony__CoreProgramsPackage.SYMPHONY_CORE_PROGRAMS_FACADE__VARIABLES:
				return getVariables();
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
			case Symphony__CoreProgramsPackage.SYMPHONY_CORE_PROGRAMS_FACADE__SESSION:
				return basicGetSession() != null;
			case Symphony__CoreProgramsPackage.SYMPHONY_CORE_PROGRAMS_FACADE__VARIABLES:
				return !getVariables().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CoreProgramsPackage.SYMPHONY_CORE_PROGRAMS_FACADE___EXEC__OPERATIONCALL:
				try {
					return exec((OperationCall)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CoreProgramsFacadeImpl
