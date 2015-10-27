/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.topology.bindings.AngleUnits;
import org.eclipse.symphony.common.topology.bindings.Axis;
import org.eclipse.symphony.common.topology.bindings.BindingsList;
import org.eclipse.symphony.common.topology.bindings.BindingsSet;
import org.eclipse.symphony.common.topology.bindings.EnumerationCase;
import org.eclipse.symphony.common.topology.bindings.EnumerationSwitchBinding;
import org.eclipse.symphony.common.topology.bindings.FeatureRootsList;
import org.eclipse.symphony.common.topology.bindings.RotationBinding;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsFacade;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsFactory;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage;
import org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding;
import org.eclipse.symphony.common.topology.bindings.TranslationBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyBindingsFactoryImpl extends EFactoryImpl implements Symphony__CommonTopologyBindingsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__CommonTopologyBindingsFactory init()
  {
		try {
			Symphony__CommonTopologyBindingsFactory theSymphony__CommonTopologyBindingsFactory = (Symphony__CommonTopologyBindingsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonTopologyBindingsPackage.eNS_URI);
			if (theSymphony__CommonTopologyBindingsFactory != null) {
				return theSymphony__CommonTopologyBindingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonTopologyBindingsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CommonTopologyBindingsFactoryImpl()
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
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING: return createRotationBinding();
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING: return createTranslationBinding();
			case Symphony__CommonTopologyBindingsPackage.TRANSFORM_MATRIX_BINDING: return createTransformMatrixBinding();
			case Symphony__CommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING: return createEnumerationSwitchBinding();
			case Symphony__CommonTopologyBindingsPackage.ENUMERATION_CASE: return createEnumerationCase();
			case Symphony__CommonTopologyBindingsPackage.BINDINGS_LIST: return createBindingsList();
			case Symphony__CommonTopologyBindingsPackage.FEATURE_ROOTS_LIST: return createFeatureRootsList();
			case Symphony__CommonTopologyBindingsPackage.BINDINGS_SET: return createBindingsSet();
			case Symphony__CommonTopologyBindingsPackage.TOPOLOGY_BINDINGS_FACADE: return createTopologyBindingsFacade();
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
			case Symphony__CommonTopologyBindingsPackage.AXIS:
				return createAxisFromString(eDataType, initialValue);
			case Symphony__CommonTopologyBindingsPackage.ANGLE_UNITS:
				return createAngleUnitsFromString(eDataType, initialValue);
			case Symphony__CommonTopologyBindingsPackage.MAP:
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
			case Symphony__CommonTopologyBindingsPackage.AXIS:
				return convertAxisToString(eDataType, instanceValue);
			case Symphony__CommonTopologyBindingsPackage.ANGLE_UNITS:
				return convertAngleUnitsToString(eDataType, instanceValue);
			case Symphony__CommonTopologyBindingsPackage.MAP:
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
	public Axis createAxisFromString(EDataType eDataType, String initialValue) {
		Axis result = Axis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleUnits createAngleUnitsFromString(EDataType eDataType, String initialValue) {
		AngleUnits result = AngleUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleUnitsToString(EDataType eDataType, Object instanceValue) {
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
	public Symphony__CommonTopologyBindingsPackage getSymphony__CommonTopologyBindingsPackage() {
		return (Symphony__CommonTopologyBindingsPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__CommonTopologyBindingsPackage getPackage()
  {
		return Symphony__CommonTopologyBindingsPackage.eINSTANCE;
	}

} //Symphony__CommonTopologyBindingsFactoryImpl
