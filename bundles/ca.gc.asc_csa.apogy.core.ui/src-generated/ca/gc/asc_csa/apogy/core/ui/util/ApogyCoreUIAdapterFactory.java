package ca.gc.asc_csa.apogy.core.ui.util;
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
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation;
import ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage
 * @generated
 */
public class ApogyCoreUIAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyCoreUIPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreUIAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ApogyCoreUIPackage.eINSTANCE;
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
  protected ApogyCoreUISwitch<Adapter> modelSwitch =
    new ApogyCoreUISwitch<Adapter>() {
			@Override
			public Adapter caseApogyCoreUIFacade(ApogyCoreUIFacade object) {
				return createApogyCoreUIFacadeAdapter();
			}
			@Override
			public Adapter caseResultNodePresentation(ResultNodePresentation object) {
				return createResultNodePresentationAdapter();
			}
			@Override
			public Adapter caseNodePresentation(NodePresentation object) {
				return createNodePresentationAdapter();
			}
			@Override
			public Adapter caseTransformNodePresentation(TransformNodePresentation object) {
				return createTransformNodePresentationAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade
	 * @generated
	 */
	public Adapter createApogyCoreUIFacadeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation <em>Result Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation
	 * @generated
	 */
  public Adapter createResultNodePresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation
	 * @generated
	 */
  public Adapter createNodePresentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation <em>Transform Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation
	 * @generated
	 */
	public Adapter createTransformNodePresentationAdapter() {
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

} //ApogyCoreUIAdapterFactory
