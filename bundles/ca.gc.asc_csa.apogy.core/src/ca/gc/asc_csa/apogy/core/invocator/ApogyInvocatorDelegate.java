package ca.gc.asc_csa.apogy.core.invocator;
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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.AssemblyLink;
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.invocator.delegates.DefaultInvocatorDelegate;

public class ApogyInvocatorDelegate extends DefaultInvocatorDelegate {

	private Map<AbstractTypeImplementation, ApogySystem> apogySystemInstancesMap;
	private Map<ApogySystem, AbstractTypeImplementation> apogySystemToTypeImplementationsMap;
	static private int counter;

	@Override
	public void newInstance(Environment environment, Variable variable) 
	{
		super.newInstance(environment, variable);

		/** Binds Apogy System Instance with the ApogySystem Definition. */
		VariableImplementation variableImplementation = environment.getActiveContext().getVariableImplementationsList().getVariableImplementation(variable);

		initializeApogySystems(variableImplementation, getApogySystemInstancesMap());

		// Clears the map for next variable.
		getApogySystemInstancesMap().clear();
		getApogySystemToTypeImplementationsMap().clear();
	}

	@Override
	public void newInstance(Environment environment, AbstractTypeImplementation typeImplementation) {
		
		super.newInstance(environment, typeImplementation);
				
		ApogySystemApiAdapter apogySystemApiAdapter = (ApogySystemApiAdapter) typeImplementation.getAdapterInstance();
		
		/**
		 * Map the referred Type and the ApogySystemInstance. The instance if use in runtime.
		 */
		ApogySystem apogySystem = (ApogySystem) typeImplementation.getHandlingType();
		ApogySystem apogySystemInstance = ApogyCoreFactory.eINSTANCE.createApogySystem();

		// Binds the ApogySystemApiAdapter with its copy of the ApogySystem instance.
		apogySystemApiAdapter.setApogySystem(apogySystemInstance);

		// FIXME Temporary Feature. Remove the following line.
		String name = "null";
		if (apogySystem.getName() != null) 
		{
			name = apogySystem.getName();
		}
		apogySystemInstance.setName("Copy_" + name + " " + counter++);

		// Register the original system with the type implementation.
		getApogySystemToTypeImplementationsMap().put(apogySystem, typeImplementation);

		// Register the Instance to the type.
		getApogySystemInstancesMap().put(typeImplementation, apogySystemInstance);
	}

	private Map<AbstractTypeImplementation, ApogySystem> getApogySystemInstancesMap() {
		if (apogySystemInstancesMap == null) {
			apogySystemInstancesMap = new HashMap<AbstractTypeImplementation, ApogySystem>();
		}
		return apogySystemInstancesMap;
	}

	private Map<ApogySystem, AbstractTypeImplementation> getApogySystemToTypeImplementationsMap() {
		if (apogySystemToTypeImplementationsMap == null) {
			apogySystemToTypeImplementationsMap = new HashMap<ApogySystem, AbstractTypeImplementation>();
		}
		return apogySystemToTypeImplementationsMap;
	}

	@Override
	public void dispose(Environment environment, Variable variable) {
		super.dispose(environment, variable);
		getApogySystemInstancesMap().clear();
		apogySystemInstancesMap = null;
	}
	
	@Override
	public Class<? extends Type> getHandledTypeClass() {
		return ApogySystem.class;
	}

