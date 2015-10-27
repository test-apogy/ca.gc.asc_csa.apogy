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
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.Program;
import org.eclipse.symphony.core.invocator.ProgramsList;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ValuesList;

import com.google.common.base.Objects;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ProgramImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ProgramImpl#getProgramsList <em>Programs List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ProgramImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ProgramImpl#getValuesList <em>Values List</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProgramImpl extends MinimalEObjectImpl.Container implements Program
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
	 * The cached value of the '{@link #getValuesList() <em>Values List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesList()
	 * @generated
	 * @ordered
	 */
	protected ValuesList valuesList;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ProgramImpl()
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
		return Symphony__CoreInvocatorPackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.PROGRAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.PROGRAM__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProgramsList getProgramsList()
  {
		if (eContainerFeatureID() != Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST) return null;
		return (ProgramsList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProgramsList basicGetProgramsList()
  {
		if (eContainerFeatureID() != Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST) return null;
		return (ProgramsList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetProgramsList(ProgramsList newProgramsList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newProgramsList, Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setProgramsList(ProgramsList newProgramsList)
  {
		if (newProgramsList != eInternalContainer() || (eContainerFeatureID() != Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST && newProgramsList != null)) {
			if (EcoreUtil.isAncestor(this, newProgramsList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramsList != null)
				msgs = ((InternalEObject)newProgramsList).eInverseAdd(this, Symphony__CoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS, ProgramsList.class, msgs);
			msgs = basicSetProgramsList(newProgramsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST, newProgramsList, newProgramsList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession getInvocatorSession()
  {
		ProgramsList _programsList = this.getProgramsList();
		boolean _equals = Objects.equal(_programsList, null);
		if (_equals) {
			return null;
		}
		else {
			ProgramsList _programsList_1 = this.getProgramsList();
			return _programsList_1.getInvocatorSession();
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesList getValuesList() {
		return valuesList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuesList(ValuesList newValuesList, NotificationChain msgs) {
		ValuesList oldValuesList = valuesList;
		valuesList = newValuesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST, oldValuesList, newValuesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesList(ValuesList newValuesList) {
		if (newValuesList != valuesList) {
			NotificationChain msgs = null;
			if (valuesList != null)
				msgs = ((InternalEObject)valuesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST, null, msgs);
			if (newValuesList != null)
				msgs = ((InternalEObject)newValuesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST, null, msgs);
			msgs = basicSetValuesList(newValuesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST, newValuesList, newValuesList));
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
			case Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramsList((ProgramsList)otherEnd, msgs);
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
			case Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST:
				return basicSetProgramsList(null, msgs);
			case Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST:
				return basicSetValuesList(null, msgs);
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
			case Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST:
				return eInternalContainer().eInverseRemove(this, Symphony__CoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS, ProgramsList.class, msgs);
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
			case Symphony__CoreInvocatorPackage.PROGRAM__NAME:
				return getName();
			case Symphony__CoreInvocatorPackage.PROGRAM__DESCRIPTION:
				return getDescription();
			case Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST:
				if (resolve) return getProgramsList();
				return basicGetProgramsList();
			case Symphony__CoreInvocatorPackage.PROGRAM__INVOCATOR_SESSION:
				return getInvocatorSession();
			case Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST:
				return getValuesList();
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
			case Symphony__CoreInvocatorPackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case Symphony__CoreInvocatorPackage.PROGRAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST:
				setProgramsList((ProgramsList)newValue);
				return;
			case Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST:
				setValuesList((ValuesList)newValue);
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
			case Symphony__CoreInvocatorPackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__CoreInvocatorPackage.PROGRAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST:
				setProgramsList((ProgramsList)null);
				return;
			case Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST:
				setValuesList((ValuesList)null);
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
			case Symphony__CoreInvocatorPackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__CoreInvocatorPackage.PROGRAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__CoreInvocatorPackage.PROGRAM__PROGRAMS_LIST:
				return basicGetProgramsList() != null;
			case Symphony__CoreInvocatorPackage.PROGRAM__INVOCATOR_SESSION:
				return getInvocatorSession() != null;
			case Symphony__CoreInvocatorPackage.PROGRAM__VALUES_LIST:
				return valuesList != null;
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
				case Symphony__CoreInvocatorPackage.PROGRAM__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return Symphony__CoreInvocatorPackage.PROGRAM__DESCRIPTION;
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

} //ProgramImpl
