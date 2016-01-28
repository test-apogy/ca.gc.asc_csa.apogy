/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsSensorsImagingUIFactoryImpl extends EFactoryImpl implements ApogyAddonsSensorsImagingUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyAddonsSensorsImagingUIFactory init()
  {
		try {
			ApogyAddonsSensorsImagingUIFactory theApogyAddonsSensorsImagingUIFactory = (ApogyAddonsSensorsImagingUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsSensorsImagingUIPackage.eNS_URI);
			if (theApogyAddonsSensorsImagingUIFactory != null) {
				return theApogyAddonsSensorsImagingUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsSensorsImagingUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyAddonsSensorsImagingUIFactoryImpl()
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
			case ApogyAddonsSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION: return createImageSnapshotPresentation();
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
	public ApogyAddonsSensorsImagingUIPackage getApogyAddonsSensorsImagingUIPackage() {
		return (ApogyAddonsSensorsImagingUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyAddonsSensorsImagingUIPackage getPackage()
  {
		return ApogyAddonsSensorsImagingUIPackage.eINSTANCE;
	}

} //ApogyAddonsSensorsImagingUIFactoryImpl
