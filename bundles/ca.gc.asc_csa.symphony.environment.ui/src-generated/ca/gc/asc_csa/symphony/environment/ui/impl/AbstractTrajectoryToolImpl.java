/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.experimental.chart.swt.ChartComposite;

import ca.gc.asc_csa.symphony.environment.ui.AbstractTrajectoryTool;
import ca.gc.asc_csa.symphony.environment.ui.MapAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.MapTool;
import ca.gc.asc_csa.symphony.environment.ui.MapViewItemPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Trajectory Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.AbstractTrajectoryToolImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.impl.AbstractTrajectoryToolImpl#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTrajectoryToolImpl extends TrajectoryProviderImpl implements AbstractTrajectoryTool
{
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
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ACTIVE_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
  protected boolean active = ACTIVE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractTrajectoryToolImpl()
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
		return SymphonyEnvironmentUIPackage.Literals.ABSTRACT_TRAJECTORY_TOOL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isVisible()
  {
		return visible;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVisible(boolean newVisible)
  {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE, oldVisible, visible));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isActive()
  {
		return active;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActive(boolean newActive)
  {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE, oldActive, active));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initialize(ChartComposite composite, JFreeChart chart)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void dispose()
  {
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void positionSelected(int mouseButton, double x, double y)
  { 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public List<AbstractXYAnnotation> getXYShapeAnnotation()
  {
	  return new ArrayList<AbstractXYAnnotation>();
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				return isVisible();
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				return isActive();
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				setActive((Boolean)newValue);
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE:
				return active != ACTIVE_EDEFAULT;
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
		if (baseClass == MapViewItemPresentation.class) {
			switch (derivedFeatureID) {
				case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE: return SymphonyEnvironmentUIPackage.MAP_VIEW_ITEM_PRESENTATION__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == MapAnnotation.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MapTool.class) {
			switch (derivedFeatureID) {
				case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE: return SymphonyEnvironmentUIPackage.MAP_TOOL__ACTIVE;
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
		if (baseClass == MapViewItemPresentation.class) {
			switch (baseFeatureID) {
				case SymphonyEnvironmentUIPackage.MAP_VIEW_ITEM_PRESENTATION__VISIBLE: return SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__VISIBLE;
				default: return -1;
			}
		}
		if (baseClass == MapAnnotation.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == MapTool.class) {
			switch (baseFeatureID) {
				case SymphonyEnvironmentUIPackage.MAP_TOOL__ACTIVE: return SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL__ACTIVE;
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
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
		if (baseClass == MapViewItemPresentation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == MapAnnotation.class) {
			switch (baseOperationID) {
				case SymphonyEnvironmentUIPackage.MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION: return SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION;
				default: return -1;
			}
		}
		if (baseClass == MapTool.class) {
			switch (baseOperationID) {
				case SymphonyEnvironmentUIPackage.MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART: return SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART;
				case SymphonyEnvironmentUIPackage.MAP_TOOL___DISPOSE: return SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___DISPOSE;
				case SymphonyEnvironmentUIPackage.MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE: return SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART:
				initialize((ChartComposite)arguments.get(0), (JFreeChart)arguments.get(1));
				return null;
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___DISPOSE:
				dispose();
				return null;
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE:
				positionSelected((Integer)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION:
				return getXYShapeAnnotation();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(", active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //AbstractTrajectoryToolImpl
