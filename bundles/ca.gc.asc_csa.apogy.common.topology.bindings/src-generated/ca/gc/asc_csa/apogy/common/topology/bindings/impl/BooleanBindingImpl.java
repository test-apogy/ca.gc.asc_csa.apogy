/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.common.topology.bindings.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.BooleanCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BooleanBindingImpl#isCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BooleanBindingImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BooleanBindingImpl#getTrueCase <em>True Case</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BooleanBindingImpl#getFalseCase <em>False Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanBindingImpl extends AbstractTopologyBindingImpl implements BooleanBinding 
{	
	private ReferencedGroupNode referencedGroupNode = null;
	
	/**
	 * The default value of the '{@link #isCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected boolean currentValue = CURRENT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentNode() <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNode()
	 * @generated
	 * @ordered
	 */
	protected GroupNode parentNode;

	/**
	 * The cached value of the '{@link #getTrueCase() <em>True Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueCase()
	 * @generated
	 * @ordered
	 */
	protected BooleanCase trueCase;

	/**
	 * The cached value of the '{@link #getFalseCase() <em>False Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseCase()
	 * @generated
	 * @ordered
	 */
	protected BooleanCase falseCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyBindingsPackage.Literals.BOOLEAN_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(boolean newCurrentValue) {
		boolean oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__CURRENT_VALUE, oldCurrentValue, currentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupNode getParentNode() {
		if (parentNode != null && parentNode.eIsProxy()) {
			InternalEObject oldParentNode = (InternalEObject)parentNode;
			parentNode = (GroupNode)eResolveProxy(oldParentNode);
			if (parentNode != oldParentNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__PARENT_NODE, oldParentNode, parentNode));
			}
		}
		return parentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupNode basicGetParentNode() {
		return parentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(GroupNode newParentNode) {
		GroupNode oldParentNode = parentNode;
		parentNode = newParentNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__PARENT_NODE, oldParentNode, parentNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCase getTrueCase() 
	{
		return trueCase;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueCase(BooleanCase newTrueCase, NotificationChain msgs) {
		BooleanCase oldTrueCase = trueCase;
		trueCase = newTrueCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE, oldTrueCase, newTrueCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueCase(BooleanCase newTrueCase) {
		if (newTrueCase != trueCase) {
			NotificationChain msgs = null;
			if (trueCase != null)
				msgs = ((InternalEObject)trueCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE, null, msgs);
			if (newTrueCase != null)
				msgs = ((InternalEObject)newTrueCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE, null, msgs);
			msgs = basicSetTrueCase(newTrueCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE, newTrueCase, newTrueCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCase getFalseCase() 
	{
		return falseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFalseCase(BooleanCase newFalseCase, NotificationChain msgs) {
		BooleanCase oldFalseCase = falseCase;
		falseCase = newFalseCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE, oldFalseCase, newFalseCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseCase(BooleanCase newFalseCase) {
		if (newFalseCase != falseCase) {
			NotificationChain msgs = null;
			if (falseCase != null)
				msgs = ((InternalEObject)falseCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE, null, msgs);
			if (newFalseCase != null)
				msgs = ((InternalEObject)newFalseCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE, null, msgs);
			msgs = basicSetFalseCase(newFalseCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE, newFalseCase, newFalseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE:
				return basicSetTrueCase(null, msgs);
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE:
				return basicSetFalseCase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__CURRENT_VALUE:
				return isCurrentValue();
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__PARENT_NODE:
				if (resolve) return getParentNode();
				return basicGetParentNode();
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE:
				return getTrueCase();
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE:
				return getFalseCase();
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
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__CURRENT_VALUE:
				setCurrentValue((Boolean)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__PARENT_NODE:
				setParentNode((GroupNode)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE:
				setTrueCase((BooleanCase)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE:
				setFalseCase((BooleanCase)newValue);
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
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__CURRENT_VALUE:
				setCurrentValue(CURRENT_VALUE_EDEFAULT);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__PARENT_NODE:
				setParentNode((GroupNode)null);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE:
				setTrueCase((BooleanCase)null);
				return;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE:
				setFalseCase((BooleanCase)null);
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
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__CURRENT_VALUE:
				return currentValue != CURRENT_VALUE_EDEFAULT;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__PARENT_NODE:
				return parentNode != null;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__TRUE_CASE:
				return trueCase != null;
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING__FALSE_CASE:
				return falseCase != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (currentValue: ");
		result.append(currentValue);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
	{
		BooleanBinding booleanBindingCopy = EcoreUtil.copy(this);
		booleanBindingCopy.setParentNode((GroupNode) originalToCopyNodeMap.get(this.getParentNode()));	
		return booleanBindingCopy;
	}
	
	@Override
	public void bind() 
	{
		// Attach the ReferencedGroupNode to the parent.
		getParentNode().getChildren().add(getReferencedGroupNode());
		
		super.bind();
	}
	
	@Override
	public void unbind() 
	{	
		// Detach the ReferencedGroupNode to the parent.
		getParentNode().getChildren().remove(getReferencedGroupNode());

		super.unbind();
	}
	
	@Override
	protected void valueChanged(Object newValue) 
	{
		System.out.println("BooleanBindingImpl.valueChanged() " + newValue);
		
		boolean value = false;
		
		if(newValue instanceof Boolean)
		{
			value = (Boolean) newValue;
			setCurrentValue(value);
			
			Node falseTopology = getNodeForCase(false);
			Node trueTopology = getNodeForCase(true);

			if(value)
			{				
				// Disconnects the false case topology 				
				if(falseTopology != null && getReferencedGroupNode().getChildren().contains(falseTopology))
				{
					getReferencedGroupNode().getChildren().remove(falseTopology);
				}
				
				// Connects the true case topology 
				if(trueTopology != null && !getReferencedGroupNode().getChildren().contains(trueTopology))
				{
					getReferencedGroupNode().getChildren().add(trueTopology);
				}
			}
			else
			{					
				// Disconnect the true case topology
				if(trueTopology != null && getReferencedGroupNode().getChildren().contains(trueTopology))
				{
					getReferencedGroupNode().getChildren().remove(trueTopology);
				}
				
				// Connects the false case topology 
				if(falseTopology != null && !getReferencedGroupNode().getChildren().contains(falseTopology))
				{
					getReferencedGroupNode().getChildren().add(falseTopology);
				}
			}
		}
		else
		{
			// Error
		}		
	}

	private ReferencedGroupNode getReferencedGroupNode()
	{
		if(referencedGroupNode == null)
		{
			referencedGroupNode = ApogyCommonTopologyFactory.eINSTANCE.createReferencedGroupNode();
			if(getName() != null)
			{
				referencedGroupNode.setNodeId(getName());
			}
		}
		
		return referencedGroupNode;
	}
	
	private Node getNodeForCase(boolean value)
	{		
		if(value)
		{
			if(getTrueCase() != null)
			{
				return getTrueCase().getTopologyRoot();
			}
			else
			{
				return null;
			}
		}
		else
		{
			if(getFalseCase() != null)
			{
				return getFalseCase().getTopologyRoot();
			}
			else
			{
				return null;
			}
		}
	}
} //BooleanBindingImpl
