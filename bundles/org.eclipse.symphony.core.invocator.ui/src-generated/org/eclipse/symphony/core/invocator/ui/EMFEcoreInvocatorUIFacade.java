/**
 */
package org.eclipse.symphony.core.invocator.ui;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.ui.impl.EMFEcoreInvocatorUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIPackage#getEMFEcoreInvocatorUIFacade()
 * @model
 * @generated
 */
public interface EMFEcoreInvocatorUIFacade extends EObject {

	public static EMFEcoreInvocatorUIFacade INSTANCE = EMFEcoreInvocatorUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies the Initialization Data.
	 * @param source Reference to the source context.
	 * @param destination Reference to the destination context.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.symphony.common.emf.Exception" sourceUnique="false" destinationUnique="false"
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
	 * @model exceptions="org.eclipse.symphony.common.emf.Exception" sourceUnique="false" destinationUnique="false" commandDataType="org.eclipse.symphony.core.invocator.ui.CompoundCommand" commandUnique="false"
	 * @generated
	 */
	void copyInitializationData(AbstractTypeImplementation source, AbstractTypeImplementation destination, CompoundCommand command) throws Exception;
} // EMFEcoreInvocatorUIFacade
