/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.TreeRootNode;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.Watch;
import org.eclipse.symphony.core.invocator.WatchesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Watch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchImpl#getWatchesList <em>Watches List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchImpl#getTypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.WatchImpl#getTreeRootNode <em>Tree Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WatchImpl extends MinimalEObjectImpl.Container implements Watch
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

		/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
  protected Variable variable;

  /**
	 * The cached value of the '{@link #getTypeMemberReferenceTreeElement() <em>Type Member Reference Tree Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeMemberReferenceTreeElement()
	 * @generated
	 * @ordered
	 */
  protected TypeMemberReferenceTreeElement typeMemberReferenceTreeElement;

  /**
	 * The cached value of the '{@link #getTreeRootNode() <em>Tree Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTreeRootNode()
	 * @generated
	 * @ordered
	 */
  protected org.eclipse.symphony.common.emf.TreeRootNode treeRootNode;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WatchImpl()
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
		return EMFEcoreInvocatorPackage.Literals.WATCH;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__NAME, oldName, name));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WatchesList getWatchesList()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST) return null;
		return (WatchesList)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WatchesList basicGetWatchesList()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST) return null;
		return (WatchesList)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetWatchesList(WatchesList newWatchesList, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newWatchesList, EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWatchesList(WatchesList newWatchesList)
  {
		if (newWatchesList != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST && newWatchesList != null)) {
			if (EcoreUtil.isAncestor(this, newWatchesList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWatchesList != null)
				msgs = ((InternalEObject)newWatchesList).eInverseAdd(this, EMFEcoreInvocatorPackage.WATCHES_LIST__WATCHES, WatchesList.class, msgs);
			msgs = basicSetWatchesList(newWatchesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST, newWatchesList, newWatchesList));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable getVariable()
  {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.WATCH__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable basicGetVariable()
  {
		return variable;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setVariable(Variable newVariable)
  {
	  if(newVariable != getVariable() && newVariable != null)
	  {		 
		  // Updates the getTreeRootNode class.
		  if(getTreeRootNode() != null)
		  {
			  getTreeRootNode().setSourceClass(newVariable.getVariableType().getInterfaceClass());
			  
			  // Clears the child.
			  getTreeRootNode().getChildren().clear();
		  }		 		 
	  }
	  
	  setVariableGen(newVariable);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableGen(Variable newVariable)
  {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__VARIABLE, oldVariable, variable));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceTreeElement getTypeMemberReferenceTreeElement()
  {
		return typeMemberReferenceTreeElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement newTypeMemberReferenceTreeElement, NotificationChain msgs)
  {
		TypeMemberReferenceTreeElement oldTypeMemberReferenceTreeElement = typeMemberReferenceTreeElement;
		typeMemberReferenceTreeElement = newTypeMemberReferenceTreeElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT, oldTypeMemberReferenceTreeElement, newTypeMemberReferenceTreeElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement newTypeMemberReferenceTreeElement)
  {
		if (newTypeMemberReferenceTreeElement != typeMemberReferenceTreeElement) {
			NotificationChain msgs = null;
			if (typeMemberReferenceTreeElement != null)
				msgs = ((InternalEObject)typeMemberReferenceTreeElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT, null, msgs);
			if (newTypeMemberReferenceTreeElement != null)
				msgs = ((InternalEObject)newTypeMemberReferenceTreeElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT, null, msgs);
			msgs = basicSetTypeMemberReferenceTreeElement(newTypeMemberReferenceTreeElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT, newTypeMemberReferenceTreeElement, newTypeMemberReferenceTreeElement));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public TreeRootNode getTreeRootNode()
  {
//	  if(getTreeRootNodeGen() == null)
//	  {		  
//		  TreeRootNode root = EMFEcoreFactory.eINSTANCE.createTreeRootNode();
//		  setTreeRootNode(root);
//		  
//		  if(getVariable() != null)
//		  {
//			  root.setSourceClass(getVariable().getVariableType().getInterfaceClass());
//		  }
//	  }
	  
	  return getTreeRootNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.eclipse.symphony.common.emf.TreeRootNode getTreeRootNodeGen()
  {
		return treeRootNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTreeRootNode(org.eclipse.symphony.common.emf.TreeRootNode newTreeRootNode, NotificationChain msgs) {
		org.eclipse.symphony.common.emf.TreeRootNode oldTreeRootNode = treeRootNode;
		treeRootNode = newTreeRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE, oldTreeRootNode, newTreeRootNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeRootNode(org.eclipse.symphony.common.emf.TreeRootNode newTreeRootNode) {
		if (newTreeRootNode != treeRootNode) {
			NotificationChain msgs = null;
			if (treeRootNode != null)
				msgs = ((InternalEObject)treeRootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE, null, msgs);
			if (newTreeRootNode != null)
				msgs = ((InternalEObject)newTreeRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE, null, msgs);
			msgs = basicSetTreeRootNode(newTreeRootNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE, newTreeRootNode, newTreeRootNode));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWatchesList((WatchesList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST:
				return basicSetWatchesList(null, msgs);
			case EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT:
				return basicSetTypeMemberReferenceTreeElement(null, msgs);
			case EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE:
				return basicSetTreeRootNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorPackage.WATCHES_LIST__WATCHES, WatchesList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case EMFEcoreInvocatorPackage.WATCH__NAME:
				return getName();
			case EMFEcoreInvocatorPackage.WATCH__DESCRIPTION:
				return getDescription();
			case EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST:
				if (resolve) return getWatchesList();
				return basicGetWatchesList();
			case EMFEcoreInvocatorPackage.WATCH__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT:
				return getTypeMemberReferenceTreeElement();
			case EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE:
				return getTreeRootNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.WATCH__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST:
				setWatchesList((WatchesList)newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT:
				setTypeMemberReferenceTreeElement((TypeMemberReferenceTreeElement)newValue);
				return;
			case EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE:
				setTreeRootNode((org.eclipse.symphony.common.emf.TreeRootNode)newValue);
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
			case EMFEcoreInvocatorPackage.WATCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.WATCH__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST:
				setWatchesList((WatchesList)null);
				return;
			case EMFEcoreInvocatorPackage.WATCH__VARIABLE:
				setVariable((Variable)null);
				return;
			case EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT:
				setTypeMemberReferenceTreeElement((TypeMemberReferenceTreeElement)null);
				return;
			case EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE:
				setTreeRootNode((org.eclipse.symphony.common.emf.TreeRootNode)null);
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
			case EMFEcoreInvocatorPackage.WATCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreInvocatorPackage.WATCH__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EMFEcoreInvocatorPackage.WATCH__WATCHES_LIST:
				return basicGetWatchesList() != null;
			case EMFEcoreInvocatorPackage.WATCH__VARIABLE:
				return variable != null;
			case EMFEcoreInvocatorPackage.WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT:
				return typeMemberReferenceTreeElement != null;
			case EMFEcoreInvocatorPackage.WATCH__TREE_ROOT_NODE:
				return treeRootNode != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case EMFEcoreInvocatorPackage.WATCH__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return EMFEcoreInvocatorPackage.WATCH__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //WatchImpl
