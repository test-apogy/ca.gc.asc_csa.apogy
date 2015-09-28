/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.paths.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.geometry.paths.ui.PathPresentationMode;
import ca.gc.space.mrt.geometry.paths.ui.PathsUIFactory;
import ca.gc.space.mrt.geometry.paths.ui.PathsUIPackage;
import ca.gc.space.mrt.geometry.paths.ui.WayPointPathPresentation;
import ca.gc.space.mrt.geometry.paths.ui.WayPointPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathsUIFactoryImpl extends EFactoryImpl implements PathsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PathsUIFactory init() {
		try {
			PathsUIFactory thePathsUIFactory = (PathsUIFactory)EPackage.Registry.INSTANCE.getEFactory(PathsUIPackage.eNS_URI);
			if (thePathsUIFactory != null) {
				return thePathsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PathsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathsUIFactoryImpl() {
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
			case PathsUIPackage.WAY_POINT_PATH_PRESENTATION: return createWayPointPathPresentation();
			case PathsUIPackage.WAY_POINT_PRESENTATION: return createWayPointPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PathsUIPackage.PATH_PRESENTATION_MODE:
				return createPathPresentationModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PathsUIPackage.PATH_PRESENTATION_MODE:
				return convertPathPresentationModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPathPresentation createWayPointPathPresentation() {
		WayPointPathPresentationImpl wayPointPathPresentation = new WayPointPathPresentationImpl();
		return wayPointPathPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPresentation createWayPointPresentation() {
		WayPointPresentationImpl wayPointPresentation = new WayPointPresentationImpl();
		return wayPointPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPresentationMode createPathPresentationModeFromString(EDataType eDataType, String initialValue) {
		PathPresentationMode result = PathPresentationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathPresentationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathsUIPackage getPathsUIPackage() {
		return (PathsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PathsUIPackage getPackage() {
		return PathsUIPackage.eINSTANCE;
	}

} //PathsUIFactoryImpl
