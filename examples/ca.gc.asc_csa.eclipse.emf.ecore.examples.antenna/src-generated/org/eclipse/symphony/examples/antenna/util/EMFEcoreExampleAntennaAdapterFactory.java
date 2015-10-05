/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.examples.antenna.Antenna;
import org.eclipse.symphony.examples.antenna.DishAntenna;
import org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage;
import org.eclipse.symphony.examples.antenna.PTUDishAntenna;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaSimulated;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaStub;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.antenna.EMFEcoreExampleAntennaPackage
 * @generated
 */
public class EMFEcoreExampleAntennaAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreExampleAntennaPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleAntennaAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreExampleAntennaPackage.eINSTANCE;
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
  protected EMFEcoreExampleAntennaSwitch<Adapter> modelSwitch =
    new EMFEcoreExampleAntennaSwitch<Adapter>() {
			@Override
			public Adapter caseAntenna(Antenna object) {
				return createAntennaAdapter();
			}
			@Override
			public Adapter caseDishAntenna(DishAntenna object) {
				return createDishAntennaAdapter();
			}
			@Override
			public Adapter casePTUDishAntenna(PTUDishAntenna object) {
				return createPTUDishAntennaAdapter();
			}
			@Override
			public Adapter casePTUDishAntennaStub(PTUDishAntennaStub object) {
				return createPTUDishAntennaStubAdapter();
			}
			@Override
			public Adapter casePTUDishAntennaSimulated(PTUDishAntennaSimulated object) {
				return createPTUDishAntennaSimulatedAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.examples.antenna.Antenna <em>Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.examples.antenna.Antenna
	 * @generated
	 */
  public Adapter createAntennaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.examples.antenna.DishAntenna <em>Dish Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.examples.antenna.DishAntenna
	 * @generated
	 */
  public Adapter createDishAntennaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.examples.antenna.PTUDishAntenna <em>PTU Dish Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.examples.antenna.PTUDishAntenna
	 * @generated
	 */
  public Adapter createPTUDishAntennaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.examples.antenna.PTUDishAntennaStub <em>PTU Dish Antenna Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.examples.antenna.PTUDishAntennaStub
	 * @generated
	 */
	public Adapter createPTUDishAntennaStubAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.examples.antenna.PTUDishAntennaSimulated <em>PTU Dish Antenna Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.examples.antenna.PTUDishAntennaSimulated
	 * @generated
	 */
	public Adapter createPTUDishAntennaSimulatedAdapter() {
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

} //EMFEcoreExampleAntennaAdapterFactory
