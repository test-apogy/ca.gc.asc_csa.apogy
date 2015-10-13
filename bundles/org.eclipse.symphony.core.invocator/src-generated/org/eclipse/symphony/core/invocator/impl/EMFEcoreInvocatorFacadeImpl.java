/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.emf.AbstractFeatureListNode;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.AbstractRootNode;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.AbstractResultValue;
import org.eclipse.symphony.core.invocator.AbstractType;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Activator;
import org.eclipse.symphony.core.invocator.AttributeResultValue;
import org.eclipse.symphony.core.invocator.AttributeValue;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.LocalTypesList;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallsList;
import org.eclipse.symphony.core.invocator.ReferenceResultValue;
import org.eclipse.symphony.core.invocator.RegisteredTypesList;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.core.invocator.TypeMember;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement;
import org.eclipse.symphony.core.invocator.TypesList;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.invocator.VariableImplementationsList;
import org.eclipse.symphony.core.invocator.Watch;
import org.eclipse.symphony.core.invocator.delegates.InvocatorDelegate;
import org.eclipse.symphony.core.invocator.delegates.InvocatorDelegateRegistry;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EMFEcoreInvocatorFacadeImpl#getActiveInvocatorSession <em>Active Invocator Session</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFEcoreInvocatorFacadeImpl extends MinimalEObjectImpl.Container
		implements EMFEcoreInvocatorFacade {
	/**
	 * The cached value of the '{@link #getActiveInvocatorSession() <em>Active Invocator Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveInvocatorSession()
	 * @generated
	 * @ordered
	 */
	protected InvocatorSession activeInvocatorSession;
	private static EMFEcoreInvocatorFacade instance = null;

	public static EMFEcoreInvocatorFacade getInstance() {
		if (instance == null) {
			instance = new EMFEcoreInvocatorFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFEcoreInvocatorFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreInvocatorPackage.Literals.EMF_ECORE_INVOCATOR_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getActiveInvocatorSession() {
		if (activeInvocatorSession != null && activeInvocatorSession.eIsProxy()) {
			InternalEObject oldActiveInvocatorSession = (InternalEObject)activeInvocatorSession;
			activeInvocatorSession = (InvocatorSession)eResolveProxy(oldActiveInvocatorSession);
			if (activeInvocatorSession != oldActiveInvocatorSession) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION, oldActiveInvocatorSession, activeInvocatorSession));
			}
		}
		return activeInvocatorSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession basicGetActiveInvocatorSession() {
		return activeInvocatorSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveInvocatorSession(InvocatorSession newActiveInvocatorSession) {
		InvocatorSession oldActiveInvocatorSession = activeInvocatorSession;
		activeInvocatorSession = newActiveInvocatorSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION, oldActiveInvocatorSession, activeInvocatorSession));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void exec(OperationCall operationCall, boolean saveResult) {

		/**
		 * 
		 * Select the proper delegate.
		 * 
		 */
		Variable variable = operationCall.getVariable();
		Type variableType = variable.getVariableType();
		if (operationCall.getTypeMemberReferenceListElement() != null) {
			variableType = operationCall.getTypeMemberReferenceListElement()
					.getLeafElement().getTypeMember().getMemberType();
		}

		InvocatorDelegate delegate = InvocatorDelegateRegistry.getInstance()
				.getInvocatorDelegate(variableType.getClass());

		/**
		 * 
		 * Finds the object instance on which to call the operation.
		 * 
		 */
		EObject instance = getInstance(operationCall);

		/**
		 * 
		 * Invoke the operation.
		 * 
		 */
		if (instance == null) {
			Logger.INSTANCE.log(Activator.ID, this, "The instance (or sub-instance) of variable <"
					+ operationCall.getVariable().getName() + "> is null !",
					EventSeverity.ERROR);
		} else {
			// If no delegate, fail.
			if (delegate == null) {
				Logger.INSTANCE.log(Activator.ID, this,
						"Cannot find an InvocatorDelegate for instance of type <"
								+ instance.getClass() + "> !",
						EventSeverity.ERROR);
			} else {
				delegate.execute(instance, operationCall, saveResult);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void exec(OperationCall operationCall) {
		exec(operationCall, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void exec(OperationCallsList operationCallsList) {
		for (OperationCall operationCall : operationCallsList
				.getOperationCalls()) {
			exec(operationCall);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractResultValue createAbstractResultValue(Object value) {
		if (value instanceof EObject && value != null) {
			ReferenceResultValue resultValue = EMFEcoreInvocatorFactory.eINSTANCE
					.createReferenceResultValue();
			resultValue.setValue((EObject) value);
			return resultValue;
		} else if (value instanceof Object || value == null) {
			AttributeValue attributeValue = EMFEcoreInvocatorFactory.eINSTANCE
					.createAttributeValue();
			attributeValue.setObject(value);
			AttributeResultValue resultValue = EMFEcoreInvocatorFactory.eINSTANCE
					.createAttributeResultValue();
			resultValue.setValue(attributeValue);
			return resultValue;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Watch resolveWatch(AbstractFeatureNode abstractFeatureNode) {
		Watch watch = null;

		if (abstractFeatureNode != null) {
			AbstractRootNode root = EMFEcoreFacade.INSTANCE
					.getFeatureRoot(abstractFeatureNode);

			if (root != null) {
				if (root.eContainer() instanceof Watch) {
					watch = (Watch) root.eContainer();
				} else if (root.eContainer() instanceof TypeMemberReferenceTreeElement) {
					TypeMemberReferenceTreeElement rootRef = (TypeMemberReferenceTreeElement) root
							.eContainer();
					watch = resolveWatch(rootRef);
				}
			}

		}

		return watch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Watch resolveWatch(
			TypeMemberReferenceTreeElement typeMemberReferenceTreeElement) {
		Watch watch = null;

		TypeMemberReferenceTreeElement element = typeMemberReferenceTreeElement;

		while (element != null && watch == null) {
			if (element.eContainer() instanceof Watch) {
				watch = (Watch) element.eContainer();
			} else {
				element = element.getParent();
			}
		}

		return watch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Object getValue(AbstractFeatureNode abstractFeatureNode) {
		Object object = null;
		AbstractRootNode root = EMFEcoreFacade.INSTANCE
				.getFeatureRoot(abstractFeatureNode);

		if (root.eContainer() instanceof Watch) {
			Watch watch = (Watch) root.eContainer();
			EObject sourceObject = EMFEcoreInvocatorFacade.INSTANCE
					.getInstance(watch.getVariable());
			if (sourceObject != null) {
				object = EMFEcoreFacade.INSTANCE.resolve(sourceObject,
						abstractFeatureNode);
			}
		} else if (root.eContainer() instanceof TypeMemberReferenceTreeElement) {
			TypeMemberReferenceTreeElement element = (TypeMemberReferenceTreeElement) root
					.eContainer();
			EObject sourceObject = EMFEcoreInvocatorFacade.INSTANCE
					.getInstance(element);

			if (sourceObject != null) {
				object = EMFEcoreFacade.INSTANCE.resolve(sourceObject,
						abstractFeatureNode);
			}
		}

		return object;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EObject getInstance(Variable variable) {
		EObject eObject = null;

		Environment environment = variable.getEnvironment();
		if (environment != null) {
			Context context = environment.getActiveContext();
			if (context != null) {
				VariableImplementation variableImplementation = context.getVariableImplementationsList().getVariableImplementation(variable);
				
				eObject = variableImplementation == null ? null : variableImplementation.getInstance();
			}
		}

		return eObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EClass getInstanceClass(Variable variable) {
		return variable.getVariableType().getInterfaceClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TypeApiAdapter getTypeApiAdapter(VariableFeatureReference variableFeatureReference) 
	{
		TypeApiAdapter typeApiAdapter = null;
		
		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		
		if(variable != null && environment != null && context != null)
		{			
			if(variableFeatureReference.getFeatureRoot() == null && variableFeatureReference.getTypeMemberReferenceListElement() == null)
			{
				typeApiAdapter = getTypeApiAdapterForNullFeatureRootAndNullTypeMember(variableFeatureReference);
			}
			else if(variableFeatureReference.getFeatureRoot() != null && variableFeatureReference.getTypeMemberReferenceListElement() == null)
			{
				typeApiAdapter = getTypeApiAdapterForFeatureRootAndNullTypeMember(variableFeatureReference);
			}
			else if(variableFeatureReference.getFeatureRoot() == null && variableFeatureReference.getTypeMemberReferenceListElement() != null)
			{
				typeApiAdapter = getTypeApiAdapterForNullFeatureRootAndTypeMember(variableFeatureReference);
			}
			else if(variableFeatureReference.getFeatureRoot() != null && variableFeatureReference.getTypeMemberReferenceListElement() != null)
			{
				typeApiAdapter = getTypeApiAdapterForFeatureRootAndTypeMember(variableFeatureReference);
			}
		}
		
		return typeApiAdapter;
	}
	
	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having both FeatureRoot and TypeMemberReferenceListElement being null.
	 * This is the case where the VariableFeatureReference is referring only to the variable.
	 * @param variableFeatureReference The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForNullFeatureRootAndNullTypeMember(VariableFeatureReference variableFeatureReference)
	{
		TypeApiAdapter typeApiAdapter = null;
		
		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		
		try
		{
			typeApiAdapter = context.getVariableImplementationsList().getVariableImplementation(variable).getAdapterInstance();
		}
		catch(Throwable t)
		{
		}
		
		return typeApiAdapter;
	}
	
	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having the TypeMemberReferenceListElement being null.
	 * This is the case where the VariableFeatureReference is referring to a feature of the variable.
	 * @param variableFeatureReference The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForFeatureRootAndNullTypeMember(VariableFeatureReference variableFeatureReference)
	{
		TypeApiAdapter typeApiAdapter = null;
		
		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		
		// Set the typeApi initially to the one associated with the variable. 
		typeApiAdapter = context.getVariableImplementationsList().getVariableImplementation(variable).getAdapterInstance();
		
		// Sets source object to variable instance as default.
		EObject sourceEObject = (EObject) getInstance (variable);

		// Goes through the list of features.
		AbstractTypeImplementation rootATI = context.getVariableImplementationsList().getVariableImplementation(variable);
		
		// Traverse the Feature List until no API is found.
		ListRootNode rootNode = variableFeatureReference.getFeatureRoot();		
		AbstractFeatureListNode currentNode = rootNode;
		
		while(currentNode != null)
		{
			Object object = EMFEcoreFacade.INSTANCE.resolve(sourceEObject, currentNode);
			
			if(object instanceof EObject)
			{
				EObject eObject = (EObject) object;
				
				// Check to see if the eObject has an TypeApiAdapter provided for it.							
				Iterator<TypeMemberImplementation> it = rootATI.getTypeMemberImplementations().iterator();
				while(it.hasNext())
				{
					AbstractTypeImplementation ati = it.next();
					if(ati.getInstance() == eObject)
					{
						if(ati.getAdapterInstance() != null)
						{
							typeApiAdapter = ati.getAdapterInstance();
						}
					}
				}
			}						
			currentNode = currentNode.getChild();
		}
		
		return typeApiAdapter;
	}
	
	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having a null FeatureRoot and a not null TypeMemberReferenceListElement.
	 * This is the case where the VariableFeatureReference is referring only to a variable's type member.
	 * @param variableFeatureReference The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForNullFeatureRootAndTypeMember(VariableFeatureReference variableFeatureReference)
	{
		TypeApiAdapter typeApiAdapter = null;
			
		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		
		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference.getTypeMemberReferenceListElement();
		
		// Goes down the list of typeMember, keeping the most specific TypeApiAdapter.
		TypeMemberImplementation currentTypeMemberImplementation = null;
		if(context != null)
		{			
			VariableImplementationsList variableImplementationsList = context.getVariableImplementationsList() ;
			if(variableImplementationsList!= null)
			{
				VariableImplementation variableImplementation = variableImplementationsList.getVariableImplementation(variable);
				if(variableImplementation != null)
				{
					currentTypeMemberImplementation = variableImplementation.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());
				}
			}
		}
//		TypeMemberImplementation currentTypeMemberImplementation = context
//				.getVariableImplementationsList()
//				.getVariableImplementation(variable)
//				.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());


		if(currentTypeMemberImplementation != null)
		{
			TypeApiAdapter currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
			if(currentTypeApiAdapter != null) 
			{
				typeApiAdapter = currentTypeApiAdapter;
			}
			
			while (!currentTypeMemberReferenceListElement.isLeaf()) 
			{
				currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement.getChild();
				currentTypeMemberImplementation = currentTypeMemberImplementation.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());
				
				currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
				if(currentTypeApiAdapter != null) 
				{
					typeApiAdapter = currentTypeApiAdapter;						
				}
			}	
		}
		return typeApiAdapter;
	}
	
	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having both a FeatureRoot and a TypeMemberReferenceListElement defined.
	 * This is the case where the VariableFeatureReference is referring to a variable's type member feature.
	 * @param variableFeatureReference The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForFeatureRootAndTypeMember(VariableFeatureReference variableFeatureReference)
	{
		TypeApiAdapter typeApiAdapter = null;
		
		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		
		EObject sourceEObject = null;
		
		// First, finds the TypeApiAdapter referenced by the TypeMemberReferenceList.
		
		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference.getTypeMemberReferenceListElement();
		
		// Goes down the list of typeMember, keeping the most specific TypeApiAdapter.
		TypeMemberImplementation currentTypeMemberImplementation = context
				.getVariableImplementationsList()
				.getVariableImplementation(variable)
				.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

		TypeApiAdapter currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
		if(currentTypeApiAdapter != null) 
		{
			typeApiAdapter = currentTypeApiAdapter;
			sourceEObject = typeApiAdapter.getInstance();
		}
						
		while (!currentTypeMemberReferenceListElement.isLeaf()) 
		{
			currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement.getChild();
			currentTypeMemberImplementation = currentTypeMemberImplementation.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());
			
			currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
			if(currentTypeApiAdapter != null) 
			{
				typeApiAdapter = currentTypeApiAdapter;	
				
				sourceEObject = typeApiAdapter.getInstance();
			}
		}	
				
		// Then finds the TypeApiAdapter associated with the source object.
		if(sourceEObject != null)
		{
			// Goes through the list of features.
			AbstractTypeImplementation rootATI = context.getVariableImplementationsList().getVariableImplementation(variable);
			
			// Traverse the Feature List until no API is found.
			ListRootNode rootNode = variableFeatureReference.getFeatureRoot();		
			AbstractFeatureListNode currentNode = rootNode;
			
			while(currentNode != null)
			{
				Object object = EMFEcoreFacade.INSTANCE.resolve(sourceEObject, currentNode);
				
				if(object instanceof EObject)
				{
					EObject eObject = (EObject) object;
					
					// Check to see if the eObject has an TypeApiAdapter provided for it.							
					Iterator<TypeMemberImplementation> it = rootATI.getTypeMemberImplementations().iterator();
					while(it.hasNext())
					{
						AbstractTypeImplementation ati = it.next();
						if(ati.getInstance() == eObject)
						{
							if(ati.getAdapterInstance() != null)
							{
								typeApiAdapter = ati.getAdapterInstance();
							}
						}
					}
				}						
				currentNode = currentNode.getChild();
			}			
		}
				
		return typeApiAdapter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EObject getInstance(VariableFeatureReference variableFeatureReference) {
		EObject eObjectInstance = null;

		if (variableFeatureReference.getVariable() != null) 
		{
			Variable variable = variableFeatureReference.getVariable();
			if (variableFeatureReference.getTypeMemberReferenceListElement() != null) 
			{
				eObjectInstance = getTypeMemberInstance(variableFeatureReference);
			} 
			else 
			{
				eObjectInstance = getInstance(variable);
			}
			
			if (eObjectInstance != null){
				if (variableFeatureReference.getFeatureRoot() != null) 
				{
					Object tmpObject = EMFEcoreFacade.INSTANCE.resolve(
								eObjectInstance, EMFEcoreFacade.INSTANCE
										.getLeaf(variableFeatureReference
												.getFeatureRoot()));
					
					if (tmpObject instanceof EObject){
						eObjectInstance = (EObject) tmpObject;
					}
				}
			}
		}

		return eObjectInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EObject getTypeMemberInstance(
			VariableFeatureReference variableFeatureReference) {
		EObject typeMemberInstance = null;

		if (variableFeatureReference.getTypeMemberReferenceListElement() != null) {
			Variable variable = variableFeatureReference.getVariable();
			TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference
					.getTypeMemberReferenceListElement();

			Environment environment = variable.getEnvironment();
			if (environment != null) {
				Context context = environment.getActiveContext();
				if (context != null) {
					VariableImplementationsList variableImplementationsList = context.getVariableImplementationsList();
					
					if (variableImplementationsList != null){
						VariableImplementation variableImplementation = variableImplementationsList.getVariableImplementation(variable);
						if (variableImplementation != null && currentTypeMemberReferenceListElement != null){
							TypeMemberImplementation currentTypeMemberImplementation = variableImplementation.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

							while (!currentTypeMemberReferenceListElement.isLeaf()) {
								currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement
										.getChild();
								currentTypeMemberImplementation = currentTypeMemberImplementation
										.getTypeMemberImplementation(currentTypeMemberReferenceListElement
												.getTypeMember());
							}
							typeMemberInstance = currentTypeMemberImplementation
									.getInstance();						
						}
					}
				}
			}
		}

		return typeMemberInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Object getEMFFeatureValue(
			VariableFeatureReference variableFeatureReference) {
		Object featureValue = null;

		if (variableFeatureReference.getVariable() != null
				&& variableFeatureReference.getFeatureRoot() != null) {
			Variable variable = variableFeatureReference.getVariable();
			EObject eObject = getTypeMemberInstance(variableFeatureReference);
			if (eObject == null) {
				eObject = getInstance(variable);
			}

			if (eObject != null) {
				featureValue = EMFEcoreFacade.INSTANCE.resolve(eObject,
						EMFEcoreFacade.INSTANCE
								.getLeaf(variableFeatureReference
										.getFeatureRoot()));
			}
		}

		return featureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EClass getInstanceClass(VariableFeatureReference variableFeatureReference) 
	{
		EClass eClass = null;
		Variable variable = variableFeatureReference.getVariable();
		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference.getTypeMemberReferenceListElement();
		AbstractFeatureListNode featureNode = EMFEcoreFacade.INSTANCE.getLeaf(variableFeatureReference.getFeatureRoot());
		
		if (featureNode != null && featureNode instanceof AbstractFeatureSpecifier){
			AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) featureNode;
			EClassifier eClassifier = featureSpecifier.getStructuralFeature().getEType();
			if (eClassifier instanceof EClass){
				eClass = (EClass) eClassifier;	
			}						
		}
		
		if(eClass == null && 
			   currentTypeMemberReferenceListElement != null &&
			   currentTypeMemberReferenceListElement.getLeafElement() != null &&
			   currentTypeMemberReferenceListElement.getLeafElement().getTypeMember() != null &&
			   currentTypeMemberReferenceListElement.getLeafElement().getTypeMember().getMemberType() != null){
			eClass = currentTypeMemberReferenceListElement.getLeafElement().getTypeMember().getMemberType().getInterfaceClass();
		}
		
		if (eClass == null){
			eClass = getInstanceClass(variable);
		}
				
		return eClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EObject getInstance(
			TypeMemberReferenceTreeElement typeMemberReferenceTreeElement) {
		EObject eObject = null;

		Watch watch = resolveWatch(typeMemberReferenceTreeElement);
		Variable variable = watch.getVariable();

		// Creates an list of ancestry.
		List<TypeMemberReferenceTreeElement> ancestries = new ArrayList<TypeMemberReferenceTreeElement>();

		TypeMemberReferenceTreeElement t = typeMemberReferenceTreeElement;
		while (t.getParent() != null) {
			t = t.getParent();
			ancestries.add(0, t);
		}

		// Gets the active context.
		Context activeContext = watch.getWatchesList()
				.getWatchesListsContainer().getToolsList()
				.getInvocatorSession().getEnvironment().getActiveContext();

		if (activeContext != null) {
			AbstractTypeImplementation typeMemberImplementations = activeContext
					.getVariableImplementationsList()
					.getVariableImplementation(variable);

			Iterator<TypeMemberReferenceTreeElement> it = ancestries.iterator();
			while (it.hasNext() && typeMemberImplementations != null) {
				TypeMemberReferenceTreeElement element = it.next();
				typeMemberImplementations = typeMemberImplementations
						.getTypeMemberImplementation(element.getTypeMember());
			}

			TypeMemberImplementation typeMemberImplementation = typeMemberImplementations
					.getTypeMemberImplementation(typeMemberReferenceTreeElement
							.getTypeMember());
			if (typeMemberImplementation != null) {
				eObject = typeMemberImplementation.getInstance();
			}
		}
		return eObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(OperationCall operationCall) 
	{				
		AbstractTypeImplementation result = null;

		Variable variable = operationCall.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = operationCall.getTypeMemberReferenceListElement();
		
		// If not Type Member is defined.
		if (currentTypeMemberReferenceListElement == null) 
		{
			if(operationCall.getFeatureRoot() != null)
			{						
				AbstractTypeImplementation ati = getAbstractTypeImplementationForTypeAttribute(operationCall);
				
				if(ati != null) return ati;			
			}
			result = context.getVariableImplementationsList().getVariableImplementation(variable);						
		} 
		else 
		{
			/* Get the TypeMemberImplementation. */
			TypeMemberImplementation currentTypeMemberImplementation = context
					.getVariableImplementationsList()
					.getVariableImplementation(variable)
					.getTypeMemberImplementation(
							currentTypeMemberReferenceListElement
									.getTypeMember());

			while (!currentTypeMemberReferenceListElement.isLeaf()) 
			{
				currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement.getChild();
				currentTypeMemberImplementation = currentTypeMemberImplementation.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());
			}
			result = currentTypeMemberImplementation;
		}
		return result;
	}	
	

	/**
	 * Attempts to find an AbstractTypeImplementation associated with a specified OperationCall that target an attribute of a type.
	 * @param operationCall The OperationCall.	 
	 * @return The AbstractTypeImplementation, null if none is found.
	 */
	private AbstractTypeImplementation getAbstractTypeImplementationForTypeAttribute(OperationCall operationCall)
	{		
		Variable variable = operationCall.getVariable();	
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		
		// Initialize the result with the AbstractTypeImplementation associated with the variable.
		AbstractTypeImplementation result = context.getVariableImplementationsList().getVariableImplementation(variable);
						
		// Gets the source EObject		
		EObject source = (EObject) getInstance (variable);
		
		// Traverse the Feature List until no API is found.
		ListRootNode rootNode = operationCall.getFeatureRoot();		
		AbstractFeatureListNode currentNode = rootNode;
		VariableImplementation vi = context.getVariableImplementationsList().getVariableImplementation(variable);
		
		while(currentNode != null)
		{			
			Object object = EMFEcoreFacade.INSTANCE.resolve(source, currentNode);
			
			if(object instanceof EObject)
			{
				EObject eObject = (EObject) object;				
				AbstractTypeImplementation ati = findAbstractTypeImplementation(vi, eObject);
				if(ati != null) result = ati;				
			}
			
			currentNode = currentNode.getChild();
		}
		
		return result;
	}
	
	/**
	 * Attempts to find an AbstractTypeImplementation associated with a specified EObject instance.
	 * @param typeImplementation The root typeImplementation.
	 * @param eObjectInstance The EObject instance.
	 * @return The AbstractTypeImplementation, null if none is found.
	 */
	protected AbstractTypeImplementation findAbstractTypeImplementation(AbstractTypeImplementation typeImplementation, final EObject eObjectInstance)
	{		
		if(typeImplementation.getInstance() == eObjectInstance)
		{
			return typeImplementation;
		}
		else
		{
			AbstractTypeImplementation result = null;
			Iterator<TypeMemberImplementation> it = typeImplementation.getTypeMemberImplementations().iterator();
			while(result == null && it.hasNext())
			{
				AbstractTypeImplementation ti = it.next();
				
				System.out.println("it : " + ti.getInstance());
				
				result = findAbstractTypeImplementation(ti, eObjectInstance);
			}
			return result;
		}				
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(Variable variable,
			AbstractType elementType) {
		AbstractTypeImplementation result = null;
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		VariableImplementation variableImplementation = context
				.getVariableImplementationsList().getVariableImplementation(
						variable);

		if (variableImplementation.getHandlingType() == elementType) {
			result = variableImplementation;
		} else {
			result = getTypeMemberImplementation(variableImplementation
					.getTypeMemberImplementations().iterator(), elementType);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(Variable variable) {
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		return context.getVariableImplementationsList()
				.getVariableImplementation(variable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TypeMemberReferenceListElement createTypeMemberReferences(TypeMember[] typeMembers) {
		TypeMemberReferenceListElement currentElement = null;
		for (int i = 0; i < typeMembers.length; i++) {
			TypeMemberReferenceListElement newElement = EMFEcoreInvocatorFactory.eINSTANCE
					.createTypeMemberReferenceListElement();
			newElement.setTypeMember(typeMembers[i]);
			if (currentElement != null) {
				currentElement.setChild(newElement);
			}
			currentElement = newElement;
		}
		return currentElement.getRootElement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(
			Environment environment, String fullyQualifiedName) {
		AbstractTypeImplementation result = null;
		String[] tokens = fullyQualifiedName.split("\\.");

		// Get the variable first.
		VariableImplementation variableImplementation = null;
		if (environment.getActiveContext() != null) {
			VariableImplementationsList variableImplementationsList = environment
					.getActiveContext().getVariableImplementationsList();
			if (variableImplementationsList != null) {
				String variableName = tokens.length == 0 ? fullyQualifiedName
						: tokens[0];
				variableImplementation = variableImplementationsList
						.getVariableImplementation(variableName);
			}
		}

		// If user specified the variable and it is found then return the
		// result.
		if (variableImplementation != null && tokens.length == 0) {
			result = variableImplementation;
		} else {
			// Search recursively the tokens.
			int tokenCounter = 1; // 0 means the variable.
			AbstractTypeImplementation currentTypeImplementation = variableImplementation;
			while (tokenCounter < tokens.length
					&& currentTypeImplementation != null) {
				currentTypeImplementation = currentTypeImplementation
						.getTypeMemberImplementation(tokens[tokenCounter]);
				tokenCounter++;
			}

			if (currentTypeImplementation != null
					&& tokenCounter == tokens.length) {
				result = currentTypeImplementation;
			}
		}

		return result;
	}

	protected TypeMemberImplementation getTypeMemberImplementation(
			Iterator<TypeMemberImplementation> typeMemberImplementations,
			AbstractType elementType) {
		TypeMemberImplementation result = null;

		while (typeMemberImplementations.hasNext() && result == null) {
			TypeMemberImplementation typeMemberImplementation = typeMemberImplementations
					.next();
			if (typeMemberImplementation.getTypeMember() == elementType) {
				result = typeMemberImplementation;
			} else {
				result = getTypeMemberImplementation(typeMemberImplementation
						.getTypeMemberImplementations().iterator(), elementType);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getFullyQualifiedName(
			TypeMemberReferenceTreeElement typeMemberReferenceTreeElement) {
		if (typeMemberReferenceTreeElement != null) {
			String fullyQualifiedName = new String();
			List<TypeMemberReferenceTreeElement> lineage = new ArrayList<TypeMemberReferenceTreeElement>();

			TypeMemberReferenceTreeElement t = typeMemberReferenceTreeElement;
			while (t != null) {
				lineage.add(0, t);
				t = t.getParent();
			}

			Iterator<TypeMemberReferenceTreeElement> it = lineage.iterator();
			while (it.hasNext()) {
				TypeMemberReferenceTreeElement element = it.next();
				fullyQualifiedName += element.getTypeMember().getName();
				if (it.hasNext())
					fullyQualifiedName += ".";
			}

			// Add variable name
			Watch watch = resolveWatch(typeMemberReferenceTreeElement);
			if (watch != null && watch.getVariable() != null) {
				fullyQualifiedName = watch.getVariable().getName() + "."
						+ fullyQualifiedName;
			}

			return fullyQualifiedName;
		} else {
			return null;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getFullyQualifiedName(AbstractFeatureNode abstractFeatureNode) {
		if (abstractFeatureNode != null) {
			String fullyQualifiedName = new String();
			AbstractRootNode root = EMFEcoreFacade.INSTANCE
					.getFeatureRoot(abstractFeatureNode);

			if (root.eContainer() instanceof Watch) {
				Watch watch = (Watch) root.eContainer();
				fullyQualifiedName += watch.getVariable().getName();
				fullyQualifiedName += "."
						+ EMFEcoreFacade.INSTANCE
								.getAncestriesString(abstractFeatureNode);

			} else if (root.eContainer() instanceof TypeMemberReferenceTreeElement) {
				TypeMemberReferenceTreeElement typeMemberReferenceTreeElement = (TypeMemberReferenceTreeElement) root
						.eContainer();
				fullyQualifiedName = getFullyQualifiedName(typeMemberReferenceTreeElement);
				fullyQualifiedName += "."
						+ EMFEcoreFacade.INSTANCE
								.getAncestriesString(abstractFeatureNode);
			}

			return fullyQualifiedName;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<TypeMemberImplementation> createTypeMemberImplementations(
			Type variableType) {
		List<TypeMemberImplementation> typeMemberImplementations = new ArrayList<TypeMemberImplementation>();

		Iterator<TypeMember> typeMembers = variableType.getMembers().iterator();
		while (typeMembers.hasNext()) {
			TypeMember typeMember = typeMembers.next();
			TypeMemberImplementation typeMemberImplementation = EMFEcoreInvocatorFactory.eINSTANCE
					.createTypeMemberImplementation();
			typeMemberImplementation.setTypeMember(typeMember);

			/** Check sub-type members. */
			List<TypeMemberImplementation> subTypeMemberImplementations = createTypeMemberImplementations(typeMember
					.getMemberType());
			if (!subTypeMemberImplementations.isEmpty()) {
				typeMemberImplementation.getTypeMemberImplementations().addAll(
						subTypeMemberImplementations);
			}

			typeMemberImplementations.add(typeMemberImplementation);
		}
		return typeMemberImplementations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void initVariableInstances(Environment environment) {
		Iterator<Variable> variables = environment.getVariablesList()
				.getVariables().iterator();

		while (variables.hasNext()) {
			Variable variable = variables.next();
			InvocatorDelegate invocatorDelegate = InvocatorDelegateRegistry
					.getInstance().getInvocatorDelegate(
							variable.getVariableType().getClass());

			invocatorDelegate.newInstance(environment, variable);
		}

		/** Adjust the creation and disposal dates. */
		environment.getActiveContext().setInstancesCreationDate(new Date());
		environment.getActiveContext().setInstancesDisposalDate(null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void disposeVariableInstances(Environment environment) {

		Iterator<Variable> variables = environment.getVariablesList()
				.getVariables().iterator();

		while (variables.hasNext()) {
			Variable variable = variables.next();
			InvocatorDelegate invocatorDelegate = InvocatorDelegateRegistry
					.getInstance().getInvocatorDelegate(
							variable.getVariableType().getClass());

			invocatorDelegate.dispose(environment, variable);
		}

		environment.getActiveContext().setInstancesDisposalDate(new Date());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public OperationCall getOperationCallContainer(
			TypeMemberReferenceListElement typeMemberReferenceListElement) {
		OperationCall operationCall = null;
		if (typeMemberReferenceListElement.isRoot()) {
			EObject container = typeMemberReferenceListElement.eContainer();
			if (container != null & container instanceof OperationCall) {
				operationCall = (OperationCall) container;
			}
		}

		return operationCall;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void applyInitializationData(Environment environment) {
		for (Variable variable : environment.getVariablesList().getVariables()) {
			applyInitializationData(variable);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void collectInitializationData(Environment environment) {
		for (Variable variable : environment.getVariablesList().getVariables()) {
			collectInitializationData(variable);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void applyInitializationData(Variable variable) {
		InvocatorDelegate delegate = InvocatorDelegateRegistry.getInstance()
				.getInvocatorDelegate(variable.getVariableType().getClass());

		// If no delegate, fail.
		if (delegate == null) {
			Logger.INSTANCE.log(Activator.ID, this,
					"Cannot find an InvocatorDelegate for instance of type <"
							+ instance.getClass() + "> !",
					EventSeverity.ERROR);
		} else {
			delegate.applyInitializationData(variable);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void collectInitializationData(Variable variable) {

		InvocatorDelegate delegate = InvocatorDelegateRegistry.getInstance()
				.getInvocatorDelegate(variable.getVariableType().getClass());

		// If no delegate, fail.
		if (delegate == null) {
			Logger.INSTANCE.log(Activator.ID, this,
					"Cannot find an InvocatorDelegate for instance of type <"
							+ instance.getClass() + "> !",
					EventSeverity.ERROR);
		} else {
			delegate.collectInitializationData(variable);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void loadRegisteredTypes(InvocatorSession session) {
		Environment environment = session.getEnvironment();
		if (environment != null){
			TypesList typesList = environment.getTypesList();
			if (typesList != null){
				RegisteredTypesList registeredTypesList = typesList.getRegisteredTypes();
				if (registeredTypesList != null){
					registeredTypesList.getTypes();
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<Type> getAllTypes(Environment environment) {
		List<Type> types = new ArrayList<Type>();
		
		TypesList typesList = environment.getTypesList();
		
		if (typesList != null){
			LocalTypesList localTypesList = typesList.getLocalTypes();
			if (localTypesList != null){
				types.addAll(localTypesList.getTypes());
			}

			RegisteredTypesList registeredTypesList = typesList.getRegisteredTypes();
			if (registeredTypesList != null){
				types.addAll(registeredTypesList.getTypes());
			}
		}
		
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				if (resolve) return getActiveInvocatorSession();
				return basicGetActiveInvocatorSession();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				setActiveInvocatorSession((InvocatorSession)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				setActiveInvocatorSession((InvocatorSession)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				return activeInvocatorSession != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL:
				exec((OperationCall)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL_BOOLEAN:
				exec((OperationCall)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___EXEC__OPERATIONCALLSLIST:
				exec((OperationCallsList)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___CREATE_ABSTRACT_RESULT_VALUE__OBJECT:
				return createAbstractResultValue(arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___RESOLVE_WATCH__ABSTRACTFEATURENODE:
				return resolveWatch((org.eclipse.symphony.common.emf.AbstractFeatureNode)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___RESOLVE_WATCH__TYPEMEMBERREFERENCETREEELEMENT:
				return resolveWatch((TypeMemberReferenceTreeElement)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_VALUE__ABSTRACTFEATURENODE:
				return getValue((org.eclipse.symphony.common.emf.AbstractFeatureNode)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLE:
				return getInstance((Variable)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLE:
				return getInstanceClass((Variable)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_API_ADAPTER__VARIABLEFEATUREREFERENCE:
				return getTypeApiAdapter((VariableFeatureReference)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLEFEATUREREFERENCE:
				return getInstance((VariableFeatureReference)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_MEMBER_INSTANCE__VARIABLEFEATUREREFERENCE:
				return getTypeMemberInstance((VariableFeatureReference)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_EMF_FEATURE_VALUE__VARIABLEFEATUREREFERENCE:
				return getEMFFeatureValue((VariableFeatureReference)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLEFEATUREREFERENCE:
				return getInstanceClass((VariableFeatureReference)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_INSTANCE__TYPEMEMBERREFERENCETREEELEMENT:
				return getInstance((TypeMemberReferenceTreeElement)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__OPERATIONCALL:
				return getTypeImplementation((OperationCall)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE_ABSTRACTTYPE:
				return getTypeImplementation((Variable)arguments.get(0), (AbstractType)arguments.get(1));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE:
				return getTypeImplementation((Variable)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_REFERENCES__TYPEMEMBER:
				return createTypeMemberReferences((TypeMember[])arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__ENVIRONMENT_STRING:
				return getTypeImplementation((Environment)arguments.get(0), (String)arguments.get(1));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__TYPEMEMBERREFERENCETREEELEMENT:
				return getFullyQualifiedName((TypeMemberReferenceTreeElement)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__ABSTRACTFEATURENODE:
				return getFullyQualifiedName((org.eclipse.symphony.common.emf.AbstractFeatureNode)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_IMPLEMENTATIONS__TYPE:
				return createTypeMemberImplementations((Type)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___INIT_VARIABLE_INSTANCES__ENVIRONMENT:
				initVariableInstances((Environment)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___DISPOSE_VARIABLE_INSTANCES__ENVIRONMENT:
				disposeVariableInstances((Environment)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_OPERATION_CALL_CONTAINER__TYPEMEMBERREFERENCELISTELEMENT:
				return getOperationCallContainer((TypeMemberReferenceListElement)arguments.get(0));
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__ENVIRONMENT:
				applyInitializationData((Environment)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__ENVIRONMENT:
				collectInitializationData((Environment)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__VARIABLE:
				applyInitializationData((Variable)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__VARIABLE:
				collectInitializationData((Variable)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___LOAD_REGISTERED_TYPES__INVOCATORSESSION:
				loadRegisteredTypes((InvocatorSession)arguments.get(0));
				return null;
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE___GET_ALL_TYPES__ENVIRONMENT:
				return getAllTypes((Environment)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // EMFEcoreInvocatorFacadeImpl
