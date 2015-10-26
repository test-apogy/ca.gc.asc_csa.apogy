/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.invocator.VariableImplementationsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.VariableImplementationImpl#getVariableImplementationsList <em>Variable Implementations List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.VariableImplementationImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImplementationImpl extends AbstractTypeImplementationImpl implements VariableImplementation
{
  /**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
  protected Variable variable;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableImplementationImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreInvocatorPackage.Literals.VARIABLE_IMPLEMENTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationsList getVariableImplementationsList()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST) return null;
		return (VariableImplementationsList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationsList basicGetVariableImplementationsList()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST) return null;
		return (VariableImplementationsList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariableImplementationsList(VariableImplementationsList newVariableImplementationsList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newVariableImplementationsList, EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableImplementationsList(VariableImplementationsList newVariableImplementationsList)
  {
		if (newVariableImplementationsList != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST && newVariableImplementationsList != null)) {
			if (EcoreUtil.isAncestor(this, newVariableImplementationsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableImplementationsList != null)
				msgs = ((InternalEObject)newVariableImplementationsList).eInverseAdd(this, EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS, VariableImplementationsList.class, msgs);
			msgs = basicSetVariableImplementationsList(newVariableImplementationsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST, newVariableImplementationsList, newVariableImplementationsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable getVariable()
  {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable basicGetVariable()
  {
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariable(Variable newVariable)
  {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE, oldVariable, variable));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Type basicGetHandlingType()
  {
	  return getVariable() == null ? null : getVariable().getVariableType();
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableImplementationsList((VariableImplementationsList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				return basicSetVariableImplementationsList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS, VariableImplementationsList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				if (resolve) return getVariableImplementationsList();
				return basicGetVariableImplementationsList();
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)newValue);
				return;
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				setVariable((Variable)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)null);
				return;
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				setVariable((Variable)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST:
				return basicGetVariableImplementationsList() != null;
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableImplementationImpl
