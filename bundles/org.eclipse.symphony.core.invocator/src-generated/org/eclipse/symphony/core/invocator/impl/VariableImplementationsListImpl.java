/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.invocator.VariableImplementationsList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Implementations List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.VariableImplementationsListImpl#getVariableImplementations <em>Variable Implementations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImplementationsListImpl extends
		MinimalEObjectImpl.Container implements VariableImplementationsList {
	/**
	 * The cached value of the '{@link #getVariableImplementations()
	 * <em>Variable Implementations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVariableImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableImplementation> variableImplementations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImplementationsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreInvocatorPackage.Literals.VARIABLE_IMPLEMENTATIONS_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<VariableImplementation> getVariableImplementations() {
		if (variableImplementations == null) {
			variableImplementations = new EObjectContainmentWithInverseEList<VariableImplementation>(
					VariableImplementation.class,
					this,
					EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS,
					EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST);
		}
		return variableImplementations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public VariableImplementation getVariableImplementation(Variable variable) {
		VariableImplementation result = null;
		Iterator<VariableImplementation> implementations = getVariableImplementations()
				.iterator();

		while (implementations.hasNext() && result == null) {
			VariableImplementation implementation = implementations.next();
			if (implementation.getVariable() == variable) {
				result = implementation;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public VariableImplementation getVariableImplementation(String name) {
		VariableImplementation result = null;

		Iterator<VariableImplementation> iterator = getVariableImplementations()
				.iterator();
		while (iterator.hasNext() && result == null) {
			VariableImplementation current = iterator.next();

			if (current.getVariable().getName().equals(name)) {
				result = current;
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariableImplementations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS:
				return ((InternalEList<?>)getVariableImplementations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS:
				return getVariableImplementations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS:
				getVariableImplementations().clear();
				getVariableImplementations().addAll((Collection<? extends VariableImplementation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS:
				getVariableImplementations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS:
				return variableImplementations != null && !variableImplementations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__VARIABLE:
				return getVariableImplementation((Variable)arguments.get(0));
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__STRING:
				return getVariableImplementation((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // VariableImplementationsListImpl