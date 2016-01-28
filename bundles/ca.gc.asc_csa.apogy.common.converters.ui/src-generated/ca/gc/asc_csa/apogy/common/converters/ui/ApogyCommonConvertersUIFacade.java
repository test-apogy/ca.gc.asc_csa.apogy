/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.ui;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.symphony.common.converters.ui.impl.Symphony__CommonConvertersUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIPackage#getSymphony__CommonConvertersUIFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonConvertersUIFacade extends EObject {
	
	public static Symphony__CommonConvertersUIFacade INSTANCE = Symphony__CommonConvertersUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts an ISelection to an object of type targetType
	 * @param selection The ISelection.
	 * @param targetType The class of the targeted type.
	 * @return A list of objects of the targeted type, can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.common.converters.List<org.eclipse.emf.ecore.EJavaObject>" unique="false" many="false" selectionDataType="org.eclipse.symphony.common.converters.ui.ISelection" selectionUnique="false" targetTypeUnique="false"
	 * @generated
	 */
	List<Object> convert(ISelection selection, Class<?> targetType);

} // Symphony__CommonConvertersUIFacade
