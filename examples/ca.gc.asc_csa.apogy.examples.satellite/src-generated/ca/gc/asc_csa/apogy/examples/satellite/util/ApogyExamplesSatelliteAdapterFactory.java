/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.examples.satellite.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage
 * @generated
 */
public class ApogyExamplesSatelliteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyExamplesSatellitePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyExamplesSatellitePackage.eINSTANCE;
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
	protected ApogyExamplesSatelliteSwitch<Adapter> modelSwitch =
		new ApogyExamplesSatelliteSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractConstellation(AbstractConstellation object) {
				return createAbstractConstellationAdapter();
			}
			@Override
			public Adapter caseConstellationCommandPlan(ConstellationCommandPlan object) {
				return createConstellationCommandPlanAdapter();
			}
			@Override
			public Adapter caseConstellationCommandPlanItem(ConstellationCommandPlanItem object) {
				return createConstellationCommandPlanItemAdapter();
			}
			@Override
			public Adapter caseDefaultConstellation(DefaultConstellation object) {
				return createDefaultConstellationAdapter();
			}
			@Override
			public Adapter caseConstellationRequestsList(ConstellationRequestsList object) {
				return createConstellationRequestsListAdapter();
			}
			@Override
			public Adapter caseAbstractConstellationRequest(AbstractConstellationRequest object) {
				return createAbstractConstellationRequestAdapter();
			}
			@Override
			public Adapter caseImageConstellationRequest(ImageConstellationRequest object) {
				return createImageConstellationRequestAdapter();
			}
			@Override
			public Adapter caseSatellitesList(SatellitesList object) {
				return createSatellitesListAdapter();
			}
			@Override
			public Adapter caseSatellite(Satellite object) {
				return createSatelliteAdapter();
			}
			@Override
			public Adapter caseAbstractSatelliteCommand(AbstractSatelliteCommand object) {
				return createAbstractSatelliteCommandAdapter();
			}
			@Override
			public Adapter caseAcquireImageSatelliteCommand(AcquireImageSatelliteCommand object) {
				return createAcquireImageSatelliteCommandAdapter();
			}
			@Override
			public Adapter caseOrbitalImage(OrbitalImage object) {
				return createOrbitalImageAdapter();
			}
			@Override
			public Adapter caseConstellationDownlinksList(ConstellationDownlinksList object) {
				return createConstellationDownlinksListAdapter();
			}
			@Override
			public Adapter caseConstellationDownlink(ConstellationDownlink object) {
				return createConstellationDownlinkAdapter();
			}
			@Override
			public Adapter caseAbstractConstellationDownlinkItem(AbstractConstellationDownlinkItem object) {
				return createAbstractConstellationDownlinkItemAdapter();
			}
			@Override
			public Adapter caseOrbitalImageConstellationDownlinkItem(OrbitalImageConstellationDownlinkItem object) {
				return createOrbitalImageConstellationDownlinkItemAdapter();
			}
			@Override
			public Adapter caseConstellationUtilities(ConstellationUtilities object) {
				return createConstellationUtilitiesAdapter();
			}
			@Override
			public Adapter caseGeographicCoordinates(GeographicCoordinates object) {
				return createGeographicCoordinatesAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseAbstractEImage(AbstractEImage object) {
				return createAbstractEImageAdapter();
			}
			@Override
			public Adapter caseEImage(EImage object) {
				return createEImageAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation <em>Abstract Constellation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation
	 * @generated
	 */
	public Adapter createAbstractConstellationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan <em>Constellation Command Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan
	 * @generated
	 */
	public Adapter createConstellationCommandPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem <em>Constellation Command Plan Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem
	 * @generated
	 */
	public Adapter createConstellationCommandPlanItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellation <em>Default Constellation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellation
	 * @generated
	 */
	public Adapter createDefaultConstellationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList <em>Constellation Requests List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList
	 * @generated
	 */
	public Adapter createConstellationRequestsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest <em>Abstract Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest
	 * @generated
	 */
	public Adapter createAbstractConstellationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest <em>Image Constellation Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest
	 * @generated
	 */
	public Adapter createImageConstellationRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.SatellitesList <em>Satellites List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.SatellitesList
	 * @generated
	 */
	public Adapter createSatellitesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.Satellite
	 * @generated
	 */
	public Adapter createSatelliteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand <em>Abstract Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand
	 * @generated
	 */
	public Adapter createAbstractSatelliteCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand <em>Acquire Image Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand
	 * @generated
	 */
	public Adapter createAcquireImageSatelliteCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage <em>Orbital Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage
	 * @generated
	 */
	public Adapter createOrbitalImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList <em>Constellation Downlinks List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList
	 * @generated
	 */
	public Adapter createConstellationDownlinksListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink <em>Constellation Downlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink
	 * @generated
	 */
	public Adapter createConstellationDownlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem <em>Abstract Constellation Downlink Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem
	 * @generated
	 */
	public Adapter createAbstractConstellationDownlinkItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem <em>Orbital Image Constellation Downlink Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.OrbitalImageConstellationDownlinkItem
	 * @generated
	 */
	public Adapter createOrbitalImageConstellationDownlinkItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities <em>Constellation Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationUtilities
	 * @generated
	 */
	public Adapter createConstellationUtilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates <em>Geographic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates
	 * @generated
	 */
	public Adapter createGeographicCoordinatesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.images.AbstractEImage <em>Abstract EImage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.images.AbstractEImage
	 * @generated
	 */
	public Adapter createAbstractEImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.images.EImage <em>EImage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.images.EImage
	 * @generated
	 */
	public Adapter createEImageAdapter() {
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

} //ApogyExamplesSatelliteAdapterFactory