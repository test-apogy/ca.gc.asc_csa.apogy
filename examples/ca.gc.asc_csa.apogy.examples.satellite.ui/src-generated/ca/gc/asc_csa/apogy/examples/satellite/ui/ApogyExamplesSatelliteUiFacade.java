/**
 * Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.invocator.OperationCallResultsList;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Constellation Facade.  This class provides utility methods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade#getConstellationVariableName <em>Constellation Variable Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiPackage#getSymphony__ExamplesSatelliteUiFacade()
 * @model
 * @generated
 */
public interface Symphony__ExamplesSatelliteUiFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Variable Name</b></em>' attribute.
	 * The default value is <code>"constellation"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constellation Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the name of the constellation {@link Variable}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Variable Name</em>' attribute.
	 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiPackage#getSymphony__ExamplesSatelliteUiFacade_ConstellationVariableName()
	 * @model default="constellation" unique="false" changeable="false"
	 * @generated
	 */
	String getConstellationVariableName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the reference to the Constellation {@link Variable} in the active session.
	 * @return Reference to the Constellation {@link Variable}.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Variable getConstellationVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the reference to the {@link OperationCallResultsList} in the active session that may contain
	 * constellation data products.
	 * @return Reference to the {@link OperationCallResultsList}.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	OperationCallResultsList getOperationCallResultsList();

	public Symphony__ExamplesSatelliteUiFacade INSTANCE = Symphony__ExamplesSatelliteUiFacadeImpl.getInstance();	

} // Symphony__ExamplesSatelliteUiFacade
