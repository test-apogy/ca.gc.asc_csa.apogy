/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology.impl;

import java.util.SortedSet;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.topology.SymphonyEnvironmentNode;
import org.eclipse.symphony.core.topology.SymphonySystemAPIsNode;
import org.eclipse.symphony.core.topology.SymphonyTopologyFacade;
import org.eclipse.symphony.core.topology.SymphonyTopologyFactory;
import org.eclipse.symphony.core.topology.SymphonyTopologyPackage;
import org.eclipse.symphony.core.topology.SystemsTopologyAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyTopologyFactoryImpl extends EFactoryImpl implements SymphonyTopologyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyTopologyFactory init()
  {
		try {
			SymphonyTopologyFactory theSymphonyTopologyFactory = (SymphonyTopologyFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyTopologyPackage.eNS_URI);
			if (theSymphonyTopologyFactory != null) {
				return theSymphonyTopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyTopologyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyTopologyFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case SymphonyTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER: return createSystemsTopologyAdapter();
			case SymphonyTopologyPackage.SYMPHONY_ENVIRONMENT_NODE: return createSymphonyEnvironmentNode();
			case SymphonyTopologyPackage.SYMPHONY_SYSTEM_AP_IS_NODE: return createSymphonySystemAPIsNode();
			case SymphonyTopologyPackage.SYMPHONY_TOPOLOGY_FACADE: return createSymphonyTopologyFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case SymphonyTopologyPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case SymphonyTopologyPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SystemsTopologyAdapter createSystemsTopologyAdapter()
  {
		SystemsTopologyAdapterImpl systemsTopologyAdapter = new SystemsTopologyAdapterImpl();
		return systemsTopologyAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironmentNode createSymphonyEnvironmentNode()
  {
		SymphonyEnvironmentNodeImpl symphonyEnvironmentNode = new SymphonyEnvironmentNodeImpl();
		return symphonyEnvironmentNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonySystemAPIsNode createSymphonySystemAPIsNode()
  {
		SymphonySystemAPIsNodeImpl symphonySystemAPIsNode = new SymphonySystemAPIsNodeImpl();
		return symphonySystemAPIsNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyTopologyFacade createSymphonyTopologyFacade()
  {
		SymphonyTopologyFacadeImpl symphonyTopologyFacade = new SymphonyTopologyFacadeImpl();
		return symphonyTopologyFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyTopologyPackage getSymphonyTopologyPackage()
  {
		return (SymphonyTopologyPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyTopologyPackage getPackage()
  {
		return SymphonyTopologyPackage.eINSTANCE;
	}

} //SymphonyTopologyFactoryImpl
