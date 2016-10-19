/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.javascript.impl;

import ca.gc.asc_csa.apogy.core.programs.javascript.*;

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
public class ApogyCoreJavaScriptProgramsFactoryImpl extends EFactoryImpl implements ApogyCoreJavaScriptProgramsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreJavaScriptProgramsFactory init() {
		try {
			ApogyCoreJavaScriptProgramsFactory theApogyCoreJavaScriptProgramsFactory = (ApogyCoreJavaScriptProgramsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreJavaScriptProgramsPackage.eNS_URI);
			if (theApogyCoreJavaScriptProgramsFactory != null) {
				return theApogyCoreJavaScriptProgramsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreJavaScriptProgramsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreJavaScriptProgramsFactoryImpl() {
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
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM: return createJavaScriptProgram();
			case ApogyCoreJavaScriptProgramsPackage.JAVA_SCRIPT_PROGRAM_FACTORY: return createJavaScriptProgramFactory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptProgram createJavaScriptProgram() {
		JavaScriptProgramImpl javaScriptProgram = new JavaScriptProgramImpl();
		return javaScriptProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptProgramFactory createJavaScriptProgramFactory() {
		JavaScriptProgramFactoryImpl javaScriptProgramFactory = new JavaScriptProgramFactoryImpl();
		return javaScriptProgramFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreJavaScriptProgramsPackage getApogyCoreJavaScriptProgramsPackage() {
		return (ApogyCoreJavaScriptProgramsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreJavaScriptProgramsPackage getPackage() {
		return ApogyCoreJavaScriptProgramsPackage.eINSTANCE;
	}

} //ApogyCoreJavaScriptProgramsFactoryImpl
