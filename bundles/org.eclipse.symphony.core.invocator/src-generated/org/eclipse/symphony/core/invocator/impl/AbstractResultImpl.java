/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.AbstractResultValue;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.ResultsList;

import com.google.common.base.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl#getResultsList <em>Results List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.AbstractResultImpl#getResultValue <em>Result Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractResultImpl extends MinimalEObjectImpl.Container implements AbstractResult
{
  /**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
  protected static final Date TIME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
  protected Date time = TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
  protected Context context;

  /**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
  protected AbstractResultValue resultValue;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractResultImpl()
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
		return EMFEcoreInvocatorPackage.Literals.ABSTRACT_RESULT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getTime()
  {
		return time;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTime(Date newTime)
  {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME, oldTime, time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION, oldDescription, description));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsList getResultsList() {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST) return null;
		return (ResultsList)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsList basicGetResultsList() {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST) return null;
		return (ResultsList)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultsList(ResultsList newResultsList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResultsList, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultsList(ResultsList newResultsList) {
		if (newResultsList != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST && newResultsList != null)) {
			if (EcoreUtil.isAncestor(this, newResultsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResultsList != null)
				msgs = ((InternalEObject)newResultsList).eInverseAdd(this, EMFEcoreInvocatorPackage.RESULTS_LIST__RESULTS, ResultsList.class, msgs);
			msgs = basicSetResultsList(newResultsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST, newResultsList, newResultsList));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getInvocatorSession() {
		ResultsList _resultsList = this.getResultsList();
		boolean _equals = Objects.equal(_resultsList, null);
		if (_equals) {
			return null;
		}
		else {
			ResultsList _resultsList_1 = this.getResultsList();
			return _resultsList_1.getInvocatorSession();
		}
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context getContext()
  {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Context)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Context basicGetContext()
  {
		return context;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContext(Context newContext)
  {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT, oldContext, context));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractResultValue getResultValue()
  {
		return resultValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetResultValue(AbstractResultValue newResultValue, NotificationChain msgs)
  {
		AbstractResultValue oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE, oldResultValue, newResultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResultValue(AbstractResultValue newResultValue)
  {
		if (newResultValue != resultValue) {
			NotificationChain msgs = null;
			if (resultValue != null)
				msgs = ((InternalEObject)resultValue).eInverseRemove(this, EMFEcoreInvocatorPackage.ABSTRACT_RESULT_VALUE__RESULT, AbstractResultValue.class, msgs);
			if (newResultValue != null)
				msgs = ((InternalEObject)newResultValue).eInverseAdd(this, EMFEcoreInvocatorPackage.ABSTRACT_RESULT_VALUE__RESULT, AbstractResultValue.class, msgs);
			msgs = basicSetResultValue(newResultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE, newResultValue, newResultValue));
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
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetResultsList((ResultsList)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE:
				if (resultValue != null)
					msgs = ((InternalEObject)resultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE, null, msgs);
				return basicSetResultValue((AbstractResultValue)otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST:
				return basicSetResultsList(null, msgs);
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE:
				return basicSetResultValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.RESULTS_LIST__RESULTS, ResultsList.class, msgs);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME:
				return getTime();
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION:
				return getDescription();
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST:
				if (resolve) return getResultsList();
				return basicGetResultsList();
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__INVOCATOR_SESSION:
				return getInvocatorSession();
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE:
				return getResultValue();
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
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME:
				setTime((Date)newValue);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST:
				setResultsList((ResultsList)newValue);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT:
				setContext((Context)newValue);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE:
				setResultValue((AbstractResultValue)newValue);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST:
				setResultsList((ResultsList)null);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT:
				setContext((Context)null);
				return;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE:
				setResultValue((AbstractResultValue)null);
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
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST:
				return basicGetResultsList() != null;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__INVOCATOR_SESSION:
				return getInvocatorSession() != null;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT:
				return context != null;
			case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE:
				return resultValue != null;
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
				case EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AbstractResultImpl
