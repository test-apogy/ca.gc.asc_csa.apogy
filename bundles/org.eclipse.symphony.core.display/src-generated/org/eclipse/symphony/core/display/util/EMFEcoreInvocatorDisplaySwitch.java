/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.AbstractPlotDisplay;
import org.eclipse.symphony.core.display.BooleanDisplay;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.HistoryData;
import org.eclipse.symphony.core.display.HistoryDataHandler;
import org.eclipse.symphony.core.display.NumberVersusTimeHistoryData;
import org.eclipse.symphony.core.display.NumberVsTimePlotDisplay;
import org.eclipse.symphony.core.display.TextDisplay;
import org.eclipse.symphony.core.invocator.AbstractDisplay;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage
 * @generated
 */
public class EMFEcoreInvocatorDisplaySwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreInvocatorDisplayPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorDisplaySwitch()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreInvocatorDisplayPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY: {
				AbstractFeatureDisplay abstractFeatureDisplay = (AbstractFeatureDisplay)theEObject;
				T result = caseAbstractFeatureDisplay(abstractFeatureDisplay);
				if (result == null) result = caseAbstractDisplay(abstractFeatureDisplay);
				if (result == null) result = caseDescribed(abstractFeatureDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.TEXT_DISPLAY: {
				TextDisplay textDisplay = (TextDisplay)theEObject;
				T result = caseTextDisplay(textDisplay);
				if (result == null) result = caseAbstractFeatureDisplay(textDisplay);
				if (result == null) result = caseAbstractDisplay(textDisplay);
				if (result == null) result = caseDescribed(textDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.BOOLEAN_DISPLAY: {
				BooleanDisplay booleanDisplay = (BooleanDisplay)theEObject;
				T result = caseBooleanDisplay(booleanDisplay);
				if (result == null) result = caseAbstractFeatureDisplay(booleanDisplay);
				if (result == null) result = caseAbstractDisplay(booleanDisplay);
				if (result == null) result = caseDescribed(booleanDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.HISTORY_DATA_HANDLER: {
				HistoryDataHandler historyDataHandler = (HistoryDataHandler)theEObject;
				T result = caseHistoryDataHandler(historyDataHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.HISTORY_DATA: {
				HistoryData historyData = (HistoryData)theEObject;
				T result = caseHistoryData(historyData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VERSUS_TIME_HISTORY_DATA: {
				NumberVersusTimeHistoryData numberVersusTimeHistoryData = (NumberVersusTimeHistoryData)theEObject;
				T result = caseNumberVersusTimeHistoryData(numberVersusTimeHistoryData);
				if (result == null) result = caseHistoryData(numberVersusTimeHistoryData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_PLOT_DISPLAY: {
				AbstractPlotDisplay abstractPlotDisplay = (AbstractPlotDisplay)theEObject;
				T result = caseAbstractPlotDisplay(abstractPlotDisplay);
				if (result == null) result = caseAbstractFeatureDisplay(abstractPlotDisplay);
				if (result == null) result = caseHistoryDataHandler(abstractPlotDisplay);
				if (result == null) result = caseAbstractDisplay(abstractPlotDisplay);
				if (result == null) result = caseDescribed(abstractPlotDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VS_TIME_PLOT_DISPLAY: {
				NumberVsTimePlotDisplay numberVsTimePlotDisplay = (NumberVsTimePlotDisplay)theEObject;
				T result = caseNumberVsTimePlotDisplay(numberVsTimePlotDisplay);
				if (result == null) result = caseAbstractPlotDisplay(numberVsTimePlotDisplay);
				if (result == null) result = caseAbstractFeatureDisplay(numberVsTimePlotDisplay);
				if (result == null) result = caseHistoryDataHandler(numberVsTimePlotDisplay);
				if (result == null) result = caseAbstractDisplay(numberVsTimePlotDisplay);
				if (result == null) result = caseDescribed(numberVsTimePlotDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreInvocatorDisplayPackage.DISPLAY_FACADE: {
				DisplayFacade displayFacade = (DisplayFacade)theEObject;
				T result = caseDisplayFacade(displayFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Display</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractFeatureDisplay(AbstractFeatureDisplay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Text Display</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTextDisplay(TextDisplay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Display</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBooleanDisplay(BooleanDisplay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>History Data Handler</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Data Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHistoryDataHandler(HistoryDataHandler object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>History Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHistoryData(HistoryData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Number Versus Time History Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Versus Time History Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNumberVersusTimeHistoryData(NumberVersusTimeHistoryData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Plot Display</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Plot Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractPlotDisplay(AbstractPlotDisplay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Number Vs Time Plot Display</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Vs Time Plot Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNumberVsTimePlotDisplay(NumberVsTimePlotDisplay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Display Facade</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDisplayFacade(DisplayFacade object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Display</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractDisplay(AbstractDisplay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //EMFEcoreInvocatorDisplaySwitch
