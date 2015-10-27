/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;

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
 * @see org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CoreEnvironmentUI' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CoreEnvironmentUI' complianceLevel='6.0' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.core.environment.ui/src-generated' editDirectory='/org.eclipse.symphony.core.environment.ui.edit/src-generated' basePackage='org.eclipse.symphony.core.environment'"
 * @generated
 */
public interface Symphony__CoreEnvironmentUIPackage extends EPackage
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
  String eNS_URI = "org.eclipse.symphony.core.environment.ui";

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
  Symphony__CoreEnvironmentUIPackage eINSTANCE = org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.StarFieldPresentationImpl <em>Star Field Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.StarFieldPresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getStarFieldPresentation()
	 * @generated
	 */
  int STAR_FIELD_PRESENTATION = 0;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FIELD_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Cut Off Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Star Field Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Star Field Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int STAR_FIELD_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.SunPresentationImpl <em>Sun Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.SunPresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getSunPresentation()
	 * @generated
	 */
  int SUN_PRESENTATION = 1;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUN_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The number of structural features of the '<em>Sun Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Sun Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUN_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.EarthSurfaceWorksitePresentationImpl <em>Earth Surface Worksite Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.EarthSurfaceWorksitePresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION = 2;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SURFACE_WORKSITE_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Axis Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Axis Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Azimuth Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Elevation Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Azimuth Lines Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Plane Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Plane Grid Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 6;

  /**
	 * The feature id for the '<em><b>Plane Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 7;

  /**
	 * The number of structural features of the '<em>Earth Surface Worksite Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 8;

  /**
	 * The number of operations of the '<em>Earth Surface Worksite Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SURFACE_WORKSITE_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.EarthSkyPresentationImpl <em>Earth Sky Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.EarthSkyPresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEarthSkyPresentation()
	 * @generated
	 */
  int EARTH_SKY_PRESENTATION = 3;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARTH_SKY_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The number of structural features of the '<em>Earth Sky Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Earth Sky Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EARTH_SKY_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.MoonPresentationImpl <em>Moon Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.MoonPresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMoonPresentation()
	 * @generated
	 */
  int MOON_PRESENTATION = 4;

  /**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

  /**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOON_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The number of structural features of the '<em>Moon Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The number of operations of the '<em>Moon Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MOON_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.FeatureOfInterestNodePresentationImpl <em>Feature Of Interest Node Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.FeatureOfInterestNodePresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getFeatureOfInterestNodePresentation()
	 * @generated
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION = 5;

		/**
	 * The feature id for the '<em><b>Topology Presentation Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET;

		/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__NODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__NODE;

		/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__COLOR = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__COLOR;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE;

		/**
	 * The feature id for the '<em><b>Shadow Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__SHADOW_MODE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE;

		/**
	 * The feature id for the '<em><b>Use In Bounding Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION;

		/**
	 * The feature id for the '<em><b>Centroid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__CENTROID = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__CENTROID;

		/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__MIN = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MIN;

		/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__MAX = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__MAX;

		/**
	 * The feature id for the '<em><b>XRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__XRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__XRANGE;

		/**
	 * The feature id for the '<em><b>YRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__YRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__YRANGE;

		/**
	 * The feature id for the '<em><b>ZRange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__ZRANGE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE;

		/**
	 * The feature id for the '<em><b>Scene Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__SCENE_OBJECT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT;

		/**
	 * The feature id for the '<em><b>Pole Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Flag Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Feature Of Interest Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION_FEATURE_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_FEATURE_COUNT + 2;

		/**
	 * The number of operations of the '<em>Feature Of Interest Node Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OF_INTEREST_NODE_PRESENTATION_OPERATION_COUNT = Symphony__CommonTopologyUIPackage.NODE_PRESENTATION_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiUtilitiesImpl <em>Environment Ui Utilities</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiUtilitiesImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEnvironmentUiUtilities()
	 * @generated
	 */
  int ENVIRONMENT_UI_UTILITIES = 6;

  /**
	 * The number of structural features of the '<em>Environment Ui Utilities</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_UTILITIES_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>To Point3f</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR = 0;

  /**
	 * The operation id for the '<em>Get Point Size For Magnitude</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT = 1;

  /**
	 * The operation id for the '<em>Get Sun Light Color</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE = 2;

  /**
	 * The operation id for the '<em>Get Sky Transparency</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE = 3;

  /**
	 * The operation id for the '<em>Get Sky Color</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE = 4;

  /**
	 * The number of operations of the '<em>Environment Ui Utilities</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_UTILITIES_OPERATION_COUNT = 5;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiFacadeImpl <em>Environment Ui Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiFacadeImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEnvironmentUiFacade()
	 * @generated
	 */
  int ENVIRONMENT_UI_FACADE = 7;

  /**
	 * The number of structural features of the '<em>Environment Ui Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get Visible Rectangular Region Provider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_FACADE___GET_VISIBLE_RECTANGULAR_REGION_PROVIDER__MAPVIEWCONFIGURATION = 0;

		/**
	 * The operation id for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__MAPVIEWCONFIGURATION_RECTANGULARREGION_INT = 1;

  /**
	 * The operation id for the '<em>Get Trajectory Length</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_FACADE___GET_TRAJECTORY_LENGTH__XYSERIES = 2;

  /**
	 * The operation id for the '<em>Get Map View Configuration Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_FACADE___GET_MAP_VIEW_CONFIGURATION_IDENTIFIER__MAPVIEWCONFIGURATION = 3;

		/**
	 * The operation id for the '<em>Get Active Map View Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION__STRING = 4;

		/**
	 * The operation id for the '<em>Get Active Map View Configuration List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION_LIST = 5;

		/**
	 * The operation id for the '<em>Get Feature Of Interest Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_UI_FACADE___GET_FEATURE_OF_INTEREST_LISTS__INVOCATORSESSION = 6;

		/**
	 * The number of operations of the '<em>Environment Ui Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ENVIRONMENT_UI_FACADE_OPERATION_COUNT = 7;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationListImpl <em>Map View Configuration List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationListImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapViewConfigurationList()
	 * @generated
	 */
  int MAP_VIEW_CONFIGURATION_LIST = 8;

  /**
	 * The feature id for the '<em><b>Tools List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION_LIST__TOOLS_LIST = Symphony__CoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST;

  /**
	 * The feature id for the '<em><b>Map View Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS = Symphony__CoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Map View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION_LIST_FEATURE_COUNT = Symphony__CoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Map View Configuration List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION_LIST_OPERATION_COUNT = Symphony__CoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationImpl <em>Map View Configuration</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapViewConfiguration()
	 * @generated
	 */
  int MAP_VIEW_CONFIGURATION = 9;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION__NAME = Symphony__CommonEMFPackage.NAMED__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION__DESCRIPTION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Map Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION__MAP_LAYERS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Map Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Default Rectangular Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 4;

		/**
	 * The feature id for the '<em><b>Map Image</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION__MAP_IMAGE = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 5;

  /**
	 * The feature id for the '<em><b>Map Image Rectangular Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 6;

		/**
	 * The feature id for the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION__EXTENT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 7;

		/**
	 * The number of structural features of the '<em>Map View Configuration</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION_FEATURE_COUNT = Symphony__CommonEMFPackage.NAMED_FEATURE_COUNT + 8;

  /**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_CONFIGURATION___FORCE_UPDATE = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Map View Configuration</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_CONFIGURATION_OPERATION_COUNT = Symphony__CommonEMFPackage.NAMED_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapViewItemPresentationImpl <em>Map View Item Presentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.MapViewItemPresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapViewItemPresentation()
	 * @generated
	 */
  int MAP_VIEW_ITEM_PRESENTATION = 10;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_ITEM_PRESENTATION__VISIBLE = 0;

  /**
	 * The number of structural features of the '<em>Map View Item Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_ITEM_PRESENTATION_FEATURE_COUNT = 1;

  /**
	 * The number of operations of the '<em>Map View Item Presentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_VIEW_ITEM_PRESENTATION_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.FeaturesOfInterestMapLayerPresentationImpl <em>Features Of Interest Map Layer Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.FeaturesOfInterestMapLayerPresentationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION = 14;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapAnnotationImpl <em>Map Annotation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.MapAnnotationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapAnnotation()
	 * @generated
	 */
  int MAP_ANNOTATION = 11;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_ANNOTATION__VISIBLE = MAP_VIEW_ITEM_PRESENTATION__VISIBLE;

  /**
	 * The number of structural features of the '<em>Map Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_ANNOTATION_FEATURE_COUNT = MAP_VIEW_ITEM_PRESENTATION_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION = MAP_VIEW_ITEM_PRESENTATION_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Map Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_ANNOTATION_OPERATION_COUNT = MAP_VIEW_ITEM_PRESENTATION_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapToolImpl <em>Map Tool</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.MapToolImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapTool()
	 * @generated
	 */
  int MAP_TOOL = 12;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL__VISIBLE = MAP_ANNOTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL__ACTIVE = MAP_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Map Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL_FEATURE_COUNT = MAP_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL___GET_XY_SHAPE_ANNOTATION = MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = MAP_ANNOTATION_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL___DISPOSE = MAP_ANNOTATION_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = MAP_ANNOTATION_OPERATION_COUNT + 2;

  /**
	 * The number of operations of the '<em>Map Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_TOOL_OPERATION_COUNT = MAP_ANNOTATION_OPERATION_COUNT + 3;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapRulerImpl <em>Map Ruler</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.MapRulerImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapRuler()
	 * @generated
	 */
  int MAP_RULER = 13;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER__VISIBLE = MAP_TOOL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER__ACTIVE = MAP_TOOL__ACTIVE;

  /**
	 * The feature id for the '<em><b>Ruler Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER__RULER_COLOR = MAP_TOOL_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Map Ruler</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER_FEATURE_COUNT = MAP_TOOL_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER___GET_XY_SHAPE_ANNOTATION = MAP_TOOL___GET_XY_SHAPE_ANNOTATION;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER___INITIALIZE__CHARTCOMPOSITE_JFREECHART = MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER___DISPOSE = MAP_TOOL___DISPOSE;

  /**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER___POSITION_SELECTED__INT_DOUBLE_DOUBLE = MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE;

  /**
	 * The number of operations of the '<em>Map Ruler</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MAP_RULER_OPERATION_COUNT = MAP_TOOL_OPERATION_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__VISIBLE = MAP_ANNOTATION__VISIBLE;

		/**
	 * The feature id for the '<em><b>Features Of Interest Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER = MAP_ANNOTATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Feature Of Interest Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS = MAP_ANNOTATION_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Feature Of Interest Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR = MAP_ANNOTATION_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Features Of Interest Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION_FEATURE_COUNT = MAP_ANNOTATION_FEATURE_COUNT + 3;

		/**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_XY_SHAPE_ANNOTATION = MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

		/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION___GET_REGION = MAP_ANNOTATION_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Features Of Interest Map Layer Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION_OPERATION_COUNT = MAP_ANNOTATION_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryProviderImpl <em>Variable Trajectory Provider</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryProviderImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getVariableTrajectoryProvider()
	 * @generated
	 */
  int VARIABLE_TRAJECTORY_PROVIDER = 18;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.TrajectoryProviderImpl <em>Trajectory Provider</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.TrajectoryProviderImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getTrajectoryProvider()
	 * @generated
	 */
  int TRAJECTORY_PROVIDER = 15;

  /**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER__LATEST_POSITION = 0;

  /**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = 1;

  /**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = 2;

  /**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = 3;

  /**
	 * The number of structural features of the '<em>Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER_FEATURE_COUNT = 4;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER___INITIALIZE = 0;

  /**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER___CLEAR = 1;

  /**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = 2;

  /**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER___GET_XY_SERIES = 3;

  /**
	 * The number of operations of the '<em>Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PROVIDER_OPERATION_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.AbstractTrajectoryToolImpl <em>Abstract Trajectory Tool</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.AbstractTrajectoryToolImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getAbstractTrajectoryTool()
	 * @generated
	 */
  int ABSTRACT_TRAJECTORY_TOOL = 16;

  /**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL__LATEST_POSITION = TRAJECTORY_PROVIDER__LATEST_POSITION;

  /**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL__AZIMUTH_ANGLE = TRAJECTORY_PROVIDER__AZIMUTH_ANGLE;

  /**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_LENGTH = TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH;

  /**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_COLOR = TRAJECTORY_PROVIDER__TRAJECTORY_COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL__VISIBLE = TRAJECTORY_PROVIDER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL__ACTIVE = TRAJECTORY_PROVIDER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Trajectory Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL_FEATURE_COUNT = TRAJECTORY_PROVIDER_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___INITIALIZE = TRAJECTORY_PROVIDER___INITIALIZE;

  /**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___CLEAR = TRAJECTORY_PROVIDER___CLEAR;

  /**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___AS_LIST_OF_POINT2D = TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D;

  /**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___GET_XY_SERIES = TRAJECTORY_PROVIDER___GET_XY_SERIES;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION = TRAJECTORY_PROVIDER_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = TRAJECTORY_PROVIDER_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___DISPOSE = TRAJECTORY_PROVIDER_OPERATION_COUNT + 2;

  /**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = TRAJECTORY_PROVIDER_OPERATION_COUNT + 3;

  /**
	 * The number of operations of the '<em>Abstract Trajectory Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_TRAJECTORY_TOOL_OPERATION_COUNT = TRAJECTORY_PROVIDER_OPERATION_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.TrajectoryPickingToolImpl <em>Trajectory Picking Tool</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.TrajectoryPickingToolImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getTrajectoryPickingTool()
	 * @generated
	 */
  int TRAJECTORY_PICKING_TOOL = 17;

  /**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL__LATEST_POSITION = ABSTRACT_TRAJECTORY_TOOL__LATEST_POSITION;

  /**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL__AZIMUTH_ANGLE = ABSTRACT_TRAJECTORY_TOOL__AZIMUTH_ANGLE;

  /**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL__TRAJECTORY_LENGTH = ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_LENGTH;

  /**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL__TRAJECTORY_COLOR = ABSTRACT_TRAJECTORY_TOOL__TRAJECTORY_COLOR;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL__VISIBLE = ABSTRACT_TRAJECTORY_TOOL__VISIBLE;

  /**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL__ACTIVE = ABSTRACT_TRAJECTORY_TOOL__ACTIVE;

  /**
	 * The number of structural features of the '<em>Trajectory Picking Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL_FEATURE_COUNT = ABSTRACT_TRAJECTORY_TOOL_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___INITIALIZE = ABSTRACT_TRAJECTORY_TOOL___INITIALIZE;

  /**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___CLEAR = ABSTRACT_TRAJECTORY_TOOL___CLEAR;

  /**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___AS_LIST_OF_POINT2D = ABSTRACT_TRAJECTORY_TOOL___AS_LIST_OF_POINT2D;

  /**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___GET_XY_SERIES = ABSTRACT_TRAJECTORY_TOOL___GET_XY_SERIES;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___GET_XY_SHAPE_ANNOTATION = ABSTRACT_TRAJECTORY_TOOL___GET_XY_SHAPE_ANNOTATION;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = ABSTRACT_TRAJECTORY_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART;

  /**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___DISPOSE = ABSTRACT_TRAJECTORY_TOOL___DISPOSE;

  /**
	 * The operation id for the '<em>Position Selected</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = ABSTRACT_TRAJECTORY_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE;

  /**
	 * The number of operations of the '<em>Trajectory Picking Tool</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TRAJECTORY_PICKING_TOOL_OPERATION_COUNT = ABSTRACT_TRAJECTORY_TOOL_OPERATION_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER__LATEST_POSITION = TRAJECTORY_PROVIDER__LATEST_POSITION;

  /**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = TRAJECTORY_PROVIDER__AZIMUTH_ANGLE;

  /**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH;

  /**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = TRAJECTORY_PROVIDER__TRAJECTORY_COLOR;

  /**
	 * The feature id for the '<em><b>Variable Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION = TRAJECTORY_PROVIDER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER = TRAJECTORY_PROVIDER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT = TRAJECTORY_PROVIDER_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER___INITIALIZE = TRAJECTORY_PROVIDER___INITIALIZE;

  /**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER___CLEAR = TRAJECTORY_PROVIDER___CLEAR;

  /**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D;

  /**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER___GET_XY_SERIES = TRAJECTORY_PROVIDER___GET_XY_SERIES;

  /**
	 * The number of operations of the '<em>Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_PROVIDER_OPERATION_COUNT = TRAJECTORY_PROVIDER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl <em>Default Variable Trajectory Provider</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getDefaultVariableTrajectoryProvider()
	 * @generated
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER = 19;

  /**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__LATEST_POSITION = VARIABLE_TRAJECTORY_PROVIDER__LATEST_POSITION;

  /**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_ANGLE;

  /**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH;

  /**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = VARIABLE_TRAJECTORY_PROVIDER__TRAJECTORY_COLOR;

  /**
	 * The feature id for the '<em><b>Variable Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION = VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION;

  /**
	 * The feature id for the '<em><b>Pose Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER = VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER;

  /**
	 * The feature id for the '<em><b>Distance Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD = VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Azimuth Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD = VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Default Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT = VARIABLE_TRAJECTORY_PROVIDER_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___INITIALIZE = VARIABLE_TRAJECTORY_PROVIDER___INITIALIZE;

  /**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___CLEAR = VARIABLE_TRAJECTORY_PROVIDER___CLEAR;

  /**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = VARIABLE_TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D;

  /**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER___GET_XY_SERIES = VARIABLE_TRAJECTORY_PROVIDER___GET_XY_SERIES;

  /**
	 * The number of operations of the '<em>Default Variable Trajectory Provider</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEFAULT_VARIABLE_TRAJECTORY_PROVIDER_OPERATION_COUNT = VARIABLE_TRAJECTORY_PROVIDER_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.AbstractVariableAnnotationImpl <em>Abstract Variable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.AbstractVariableAnnotationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getAbstractVariableAnnotation()
	 * @generated
	 */
  int ABSTRACT_VARIABLE_ANNOTATION = 20;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_VARIABLE_ANNOTATION__VISIBLE = MAP_ANNOTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_VARIABLE_ANNOTATION__VARIABLE = MAP_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = MAP_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Symphony System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER = MAP_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Abstract Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT = MAP_ANNOTATION_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION = MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

  /**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = MAP_ANNOTATION_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Abstract Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT = MAP_ANNOTATION_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.PoseVariableAnnotationImpl <em>Pose Variable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.PoseVariableAnnotationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getPoseVariableAnnotation()
	 * @generated
	 */
  int POSE_VARIABLE_ANNOTATION = 21;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION__VISIBLE = ABSTRACT_VARIABLE_ANNOTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION__VARIABLE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE;

  /**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

  /**
	 * The feature id for the '<em><b>Symphony System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER = ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER;

  /**
	 * The feature id for the '<em><b>Vectorlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION__VECTORLENGTH = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION__VECTOR_COLOR = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Show Pose</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION__SHOW_POSE = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Pose Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION_FEATURE_COUNT = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION = ABSTRACT_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

  /**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

		/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;

		/**
	 * The number of operations of the '<em>Pose Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int POSE_VARIABLE_ANNOTATION_OPERATION_COUNT = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryAnnotationImpl <em>Variable Trajectory Annotation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryAnnotationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getVariableTrajectoryAnnotation()
	 * @generated
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION = 22;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__VISIBLE = ABSTRACT_VARIABLE_ANNOTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__VARIABLE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE;

  /**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__VARIABLE_INSTANCE = ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

  /**
	 * The feature id for the '<em><b>Symphony System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER = ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER;

  /**
	 * The feature id for the '<em><b>Latest Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__LATEST_POSITION = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Azimuth Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__AZIMUTH_ANGLE = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Trajectory Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_LENGTH = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Trajectory Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_COLOR = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Trajectory Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 4;

  /**
	 * The number of structural features of the '<em>Variable Trajectory Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION_FEATURE_COUNT = ABSTRACT_VARIABLE_ANNOTATION_FEATURE_COUNT + 5;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION___GET_XY_SHAPE_ANNOTATION = ABSTRACT_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

  /**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TRAJECTORY_ANNOTATION___UPDATE_POSE__MATRIX4X4 = ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

		/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION___INITIALIZE = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Clear</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION___CLEAR = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>As List Of Point2d</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION___AS_LIST_OF_POINT2D = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 2;

  /**
	 * The operation id for the '<em>Get XY Series</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION___GET_XY_SERIES = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 3;

  /**
	 * The number of operations of the '<em>Variable Trajectory Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VARIABLE_TRAJECTORY_ANNOTATION_OPERATION_COUNT = ABSTRACT_VARIABLE_ANNOTATION_OPERATION_COUNT + 4;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.environment.ui.impl.VehicleVariableAnnotationImpl <em>Vehicle Variable Annotation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.ui.impl.VehicleVariableAnnotationImpl
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getVehicleVariableAnnotation()
	 * @generated
	 */
  int VEHICLE_VARIABLE_ANNOTATION = 23;

  /**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__VISIBLE = POSE_VARIABLE_ANNOTATION__VISIBLE;

  /**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__VARIABLE = POSE_VARIABLE_ANNOTATION__VARIABLE;

  /**
	 * The feature id for the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = POSE_VARIABLE_ANNOTATION__VARIABLE_INSTANCE;

  /**
	 * The feature id for the '<em><b>Symphony System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER = POSE_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER;

  /**
	 * The feature id for the '<em><b>Vectorlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__VECTORLENGTH = POSE_VARIABLE_ANNOTATION__VECTORLENGTH;

  /**
	 * The feature id for the '<em><b>Vector Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__VECTOR_COLOR = POSE_VARIABLE_ANNOTATION__VECTOR_COLOR;

  /**
	 * The feature id for the '<em><b>Show Pose</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__SHOW_POSE = POSE_VARIABLE_ANNOTATION__SHOW_POSE;

  /**
	 * The feature id for the '<em><b>Vehicle Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH = POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Vehicle Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH = POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Vehicle Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION_FEATURE_COUNT = POSE_VARIABLE_ANNOTATION_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Get XY Shape Annotation</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION = POSE_VARIABLE_ANNOTATION___GET_XY_SHAPE_ANNOTATION;

  /**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = POSE_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4;

		/**
	 * The operation id for the '<em>Update Pose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE;

		/**
	 * The number of operations of the '<em>Vehicle Variable Annotation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int VEHICLE_VARIABLE_ANNOTATION_OPERATION_COUNT = POSE_VARIABLE_ANNOTATION_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getList()
	 * @generated
	 */
  int LIST = 24;

  /**
	 * The meta object id for the '<em>Point2d</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Point2d
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getPoint2d()
	 * @generated
	 */
  int POINT2D = 25;

  /**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getColor3f()
	 * @generated
	 */
  int COLOR3F = 26;

  /**
	 * The meta object id for the '<em>Point3f</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3f
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getPoint3f()
	 * @generated
	 */
  int POINT3F = 27;


  /**
	 * The meta object id for the '<em>XY Series</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.jfree.data.xy.XYSeries
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getXYSeries()
	 * @generated
	 */
  int XY_SERIES = 28;

  /**
	 * The meta object id for the '<em>XY Plot</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.jfree.chart.plot.XYPlot
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getXYPlot()
	 * @generated
	 */
  int XY_PLOT = 29;


  /**
	 * The meta object id for the '<em>XY Data Item</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.jfree.data.xy.XYDataItem
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getXYDataItem()
	 * @generated
	 */
  int XY_DATA_ITEM = 30;


  /**
	 * The meta object id for the '<em>Abstract XY Annotation</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.jfree.chart.annotations.AbstractXYAnnotation
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getAbstractXYAnnotation()
	 * @generated
	 */
  int ABSTRACT_XY_ANNOTATION = 31;

  /**
	 * The meta object id for the '<em>Chart Composite</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.jfree.experimental.chart.swt.ChartComposite
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getChartComposite()
	 * @generated
	 */
  int CHART_COMPOSITE = 32;

  /**
	 * The meta object id for the '<em>JFree Chart</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.jfree.chart.JFreeChart
	 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getJFreeChart()
	 * @generated
	 */
  int JFREE_CHART = 33;

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.StarFieldPresentation <em>Star Field Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star Field Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.StarFieldPresentation
	 * @generated
	 */
  EClass getStarFieldPresentation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.StarFieldPresentation#getCutOffMagnitude <em>Cut Off Magnitude</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cut Off Magnitude</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.StarFieldPresentation#getCutOffMagnitude()
	 * @see #getStarFieldPresentation()
	 * @generated
	 */
  EAttribute getStarFieldPresentation_CutOffMagnitude();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.SunPresentation <em>Sun Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sun Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.SunPresentation
	 * @generated
	 */
  EClass getSunPresentation();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation <em>Earth Surface Worksite Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Surface Worksite Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation
	 * @generated
	 */
  EClass getEarthSurfaceWorksitePresentation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAxisVisible <em>Axis Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Visible</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAxisVisible()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_AxisVisible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getAxisLength <em>Axis Length</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis Length</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getAxisLength()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_AxisLength();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthVisible <em>Azimuth Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Visible</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthVisible()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_AzimuthVisible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isElevationLinesVisible <em>Elevation Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation Lines Visible</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isElevationLinesVisible()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_ElevationLinesVisible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthLinesVisible <em>Azimuth Lines Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Lines Visible</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isAzimuthLinesVisible()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_AzimuthLinesVisible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isPlaneVisible <em>Plane Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plane Visible</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#isPlaneVisible()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_PlaneVisible();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneGridSize <em>Plane Grid Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plane Grid Size</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneGridSize()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_PlaneGridSize();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneSize <em>Plane Size</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plane Size</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation#getPlaneSize()
	 * @see #getEarthSurfaceWorksitePresentation()
	 * @generated
	 */
  EAttribute getEarthSurfaceWorksitePresentation_PlaneSize();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.EarthSkyPresentation <em>Earth Sky Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earth Sky Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EarthSkyPresentation
	 * @generated
	 */
  EClass getEarthSkyPresentation();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.MoonPresentation <em>Moon Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moon Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MoonPresentation
	 * @generated
	 */
  EClass getMoonPresentation();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation <em>Feature Of Interest Node Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Of Interest Node Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation
	 * @generated
	 */
	EClass getFeatureOfInterestNodePresentation();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation#getPoleHeight <em>Pole Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pole Height</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation#getPoleHeight()
	 * @see #getFeatureOfInterestNodePresentation()
	 * @generated
	 */
	EAttribute getFeatureOfInterestNodePresentation_PoleHeight();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation#isFlagVisible <em>Flag Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Visible</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation#isFlagVisible()
	 * @see #getFeatureOfInterestNodePresentation()
	 * @generated
	 */
	EAttribute getFeatureOfInterestNodePresentation_FlagVisible();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities <em>Environment Ui Utilities</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Ui Utilities</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities
	 * @generated
	 */
  EClass getEnvironmentUiUtilities();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#toPoint3f(org.eclipse.symphony.core.environment.Star) <em>To Point3f</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Point3f</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#toPoint3f(org.eclipse.symphony.core.environment.Star)
	 * @generated
	 */
  EOperation getEnvironmentUiUtilities__ToPoint3f__Star();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getPointSizeForMagnitude(float, float, float, float, float) <em>Get Point Size For Magnitude</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Point Size For Magnitude</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getPointSizeForMagnitude(float, float, float, float, float)
	 * @generated
	 */
  EOperation getEnvironmentUiUtilities__GetPointSizeForMagnitude__float_float_float_float_float();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getSunLightColor(double) <em>Get Sun Light Color</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sun Light Color</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getSunLightColor(double)
	 * @generated
	 */
  EOperation getEnvironmentUiUtilities__GetSunLightColor__double();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getSkyTransparency(double) <em>Get Sky Transparency</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sky Transparency</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getSkyTransparency(double)
	 * @generated
	 */
  EOperation getEnvironmentUiUtilities__GetSkyTransparency__double();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getSkyColor(double) <em>Get Sky Color</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sky Color</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities#getSkyColor(double)
	 * @generated
	 */
  EOperation getEnvironmentUiUtilities__GetSkyColor__double();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade <em>Environment Ui Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Ui Facade</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade
	 * @generated
	 */
  EClass getEnvironmentUiFacade();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getVisibleRectangularRegionProvider(org.eclipse.symphony.core.environment.ui.MapViewConfiguration) <em>Get Visible Rectangular Region Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Visible Rectangular Region Provider</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getVisibleRectangularRegionProvider(org.eclipse.symphony.core.environment.ui.MapViewConfiguration)
	 * @generated
	 */
	EOperation getEnvironmentUiFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getImageMapLayerPresentationImage(org.eclipse.symphony.core.environment.ui.MapViewConfiguration, org.eclipse.symphony.core.environment.RectangularRegion, int) <em>Get Image Map Layer Presentation Image</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image Map Layer Presentation Image</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getImageMapLayerPresentationImage(org.eclipse.symphony.core.environment.ui.MapViewConfiguration, org.eclipse.symphony.core.environment.RectangularRegion, int)
	 * @generated
	 */
  EOperation getEnvironmentUiFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getTrajectoryLength(org.jfree.data.xy.XYSeries) <em>Get Trajectory Length</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Trajectory Length</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getTrajectoryLength(org.jfree.data.xy.XYSeries)
	 * @generated
	 */
  EOperation getEnvironmentUiFacade__GetTrajectoryLength__XYSeries();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getMapViewConfigurationIdentifier(org.eclipse.symphony.core.environment.ui.MapViewConfiguration) <em>Get Map View Configuration Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Map View Configuration Identifier</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getMapViewConfigurationIdentifier(org.eclipse.symphony.core.environment.ui.MapViewConfiguration)
	 * @generated
	 */
	EOperation getEnvironmentUiFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getActiveMapViewConfiguration(java.lang.String) <em>Get Active Map View Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Map View Configuration</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getActiveMapViewConfiguration(java.lang.String)
	 * @generated
	 */
	EOperation getEnvironmentUiFacade__GetActiveMapViewConfiguration__String();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getActiveMapViewConfigurationList() <em>Get Active Map View Configuration List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Map View Configuration List</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getActiveMapViewConfigurationList()
	 * @generated
	 */
	EOperation getEnvironmentUiFacade__GetActiveMapViewConfigurationList();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getFeatureOfInterestLists(org.eclipse.symphony.core.invocator.InvocatorSession) <em>Get Feature Of Interest Lists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Of Interest Lists</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade#getFeatureOfInterestLists(org.eclipse.symphony.core.invocator.InvocatorSession)
	 * @generated
	 */
	EOperation getEnvironmentUiFacade__GetFeatureOfInterestLists__InvocatorSession();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.MapViewConfigurationList <em>Map View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Configuration List</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfigurationList
	 * @generated
	 */
  EClass getMapViewConfigurationList();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.environment.ui.MapViewConfigurationList#getMapViewConfigurations <em>Map View Configurations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map View Configurations</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfigurationList#getMapViewConfigurations()
	 * @see #getMapViewConfigurationList()
	 * @generated
	 */
  EReference getMapViewConfigurationList_MapViewConfigurations();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration <em>Map View Configuration</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Configuration</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration
	 * @generated
	 */
  EClass getMapViewConfiguration();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapLayers <em>Map Layers</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Layers</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapLayers()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
  EReference getMapViewConfiguration_MapLayers();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getBackgroundColor()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
  EAttribute getMapViewConfiguration_BackgroundColor();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapAnnotations <em>Map Annotations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map Annotations</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapAnnotations()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
  EReference getMapViewConfiguration_MapAnnotations();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getDefaultRectangularRegion <em>Default Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Rectangular Region</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getDefaultRectangularRegion()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_DefaultRectangularRegion();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapImage <em>Map Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Image</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapImage()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
  EReference getMapViewConfiguration_MapImage();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapImageRectangularRegion <em>Map Image Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Map Image Rectangular Region</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getMapImageRectangularRegion()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_MapImageRectangularRegion();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extent</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#getExtent()
	 * @see #getMapViewConfiguration()
	 * @generated
	 */
	EReference getMapViewConfiguration_Extent();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.MapViewConfiguration#forceUpdate() <em>Force Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Force Update</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewConfiguration#forceUpdate()
	 * @generated
	 */
	EOperation getMapViewConfiguration__ForceUpdate();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.MapViewItemPresentation <em>Map View Item Presentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View Item Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewItemPresentation
	 * @generated
	 */
  EClass getMapViewItemPresentation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.MapViewItemPresentation#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapViewItemPresentation#isVisible()
	 * @see #getMapViewItemPresentation()
	 * @generated
	 */
  EAttribute getMapViewItemPresentation_Visible();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation <em>Features Of Interest Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Of Interest Map Layer Presentation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation
	 * @generated
	 */
	EClass getFeaturesOfInterestMapLayerPresentation();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation#getFeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Features Of Interest Map Layer</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation#getFeaturesOfInterestMapLayer()
	 * @see #getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	EReference getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestRadius <em>Feature Of Interest Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Of Interest Radius</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestRadius()
	 * @see #getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	EAttribute getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestColor <em>Feature Of Interest Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Of Interest Color</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation#getFeatureOfInterestColor()
	 * @see #getFeaturesOfInterestMapLayerPresentation()
	 * @generated
	 */
	EAttribute getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.MapAnnotation <em>Map Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Annotation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapAnnotation
	 * @generated
	 */
  EClass getMapAnnotation();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.MapAnnotation#getXYShapeAnnotation() <em>Get XY Shape Annotation</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XY Shape Annotation</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.MapAnnotation#getXYShapeAnnotation()
	 * @generated
	 */
  EOperation getMapAnnotation__GetXYShapeAnnotation();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.MapTool <em>Map Tool</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Tool</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapTool
	 * @generated
	 */
  EClass getMapTool();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.MapTool#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapTool#isActive()
	 * @see #getMapTool()
	 * @generated
	 */
  EAttribute getMapTool_Active();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.MapTool#initialize(org.jfree.experimental.chart.swt.ChartComposite, org.jfree.chart.JFreeChart) <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.MapTool#initialize(org.jfree.experimental.chart.swt.ChartComposite, org.jfree.chart.JFreeChart)
	 * @generated
	 */
  EOperation getMapTool__Initialize__ChartComposite_JFreeChart();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.MapTool#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.MapTool#dispose()
	 * @generated
	 */
  EOperation getMapTool__Dispose();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.MapTool#positionSelected(int, double, double) <em>Position Selected</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Position Selected</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.MapTool#positionSelected(int, double, double)
	 * @generated
	 */
  EOperation getMapTool__PositionSelected__int_double_double();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.MapRuler <em>Map Ruler</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Ruler</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapRuler
	 * @generated
	 */
  EClass getMapRuler();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.MapRuler#getRulerColor <em>Ruler Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruler Color</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.MapRuler#getRulerColor()
	 * @see #getMapRuler()
	 * @generated
	 */
  EAttribute getMapRuler_RulerColor();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider <em>Variable Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Trajectory Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider
	 * @generated
	 */
  EClass getVariableTrajectoryProvider();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getVariableAnnotation <em>Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Annotation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getVariableAnnotation()
	 * @see #getVariableTrajectoryProvider()
	 * @generated
	 */
  EReference getVariableTrajectoryProvider_VariableAnnotation();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getPoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pose Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider#getPoseProvider()
	 * @see #getVariableTrajectoryProvider()
	 * @generated
	 */
  EReference getVariableTrajectoryProvider_PoseProvider();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider <em>Default Variable Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Variable Trajectory Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider
	 * @generated
	 */
  EClass getDefaultVariableTrajectoryProvider();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold <em>Distance Threshold</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Threshold</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getDistanceThreshold()
	 * @see #getDefaultVariableTrajectoryProvider()
	 * @generated
	 */
  EAttribute getDefaultVariableTrajectoryProvider_DistanceThreshold();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold <em>Azimuth Threshold</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Threshold</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider#getAzimuthThreshold()
	 * @see #getDefaultVariableTrajectoryProvider()
	 * @generated
	 */
  EAttribute getDefaultVariableTrajectoryProvider_AzimuthThreshold();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation <em>Abstract Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Variable Annotation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation
	 * @generated
	 */
  EClass getAbstractVariableAnnotation();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariable()
	 * @see #getAbstractVariableAnnotation()
	 * @generated
	 */
  EReference getAbstractVariableAnnotation_Variable();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariableInstance <em>Variable Instance</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Instance</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getVariableInstance()
	 * @see #getAbstractVariableAnnotation()
	 * @generated
	 */
  EReference getAbstractVariableAnnotation_VariableInstance();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getSymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#getSymphonySystemApiAdapter()
	 * @see #getAbstractVariableAnnotation()
	 * @generated
	 */
  EReference getAbstractVariableAnnotation_SymphonySystemApiAdapter();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#updatePose(org.eclipse.symphony.common.math.Matrix4x4) <em>Update Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Pose</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation#updatePose(org.eclipse.symphony.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getAbstractVariableAnnotation__UpdatePose__Matrix4x4();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation <em>Pose Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose Variable Annotation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation
	 * @generated
	 */
  EClass getPoseVariableAnnotation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorlength <em>Vectorlength</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vectorlength</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorlength()
	 * @see #getPoseVariableAnnotation()
	 * @generated
	 */
  EAttribute getPoseVariableAnnotation_Vectorlength();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorColor <em>Vector Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector Color</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#getVectorColor()
	 * @see #getPoseVariableAnnotation()
	 * @generated
	 */
  EAttribute getPoseVariableAnnotation_VectorColor();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#isShowPose <em>Show Pose</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Pose</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#isShowPose()
	 * @see #getPoseVariableAnnotation()
	 * @generated
	 */
  EAttribute getPoseVariableAnnotation_ShowPose();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#updatePose(double, double, double) <em>Update Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Pose</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation#updatePose(double, double, double)
	 * @generated
	 */
	EOperation getPoseVariableAnnotation__UpdatePose__double_double_double();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation <em>Variable Trajectory Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Trajectory Annotation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation
	 * @generated
	 */
  EClass getVariableTrajectoryAnnotation();

  /**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation#getTrajectoryProvider <em>Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trajectory Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation#getTrajectoryProvider()
	 * @see #getVariableTrajectoryAnnotation()
	 * @generated
	 */
  EReference getVariableTrajectoryAnnotation_TrajectoryProvider();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation <em>Vehicle Variable Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Variable Annotation</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation
	 * @generated
	 */
  EClass getVehicleVariableAnnotation();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleLength <em>Vehicle Length</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Length</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleLength()
	 * @see #getVehicleVariableAnnotation()
	 * @generated
	 */
  EAttribute getVehicleVariableAnnotation_VehicleLength();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleWidth <em>Vehicle Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Width</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation#getVehicleWidth()
	 * @see #getVehicleVariableAnnotation()
	 * @generated
	 */
  EAttribute getVehicleVariableAnnotation_VehicleWidth();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider <em>Trajectory Provider</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory Provider</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider
	 * @generated
	 */
  EClass getTrajectoryProvider();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getLatestPosition <em>Latest Position</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Position</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getLatestPosition()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
  EAttribute getTrajectoryProvider_LatestPosition();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getAzimuthAngle <em>Azimuth Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azimuth Angle</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getAzimuthAngle()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
  EAttribute getTrajectoryProvider_AzimuthAngle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryLength <em>Trajectory Length</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trajectory Length</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryLength()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
  EAttribute getTrajectoryProvider_TrajectoryLength();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryColor <em>Trajectory Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trajectory Color</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getTrajectoryColor()
	 * @see #getTrajectoryProvider()
	 * @generated
	 */
  EAttribute getTrajectoryProvider_TrajectoryColor();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#initialize() <em>Initialize</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#initialize()
	 * @generated
	 */
  EOperation getTrajectoryProvider__Initialize();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#clear() <em>Clear</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#clear()
	 * @generated
	 */
  EOperation getTrajectoryProvider__Clear();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#asListOfPoint2d() <em>As List Of Point2d</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As List Of Point2d</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#asListOfPoint2d()
	 * @generated
	 */
  EOperation getTrajectoryProvider__AsListOfPoint2d();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getXYSeries() <em>Get XY Series</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XY Series</em>' operation.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryProvider#getXYSeries()
	 * @generated
	 */
  EOperation getTrajectoryProvider__GetXYSeries();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.AbstractTrajectoryTool <em>Abstract Trajectory Tool</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Trajectory Tool</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.AbstractTrajectoryTool
	 * @generated
	 */
  EClass getAbstractTrajectoryTool();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.environment.ui.TrajectoryPickingTool <em>Trajectory Picking Tool</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory Picking Tool</em>'.
	 * @see org.eclipse.symphony.core.environment.ui.TrajectoryPickingTool
	 * @generated
	 */
  EClass getTrajectoryPickingTool();

  /**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
  EDataType getList();

  /**
	 * Returns the meta object for data type '{@link javax.vecmath.Point2d <em>Point2d</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point2d</em>'.
	 * @see javax.vecmath.Point2d
	 * @model instanceClass="javax.vecmath.Point2d"
	 * @generated
	 */
  EDataType getPoint2d();

  /**
	 * Returns the meta object for data type '{@link javax.vecmath.Color3f <em>Color3f</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color3f</em>'.
	 * @see javax.vecmath.Color3f
	 * @model instanceClass="javax.vecmath.Color3f"
	 * @generated
	 */
  EDataType getColor3f();

  /**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3f <em>Point3f</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3f</em>'.
	 * @see javax.vecmath.Point3f
	 * @model instanceClass="javax.vecmath.Point3f"
	 * @generated
	 */
  EDataType getPoint3f();

  /**
	 * Returns the meta object for data type '{@link org.jfree.data.xy.XYSeries <em>XY Series</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Series</em>'.
	 * @see org.jfree.data.xy.XYSeries
	 * @model instanceClass="org.jfree.data.xy.XYSeries"
	 * @generated
	 */
  EDataType getXYSeries();

  /**
	 * Returns the meta object for data type '{@link org.jfree.chart.plot.XYPlot <em>XY Plot</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Plot</em>'.
	 * @see org.jfree.chart.plot.XYPlot
	 * @model instanceClass="org.jfree.chart.plot.XYPlot"
	 * @generated
	 */
  EDataType getXYPlot();

  /**
	 * Returns the meta object for data type '{@link org.jfree.data.xy.XYDataItem <em>XY Data Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XY Data Item</em>'.
	 * @see org.jfree.data.xy.XYDataItem
	 * @model instanceClass="org.jfree.data.xy.XYDataItem"
	 * @generated
	 */
  EDataType getXYDataItem();

  /**
	 * Returns the meta object for data type '{@link org.jfree.chart.annotations.AbstractXYAnnotation <em>Abstract XY Annotation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Abstract XY Annotation</em>'.
	 * @see org.jfree.chart.annotations.AbstractXYAnnotation
	 * @model instanceClass="org.jfree.chart.annotations.AbstractXYAnnotation"
	 * @generated
	 */
  EDataType getAbstractXYAnnotation();

  /**
	 * Returns the meta object for data type '{@link org.jfree.experimental.chart.swt.ChartComposite <em>Chart Composite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Chart Composite</em>'.
	 * @see org.jfree.experimental.chart.swt.ChartComposite
	 * @model instanceClass="org.jfree.experimental.chart.swt.ChartComposite"
	 * @generated
	 */
  EDataType getChartComposite();

  /**
	 * Returns the meta object for data type '{@link org.jfree.chart.JFreeChart <em>JFree Chart</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JFree Chart</em>'.
	 * @see org.jfree.chart.JFreeChart
	 * @model instanceClass="org.jfree.chart.JFreeChart"
	 * @generated
	 */
  EDataType getJFreeChart();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CoreEnvironmentUIFactory getSymphony__CoreEnvironmentUIFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.StarFieldPresentationImpl <em>Star Field Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.StarFieldPresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getStarFieldPresentation()
		 * @generated
		 */
    EClass STAR_FIELD_PRESENTATION = eINSTANCE.getStarFieldPresentation();

    /**
		 * The meta object literal for the '<em><b>Cut Off Magnitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE = eINSTANCE.getStarFieldPresentation_CutOffMagnitude();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.SunPresentationImpl <em>Sun Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.SunPresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getSunPresentation()
		 * @generated
		 */
    EClass SUN_PRESENTATION = eINSTANCE.getSunPresentation();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.EarthSurfaceWorksitePresentationImpl <em>Earth Surface Worksite Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.EarthSurfaceWorksitePresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEarthSurfaceWorksitePresentation()
		 * @generated
		 */
    EClass EARTH_SURFACE_WORKSITE_PRESENTATION = eINSTANCE.getEarthSurfaceWorksitePresentation();

    /**
		 * The meta object literal for the '<em><b>Axis Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE = eINSTANCE.getEarthSurfaceWorksitePresentation_AxisVisible();

    /**
		 * The meta object literal for the '<em><b>Axis Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH = eINSTANCE.getEarthSurfaceWorksitePresentation_AxisLength();

    /**
		 * The meta object literal for the '<em><b>Azimuth Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE = eINSTANCE.getEarthSurfaceWorksitePresentation_AzimuthVisible();

    /**
		 * The meta object literal for the '<em><b>Elevation Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE = eINSTANCE.getEarthSurfaceWorksitePresentation_ElevationLinesVisible();

    /**
		 * The meta object literal for the '<em><b>Azimuth Lines Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE = eINSTANCE.getEarthSurfaceWorksitePresentation_AzimuthLinesVisible();

    /**
		 * The meta object literal for the '<em><b>Plane Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE = eINSTANCE.getEarthSurfaceWorksitePresentation_PlaneVisible();

    /**
		 * The meta object literal for the '<em><b>Plane Grid Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE = eINSTANCE.getEarthSurfaceWorksitePresentation_PlaneGridSize();

    /**
		 * The meta object literal for the '<em><b>Plane Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE = eINSTANCE.getEarthSurfaceWorksitePresentation_PlaneSize();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.EarthSkyPresentationImpl <em>Earth Sky Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.EarthSkyPresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEarthSkyPresentation()
		 * @generated
		 */
    EClass EARTH_SKY_PRESENTATION = eINSTANCE.getEarthSkyPresentation();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.MoonPresentationImpl <em>Moon Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.MoonPresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMoonPresentation()
		 * @generated
		 */
    EClass MOON_PRESENTATION = eINSTANCE.getMoonPresentation();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.FeatureOfInterestNodePresentationImpl <em>Feature Of Interest Node Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.FeatureOfInterestNodePresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getFeatureOfInterestNodePresentation()
		 * @generated
		 */
		EClass FEATURE_OF_INTEREST_NODE_PRESENTATION = eINSTANCE.getFeatureOfInterestNodePresentation();

				/**
		 * The meta object literal for the '<em><b>Pole Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT = eINSTANCE.getFeatureOfInterestNodePresentation_PoleHeight();

				/**
		 * The meta object literal for the '<em><b>Flag Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE = eINSTANCE.getFeatureOfInterestNodePresentation_FlagVisible();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiUtilitiesImpl <em>Environment Ui Utilities</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiUtilitiesImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEnvironmentUiUtilities()
		 * @generated
		 */
    EClass ENVIRONMENT_UI_UTILITIES = eINSTANCE.getEnvironmentUiUtilities();

    /**
		 * The meta object literal for the '<em><b>To Point3f</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR = eINSTANCE.getEnvironmentUiUtilities__ToPoint3f__Star();

    /**
		 * The meta object literal for the '<em><b>Get Point Size For Magnitude</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT = eINSTANCE.getEnvironmentUiUtilities__GetPointSizeForMagnitude__float_float_float_float_float();

    /**
		 * The meta object literal for the '<em><b>Get Sun Light Color</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE = eINSTANCE.getEnvironmentUiUtilities__GetSunLightColor__double();

    /**
		 * The meta object literal for the '<em><b>Get Sky Transparency</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE = eINSTANCE.getEnvironmentUiUtilities__GetSkyTransparency__double();

    /**
		 * The meta object literal for the '<em><b>Get Sky Color</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE = eINSTANCE.getEnvironmentUiUtilities__GetSkyColor__double();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiFacadeImpl <em>Environment Ui Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.EnvironmentUiFacadeImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getEnvironmentUiFacade()
		 * @generated
		 */
    EClass ENVIRONMENT_UI_FACADE = eINSTANCE.getEnvironmentUiFacade();

    /**
		 * The meta object literal for the '<em><b>Get Visible Rectangular Region Provider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_FACADE___GET_VISIBLE_RECTANGULAR_REGION_PROVIDER__MAPVIEWCONFIGURATION = eINSTANCE.getEnvironmentUiFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration();

				/**
		 * The meta object literal for the '<em><b>Get Image Map Layer Presentation Image</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UI_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__MAPVIEWCONFIGURATION_RECTANGULARREGION_INT = eINSTANCE.getEnvironmentUiFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int();

    /**
		 * The meta object literal for the '<em><b>Get Trajectory Length</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ENVIRONMENT_UI_FACADE___GET_TRAJECTORY_LENGTH__XYSERIES = eINSTANCE.getEnvironmentUiFacade__GetTrajectoryLength__XYSeries();

    /**
		 * The meta object literal for the '<em><b>Get Map View Configuration Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_FACADE___GET_MAP_VIEW_CONFIGURATION_IDENTIFIER__MAPVIEWCONFIGURATION = eINSTANCE.getEnvironmentUiFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration();

				/**
		 * The meta object literal for the '<em><b>Get Active Map View Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION__STRING = eINSTANCE.getEnvironmentUiFacade__GetActiveMapViewConfiguration__String();

				/**
		 * The meta object literal for the '<em><b>Get Active Map View Configuration List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION_LIST = eINSTANCE.getEnvironmentUiFacade__GetActiveMapViewConfigurationList();

				/**
		 * The meta object literal for the '<em><b>Get Feature Of Interest Lists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENVIRONMENT_UI_FACADE___GET_FEATURE_OF_INTEREST_LISTS__INVOCATORSESSION = eINSTANCE.getEnvironmentUiFacade__GetFeatureOfInterestLists__InvocatorSession();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationListImpl <em>Map View Configuration List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationListImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapViewConfigurationList()
		 * @generated
		 */
    EClass MAP_VIEW_CONFIGURATION_LIST = eINSTANCE.getMapViewConfigurationList();

    /**
		 * The meta object literal for the '<em><b>Map View Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS = eINSTANCE.getMapViewConfigurationList_MapViewConfigurations();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationImpl <em>Map View Configuration</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.MapViewConfigurationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapViewConfiguration()
		 * @generated
		 */
    EClass MAP_VIEW_CONFIGURATION = eINSTANCE.getMapViewConfiguration();

    /**
		 * The meta object literal for the '<em><b>Map Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP_VIEW_CONFIGURATION__MAP_LAYERS = eINSTANCE.getMapViewConfiguration_MapLayers();

    /**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR = eINSTANCE.getMapViewConfiguration_BackgroundColor();

    /**
		 * The meta object literal for the '<em><b>Map Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS = eINSTANCE.getMapViewConfiguration_MapAnnotations();

    /**
		 * The meta object literal for the '<em><b>Default Rectangular Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION = eINSTANCE.getMapViewConfiguration_DefaultRectangularRegion();

				/**
		 * The meta object literal for the '<em><b>Map Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MAP_VIEW_CONFIGURATION__MAP_IMAGE = eINSTANCE.getMapViewConfiguration_MapImage();

    /**
		 * The meta object literal for the '<em><b>Map Image Rectangular Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION = eINSTANCE.getMapViewConfiguration_MapImageRectangularRegion();

				/**
		 * The meta object literal for the '<em><b>Extent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW_CONFIGURATION__EXTENT = eINSTANCE.getMapViewConfiguration_Extent();

				/**
		 * The meta object literal for the '<em><b>Force Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_VIEW_CONFIGURATION___FORCE_UPDATE = eINSTANCE.getMapViewConfiguration__ForceUpdate();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapViewItemPresentationImpl <em>Map View Item Presentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.MapViewItemPresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapViewItemPresentation()
		 * @generated
		 */
    EClass MAP_VIEW_ITEM_PRESENTATION = eINSTANCE.getMapViewItemPresentation();

    /**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MAP_VIEW_ITEM_PRESENTATION__VISIBLE = eINSTANCE.getMapViewItemPresentation_Visible();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.FeaturesOfInterestMapLayerPresentationImpl <em>Features Of Interest Map Layer Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.FeaturesOfInterestMapLayerPresentationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getFeaturesOfInterestMapLayerPresentation()
		 * @generated
		 */
		EClass FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION = eINSTANCE.getFeaturesOfInterestMapLayerPresentation();

				/**
		 * The meta object literal for the '<em><b>Features Of Interest Map Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER = eINSTANCE.getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer();

				/**
		 * The meta object literal for the '<em><b>Feature Of Interest Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS = eINSTANCE.getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius();

				/**
		 * The meta object literal for the '<em><b>Feature Of Interest Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR = eINSTANCE.getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapAnnotationImpl <em>Map Annotation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.MapAnnotationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapAnnotation()
		 * @generated
		 */
    EClass MAP_ANNOTATION = eINSTANCE.getMapAnnotation();

    /**
		 * The meta object literal for the '<em><b>Get XY Shape Annotation</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION = eINSTANCE.getMapAnnotation__GetXYShapeAnnotation();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapToolImpl <em>Map Tool</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.MapToolImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapTool()
		 * @generated
		 */
    EClass MAP_TOOL = eINSTANCE.getMapTool();

    /**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MAP_TOOL__ACTIVE = eINSTANCE.getMapTool_Active();

    /**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART = eINSTANCE.getMapTool__Initialize__ChartComposite_JFreeChart();

    /**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation MAP_TOOL___DISPOSE = eINSTANCE.getMapTool__Dispose();

    /**
		 * The meta object literal for the '<em><b>Position Selected</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE = eINSTANCE.getMapTool__PositionSelected__int_double_double();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.MapRulerImpl <em>Map Ruler</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.MapRulerImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getMapRuler()
		 * @generated
		 */
    EClass MAP_RULER = eINSTANCE.getMapRuler();

    /**
		 * The meta object literal for the '<em><b>Ruler Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MAP_RULER__RULER_COLOR = eINSTANCE.getMapRuler_RulerColor();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryProviderImpl <em>Variable Trajectory Provider</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryProviderImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getVariableTrajectoryProvider()
		 * @generated
		 */
    EClass VARIABLE_TRAJECTORY_PROVIDER = eINSTANCE.getVariableTrajectoryProvider();

    /**
		 * The meta object literal for the '<em><b>Variable Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION = eINSTANCE.getVariableTrajectoryProvider_VariableAnnotation();

    /**
		 * The meta object literal for the '<em><b>Pose Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER = eINSTANCE.getVariableTrajectoryProvider_PoseProvider();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl <em>Default Variable Trajectory Provider</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.DefaultVariableTrajectoryProviderImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getDefaultVariableTrajectoryProvider()
		 * @generated
		 */
    EClass DEFAULT_VARIABLE_TRAJECTORY_PROVIDER = eINSTANCE.getDefaultVariableTrajectoryProvider();

    /**
		 * The meta object literal for the '<em><b>Distance Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD = eINSTANCE.getDefaultVariableTrajectoryProvider_DistanceThreshold();

    /**
		 * The meta object literal for the '<em><b>Azimuth Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD = eINSTANCE.getDefaultVariableTrajectoryProvider_AzimuthThreshold();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.AbstractVariableAnnotationImpl <em>Abstract Variable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.AbstractVariableAnnotationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getAbstractVariableAnnotation()
		 * @generated
		 */
    EClass ABSTRACT_VARIABLE_ANNOTATION = eINSTANCE.getAbstractVariableAnnotation();

    /**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_VARIABLE_ANNOTATION__VARIABLE = eINSTANCE.getAbstractVariableAnnotation_Variable();

    /**
		 * The meta object literal for the '<em><b>Variable Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE = eINSTANCE.getAbstractVariableAnnotation_VariableInstance();

    /**
		 * The meta object literal for the '<em><b>Symphony System Api Adapter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getAbstractVariableAnnotation_SymphonySystemApiAdapter();

    /**
		 * The meta object literal for the '<em><b>Update Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4 = eINSTANCE.getAbstractVariableAnnotation__UpdatePose__Matrix4x4();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.PoseVariableAnnotationImpl <em>Pose Variable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.PoseVariableAnnotationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getPoseVariableAnnotation()
		 * @generated
		 */
    EClass POSE_VARIABLE_ANNOTATION = eINSTANCE.getPoseVariableAnnotation();

    /**
		 * The meta object literal for the '<em><b>Vectorlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSE_VARIABLE_ANNOTATION__VECTORLENGTH = eINSTANCE.getPoseVariableAnnotation_Vectorlength();

    /**
		 * The meta object literal for the '<em><b>Vector Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSE_VARIABLE_ANNOTATION__VECTOR_COLOR = eINSTANCE.getPoseVariableAnnotation_VectorColor();

    /**
		 * The meta object literal for the '<em><b>Show Pose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute POSE_VARIABLE_ANNOTATION__SHOW_POSE = eINSTANCE.getPoseVariableAnnotation_ShowPose();

    /**
		 * The meta object literal for the '<em><b>Update Pose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getPoseVariableAnnotation__UpdatePose__double_double_double();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryAnnotationImpl <em>Variable Trajectory Annotation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.VariableTrajectoryAnnotationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getVariableTrajectoryAnnotation()
		 * @generated
		 */
    EClass VARIABLE_TRAJECTORY_ANNOTATION = eINSTANCE.getVariableTrajectoryAnnotation();

    /**
		 * The meta object literal for the '<em><b>Trajectory Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER = eINSTANCE.getVariableTrajectoryAnnotation_TrajectoryProvider();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.VehicleVariableAnnotationImpl <em>Vehicle Variable Annotation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.VehicleVariableAnnotationImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getVehicleVariableAnnotation()
		 * @generated
		 */
    EClass VEHICLE_VARIABLE_ANNOTATION = eINSTANCE.getVehicleVariableAnnotation();

    /**
		 * The meta object literal for the '<em><b>Vehicle Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH = eINSTANCE.getVehicleVariableAnnotation_VehicleLength();

    /**
		 * The meta object literal for the '<em><b>Vehicle Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH = eINSTANCE.getVehicleVariableAnnotation_VehicleWidth();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.TrajectoryProviderImpl <em>Trajectory Provider</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.TrajectoryProviderImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getTrajectoryProvider()
		 * @generated
		 */
    EClass TRAJECTORY_PROVIDER = eINSTANCE.getTrajectoryProvider();

    /**
		 * The meta object literal for the '<em><b>Latest Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TRAJECTORY_PROVIDER__LATEST_POSITION = eINSTANCE.getTrajectoryProvider_LatestPosition();

    /**
		 * The meta object literal for the '<em><b>Azimuth Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TRAJECTORY_PROVIDER__AZIMUTH_ANGLE = eINSTANCE.getTrajectoryProvider_AzimuthAngle();

    /**
		 * The meta object literal for the '<em><b>Trajectory Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH = eINSTANCE.getTrajectoryProvider_TrajectoryLength();

    /**
		 * The meta object literal for the '<em><b>Trajectory Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TRAJECTORY_PROVIDER__TRAJECTORY_COLOR = eINSTANCE.getTrajectoryProvider_TrajectoryColor();

    /**
		 * The meta object literal for the '<em><b>Initialize</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation TRAJECTORY_PROVIDER___INITIALIZE = eINSTANCE.getTrajectoryProvider__Initialize();

    /**
		 * The meta object literal for the '<em><b>Clear</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation TRAJECTORY_PROVIDER___CLEAR = eINSTANCE.getTrajectoryProvider__Clear();

    /**
		 * The meta object literal for the '<em><b>As List Of Point2d</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D = eINSTANCE.getTrajectoryProvider__AsListOfPoint2d();

    /**
		 * The meta object literal for the '<em><b>Get XY Series</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation TRAJECTORY_PROVIDER___GET_XY_SERIES = eINSTANCE.getTrajectoryProvider__GetXYSeries();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.AbstractTrajectoryToolImpl <em>Abstract Trajectory Tool</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.AbstractTrajectoryToolImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getAbstractTrajectoryTool()
		 * @generated
		 */
    EClass ABSTRACT_TRAJECTORY_TOOL = eINSTANCE.getAbstractTrajectoryTool();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.environment.ui.impl.TrajectoryPickingToolImpl <em>Trajectory Picking Tool</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.environment.ui.impl.TrajectoryPickingToolImpl
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getTrajectoryPickingTool()
		 * @generated
		 */
    EClass TRAJECTORY_PICKING_TOOL = eINSTANCE.getTrajectoryPickingTool();

    /**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getList()
		 * @generated
		 */
    EDataType LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em>Point2d</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Point2d
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getPoint2d()
		 * @generated
		 */
    EDataType POINT2D = eINSTANCE.getPoint2d();

    /**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getColor3f()
		 * @generated
		 */
    EDataType COLOR3F = eINSTANCE.getColor3f();

    /**
		 * The meta object literal for the '<em>Point3f</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3f
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getPoint3f()
		 * @generated
		 */
    EDataType POINT3F = eINSTANCE.getPoint3f();

    /**
		 * The meta object literal for the '<em>XY Series</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.jfree.data.xy.XYSeries
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getXYSeries()
		 * @generated
		 */
    EDataType XY_SERIES = eINSTANCE.getXYSeries();

    /**
		 * The meta object literal for the '<em>XY Plot</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.jfree.chart.plot.XYPlot
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getXYPlot()
		 * @generated
		 */
    EDataType XY_PLOT = eINSTANCE.getXYPlot();

    /**
		 * The meta object literal for the '<em>XY Data Item</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.jfree.data.xy.XYDataItem
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getXYDataItem()
		 * @generated
		 */
    EDataType XY_DATA_ITEM = eINSTANCE.getXYDataItem();

    /**
		 * The meta object literal for the '<em>Abstract XY Annotation</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.jfree.chart.annotations.AbstractXYAnnotation
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getAbstractXYAnnotation()
		 * @generated
		 */
    EDataType ABSTRACT_XY_ANNOTATION = eINSTANCE.getAbstractXYAnnotation();

    /**
		 * The meta object literal for the '<em>Chart Composite</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.jfree.experimental.chart.swt.ChartComposite
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getChartComposite()
		 * @generated
		 */
    EDataType CHART_COMPOSITE = eINSTANCE.getChartComposite();

    /**
		 * The meta object literal for the '<em>JFree Chart</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.jfree.chart.JFreeChart
		 * @see org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIPackageImpl#getJFreeChart()
		 * @generated
		 */
    EDataType JFREE_CHART = eINSTANCE.getJFreeChart();

  }

} //Symphony__CoreEnvironmentUIPackage
