/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.ConicalFieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.FieldOfViewPresentation;
import org.eclipse.symphony.addons.sensors.fov.ui.Symphony__AddonsSensorsFOVUIFactory;
import org.eclipse.symphony.addons.sensors.fov.ui.Symphony__AddonsSensorsFOVUIPackage;
import org.eclipse.symphony.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsFOVUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsFOVUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsSensorsFOVUIFactory init() {
		try {
			Symphony__AddonsSensorsFOVUIFactory theSymphony__AddonsSensorsFOVUIFactory = (Symphony__AddonsSensorsFOVUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsFOVUIPackage.eNS_URI);
			if (theSymphony__AddonsSensorsFOVUIFactory != null) {
				return theSymphony__AddonsSensorsFOVUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsFOVUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__AddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION: return createFieldOfViewPresentation();
			case Symphony__AddonsSensorsFOVUIPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION: return createCircularSectorFieldOfViewPresentation();
			case Symphony__AddonsSensorsFOVUIPackage.CONICAL_FIELD_OF_VIEW_PRESENTATION: return createConicalFieldOfViewPresentation();
			case Symphony__AddonsSensorsFOVUIPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION: return createRectangularFrustrumFieldOfViewPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfViewPresentation createFieldOfViewPresentation() {
		FieldOfViewPresentationImpl fieldOfViewPresentation = new FieldOfViewPresentationImpl();
		return fieldOfViewPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircularSectorFieldOfViewPresentation createCircularSectorFieldOfViewPresentation() {
		CircularSectorFieldOfViewPresentationImpl circularSectorFieldOfViewPresentation = new CircularSectorFieldOfViewPresentationImpl();
		return circularSectorFieldOfViewPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConicalFieldOfViewPresentation createConicalFieldOfViewPresentation() {
		ConicalFieldOfViewPresentationImpl conicalFieldOfViewPresentation = new ConicalFieldOfViewPresentationImpl();
		return conicalFieldOfViewPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfViewPresentation createRectangularFrustrumFieldOfViewPresentation() {
		RectangularFrustrumFieldOfViewPresentationImpl rectangularFrustrumFieldOfViewPresentation = new RectangularFrustrumFieldOfViewPresentationImpl();
		return rectangularFrustrumFieldOfViewPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsSensorsFOVUIPackage getSymphony__AddonsSensorsFOVUIPackage() {
		return (Symphony__AddonsSensorsFOVUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsSensorsFOVUIPackage getPackage() {
		return Symphony__AddonsSensorsFOVUIPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsFOVUIFactoryImpl
