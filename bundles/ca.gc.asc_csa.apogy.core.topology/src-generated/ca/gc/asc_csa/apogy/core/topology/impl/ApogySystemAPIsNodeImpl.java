package ca.gc.asc_csa.apogy.core.topology.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ListFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory;
import ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding;
import ca.gc.asc_csa.apogy.common.topology.impl.ReferencedGroupNodeImpl;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.AssemblyLink;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.topology.Activator;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;
import ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Apogy
 * System AP Is Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.ApogySystemAPIsNodeImpl#getApogyEnvironment <em>Apogy Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogySystemAPIsNodeImpl extends ReferencedGroupNodeImpl implements ApogySystemAPIsNode {
	/**
	 * The cached value of the '{@link #getApogyEnvironment() <em>Apogy
	 * Environment</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getApogyEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ApogyEnvironment apogyEnvironment;

	private List<AssemblyLink> processedAssemblyLink = new ArrayList<AssemblyLink>();

	private Adapter adapter = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogySystemAPIsNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreTopologyPackage.Literals.APOGY_SYSTEM_AP_IS_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment getApogyEnvironment() {
		if (apogyEnvironment != null && apogyEnvironment.eIsProxy()) {
			InternalEObject oldApogyEnvironment = (InternalEObject)apogyEnvironment;
			apogyEnvironment = (ApogyEnvironment)eResolveProxy(oldApogyEnvironment);
			if (apogyEnvironment != oldApogyEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreTopologyPackage.APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT, oldApogyEnvironment, apogyEnvironment));
			}
		}
		return apogyEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment basicGetApogyEnvironment() {
		return apogyEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setApogyEnvironment(ApogyEnvironment newApogyEnvironment) {
		ApogyEnvironment oldApogyEnvironment = getApogyEnvironment();

		setApogyEnvironmentGen(newApogyEnvironment);

		updateApogyEnvironment(oldApogyEnvironment, newApogyEnvironment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setApogyEnvironmentGen(ApogyEnvironment newApogyEnvironment) {
		ApogyEnvironment oldApogyEnvironment = apogyEnvironment;
		apogyEnvironment = newApogyEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreTopologyPackage.APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT, oldApogyEnvironment, apogyEnvironment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreTopologyPackage.APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT:
				if (resolve) return getApogyEnvironment();
				return basicGetApogyEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreTopologyPackage.APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT:
				setApogyEnvironment((ApogyEnvironment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreTopologyPackage.APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT:
				setApogyEnvironment((ApogyEnvironment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreTopologyPackage.APOGY_SYSTEM_AP_IS_NODE__APOGY_ENVIRONMENT:
				return apogyEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

	private void clearTopology() {
		getChildren().clear();
	}

	private void updateApogyEnvironment(ApogyEnvironment oldApogyEnvironment, ApogyEnvironment newApogyEnvironment) {
		// Clears the topology
		clearTopology();

		// Un-register adapter from old ApogyEnvironment if applicable.
		if (oldApogyEnvironment != null) {
			oldApogyEnvironment.eAdapters().remove(getAdapter());

			// Un-Register from the old Environment Active Context if defined.
			if (oldApogyEnvironment.getActiveContext() != null) {
				oldApogyEnvironment.getActiveContext().eAdapters().remove(getAdapter());
			}
		}

		// Register adapter to new ApogyEnvironment if applicable.
		if (newApogyEnvironment != null) {
			newApogyEnvironment.eAdapters().add(getAdapter());

			// Register to the new Environment Active Context if defined.
			if (newApogyEnvironment.getActiveContext() != null) {
				newApogyEnvironment.getActiveContext().eAdapters().add(getAdapter());
			}

			// Initialize the topology.
			initializeTopology(newApogyEnvironment);
		}
	}

	private void updateContext(Context oldContext, Context newContext) {
		// Clears the topology
		clearTopology();

		if (oldContext != null) {
			oldContext.eAdapters().remove(getAdapter());
		}

		if (newContext != null) {
			newContext.eAdapters().add(getAdapter());

			// Updates topology.
			initializeTopology(getApogyEnvironment());
		}
	}

	private void updateVariablesImplementations() {
		// Clears the topology
		clearTopology();

		// Updates topology.
		initializeTopology(getApogyEnvironment());
	}

	private TransformMatrixBinding createTransformMatrixBinding(final ApogySystem apogySystem,
			final TransformNode poseTransform, final PoseProvider poseProvider) {
		TransformMatrixBinding binding = ApogyCommonTopologyBindingsFactory.eINSTANCE.createTransformMatrixBinding();

		ListRootNode listRootNode = ApogyCommonEMFFactory.eINSTANCE.createListRootNode();
		listRootNode.setSourceClass(poseProvider.eClass());

		ListFeatureNode listFeatureNode = ApogyCommonEMFFactory.eINSTANCE.createListFeatureNode();
		listFeatureNode.setStructuralFeature(ApogyCorePackage.Literals.POSE_PROVIDER__POSE_TRANSFORM);
		listRootNode.setChild(listFeatureNode);

		binding.setFeatureNode(listFeatureNode);
		binding.setTransformNode(poseTransform);
		binding.setSource(poseProvider);

		apogySystem.getBindingSet().getBindingsList().getBindings().add(binding);

		binding.bind();

		return binding;
	}

	private Map<ApogySystem, ApogySystemApiAdapter> createSystemToApiAdapterMap(
			final ApogyEnvironment apogyEnvironment) {
		Map<ApogySystem, ApogySystemApiAdapter> map = new HashMap<ApogySystem, ApogySystemApiAdapter>();

		Iterator<VariableImplementation> it = apogyEnvironment.getActiveContext().getVariableImplementationsList()
				.getVariableImplementations().iterator();
		VariableImplementation variableImplementation = null;

		while (it.hasNext()) {
			variableImplementation = it.next();
			createSystemToApiAdapterMap(variableImplementation, map);
		}

		return map;
	}

	private void createSystemToApiAdapterMap(AbstractTypeImplementation abstractTypeImplementation,
			final Map<ApogySystem, ApogySystemApiAdapter> systemToApiAdapterMap) {

		if (abstractTypeImplementation.getAdapterInstance() instanceof ApogySystemApiAdapter) {
			ApogySystemApiAdapter apogySystemApiAdapter = (ApogySystemApiAdapter) abstractTypeImplementation
					.getAdapterInstance();

			if (apogySystemApiAdapter.getApogySystem() != null) {
				ApogySystem apogySystem = apogySystemApiAdapter.getApogySystem();

				systemToApiAdapterMap.put(apogySystem, apogySystemApiAdapter);
			}
		}

		if (abstractTypeImplementation instanceof AbstractTypeImplementation) {
			AbstractTypeImplementation typeMemberImplementationsListProvider = (AbstractTypeImplementation) abstractTypeImplementation;

			for (TypeMemberImplementation tmi : typeMemberImplementationsListProvider.getTypeMemberImplementations()) {
				createSystemToApiAdapterMap(tmi, systemToApiAdapterMap);
			}
		}
	}

	private void initializeTopology(final ApogyEnvironment apogyEnvironment) {
		processedAssemblyLink.clear();

		if (apogyEnvironment != null && apogyEnvironment.getActiveContext() != null) {
			Iterator<VariableImplementation> it = apogyEnvironment.getActiveContext().getVariableImplementationsList()
					.getVariableImplementations().iterator();
			VariableImplementation variableImplementation = null;

			Map<ApogySystem, ApogySystemApiAdapter> systemToApiAdapterMap = createSystemToApiAdapterMap(
					apogyEnvironment);

			while (it.hasNext()) {
				variableImplementation = it.next();
				Variable variable = variableImplementation.getVariable();

				try {
					// EObject instance = variableImplementation.getInstance();
					if (variableImplementation.getAdapterInstance() instanceof ApogySystemApiAdapter) {
						Logger.INSTANCE.log(Activator.ID, this,
								"Adding variable <" + variable.getName() + "> to the topology.", EventSeverity.WARNING);

						ApogySystemApiAdapter apogySystemApiAdapter = (ApogySystemApiAdapter) variableImplementation
								.getAdapterInstance();
						ApogySystem apogySystem = apogySystemApiAdapter.getApogySystem();

						if (apogySystem != null) {
							// Adds a transform node used to effect the
							// poseTransform.
							Matrix4d matrix = new Matrix4d();
							matrix.setIdentity();

							if (apogySystemApiAdapter instanceof PoseProvider) {
								PoseProvider poseProvider = (PoseProvider) apogySystemApiAdapter;

								if (poseProvider.getPoseTransform() != null) {
									matrix = poseProvider.getPoseTransform().asMatrix4d();
								}
							}

							TransformNode poseTransform = ApogyCommonTopologyFacade.INSTANCE
									.createTransformNode(matrix);
							poseTransform.setNodeId(variable.getName() + "_poseTransform");

							// If the system defines a pose provider.
							if (apogySystem.getPoseProviderInstance() instanceof PoseProvider) {
								PoseProvider poseProvide = apogySystem.getPoseProviderInstance();

								// Adds a binding to link the transform node to
								// the poseTransform.
								createTransformMatrixBinding(apogySystem, poseTransform, poseProvide);
							}

							// Adds the topology representing the ApogySystem
							// itself.
							ReferencedGroupNode referencedGroupNode = ApogyCommonTopologyFactory.eINSTANCE
									.createReferencedGroupNode();
							referencedGroupNode.setNodeId(variableImplementation.getVariable().getName());
							if (apogySystem.getTopologyRoot() != null
									&& apogySystem.getTopologyRoot().getOriginNode() != null) {
								referencedGroupNode.getChildren().add(apogySystem.getTopologyRoot().getOriginNode());
							} else {
								String message = "Variable <" + variable.getName() + "> as no topology attached.";
								Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

								// DEBUG
								if (apogySystem.getTopologyRoot() != null) {
									apogySystem.getTopologyRoot()
											.setOriginNode(ApogyCommonTopologyFactory.eINSTANCE.createTransformNode());
								}
								// DEBUG
							}

							// Attaches the system topology to the
							// transformNode.
							poseTransform.getChildren().add(referencedGroupNode);
							getChildren().add(poseTransform);

							// Assembles the variable sub-systems.
							assembleSubSystems(apogySystem, systemToApiAdapterMap);
						} else if (variable.getVariableType().getInterfaceClass() != null) {
							String message = "Variable <" + variable.getName()
									+ "> instance's ApogySystem is not initialized !";
							Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
						}
					}
				} catch (Throwable t) {
					Logger.INSTANCE.log(Activator.ID, this,
							"Failed to create topology for variable <" + variable.getName() + ">", EventSeverity.ERROR,
							t);
				}
			}
		}
	}

	private void assembleSubSystems(ApogySystem apogySystem,
			Map<ApogySystem, ApogySystemApiAdapter> systemToApiAdapterMap) {
		Logger.INSTANCE.log(Activator.ID, this, "Assembling Sub-System <" + apogySystem + ">", EventSeverity.INFO);

		if (apogySystem.getTopologyRoot() != null
				&& apogySystem.getTopologyRoot().getOriginNode() instanceof GroupNode) {
			if (apogySystem.getAssemblyLinksList() != null
					&& apogySystem.getAssemblyLinksList().getAssemblyLinks() != null) {
				for (AssemblyLink link : apogySystem.getAssemblyLinksList().getAssemblyLinks()) {
					if (!processedAssemblyLink.contains(link)) {
						String message = "Processing link <" + link.getName() + ">.";
						Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

						try {
							ApogySystem parent = link.getParentInstance();
							ApogySystem subSystem = link.getSubSystemInstance();

							// ApogySystemAPI apogySystemAPI =
							// subSystem.getApogySystemAPI();
							if (subSystem != null && parent != null) {
								// Gets the transformation matrix attaching the
								// sub-system to the system attachment node.
								Matrix4d transform = null;
								if (link.getTransformationMatrix() != null)
									transform = link.getTransformationMatrix().asMatrix4d();
								if (transform == null) {
									transform = new Matrix4d();
									transform.setIdentity();
								}

								// Attaches the sub-system to the system.
								TransformNode linkTransformNode = ApogyCommonTopologyFacade.INSTANCE
										.createTransformNode(transform);
								linkTransformNode
										.setDescription("Transform representing link <" + link.getName() + ">");

								// Get the node in the parent to which the link
								// is attached.
								GroupNode parentNode = link.getParentConnectionPoint().getNode();
								parentNode.getChildren().add(linkTransformNode);

								// Adds a transform node used to effect the
								// poseTransform.
								Matrix4x4 matrix = ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4();
								TransformNode poseTransform = ApogyCommonTopologyFacade.INSTANCE
										.createTransformNode(matrix.asMatrix4d());
								poseTransform.setNodeId(subSystem.getName() + "_poseTransform");

								// Is the API is not null, binds the Pose to the
								// poseTransform.
								// ApogySystemApiAdapter apogySystemApiAdapter =
								// systemToApiAdapterMap.get(subSystem);
								// if(apogySystemApiAdapter != null)
								// {
								// if(apogySystemApiAdapter.getPoseTransform()
								// != null)
								// {
								// poseTransform.setTransformation(apogySystemApiAdapter.getPoseTransform().asMatrix4d());
								// }
								//
								// // Adds a binding to link the transform node
								// to the api poseTransform.
								// if(apogySystemApiAdapter.getInstance() !=
								// null)
								// {
								// createTransformMatrixBinding(apogySystemApiAdapter.getInstance(),
								// poseTransform, apogySystemApiAdapter);
								// }
								// }

								// Creates a referenced node to refer the
								// sub-system topology.
								ReferencedGroupNode referencedGroupNode = ApogyCommonTopologyFactory.eINSTANCE
										.createReferencedGroupNode();
								if (subSystem.getTopologyRoot() != null
										&& subSystem.getTopologyRoot().getOriginNode() != null) {
									referencedGroupNode.getChildren().add(subSystem.getTopologyRoot().getOriginNode());
								}

								// Attaches the referencedGroupNode to the
								// poseTransform.
								poseTransform.getChildren().add(referencedGroupNode);

								// Attaches the poseTransform to the link
								// transform.
								linkTransformNode.getChildren().add(poseTransform);

								// Adds the link geometry topology to the
								// parent, if present.
								if (link.getGeometryNode() != null)
									parentNode.getChildren().add(link.getGeometryNode());

								// Adds the link to the list of processed links.
								processedAssemblyLink.add(link);

								// Assembles the sub-system’s sub-systems.
								assembleSubSystems(subSystem, systemToApiAdapterMap);
							} else {
								Logger.INSTANCE.log(Activator.ID, this,
										"Error occured when processing AssemblyLink <" + link.getName() + "> !",
										EventSeverity.ERROR);
							}
						} catch (Throwable t) {
							Logger.INSTANCE.log(Activator.ID, this,
									"Error occured when processing AssemblyLink <" + link.getName() + "> !",
									EventSeverity.ERROR, t);
						}
					}
				}
			}
		}
	}

	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					super.notifyChanged(msg);

					if (msg.getNotifier() instanceof Environment) {
						if (msg.getFeatureID(
								Environment.class) == ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT) {
							// Active Context has changed, update.
							Context oldContext = (Context) msg.getOldValue();
							Context newContext = (Context) msg.getNewValue();
							updateContext(oldContext, newContext);
						}
					} else if (msg.getNotifier() instanceof Context) {
						if (msg.getFeatureID(
								Context.class) == ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE) {
							// Variable implementation has changed, update.
							updateVariablesImplementations();
						} else if (msg.getFeatureID(
								Context.class) == ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_DISPOSAL_DATE) {
							if (msg.getNewValue() != null) {
								// Clears the topology
								clearTopology();
							}
						}
					}
				}
			};
		}
		return adapter;
	}
} // ApogySystemAPIsNodeImpl
