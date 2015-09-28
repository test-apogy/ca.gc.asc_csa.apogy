/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.programs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InvocatorProgramsFactoryImpl extends EFactoryImpl implements InvocatorProgramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InvocatorProgramsFactory init() {
		try {
			InvocatorProgramsFactory theInvocatorProgramsFactory = (InvocatorProgramsFactory)EPackage.Registry.INSTANCE.getEFactory(InvocatorProgramsPackage.eNS_URI);
			if (theInvocatorProgramsFactory != null) {
				return theInvocatorProgramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InvocatorProgramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorProgramsFactoryImpl() {
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
			case InvocatorProgramsPackage.PROGRAM_FACADE: return createProgramFacade();
			case InvocatorProgramsPackage.TIME_INTERVAL: return createTimeInterval();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramFacade createProgramFacade() {
		ProgramFacadeImpl programFacade = new ProgramFacadeImpl();
		return programFacade;
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
	public InvocatorProgramsPackage getInvocatorProgramsPackage() {
		return (InvocatorProgramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InvocatorProgramsPackage getPackage() {
		return InvocatorProgramsPackage.eINSTANCE;
	}

} //InvocatorProgramsFactoryImpl
