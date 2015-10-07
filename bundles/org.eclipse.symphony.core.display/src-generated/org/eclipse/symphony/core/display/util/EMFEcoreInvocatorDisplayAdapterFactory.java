/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
import ca.gc.asc_csa.eclipse.emf.ecore.Described;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage
 * @generated
 */
public class EMFEcoreInvocatorDisplayAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreInvocatorDisplayPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorDisplayAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreInvocatorDisplayPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EMFEcoreInvocatorDisplaySwitch<Adapter> modelSwitch =
    new EMFEcoreInvocatorDisplaySwitch<Adapter>() {
			@Override
			public Adapter caseAbstractFeatureDisplay(AbstractFeatureDisplay object) {
				return createAbstractFeatureDisplayAdapter();
			}
			@Override
			public Adapter caseTextDisplay(TextDisplay object) {
				return createTextDisplayAdapter();
			}
			@Override
			public Adapter caseBooleanDisplay(BooleanDisplay object) {
				return createBooleanDisplayAdapter();
			}
			@Override
			public Adapter caseHistoryDataHandler(HistoryDataHandler object) {
				return createHistoryDataHandlerAdapter();
			}
			@Override
			public Adapter caseHistoryData(HistoryData object) {
				return createHistoryDataAdapter();
			}
			@Override
			public Adapter caseNumberVersusTimeHistoryData(NumberVersusTimeHistoryData object) {
				return createNumberVersusTimeHistoryDataAdapter();
			}
			@Override
			public Adapter caseAbstractPlotDisplay(AbstractPlotDisplay object) {
				return createAbstractPlotDisplayAdapter();
			}
			@Override
			public Adapter caseNumberVsTimePlotDisplay(NumberVsTimePlotDisplay object) {
				return createNumberVsTimePlotDisplayAdapter();
			}
			@Override
			public Adapter caseDisplayFacade(DisplayFacade object) {
				return createDisplayFacadeAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseAbstractDisplay(AbstractDisplay object) {
				return createAbstractDisplayAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay <em>Abstract Feature Display</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay
	 * @generated
	 */
  public Adapter createAbstractFeatureDisplayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.TextDisplay <em>Text Display</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.TextDisplay
	 * @generated
	 */
  public Adapter createTextDisplayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.BooleanDisplay <em>Boolean Display</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.BooleanDisplay
	 * @generated
	 */
  public Adapter createBooleanDisplayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.HistoryDataHandler <em>History Data Handler</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.HistoryDataHandler
	 * @generated
	 */
  public Adapter createHistoryDataHandlerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.HistoryData <em>History Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.HistoryData
	 * @generated
	 */
  public Adapter createHistoryDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.NumberVersusTimeHistoryData <em>Number Versus Time History Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.NumberVersusTimeHistoryData
	 * @generated
	 */
  public Adapter createNumberVersusTimeHistoryDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.AbstractPlotDisplay <em>Abstract Plot Display</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.AbstractPlotDisplay
	 * @generated
	 */
  public Adapter createAbstractPlotDisplayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.NumberVsTimePlotDisplay <em>Number Vs Time Plot Display</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.NumberVsTimePlotDisplay
	 * @generated
	 */
  public Adapter createNumberVsTimePlotDisplayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.display.DisplayFacade <em>Display Facade</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.display.DisplayFacade
	 * @generated
	 */
  public Adapter createDisplayFacadeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Described
	 * @generated
	 */
  public Adapter createDescribedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.invocator.AbstractDisplay <em>Abstract Display</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.invocator.AbstractDisplay
	 * @generated
	 */
  public Adapter createAbstractDisplayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //EMFEcoreInvocatorDisplayAdapterFactory
