/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.core.invocator.ArgumentsList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallContainer;

import com.google.common.base.Objects;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl#getEOperation <em>EOperation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl#getArgumentsList <em>Arguments List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl#getOperationCallContainer <em>Operation Call Container</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationCallImpl extends VariableFeatureReferenceImpl implements OperationCall
{
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
	 * The cached value of the '{@link #getEOperation() <em>EOperation</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEOperation()
	 * @generated
	 * @ordered
	 */
  protected EOperation eOperation;

  /**
	 * The cached value of the '{@link #getArgumentsList() <em>Arguments List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArgumentsList()
	 * @generated
	 * @ordered
	 */
  protected ArgumentsList argumentsList;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OperationCallImpl()
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
		return EMFEcoreInvocatorPackage.Literals.OPERATION_CALL;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION, oldDescription, description));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEOperation()
  {
		if (eOperation != null && eOperation.eIsProxy()) {
			InternalEObject oldEOperation = (InternalEObject)eOperation;
			eOperation = (EOperation)eResolveProxy(oldEOperation);
			if (eOperation != oldEOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.OPERATION_CALL__EOPERATION, oldEOperation, eOperation));
			}
		}
		return eOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation basicGetEOperation()
  {
		return eOperation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEOperation(EOperation newEOperation)
  {
		EOperation oldEOperation = eOperation;
		eOperation = newEOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL__EOPERATION, oldEOperation, eOperation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArgumentsList getArgumentsList()
  {
		return argumentsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetArgumentsList(ArgumentsList newArgumentsList, NotificationChain msgs)
  {
		ArgumentsList oldArgumentsList = argumentsList;
		argumentsList = newArgumentsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST, oldArgumentsList, newArgumentsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setArgumentsList(ArgumentsList newArgumentsList)
  {
		if (newArgumentsList != argumentsList) {
			NotificationChain msgs = null;
			if (argumentsList != null)
				msgs = ((InternalEObject)argumentsList).eInverseRemove(this, EMFEcoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL, ArgumentsList.class, msgs);
			if (newArgumentsList != null)
				msgs = ((InternalEObject)newArgumentsList).eInverseAdd(this, EMFEcoreInvocatorPackage.ARGUMENTS_LIST__OPERATION_CALL, ArgumentsList.class, msgs);
			msgs = basicSetArgumentsList(newArgumentsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST, newArgumentsList, newArgumentsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallContainer getOperationCallContainer()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER) return null;
		return (OperationCallContainer)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallContainer basicGetOperationCallContainer()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER) return null;
		return (OperationCallContainer)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOperationCallContainer(OperationCallContainer newOperationCallContainer, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newOperationCallContainer, EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOperationCallContainer(OperationCallContainer newOperationCallContainer)
  {
		if (newOperationCallContainer != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER && newOperationCallContainer != null)) {
			if (EcoreUtil.isAncestor(this, newOperationCallContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOperationCallContainer != null)
				msgs = ((InternalEObject)newOperationCallContainer).eInverseAdd(this, EMFEcoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS, OperationCallContainer.class, msgs);
			msgs = basicSetOperationCallContainer(newOperationCallContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER, newOperationCallContainer, newOperationCallContainer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession getInvocatorSession()
  {
		OperationCallContainer _operationCallContainer = this.getOperationCallContainer();
		boolean _equals = Objects.equal(_operationCallContainer, null);
		if (_equals) {
			return null;
		}
		else {
			OperationCallContainer _operationCallContainer_1 = this.getOperationCallContainer();
			return _operationCallContainer_1.getInvocatorSession();
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment getEnvironment()
  {
		InvocatorSession _invocatorSession = this.getInvocatorSession();
		boolean _equals = Objects.equal(_invocatorSession, null);
		if (_equals) {
			return null;
		}
		else {
			InvocatorSession _invocatorSession_1 = this.getInvocatorSession();
			return _invocatorSession_1.getEnvironment();
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
				if (argumentsList != null)
					msgs = ((InternalEObject)argumentsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST, null, msgs);
				return basicSetArgumentsList((ArgumentsList)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOperationCallContainer((OperationCallContainer)otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
				return basicSetArgumentsList(null, msgs);
			case EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER:
				return basicSetOperationCallContainer(null, msgs);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS, OperationCallContainer.class, msgs);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION:
				return getDescription();
			case EMFEcoreInvocatorPackage.OPERATION_CALL__EOPERATION:
				if (resolve) return getEOperation();
				return basicGetEOperation();
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
				return getArgumentsList();
			case EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER:
				if (resolve) return getOperationCallContainer();
				return basicGetOperationCallContainer();
			case EMFEcoreInvocatorPackage.OPERATION_CALL__INVOCATOR_SESSION:
				return getInvocatorSession();
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ENVIRONMENT:
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__EOPERATION:
				setEOperation((EOperation)newValue);
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
				setArgumentsList((ArgumentsList)newValue);
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER:
				setOperationCallContainer((OperationCallContainer)newValue);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__EOPERATION:
				setEOperation((EOperation)null);
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
				setArgumentsList((ArgumentsList)null);
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER:
				setOperationCallContainer((OperationCallContainer)null);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreInvocatorPackage.OPERATION_CALL__EOPERATION:
				return eOperation != null;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
				return argumentsList != null;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER:
				return basicGetOperationCallContainer() != null;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__INVOCATOR_SESSION:
				return getInvocatorSession() != null;
			case EMFEcoreInvocatorPackage.OPERATION_CALL__ENVIRONMENT:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return EMFEcoreInvocatorPackage.OPERATION_CALL__DESCRIPTION;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //OperationCallImpl
