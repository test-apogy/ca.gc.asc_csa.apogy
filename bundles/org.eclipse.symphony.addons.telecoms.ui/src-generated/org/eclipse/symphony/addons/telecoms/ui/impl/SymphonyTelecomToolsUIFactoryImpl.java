/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.telecoms.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyTelecomToolsUIFactoryImpl extends EFactoryImpl implements SymphonyTelecomToolsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymphonyTelecomToolsUIFactory init() {
		try {
			SymphonyTelecomToolsUIFactory theSymphonyTelecomToolsUIFactory = (SymphonyTelecomToolsUIFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyTelecomToolsUIPackage.eNS_URI);
			if (theSymphonyTelecomToolsUIFactory != null) {
				return theSymphonyTelecomToolsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyTelecomToolsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsUIFactoryImpl() {
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
			case SymphonyTelecomToolsUIPackage.ABSTRACT_ANTENNA_RADIATION_PATTERN_PRESENTATION: return createAbstractAntennaRadiationPatternPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAntennaRadiationPatternPresentation createAbstractAntennaRadiationPatternPresentation() {
		AbstractAntennaRadiationPatternPresentationImpl abstractAntennaRadiationPatternPresentation = new AbstractAntennaRadiationPatternPresentationImpl();
		return abstractAntennaRadiationPatternPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsUIPackage getSymphonyTelecomToolsUIPackage() {
		return (SymphonyTelecomToolsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymphonyTelecomToolsUIPackage getPackage() {
		return SymphonyTelecomToolsUIPackage.eINSTANCE;
	}

} //SymphonyTelecomToolsUIFactoryImpl
