/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.symphony;

import org.eclipse.symphony.core.SymphonyInitializationData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rover Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the specialized data structure which is used to essentially
 * save and later restore the state of the component; this functionality is
 * implemented by the apply() (load) and collect() (save) methods of the rover's
 * API adapter,
 * which is {@link org.eclipse.symphony.examples.rover.symphony.RoverSymphonySystemApiAdapter}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.rover.symphony.RoverData#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.rover.symphony.RoverData#isDisposed <em>Disposed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.rover.symphony.SymphonyExampleRoverPackage#getRoverData()
 * @model
 * @generated
 */
public interface RoverData extends SymphonyInitializationData {

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the rover has been initialized
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.eclipse.symphony.examples.rover.symphony.SymphonyExampleRoverPackage#getRoverData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.rover.symphony.RoverData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the rover has been disposed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see org.eclipse.symphony.examples.rover.symphony.SymphonyExampleRoverPackage#getRoverData_Disposed()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isDisposed();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.rover.symphony.RoverData#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);
} // RoverData
