/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.geometry.paths.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode;
import org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIFactory;
import org.eclipse.symphony.addons.geometry.paths.ui.Symphony__AddonsGeometryPathsUIPackage;
import org.eclipse.symphony.addons.geometry.paths.ui.WayPointPathPresentation;
import org.eclipse.symphony.addons.geometry.paths.ui.WayPointPresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsGeometryPathsUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsGeometryPathsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsGeometryPathsUIFactory init() {
		try {
			Symphony__AddonsGeometryPathsUIFactory theSymphony__AddonsGeometryPathsUIFactory = (Symphony__AddonsGeometryPathsUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsGeometryPathsUIPackage.eNS_URI);
			if (theSymphony__AddonsGeometryPathsUIFactory != null) {
				return theSymphony__AddonsGeometryPathsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsGeometryPathsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsGeometryPathsUIFactoryImpl() {
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
			case Symphony__AddonsGeometryPathsUIPackage.WAY_POINT_PATH_PRESENTATION: return createWayPointPathPresentation();
			case Symphony__AddonsGeometryPathsUIPackage.WAY_POINT_PRESENTATION: return createWayPointPresentation();
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
			case Symphony__AddonsGeometryPathsUIPackage.PATH_PRESENTATION_MODE:
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
			case Symphony__AddonsGeometryPathsUIPackage.PATH_PRESENTATION_MODE:
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
	public Symphony__AddonsGeometryPathsUIPackage getSymphony__AddonsGeometryPathsUIPackage() {
		return (Symphony__AddonsGeometryPathsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsGeometryPathsUIPackage getPackage() {
		return Symphony__AddonsGeometryPathsUIPackage.eINSTANCE;
	}

} //Symphony__AddonsGeometryPathsUIFactoryImpl
