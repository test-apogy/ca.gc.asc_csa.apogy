/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMFEcoreInvocatorUiFacadeImpl extends MinimalEObjectImpl.Container implements EMFEcoreInvocatorUiFacade {

	private static EMFEcoreInvocatorUiFacade instance = null;
	
	public static EMFEcoreInvocatorUiFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new EMFEcoreInvocatorUiFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFEcoreInvocatorUiFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreInvocatorUiPackage.Literals.EMF_ECORE_INVOCATOR_UI_FACADE;
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
				EMFEcoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA, 
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
			case EMFEcoreInvocatorUiPackage.EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT:
				try {
					copyInitializationData((Context)arguments.get(0), (Context)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case EMFEcoreInvocatorUiPackage.EMF_ECORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND:
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

} //EMFEcoreInvocatorUiFacadeImpl
