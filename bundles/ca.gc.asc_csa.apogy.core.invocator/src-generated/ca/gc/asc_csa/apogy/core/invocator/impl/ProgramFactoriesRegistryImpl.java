/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.emf.Activator;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Factories Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramFactoriesRegistryImpl#getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramFactoriesRegistryImpl#getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramFactoriesRegistryImpl#getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramFactoriesRegistryImpl#getProgramFactoriesMap <em>Program Factories Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramFactoriesRegistryImpl extends MinimalEObjectImpl.Container implements ProgramFactoriesRegistry {
	
	/**
	 * @generated_NOT
	 */
	private static ProgramFactoriesRegistry instance = null;

	/**
	 * @generated_NOT
	 */
	public static ProgramFactoriesRegistry getInstance() {
		if (instance == null) {
			instance = new ProgramFactoriesRegistryImpl();
		}
		return instance;
	}
	
	/**
	 * The default value of the '{@link #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID() <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID_EDEFAULT = "ca.gc.asc_csa.apogy.core.invocator.programFactoryProvider";
	/**
	 * The cached value of the '{@link #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID() <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID()
	 * @generated
	 * @ordered
	 */
	protected String prograM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID = PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID() <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID_EDEFAULT = "programEClass";
	/**
	 * The cached value of the '{@link #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID() <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID()
	 * @generated
	 * @ordered
	 */
	protected String prograM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID = PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID() <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID_EDEFAULT = "factory";
	/**
	 * The cached value of the '{@link #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID() <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID()
	 * @generated
	 * @ordered
	 */
	protected String prograM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID = PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getProgramFactoriesMap() <em>Program Factories Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramFactoriesMap()
	 * @generated
	 * @ordered
	 */
	protected HashMap<EClass, ProgramFactory> programFactoriesMap;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramFactoriesRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.PROGRAM_FACTORIES_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID() {
		return prograM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID() {
		return prograM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID() {
		return prograM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public HashMap<EClass, ProgramFactory> getProgramFactoriesMap() {
		HashMap<EClass, ProgramFactory> map = getProgramFactoriesMapGen();
		
		if (programFactoriesMap == null){
			map = new HashMap<EClass, ProgramFactory>(); 
			
			IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
					.getExtensionPoint(getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID());

			System.out.println("ProgramFactoriesRegistryImpl.getProgramFactoriesMap() : " + getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID());
			
			IConfigurationElement[] contributors = extensionPoint
					.getConfigurationElements();

			for (int i = 0; i < contributors.length; i++) {
				IConfigurationElement contributor = contributors[i];
				try {
					String eClassStr = contributor.getAttribute(getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID());
					EClass eClass = ApogyCommonEMFFacade.INSTANCE.getEClass(eClassStr);
					ProgramFactory programFactory = (ProgramFactory) contributor
							.createExecutableExtension(getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID());
					map.put(eClass, programFactory);
				} catch (Exception e) {
					e.printStackTrace();
					Logger.INSTANCE.log(Activator.ID, this,
							"Failed to load contributed ProgramFactory from <" + contributor.getClass().getName() + ">",
							EventSeverity.ERROR, e);
				}
			}

			/*if (contributors.length > 0){
				IConfigurationElement contributor = contributors[0];
				
				String eClassStr = contributor.getAttribute(getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID());				
				EClass eClass = ApogyCommonEMFFacade.INSTANCE.getEClass(eClassStr);				

				try {
					ProgramFactory programFactory = (ProgramFactory) contributor.createExecutableExtension(getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID());
					map.put(eClass, programFactory);
				} catch (CoreException e) {
					e.printStackTrace();
				}								
			}*/
			
			System.out.println("ProgramFactoriesRegistryImpl.getProgramFactoriesMap() size = " + map.size());
			
			setProgramFactoriesMap(map);
		}		
		
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<EClass, ProgramFactory> getProgramFactoriesMapGen() {
		return programFactoriesMap;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramFactoriesMap(HashMap<EClass, ProgramFactory> newProgramFactoriesMap) {
		HashMap<EClass, ProgramFactory> oldProgramFactoriesMap = programFactoriesMap;
		programFactoriesMap = newProgramFactoriesMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORIES_MAP, oldProgramFactoriesMap, programFactoriesMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ProgramFactory getFactory(EClass eClass) {
		return getProgramFactoriesMap().get(eClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID:
				return getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID();
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID:
				return getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID();
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID:
				return getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID();
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORIES_MAP:
				return getProgramFactoriesMap();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORIES_MAP:
				setProgramFactoriesMap((HashMap<EClass, ProgramFactory>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORIES_MAP:
				setProgramFactoriesMap((HashMap<EClass, ProgramFactory>)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID:
				return PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID_EDEFAULT == null ? prograM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID != null : !PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID_EDEFAULT.equals(prograM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID);
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID:
				return PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID_EDEFAULT == null ? prograM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID != null : !PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID_EDEFAULT.equals(prograM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID);
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID:
				return PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID_EDEFAULT == null ? prograM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID != null : !PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID_EDEFAULT.equals(prograM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID);
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY__PROGRAM_FACTORIES_MAP:
				return programFactoriesMap != null;
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
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY___GET_FACTORY__ECLASS:
				return getFactory((EClass)arguments.get(0));
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
		result.append(" (PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID: ");
		result.append(prograM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID);
		result.append(", PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID: ");
		result.append(prograM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID);
		result.append(", PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID: ");
		result.append(prograM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID);
		result.append(", programFactoriesMap: ");
		result.append(programFactoriesMap);
		result.append(')');
		return result.toString();
	}

} //ProgramFactoriesRegistryImpl
