/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;

import com.google.common.base.Objects;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Member Reference List Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl#getChild <em>Child</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl#getLeafElement <em>Leaf Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl#isLeaf <em>Leaf</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceListElementImpl#getSubSegmentsCount <em>Sub Segments Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMemberReferenceListElementImpl extends TypeMemberReferenceImpl implements TypeMemberReferenceListElement
{
  /**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
  protected TypeMemberReferenceListElement child;

  /**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ROOT_EDEFAULT = false;

  /**
	 * The default value of the '{@link #isLeaf() <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
  protected static final boolean LEAF_EDEFAULT = false;

  /**
	 * The default value of the '{@link #getSubSegmentsCount() <em>Sub Segments Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSegmentsCount()
	 * @generated
	 * @ordered
	 */
	protected static final int SUB_SEGMENTS_COUNT_EDEFAULT = 0;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TypeMemberReferenceListElementImpl()
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
		return ApogyCoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_LIST_ELEMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement getChild()
  {
		return child;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetChild(TypeMemberReferenceListElement newChild, NotificationChain msgs)
  {
		TypeMemberReferenceListElement oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setChild(TypeMemberReferenceListElement newChild)
  {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT, TypeMemberReferenceListElement.class, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT, TypeMemberReferenceListElement.class, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD, newChild, newChild));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement getParent()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT) return null;
		return (TypeMemberReferenceListElement)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement basicGetParent()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT) return null;
		return (TypeMemberReferenceListElement)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(TypeMemberReferenceListElement newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(TypeMemberReferenceListElement newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD, TypeMemberReferenceListElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT, newParent, newParent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isRoot()
  {
		TypeMemberReferenceListElement _parent = this.getParent();
		return Objects.equal(_parent, null);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement getRootElement()
  {
		TypeMemberReferenceListElement rootElement = basicGetRootElement();
		return rootElement != null && rootElement.eIsProxy() ? (TypeMemberReferenceListElement)eResolveProxy((InternalEObject)rootElement) : rootElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement basicGetRootElement()
  {
		TypeMemberReferenceListElement _xifexpression = null;
		boolean _isRoot = this.isRoot();
		if (_isRoot) {
			return this;
		}
		else {
			TypeMemberReferenceListElement _parent = this.getParent();
			_xifexpression = _parent.getRootElement();
		}
		return _xifexpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement getLeafElement()
  {
		TypeMemberReferenceListElement leafElement = basicGetLeafElement();
		return leafElement != null && leafElement.eIsProxy() ? (TypeMemberReferenceListElement)eResolveProxy((InternalEObject)leafElement) : leafElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement basicGetLeafElement()
  {
		TypeMemberReferenceListElement _xifexpression = null;
		boolean _isLeaf = this.isLeaf();
		if (_isLeaf) {
			return this;
		}
		else {
			TypeMemberReferenceListElement _child = this.getChild();
			_xifexpression = _child.getLeafElement();
		}
		return _xifexpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isLeaf()
  {
		TypeMemberReferenceListElement _child = this.getChild();
		return Objects.equal(_child, null);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public int getSubSegmentsCount() {
		int count = 1;  /** This one counts for one. */
		
		TypeMemberReferenceListElement element = this;
		while (!element.isLeaf()){
			count++;
			element = element.getChild();
		}
		return count;
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD:
				if (child != null)
					msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD, null, msgs);
				return basicSetChild((TypeMemberReferenceListElement)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TypeMemberReferenceListElement)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD:
				return basicSetChild(null, msgs);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD, TypeMemberReferenceListElement.class, msgs);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD:
				return getChild();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT:
				return isRoot();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT_ELEMENT:
				if (resolve) return getRootElement();
				return basicGetRootElement();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF_ELEMENT:
				if (resolve) return getLeafElement();
				return basicGetLeafElement();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF:
				return isLeaf();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__SUB_SEGMENTS_COUNT:
				return getSubSegmentsCount();
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD:
				setChild((TypeMemberReferenceListElement)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT:
				setParent((TypeMemberReferenceListElement)newValue);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD:
				setChild((TypeMemberReferenceListElement)null);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT:
				setParent((TypeMemberReferenceListElement)null);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD:
				return child != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT:
				return basicGetParent() != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT:
				return isRoot() != ROOT_EDEFAULT;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT_ELEMENT:
				return basicGetRootElement() != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF_ELEMENT:
				return basicGetLeafElement() != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF:
				return isLeaf() != LEAF_EDEFAULT;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT__SUB_SEGMENTS_COUNT:
				return getSubSegmentsCount() != SUB_SEGMENTS_COUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TypeMemberReferenceListElementImpl
