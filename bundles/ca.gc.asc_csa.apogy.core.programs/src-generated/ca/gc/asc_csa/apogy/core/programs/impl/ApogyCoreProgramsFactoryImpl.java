/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.core.programs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreProgramsFactoryImpl extends EFactoryImpl implements ApogyCoreProgramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreProgramsFactory init() {
		try {
			ApogyCoreProgramsFactory theApogyCoreProgramsFactory = (ApogyCoreProgramsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreProgramsPackage.eNS_URI);
			if (theApogyCoreProgramsFactory != null) {
				return theApogyCoreProgramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreProgramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsFactoryImpl() {
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
			case ApogyCoreProgramsPackage.APOGY_CORE_PROGRAMS_FACADE: return createApogyCoreProgramsFacade();
			case ApogyCoreProgramsPackage.TIME_INTERVAL: return createTimeInterval();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsFacade createApogyCoreProgramsFacade() {
		ApogyCoreProgramsFacadeImpl apogy__CoreProgramsFacade = new ApogyCoreProgramsFacadeImpl();
		return apogy__CoreProgramsFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsPackage getApogyCoreProgramsPackage() {
		return (ApogyCoreProgramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreProgramsPackage getPackage() {
		return ApogyCoreProgramsPackage.eINSTANCE;
	}

} //ApogyCoreProgramsFactoryImpl
