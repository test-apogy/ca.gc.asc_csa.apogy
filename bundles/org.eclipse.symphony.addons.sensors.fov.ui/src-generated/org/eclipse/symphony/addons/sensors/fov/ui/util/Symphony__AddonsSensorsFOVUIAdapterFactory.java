/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.ui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.ConicalFieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.FieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.Symphony__AddonsSensorsFOVUIPackage;
import org.eclipse.symphony.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;
import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.fov.ui.Symphony__AddonsSensorsFOVUIPackage
 * @generated
 */
public class Symphony__AddonsSensorsFOVUIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Symphony__AddonsSensorsFOVUIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVUIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Symphony__AddonsSensorsFOVUIPackage.eINSTANCE;
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
	protected Symphony__AddonsSensorsFOVUISwitch<Adapter> modelSwitch =
		new Symphony__AddonsSensorsFOVUISwitch<Adapter>() {
			@Override
			public Adapter caseFieldOfViewPresentation(FieldOfViewPresentation object) {
				return createFieldOfViewPresentationAdapter();
			}
			@Override
			public Adapter caseCircularSectorFieldOfViewPresentation(CircularSectorFieldOfViewPresentation object) {
				return createCircularSectorFieldOfViewPresentationAdapter();
			}
			@Override
			public Adapter caseConicalFieldOfViewPresentation(ConicalFieldOfViewPresentation object) {
				return createConicalFieldOfViewPresentationAdapter();
			}
			@Override
			public Adapter caseRectangularFrustrumFieldOfViewPresentation(RectangularFrustrumFieldOfViewPresentation object) {
				return createRectangularFrustrumFieldOfViewPresentationAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.fov.ui.FieldOfViewPresentation <em>Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.fov.ui.FieldOfViewPresentation
	 * @generated
	 */
	public Adapter createFieldOfViewPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation <em>Circular Sector Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation
	 * @generated
	 */
	public Adapter createCircularSectorFieldOfViewPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.fov.ui.ConicalFieldOfViewPresentation <em>Conical Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.fov.ui.ConicalFieldOfViewPresentation
	 * @generated
	 */
	public Adapter createConicalFieldOfViewPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation <em>Rectangular Frustrum Field Of View Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation
	 * @generated
	 */
	public Adapter createRectangularFrustrumFieldOfViewPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.ui.NodePresentation <em>Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation
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

} //Symphony__AddonsSensorsFOVUIAdapterFactory
