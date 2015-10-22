/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display;

import java.util.SortedMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Versus Time History Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specialized case of History data that contains a Map of Time,Number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.display.NumberVersusTimeHistoryData#getHistoryData <em>History Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#getNumberVersusTimeHistoryData()
 * @model
 * @generated
 */
public interface NumberVersusTimeHistoryData extends HistoryData
{
  /**
	 * Returns the value of the '<em><b>History Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>History Data</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>History Data</em>' attribute.
	 * @see #setHistoryData(SortedMap)
	 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#getNumberVersusTimeHistoryData_HistoryData()
	 * @model unique="false" dataType="org.eclipse.symphony.core.display.SortedMap<org.eclipse.symphony.core.display.Long, org.eclipse.symphony.core.display.Number>" required="true"
	 * @generated
	 */
  SortedMap<Long, Number> getHistoryData();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.display.NumberVersusTimeHistoryData#getHistoryData <em>History Data</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History Data</em>' attribute.
	 * @see #getHistoryData()
	 * @generated
	 */
  void setHistoryData(SortedMap<Long, Number> value);

} // NumberVersusTimeHistoryData
