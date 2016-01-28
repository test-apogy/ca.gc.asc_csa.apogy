/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIFacade;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CommonConvertersUIFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CommonConvertersUIFacade {
	
	private static Symphony__CommonConvertersUIFacade instance = null;
	
	public static Symphony__CommonConvertersUIFacade getInstance()
	{
		if (instance == null)
		{
			instance = new Symphony__CommonConvertersUIFacadeImpl();
		}
		
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CommonConvertersUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonConvertersUIPackage.Literals.SYMPHONY_COMMON_CONVERTERS_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public List<Object> convert(ISelection selection, Class<?> targetType)
	{
		synchronized (Symphony__CommonConvertersFacade.INSTANCE)
		{
			List<Object> results = new ArrayList<Object>();
					 
			if (selection != null && targetType != null)
			{
				// First, tries to convert the selection directly.
				Object result = null;
				
				try
				{
					result = Symphony__CommonConvertersFacade.INSTANCE.convert((Object) selection, targetType);
				}
				catch (Exception e)
				{
					
				}
					
				if (result != null)
				{
					results.add(result);
				}
				else
				{
					if (selection instanceof IStructuredSelection)
					{
						IStructuredSelection structuredSelection = (IStructuredSelection) selection;

						// If the selection is not empty.
						if (!structuredSelection.isEmpty())
						{
							Iterator<?> it = structuredSelection.toList().iterator();
								
							while (it.hasNext())
							{
								Object element = it.next();

								try
								{
									// If the selection content is already of the required type, just return it.
									if (targetType.isAssignableFrom(element.getClass()))
									{
										results.add(element);
									}
									else
									{
										// Tries to convert the element.
										Object output = Symphony__CommonConvertersFacade.INSTANCE.convert(element, targetType);

										/* If no direct conversion from ISelection exist, tries to convert
										 * the first element of the selection if applicable.*/
										if (output != null)
										{
											results.add(output);
										}
									}
								}
								catch (Throwable t)
								{
									// Do nothing
								}
							}
						}
					}
				}
			}
				
			return results;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonConvertersUIPackage.SYMPHONY_COMMON_CONVERTERS_UI_FACADE___CONVERT__ISELECTION_CLASS:
				return convert((ISelection)arguments.get(0), (Class<?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CommonConvertersUIFacadeImpl
