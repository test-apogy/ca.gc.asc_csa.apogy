package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.text.DecimalFormat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.listeners.AbstractVariableFeatureReferenceListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Feature Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.EMFFeatureOverlayImpl#getVariableFeatureReference <em>Variable Feature Reference</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.EMFFeatureOverlayImpl#getNumberFormat <em>Number Format</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.EMFFeatureOverlayImpl#getVariableFeatureReferenceChangeCount <em>Variable Feature Reference Change Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMFFeatureOverlayImpl extends AbstractTextOverlayImpl implements EMFFeatureOverlay
{
  private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
  private AbstractVariableFeatureReferenceListener abstractVariableFeatureReferenceListener = null;

  
  /**
	 * The cached value of the '{@link #getVariableFeatureReference() <em>Variable Feature Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableFeatureReference()
	 * @generated
	 * @ordered
	 */
  protected VariableFeatureReference variableFeatureReference;

  /**
	 * The default value of the '{@link #getNumberFormat() <em>Number Format</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNumberFormat()
	 * @generated
	 * @ordered
	 */
  protected static final String NUMBER_FORMAT_EDEFAULT = "0.00";

  /**
	 * The cached value of the '{@link #getNumberFormat() <em>Number Format</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNumberFormat()
	 * @generated
	 * @ordered
	 */
  protected String numberFormat = NUMBER_FORMAT_EDEFAULT;

  /**
	 * The default value of the '{@link #getVariableFeatureReferenceChangeCount() <em>Variable Feature Reference Change Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableFeatureReferenceChangeCount()
	 * @generated
	 * @ordered
	 */
	protected static final long VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT_EDEFAULT = 0L;

		/**
	 * The cached value of the '{@link #getVariableFeatureReferenceChangeCount() <em>Variable Feature Reference Change Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableFeatureReferenceChangeCount()
	 * @generated
	 * @ordered
	 */
	protected long variableFeatureReferenceChangeCount = VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EMFFeatureOverlayImpl()
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
		return ApogyAddonsSensorsImagingCameraPackage.Literals.EMF_FEATURE_OVERLAY;
	}

  /**
 	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
 	 * @generated_NOT
 	 */
   public VariableFeatureReference getVariableFeatureReference()
   {
	   VariableFeatureReference tmp = getVariableFeatureReferenceGen();
	   if(tmp == null)
	   {
		   tmp = ApogyCoreInvocatorFactory.eINSTANCE.createVariableFeatureReference();
		   setVariableFeatureReference(tmp);
	   }
	   
	   return tmp;
   }
   
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableFeatureReference getVariableFeatureReferenceGen()
  {
		return variableFeatureReference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetVariableFeatureReference(VariableFeatureReference newVariableFeatureReference, NotificationChain msgs)
  {
		VariableFeatureReference oldVariableFeatureReference = variableFeatureReference;
		variableFeatureReference = newVariableFeatureReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE, oldVariableFeatureReference, newVariableFeatureReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setVariableFeatureReference(VariableFeatureReference newVariableFeatureReference)
  {
	  setVariableFeatureReferenceGen(newVariableFeatureReference);	  
	  getAbstractVariableFeatureReferenceListener().setVariableFeatureReference(newVariableFeatureReference);
	  
	  // Forces the overlay to be updated.
	  setVariableFeatureReferenceChangeCount(getVariableFeatureReferenceChangeCount() + 1);
  }
  
  	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableFeatureReferenceGen(VariableFeatureReference newVariableFeatureReference)
  {
		if (newVariableFeatureReference != variableFeatureReference) {
			NotificationChain msgs = null;
			if (variableFeatureReference != null)
				msgs = ((InternalEObject)variableFeatureReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE, null, msgs);
			if (newVariableFeatureReference != null)
				msgs = ((InternalEObject)newVariableFeatureReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE, null, msgs);
			msgs = basicSetVariableFeatureReference(newVariableFeatureReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE, newVariableFeatureReference, newVariableFeatureReference));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getNumberFormat()
  {
		return numberFormat;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNumberFormat(String newNumberFormat)
  {
		String oldNumberFormat = numberFormat;
		numberFormat = newNumberFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__NUMBER_FORMAT, oldNumberFormat, numberFormat));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVariableFeatureReferenceChangeCount() {
		return variableFeatureReferenceChangeCount;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableFeatureReferenceChangeCount(long newVariableFeatureReferenceChangeCount) {
		long oldVariableFeatureReferenceChangeCount = variableFeatureReferenceChangeCount;
		variableFeatureReferenceChangeCount = newVariableFeatureReferenceChangeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT, oldVariableFeatureReferenceChangeCount, variableFeatureReferenceChangeCount));
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
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE:
				return basicSetVariableFeatureReference(null, msgs);
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
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE:
				return getVariableFeatureReference();
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__NUMBER_FORMAT:
				return getNumberFormat();
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT:
				return getVariableFeatureReferenceChangeCount();
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
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE:
				setVariableFeatureReference((VariableFeatureReference)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__NUMBER_FORMAT:
				setNumberFormat((String)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT:
				setVariableFeatureReferenceChangeCount((Long)newValue);
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
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE:
				setVariableFeatureReference((VariableFeatureReference)null);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__NUMBER_FORMAT:
				setNumberFormat(NUMBER_FORMAT_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT:
				setVariableFeatureReferenceChangeCount(VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT_EDEFAULT);
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
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE:
				return variableFeatureReference != null;
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__NUMBER_FORMAT:
				return NUMBER_FORMAT_EDEFAULT == null ? numberFormat != null : !NUMBER_FORMAT_EDEFAULT.equals(numberFormat);
			case ApogyAddonsSensorsImagingCameraPackage.EMF_FEATURE_OVERLAY__VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT:
				return variableFeatureReferenceChangeCount != VARIABLE_FEATURE_REFERENCE_CHANGE_COUNT_EDEFAULT;
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
		result.append(" (numberFormat: ");
		result.append(numberFormat);
		result.append(", variableFeatureReferenceChangeCount: ");
		result.append(variableFeatureReferenceChangeCount);
		result.append(')');
		return result.toString();
	}

  @Override
  public String getDisplayedString() 
  {	  	  
	  if(getVariableFeatureReference() != null)
	  {		  		  
		  EObject rootEObject = null;
		  
		  // Gets the top level eObject.
		  if (variableFeatureReference.getVariable() != null) 
		  {
				Variable variable = variableFeatureReference.getVariable();
				if (variableFeatureReference.getTypeMemberReferenceListElement() != null) 
				{
					rootEObject = ApogyCoreInvocatorFacade.INSTANCE.getTypeMemberInstance(variableFeatureReference);
				} 
				else 
				{
					rootEObject = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variable);
				}				
		  }
		  		  		 
		  // Explore the Feature root to find the last EObject in the list.
		  EObject eObject = rootEObject;
		  if(variableFeatureReference.getFeatureRoot() != null)
		  {		
			  AbstractFeatureListNode node = variableFeatureReference.getFeatureRoot().getChild();
			  while(node != null)
			  {				  
				  Object object = ApogyCommonEMFFacade.INSTANCE.resolve(rootEObject, node);
				  				  				  
				  if(object instanceof EObject)
				  {
					  eObject = (EObject) object;
					  node = node.getChild();
				  }
				  else 
				  {
					  node = null;
				  }
			  }			  
		  }
		  		  
		  Object featureValue = ApogyCoreInvocatorFacade.INSTANCE.getEMFFeatureValue(variableFeatureReference);
		  
		  // Try to get the Item Provider associated with the feature for the eObject.
		  if(featureValue != null)
		  {
			  AbstractFeatureListNode afln = ApogyCommonEMFFacade.INSTANCE.getLeaf(variableFeatureReference.getFeatureRoot());
			  
			  if(afln instanceof AbstractFeatureSpecifier)
			  {
				  AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) afln;
				  EStructuralFeature feature = abstractFeatureSpecifier.getStructuralFeature();
				  				  				  				  
				  IItemPropertySource propertySource = (IItemPropertySource) adapterFactory.adapt(eObject, IItemPropertySource.class);				  				
				  IItemPropertyDescriptor descriptor = propertySource.getPropertyDescriptor(eObject, feature);
				  				  				  
				  if(descriptor != null)
				  {
					  PropertyValueWrapper wrapper = (PropertyValueWrapper) descriptor.getPropertyValue(eObject);
					  if(wrapper != null)
					  {
						  if(featureValue instanceof Number && getNumberFormat() != null)
						  {
							  try
							  {
								  DecimalFormat decimalFormat = new DecimalFormat(getNumberFormat());
								  Double value = Double.parseDouble(wrapper.getText(eObject));
								  
								  String valueAsString = decimalFormat.format(value);
								  return descriptor.getDisplayName(eObject) + " : " + valueAsString;
							  }
							  catch(Throwable t)
							  {
								  return descriptor.getDisplayName(eObject) + " : " + wrapper.getText(eObject);
							  }
						  }
						  else
						  {					  
							  return descriptor.getDisplayName(eObject) + " : " + wrapper.getText(eObject);
						  }
					  }
				  }
				  else
				  {
					  // TODO : This case should not happen, but it does !
					  if(featureValue instanceof Number && getNumberFormat() != null)
					  {
						  try
						  {
							  DecimalFormat decimalFormat = new DecimalFormat(getNumberFormat());
							  Double value = ((Number)featureValue).doubleValue();
							  String valueAsString = decimalFormat.format(value);
							  return feature.getName() + " : " + valueAsString;
						  }
						  catch(Throwable t)
						  {
							  return feature.getName()  + " : " + featureValue;
						  }
					  }
					  else
					  {
						  return feature.getName()  + " : " + featureValue;
					  }
				  }
				  				  
				  return null;
			  }			 
		  }		  
	  }
	  
	  return null;
  }

  protected AbstractVariableFeatureReferenceListener getAbstractVariableFeatureReferenceListener() 
  {
	  if(abstractVariableFeatureReferenceListener == null)
	  {
		  abstractVariableFeatureReferenceListener = new AbstractVariableFeatureReferenceListener(getVariableFeatureReference())
		  {
			  @Override
			  protected void variableChanged(Variable oldVariable, Variable newVariable)
			  {
				  setVariableFeatureReferenceChangeCount(getVariableFeatureReferenceChangeCount() + 1);
			  }
			  
			  @Override
			  protected void listRootNodeChanged()
			  {
				  setVariableFeatureReferenceChangeCount(getVariableFeatureReferenceChangeCount() + 1);
			  }
			  
			  @Override
			  protected void typeApiAdapterChanged(TypeApiAdapter oldTypeApiAdapter, TypeApiAdapter newTypeApiAdapter)
			  {		
				  setVariableFeatureReferenceChangeCount(getVariableFeatureReferenceChangeCount() + 1);
			  }
		  };
	  }
	  return abstractVariableFeatureReferenceListener;
  }
} //EMFFeatureOverlayImpl
