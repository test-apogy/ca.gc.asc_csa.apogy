/**
 */
package org.eclipse.symphony.core.invocator.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIFacade;
import org.eclipse.symphony.core.invocator.ui.Symphony__CoreInvocatorUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CoreInvocatorUIFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CoreInvocatorUIFacade {

	private static Symphony__CoreInvocatorUIFacade instance = null;
	
	public static Symphony__CoreInvocatorUIFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new Symphony__CoreInvocatorUIFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CoreInvocatorUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreInvocatorUIPackage.Literals.SYMPHONY_CORE_INVOCATOR_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void copyInitializationData(Context source, Context destination) throws Exception {
		
		if (source.getVariableImplementationsList().getVariableImplementations().size() != 
			destination.getVariableImplementationsList().getVariableImplementations().size()){
			throw new Exception("Contexts <" + source.getName() + "> and <" + destination.getName() + "> are not consistent");
		}
		
		Iterator<VariableImplementation> sourceVariableImplementations = source.getVariableImplementationsList().getVariableImplementations().iterator();
		Iterator<VariableImplementation> destinationVariableImplementations = destination.getVariableImplementationsList().getVariableImplementations().iterator();
		
		while (sourceVariableImplementations.hasNext()){			
			try{
				CompoundCommand command = new CompoundCommand();				
				copyInitializationData(sourceVariableImplementations.next(),
						destinationVariableImplementations.next(), command);				
				EditingDomain editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(source);
				editingDomain.getCommandStack().execute(command);
				
			}catch (Exception e){
				throw new Exception("Contexts <" + source.getName() + "> and <" + destination.getName() + "> are not consistent", e);
			}
		}
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void copyInitializationData(AbstractTypeImplementation source, AbstractTypeImplementation destination, CompoundCommand command) throws Exception {
		if (source.getHandlingType() != destination.getHandlingType()){
			throw new Exception();
		}
		if (source.getTypeMemberImplementations().size() != destination.getTypeMemberImplementations().size()){
			throw new Exception();
		}
	
		command.append(new SetCommand(
				AdapterFactoryEditingDomain.getEditingDomainFor(source), 
				destination, 
				Symphony__CoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA, 
				EcoreUtil.copy(source.getAbstractInitializationData())));		
				
		Iterator<TypeMemberImplementation> sourceImplementations = source.getTypeMemberImplementations().iterator();
		Iterator<TypeMemberImplementation> destinationImplementations = destination.getTypeMemberImplementations().iterator();		
		while (sourceImplementations.hasNext()){
			copyInitializationData(sourceImplementations.next(), destinationImplementations.next(), command);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CoreInvocatorUIPackage.SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT:
				try {
					copyInitializationData((Context)arguments.get(0), (Context)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Symphony__CoreInvocatorUIPackage.SYMPHONY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND:
				try {
					copyInitializationData((AbstractTypeImplementation)arguments.get(0), (AbstractTypeImplementation)arguments.get(1), (CompoundCommand)arguments.get(2));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CoreInvocatorUIFacadeImpl
