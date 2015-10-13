/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.core.Updatable;
import org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfiguration;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfigurationList;
import org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage
 * @generated
 */
public class SymphonyEarthOrbitEnvironmentUIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymphonyEarthOrbitEnvironmentUIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyEarthOrbitEnvironmentUIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SymphonyEarthOrbitEnvironmentUIPackage.eINSTANCE;
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
	protected SymphonyEarthOrbitEnvironmentUISwitch<Adapter> modelSwitch =
		new SymphonyEarthOrbitEnvironmentUISwitch<Adapter>() {
			@Override
			public Adapter caseEarthViewConfigurationList(EarthViewConfigurationList object) {
				return createEarthViewConfigurationListAdapter();
			}
			@Override
			public Adapter caseEarthViewConfiguration(EarthViewConfiguration object) {
				return createEarthViewConfigurationAdapter();
			}
			@Override
			public Adapter caseAbstractWorldWindLayer(AbstractWorldWindLayer object) {
				return createAbstractWorldWindLayerAdapter();
			}
			@Override
			public Adapter caseSpacecraftLocationWorldWindLayer(SpacecraftLocationWorldWindLayer object) {
				return createSpacecraftLocationWorldWindLayerAdapter();
			}
			@Override
			public Adapter caseOrbitModelWorldWindLayer(OrbitModelWorldWindLayer object) {
				return createOrbitModelWorldWindLayerAdapter();
			}
			@Override
			public Adapter caseSpacecraftSwathWorldWindLayer(SpacecraftSwathWorldWindLayer object) {
				return createSpacecraftSwathWorldWindLayerAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceLocationWorldWindLayer(EarthSurfaceLocationWorldWindLayer object) {
				return createEarthSurfaceLocationWorldWindLayerAdapter();
			}
			@Override
			public Adapter caseGroundStationWorldWindLayer(GroundStationWorldWindLayer object) {
				return createGroundStationWorldWindLayerAdapter();
			}
			@Override
			public Adapter caseSpacecraftVisibilityPassViewConfigurationList(SpacecraftVisibilityPassViewConfigurationList object) {
				return createSpacecraftVisibilityPassViewConfigurationListAdapter();
			}
			@Override
			public Adapter caseSpacecraftVisibilityPassViewConfiguration(SpacecraftVisibilityPassViewConfiguration object) {
				return createSpacecraftVisibilityPassViewConfigurationAdapter();
			}
			@Override
			public Adapter caseAbstractToolsListContainer(AbstractToolsListContainer object) {
				return createAbstractToolsListContainerAdapter();
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
			public Adapter caseUpdatable(Updatable object) {
				return createUpdatableAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfigurationList <em>Earth View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfigurationList
	 * @generated
	 */
	public Adapter createEarthViewConfigurationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfiguration <em>Earth View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfiguration
	 * @generated
	 */
	public Adapter createEarthViewConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer <em>Abstract World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer
	 * @generated
	 */
	public Adapter createAbstractWorldWindLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer <em>Spacecraft Location World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer
	 * @generated
	 */
	public Adapter createSpacecraftLocationWorldWindLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer <em>Orbit Model World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer
	 * @generated
	 */
	public Adapter createOrbitModelWorldWindLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer <em>Spacecraft Swath World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer
	 * @generated
	 */
	public Adapter createSpacecraftSwathWorldWindLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer <em>Earth Surface Location World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer
	 * @generated
	 */
	public Adapter createEarthSurfaceLocationWorldWindLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer <em>Ground Station World Wind Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer
	 * @generated
	 */
	public Adapter createGroundStationWorldWindLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList <em>Spacecraft Visibility Pass View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList
	 * @generated
	 */
	public Adapter createSpacecraftVisibilityPassViewConfigurationListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration <em>Spacecraft Visibility Pass View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration
	 * @generated
	 */
	public Adapter createSpacecraftVisibilityPassViewConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.invocator.AbstractToolsListContainer <em>Abstract Tools List Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.invocator.AbstractToolsListContainer
	 * @generated
	 */
	public Adapter createAbstractToolsListContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.core.Updatable <em>Updatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.core.Updatable
	 * @generated
	 */
	public Adapter createUpdatableAdapter() {
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

} //SymphonyEarthOrbitEnvironmentUIAdapterFactory
