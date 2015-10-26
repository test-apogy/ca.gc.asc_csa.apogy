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
public class Symphony__AddonsTelecomsUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsTelecomsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsTelecomsUIFactory init() {
		try {
			Symphony__AddonsTelecomsUIFactory theSymphony__AddonsTelecomsUIFactory = (Symphony__AddonsTelecomsUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsTelecomsUIPackage.eNS_URI);
			if (theSymphony__AddonsTelecomsUIFactory != null) {
				return theSymphony__AddonsTelecomsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsTelecomsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsTelecomsUIFactoryImpl() {
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
			case Symphony__AddonsTelecomsUIPackage.ABSTRACT_ANTENNA_RADIATION_PATTERN_PRESENTATION: return createAbstractAntennaRadiationPatternPresentation();
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
	public Symphony__AddonsTelecomsUIPackage getSymphony__AddonsTelecomsUIPackage() {
		return (Symphony__AddonsTelecomsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsTelecomsUIPackage getPackage() {
		return Symphony__AddonsTelecomsUIPackage.eINSTANCE;
	}

} //Symphony__AddonsTelecomsUIFactoryImpl
