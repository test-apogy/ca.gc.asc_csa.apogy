/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.programs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreProgramsFactoryImpl extends EFactoryImpl implements Symphony__CoreProgramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CoreProgramsFactory init() {
		try {
			Symphony__CoreProgramsFactory theSymphony__CoreProgramsFactory = (Symphony__CoreProgramsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CoreProgramsPackage.eNS_URI);
			if (theSymphony__CoreProgramsFactory != null) {
				return theSymphony__CoreProgramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CoreProgramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreProgramsFactoryImpl() {
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
			case Symphony__CoreProgramsPackage.SYMPHONY_CORE_PROGRAMS_FACADE: return createSymphony__CoreProgramsFacade();
			case Symphony__CoreProgramsPackage.TIME_INTERVAL: return createTimeInterval();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreProgramsFacade createSymphony__CoreProgramsFacade() {
		Symphony__CoreProgramsFacadeImpl symphony__CoreProgramsFacade = new Symphony__CoreProgramsFacadeImpl();
		return symphony__CoreProgramsFacade;
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
	public Symphony__CoreProgramsPackage getSymphony__CoreProgramsPackage() {
		return (Symphony__CoreProgramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CoreProgramsPackage getPackage() {
		return Symphony__CoreProgramsPackage.eINSTANCE;
	}

} //Symphony__CoreProgramsFactoryImpl
