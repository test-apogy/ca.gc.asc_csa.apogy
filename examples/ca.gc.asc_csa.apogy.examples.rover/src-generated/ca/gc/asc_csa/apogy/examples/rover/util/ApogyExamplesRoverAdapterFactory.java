package ca.gc.asc_csa.apogy.examples.rover.util;
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
import ca.gc.asc_csa.apogy.common.emf.Disposable;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.examples.rover.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage
 * @generated
 */
public class ApogyExamplesRoverAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyExamplesRoverPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesRoverAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ApogyExamplesRoverPackage.eINSTANCE;
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
  protected ApogyExamplesRoverSwitch<Adapter> modelSwitch =
    new ApogyExamplesRoverSwitch<Adapter>() {
			@Override
			public Adapter caseBattery(Battery object) {
				return createBatteryAdapter();
			}
			@Override
			public Adapter casePowerSystem(PowerSystem object) {
				return createPowerSystemAdapter();
			}
			@Override
			public Adapter caseRover(Rover object) {
				return createRoverAdapter();
			}
			@Override
			public Adapter caseRoverStub(RoverStub object) {
				return createRoverStubAdapter();
			}
			@Override
			public Adapter caseRoverSimulated(RoverSimulated object) {
				return createRoverSimulatedAdapter();
			}
			@Override
			public Adapter caseDisposable(Disposable object) {
				return createDisposableAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.rover.Battery <em>Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.rover.Battery
	 * @generated
	 */
	public Adapter createBatteryAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.rover.PowerSystem <em>Power System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.rover.PowerSystem
	 * @generated
	 */
	public Adapter createPowerSystemAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.rover.Rover <em>Rover</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.rover.Rover
	 * @generated
	 */
  public Adapter createRoverAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.rover.RoverStub <em>Rover Stub</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.rover.RoverStub
	 * @generated
	 */
  public Adapter createRoverStubAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.rover.RoverSimulated <em>Rover Simulated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.rover.RoverSimulated
	 * @generated
	 */
	public Adapter createRoverSimulatedAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Disposable <em>Disposable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Disposable
	 * @generated
	 */
	public Adapter createDisposableAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
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

} //ApogyExamplesRoverAdapterFactory
