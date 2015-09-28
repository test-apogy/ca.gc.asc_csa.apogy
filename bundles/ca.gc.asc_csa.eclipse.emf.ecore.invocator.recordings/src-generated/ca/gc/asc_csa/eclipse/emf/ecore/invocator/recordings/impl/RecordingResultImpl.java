/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.AbstractResultImpl;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingTrack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recording Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl.RecordingResultImpl#getRecordingTrack <em>Recording Track</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordingResultImpl extends AbstractResultImpl implements RecordingResult
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RecordingResultImpl()
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
		return EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING_RESULT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingTrack getRecordingTrack()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK) return null;
		return (RecordingTrack)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingTrack basicGetRecordingTrack()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK) return null;
		return (RecordingTrack)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRecordingTrack(RecordingTrack newRecordingTrack, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newRecordingTrack, EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRecordingTrack(RecordingTrack newRecordingTrack)
  {
		if (newRecordingTrack != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK && newRecordingTrack != null)) {
			if (EcoreUtil.isAncestor(this, newRecordingTrack))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRecordingTrack != null)
				msgs = ((InternalEObject)newRecordingTrack).eInverseAdd(this, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS, RecordingTrack.class, msgs);
			msgs = basicSetRecordingTrack(newRecordingTrack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK, newRecordingTrack, newRecordingTrack));
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRecordingTrack((RecordingTrack)otherEnd, msgs);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				return basicSetRecordingTrack(null, msgs);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS, RecordingTrack.class, msgs);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				if (resolve) return getRecordingTrack();
				return basicGetRecordingTrack();
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				setRecordingTrack((RecordingTrack)newValue);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				setRecordingTrack((RecordingTrack)null);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK:
				return basicGetRecordingTrack() != null;
		}
		return super.eIsSet(featureID);
	}

} //RecordingResultImpl
