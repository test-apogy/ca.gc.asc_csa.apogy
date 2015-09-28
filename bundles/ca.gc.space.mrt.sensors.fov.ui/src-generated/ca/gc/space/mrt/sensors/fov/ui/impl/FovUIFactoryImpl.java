/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.fov.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.sensors.fov.ui.CircularSectorFieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.ConicalFieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.FieldOfViewPresentation;
import ca.gc.space.mrt.sensors.fov.ui.FovUIFactory;
import ca.gc.space.mrt.sensors.fov.ui.FovUIPackage;
import ca.gc.space.mrt.sensors.fov.ui.RectangularFrustrumFieldOfViewPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FovUIFactoryImpl extends EFactoryImpl implements FovUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FovUIFactory init() {
		try {
			FovUIFactory theFovUIFactory = (FovUIFactory)EPackage.Registry.INSTANCE.getEFactory(FovUIPackage.eNS_URI);
			if (theFovUIFactory != null) {
				return theFovUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FovUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FovUIFactoryImpl() {
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
			case FovUIPackage.FIELD_OF_VIEW_PRESENTATION: return createFieldOfViewPresentation();
			case FovUIPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_PRESENTATION: return createCircularSectorFieldOfViewPresentation();
			case FovUIPackage.CONICAL_FIELD_OF_VIEW_PRESENTATION: return createConicalFieldOfViewPresentation();
			case FovUIPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_PRESENTATION: return createRectangularFrustrumFieldOfViewPresentation();
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
	public FovUIPackage getFovUIPackage() {
		return (FovUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FovUIPackage getPackage() {
		return FovUIPackage.eINSTANCE;
	}

} //FovUIFactoryImpl
