/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.HistoryData;
import org.eclipse.symphony.core.display.HistoryDataHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Data Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class HistoryDataHandlerImpl extends MinimalEObjectImpl.Container implements HistoryDataHandler
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected HistoryDataHandlerImpl()
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
		return EMFEcoreInvocatorDisplayPackage.Literals.HISTORY_DATA_HANDLER;
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case EMFEcoreInvocatorDisplayPackage.HISTORY_DATA_HANDLER___GET_HISTORY_DATA__CONTROL:
				return getHistoryData((Control)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.HISTORY_DATA_HANDLER___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA:
				applyHistoryData((Control)arguments.get(0), (HistoryData)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //HistoryDataHandlerImpl
