package ca.gc.asc_csa.apogy.examples.antenna.util;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.examples.antenna.Antenna;
import ca.gc.asc_csa.apogy.examples.antenna.DishAntenna;
import ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaPackage;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaSimulated;
import ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.antenna.ApogyExamplesAntennaPackage
 * @generated
 */
public class ApogyExamplesAntennaAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyExamplesAntennaPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesAntennaAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ApogyExamplesAntennaPackage.eINSTANCE;
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
  protected ApogyExamplesAntennaSwitch<Adapter> modelSwitch =
    new ApogyExamplesAntennaSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.antenna.Antenna <em>Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.Antenna
	 * @generated
	 */
  public Adapter createAntennaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.antenna.DishAntenna <em>Dish Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.DishAntenna
	 * @generated
	 */
  public Adapter createDishAntennaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna <em>PTU Dish Antenna</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntenna
	 * @generated
	 */
  public Adapter createPTUDishAntennaAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub <em>PTU Dish Antenna Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaStub
	 * @generated
	 */
	public Adapter createPTUDishAntennaStubAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaSimulated <em>PTU Dish Antenna Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaSimulated
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

} //ApogyExamplesAntennaAdapterFactory
