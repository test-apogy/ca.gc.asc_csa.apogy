package org.eclipse.symphony.core.invocator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsFacade;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsFactory;
import org.eclipse.symphony.core.AssemblyLink;
import org.eclipse.symphony.core.ConnectionPoint;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.core.invocator.delegates.DefaultInvocatorDelegate;

public class SymphonyInvocatorDelegate extends DefaultInvocatorDelegate {

	private Map<AbstractTypeImplementation, SymphonySystem> symphonySystemInstancesMap;
	private Map<SymphonySystem, AbstractTypeImplementation> symphonySystemToTypeImplementationsMap;
	static private int counter;

	@Override
	public void newInstance(Environment environment, Variable variable) 
	{
		super.newInstance(environment, variable);

		/** Binds Symphony System Instance with the SymphonySystem Definition. */
		VariableImplementation variableImplementation = environment.getActiveContext().getVariableImplementationsList().getVariableImplementation(variable);

		initializeSymphonySystems(variableImplementation, getSymphonySystemInstancesMap());

		// Clears the map for next variable.
		getSymphonySystemInstancesMap().clear();
		getSymphonySystemToTypeImplementationsMap().clear();
	}

	@Override
	public void newInstance(Environment environment, AbstractTypeImplementation typeImplementation) {
		
		super.newInstance(environment, typeImplementation);
				
		SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter) typeImplementation.getAdapterInstance();
		
		/**
		 * Map the referred Type and the SymphonySystemInstance. The instance if use in runtime.
		 */
		SymphonySystem symphonySystem = (SymphonySystem) typeImplementation.getHandlingType();
		SymphonySystem symphonySystemInstance = Symphony__CoreFactory.eINSTANCE.createSymphonySystem();

		// Binds the SymphonySystemApiAdapter with its copy of the SymphonySystem instance.
		symphonySystemApiAdapter.setSymphonySystem(symphonySystemInstance);

		// FIXME Temporary Feature. Remove the following line.
		String name = "null";
		if (symphonySystem.getName() != null) 
		{
			name = symphonySystem.getName();
		}
		symphonySystemInstance.setName("Copy_" + name + " " + counter++);

		// Register the original system with the type implementation.
		getSymphonySystemToTypeImplementationsMap().put(symphonySystem, typeImplementation);

