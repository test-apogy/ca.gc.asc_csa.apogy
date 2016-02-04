package ca.gc.asc_csa.apogy.common.topology.bindings.util;
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
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage
 * @generated
 */
public class ApogyCommonTopologyBindingsAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyCommonTopologyBindingsPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCommonTopologyBindingsAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ApogyCommonTopologyBindingsPackage.eINSTANCE;
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
  protected ApogyCommonTopologyBindingsSwitch<Adapter> modelSwitch =
    new ApogyCommonTopologyBindingsSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTopologyBinding(AbstractTopologyBinding object) {
				return createAbstractTopologyBindingAdapter();
			}
			@Override
			public Adapter caseRotationBinding(RotationBinding object) {
				return createRotationBindingAdapter();
			}
			@Override
			public Adapter caseTranslationBinding(TranslationBinding object) {
				return createTranslationBindingAdapter();
			}
			@Override
			public Adapter caseTransformMatrixBinding(TransformMatrixBinding object) {
				return createTransformMatrixBindingAdapter();
			}
			@Override
			public Adapter caseEnumerationSwitchBinding(EnumerationSwitchBinding object) {
				return createEnumerationSwitchBindingAdapter();
			}
			@Override
			public Adapter caseEnumerationCase(EnumerationCase object) {
				return createEnumerationCaseAdapter();
			}
			@Override
			public Adapter caseBindingsList(BindingsList object) {
				return createBindingsListAdapter();
			}
			@Override
			public Adapter caseFeatureRootsList(FeatureRootsList object) {
				return createFeatureRootsListAdapter();
			}
			@Override
			public Adapter caseBindingsSet(BindingsSet object) {
				return createBindingsSetAdapter();
			}
			@Override
			public Adapter caseApogyCommonTopologyBindingsFacade(ApogyCommonTopologyBindingsFacade object) {
				return createApogyCommonTopologyBindingsFacadeAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding <em>Abstract Topology Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding
	 * @generated
	 */
  public Adapter createAbstractTopologyBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding <em>Rotation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding
	 * @generated
	 */
  public Adapter createRotationBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding <em>Translation Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding
	 * @generated
	 */
  public Adapter createTranslationBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding <em>Transform Matrix Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding
	 * @generated
	 */
  public Adapter createTransformMatrixBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding <em>Enumeration Switch Binding</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding
	 * @generated
	 */
  public Adapter createEnumerationSwitchBindingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase <em>Enumeration Case</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase
	 * @generated
	 */
  public Adapter createEnumerationCaseAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList <em>Bindings List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList
	 * @generated
	 */
  public Adapter createBindingsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList <em>Feature Roots List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList
	 * @generated
	 */
  public Adapter createFeatureRootsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet <em>Bindings Set</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet
	 * @generated
	 */
  public Adapter createBindingsSetAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade
	 * @generated
	 */
	public Adapter createApogyCommonTopologyBindingsFacadeAdapter() {
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

} //ApogyCommonTopologyBindingsAdapterFactory
