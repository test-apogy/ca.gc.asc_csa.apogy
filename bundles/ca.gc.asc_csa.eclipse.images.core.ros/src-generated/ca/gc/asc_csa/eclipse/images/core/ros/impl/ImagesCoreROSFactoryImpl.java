/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.images.core.ros.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.ros.node.ConnectedNode;
import sensor_msgs.CompressedImage;
import sensor_msgs.Image;
import ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFacade;
import ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSFactory;
import ca.gc.asc_csa.eclipse.images.core.ros.ImagesCoreROSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagesCoreROSFactoryImpl extends EFactoryImpl implements ImagesCoreROSFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ImagesCoreROSFactory init()
  {
		try {
			ImagesCoreROSFactory theImagesCoreROSFactory = (ImagesCoreROSFactory)EPackage.Registry.INSTANCE.getEFactory(ImagesCoreROSPackage.eNS_URI);
			if (theImagesCoreROSFactory != null) {
				return theImagesCoreROSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImagesCoreROSFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImagesCoreROSFactoryImpl()
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
			case ImagesCoreROSPackage.IMAGES_CORE_ROS_FACADE: return createImagesCoreROSFacade();
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
			case ImagesCoreROSPackage.IMAGE:
				return createImageFromString(eDataType, initialValue);
			case ImagesCoreROSPackage.COMPRESSED_IMAGE:
				return createCompressedImageFromString(eDataType, initialValue);
			case ImagesCoreROSPackage.CONNECTED_NODE:
				return createConnectedNodeFromString(eDataType, initialValue);
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
			case ImagesCoreROSPackage.IMAGE:
				return convertImageToString(eDataType, instanceValue);
			case ImagesCoreROSPackage.COMPRESSED_IMAGE:
				return convertCompressedImageToString(eDataType, instanceValue);
			case ImagesCoreROSPackage.CONNECTED_NODE:
				return convertConnectedNodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImagesCoreROSFacade createImagesCoreROSFacade()
  {
		ImagesCoreROSFacadeImpl imagesCoreROSFacade = new ImagesCoreROSFacadeImpl();
		return imagesCoreROSFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Image createImageFromString(EDataType eDataType, String initialValue)
  {
		return (Image)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertImageToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CompressedImage createCompressedImageFromString(EDataType eDataType, String initialValue)
  {
		return (CompressedImage)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertCompressedImageToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConnectedNode createConnectedNodeFromString(EDataType eDataType, String initialValue)
  {
		return (ConnectedNode)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertConnectedNodeToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImagesCoreROSPackage getImagesCoreROSPackage()
  {
		return (ImagesCoreROSPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ImagesCoreROSPackage getPackage()
  {
		return ImagesCoreROSPackage.eINSTANCE;
	}

} //ImagesCoreROSFactoryImpl