		// Register the Instance to the type.
		getSymphonySystemInstancesMap().put(typeImplementation, symphonySystemInstance);
	}

	private Map<AbstractTypeImplementation, SymphonySystem> getSymphonySystemInstancesMap() {
		if (symphonySystemInstancesMap == null) {
			symphonySystemInstancesMap = new HashMap<AbstractTypeImplementation, SymphonySystem>();
		}
		return symphonySystemInstancesMap;
	}

	private Map<SymphonySystem, AbstractTypeImplementation> getSymphonySystemToTypeImplementationsMap() {
		if (symphonySystemToTypeImplementationsMap == null) {
			symphonySystemToTypeImplementationsMap = new HashMap<SymphonySystem, AbstractTypeImplementation>();
		}
		return symphonySystemToTypeImplementationsMap;
	}

	@Override
	public void dispose(Environment environment, Variable variable) {
		super.dispose(environment, variable);
		getSymphonySystemInstancesMap().clear();
		symphonySystemInstancesMap = null;
	}
	
	@Override
	public Class<? extends Type> getHandledTypeClass() {
		return SymphonySystem.class;
	}

	private void initializeSymphonySystems(
			VariableImplementation variableImplementation,
			Map<AbstractTypeImplementation, SymphonySystem> implementationToSymphonySystemMap) {
		Map<AbstractTypeImplementation, SymphonySystemInitializer> implementationToInitializerMap = new HashMap<AbstractTypeImplementation, SymphonyInvocatorDelegate.SymphonySystemInitializer>();
		Map<Object, SymphonySystemInitializer> typeMemberToInitializerMap = new HashMap<Object, SymphonyInvocatorDelegate.SymphonySystemInitializer>();

		// Creates a SymphonySystemInitializer for each
		// AbstractTypeImplementation.
		for (AbstractTypeImplementation abstractTypeImplementation : implementationToSymphonySystemMap
				.keySet()) {
			SymphonySystemInitializer initializer = new SymphonySystemInitializer(
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
		for (AbstractTypeImplementation abstractTypeImplementation : implementationToSymphonySystemMap
				.keySet()) {
			SymphonySystemInitializer initializer = implementationToInitializerMap
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
					SymphonySystemInitializer sourceInitializer = typeMemberToInitializerMap
							.get(originalSource);

					// Gets the copy associated to the destination.
					SymphonySystemInitializer destinationInitializer = typeMemberToInitializerMap
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

					// Gets the source SymphonySystem (copy).
					SymphonySystem source = sourceInitializer.getCopy();

					// Gets the destination SymphonySystem (copy).
					SymphonySystem destination = destinationInitializer
							.getCopy();

					// Creates a link
					AssemblyLink linkCopy = Symphony__CoreFactory.eINSTANCE
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

					// Sets the link SymphonySystems instances.
					linkCopy.setParentInstance(source);
					linkCopy.setSubSystemInstance(destination);

					// Adds the link copy to the destination Symphony System.
					if (initializer.getCopy().getAssemblyLinksList() == null)
						initializer.getCopy().setAssemblyLinksList(
								Symphony__CoreFactory.eINSTANCE
										.createAssemblyLinksList());
					initializer.getCopy().getAssemblyLinksList()
							.getAssemblyLinks().add(linkCopy);
				}
			}
		}
	}
	
	private class SymphonySystemInitializer 
	{
		private AbstractTypeImplementation abstractTypeImplementation = null;

		private Map<ConnectionPoint, ConnectionPoint> connectionPointsMap = null;
		private Map<Node, Node> originalToCopyNodesMap = null;

		private SymphonySystem original = null;
		private SymphonySystem copy = null;
	
		public SymphonySystemInitializer(AbstractTypeImplementation abstractTypeImplementation) 
		{
			this.abstractTypeImplementation = abstractTypeImplementation;

			SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter) abstractTypeImplementation.getAdapterInstance();
			
			String suffix = null;

			// Gets the original SymphonySystem.
			if (abstractTypeImplementation instanceof TypeMemberImplementation) 
			{
				TypeMemberImplementation tmi = (TypeMemberImplementation) abstractTypeImplementation;
				original = (SymphonySystem) tmi.getTypeMember().getMemberType();
				suffix = "_" + tmi.getTypeMember().getName();
			} 
			else if (abstractTypeImplementation instanceof VariableImplementation) 
			{
				VariableImplementation vi = (VariableImplementation) abstractTypeImplementation;
				original = (SymphonySystem) vi.getVariable().getVariableType();
				suffix = "_" + vi.getVariable().getName();
			}
			
			copy = symphonySystemApiAdapter.getSymphonySystem();
			
			// Adds the suffix if applicable.
			if (suffix != null)
				copy.setName(original.getName() + suffix);

			// Copies the topology
			if (copy.getTopologyRoot() == null)
				copy.setTopologyRoot(Symphony__CoreFactory.eINSTANCE
						.createTopologyRoot());
			Map<Node, Node> nodesMap = copyTopology(original.getTopologyRoot(),
					copy.getTopologyRoot());
			getOriginalToCopyNodesMap().putAll(nodesMap);

			// Copies the Connection Points.
			if (copy.getConnectionPointsList() == null)
				copy.setConnectionPointsList(Symphony__CoreFactory.eINSTANCE
						.createConnectionPointsList());
			
			// Map<ConnectionPoint, ConnectionPoint> pointsMap = copyConnectionPoints(original, copy, originalToCopyNodesMap, suffix);
			Map<ConnectionPoint, ConnectionPoint> pointsMap = copyConnectionPoints(original, copy, originalToCopyNodesMap, null);
			getConnectionPointsMap().putAll(pointsMap);

			// Copies Bindings
			if (copy.getBindingSet() == null)
			{
				copy.setBindingSet(Symphony__CommonTopologyBindingsFactory.eINSTANCE.createBindingsSet());
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
					AbstractTypeImplementation tmi = Symphony__CoreInvocatorFacade.INSTANCE.getTypeImplementation(vi.getVariable(), typeMember);
					
					
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
			
			copyBindingsSet(original, copy, originalToCopyNodesMap, symphonySystemApiAdapter.getInstance());

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

		public SymphonySystem getOriginal() {
			return original;
		}

		public SymphonySystem getCopy() {
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
					CartesianTriangularMesh meshCopy = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangularMesh(originalMesh);
					
					@SuppressWarnings("unchecked")
					ContentNode<CartesianTriangularMesh> copiedContentNode = (ContentNode<CartesianTriangularMesh>) copy;
					copiedContentNode.setContent(meshCopy);
				}
			}
		}
		
		/**
		 * Copy the ConnectionPoints of a source SymphonySystem to a target
		 * SymphonySystem.
		 * 
		 * @param source
		 *            The SymphonySystem to copy the ConnectionPoints from.
		 * @param target
		 *            The SymphonySystem to copy the ConnectionPoints to.
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
				SymphonySystem source, SymphonySystem target,
				Map<Node, Node> originalToCopyNodesMap, String nameSuffix) {
			Map<ConnectionPoint, ConnectionPoint> originalToCopyConnectionPointMap = new HashMap<ConnectionPoint, ConnectionPoint>();

			if (source.getConnectionPointsList() != null) {
				// Ensure a list of connection points is present in the target
				if (target.getConnectionPointsList() == null)
					target.setConnectionPointsList(Symphony__CoreFactory.eINSTANCE
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
		 * Copy the binding set of a source SymphonySystem to a target
		 * SymphonySystem.
		 * 
		 * @param source
		 *            The SymphonySystem to copy the BindinSet from.
		 * @param target
		 *            The SymphonySystem to copy the BindinSet to.
		 * @param originalToCopyMap
		 *            The map that maps topology Node in the source to Node in
		 *            the target.
		 * @param bindingSource
		 *            The source object to which to bind the copied bindings.
		 */
		private void copyBindingsSet(SymphonySystem source,	SymphonySystem target, Map<Node, Node> originalToCopyMap, EObject bindingSource) 
		{
			if (source.getBindingSet() != null) 
			{
				// Ensure targets has a BindingSet
				if (target.getBindingSet() == null)
				{
					target.setBindingSet(Symphony__CommonTopologyBindingsFactory.eINSTANCE.createBindingsSet());
				}
				
				for (AbstractTopologyBinding binding : source.getBindingSet().getBindingsList().getBindings()) 
				{
					// Copies the binding.
					AbstractTopologyBinding bindingCopy = Symphony__CommonTopologyBindingsFacade.INSTANCE.copy(binding, originalToCopyMap);

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
		return Symphony__CoreFactory.eINSTANCE.createSymphonySystemApiAdapter();
	}
}