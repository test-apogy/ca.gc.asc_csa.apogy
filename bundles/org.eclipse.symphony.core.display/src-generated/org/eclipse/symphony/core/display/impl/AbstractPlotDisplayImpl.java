/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.impl;


import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.core.display.AbstractPlotDisplay;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.HistoryData;
import org.eclipse.symphony.core.display.HistoryDataHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Plot Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.display.impl.AbstractPlotDisplayImpl#isRepeatLastValue <em>Repeat Last Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.display.impl.AbstractPlotDisplayImpl#isUseDataBuffering <em>Use Data Buffering</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.display.impl.AbstractPlotDisplayImpl#getHistoryLength <em>History Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPlotDisplayImpl extends AbstractFeatureDisplayImpl implements AbstractPlotDisplay
{
  /**
	 * The default value of the '{@link #isRepeatLastValue() <em>Repeat Last Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRepeatLastValue()
	 * @generated
	 * @ordered
	 */
  protected static final boolean REPEAT_LAST_VALUE_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isRepeatLastValue() <em>Repeat Last Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRepeatLastValue()
	 * @generated
	 * @ordered
	 */
  protected boolean repeatLastValue = REPEAT_LAST_VALUE_EDEFAULT;

  /**
	 * The default value of the '{@link #isUseDataBuffering() <em>Use Data Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isUseDataBuffering()
	 * @generated
	 * @ordered
	 */
  protected static final boolean USE_DATA_BUFFERING_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isUseDataBuffering() <em>Use Data Buffering</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isUseDataBuffering()
	 * @generated
	 * @ordered
	 */
  protected boolean useDataBuffering = USE_DATA_BUFFERING_EDEFAULT;

  /**
	 * The default value of the '{@link #getHistoryLength() <em>History Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHistoryLength()
	 * @generated
	 * @ordered
	 */
  protected static final double HISTORY_LENGTH_EDEFAULT = 60.0;

  /**
	 * The cached value of the '{@link #getHistoryLength() <em>History Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHistoryLength()
	 * @generated
	 * @ordered
	 */
  protected double historyLength = HISTORY_LENGTH_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractPlotDisplayImpl()
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
		return EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_PLOT_DISPLAY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isRepeatLastValue()
  {
		return repeatLastValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRepeatLastValue(boolean newRepeatLastValue)
  {
		boolean oldRepeatLastValue = repeatLastValue;
		repeatLastValue = newRepeatLastValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE, oldRepeatLastValue, repeatLastValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isUseDataBuffering()
  {
		return useDataBuffering;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setUseDataBuffering(boolean newUseDataBuffering)
  {
		boolean oldUseDataBuffering = useDataBuffering;
		useDataBuffering = newUseDataBuffering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING, oldUseDataBuffering, useDataBuffering));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getHistoryLength()
  {
		return historyLength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHistoryLength(double newHistoryLength)
  {
		double oldHistoryLength = historyLength;
		historyLength = newHistoryLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH, oldHistoryLength, historyLength));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HistoryData getHistoryData(Control control)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void applyHistoryData(Control control, HistoryData historyData)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE:
				return isRepeatLastValue();
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING:
				return isUseDataBuffering();
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH:
				return getHistoryLength();
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE:
				setRepeatLastValue((Boolean)newValue);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING:
				setUseDataBuffering((Boolean)newValue);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH:
				setHistoryLength((Double)newValue);
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE:
				setRepeatLastValue(REPEAT_LAST_VALUE_EDEFAULT);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING:
				setUseDataBuffering(USE_DATA_BUFFERING_EDEFAULT);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH:
				setHistoryLength(HISTORY_LENGTH_EDEFAULT);
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE:
				return repeatLastValue != REPEAT_LAST_VALUE_EDEFAULT;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING:
				return useDataBuffering != USE_DATA_BUFFERING_EDEFAULT;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH:
				return historyLength != HISTORY_LENGTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
		if (baseClass == HistoryDataHandler.class) {
			switch (baseOperationID) {
				case EMFEcoreInvocatorDisplayPackage.HISTORY_DATA_HANDLER___GET_HISTORY_DATA__CONTROL: return EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY___GET_HISTORY_DATA__CONTROL;
				case EMFEcoreInvocatorDisplayPackage.HISTORY_DATA_HANDLER___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA: return EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY___GET_HISTORY_DATA__CONTROL:
				return getHistoryData((Control)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA:
				applyHistoryData((Control)arguments.get(0), (HistoryData)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (repeatLastValue: ");
		result.append(repeatLastValue);
		result.append(", useDataBuffering: ");
		result.append(useDataBuffering);
		result.append(", historyLength: ");
		result.append(historyLength);
		result.append(')');
		return result.toString();
	}

} //AbstractPlotDisplayImpl
