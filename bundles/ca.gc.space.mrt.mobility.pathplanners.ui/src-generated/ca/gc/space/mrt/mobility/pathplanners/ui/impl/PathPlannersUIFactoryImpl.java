/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.mobility.pathplanners.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.mobility.pathplanners.ui.CircularExclusionZonePresentation;
import ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIFactory;
import ca.gc.space.mrt.mobility.pathplanners.ui.PathPlannersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathPlannersUIFactoryImpl extends EFactoryImpl implements PathPlannersUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathPlannersUIFactory init() {
		try {
			PathPlannersUIFactory thePathPlannersUIFactory = (PathPlannersUIFactory)EPackage.Registry.INSTANCE.getEFactory(PathPlannersUIPackage.eNS_URI);
			if (thePathPlannersUIFactory != null) {
				return thePathPlannersUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PathPlannersUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannersUIFactoryImpl() {
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
			case PathPlannersUIPackage.CIRCULAR_EXCLUSION_ZONE_PRESENTATION: return createCircularExclusionZonePresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircularExclusionZonePresentation createCircularExclusionZonePresentation() {
		CircularExclusionZonePresentationImpl circularExclusionZonePresentation = new CircularExclusionZonePresentationImpl();
		return circularExclusionZonePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannersUIPackage getPathPlannersUIPackage() {
		return (PathPlannersUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PathPlannersUIPackage getPackage() {
		return PathPlannersUIPackage.eINSTANCE;
	}

} //PathPlannersUIFactoryImpl
