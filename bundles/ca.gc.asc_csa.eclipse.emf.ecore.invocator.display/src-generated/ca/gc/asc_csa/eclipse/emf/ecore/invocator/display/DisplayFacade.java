/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractDisplay;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl.DisplayFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Facade.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage#getDisplayFacade()
 * @model
 * @generated
 */
public interface DisplayFacade extends EObject
{
	
  public static DisplayFacade INSTANCE = DisplayFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a user readable qualified name for the specified AbstractFeatureDisplay.
	 * <!-- end-model-doc -->
	 * @model unique="false" abstractFeatureDisplayUnique="false"
	 * @generated
	 */
  String getDisplayedName(AbstractFeatureDisplay abstractFeatureDisplay);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" abstractFeatureDisplayUnique="false"
	 * @generated
	 */
  EObject getSource(AbstractFeatureDisplay abstractFeatureDisplay);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" abstractDisplayUnique="false"
	 * @generated
	 */
  EStructuralFeature getEStructuralFeature(AbstractDisplay abstractDisplay);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.IObservableValue" unique="false" abstractFeatureDisplayUnique="false" controlDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.Control" controlUnique="false"
	 * @generated
	 */
  IObservableValue getIObservableValue(AbstractFeatureDisplay abstractFeatureDisplay, Control control);

} // DisplayFacade