	private void initializeApogySystems(
			VariableImplementation variableImplementation,
			Map<AbstractTypeImplementation, ApogySystem> implementationToApogySystemMap) {
		Map<AbstractTypeImplementation, ApogySystemInitializer> implementationToInitializerMap = new HashMap<AbstractTypeImplementation, ApogyInvocatorDelegate.ApogySystemInitializer>();
		Map<Object, ApogySystemInitializer> typeMemberToInitializerMap = new HashMap<Object, ApogyInvocatorDelegate.ApogySystemInitializer>();

		// Creates a ApogySystemInitializer for each
		// AbstractTypeImplementation.
		for (AbstractTypeImplementation abstractTypeImplementation : implementationToApogySystemMap
				.keySet()) {
			ApogySystemInitializer initializer = new ApogySystemInitializer(
					abstractTypeImplementation);
			implementationToInitializerMap.put(abstractTypeImplementation,
					initializer);

			if (abstractTypeImplementation instanceof TypeMemberImplementation) {
				TypeMemberImplementation tmi = (TypeMemberImplementation) abstractTypeImplementation;
				typeMemberToInitializerMap
						.put(tmi.getTypeMember(), initializer);
			} else if (abstractTypeImplementation instanceof VariableImplementation) {
				VariableImplementation vi = (VariableImplementation) abstractTypeImplementation;
				typeMemberToInitializerMap.put(vi, initializer);
			}

		}

		// Assembles links
		for (AbstractTypeImplementation abstractTypeImplementation : implementationToApogySystemMap
				.keySet()) {
			ApogySystemInitializer initializer = implementationToInitializerMap
					.get(abstractTypeImplementation);

			String linkSuffix = "_COPY";

			// Goes through the links of the original to get the connectivity.
			if (initializer.getOriginal().getAssemblyLinksList() != null) {
				for (AssemblyLink link : initializer.getOriginal()
						.getAssemblyLinksList().getAssemblyLinks()) {
					// Gets the source system of the link
					Object originalSource = link.getParentTypeMember();
					if (originalSource == null) {
						if (abstractTypeImplementation instanceof TypeMemberImplementation) {
							TypeMemberImplementation tmi = (TypeMemberImplementation) abstractTypeImplementation;
							originalSource = tmi.getTypeMember();
						} else if (abstractTypeImplementation instanceof VariableImplementation) {
							VariableImplementation vi = (VariableImplementation) abstractTypeImplementation;
							originalSource = vi;
						}
					}

					// Gets the destination system of the link
					TypeMember originalDestination = link
							.getSubSystemTypeMember();

					// Gets the copy associated with the source.
					ApogySystemInitializer sourceInitializer = typeMemberToInitializerMap
							.get(originalSource);

					// Gets the copy associated to the destination.
					ApogySystemInitializer destinationInitializer = typeMemberToInitializerMap
							.get(originalDestination);

					TypeMember copySource = null;
					if (sourceInitializer.getAbstractTypeImplementation() instanceof TypeMemberImplementation) {
						TypeMemberImplementation tmi = (TypeMemberImplementation) sourceInitializer
								.getAbstractTypeImplementation();
						copySource = tmi.getTypeMember();
					}

					TypeMember copyDestination = null;
					if (destinationInitializer.getAbstractTypeImplementation() instanceof TypeMemberImplementation) {
						TypeMemberImplementation tmi = (TypeMemberImplementation) destinationInitializer
								.getAbstractTypeImplementation();
						copyDestination = tmi.getTypeMember();
					}

					// Gets the source ApogySystem (copy).
					ApogySystem source = sourceInitializer.getCopy();

					// Gets the destination ApogySystem (copy).
					ApogySystem destination = destinationInitializer
							.getCopy();

					// Creates a link
					AssemblyLink linkCopy = ApogyCoreFactory.eINSTANCE
							.createAssemblyLink();
					if (linkSuffix != null)
						linkCopy.setName(link.getName() + linkSuffix);

					// Sets the link parent type member.
					linkCopy.setParentTypeMember(copySource);

					// Sets the parent connection point.
					linkCopy.setParentConnectionPoint(sourceInitializer
							.getConnectionPointsMap().get(
									link.getParentConnectionPoint()));

					// Sets the destination type Member.
					linkCopy.setSubSystemTypeMember(copyDestination);

					// Copies the geometry if it exist.
					if (link.getGeometryNode() != null) {
						linkCopy.setGeometryNode(EcoreUtil.copy(link
								.getGeometryNode()));
					}

					// Gets the transform of the link.
					if (link.getTransformationMatrix() != null) {
						linkCopy.setTransformationMatrix(EcoreUtil.copy(link
								.getTransformationMatrix()));
					}

					// Sets the link ApogySystems instances.
					linkCopy.setParentInstance(source);
					linkCopy.setSubSystemInstance(destination);

					// Adds the link copy to the destination Apogy System.
					if (initializer.getCopy().getAssemblyLinksList() == null)
						initializer.getCopy().setAssemblyLinksList(
								ApogyCoreFactory.eINSTANCE
										.createAssemblyLinksList());
					initializer.getCopy().getAssemblyLinksList()
							.getAssemblyLinks().add(linkCopy);
				}
			}
		}
	}
	
