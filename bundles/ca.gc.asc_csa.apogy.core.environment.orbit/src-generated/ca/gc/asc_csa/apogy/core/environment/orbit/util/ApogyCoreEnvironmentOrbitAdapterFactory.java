package ca.gc.asc_csa.apogy.core.environment.orbit.util;
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
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.orbit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage
 * @generated
 */
public class ApogyCoreEnvironmentOrbitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCoreEnvironmentOrbitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyCoreEnvironmentOrbitPackage.eINSTANCE;
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
	protected ApogyCoreEnvironmentOrbitSwitch<Adapter> modelSwitch =
		new ApogyCoreEnvironmentOrbitSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractOrbitModel(AbstractOrbitModel object) {
				return createAbstractOrbitModelAdapter();
			}
			@Override
			public Adapter caseOrbitWorksite(OrbitWorksite object) {
				return createOrbitWorksiteAdapter();
			}
			@Override
			public Adapter caseAbstractFrame(AbstractFrame object) {
				return createAbstractFrameAdapter();
			}
			@Override
			public Adapter casePVACoordinates(PVACoordinates object) {
				return createPVACoordinatesAdapter();
			}
			@Override
			public Adapter caseTimedStampedPVACoordinates(TimedStampedPVACoordinates object) {
				return createTimedStampedPVACoordinatesAdapter();
			}
			@Override
			public Adapter casePVCoordinatesProviderProvider(PVCoordinatesProviderProvider object) {
				return createPVCoordinatesProviderProviderAdapter();
			}
			@Override
			public Adapter caseAngularCoordinates(AngularCoordinates object) {
				return createAngularCoordinatesAdapter();
			}
			@Override
			public Adapter caseTimedStampedAngularCoordinates(TimedStampedAngularCoordinates object) {
				return createTimedStampedAngularCoordinatesAdapter();
			}
			@Override
			public Adapter caseSpacecraftAttitude(SpacecraftAttitude object) {
				return createSpacecraftAttitudeAdapter();
			}
			@Override
			public Adapter caseAttitudeProvider(AttitudeProvider object) {
				return createAttitudeProviderAdapter();
			}
			@Override
			public Adapter caseSpacecraftState(SpacecraftState object) {
				return createSpacecraftStateAdapter();
			}
			@Override
			public Adapter caseOrbit(Orbit object) {
				return createOrbitAdapter();
			}
			@Override
			public Adapter caseValidityRangeProvider(ValidityRangeProvider object) {
				return createValidityRangeProviderAdapter();
			}
			@Override
			public Adapter caseOrbitModel(OrbitModel object) {
				return createOrbitModelAdapter();
			}
			@Override
			public Adapter caseApogyCoreEnvironmentOrbitFacade(ApogyCoreEnvironmentOrbitFacade object) {
				return createApogyCoreEnvironmentOrbitFacadeAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseAbstractWorksite(AbstractWorksite object) {
				return createAbstractWorksiteAdapter();
			}
			@Override
			public Adapter caseWorksite(Worksite object) {
				return createWorksiteAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite <em>Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite
	 * @generated
	 */
	public Adapter createOrbitWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame <em>Abstract Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame
	 * @generated
	 */
	public Adapter createAbstractFrameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates <em>PVA Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates
	 * @generated
	 */
	public Adapter createPVACoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates <em>Timed Stamped PVA Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates
	 * @generated
	 */
	public Adapter createTimedStampedPVACoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider <em>PV Coordinates Provider Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider
	 * @generated
	 */
	public Adapter createPVCoordinatesProviderProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates <em>Angular Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AngularCoordinates
	 * @generated
	 */
	public Adapter createAngularCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates <em>Timed Stamped Angular Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedAngularCoordinates
	 * @generated
	 */
	public Adapter createTimedStampedAngularCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude <em>Spacecraft Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude
	 * @generated
	 */
	public Adapter createSpacecraftAttitudeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider <em>Attitude Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider
	 * @generated
	 */
	public Adapter createAttitudeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState <em>Spacecraft State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState
	 * @generated
	 */
	public Adapter createSpacecraftStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.Orbit <em>Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.Orbit
	 * @generated
	 */
	public Adapter createOrbitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider <em>Validity Range Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider
	 * @generated
	 */
	public Adapter createValidityRangeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel <em>Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel
	 * @generated
	 */
	public Adapter createOrbitModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade
	 * @generated
	 */
	public Adapter createApogyCoreEnvironmentOrbitFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractWorksite
	 * @generated
	 */
	public Adapter createAbstractWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Worksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite
	 * @generated
	 */
	public Adapter createWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitModel <em>Abstract Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitModel
	 * @generated
	 */
	public Adapter createAbstractOrbitModelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Timed
	 * @generated
	 */
	public Adapter createTimedAdapter() {
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

} //ApogyCoreEnvironmentOrbitAdapterFactory
