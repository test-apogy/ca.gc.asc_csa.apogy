/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.CustomInputConditioningPoint;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ControllerFacadeImpl extends MinimalEObjectImpl.Container implements ControllerFacade
{
	private static ControllerFacade instance = null;

	public static ControllerFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ControllerFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ControllerFacadeImpl()
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
		return EMFEcoreControllersPackage.Literals.CONTROLLER_FACADE;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Object createValue(EParameter eParameter, float value)
  {
	  Object object = null;
	  
	  if(eParameter.getEType().getInstanceClass() == double.class)
	  {
		  object = new Double(value);
	  }
	  else if(eParameter.getEType().getInstanceClass() == float.class)
	  {
		  object = new Float(value);
	  }
	  else if(eParameter.getEType().getInstanceClass() == int.class)
	  {
		  int intValue = Math.round(value);
		  object = new Integer(intValue);
	  }
	  else if(eParameter.getEType().getInstanceClass() == long.class)
	  {
		  long longValue = Math.round(value);
		  object = new Long(longValue);
	  }
	  else if(eParameter.getEType().getInstanceClass() == String.class)
	  {
		  object = new Float(value).toString();
	  }
	  else if(eParameter.getEType().getInstanceClass() == boolean.class)
	  {
		  if(value == 0)
		  {
			  object = new Boolean(false);
		  }
		  else
		  {
			  object = new Boolean(true);
		  }
	  }
	  
	  return object;
  }

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TreeSet<CustomInputConditioningPoint> sortCustomInputConditioningPoint(List<CustomInputConditioningPoint> points) 
	{
		TreeSet<CustomInputConditioningPoint> sortedSet = new TreeSet<CustomInputConditioningPoint>(new CustomInputConditionningPointComparator());
		
		sortedSet.addAll(points);
		
		return sortedSet;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CustomInputConditioningPoint createCustomInputConditioningPoint(double inputValue, double outputValue) 
	{
		CustomInputConditioningPoint point = EMFEcoreControllersFactory.eINSTANCE.createCustomInputConditioningPoint();
		
		point.setInputValue(inputValue);
		point.setOutputValue(outputValue);
		
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		@SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case EMFEcoreControllersPackage.CONTROLLER_FACADE___CREATE_VALUE__EPARAMETER_FLOAT:
				return createValue((EParameter)arguments.get(0), (Float)arguments.get(1));
			case EMFEcoreControllersPackage.CONTROLLER_FACADE___SORT_CUSTOM_INPUT_CONDITIONING_POINT__LIST:
				return sortCustomInputConditioningPoint((List<CustomInputConditioningPoint>)arguments.get(0));
			case EMFEcoreControllersPackage.CONTROLLER_FACADE___CREATE_CUSTOM_INPUT_CONDITIONING_POINT__DOUBLE_DOUBLE:
				return createCustomInputConditioningPoint((Double)arguments.get(0), (Double)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
  
  public class CustomInputConditionningPointComparator implements Comparator<CustomInputConditioningPoint>
  {
	@Override
	public int compare(CustomInputConditioningPoint arg0, CustomInputConditioningPoint arg1) 
	{
		double difference = arg0.getInputValue() - arg1.getInputValue();
		
		if(difference > 0)
		{
			return 1;
		}
		else if (difference < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}	  
  }
 
} //ControllerFacadeImpl