	private class ApogySystemInitializer 
	{
		private AbstractTypeImplementation abstractTypeImplementation = null;

		private Map<ConnectionPoint, ConnectionPoint> connectionPointsMap = null;
		private Map<Node, Node> originalToCopyNodesMap = null;

		private ApogySystem original = null;
		private ApogySystem copy = null;
	
		public ApogySystemInitializer(AbstractTypeImplementation abstractTypeImplementation) 
		{
			this.abstractTypeImplementation = abstractTypeImplementation;

			ApogySystemApiAdapter apogySystemApiAdapter = (ApogySystemApiAdapter) abstractTypeImplementation.getAdapterInstance();
			
			String suffix = null;

			// Gets the original ApogySystem.
			if (abstractTypeImplementation instanceof TypeMemberImplementation) 
			{
				TypeMemberImplementation tmi = (TypeMemberImplementation) abstractTypeImplementation;
				original = (ApogySystem) tmi.getTypeMember().getMemberType();
				suffix = "_" + tmi.getTypeMember().getName();
			} 
			else if (abstractTypeImplementation instanceof VariableImplementation) 
			{
				VariableImplementation vi = (VariableImplementation) abstractTypeImplementation;
				original = (ApogySystem) vi.getVariable().getVariableType();
				suffix = "_" + vi.getVariable().getName();
			}
			
			copy = apogySystemApiAdapter.getApogySystem();
			
			// Adds the suffix if applicable.
			if (suffix != null)
				copy.setName(original.getName() + suffix);

			// Copies the topology
			if (copy.getTopologyRoot() == null)
				copy.setTopologyRoot(ApogyCoreFactory.eINSTANCE
						.createTopologyRoot());
			Map<Node, Node> nodesMap = copyTopology(original.getTopologyRoot(),
					copy.getTopologyRoot());
			getOriginalToCopyNodesMap().putAll(nodesMap);

			// Copies the Connection Points.
			if (copy.getConnectionPointsList() == null)
				copy.setConnectionPointsList(ApogyCoreFactory.eINSTANCE
						.createConnectionPointsList());
			
			// Map<ConnectionPoint, ConnectionPoint> pointsMap = copyConnectionPoints(original, copy, originalToCopyNodesMap, suffix);
			Map<ConnectionPoint, ConnectionPoint> pointsMap = copyConnectionPoints(original, copy, originalToCopyNodesMap, null);
			getConnectionPointsMap().putAll(pointsMap);

			// Copies Bindings
			if (copy.getBindingSet() == null)
			{
				copy.setBindingSet(ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsSet());
			}
			
			// Copies the Pose Provider
			if(original.getPoseProvider() != null)
			{						
				// HERE : Call Regent Function.
				if(abstractTypeImplementation instanceof VariableImplementation)
				{
					// Gets the typeMember that is refered to.
					AbstractType typeMember = original.getPoseProvider();							
					
					VariableImplementation vi = (VariableImplementation) abstractTypeImplementation;
					AbstractTypeImplementation tmi = ApogyCoreInvocatorFacade.INSTANCE.getTypeImplementation(vi.getVariable(), typeMember);
					
					
					// If the implementation is itself a PoseProvider.
					if(tmi.getInstance() instanceof PoseProvider)
					{
						PoseProvider poseProvider = (PoseProvider) tmi.getInstance();
						copy.setPoseProviderInstance(poseProvider);
						
					}
					else if(tmi.getAdapterInstance() instanceof PoseProvider)
					{
						PoseProvider poseProvider = (PoseProvider) tmi.getAdapterInstance();
						copy.setPoseProviderInstance(poseProvider);
					}
				}
			}
			else
			{
				// If the implementation is itself a PoseProvider.
				if(abstractTypeImplementation.getInstance() instanceof PoseProvider)
				{
					PoseProvider poseProvider = (PoseProvider) abstractTypeImplementation.getInstance();
					copy.setPoseProviderInstance(poseProvider);
					
				}
				else if(abstractTypeImplementation.getAdapterInstance() instanceof PoseProvider)
				{
					PoseProvider poseProvider = (PoseProvider) abstractTypeImplementation.getAdapterInstance();
					copy.setPoseProviderInstance(poseProvider);
				}
			}
			
			copyBindingsSet(original, copy, originalToCopyNodesMap, apogySystemApiAdapter.getInstance());

			// Initialize the Bindings.
			try 
			{
				copy.getBindingSet().bind();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}						
		}

