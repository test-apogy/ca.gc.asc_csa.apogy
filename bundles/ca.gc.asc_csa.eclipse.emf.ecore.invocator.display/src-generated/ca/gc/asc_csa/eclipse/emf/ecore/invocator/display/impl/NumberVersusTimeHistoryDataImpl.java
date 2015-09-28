/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl;

import java.util.SortedMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.NumberVersusTimeHistoryData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Versus Time History Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl.NumberVersusTimeHistoryDataImpl#getHistoryData <em>History Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberVersusTimeHistoryDataImpl extends HistoryDataImpl implements NumberVersusTimeHistoryData
{
  /**
	 * The cached value of the '{@link #getHistoryData() <em>History Data</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHistoryData()
	 * @generated
	 * @ordered
	 */
  protected SortedMap<Long, Number> historyData;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NumberVersusTimeHistoryDataImpl()
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
		return EMFEcoreInvocatorDisplayPackage.Literals.NUMBER_VERSUS_TIME_HISTORY_DATA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedMap<Long, Number> getHistoryData()
  {
		return historyData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHistoryData(SortedMap<Long, Number> newHistoryData)
  {
		SortedMap<Long, Number> oldHistoryData = historyData;
		historyData = newHistoryData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA, oldHistoryData, historyData));
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
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA:
				return getHistoryData();
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
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA:
				setHistoryData((SortedMap<Long, Number>)newValue);
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
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA:
				setHistoryData((SortedMap<Long, Number>)null);
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
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA:
				return historyData != null;
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
		result.append(" (historyData: ");
		result.append(historyData);
		result.append(')');
		return result.toString();
	}

} //NumberVersusTimeHistoryDataImpl
