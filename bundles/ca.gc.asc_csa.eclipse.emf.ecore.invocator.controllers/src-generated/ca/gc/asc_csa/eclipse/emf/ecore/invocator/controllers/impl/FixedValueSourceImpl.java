/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.FixedValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.EDataTypeArgumentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Value Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl.FixedValueSourceImpl#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedValueSourceImpl extends EDataTypeArgumentImpl implements FixedValueSource
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FixedValueSourceImpl()
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
		return EMFEcoreControllersPackage.Literals.FIXED_VALUE_SOURCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindedEDataTypeArgument getBindedEDataTypeArgument()
  {
		if (eContainerFeatureID() != EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT) return null;
		return (BindedEDataTypeArgument)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindedEDataTypeArgument basicGetBindedEDataTypeArgument()
  {
		if (eContainerFeatureID() != EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT) return null;
		return (BindedEDataTypeArgument)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetBindedEDataTypeArgument(BindedEDataTypeArgument newBindedEDataTypeArgument, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newBindedEDataTypeArgument, EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBindedEDataTypeArgument(BindedEDataTypeArgument newBindedEDataTypeArgument)
  {
		if (newBindedEDataTypeArgument != eInternalContainer() || (eContainerFeatureID() != EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT && newBindedEDataTypeArgument != null)) {
			if (EcoreUtil.isAncestor(this, newBindedEDataTypeArgument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBindedEDataTypeArgument != null)
				msgs = ((InternalEObject)newBindedEDataTypeArgument).eInverseAdd(this, EMFEcoreControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE, BindedEDataTypeArgument.class, msgs);
			msgs = basicSetBindedEDataTypeArgument(newBindedEDataTypeArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT, newBindedEDataTypeArgument, newBindedEDataTypeArgument));
	}



  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Object getSourceValue()
  {	  
	  return getParameterValue();
  }
  
  @Override
  public EParameter getEParameter() 
  {	  
	  return getBindedEDataTypeArgument().getEParameter();
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBindedEDataTypeArgument((BindedEDataTypeArgument)otherEnd, msgs);
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				return basicSetBindedEDataTypeArgument(null, msgs);
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				return eInternalContainer().eInverseRemove(this, EMFEcoreControllersPackage.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE, BindedEDataTypeArgument.class, msgs);
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				if (resolve) return getBindedEDataTypeArgument();
				return basicGetBindedEDataTypeArgument();
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				setBindedEDataTypeArgument((BindedEDataTypeArgument)newValue);
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				setBindedEDataTypeArgument((BindedEDataTypeArgument)null);
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT:
				return basicGetBindedEDataTypeArgument() != null;
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
		if (baseClass == ValueSource.class) {
			switch (derivedFeatureID) {
				case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT: return EMFEcoreControllersPackage.VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT;
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
		if (baseClass == ValueSource.class) {
			switch (baseFeatureID) {
				case EMFEcoreControllersPackage.VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT: return EMFEcoreControllersPackage.FIXED_VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT;
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
		if (baseClass == ValueSource.class) {
			switch (baseOperationID) {
				case EMFEcoreControllersPackage.VALUE_SOURCE___GET_SOURCE_VALUE: return EMFEcoreControllersPackage.FIXED_VALUE_SOURCE___GET_SOURCE_VALUE;
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
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE___GET_SOURCE_VALUE:
				return getSourceValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FixedValueSourceImpl