		public ApogySystem getOriginal() {
			return original;
		}

		public ApogySystem getCopy() {
			return copy;
		}

		public AbstractTypeImplementation getAbstractTypeImplementation() {
			return abstractTypeImplementation;
		}

		public Map<ConnectionPoint, ConnectionPoint> getConnectionPointsMap() {
			if (connectionPointsMap == null) {
				connectionPointsMap = new HashMap<ConnectionPoint, ConnectionPoint>();
			}

			return connectionPointsMap;
		}

		public Map<Node, Node> getOriginalToCopyNodesMap() {
			if (originalToCopyNodesMap == null) {
				originalToCopyNodesMap = new HashMap<Node, Node>();
			}

			return originalToCopyNodesMap;
		}

		/**
		 * Copies a source TopologyRoot to a target TopologyRoot.
		 * 
		 * @param source
		 *            The source TopologyRoot.
		 * @param target
		 *            The target TopologyRoot.
		 * @return A map that maps topology Node in the source to Node in the
		 *         target. Never null.
		 */
		private Map<Node, Node> copyTopology(TopologyRoot source,
				TopologyRoot target) {
			Map<Node, Node> originalToCopyMap = new HashMap<Node, Node>();

			if (source != null && target != null) 
			{
				EcoreUtil.Copier copier = new EcoreUtil.Copier();

				// Copies the origin node.
				target.setOriginNode((Node) copier.copy(source.getOriginNode()));

				for (EObject key : copier.keySet()) 
				{
					EObject value = copier.get(key);
					if (key instanceof Node && value instanceof Node) 
					{
						// Post process copied node for special cases.
						postProcessCopiedNode((Node) key, (Node) value);
						
						originalToCopyMap.put((Node) key, (Node) value);
					}
				}
			}
			return originalToCopyMap;
		}
		
		/**
		 * Post process copied node for special cases needed for copying.
		 * @param original Original node.
		 * @param copy Copy of the original node.
		 */
		private void postProcessCopiedNode(Node original, Node copy)		
		{
			if(original instanceof ContentNode<?>)
			{
				ContentNode<?> originalContentNode = (ContentNode<?>) original;
				if(originalContentNode.getContent() instanceof CartesianTriangularMesh)
				{
					CartesianTriangularMesh originalMesh = (CartesianTriangularMesh) originalContentNode.getContent();
					
					// Copies the original mesh to the copied node.
					CartesianTriangularMesh meshCopy = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangularMesh(originalMesh);
					
					@SuppressWarnings("unchecked")
					ContentNode<CartesianTriangularMesh> copiedContentNode = (ContentNode<CartesianTriangularMesh>) copy;
					copiedContentNode.setContent(meshCopy);
				}
			}
		}
		
