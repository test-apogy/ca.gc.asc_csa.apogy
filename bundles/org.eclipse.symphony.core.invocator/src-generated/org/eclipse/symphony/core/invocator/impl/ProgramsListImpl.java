/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.Program;
import org.eclipse.symphony.core.invocator.ProgramsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programs List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ProgramsListImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ProgramsListImpl#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramsListImpl extends MinimalEObjectImpl.Container implements ProgramsList
{
  /**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
  protected EList<Program> programs;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ProgramsListImpl()
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
		return EMFEcoreInvocatorPackage.Literals.PROGRAMS_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession getInvocatorSession()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession basicGetInvocatorSession()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInvocatorSession(InvocatorSession newInvocatorSession, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newInvocatorSession, EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInvocatorSession(InvocatorSession newInvocatorSession)
  {
		if (newInvocatorSession != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION && newInvocatorSession != null)) {
			if (EcoreUtil.isAncestor(this, newInvocatorSession))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvocatorSession != null)
				msgs = ((InternalEObject)newInvocatorSession).eInverseAdd(this, EMFEcoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST, InvocatorSession.class, msgs);
			msgs = basicSetInvocatorSession(newInvocatorSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION, newInvocatorSession, newInvocatorSession));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Program> getPrograms()
  {
		if (programs == null) {
			programs = new EObjectContainmentWithInverseEList<Program>(Program.class, this, EMFEcoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS, EMFEcoreInvocatorPackage.PROGRAM__PROGRAMS_LIST);
		}
		return programs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInvocatorSession((InvocatorSession)otherEnd, msgs);
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrograms()).basicAdd(otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				return basicSetInvocatorSession(null, msgs);
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.INVOCATOR_SESSION__PROGRAMS_LIST, InvocatorSession.class, msgs);
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
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				if (resolve) return getInvocatorSession();
				return basicGetInvocatorSession();
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS:
				return getPrograms();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)newValue);
				return;
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends Program>)newValue);
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
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)null);
				return;
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS:
				getPrograms().clear();
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
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__INVOCATOR_SESSION:
				return basicGetInvocatorSession() != null;
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST__PROGRAMS:
				return programs != null && !programs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramsListImpl
