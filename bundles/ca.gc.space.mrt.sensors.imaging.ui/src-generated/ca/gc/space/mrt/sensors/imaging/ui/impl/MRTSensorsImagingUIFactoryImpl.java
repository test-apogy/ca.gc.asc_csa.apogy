/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.space.mrt.sensors.imaging.ui.ImageSnapshotPresentation;
import ca.gc.space.mrt.sensors.imaging.ui.MRTSensorsImagingUIFactory;
import ca.gc.space.mrt.sensors.imaging.ui.MRTSensorsImagingUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MRTSensorsImagingUIFactoryImpl extends EFactoryImpl implements MRTSensorsImagingUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static MRTSensorsImagingUIFactory init()
  {
		try {
			MRTSensorsImagingUIFactory theMRTSensorsImagingUIFactory = (MRTSensorsImagingUIFactory)EPackage.Registry.INSTANCE.getEFactory(MRTSensorsImagingUIPackage.eNS_URI);
			if (theMRTSensorsImagingUIFactory != null) {
				return theMRTSensorsImagingUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MRTSensorsImagingUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTSensorsImagingUIFactoryImpl()
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
			case MRTSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION: return createImageSnapshotPresentation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageSnapshotPresentation createImageSnapshotPresentation()
  {
		ImageSnapshotPresentationImpl imageSnapshotPresentation = new ImageSnapshotPresentationImpl();
		return imageSnapshotPresentation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTSensorsImagingUIPackage getMRTSensorsImagingUIPackage()
  {
		return (MRTSensorsImagingUIPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static MRTSensorsImagingUIPackage getPackage()
  {
		return MRTSensorsImagingUIPackage.eINSTANCE;
	}

} //MRTSensorsImagingUIFactoryImpl
