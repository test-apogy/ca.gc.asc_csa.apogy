/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.Sensor;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;

import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.ImagingUtilities;
import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage;
import ca.gc.space.mrt.sensors.imaging.RectifiedImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.Zoomable;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage
 * @generated
 */
public class MRTSensorsImagingAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static MRTSensorsImagingPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTSensorsImagingAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = MRTSensorsImagingPackage.eINSTANCE;
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
  protected MRTSensorsImagingSwitch<Adapter> modelSwitch =
    new MRTSensorsImagingSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCamera(AbstractCamera object) {
				return createAbstractCameraAdapter();
			}
			@Override
			public Adapter caseImageSnapshot(ImageSnapshot object) {
				return createImageSnapshotAdapter();
			}
			@Override
			public Adapter caseRectifiedImageSnapshot(RectifiedImageSnapshot object) {
				return createRectifiedImageSnapshotAdapter();
			}
			@Override
			public Adapter caseZoomable(Zoomable object) {
				return createZoomableAdapter();
			}
			@Override
			public Adapter caseImagingUtilities(ImagingUtilities object) {
				return createImagingUtilitiesAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public Adapter caseAggregateGroupNode(AggregateGroupNode object) {
				return createAggregateGroupNodeAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.imaging.AbstractCamera <em>Abstract Camera</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.imaging.AbstractCamera
	 * @generated
	 */
  public Adapter createAbstractCameraAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.imaging.ImageSnapshot <em>Image Snapshot</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.imaging.ImageSnapshot
	 * @generated
	 */
  public Adapter createImageSnapshotAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.imaging.RectifiedImageSnapshot <em>Rectified Image Snapshot</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.imaging.RectifiedImageSnapshot
	 * @generated
	 */
  public Adapter createRectifiedImageSnapshotAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.imaging.Zoomable <em>Zoomable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.imaging.Zoomable
	 * @generated
	 */
  public Adapter createZoomableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.imaging.ImagingUtilities <em>Imaging Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.imaging.ImagingUtilities
	 * @generated
	 */
	public Adapter createImagingUtilitiesAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.Node
	 * @generated
	 */
  public Adapter createNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.GroupNode
	 * @generated
	 */
  public Adapter createGroupNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.AggregateGroupNode
	 * @generated
	 */
  public Adapter createAggregateGroupNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.Sensor
	 * @generated
	 */
  public Adapter createSensorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Named
	 * @generated
	 */
  public Adapter createNamedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Timed
	 * @generated
	 */
  public Adapter createTimedAdapter()
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

} //MRTSensorsImagingAdapterFactory
