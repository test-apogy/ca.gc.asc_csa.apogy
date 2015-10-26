/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.TypesList;
import org.eclipse.symphony.core.invocator.VariablesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl#getTypesList <em>Types List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl#getVariablesList <em>Variables List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl#getContextsList <em>Contexts List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EnvironmentImpl#getActiveContext <em>Active Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getTypesList() <em>Types List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypesList()
	 * @generated
	 * @ordered
	 */
  protected TypesList typesList;

  /**
	 * The cached value of the '{@link #getVariablesList() <em>Variables List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariablesList()
	 * @generated
	 * @ordered
	 */
  protected VariablesList variablesList;

  /**
	 * The cached value of the '{@link #getContextsList() <em>Contexts List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContextsList()
	 * @generated
	 * @ordered
	 */
  protected ContextsList contextsList;

  /**
	 * The cached value of the '{@link #getActiveContext() <em>Active Context</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActiveContext()
	 * @generated
	 * @ordered
	 */
  protected Context activeContext;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnvironmentImpl()
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
		return EMFEcoreInvocatorPackage.Literals.ENVIRONMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession getInvocatorSession()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession basicGetInvocatorSession()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInvocatorSession(InvocatorSession newInvocatorSession, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newInvocatorSession, EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInvocatorSession(InvocatorSession newInvocatorSession)
  {
		if (newInvocatorSession != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION && newInvocatorSession != null)) {
			if (EcoreUtil.isAncestor(this, newInvocatorSession))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvocatorSession != null)
				msgs = ((InternalEObject)newInvocatorSession).eInverseAdd(this, EMFEcoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT, InvocatorSession.class, msgs);
			msgs = basicSetInvocatorSession(newInvocatorSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION, newInvocatorSession, newInvocatorSession));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypesList getTypesList()
  {
		return typesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTypesList(TypesList newTypesList, NotificationChain msgs)
  {
		TypesList oldTypesList = typesList;
		typesList = newTypesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST, oldTypesList, newTypesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypesList(TypesList newTypesList)
  {
		if (newTypesList != typesList) {
			NotificationChain msgs = null;
			if (typesList != null)
				msgs = ((InternalEObject)typesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST, null, msgs);
			if (newTypesList != null)
				msgs = ((InternalEObject)newTypesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST, null, msgs);
			msgs = basicSetTypesList(newTypesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST, newTypesList, newTypesList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariablesList getVariablesList()
  {
		return variablesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariablesList(VariablesList newVariablesList, NotificationChain msgs)
  {
		VariablesList oldVariablesList = variablesList;
		variablesList = newVariablesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST, oldVariablesList, newVariablesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariablesList(VariablesList newVariablesList)
  {
		if (newVariablesList != variablesList) {
			NotificationChain msgs = null;
			if (variablesList != null)
				msgs = ((InternalEObject)variablesList).eInverseRemove(this, EMFEcoreInvocatorPackage.VARIABLES_LIST__ENVIRONMENT, VariablesList.class, msgs);
			if (newVariablesList != null)
				msgs = ((InternalEObject)newVariablesList).eInverseAdd(this, EMFEcoreInvocatorPackage.VARIABLES_LIST__ENVIRONMENT, VariablesList.class, msgs);
			msgs = basicSetVariablesList(newVariablesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST, newVariablesList, newVariablesList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextsList getContextsList()
  {
		return contextsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetContextsList(ContextsList newContextsList, NotificationChain msgs)
  {
		ContextsList oldContextsList = contextsList;
		contextsList = newContextsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST, oldContextsList, newContextsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContextsList(ContextsList newContextsList)
  {
		if (newContextsList != contextsList) {
			NotificationChain msgs = null;
			if (contextsList != null)
				msgs = ((InternalEObject)contextsList).eInverseRemove(this, EMFEcoreInvocatorPackage.CONTEXTS_LIST__ENVIRONMENT, ContextsList.class, msgs);
			if (newContextsList != null)
				msgs = ((InternalEObject)newContextsList).eInverseAdd(this, EMFEcoreInvocatorPackage.CONTEXTS_LIST__ENVIRONMENT, ContextsList.class, msgs);
			msgs = basicSetContextsList(newContextsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST, newContextsList, newContextsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context getActiveContext()
  {
		if (activeContext != null && activeContext.eIsProxy()) {
			InternalEObject oldActiveContext = (InternalEObject)activeContext;
			activeContext = (Context)eResolveProxy(oldActiveContext);
			if (activeContext != oldActiveContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT, oldActiveContext, activeContext));
			}
		}
		return activeContext;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context basicGetActiveContext()
  {
		return activeContext;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActiveContext(Context newActiveContext)
  {
		Context oldActiveContext = activeContext;
		activeContext = newActiveContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT, oldActiveContext, activeContext));
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
			case EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInvocatorSession((InvocatorSession)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				if (variablesList != null)
					msgs = ((InternalEObject)variablesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST, null, msgs);
				return basicSetVariablesList((VariablesList)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				if (contextsList != null)
					msgs = ((InternalEObject)contextsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST, null, msgs);
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
			case EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				return basicSetInvocatorSession(null, msgs);
			case EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST:
				return basicSetTypesList(null, msgs);
			case EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				return basicSetVariablesList(null, msgs);
			case EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				return basicSetContextsList(null, msgs);
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
			case EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT, InvocatorSession.class, msgs);
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
			case EMFEcoreInvocatorPackage.ENVIRONMENT__NAME:
				return getName();
			case EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				return getDescription();
			case EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				if (resolve) return getInvocatorSession();
				return basicGetInvocatorSession();
			case EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST:
				return getTypesList();
			case EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				return getVariablesList();
			case EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				return getContextsList();
			case EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				if (resolve) return getActiveContext();
				return basicGetActiveContext();
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
			case EMFEcoreInvocatorPackage.ENVIRONMENT__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)newValue);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST:
				setTypesList((TypesList)newValue);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				setVariablesList((VariablesList)newValue);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				setContextsList((ContextsList)newValue);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				setActiveContext((Context)newValue);
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
			case EMFEcoreInvocatorPackage.ENVIRONMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)null);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST:
				setTypesList((TypesList)null);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				setVariablesList((VariablesList)null);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				setContextsList((ContextsList)null);
				return;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				setActiveContext((Context)null);
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
			case EMFEcoreInvocatorPackage.ENVIRONMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreInvocatorPackage.ENVIRONMENT__INVOCATOR_SESSION:
				return basicGetInvocatorSession() != null;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__TYPES_LIST:
				return typesList != null;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST:
				return variablesList != null;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__CONTEXTS_LIST:
				return contextsList != null;
			case EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
				return activeContext != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return EMFEcoreInvocatorPackage.ENVIRONMENT__DESCRIPTION;
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
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
