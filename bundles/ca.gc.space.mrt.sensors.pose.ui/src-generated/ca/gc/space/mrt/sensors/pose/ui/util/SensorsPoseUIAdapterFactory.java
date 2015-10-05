/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.pose.ui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ca.gc.space.mrt.sensors.pose.ui.OrientationSensorPresentation;
import ca.gc.space.mrt.sensors.pose.ui.PoseSensorPresentation;
import ca.gc.space.mrt.sensors.pose.ui.PositionSensorPresentation;
import ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIPackage;
import ca.gc.space.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIPackage
 * @generated
 */
public class SensorsPoseUIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SensorsPoseUIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorsPoseUIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SensorsPoseUIPackage.eINSTANCE;
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
	protected SensorsPoseUISwitch<Adapter> modelSwitch =
		new SensorsPoseUISwitch<Adapter>() {
			@Override
			public Adapter casePositionSensorPresentation(PositionSensorPresentation object) {
				return createPositionSensorPresentationAdapter();
			}
			@Override
			public Adapter caseOrientationSensorPresentation(OrientationSensorPresentation object) {
				return createOrientationSensorPresentationAdapter();
			}
			@Override
			public Adapter casePoseSensorPresentation(PoseSensorPresentation object) {
				return createPoseSensorPresentationAdapter();
			}
			@Override
			public Adapter caseNodePresentation(NodePresentation object) {
				return createNodePresentationAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.pose.ui.PositionSensorPresentation <em>Position Sensor Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.pose.ui.PositionSensorPresentation
	 * @generated
	 */
	public Adapter createPositionSensorPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.pose.ui.OrientationSensorPresentation <em>Orientation Sensor Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.pose.ui.OrientationSensorPresentation
	 * @generated
	 */
	public Adapter createOrientationSensorPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.sensors.pose.ui.PoseSensorPresentation <em>Pose Sensor Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.sensors.pose.ui.PoseSensorPresentation
	 * @generated
	 */
	public Adapter createPoseSensorPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.ui.NodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.ui.NodePresentation
	 * @generated
	 */
	public Adapter createNodePresentationAdapter() {
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

} //SensorsPoseUIAdapterFactory
