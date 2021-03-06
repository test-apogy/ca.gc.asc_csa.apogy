package ca.gc.asc_csa.apogy.common.topology.bindings.impl;
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

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Switch Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationSwitchBindingImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationSwitchBindingImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationSwitchBindingImpl#getActiveCase <em>Active Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationSwitchBindingImpl extends AbstractTopologyBindingImpl implements EnumerationSwitchBinding
{
	
  private Map<EnumerationCase, Node> enumerationCaseToTopologyRootCopy = new HashMap<EnumerationCase, Node>();
	
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
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
  protected EList<EnumerationCase> cases;

  /**
	 * The cached value of the '{@link #getActiveCase() <em>Active Case</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActiveCase()
	 * @generated
	 * @ordered
	 */
  protected EnumerationCase activeCase;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnumerationSwitchBindingImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_SWITCH_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GroupNode getParentNode()
  {
		if (parentNode != null && parentNode.eIsProxy()) {
			InternalEObject oldParentNode = (InternalEObject)parentNode;
			parentNode = (GroupNode)eResolveProxy(oldParentNode);
			if (parentNode != oldParentNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__PARENT_NODE, oldParentNode, parentNode));
			}
		}
		return parentNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GroupNode basicGetParentNode()
  {
		return parentNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParentNode(GroupNode newParentNode)
  {
		GroupNode oldParentNode = parentNode;
		parentNode = newParentNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__PARENT_NODE, oldParentNode, parentNode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EnumerationCase> getCases()
  {
		if (cases == null) {
			cases = new EObjectContainmentEList<EnumerationCase>(EnumerationCase.class, this, ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__CASES);
		}
		return cases;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnumerationCase getActiveCase()
  {
		if (activeCase != null && activeCase.eIsProxy()) {
			InternalEObject oldActiveCase = (InternalEObject)activeCase;
			activeCase = (EnumerationCase)eResolveProxy(oldActiveCase);
			if (activeCase != oldActiveCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__ACTIVE_CASE, oldActiveCase, activeCase));
			}
		}
		return activeCase;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnumerationCase basicGetActiveCase()
  {
		return activeCase;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActiveCase(EnumerationCase newActiveCase)
  {
		EnumerationCase oldActiveCase = activeCase;
		activeCase = newActiveCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__ACTIVE_CASE, oldActiveCase, activeCase));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__PARENT_NODE:
				if (resolve) return getParentNode();
				return basicGetParentNode();
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__CASES:
				return getCases();
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__ACTIVE_CASE:
				if (resolve) return getActiveCase();
				return basicGetActiveCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__PARENT_NODE:
				setParentNode((GroupNode)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends EnumerationCase>)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__ACTIVE_CASE:
				setActiveCase((EnumerationCase)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__PARENT_NODE:
				setParentNode((GroupNode)null);
				return;
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__CASES:
				getCases().clear();
				return;
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__ACTIVE_CASE:
				setActiveCase((EnumerationCase)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__PARENT_NODE:
				return parentNode != null;
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__CASES:
				return cases != null && !cases.isEmpty();
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING__ACTIVE_CASE:
				return activeCase != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  protected synchronized void valueChanged(Object newValue) 
  {
	  try
	  {
		  Enumerator enumerator = (Enumerator) newValue;
		  EnumerationCase newCase = getEnumerationCase(enumerator);
		  
		  // If a new case is now active.
		  if(newCase != getActiveCase())
		  {
			  // Deactivates the previous case.
			  deActivateCase(getActiveCase());
			  
			  // Activates the new case.
			  activateCase(newCase);
		  }	
	  }
	  catch(Throwable t)
	  {
		  t.printStackTrace();
	  }
  }
  
  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {
	  EnumerationSwitchBinding enumerationSwitchBindingCopy = EcoreUtil.copy(this);
	  enumerationSwitchBindingCopy.setParentNode((GroupNode) originalToCopyNodeMap.get(this.getParentNode()));	  
	  return enumerationSwitchBindingCopy;
  }
  
  private void deActivateCase(EnumerationCase enumerationCase)
  {
	  if(enumerationCase != null)
	  {
		  // If a sub-topology is defined.
		  Node topologyRoot = enumerationCaseToTopologyRootCopy.get(enumerationCase);
		  if(topologyRoot != null)
		  {
			  getParentNode().getChildren().remove(topologyRoot);
		  }
	  }
  }
  
  private void activateCase(EnumerationCase enumerationCase)
  {
	  if(enumerationCase != null && enumerationCase.getTopologyRoot() != null)
	  {
		  Node topologyRoot = enumerationCaseToTopologyRootCopy.get(enumerationCase);
		  if(topologyRoot == null)
		  {
			  // Copies the topologyRoot and put it in the enumerationCaseToTopologyRootCopy map.
			  topologyRoot = EcoreUtil.copy(enumerationCase.getTopologyRoot());
			  enumerationCaseToTopologyRootCopy.put(enumerationCase, topologyRoot);
		  }
		  		
		  getParentNode().getChildren().add(topologyRoot);		
	  }
	  
	  setActiveCase(enumerationCase);
  }
  
  private EnumerationCase getEnumerationCase(Enumerator enumerator)
  {
	  EnumerationCase enumerationCase = null;
	  	  	  
	  if(enumerator != null)
	  {	  
		  // Check each case until a case that match the enumLiteral is found.
		  Iterator<EnumerationCase> it = getCases().iterator();
		  while(enumerationCase == null && it.hasNext())
		  {
			  EnumerationCase tmp = it.next();		  
			  for(EEnumLiteral literal : tmp.getEnumerationLiterals())
			  {
				  if(literal.getValue() == enumerator.getValue())
				  {
					  enumerationCase = tmp;
				  }
			  }
		  }
	  }
	  
	  // If no case has been found or the enumerator is null, tries to find a default case, which is one with no literal defined.
	  Iterator<EnumerationCase> it = getCases().iterator();
	  while(enumerationCase == null && it.hasNext())
	  {
		  EnumerationCase tmp = it.next();
		  
		  if(tmp.getEnumerationLiterals().isEmpty())
		  {
			  enumerationCase = tmp;
		  }
	  }
	  
	  return enumerationCase;
  }

  @Override
  public void unbind() 
  {	
	  try
	  {
		  deActivateCase(getActiveCase());
		  enumerationCaseToTopologyRootCopy.clear();
	  }
	  catch(Throwable t)
	  {
		  t.printStackTrace();
	  }
	  
	  super.unbind();
  }
} //EnumerationSwitchBindingImpl
