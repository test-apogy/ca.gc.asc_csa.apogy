/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.ImagingUtilities;
import org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.topology.INodeVisitor;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.impl.GroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.impl.ImageSnapshotImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.impl.ImageSnapshotImpl#getFieldOfView <em>Field Of View</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.impl.ImageSnapshotImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageSnapshotImpl extends GroupNodeImpl implements ImageSnapshot
{
  /**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
  protected static final Date TIME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
  protected Date time = TIME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getFieldOfView() <em>Field Of View</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFieldOfView()
	 * @generated
	 * @ordered
	 */
  protected RectangularFrustrumFieldOfView fieldOfView;

  /**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
  protected AbstractEImage image;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ImageSnapshotImpl()
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
		return MRTSensorsImagingPackage.Literals.IMAGE_SNAPSHOT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getTime()
  {
		return time;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTime(Date newTime)
  {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.IMAGE_SNAPSHOT__TIME, oldTime, time));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectangularFrustrumFieldOfView getFieldOfView()
  {
		return fieldOfView;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetFieldOfView(RectangularFrustrumFieldOfView newFieldOfView, NotificationChain msgs)
  {
		RectangularFrustrumFieldOfView oldFieldOfView = fieldOfView;
		fieldOfView = newFieldOfView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW, oldFieldOfView, newFieldOfView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFieldOfView(RectangularFrustrumFieldOfView newFieldOfView)
  {
		if (newFieldOfView != fieldOfView) {
			NotificationChain msgs = null;
			if (fieldOfView != null)
				msgs = ((InternalEObject)fieldOfView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW, null, msgs);
			if (newFieldOfView != null)
				msgs = ((InternalEObject)newFieldOfView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW, null, msgs);
			msgs = basicSetFieldOfView(newFieldOfView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW, newFieldOfView, newFieldOfView));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractEImage getImage()
  {
		return image;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetImage(AbstractEImage newImage, NotificationChain msgs)
  {
		AbstractEImage oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE, oldImage, newImage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setImage(AbstractEImage newImage)
  {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject)image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject)newImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE, newImage, newImage));
	}

  	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double convertToHorizontalAngle(int horizontalPixelPosition) 
	{
		return ImagingUtilities.INSTANCE.linearConvertToHorizontalAngle(this, horizontalPixelPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double convertToVerticalAngle(int verticalPixelPosition) 
	{
		return ImagingUtilities.INSTANCE.linearConvertToVerticalAngle(this, verticalPixelPosition);
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
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW:
				return basicSetFieldOfView(null, msgs);
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE:
				return basicSetImage(null, msgs);
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
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__TIME:
				return getTime();
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW:
				return getFieldOfView();
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE:
				return getImage();
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
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__TIME:
				setTime((Date)newValue);
				return;
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW:
				setFieldOfView((RectangularFrustrumFieldOfView)newValue);
				return;
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE:
				setImage((AbstractEImage)newValue);
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
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW:
				setFieldOfView((RectangularFrustrumFieldOfView)null);
				return;
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE:
				setImage((AbstractEImage)null);
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
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW:
				return fieldOfView != null;
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE:
				return image != null;
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
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case MRTSensorsImagingPackage.IMAGE_SNAPSHOT__TIME: return EMFEcorePackage.TIMED__TIME;
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
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.TIMED__TIME: return MRTSensorsImagingPackage.IMAGE_SNAPSHOT__TIME;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT___CONVERT_TO_HORIZONTAL_ANGLE__INT:
				return convertToHorizontalAngle((Integer)arguments.get(0));
			case MRTSensorsImagingPackage.IMAGE_SNAPSHOT___CONVERT_TO_VERTICAL_ANGLE__INT:
				return convertToVerticalAngle((Integer)arguments.get(0));
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}
  
  @Override
  public void accept(INodeVisitor visitor) 
  {
	  if (visitor.getType().isInstance(this)) 
	  {
		visitor.visit(this);
	  }

	  // We do the same for all the children.
	  for (Node child : getChildren()) 
	  {
		child.accept(visitor);
	  }
  }
} //ImageSnapshotImpl
