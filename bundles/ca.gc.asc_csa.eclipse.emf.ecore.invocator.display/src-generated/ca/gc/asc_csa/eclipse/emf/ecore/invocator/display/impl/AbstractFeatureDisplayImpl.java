/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl;

import java.awt.Point;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier;
import ca.gc.asc_csa.eclipse.emf.ecore.Ranges;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractFeatureDisplay;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.AbstractDisplayImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl.AbstractFeatureDisplayImpl#getAbstractFeatureNode <em>Abstract Feature Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl.AbstractFeatureDisplayImpl#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl.AbstractFeatureDisplayImpl#getMinimumHeight <em>Minimum Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFeatureDisplayImpl extends AbstractDisplayImpl implements AbstractFeatureDisplay
{
  /**
	 * The cached value of the '{@link #getAbstractFeatureNode() <em>Abstract Feature Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAbstractFeatureNode()
	 * @generated
	 * @ordered
	 */
  protected AbstractFeatureNode abstractFeatureNode;

  /**
	 * The default value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
  protected static final int MINIMUM_WIDTH_EDEFAULT = -1;
  /**
	 * The cached value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
  protected int minimumWidth = MINIMUM_WIDTH_EDEFAULT;
  /**
	 * The default value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
  protected static final int MINIMUM_HEIGHT_EDEFAULT = -1;
  /**
	 * The cached value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
  protected int minimumHeight = MINIMUM_HEIGHT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractFeatureDisplayImpl()
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
		return EMFEcoreInvocatorDisplayPackage.Literals.ABSTRACT_FEATURE_DISPLAY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureNode getAbstractFeatureNode()
  {
		if (abstractFeatureNode != null && abstractFeatureNode.eIsProxy()) {
			InternalEObject oldAbstractFeatureNode = (InternalEObject)abstractFeatureNode;
			abstractFeatureNode = (AbstractFeatureNode)eResolveProxy(oldAbstractFeatureNode);
			if (abstractFeatureNode != oldAbstractFeatureNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE, oldAbstractFeatureNode, abstractFeatureNode));
			}
		}
		return abstractFeatureNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureNode basicGetAbstractFeatureNode()
  {
		return abstractFeatureNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAbstractFeatureNode(AbstractFeatureNode newAbstractFeatureNode)
  {
		AbstractFeatureNode oldAbstractFeatureNode = abstractFeatureNode;
		abstractFeatureNode = newAbstractFeatureNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE, oldAbstractFeatureNode, abstractFeatureNode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMinimumWidth()
  {
		return minimumWidth;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinimumWidth(int newMinimumWidth)
  {
		int oldMinimumWidth = minimumWidth;
		minimumWidth = newMinimumWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH, oldMinimumWidth, minimumWidth));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMinimumHeight()
  {
		return minimumHeight;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinimumHeight(int newMinimumHeight)
  {
		int oldMinimumHeight = minimumHeight;
		minimumHeight = newMinimumHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT, oldMinimumHeight, minimumHeight));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Control createControl(Composite parent)
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
  public Point getControlMinimumSize(Control control)
  {
	  return new Point(getMinimumHeight(), getMinimumWidth());
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataBindingContext bindControl(Control control)
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
  public Point getControlMinimumSize(AbstractFeatureDisplay abstractFeatureDisplay, Control control)
  {
	  if(getMinimumHeight() != MINIMUM_HEIGHT_EDEFAULT && getMinimumWidth() != MINIMUM_WIDTH_EDEFAULT)
	  {
		  Point point = new Point(getMinimumHeight(), getMinimumWidth());
		  return point;
	  }
	  else
	  {
		  return null;
	  }
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void updateRange(Control control, Ranges range)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void updateResolved(Control control, boolean resolved)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE:
				if (resolve) return getAbstractFeatureNode();
				return basicGetAbstractFeatureNode();
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH:
				return getMinimumWidth();
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT:
				return getMinimumHeight();
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE:
				setAbstractFeatureNode((AbstractFeatureNode)newValue);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH:
				setMinimumWidth((Integer)newValue);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT:
				setMinimumHeight((Integer)newValue);
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE:
				setAbstractFeatureNode((AbstractFeatureNode)null);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH:
				setMinimumWidth(MINIMUM_WIDTH_EDEFAULT);
				return;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT:
				setMinimumHeight(MINIMUM_HEIGHT_EDEFAULT);
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE:
				return abstractFeatureNode != null;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH:
				return minimumWidth != MINIMUM_WIDTH_EDEFAULT;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT:
				return minimumHeight != MINIMUM_HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY___CREATE_CONTROL__COMPOSITE:
				return createControl((Composite)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL:
				return getControlMinimumSize((Control)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY___BIND_CONTROL__CONTROL:
				return bindControl((Control)arguments.get(0));
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY___UPDATE_RANGE__CONTROL_RANGES:
				updateRange((Control)arguments.get(0), (Ranges)arguments.get(1));
				return null;
			case EMFEcoreInvocatorDisplayPackage.ABSTRACT_FEATURE_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN:
				updateResolved((Control)arguments.get(0), (Boolean)arguments.get(1));
				return null;
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
		result.append(" (minimumWidth: ");
		result.append(minimumWidth);
		result.append(", minimumHeight: ");
		result.append(minimumHeight);
		result.append(')');
		return result.toString();
	}

  /**
   * Returns the EStructuralFeature refered to by a specified AbstractFeatureDisplay.
   * @param abstractFeatureDisplay The specified AbstractFeatureDisplay.
   * @return The EStructuralFeature, null if none is found.
   */
  protected EStructuralFeature getEStructuralFeature(final AbstractFeatureDisplay abstractFeatureDisplay)
  {
	EStructuralFeature eStructuralFeature = null;
	
	if(abstractFeatureDisplay.getAbstractFeatureNode() instanceof AbstractFeatureSpecifier)
	{
		AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) abstractFeatureDisplay.getAbstractFeatureNode();			
		eStructuralFeature = abstractFeatureSpecifier.getStructuralFeature() ;		
	}
	
	return eStructuralFeature;
  }

} //AbstractFeatureDisplayImpl
