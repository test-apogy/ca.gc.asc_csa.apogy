/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.AbstractMapLayer;
import org.eclipse.symphony.core.environment.MapLayerPresentation;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Layer Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapLayerPresentationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapLayerPresentationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapLayerPresentationImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.MapLayerPresentationImpl#getMapLayer <em>Map Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MapLayerPresentationImpl extends MinimalEObjectImpl.Container implements MapLayerPresentation {
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
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMapLayer() <em>Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLayer()
	 * @generated
	 * @ordered
	 */
	protected AbstractMapLayer mapLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapLayerPresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.MAP_LAYER_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapLayer getMapLayer() {
		if (mapLayer != null && mapLayer.eIsProxy()) {
			InternalEObject oldMapLayer = (InternalEObject)mapLayer;
			mapLayer = (AbstractMapLayer)eResolveProxy(oldMapLayer);
			if (mapLayer != oldMapLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__MAP_LAYER, oldMapLayer, mapLayer));
			}
		}
		return mapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapLayer basicGetMapLayer() {
		return mapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapLayer(AbstractMapLayer newMapLayer) {
		AbstractMapLayer oldMapLayer = mapLayer;
		mapLayer = newMapLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__MAP_LAYER, oldMapLayer, mapLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__NAME:
				return getName();
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__DESCRIPTION:
				return getDescription();
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__VISIBLE:
				return isVisible();
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__MAP_LAYER:
				if (resolve) return getMapLayer();
				return basicGetMapLayer();
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
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__NAME:
				setName((String)newValue);
				return;
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__MAP_LAYER:
				setMapLayer((AbstractMapLayer)newValue);
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
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__MAP_LAYER:
				setMapLayer((AbstractMapLayer)null);
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
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__MAP_LAYER:
				return mapLayer != null;
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
				case SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyEnvironmentPackage.MAP_LAYER_PRESENTATION__DESCRIPTION;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //MapLayerPresentationImpl
