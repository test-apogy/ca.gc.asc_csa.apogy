/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl#getMap <em>Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractMapLayerImpl#getAbstractMapLayerNode <em>Abstract Map Layer Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMapLayerImpl extends MinimalEObjectImpl.Container implements AbstractMapLayer
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
	 * The cached value of the '{@link #getAbstractMapLayerNode() <em>Abstract Map Layer Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAbstractMapLayerNode()
	 * @generated
	 * @ordered
	 */
  protected AbstractMapLayerNode abstractMapLayerNode;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractMapLayerImpl()
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
		return ApogyCoreEnvironmentPackage.Literals.ABSTRACT_MAP_LAYER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map getMap()
  {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP) return null;
		return (Map)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map basicGetMap()
  {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP) return null;
		return (Map)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMap(Map newMap, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newMap, ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMap(Map newMap)
  {
		if (newMap != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP && newMap != null)) {
			if (EcoreUtil.isAncestor(this, newMap))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, ApogyCoreEnvironmentPackage.MAP__LAYERS, Map.class, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP, newMap, newMap));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public AbstractMapLayerNode getAbstractMapLayerNode()
  {
	  if(getAbstractMapLayerNodeGen() == null)
	  {
		  abstractMapLayerNode = ApogyCoreEnvironmentFactory.eINSTANCE.createAbstractMapLayerNode();
		  abstractMapLayerNode.setAbstractMapLayer(this);
	  }
	  
	  return getAbstractMapLayerNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractMapLayerNode getAbstractMapLayerNodeGen()
  {
		if (abstractMapLayerNode != null && abstractMapLayerNode.eIsProxy()) {
			InternalEObject oldAbstractMapLayerNode = (InternalEObject)abstractMapLayerNode;
			abstractMapLayerNode = (AbstractMapLayerNode)eResolveProxy(oldAbstractMapLayerNode);
			if (abstractMapLayerNode != oldAbstractMapLayerNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE, oldAbstractMapLayerNode, abstractMapLayerNode));
			}
		}
		return abstractMapLayerNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractMapLayerNode basicGetAbstractMapLayerNode()
  {
		return abstractMapLayerNode;
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMap((Map)otherEnd, msgs);
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP:
				return basicSetMap(null, msgs);
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP:
				return eInternalContainer().eInverseRemove(this, ApogyCoreEnvironmentPackage.MAP__LAYERS, Map.class, msgs);
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__NAME:
				return getName();
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__DESCRIPTION:
				return getDescription();
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP:
				if (resolve) return getMap();
				return basicGetMap();
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE:
				if (resolve) return getAbstractMapLayerNode();
				return basicGetAbstractMapLayerNode();
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP:
				setMap((Map)newValue);
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP:
				setMap((Map)null);
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP:
				return basicGetMap() != null;
			case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE:
				return abstractMapLayerNode != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreEnvironmentPackage.ABSTRACT_MAP_LAYER__DESCRIPTION;
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

} //AbstractMapLayerImpl
