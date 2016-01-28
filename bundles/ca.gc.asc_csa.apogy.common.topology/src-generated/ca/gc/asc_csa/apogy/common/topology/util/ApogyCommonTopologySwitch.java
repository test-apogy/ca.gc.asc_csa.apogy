/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.topology.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage
 * @generated
 */
public class ApogyCommonTopologySwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCommonTopologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologySwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCommonTopologyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyCommonTopologyPackage.TOPOLOGY_PROVIDER: {
				TopologyProvider topologyProvider = (TopologyProvider)theEObject;
				T1 result = caseTopologyProvider(topologyProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.NODE: {
				Node node = (Node)theEObject;
				T1 result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.LINK: {
				Link link = (Link)theEObject;
				T1 result = caseLink(link);
				if (result == null) result = caseNode(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.LEAF: {
				Leaf leaf = (Leaf)theEObject;
				T1 result = caseLeaf(leaf);
				if (result == null) result = caseNode(leaf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.URL_NODE: {
				URLNode urlNode = (URLNode)theEObject;
				T1 result = caseURLNode(urlNode);
				if (result == null) result = caseLeaf(urlNode);
				if (result == null) result = caseNode(urlNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.CAD_NODE: {
				CADNode cadNode = (CADNode)theEObject;
				T1 result = caseCADNode(cadNode);
				if (result == null) result = caseURLNode(cadNode);
				if (result == null) result = caseLeaf(cadNode);
				if (result == null) result = caseNode(cadNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.CONTENT_NODE: {
				ContentNode<?> contentNode = (ContentNode<?>)theEObject;
				T1 result = caseContentNode(contentNode);
				if (result == null) result = caseLeaf(contentNode);
				if (result == null) result = caseNode(contentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.REFERENCED_CONTENT_NODE: {
				ReferencedContentNode<?> referencedContentNode = (ReferencedContentNode<?>)theEObject;
				T1 result = caseReferencedContentNode(referencedContentNode);
				if (result == null) result = caseContentNode(referencedContentNode);
				if (result == null) result = caseLeaf(referencedContentNode);
				if (result == null) result = caseNode(referencedContentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE: {
				AggregateContentNode<?> aggregateContentNode = (AggregateContentNode<?>)theEObject;
				T1 result = caseAggregateContentNode(aggregateContentNode);
				if (result == null) result = caseContentNode(aggregateContentNode);
				if (result == null) result = caseLeaf(aggregateContentNode);
				if (result == null) result = caseNode(aggregateContentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.GROUP_NODE: {
				GroupNode groupNode = (GroupNode)theEObject;
				T1 result = caseGroupNode(groupNode);
				if (result == null) result = caseNode(groupNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE: {
				ReferencedGroupNode referencedGroupNode = (ReferencedGroupNode)theEObject;
				T1 result = caseReferencedGroupNode(referencedGroupNode);
				if (result == null) result = caseGroupNode(referencedGroupNode);
				if (result == null) result = caseNode(referencedGroupNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.AGGREGATE_GROUP_NODE: {
				AggregateGroupNode aggregateGroupNode = (AggregateGroupNode)theEObject;
				T1 result = caseAggregateGroupNode(aggregateGroupNode);
				if (result == null) result = caseGroupNode(aggregateGroupNode);
				if (result == null) result = caseNode(aggregateGroupNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.POSITION_NODE: {
				PositionNode positionNode = (PositionNode)theEObject;
				T1 result = casePositionNode(positionNode);
				if (result == null) result = caseAggregateGroupNode(positionNode);
				if (result == null) result = caseGroupNode(positionNode);
				if (result == null) result = caseNode(positionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.ROTATION_NODE: {
				RotationNode rotationNode = (RotationNode)theEObject;
				T1 result = caseRotationNode(rotationNode);
				if (result == null) result = caseAggregateGroupNode(rotationNode);
				if (result == null) result = caseGroupNode(rotationNode);
				if (result == null) result = caseNode(rotationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.TRANSFORM_NODE: {
				TransformNode transformNode = (TransformNode)theEObject;
				T1 result = caseTransformNode(transformNode);
				if (result == null) result = casePositionNode(transformNode);
				if (result == null) result = caseRotationNode(transformNode);
				if (result == null) result = caseAggregateGroupNode(transformNode);
				if (result == null) result = caseGroupNode(transformNode);
				if (result == null) result = caseNode(transformNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.PICK_AND_PLACE_NODE: {
				PickAndPlaceNode pickAndPlaceNode = (PickAndPlaceNode)theEObject;
				T1 result = casePickAndPlaceNode(pickAndPlaceNode);
				if (result == null) result = caseTransformNode(pickAndPlaceNode);
				if (result == null) result = casePositionNode(pickAndPlaceNode);
				if (result == null) result = caseRotationNode(pickAndPlaceNode);
				if (result == null) result = caseAggregateGroupNode(pickAndPlaceNode);
				if (result == null) result = caseGroupNode(pickAndPlaceNode);
				if (result == null) result = caseNode(pickAndPlaceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyPackage.APOGY_COMMON_TOPOLOGY_FACADE: {
				ApogyCommonTopologyFacade apogy__CommonTopologyFacade = (ApogyCommonTopologyFacade)theEObject;
				T1 result = caseApogyCommonTopologyFacade(apogy__CommonTopologyFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTopologyProvider(TopologyProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLeaf(Leaf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseURLNode(URLNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAD Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAD Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCADNode(CADNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseContentNode(ContentNode<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Content Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseReferencedContentNode(ReferencedContentNode<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Content Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseAggregateContentNode(AggregateContentNode<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroupNode(GroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReferencedGroupNode(ReferencedGroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePositionNode(PositionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRotationNode(RotationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformNode(TransformNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pick And Place Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pick And Place Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePickAndPlaceNode(PickAndPlaceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseApogyCommonTopologyFacade(ApogyCommonTopologyFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ApogyCommonTopologySwitch
