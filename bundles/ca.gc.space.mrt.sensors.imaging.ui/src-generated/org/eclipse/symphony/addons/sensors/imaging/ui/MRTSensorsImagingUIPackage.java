/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.symphony.common.topology.ui.TopologyUIPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='MRTSensorsImagingUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)' modelName='MRTSensorsImagingUI' modelDirectory='/org.eclipse.symphony.addons.sensors.imaging.ui/src-generated' editDirectory='/org.eclipse.symphony.addons.sensors.imaging.ui.edit/src-generated' basePackage='org.eclipse.symphony.addons.sensors.imaging'"
 * @generated
 */
public interface MRTSensorsImagingUIPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "ui";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.addons.sensors.imaging.ui";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "ui";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MRTSensorsImagingUIPackage eINSTANCE = org.eclipse.symphony.addons.sensors.imaging.ui.impl.MRTSensorsImagingUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl <em>Image Snapshot Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.impl.MRTSensorsImagingUIPackageImpl#getImageSnapshotPresentation()
	 * @generated
	 */
  int IMAGE_SNAPSHOT_PRESENTATION = 0;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SNAPSHOT_PRESENTATION__TOPOLOGY_PRESENTATION_SET = TopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__NODE = TopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__COLOR = TopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__VISIBLE = TopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SNAPSHOT_PRESENTATION__SHADOW_MODE = TopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__USE_IN_BOUNDING_CALCULATION = TopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__CENTROID = TopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__MIN = TopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__MAX = TopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__XRANGE = TopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__YRANGE = TopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__ZRANGE = TopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__SCENE_OBJECT = TopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Presentation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Image Projection Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Image Projection On FOV Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Image Snapshot Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION_FEATURE_COUNT = TopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 4;

  /**
	 * The number of operations of the '<em>Image Snapshot Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_SNAPSHOT_PRESENTATION_OPERATION_COUNT = TopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation <em>Image Snapshot Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Snapshot Presentation</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation
	 * @generated
	 */
  EClass getImageSnapshotPresentation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getPresentationMode <em>Presentation Mode</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Mode</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getPresentationMode()
	 * @see #getImageSnapshotPresentation()
	 * @generated
	 */
  EAttribute getImageSnapshotPresentation_PresentationMode();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getTransparency()
	 * @see #getImageSnapshotPresentation()
	 * @generated
	 */
  EAttribute getImageSnapshotPresentation_Transparency();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionVisible <em>Image Projection Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Projection Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionVisible()
	 * @see #getImageSnapshotPresentation()
	 * @generated
	 */
  EAttribute getImageSnapshotPresentation_ImageProjectionVisible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionOnFOVVisible <em>Image Projection On FOV Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Projection On FOV Visible</em>'.
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionOnFOVVisible()
	 * @see #getImageSnapshotPresentation()
	 * @generated
	 */
	EAttribute getImageSnapshotPresentation_ImageProjectionOnFOVVisible();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  MRTSensorsImagingUIFactory getMRTSensorsImagingUIFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl <em>Image Snapshot Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.sensors.imaging.ui.impl.ImageSnapshotPresentationImpl
		 * @see org.eclipse.symphony.addons.sensors.imaging.ui.impl.MRTSensorsImagingUIPackageImpl#getImageSnapshotPresentation()
		 * @generated
		 */
    EClass IMAGE_SNAPSHOT_PRESENTATION = eINSTANCE.getImageSnapshotPresentation();
    /**
		 * The meta object literal for the '<em><b>Presentation Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_SNAPSHOT_PRESENTATION__PRESENTATION_MODE = eINSTANCE.getImageSnapshotPresentation_PresentationMode();
    /**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_SNAPSHOT_PRESENTATION__TRANSPARENCY = eINSTANCE.getImageSnapshotPresentation_Transparency();
    /**
		 * The meta object literal for the '<em><b>Image Projection Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_VISIBLE = eINSTANCE.getImageSnapshotPresentation_ImageProjectionVisible();
				/**
		 * The meta object literal for the '<em><b>Image Projection On FOV Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_SNAPSHOT_PRESENTATION__IMAGE_PROJECTION_ON_FOV_VISIBLE = eINSTANCE.getImageSnapshotPresentation_ImageProjectionOnFOVVisible();

  }

} //MRTSensorsImagingUIPackage
