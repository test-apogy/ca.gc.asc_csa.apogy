/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings.impl;

import ca.gc.asc_csa.topology.bindings.*;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.topology.bindings.ANGLE_UNITS;
import ca.gc.asc_csa.topology.bindings.AXIS;
import ca.gc.asc_csa.topology.bindings.BindingsList;
import ca.gc.asc_csa.topology.bindings.BindingsSet;
import ca.gc.asc_csa.topology.bindings.FeatureRootsList;
import ca.gc.asc_csa.topology.bindings.RotationBinding;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsFacade;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsFactory;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.asc_csa.topology.bindings.TransformMatrixBinding;
import ca.gc.asc_csa.topology.bindings.TranslationBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyBindingsFactoryImpl extends EFactoryImpl implements TopologyBindingsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static TopologyBindingsFactory init()
  {
		try {
			TopologyBindingsFactory theTopologyBindingsFactory = (TopologyBindingsFactory)EPackage.Registry.INSTANCE.getEFactory(TopologyBindingsPackage.eNS_URI);
			if (theTopologyBindingsFactory != null) {
				return theTopologyBindingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TopologyBindingsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TopologyBindingsFactoryImpl()
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
			case TopologyBindingsPackage.ROTATION_BINDING: return createRotationBinding();
			case TopologyBindingsPackage.TRANSLATION_BINDING: return createTranslationBinding();
			case TopologyBindingsPackage.TRANSFORM_MATRIX_BINDING: return createTransformMatrixBinding();
			case TopologyBindingsPackage.ENUMERATION_SWITCH_BINDING: return createEnumerationSwitchBinding();
			case TopologyBindingsPackage.ENUMERATION_CASE: return createEnumerationCase();
			case TopologyBindingsPackage.BINDINGS_LIST: return createBindingsList();
			case TopologyBindingsPackage.FEATURE_ROOTS_LIST: return createFeatureRootsList();
			case TopologyBindingsPackage.BINDINGS_SET: return createBindingsSet();
			case TopologyBindingsPackage.TOPOLOGY_BINDINGS_FACADE: return createTopologyBindingsFacade();
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
			case TopologyBindingsPackage.AXIS:
				return createAXISFromString(eDataType, initialValue);
			case TopologyBindingsPackage.ANGLE_UNITS:
				return createANGLE_UNITSFromString(eDataType, initialValue);
			case TopologyBindingsPackage.MAP:
				return createMapFromString(eDataType, initialValue);
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
			case TopologyBindingsPackage.AXIS:
				return convertAXISToString(eDataType, instanceValue);
			case TopologyBindingsPackage.ANGLE_UNITS:
				return convertANGLE_UNITSToString(eDataType, instanceValue);
			case TopologyBindingsPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RotationBinding createRotationBinding()
  {
		RotationBindingImpl rotationBinding = new RotationBindingImpl();
		return rotationBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TranslationBinding createTranslationBinding()
  {
		TranslationBindingImpl translationBinding = new TranslationBindingImpl();
		return translationBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TransformMatrixBinding createTransformMatrixBinding()
  {
		TransformMatrixBindingImpl transformMatrixBinding = new TransformMatrixBindingImpl();
		return transformMatrixBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnumerationSwitchBinding createEnumerationSwitchBinding()
  {
		EnumerationSwitchBindingImpl enumerationSwitchBinding = new EnumerationSwitchBindingImpl();
		return enumerationSwitchBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnumerationCase createEnumerationCase()
  {
		EnumerationCaseImpl enumerationCase = new EnumerationCaseImpl();
		return enumerationCase;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindingsList createBindingsList()
  {
		BindingsListImpl bindingsList = new BindingsListImpl();
		return bindingsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FeatureRootsList createFeatureRootsList()
  {
		FeatureRootsListImpl featureRootsList = new FeatureRootsListImpl();
		return featureRootsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindingsSet createBindingsSet()
  {
		BindingsSetImpl bindingsSet = new BindingsSetImpl();
		return bindingsSet;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TopologyBindingsFacade createTopologyBindingsFacade()
  {
		TopologyBindingsFacadeImpl topologyBindingsFacade = new TopologyBindingsFacadeImpl();
		return topologyBindingsFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AXIS createAXISFromString(EDataType eDataType, String initialValue)
  {
		AXIS result = AXIS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertAXISToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ANGLE_UNITS createANGLE_UNITSFromString(EDataType eDataType, String initialValue)
  {
		ANGLE_UNITS result = ANGLE_UNITS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertANGLE_UNITSToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue)
  {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMapToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TopologyBindingsPackage getTopologyBindingsPackage()
  {
		return (TopologyBindingsPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static TopologyBindingsPackage getPackage()
  {
		return TopologyBindingsPackage.eINSTANCE;
	}

} //TopologyBindingsFactoryImpl
