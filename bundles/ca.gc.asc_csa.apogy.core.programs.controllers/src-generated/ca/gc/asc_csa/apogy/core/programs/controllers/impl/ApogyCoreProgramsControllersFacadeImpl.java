package ca.gc.asc_csa.apogy.core.programs.controllers.impl;
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
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCoreProgramsControllersFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreProgramsControllersFacade
{
	private static ApogyCoreProgramsControllersFacade instance = null;

	public static ApogyCoreProgramsControllersFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogyCoreProgramsControllersFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyCoreProgramsControllersFacadeImpl()
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
		return ApogyCoreProgramsControllersPackage.Literals.APOGY_CORE_PROGRAMS_CONTROLLERS_FACADE;
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
		CustomInputConditioningPoint point = ApogyCoreProgramsControllersFactory.eINSTANCE.createCustomInputConditioningPoint();
		
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
			case ApogyCoreProgramsControllersPackage.APOGY_CORE_PROGRAMS_CONTROLLERS_FACADE___CREATE_VALUE__EPARAMETER_FLOAT:
				return createValue((EParameter)arguments.get(0), (Float)arguments.get(1));
			case ApogyCoreProgramsControllersPackage.APOGY_CORE_PROGRAMS_CONTROLLERS_FACADE___SORT_CUSTOM_INPUT_CONDITIONING_POINT__LIST:
				return sortCustomInputConditioningPoint((List<CustomInputConditioningPoint>)arguments.get(0));
			case ApogyCoreProgramsControllersPackage.APOGY_CORE_PROGRAMS_CONTROLLERS_FACADE___CREATE_CUSTOM_INPUT_CONDITIONING_POINT__DOUBLE_DOUBLE:
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
 
} //ApogyCoreProgramsControllersFacadeImpl