		/**
		 * Copy the ConnectionPoints of a source ApogySystem to a target
		 * ApogySystem.
		 * 
		 * @param source
		 *            The ApogySystem to copy the ConnectionPoints from.
		 * @param target
		 *            The ApogySystem to copy the ConnectionPoints to.
		 * @param originalToCopyNodesMap
		 *            The map that maps topology Node in the source to Node in
		 *            the target.
		 * @param nameSuffix
		 *            A suffix to add to the copied ConnectionPoints name. Can
		 *            be null.
		 * @return A map that maps original ConnectionPoint to copied
		 *         ConnectionPoint. Never null.
		 */
		private Map<ConnectionPoint, ConnectionPoint> copyConnectionPoints(
				ApogySystem source, ApogySystem target,
				Map<Node, Node> originalToCopyNodesMap, String nameSuffix) {
			Map<ConnectionPoint, ConnectionPoint> originalToCopyConnectionPointMap = new HashMap<ConnectionPoint, ConnectionPoint>();

			if (source.getConnectionPointsList() != null) {
				// Ensure a list of connection points is present in the target
				if (target.getConnectionPointsList() == null)
					target.setConnectionPointsList(ApogyCoreFactory.eINSTANCE
							.createConnectionPointsList());

				for (ConnectionPoint connectionPoint : source
						.getConnectionPointsList().getConnectionPoints()) {
					// Copies the ConnectionPoint.
					ConnectionPoint copy = EcoreUtil.copy(connectionPoint);

					// Adds the name suffix to the copy name.
					if (nameSuffix != null)
					{
						copy.setName(copy.getName() + nameSuffix);
					}					

					// Updates the node of the copy
					GroupNode originalGroupNode = connectionPoint.getNode();
					GroupNode copyGroupNode = (GroupNode) originalToCopyNodesMap
							.get(originalGroupNode);
					copy.setNode(copyGroupNode);

					// Adds the original and copy to the output map.
					originalToCopyConnectionPointMap.put(connectionPoint, copy);

					// Adds the copy to the list.
					target.getConnectionPointsList().getConnectionPoints()
							.add(copy);
				}
			}

			return originalToCopyConnectionPointMap;
		}

		/**
		 * Copy the binding set of a source ApogySystem to a target
		 * ApogySystem.
		 * 
		 * @param source
		 *            The ApogySystem to copy the BindinSet from.
		 * @param target
		 *            The ApogySystem to copy the BindinSet to.
		 * @param originalToCopyMap
		 *            The map that maps topology Node in the source to Node in
		 *            the target.
		 * @param bindingSource
		 *            The source object to which to bind the copied bindings.
		 */
		private void copyBindingsSet(ApogySystem source,	ApogySystem target, Map<Node, Node> originalToCopyMap, EObject bindingSource) 
		{
			if (source.getBindingSet() != null) 
			{
				// Ensure targets has a BindingSet
				if (target.getBindingSet() == null)
				{
					target.setBindingSet(ApogyCommonTopologyBindingsFactory.eINSTANCE.createBindingsSet());
				}
				
				for (AbstractTopologyBinding binding : source.getBindingSet().getBindingsList().getBindings()) 
				{
					// Copies the binding.
					AbstractTopologyBinding bindingCopy = ApogyCommonTopologyBindingsFacade.INSTANCE.copy(binding, originalToCopyMap);

					// Sets the source.
					bindingCopy.setSource(bindingSource);

					// Adds the binding copy to the target bindings.
					target.getBindingSet().getBindingsList().getBindings().add(bindingCopy);
				}
			}
		}
	}
	
	@Override
	public TypeApiAdapter newDefaultTypeApiAdapter() 
	{
		return ApogyCoreFactory.eINSTANCE.createApogySystemApiAdapter();
	}
}