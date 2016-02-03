package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.environment.ui.AbstractVariableAnnotation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.listeners.AbstractTypeImplementationListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.AbstractVariableAnnotationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.AbstractVariableAnnotationImpl#getVariableInstance <em>Variable Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.AbstractVariableAnnotationImpl#getApogySystemApiAdapter <em>Apogy System Api Adapter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractVariableAnnotationImpl extends MapAnnotationImpl implements AbstractVariableAnnotation
{
  private AbstractTypeImplementationListener abstractTypeImplementationListener = null;
  private Adapter poseProviderAdapter = null;  
		
  /**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
  protected Variable variable;

  /**
	 * The cached value of the '{@link #getVariableInstance() <em>Variable Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVariableInstance()
	 * @generated
	 * @ordered
	 */
  protected EObject variableInstance;

  /**
	 * The cached value of the '{@link #getApogySystemApiAdapter() <em>Apogy System Api Adapter</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getApogySystemApiAdapter()
	 * @generated
	 * @ordered
	 */
  protected ApogySystemApiAdapter apogySystemApiAdapter;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractVariableAnnotationImpl()
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
		return ApogyCoreEnvironmentUIPackage.Literals.ABSTRACT_VARIABLE_ANNOTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable getVariable()
  {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable basicGetVariable()
  {
		return variable;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setVariable(Variable newVariable)
  {	  	  
	  setVariableGen(newVariable);
	  
	  getAbstractTypeImplementationListener().setVariable(newVariable);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableGen(Variable newVariable)
  {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE, oldVariable, variable));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject getVariableInstance()
  {
		if (variableInstance != null && variableInstance.eIsProxy()) {
			InternalEObject oldVariableInstance = (InternalEObject)variableInstance;
			variableInstance = eResolveProxy(oldVariableInstance);
			if (variableInstance != oldVariableInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE, oldVariableInstance, variableInstance));
			}
		}
		return variableInstance;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject basicGetVariableInstance()
  {
		return variableInstance;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVariableInstance(EObject newVariableInstance)
  {
		EObject oldVariableInstance = variableInstance;
		variableInstance = newVariableInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE, oldVariableInstance, variableInstance));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogySystemApiAdapter getApogySystemApiAdapter()
  {
		if (apogySystemApiAdapter != null && apogySystemApiAdapter.eIsProxy()) {
			InternalEObject oldApogySystemApiAdapter = (InternalEObject)apogySystemApiAdapter;
			apogySystemApiAdapter = (ApogySystemApiAdapter)eResolveProxy(oldApogySystemApiAdapter);
			if (apogySystemApiAdapter != oldApogySystemApiAdapter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER, oldApogySystemApiAdapter, apogySystemApiAdapter));
			}
		}
		return apogySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogySystemApiAdapter basicGetApogySystemApiAdapter()
  {
		return apogySystemApiAdapter;
	}

  	/**
 	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
 	 * @generated_NOT
 	 */
   public void setApogySystemApiAdapter(ApogySystemApiAdapter newApogySystemApiAdapter)
   {
		  // Unregister from previous adapter, if applicable.
		  ApogySystemApiAdapter oldAdapter = getApogySystemApiAdapter();
		  if(oldAdapter != null)
		  {
			  oldAdapter.eAdapters().remove(getPoseProviderAdapter());		  
		  }
		  
		  setApogySystemApiAdapterGen(newApogySystemApiAdapter);
	
		  // Register to new adapter, if applicable.
		  if(newApogySystemApiAdapter != null)
		  {
			  newApogySystemApiAdapter.eAdapters().add(getPoseProviderAdapter());
		  }	  
   }
  
   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
   public void setApogySystemApiAdapterGen(ApogySystemApiAdapter newApogySystemApiAdapter)
   {
		ApogySystemApiAdapter oldApogySystemApiAdapter = apogySystemApiAdapter;
		apogySystemApiAdapter = newApogySystemApiAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER, oldApogySystemApiAdapter, apogySystemApiAdapter));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePose(Matrix4x4 newPose) 
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
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				if (resolve) return getVariableInstance();
				return basicGetVariableInstance();
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER:
				if (resolve) return getApogySystemApiAdapter();
				return basicGetApogySystemApiAdapter();
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
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				setVariableInstance((EObject)newValue);
				return;
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER:
				setApogySystemApiAdapter((ApogySystemApiAdapter)newValue);
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
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				setVariable((Variable)null);
				return;
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				setVariableInstance((EObject)null);
				return;
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER:
				setApogySystemApiAdapter((ApogySystemApiAdapter)null);
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
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				return variable != null;
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				return variableInstance != null;
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER:
				return apogySystemApiAdapter != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4:
				updatePose((Matrix4x4)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

  protected AbstractTypeImplementationListener getAbstractTypeImplementationListener() 
  {
	  if(abstractTypeImplementationListener == null)
	  {
		  abstractTypeImplementationListener = new AbstractTypeImplementationListener(getVariable())
		  {
			  @Override
			  protected void typeApiAdapterChanged(TypeApiAdapter oldTypeApiAdapterr, TypeApiAdapter newTypeApiAdapter) 
			  {
				  if(newTypeApiAdapter instanceof ApogySystemApiAdapter)
				  {
					  ApogySystemApiAdapter apiAdapter = (ApogySystemApiAdapter) newTypeApiAdapter;
					  
					  // Gets the APIAdapter of the pose provider if defined (typically for system assemblies).
					  if(apiAdapter.getApogySystem() != null)
					  {
						  if(apiAdapter.getApogySystem().getPoseProviderInstance() instanceof ApogySystemApiAdapter)
						  {
							  ApogySystemApiAdapter poseProvider = (ApogySystemApiAdapter) apiAdapter.getApogySystem().getPoseProviderInstance();
							  
							  setApogySystemApiAdapter(poseProvider);
							  
							  return;
						  }
					  }
					  setApogySystemApiAdapter(apiAdapter);					 
				  }
			  }
			  
			  @Override
			  protected void instanceChanged(EObject oldInstance,EObject newInstance) 
			  {
				  setVariableInstance(newInstance);
			  }
		  };
	  }
	  return abstractTypeImplementationListener;
  }

  protected Adapter getPoseProviderAdapter()
  {
	  if(poseProviderAdapter == null)
	  {
		  poseProviderAdapter = new AdapterImpl()
		  {
			  @Override
			  public void notifyChanged(Notification msg) 
			  {
				  if(msg.getFeatureID(PoseProvider.class) == ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM)
				  {					  					  
					  if(msg.getNewValue() instanceof Matrix4x4)
					  {
						  Matrix4x4 newPose = (Matrix4x4) msg.getNewValue();
						  						 				
						  updatePose(newPose);
					  }
				  }					  
			  }  
		  };
	  }
	  
	  return poseProviderAdapter;
	}
 
} //AbstractVariableAnnotationImpl
