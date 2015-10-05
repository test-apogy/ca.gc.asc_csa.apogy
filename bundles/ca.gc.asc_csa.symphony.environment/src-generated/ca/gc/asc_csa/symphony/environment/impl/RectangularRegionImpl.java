/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;

import ca.gc.asc_csa.symphony.environment.RectangularRegion;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangular Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getXMin <em>XMin</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getXMax <em>XMax</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getYMin <em>YMin</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getYMax <em>YMax</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getLowerLeftCorner <em>Lower Left Corner</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getUpperLeftCorner <em>Upper Left Corner</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getLowerRightCorner <em>Lower Right Corner</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.RectangularRegionImpl#getUpperRightCorner <em>Upper Right Corner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectangularRegionImpl extends RegionImpl implements RectangularRegion
{
  /**
	 * The default value of the '{@link #getXMin() <em>XMin</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXMin()
	 * @generated
	 * @ordered
	 */
  protected static final double XMIN_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getXMin() <em>XMin</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXMin()
	 * @generated
	 * @ordered
	 */
  protected double xMin = XMIN_EDEFAULT;
  /**
	 * The default value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
  protected static final double XMAX_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getXMax() <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXMax()
	 * @generated
	 * @ordered
	 */
  protected double xMax = XMAX_EDEFAULT;
  /**
	 * The default value of the '{@link #getYMin() <em>YMin</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYMin()
	 * @generated
	 * @ordered
	 */
  protected static final double YMIN_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getYMin() <em>YMin</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYMin()
	 * @generated
	 * @ordered
	 */
  protected double yMin = YMIN_EDEFAULT;
  /**
	 * The default value of the '{@link #getYMax() <em>YMax</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYMax()
	 * @generated
	 * @ordered
	 */
  protected static final double YMAX_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getYMax() <em>YMax</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYMax()
	 * @generated
	 * @ordered
	 */
  protected double yMax = YMAX_EDEFAULT;
  /**
	 * The default value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
  protected static final double XDIMENSION_EDEFAULT = 0.0;
  /**
	 * The default value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
  protected static final double YDIMENSION_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getLowerLeftCorner() <em>Lower Left Corner</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLowerLeftCorner()
	 * @generated
	 * @ordered
	 */
  protected Tuple3d lowerLeftCorner;
  /**
	 * The cached value of the '{@link #getUpperLeftCorner() <em>Upper Left Corner</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUpperLeftCorner()
	 * @generated
	 * @ordered
	 */
  protected Tuple3d upperLeftCorner;
  /**
	 * The cached value of the '{@link #getLowerRightCorner() <em>Lower Right Corner</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLowerRightCorner()
	 * @generated
	 * @ordered
	 */
  protected Tuple3d lowerRightCorner;
  /**
	 * The cached value of the '{@link #getUpperRightCorner() <em>Upper Right Corner</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getUpperRightCorner()
	 * @generated
	 * @ordered
	 */
  protected Tuple3d upperRightCorner;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RectangularRegionImpl()
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
		return SymphonyEnvironmentPackage.Literals.RECTANGULAR_REGION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getXMin()
  {
		return xMin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setXMin(double newXMin)
  {
		double oldXMin = xMin;
		xMin = newXMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMIN, oldXMin, xMin));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getXMax()
  {
		return xMax;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setXMax(double newXMax)
  {
		double oldXMax = xMax;
		xMax = newXMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMAX, oldXMax, xMax));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getYMin()
  {
		return yMin;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setYMin(double newYMin)
  {
		double oldYMin = yMin;
		yMin = newYMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMIN, oldYMin, yMin));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getYMax()
  {
		return yMax;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setYMax(double newYMax)
  {
		double oldYMax = yMax;
		yMax = newYMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMAX, oldYMax, yMax));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getXDimension()
  {
	  return getXMax() - getXMin();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getYDimension()
  {
	  return getYMax() - getYMin();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getLowerLeftCorner()
  {	  
	  if(lowerLeftCorner == null)
	  {
		  lowerLeftCorner = MathFacade.INSTANCE.createTuple3d(getXMin(), getYMin(), 0);		 
	  }
	  
	  return lowerLeftCorner;
  }
 

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Tuple3d basicGetLowerLeftCorner()
  {
		return lowerLeftCorner;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getUpperLeftCorner()
  {
	  if(upperLeftCorner == null)
	  {
		  upperLeftCorner = MathFacade.INSTANCE.createTuple3d(getXMin(), getYMax(), 0);	
	  }
	  return upperLeftCorner;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Tuple3d basicGetUpperLeftCorner()
  {
		return upperLeftCorner;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getLowerRightCorner()
  {
	  if(lowerRightCorner == null)
	  {
		  lowerRightCorner = MathFacade.INSTANCE.createTuple3d(getXMax(), getYMin(), 0);	
	  }
	  return lowerRightCorner;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Tuple3d basicGetLowerRightCorner()
  {
		return lowerRightCorner;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Tuple3d getUpperRightCorner()
  {
	  if(upperRightCorner == null)
	  {
		  upperRightCorner = MathFacade.INSTANCE.createTuple3d(getXMax(), getYMax(), 0);
	  }
	  return upperRightCorner;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Tuple3d basicGetUpperRightCorner()
  {
		return upperRightCorner;
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
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMIN:
				return getXMin();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMAX:
				return getXMax();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMIN:
				return getYMin();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMAX:
				return getYMax();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XDIMENSION:
				return getXDimension();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YDIMENSION:
				return getYDimension();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__LOWER_LEFT_CORNER:
				if (resolve) return getLowerLeftCorner();
				return basicGetLowerLeftCorner();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__UPPER_LEFT_CORNER:
				if (resolve) return getUpperLeftCorner();
				return basicGetUpperLeftCorner();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__LOWER_RIGHT_CORNER:
				if (resolve) return getLowerRightCorner();
				return basicGetLowerRightCorner();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__UPPER_RIGHT_CORNER:
				if (resolve) return getUpperRightCorner();
				return basicGetUpperRightCorner();
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
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMIN:
				setXMin((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMAX:
				setXMax((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMIN:
				setYMin((Double)newValue);
				return;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMAX:
				setYMax((Double)newValue);
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
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMIN:
				setXMin(XMIN_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMAX:
				setXMax(XMAX_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMIN:
				setYMin(YMIN_EDEFAULT);
				return;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMAX:
				setYMax(YMAX_EDEFAULT);
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
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMIN:
				return xMin != XMIN_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XMAX:
				return xMax != XMAX_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMIN:
				return yMin != YMIN_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YMAX:
				return yMax != YMAX_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__XDIMENSION:
				return getXDimension() != XDIMENSION_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__YDIMENSION:
				return getYDimension() != YDIMENSION_EDEFAULT;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__LOWER_LEFT_CORNER:
				return lowerLeftCorner != null;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__UPPER_LEFT_CORNER:
				return upperLeftCorner != null;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__LOWER_RIGHT_CORNER:
				return lowerRightCorner != null;
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION__UPPER_RIGHT_CORNER:
				return upperRightCorner != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (xMin: ");
		result.append(xMin);
		result.append(", xMax: ");
		result.append(xMax);
		result.append(", yMin: ");
		result.append(yMin);
		result.append(", yMax: ");
		result.append(yMax);
		result.append(')');
		return result.toString();
	}

} //RectangularRegionImpl
