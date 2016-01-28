/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation;
import org.eclipse.symphony.addons.sensors.imaging.ui.Symphony__AddonsSensorsImagingUIFactory;
import org.eclipse.symphony.addons.sensors.imaging.ui.Symphony__AddonsSensorsImagingUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsSensorsImagingUIFactoryImpl extends EFactoryImpl implements Symphony__AddonsSensorsImagingUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__AddonsSensorsImagingUIFactory init()
  {
		try {
			Symphony__AddonsSensorsImagingUIFactory theSymphony__AddonsSensorsImagingUIFactory = (Symphony__AddonsSensorsImagingUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsSensorsImagingUIPackage.eNS_URI);
			if (theSymphony__AddonsSensorsImagingUIFactory != null) {
				return theSymphony__AddonsSensorsImagingUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsSensorsImagingUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__AddonsSensorsImagingUIFactoryImpl()
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
			case Symphony__AddonsSensorsImagingUIPackage.IMAGE_SNAPSHOT_PRESENTATION: return createImageSnapshotPresentation();
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
	public Symphony__AddonsSensorsImagingUIPackage getSymphony__AddonsSensorsImagingUIPackage() {
		return (Symphony__AddonsSensorsImagingUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__AddonsSensorsImagingUIPackage getPackage()
  {
		return Symphony__AddonsSensorsImagingUIPackage.eINSTANCE;
	}

} //Symphony__AddonsSensorsImagingUIFactoryImpl
