/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl.EMFEcoreInvocatorUiFacadeImpl;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiPackage#getEMFEcoreInvocatorUiFacade()
 * @model
 * @generated
 */
public interface EMFEcoreInvocatorUiFacade extends EObject {

	public static EMFEcoreInvocatorUiFacade INSTANCE = EMFEcoreInvocatorUiFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies the Initialization Data.
	 * @param source Reference to the source context.
	 * @param destination Reference to the destination context.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.eclipse.emf.ecore.Exception" sourceUnique="false" destinationUnique="false"
	 * @generated
	 */
	void copyInitializationData(Context source, Context destination) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies the Initialization Data.
	 * @param source Reference to the source implementation.
	 * @param destination Reference to the destination implementation.
	 * @param command Reference to the stack command.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.eclipse.emf.ecore.Exception" sourceUnique="false" destinationUnique="false" commandDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.CompoundCommand" commandUnique="false"
	 * @generated
	 */
	void copyInitializationData(AbstractTypeImplementation source, AbstractTypeImplementation destination, CompoundCommand command) throws Exception;
} // EMFEcoreInvocatorUiFacade
