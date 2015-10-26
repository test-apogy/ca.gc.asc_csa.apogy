/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.util.Collection;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.environment.AbstractMapLayer;
import org.eclipse.symphony.core.environment.Map;
import org.eclipse.symphony.core.environment.MapNode;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapImpl#getMapNode <em>Map Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map
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
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
  protected Matrix4x4 transformation;

  /**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
  protected EList<AbstractMapLayer> layers;

  /**
	 * The cached value of the '{@link #getMapNode() <em>Map Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapNode()
	 * @generated
	 * @ordered
	 */
  protected MapNode mapNode;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapImpl()
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
		return SymphonyEnvironmentPackage.Literals.MAP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Matrix4x4 getTransformation()
  {
		return transformation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTransformation(Matrix4x4 newTransformation, NotificationChain msgs)
  {
		Matrix4x4 oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP__TRANSFORMATION, oldTransformation, newTransformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTransformation(Matrix4x4 newTransformation)
  {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject)transformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.MAP__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.MAP__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP__TRANSFORMATION, newTransformation, newTransformation));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AbstractMapLayer> getLayers()
  {
		if (layers == null) {
			layers = new EObjectContainmentWithInverseEList<AbstractMapLayer>(AbstractMapLayer.class, this, SymphonyEnvironmentPackage.MAP__LAYERS, SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER__MAP);
		}
		return layers;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public MapNode getMapNode()
  {
	  if(getMapNodeGen() == null)
	  {
		  mapNode = SymphonyEnvironmentFactory.eINSTANCE.createMapNode();
		  mapNode.setDescription("Map Node for Map");
		  mapNode.setNodeId("MAPNODE");
		  		  
		  Matrix4d matrix = new Matrix4d();
		  matrix.setIdentity();
		  mapNode.setTransformation(matrix);
		  
		  mapNode.setMap(this);
	  }
	  
	  return getMapNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MapNode getMapNodeGen()
  {
		if (mapNode != null && mapNode.eIsProxy()) {
			InternalEObject oldMapNode = (InternalEObject)mapNode;
			mapNode = (MapNode)eResolveProxy(oldMapNode);
			if (mapNode != oldMapNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.MAP__MAP_NODE, oldMapNode, mapNode));
			}
		}
		return mapNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MapNode basicGetMapNode()
  {
		return mapNode;
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyEnvironmentPackage.MAP__LAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLayers()).basicAdd(otherEnd, msgs);
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
			case SymphonyEnvironmentPackage.MAP__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
			case SymphonyEnvironmentPackage.MAP__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
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
			case SymphonyEnvironmentPackage.MAP__NAME:
				return getName();
			case SymphonyEnvironmentPackage.MAP__DESCRIPTION:
				return getDescription();
			case SymphonyEnvironmentPackage.MAP__TRANSFORMATION:
				return getTransformation();
			case SymphonyEnvironmentPackage.MAP__LAYERS:
				return getLayers();
			case SymphonyEnvironmentPackage.MAP__MAP_NODE:
				if (resolve) return getMapNode();
				return basicGetMapNode();
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
			case SymphonyEnvironmentPackage.MAP__NAME:
				setName((String)newValue);
				return;
			case SymphonyEnvironmentPackage.MAP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyEnvironmentPackage.MAP__TRANSFORMATION:
				setTransformation((Matrix4x4)newValue);
				return;
			case SymphonyEnvironmentPackage.MAP__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends AbstractMapLayer>)newValue);
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
			case SymphonyEnvironmentPackage.MAP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.MAP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.MAP__TRANSFORMATION:
				setTransformation((Matrix4x4)null);
				return;
			case SymphonyEnvironmentPackage.MAP__LAYERS:
				getLayers().clear();
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
			case SymphonyEnvironmentPackage.MAP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyEnvironmentPackage.MAP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyEnvironmentPackage.MAP__TRANSFORMATION:
				return transformation != null;
			case SymphonyEnvironmentPackage.MAP__LAYERS:
				return layers != null && !layers.isEmpty();
			case SymphonyEnvironmentPackage.MAP__MAP_NODE:
				return mapNode != null;
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
				case SymphonyEnvironmentPackage.MAP__DESCRIPTION: return Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case Symphony__CommonEMFPackage.DESCRIBED__DESCRIPTION: return SymphonyEnvironmentPackage.MAP__DESCRIPTION;
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
} //MapImpl
