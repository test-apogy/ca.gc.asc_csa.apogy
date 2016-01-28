/**
 */
package org.eclipse.symphony.common.emf.ui;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.swt.graphics.Color;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.ui.impl.Symphony__CommonEMFUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIPackage#getSymphony__CommonEMFUIFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonEMFUIFacade extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the color currently associated with the specified
	 * Ranges. Can be null.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.ui.Color" unique="false" rangeUnique="false"
	 * @generated
	 */
	Color getColorForRange(Ranges range);

	public static Symphony__CommonEMFUIFacade INSTANCE = Symphony__CommonEMFUIFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Unit to be used for display.
	 * @param eTypedElement The specified ETypedElement.
	 * @return the display Unit, or the native unit if none found.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.ui.Unit" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Unit<?> getDisplayUnits(ETypedElement eTypedElement);

} // Symphony__CommonEMFUIFacade
