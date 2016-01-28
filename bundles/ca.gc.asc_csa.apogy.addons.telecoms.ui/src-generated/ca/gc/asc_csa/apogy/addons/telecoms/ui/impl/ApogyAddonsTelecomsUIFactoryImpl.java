/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.telecoms.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.telecoms.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsTelecomsUIFactoryImpl extends EFactoryImpl implements ApogyAddonsTelecomsUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsTelecomsUIFactory init() {
		try {
			ApogyAddonsTelecomsUIFactory theApogyAddonsTelecomsUIFactory = (ApogyAddonsTelecomsUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsTelecomsUIPackage.eNS_URI);
			if (theApogyAddonsTelecomsUIFactory != null) {
				return theApogyAddonsTelecomsUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsTelecomsUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsTelecomsUIFactoryImpl() {
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
			case ApogyAddonsTelecomsUIPackage.ABSTRACT_ANTENNA_RADIATION_PATTERN_PRESENTATION: return createAbstractAntennaRadiationPatternPresentation();
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
	public ApogyAddonsTelecomsUIPackage getApogyAddonsTelecomsUIPackage() {
		return (ApogyAddonsTelecomsUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsTelecomsUIPackage getPackage() {
		return ApogyAddonsTelecomsUIPackage.eINSTANCE;
	}

} //ApogyAddonsTelecomsUIFactoryImpl
