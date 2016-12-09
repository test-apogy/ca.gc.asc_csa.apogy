/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage
 * @generated
 */
public class ApogyCoreEnvironmentSurfaceEarthUIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCoreEnvironmentSurfaceEarthUIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyCoreEnvironmentSurfaceEarthUIPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
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
	protected ApogyCoreEnvironmentSurfaceEarthUISwitch<Adapter> modelSwitch =
		new ApogyCoreEnvironmentSurfaceEarthUISwitch<Adapter>() {
			@Override
			public Adapter caseEarthSurfaceWorksitePresentation(EarthSurfaceWorksitePresentation object) {
				return createEarthSurfaceWorksitePresentationAdapter();
			}
			@Override
			public Adapter caseEarthSkyPresentation(EarthSkyPresentation object) {
				return createEarthSkyPresentationAdapter();
			}
			@Override
			public Adapter caseMoonPresentation(MoonPresentation object) {
				return createMoonPresentationAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceUIUtilities(EarthSurfaceUIUtilities object) {
				return createEarthSurfaceUIUtilitiesAdapter();
			}
			@Override
			public Adapter caseNodePresentation(NodePresentation object) {
				return createNodePresentationAdapter();
			}
			@Override
			public Adapter caseAbstractSurfaceWorksitePresentation(AbstractSurfaceWorksitePresentation object) {
				return createAbstractSurfaceWorksitePresentationAdapter();
			}
			@Override
			public Adapter caseAbstractSurfaceWorksiteSkyPresentation(AbstractSurfaceWorksiteSkyPresentation object) {
				return createAbstractSurfaceWorksiteSkyPresentationAdapter();
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation <em>Earth Surface Worksite Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceWorksitePresentation
	 * @generated
	 */
	public Adapter createEarthSurfaceWorksitePresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation <em>Earth Sky Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSkyPresentation
	 * @generated
	 */
	public Adapter createEarthSkyPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation <em>Moon Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.MoonPresentation
	 * @generated
	 */
	public Adapter createMoonPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities <em>Earth Surface UI Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities
	 * @generated
	 */
	public Adapter createEarthSurfaceUIUtilitiesAdapter() {
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
	public Adapter createNodePresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation <em>Abstract Surface Worksite Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation
	 * @generated
	 */
	public Adapter createAbstractSurfaceWorksitePresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation <em>Abstract Surface Worksite Sky Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation
	 * @generated
	 */
	public Adapter createAbstractSurfaceWorksiteSkyPresentationAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApogyCoreEnvironmentSurfaceEarthUIAdapterFactory
