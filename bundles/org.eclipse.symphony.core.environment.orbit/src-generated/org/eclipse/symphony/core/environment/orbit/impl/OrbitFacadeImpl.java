/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.environment.orbit.AbstractOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.Orbit;
import org.eclipse.symphony.core.environment.orbit.OrbitFacade;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OrbitFacadeImpl extends MinimalEObjectImpl.Container implements OrbitFacade 
{
	private static OrbitFacade instance = null;
	public static OrbitFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new OrbitFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentOrbitPackage.Literals.ORBIT_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public OrbitModel createOrbitModelCopy(OrbitModel originalOrbitModel) 
	{
		OrbitModel orbitModelCopy = EcoreUtil.copy(originalOrbitModel);
		
		Orbit initialOrbitCopy = null;
		
		// Copies the initial orbit.
		if(originalOrbitModel.getInitialOrbit() != null)
		{
			initialOrbitCopy = EcoreUtil.copy(originalOrbitModel.getInitialOrbit());
		}
		
		// Copies the propagator.
		AbstractOrbitPropagator propagatorCopy = null;
		if(originalOrbitModel.getPropagator() != null)
		{
			propagatorCopy = EcoreUtil.copy(originalOrbitModel.getPropagator());
			propagatorCopy.setInitialOrbit(initialOrbitCopy);			
		}
		
		// Sets the initial orbit and propagator.
		orbitModelCopy.setInitialOrbit(initialOrbitCopy);
		orbitModelCopy.setPropagator(propagatorCopy);
		
		return orbitModelCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CoreEnvironmentOrbitPackage.ORBIT_FACADE___CREATE_ORBIT_MODEL_COPY__ORBITMODEL:
				return createOrbitModelCopy((OrbitModel)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OrbitFacadeImpl
