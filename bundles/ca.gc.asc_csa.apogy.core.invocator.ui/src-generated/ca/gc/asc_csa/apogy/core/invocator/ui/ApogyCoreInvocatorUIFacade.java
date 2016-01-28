/**
 */
package ca.gc.asc_csa.apogy.core.invocator.ui;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getApogyCoreInvocatorUIFacade()
 * @model
 * @generated
 */
public interface ApogyCoreInvocatorUIFacade extends EObject {

	public static ApogyCoreInvocatorUIFacade INSTANCE = ApogyCoreInvocatorUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Copies the Initialization Data.
	 * @param source Reference to the source context.
	 * @param destination Reference to the destination context.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" sourceUnique="false" destinationUnique="false"
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
	 * @model exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" sourceUnique="false" destinationUnique="false" commandDataType="ca.gc.asc_csa.apogy.core.invocator.ui.CompoundCommand" commandUnique="false"
	 * @generated
	 */
	void copyInitializationData(AbstractTypeImplementation source, AbstractTypeImplementation destination, CompoundCommand command) throws Exception;
} // ApogyCoreInvocatorUIFacade
