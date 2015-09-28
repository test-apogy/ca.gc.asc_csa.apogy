/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.symphony.environment.SlopeRange;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slope Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.SlopeRangeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.SlopeRangeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.SlopeRangeImpl#getSlopeLowerBound <em>Slope Lower Bound</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.SlopeRangeImpl#getSlopeUpperBound <em>Slope Upper Bound</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.SlopeRangeImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlopeRangeImpl extends MinimalEObjectImpl.Container implements SlopeRange {
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
	 * The default value of the '{@link #getSlopeLowerBound() <em>Slope Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_LOWER_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlopeLowerBound() <em>Slope Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected double slopeLowerBound = SLOPE_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlopeUpperBound() <em>Slope Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final double SLOPE_UPPER_BOUND_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getSlopeUpperBound() <em>Slope Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlopeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected double slopeUpperBound = SLOPE_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f COLOR_EDEFAULT = (Color3f)SymphonyEnvironmentFactory.eINSTANCE.createFromString(SymphonyEnvironmentPackage.eINSTANCE.getColor3f(), "1.0,1.0,1.0");

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlopeRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEnvironmentPackage.Literals.SLOPE_RANGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SLOPE_RANGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SLOPE_RANGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlopeLowerBound() {
		return slopeLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeLowerBound(double newSlopeLowerBound) {
		double oldSlopeLowerBound = slopeLowerBound;
		slopeLowerBound = newSlopeLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_LOWER_BOUND, oldSlopeLowerBound, slopeLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlopeUpperBound() {
		return slopeUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlopeUpperBound(double newSlopeUpperBound) {
		double oldSlopeUpperBound = slopeUpperBound;
		slopeUpperBound = newSlopeUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_UPPER_BOUND, oldSlopeUpperBound, slopeUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color3f newColor) {
		Color3f oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SLOPE_RANGE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEnvironmentPackage.SLOPE_RANGE__NAME:
				return getName();
			case SymphonyEnvironmentPackage.SLOPE_RANGE__DESCRIPTION:
				return getDescription();
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_LOWER_BOUND:
				return getSlopeLowerBound();
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_UPPER_BOUND:
				return getSlopeUpperBound();
			case SymphonyEnvironmentPackage.SLOPE_RANGE__COLOR:
				return getColor();
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
			case SymphonyEnvironmentPackage.SLOPE_RANGE__NAME:
				setName((String)newValue);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_LOWER_BOUND:
				setSlopeLowerBound((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_UPPER_BOUND:
				setSlopeUpperBound((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__COLOR:
				setColor((Color3f)newValue);
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
			case SymphonyEnvironmentPackage.SLOPE_RANGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_LOWER_BOUND:
				setSlopeLowerBound(SLOPE_LOWER_BOUND_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_UPPER_BOUND:
				setSlopeUpperBound(SLOPE_UPPER_BOUND_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case SymphonyEnvironmentPackage.SLOPE_RANGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SymphonyEnvironmentPackage.SLOPE_RANGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_LOWER_BOUND:
				return slopeLowerBound != SLOPE_LOWER_BOUND_EDEFAULT;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__SLOPE_UPPER_BOUND:
				return slopeUpperBound != SLOPE_UPPER_BOUND_EDEFAULT;
			case SymphonyEnvironmentPackage.SLOPE_RANGE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
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
				case SymphonyEnvironmentPackage.SLOPE_RANGE__DESCRIPTION: return EMFEcorePackage.DESCRIBED__DESCRIPTION;
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
				case EMFEcorePackage.DESCRIBED__DESCRIPTION: return SymphonyEnvironmentPackage.SLOPE_RANGE__DESCRIPTION;
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
		result.append(", slopeLowerBound: ");
		result.append(slopeLowerBound);
		result.append(", slopeUpperBound: ");
		result.append(slopeUpperBound);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //SlopeRangeImpl
