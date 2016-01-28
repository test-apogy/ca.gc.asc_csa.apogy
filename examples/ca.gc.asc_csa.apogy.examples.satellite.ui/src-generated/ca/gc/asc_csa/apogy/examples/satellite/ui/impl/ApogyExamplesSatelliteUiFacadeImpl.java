/**
 * Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.DataProductsList;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.OperationCallResultsList;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade;
import org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiFacadeImpl#getConstellationVariableName <em>Constellation Variable Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Symphony__ExamplesSatelliteUiFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__ExamplesSatelliteUiFacade {

	/**
	 * The default value of the '{@link #getConstellationVariableName() <em>Constellation Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTELLATION_VARIABLE_NAME_EDEFAULT = "constellation";

	/**
	 * The cached value of the '{@link #getConstellationVariableName() <em>Constellation Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationVariableName()
	 * @generated
	 * @ordered
	 */
	protected String constellationVariableName = CONSTELLATION_VARIABLE_NAME_EDEFAULT;

	private static Symphony__ExamplesSatelliteUiFacade instance = null;

	public static Symphony__ExamplesSatelliteUiFacade getInstance() {
		if (instance == null) {
			instance = new Symphony__ExamplesSatelliteUiFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__ExamplesSatelliteUiFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatelliteUiPackage.Literals.SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstellationVariableName() {
		return constellationVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Variable getConstellationVariable() {
		List<Variable> variables = Symphony__CoreInvocatorFacade.INSTANCE.getVariableByName(Symphony__CoreInvocatorFacade.INSTANCE.getActiveInvocatorSession(), getConstellationVariableName());		
		return variables.isEmpty() ? null : variables.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public OperationCallResultsList getOperationCallResultsList() {
		OperationCallResultsList operationCallResultsList = null;
		
		InvocatorSession session = Symphony__CoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session != null){
			Environment environment = session.getEnvironment();
			if (environment != null){
				Context context = environment.getActiveContext();
				if (context != null){
					DataProductsList dataProductsList = context.getDataProductsList();
					if (dataProductsList != null){
						operationCallResultsList = dataProductsList.getOperationCallResultsList();
					}
				}
			}
		}
		
		return operationCallResultsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__ExamplesSatelliteUiPackage.SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME:
				return getConstellationVariableName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__ExamplesSatelliteUiPackage.SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME:
				return CONSTELLATION_VARIABLE_NAME_EDEFAULT == null ? constellationVariableName != null : !CONSTELLATION_VARIABLE_NAME_EDEFAULT.equals(constellationVariableName);
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
			case Symphony__ExamplesSatelliteUiPackage.SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE:
				return getConstellationVariable();
			case Symphony__ExamplesSatelliteUiPackage.SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST:
				return getOperationCallResultsList();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constellationVariableName: ");
		result.append(constellationVariableName);
		result.append(')');
		return result.toString();
	}

} //Symphony__ExamplesSatelliteUiFacadeImpl
