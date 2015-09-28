/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.AbstractChannelImpl;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.FixedPeriodValues;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl.ChannelImpl#getRecordingPolicy <em>Recording Policy</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl.ChannelImpl#getFixedPeriodValues <em>Fixed Period Values</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl.ChannelImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelImpl extends AbstractChannelImpl implements Channel
{
  /**
	 * The default value of the '{@link #getRecordingPolicy() <em>Recording Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final RecordingPolicy RECORDING_POLICY_EDEFAULT = RecordingPolicy.ON_CHANGE;

	/**
	 * The cached value of the '{@link #getRecordingPolicy() <em>Recording Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordingPolicy()
	 * @generated
	 * @ordered
	 */
	protected RecordingPolicy recordingPolicy = RECORDING_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedPeriodValues() <em>Fixed Period Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPeriodValues()
	 * @generated
	 * @ordered
	 */
	protected static final FixedPeriodValues FIXED_PERIOD_VALUES_EDEFAULT = FixedPeriodValues.VERY_LONG_INTERVAL;

	/**
	 * The cached value of the '{@link #getFixedPeriodValues() <em>Fixed Period Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPeriodValues()
	 * @generated
	 * @ordered
	 */
	protected FixedPeriodValues fixedPeriodValues = FIXED_PERIOD_VALUES_EDEFAULT;

		/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
  protected AbstractFeatureNode feature;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ChannelImpl()
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
		return EMFEcoreInvocatorRecordingsPackage.Literals.CHANNEL;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordingPolicy getRecordingPolicy() {
		return recordingPolicy;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordingPolicy(RecordingPolicy newRecordingPolicy) {
		RecordingPolicy oldRecordingPolicy = recordingPolicy;
		recordingPolicy = newRecordingPolicy == null ? RECORDING_POLICY_EDEFAULT : newRecordingPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.CHANNEL__RECORDING_POLICY, oldRecordingPolicy, recordingPolicy));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPeriodValues getFixedPeriodValues() {
		return fixedPeriodValues;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPeriodValues(FixedPeriodValues newFixedPeriodValues) {
		FixedPeriodValues oldFixedPeriodValues = fixedPeriodValues;
		fixedPeriodValues = newFixedPeriodValues == null ? FIXED_PERIOD_VALUES_EDEFAULT : newFixedPeriodValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.CHANNEL__FIXED_PERIOD_VALUES, oldFixedPeriodValues, fixedPeriodValues));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureNode getFeature()
  {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (AbstractFeatureNode)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorRecordingsPackage.CHANNEL__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureNode basicGetFeature()
  {
		return feature;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFeature(AbstractFeatureNode newFeature)
  {
		AbstractFeatureNode oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.CHANNEL__FEATURE, oldFeature, feature));
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
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__RECORDING_POLICY:
				return getRecordingPolicy();
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FIXED_PERIOD_VALUES:
				return getFixedPeriodValues();
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
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
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__RECORDING_POLICY:
				setRecordingPolicy((RecordingPolicy)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FIXED_PERIOD_VALUES:
				setFixedPeriodValues((FixedPeriodValues)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FEATURE:
				setFeature((AbstractFeatureNode)newValue);
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
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__RECORDING_POLICY:
				setRecordingPolicy(RECORDING_POLICY_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FIXED_PERIOD_VALUES:
				setFixedPeriodValues(FIXED_PERIOD_VALUES_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FEATURE:
				setFeature((AbstractFeatureNode)null);
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
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__RECORDING_POLICY:
				return recordingPolicy != RECORDING_POLICY_EDEFAULT;
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FIXED_PERIOD_VALUES:
				return fixedPeriodValues != FIXED_PERIOD_VALUES_EDEFAULT;
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FEATURE:
				return feature != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (recordingPolicy: ");
		result.append(recordingPolicy);
		result.append(", fixedPeriodValues: ");
		result.append(fixedPeriodValues);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
