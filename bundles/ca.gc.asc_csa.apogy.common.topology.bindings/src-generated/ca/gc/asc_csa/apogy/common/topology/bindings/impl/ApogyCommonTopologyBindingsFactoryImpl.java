/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.bindings.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.topology.bindings.AngleUnits;
import ca.gc.asc_csa.apogy.common.topology.bindings.Axis;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonTopologyBindingsFactoryImpl extends EFactoryImpl implements ApogyCommonTopologyBindingsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCommonTopologyBindingsFactory init()
  {
		try {
			ApogyCommonTopologyBindingsFactory theApogyCommonTopologyBindingsFactory = (ApogyCommonTopologyBindingsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonTopologyBindingsPackage.eNS_URI);
			if (theApogyCommonTopologyBindingsFactory != null) {
				return theApogyCommonTopologyBindingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonTopologyBindingsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCommonTopologyBindingsFactoryImpl()
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
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING: return createRotationBinding();
			case ApogyCommonTopologyBindingsPackage.TRANSLATION_BINDING: return createTranslationBinding();
			case ApogyCommonTopologyBindingsPackage.TRANSFORM_MATRIX_BINDING: return createTransformMatrixBinding();
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING: return createEnumerationSwitchBinding();
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE: return createEnumerationCase();
			case ApogyCommonTopologyBindingsPackage.BINDINGS_LIST: return createBindingsList();
			case ApogyCommonTopologyBindingsPackage.FEATURE_ROOTS_LIST: return createFeatureRootsList();
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET: return createBindingsSet();
			case ApogyCommonTopologyBindingsPackage.APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE: return createApogyCommonTopologyBindingsFacade();
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
			case ApogyCommonTopologyBindingsPackage.AXIS:
				return createAxisFromString(eDataType, initialValue);
			case ApogyCommonTopologyBindingsPackage.ANGLE_UNITS:
				return createAngleUnitsFromString(eDataType, initialValue);
			case ApogyCommonTopologyBindingsPackage.MAP:
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
			case ApogyCommonTopologyBindingsPackage.AXIS:
				return convertAxisToString(eDataType, instanceValue);
			case ApogyCommonTopologyBindingsPackage.ANGLE_UNITS:
				return convertAngleUnitsToString(eDataType, instanceValue);
			case ApogyCommonTopologyBindingsPackage.MAP:
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
	public ApogyCommonTopologyBindingsFacade createApogyCommonTopologyBindingsFacade() {
		ApogyCommonTopologyBindingsFacadeImpl apogy__CommonTopologyBindingsFacade = new ApogyCommonTopologyBindingsFacadeImpl();
		return apogy__CommonTopologyBindingsFacade;
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
	public ApogyCommonTopologyBindingsPackage getApogyCommonTopologyBindingsPackage() {
		return (ApogyCommonTopologyBindingsPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCommonTopologyBindingsPackage getPackage()
  {
		return ApogyCommonTopologyBindingsPackage.eINSTANCE;
	}

} //ApogyCommonTopologyBindingsFactoryImpl
