package org.eclipse.symphony.core.invocator.delegates;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Activator;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.core.invocator.TypeMember;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;

import org.eclipse.symphony.common.emf.Disposable;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;

public class DefaultInvocatorDelegate implements InvocatorDelegate {

	@Override
	public void newInstance(Environment environment, Variable variable) {
		VariableImplementation variableImplementation = environment
				.getActiveContext().getVariableImplementationsList()
				.getVariableImplementation(variable);

		if (variableImplementation == null) {
			Logger.INSTANCE.log(Activator.ID, this, "There is no implementation defined for the variable <" + variable.getName() + ">",
					EventSeverity.ERROR);
		} else {
			EClass eClass = variableImplementation.getImplementationClass();
			if (eClass != null) {
				EObject eObject = EcoreUtil.create(eClass);
				variableImplementation.setInstance(eObject);
			}
			newInstance(environment, variableImplementation);

			/** Instantiate the type members. */
			newInstance(environment, variableImplementation
					.getTypeMemberImplementations().iterator());

			// Initializes the object features if requested.
			injectTypeMemberValue(variableImplementation);

			Logger.INSTANCE.log(Activator.ID, this, "The variable <" + variable.getName() + "> has been instantiated.",
					EventSeverity.INFO);
		}
	}

	/**
	 * This method initializes the sub-features if feature initialization map is
	 * set in the {@link TypeMember}.
	 * 
	 * @param typeImplementation
	 *            Reference to the current {@link typeImplementation}.
	 */
	protected void injectTypeMemberValue(
			AbstractTypeImplementation typeImplementation) {
		EObject srcObj = typeImplementation.getInstance();

		for (TypeMember typeMember : typeImplementation.getHandlingType()
				.getMembers()) {
			if (typeMember.getTypeFeatureRootNode() != null) {
				TypeMemberImplementation subTypeMemberImplementation = typeImplementation
						.getTypeMemberImplementation(typeMember);

				if (!typeMember.getTypeFeatureRootNode().getChildren()
						.isEmpty()) {
					EMFEcoreFacade.INSTANCE.setValue(srcObj, typeMember
							.getTypeFeatureRootNode().getChildren().get(0),
							subTypeMemberImplementation.getInstance());
				}
			}
		}

		for (TypeMemberImplementation current : typeImplementation
				.getTypeMemberImplementations()) {
			injectTypeMemberValue(current);
		}
	}

	public void newInstance(Environment environment,
			AbstractTypeImplementation typeImplementation) {

		TypeApiAdapter typeApiAdapter = typeImplementation.getAdapterInstance();

		/**
		 * Instantiate API Adapter if necessary.
		 */
		if (typeApiAdapter == null) {
			EClass typeApiAdapterEClass = typeImplementation.getHandlingType()
					.getTypeApiAdapterClass();
			if (typeApiAdapterEClass == null) {
				// Default Adapter.
				typeApiAdapter = newDefaultTypeApiAdapter();
			} else {
				// User Specified Adapter.
				typeApiAdapter = (TypeApiAdapter) EcoreUtil
						.create(typeApiAdapterEClass);
			}
			typeImplementation.setAdapterInstance(typeApiAdapter);
		}

		typeApiAdapter.init(environment, typeImplementation.getHandlingType(),
				typeImplementation.getInstance());
	}

	private void newInstance(Environment environment,
			Iterator<TypeMemberImplementation> typeMemberImplementations) {
		while (typeMemberImplementations.hasNext()) {
			TypeMemberImplementation typeMemberImplementation = typeMemberImplementations
					.next();

			EClass eClass = typeMemberImplementation.getImplementationClass();

			if (eClass != null) {
				EObject eObject = EcoreUtil.create(typeMemberImplementation
						.getImplementationClass());
				typeMemberImplementation.setInstance(eObject);
			}
			newInstance(environment, typeMemberImplementation);

			/** Process sub type members. */
			newInstance(environment, typeMemberImplementation
					.getTypeMemberImplementations().iterator());
		}
	}

