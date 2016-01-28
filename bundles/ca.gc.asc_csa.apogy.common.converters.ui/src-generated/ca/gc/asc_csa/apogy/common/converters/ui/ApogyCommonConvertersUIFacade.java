/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.converters.ui;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jface.viewers.ISelection;
import ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIPackage#getApogyCommonConvertersUIFacade()
 * @model
 * @generated
 */
public interface ApogyCommonConvertersUIFacade extends EObject {
	
	public static ApogyCommonConvertersUIFacade INSTANCE = ApogyCommonConvertersUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts an ISelection to an object of type targetType
	 * @param selection The ISelection.
	 * @param targetType The class of the targeted type.
	 * @return A list of objects of the targeted type, can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.List<org.eclipse.emf.ecore.EJavaObject>" unique="false" many="false" selectionDataType="ca.gc.asc_csa.apogy.common.converters.ui.ISelection" selectionUnique="false" targetTypeUnique="false"
	 * @generated
	 */
	List<Object> convert(ISelection selection, Class<?> targetType);

} // ApogyCommonConvertersUIFacade
