/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation;
import org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.listeners.AbstractTypeImplementationListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.AbstractVariableAnnotationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.AbstractVariableAnnotationImpl#getVariableInstance <em>Variable Instance</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.impl.AbstractVariableAnnotationImpl#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}</li>
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
	 * The cached value of the '{@link #getSymphonySystemApiAdapter() <em>Symphony System Api Adapter</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSymphonySystemApiAdapter()
	 * @generated
	 * @ordered
	 */
  protected SymphonySystemApiAdapter symphonySystemApiAdapter;

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
		return SymphonyEnvironmentUIPackage.Literals.ABSTRACT_VARIABLE_ANNOTATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE, oldVariable, variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE, oldVariable, variable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE, oldVariableInstance, variableInstance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE, oldVariableInstance, variableInstance));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemApiAdapter getSymphonySystemApiAdapter()
  {
		if (symphonySystemApiAdapter != null && symphonySystemApiAdapter.eIsProxy()) {
			InternalEObject oldSymphonySystemApiAdapter = (InternalEObject)symphonySystemApiAdapter;
			symphonySystemApiAdapter = (SymphonySystemApiAdapter)eResolveProxy(oldSymphonySystemApiAdapter);
			if (symphonySystemApiAdapter != oldSymphonySystemApiAdapter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER, oldSymphonySystemApiAdapter, symphonySystemApiAdapter));
			}
		}
		return symphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemApiAdapter basicGetSymphonySystemApiAdapter()
  {
		return symphonySystemApiAdapter;
	}

  	/**
 	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
 	 * @generated_NOT
 	 */
   public void setSymphonySystemApiAdapter(SymphonySystemApiAdapter newSymphonySystemApiAdapter)
   {
		  // Unregister from previous adapter, if applicable.
		  SymphonySystemApiAdapter oldAdapter = getSymphonySystemApiAdapter();
		  if(oldAdapter != null)
		  {
			  oldAdapter.eAdapters().remove(getPoseProviderAdapter());		  
		  }
		  
		  setSymphonySystemApiAdapterGen(newSymphonySystemApiAdapter);
	
		  // Register to new adapter, if applicable.
		  if(newSymphonySystemApiAdapter != null)
		  {
			  newSymphonySystemApiAdapter.eAdapters().add(getPoseProviderAdapter());
		  }	  
   }
  
   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
   public void setSymphonySystemApiAdapterGen(SymphonySystemApiAdapter newSymphonySystemApiAdapter)
   {
		SymphonySystemApiAdapter oldSymphonySystemApiAdapter = symphonySystemApiAdapter;
		symphonySystemApiAdapter = newSymphonySystemApiAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER, oldSymphonySystemApiAdapter, symphonySystemApiAdapter));
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				if (resolve) return getVariableInstance();
				return basicGetVariableInstance();
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER:
				if (resolve) return getSymphonySystemApiAdapter();
				return basicGetSymphonySystemApiAdapter();
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				setVariableInstance((EObject)newValue);
				return;
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER:
				setSymphonySystemApiAdapter((SymphonySystemApiAdapter)newValue);
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				setVariable((Variable)null);
				return;
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				setVariableInstance((EObject)null);
				return;
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER:
				setSymphonySystemApiAdapter((SymphonySystemApiAdapter)null);
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE:
				return variable != null;
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE:
				return variableInstance != null;
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER:
				return symphonySystemApiAdapter != null;
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
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4:
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
				  if(newTypeApiAdapter instanceof SymphonySystemApiAdapter)
				  {
					  SymphonySystemApiAdapter apiAdapter = (SymphonySystemApiAdapter) newTypeApiAdapter;
					  
					  // Gets the APIAdapter of the pose provider if defined (typically for system assemblies).
					  if(apiAdapter.getSymphonySystem() != null)
					  {
						  if(apiAdapter.getSymphonySystem().getPoseProviderInstance() instanceof SymphonySystemApiAdapter)
						  {
							  SymphonySystemApiAdapter poseProvider = (SymphonySystemApiAdapter) apiAdapter.getSymphonySystem().getPoseProviderInstance();
							  
							  setSymphonySystemApiAdapter(poseProvider);
							  
							  return;
						  }
					  }
					  setSymphonySystemApiAdapter(apiAdapter);					 
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
				  if(msg.getFeatureID(PoseProvider.class) == SymphonyCorePackage.POSE_PROVIDER__POSE_TRANSFORM)
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
