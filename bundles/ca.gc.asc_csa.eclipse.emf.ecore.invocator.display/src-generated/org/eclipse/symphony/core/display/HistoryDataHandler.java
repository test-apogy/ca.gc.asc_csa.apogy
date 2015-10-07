/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Control;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Data Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a class that handles history data.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#getHistoryDataHandler()
 * @model abstract="true"
 * @generated
 */
public interface HistoryDataHandler extends EObject
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" controlDataType="org.eclipse.symphony.core.display.Control" controlUnique="false"
	 * @generated
	 */
  HistoryData getHistoryData(Control control);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model controlDataType="org.eclipse.symphony.core.display.Control" controlUnique="false" historyDataUnique="false"
	 * @generated
	 */
  void applyHistoryData(Control control, HistoryData historyData);

} // HistoryDataHandler