	public void dispose(Environment environment, Variable variable) {
		VariableImplementation variableImplementation = environment
				.getActiveContext().getVariableImplementationsList()
				.getVariableImplementation(variable);

		if (variableImplementation != null) {
			/** Dispose the variable. */
			dispose(variableImplementation);

			/** Instantiate the type members. */
			dispose(variableImplementation.getTypeMemberImplementations()
					.iterator());
		}
		Logger.INSTANCE.log(Activator.ID, this, "The variable <" + variable.getName() + "> has been disposed.",
				EventSeverity.INFO);
	}

	public void dispose(AbstractTypeImplementation typeImplementation) {
		try {
			// Dispose the API Adapter.
			if (typeImplementation.getAdapterInstance() != null) {
				typeImplementation.getAdapterInstance().dispose();
				typeImplementation.setAdapterInstance(null);
			}

			// Dispose the API Instance.
			EObject eObject = typeImplementation.getInstance();
			if (eObject instanceof Disposable) {
				((Disposable) eObject).dispose();
			}
			typeImplementation.setInstance(null);

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void dispose(
			Iterator<TypeMemberImplementation> typeMemberImplementations) {
		while (typeMemberImplementations.hasNext()) {
			try {
				TypeMemberImplementation typeMemberImplementation = typeMemberImplementations
						.next();
				dispose(typeMemberImplementation);

				/** Process sub type members. */
				dispose(typeMemberImplementation.getTypeMemberImplementations()
						.iterator());
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	public void execute(EObject instance, OperationCall operationCall,
			boolean saveResult) {
		TypeApiAdapter typeApiAdapter = EMFEcoreInvocatorFacade.INSTANCE
				.getTypeApiAdapter(operationCall);
		typeApiAdapter.invoke(instance, operationCall, saveResult);
	}

	@Override
	public Class<? extends Type> getHandledTypeClass() {
		return Type.class;
	}

	@Override
	public void applyInitializationData(Variable variable) {
		Environment environment = variable.getEnvironment();
		VariableImplementation variableImplementation = environment
				.getActiveContext().getVariableImplementationsList()
				.getVariableImplementation(variable);
		applyInitializationData(variableImplementation);

		/** Instantiate the type members. */
		applyInitializationData(variableImplementation
				.getTypeMemberImplementations().iterator());
	}

	private void applyInitializationData(
			Iterator<TypeMemberImplementation> typeMemberImplementations) {
		while (typeMemberImplementations.hasNext()) {
			TypeMemberImplementation typeMemberImplementation = typeMemberImplementations
					.next();

			applyInitializationData(typeMemberImplementation);

			/** Process sub type members. */
			applyInitializationData(typeMemberImplementation
					.getTypeMemberImplementations().iterator());
		}
	}

	@Override
	public void applyInitializationData(
			AbstractTypeImplementation typeImplementation) {
		typeImplementation.getAdapterInstance().apply(
				typeImplementation.getAbstractInitializationData());
	}

	@Override
	public void collectInitializationData(Variable variable) {
		Environment environment = variable.getEnvironment();
		VariableImplementation variableImplementation = environment
				.getActiveContext().getVariableImplementationsList()
				.getVariableImplementation(variable);
		collectInitializationData(variableImplementation);

		/** Instantiate the type members. */
		collectInitializationData(variableImplementation
				.getTypeMemberImplementations().iterator());
	}

	private void collectInitializationData(
			Iterator<TypeMemberImplementation> typeMemberImplementations) {
		while (typeMemberImplementations.hasNext()) {
			TypeMemberImplementation typeMemberImplementation = typeMemberImplementations
					.next();

			collectInitializationData(typeMemberImplementation);

			/** Process sub type members. */
			collectInitializationData(typeMemberImplementation
					.getTypeMemberImplementations().iterator());
		}
	}

	@Override
	public void collectInitializationData(
			AbstractTypeImplementation typeImplementation) {
		AbstractInitializationData data = typeImplementation
				.getAdapterInstance().createInitializationData();
		typeImplementation.getAdapterInstance().collect(data);
		if (data != null) {
			typeImplementation.setAbstractInitializationData(data);
		}
	}

	@Override
	public TypeApiAdapter newDefaultTypeApiAdapter() {
		return EMFEcoreInvocatorFactory.eINSTANCE.createTypeApiAdapter();
	}
}