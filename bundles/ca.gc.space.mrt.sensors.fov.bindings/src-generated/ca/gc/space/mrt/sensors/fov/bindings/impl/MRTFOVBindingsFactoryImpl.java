/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.fov.bindings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import ca.gc.space.mrt.sensors.fov.bindings.ConicalFieldOfViewBinding;
import ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsFactory;
import ca.gc.space.mrt.sensors.fov.bindings.MRTFOVBindingsPackage;
import ca.gc.space.mrt.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRTFOVBindingsFactoryImpl extends EFactoryImpl implements MRTFOVBindingsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static MRTFOVBindingsFactory init()
  {
		try {
			MRTFOVBindingsFactory theMRTFOVBindingsFactory = (MRTFOVBindingsFactory)EPackage.Registry.INSTANCE.getEFactory(MRTFOVBindingsPackage.eNS_URI);
			if (theMRTFOVBindingsFactory != null) {
				return theMRTFOVBindingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MRTFOVBindingsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTFOVBindingsFactoryImpl()
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
			case MRTFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING: return createCircularSectorFieldOfViewBinding();
			case MRTFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING: return createConicalFieldOfViewBinding();
			case MRTFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING: return createRectangularFrustrumFieldOfViewBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CircularSectorFieldOfViewBinding createCircularSectorFieldOfViewBinding()
  {
		CircularSectorFieldOfViewBindingImpl circularSectorFieldOfViewBinding = new CircularSectorFieldOfViewBindingImpl();
		return circularSectorFieldOfViewBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConicalFieldOfViewBinding createConicalFieldOfViewBinding()
  {
		ConicalFieldOfViewBindingImpl conicalFieldOfViewBinding = new ConicalFieldOfViewBindingImpl();
		return conicalFieldOfViewBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectangularFrustrumFieldOfViewBinding createRectangularFrustrumFieldOfViewBinding()
  {
		RectangularFrustrumFieldOfViewBindingImpl rectangularFrustrumFieldOfViewBinding = new RectangularFrustrumFieldOfViewBindingImpl();
		return rectangularFrustrumFieldOfViewBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTFOVBindingsPackage getMRTFOVBindingsPackage()
  {
		return (MRTFOVBindingsPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static MRTFOVBindingsPackage getPackage()
  {
		return MRTFOVBindingsPackage.eINSTANCE;
	}

} //MRTFOVBindingsFactoryImpl
