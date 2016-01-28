/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.DataProductsList;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.invocator.VariableImplementationsList;

import com.google.common.base.Objects;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ContextImpl#getContextsList <em>Contexts List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ContextImpl#getVariableImplementationsList <em>Variable Implementations List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ContextImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ContextImpl#getDataProductsList <em>Data Products List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ContextImpl#getInstancesCreationDate <em>Instances Creation Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ContextImpl#getInstancesDisposalDate <em>Instances Disposal Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContextImpl extends MinimalEObjectImpl.Container implements Context
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
	 * The cached value of the '{@link #getVariableImplementationsList() <em>Variable Implementations List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableImplementationsList()
	 * @generated
	 * @ordered
	 */
  protected VariableImplementationsList variableImplementationsList;

  /**
	 * The cached value of the '{@link #getDataProductsList() <em>Data Products List</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataProductsList()
	 * @generated
	 * @ordered
	 */
  protected DataProductsList dataProductsList;

  /**
	 * The default value of the '{@link #getInstancesCreationDate() <em>Instances Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesCreationDate()
	 * @generated
	 * @ordered
	 */
  protected static final Date INSTANCES_CREATION_DATE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getInstancesCreationDate() <em>Instances Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesCreationDate()
	 * @generated
	 * @ordered
	 */
  protected Date instancesCreationDate = INSTANCES_CREATION_DATE_EDEFAULT;

  /**
	 * The default value of the '{@link #getInstancesDisposalDate() <em>Instances Disposal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesDisposalDate()
	 * @generated
	 * @ordered
	 */
  protected static final Date INSTANCES_DISPOSAL_DATE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getInstancesDisposalDate() <em>Instances Disposal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInstancesDisposalDate()
	 * @generated
	 * @ordered
	 */
  protected Date instancesDisposalDate = INSTANCES_DISPOSAL_DATE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ContextImpl()
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
		return Symphony__CoreInvocatorPackage.Literals.CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.CONTEXT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextsList getContextsList()
  {
		if (eContainerFeatureID() != Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST) return null;
		return (ContextsList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextsList basicGetContextsList()
  {
		if (eContainerFeatureID() != Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST) return null;
		return (ContextsList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetContextsList(ContextsList newContextsList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newContextsList, Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContextsList(ContextsList newContextsList)
  {
		if (newContextsList != eInternalContainer() || (eContainerFeatureID() != Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST && newContextsList != null)) {
			if (EcoreUtil.isAncestor(this, newContextsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContextsList != null)
				msgs = ((InternalEObject)newContextsList).eInverseAdd(this, Symphony__CoreInvocatorPackage.CONTEXTS_LIST__CONTEXTS, ContextsList.class, msgs);
			msgs = basicSetContextsList(newContextsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST, newContextsList, newContextsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationsList getVariableImplementationsListGen()
  {
		return variableImplementationsList;
	}

  /**
   * @generated_NOT
   */
  public VariableImplementationsList getVariableImplementationsList()
  {
	  VariableImplementationsList list = getVariableImplementationsListGen();
	  if (list == null){
		  list = Symphony__CoreInvocatorFactory.eINSTANCE.createVariableImplementationsList();
		  setVariableImplementationsList(list);
		  
		  /**
		   * Instantiate the variable implementations.
		   */
		  Iterator<Variable> variables = getEnvironment().getVariablesList().getVariables().iterator();
		  while (variables.hasNext()){
			  Variable variable = variables.next();
			  VariableImplementation variableImplementation = Symphony__CoreInvocatorFactory.eINSTANCE.createVariableImplementation();
			  variableImplementation.setVariable(variable);
			  
			  /** Create TypeMemberImplementations. */
			  variableImplementation.getTypeMemberImplementations().addAll(Symphony__CoreInvocatorFacade.INSTANCE.createTypeMemberImplementations(variable.getVariableType()));			  
			  
			  list.getVariableImplementations().add(variableImplementation);
		  }
	  }
    return list;
  }
    
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariableImplementationsList(VariableImplementationsList newVariableImplementationsList, NotificationChain msgs)
  {
		VariableImplementationsList oldVariableImplementationsList = variableImplementationsList;
		variableImplementationsList = newVariableImplementationsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, oldVariableImplementationsList, newVariableImplementationsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableImplementationsList(VariableImplementationsList newVariableImplementationsList)
  {
		if (newVariableImplementationsList != variableImplementationsList) {
			NotificationChain msgs = null;
			if (variableImplementationsList != null)
				msgs = ((InternalEObject)variableImplementationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, null, msgs);
			if (newVariableImplementationsList != null)
				msgs = ((InternalEObject)newVariableImplementationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, null, msgs);
			msgs = basicSetVariableImplementationsList(newVariableImplementationsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST, newVariableImplementationsList, newVariableImplementationsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment getEnvironment()
  {
		ContextsList _contextsList = this.getContextsList();
		boolean _equals = Objects.equal(_contextsList, null);
		if (_equals) {
			return null;
		}
		else {
			ContextsList _contextsList_1 = this.getContextsList();
			return _contextsList_1.getEnvironment();
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsList getDataProductsList()
  {
		if (dataProductsList != null && dataProductsList.eIsProxy()) {
			InternalEObject oldDataProductsList = (InternalEObject)dataProductsList;
			dataProductsList = (DataProductsList)eResolveProxy(oldDataProductsList);
			if (dataProductsList != oldDataProductsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST, oldDataProductsList, dataProductsList));
			}
		}
		return dataProductsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsList basicGetDataProductsList()
  {
		return dataProductsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataProductsList(DataProductsList newDataProductsList)
  {
		DataProductsList oldDataProductsList = dataProductsList;
		dataProductsList = newDataProductsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST, oldDataProductsList, dataProductsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getInstancesCreationDate()
  {
		return instancesCreationDate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstancesCreationDate(Date newInstancesCreationDate)
  {
		Date oldInstancesCreationDate = instancesCreationDate;
		instancesCreationDate = newInstancesCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE, oldInstancesCreationDate, instancesCreationDate));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getInstancesDisposalDate()
  {
		return instancesDisposalDate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstancesDisposalDate(Date newInstancesDisposalDate)
  {
		Date oldInstancesDisposalDate = instancesDisposalDate;
		instancesDisposalDate = newInstancesDisposalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE, oldInstancesDisposalDate, instancesDisposalDate));
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
			case Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContextsList((ContextsList)otherEnd, msgs);
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
			case Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				return basicSetContextsList(null, msgs);
			case Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
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
			case Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				return eInternalContainer().eInverseRemove(this, Symphony__CoreInvocatorPackage.CONTEXTS_LIST__CONTEXTS, ContextsList.class, msgs);
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
			case Symphony__CoreInvocatorPackage.CONTEXT__NAME:
				return getName();
			case Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				if (resolve) return getContextsList();
				return basicGetContextsList();
			case Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				return getVariableImplementationsList();
			case Symphony__CoreInvocatorPackage.CONTEXT__ENVIRONMENT:
				return getEnvironment();
			case Symphony__CoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				if (resolve) return getDataProductsList();
				return basicGetDataProductsList();
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				return getInstancesCreationDate();
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				return getInstancesDisposalDate();
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
			case Symphony__CoreInvocatorPackage.CONTEXT__NAME:
				setName((String)newValue);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				setContextsList((ContextsList)newValue);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)newValue);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)newValue);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				setInstancesCreationDate((Date)newValue);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				setInstancesDisposalDate((Date)newValue);
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
			case Symphony__CoreInvocatorPackage.CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				setContextsList((ContextsList)null);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				setVariableImplementationsList((VariableImplementationsList)null);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				setDataProductsList((DataProductsList)null);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				setInstancesCreationDate(INSTANCES_CREATION_DATE_EDEFAULT);
				return;
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				setInstancesDisposalDate(INSTANCES_DISPOSAL_DATE_EDEFAULT);
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
			case Symphony__CoreInvocatorPackage.CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__CoreInvocatorPackage.CONTEXT__CONTEXTS_LIST:
				return basicGetContextsList() != null;
			case Symphony__CoreInvocatorPackage.CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST:
				return variableImplementationsList != null;
			case Symphony__CoreInvocatorPackage.CONTEXT__ENVIRONMENT:
				return getEnvironment() != null;
			case Symphony__CoreInvocatorPackage.CONTEXT__DATA_PRODUCTS_LIST:
				return dataProductsList != null;
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:
				return INSTANCES_CREATION_DATE_EDEFAULT == null ? instancesCreationDate != null : !INSTANCES_CREATION_DATE_EDEFAULT.equals(instancesCreationDate);
			case Symphony__CoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE:
				return INSTANCES_DISPOSAL_DATE_EDEFAULT == null ? instancesDisposalDate != null : !INSTANCES_DISPOSAL_DATE_EDEFAULT.equals(instancesDisposalDate);
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
		result.append(", instancesCreationDate: ");
		result.append(instancesCreationDate);
		result.append(", instancesDisposalDate: ");
		result.append(instancesDisposalDate);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
