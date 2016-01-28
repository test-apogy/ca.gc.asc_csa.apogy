/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ConicalFieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsFOVUIFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsFOVUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsSensorsFOVUIFactory init() {
		try {
			ApogyAddonsSensorsFOVUIFactory theApogyAddonsSensorsFOVUIFactory = (ApogyAddonsSensorsFOVUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsFOVUIPackage.eNS_URI);
			if (theApogyAddonsSensorsFOVUIFactory != null) {
				return theApogyAddonsSensorsFOVUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsFOVUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsSensorsFOVUIFactoryImpl() {
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
			case ApogyAddonsSensorsFOVUIPackage.FIELD_OF_VIEW_PRESENTATION: return createFieldOfViewPresentation();
			case ApogyAddonsSensorsFOVUIPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION: return createCircularSectorFieldOfViewPresentation();
			case ApogyAddonsSensorsFOVUIPackage.CONICAL_FIELD_OF_VIEW_PRESENTATION: return createConicalFieldOfViewPresentation();
			case ApogyAddonsSensorsFOVUIPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION: return createRectangularFrustrumFieldOfViewPresentation();
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
	public ApogyAddonsSensorsFOVUIPackage getApogyAddonsSensorsFOVUIPackage() {
		return (ApogyAddonsSensorsFOVUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsSensorsFOVUIPackage getPackage() {
		return ApogyAddonsSensorsFOVUIPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsFOVUIFactoryImpl
