package ca.gc.asc_csa.apogy.common.topology.ui.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.PositionNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.RotationNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.URLNodePresentation;

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
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage
 * @generated
 */
public class ApogyCommonTopologyUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCommonTopologyUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyUISwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCommonTopologyUIPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_REGISTRY: {
				TopologyPresentationRegistry topologyPresentationRegistry = (TopologyPresentationRegistry)theEObject;
				T result = caseTopologyPresentationRegistry(topologyPresentationRegistry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.GRAPHICS_CONTEXT: {
				GraphicsContext graphicsContext = (GraphicsContext)theEObject;
				T result = caseGraphicsContext(graphicsContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.NODE_SELECTION: {
				NodeSelection nodeSelection = (NodeSelection)theEObject;
				T result = caseNodeSelection(nodeSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET: {
				TopologyPresentationSet topologyPresentationSet = (TopologyPresentationSet)theEObject;
				T result = caseTopologyPresentationSet(topologyPresentationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION: {
				NodePresentation nodePresentation = (NodePresentation)theEObject;
				T result = caseNodePresentation(nodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.TRANSFORM_NODE_PRESENTATION: {
				TransformNodePresentation transformNodePresentation = (TransformNodePresentation)theEObject;
				T result = caseTransformNodePresentation(transformNodePresentation);
				if (result == null) result = caseNodePresentation(transformNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.ROTATION_NODE_PRESENTATION: {
				RotationNodePresentation rotationNodePresentation = (RotationNodePresentation)theEObject;
				T result = caseRotationNodePresentation(rotationNodePresentation);
				if (result == null) result = caseNodePresentation(rotationNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.POSITION_NODE_PRESENTATION: {
				PositionNodePresentation positionNodePresentation = (PositionNodePresentation)theEObject;
				T result = casePositionNodePresentation(positionNodePresentation);
				if (result == null) result = caseNodePresentation(positionNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.URL_NODE_PRESENTATION: {
				URLNodePresentation urlNodePresentation = (URLNodePresentation)theEObject;
				T result = caseURLNodePresentation(urlNodePresentation);
				if (result == null) result = caseNodePresentation(urlNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyUIPackage.APOGY_COMMON_TOPOLOGY_UI_FACADE: {
				ApogyCommonTopologyUIFacade apogyCommonTopologyUIFacade = (ApogyCommonTopologyUIFacade)theEObject;
				T result = caseApogyCommonTopologyUIFacade(apogyCommonTopologyUIFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Presentation Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Presentation Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyPresentationRegistry(TopologyPresentationRegistry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicsContext(GraphicsContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSelection(NodeSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Presentation Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Presentation Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyPresentationSet(TopologyPresentationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePresentation(NodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformNodePresentation(TransformNodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotationNodePresentation(RotationNodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionNodePresentation(PositionNodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLNodePresentation(URLNodePresentation object) {
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
	public T caseApogyCommonTopologyUIFacade(ApogyCommonTopologyUIFacade object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogyCommonTopologyUISwitch
