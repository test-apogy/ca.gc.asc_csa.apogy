/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;

import com.google.common.base.Objects;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl#getVariablesList <em>Variables List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.VariableImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
  protected Type variableType;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected VariableImpl()
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
		return ApogyCoreInvocatorPackage.Literals.VARIABLE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariablesList getVariablesList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST) return null;
		return (VariablesList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariablesList basicGetVariablesList()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST) return null;
		return (VariablesList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariablesList(VariablesList newVariablesList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newVariablesList, ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariablesList(VariablesList newVariablesList)
  {
		if (newVariablesList != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST && newVariablesList != null)) {
			if (EcoreUtil.isAncestor(this, newVariablesList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariablesList != null)
				msgs = ((InternalEObject)newVariablesList).eInverseAdd(this, ApogyCoreInvocatorPackage.VARIABLES_LIST__VARIABLES, VariablesList.class, msgs);
			msgs = basicSetVariablesList(newVariablesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST, newVariablesList, newVariablesList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Type getVariableType()
  {
		if (variableType != null && variableType.eIsProxy()) {
			InternalEObject oldVariableType = (InternalEObject)variableType;
			variableType = (Type)eResolveProxy(oldVariableType);
			if (variableType != oldVariableType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.VARIABLE__VARIABLE_TYPE, oldVariableType, variableType));
			}
		}
		return variableType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Type basicGetVariableType()
  {
		return variableType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableType(Type newVariableType)
  {
		Type oldVariableType = variableType;
		variableType = newVariableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.VARIABLE__VARIABLE_TYPE, oldVariableType, variableType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment getEnvironment()
  {
		VariablesList _variablesList = this.getVariablesList();
		boolean _equals = Objects.equal(_variablesList, null);
		if (_equals) {
			return null;
		}
		else {
			VariablesList _variablesList_1 = this.getVariablesList();
			return _variablesList_1.getEnvironment();
		}
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
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariablesList((VariablesList)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST:
				return basicSetVariablesList(null, msgs);
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
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.VARIABLES_LIST__VARIABLES, VariablesList.class, msgs);
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
			case ApogyCoreInvocatorPackage.VARIABLE__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST:
				if (resolve) return getVariablesList();
				return basicGetVariablesList();
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLE_TYPE:
				if (resolve) return getVariableType();
				return basicGetVariableType();
			case ApogyCoreInvocatorPackage.VARIABLE__ENVIRONMENT:
				return getEnvironment();
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
			case ApogyCoreInvocatorPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST:
				setVariablesList((VariablesList)newValue);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLE_TYPE:
				setVariableType((Type)newValue);
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
			case ApogyCoreInvocatorPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST:
				setVariablesList((VariablesList)null);
				return;
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLE_TYPE:
				setVariableType((Type)null);
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
			case ApogyCoreInvocatorPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLES_LIST:
				return basicGetVariablesList() != null;
			case ApogyCoreInvocatorPackage.VARIABLE__VARIABLE_TYPE:
				return variableType != null;
			case ApogyCoreInvocatorPackage.VARIABLE__ENVIRONMENT:
				return getEnvironment() != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
