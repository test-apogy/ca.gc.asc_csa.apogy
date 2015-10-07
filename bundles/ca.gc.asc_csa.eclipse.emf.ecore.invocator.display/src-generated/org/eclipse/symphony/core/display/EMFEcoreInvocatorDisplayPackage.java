/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;

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
 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreInvocatorDisplay' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)' modelName='EMFEcoreInvocatorDisplay' modelDirectory='/org.eclipse.symphony.core.display/src-generated' editDirectory='/org.eclipse.symphony.core.display.edit/src-generated' basePackage='org.eclipse.symphony.core'"
 * @generated
 */
public interface EMFEcoreInvocatorDisplayPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "display";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.core.display";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "display";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreInvocatorDisplayPackage eINSTANCE = org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.AbstractFeatureDisplayImpl <em>Abstract Feature Display</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.AbstractFeatureDisplayImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getAbstractFeatureDisplay()
	 * @generated
	 */
  int ABSTRACT_FEATURE_DISPLAY = 0;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY__DESCRIPTION = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Displays List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY__DISPLAYS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY__DISPLAYS_LIST;

  /**
	 * The feature id for the '<em><b>Abstract Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Abstract Feature Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Create Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY___CREATE_CONTROL__COMPOSITE = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Get Control Minimum Size</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>Bind Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY___BIND_CONTROL__CONTROL = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_OPERATION_COUNT + 2;

  /**
	 * The operation id for the '<em>Update Range</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY___UPDATE_RANGE__CONTROL_RANGES = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_OPERATION_COUNT + 3;

  /**
	 * The operation id for the '<em>Update Resolved</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_OPERATION_COUNT + 4;

  /**
	 * The number of operations of the '<em>Abstract Feature Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_FEATURE_DISPLAY_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_DISPLAY_OPERATION_COUNT + 5;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.TextDisplayImpl <em>Text Display</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.TextDisplayImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getTextDisplay()
	 * @generated
	 */
  int TEXT_DISPLAY = 1;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY__DESCRIPTION = ABSTRACT_FEATURE_DISPLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Displays List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY__DISPLAYS_LIST = ABSTRACT_FEATURE_DISPLAY__DISPLAYS_LIST;

  /**
	 * The feature id for the '<em><b>Abstract Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY__ABSTRACT_FEATURE_NODE = ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY__MINIMUM_WIDTH = ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH;

  /**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY__MINIMUM_HEIGHT = ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT;

  /**
	 * The feature id for the '<em><b>Decimal Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY__DECIMAL_FORMAT = ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Text Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY_FEATURE_COUNT = ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT + 1;

  /**
	 * The operation id for the '<em>Create Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY___CREATE_CONTROL__COMPOSITE = ABSTRACT_FEATURE_DISPLAY___CREATE_CONTROL__COMPOSITE;

  /**
	 * The operation id for the '<em>Get Control Minimum Size</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL = ABSTRACT_FEATURE_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL;

  /**
	 * The operation id for the '<em>Bind Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY___BIND_CONTROL__CONTROL = ABSTRACT_FEATURE_DISPLAY___BIND_CONTROL__CONTROL;

  /**
	 * The operation id for the '<em>Update Range</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY___UPDATE_RANGE__CONTROL_RANGES = ABSTRACT_FEATURE_DISPLAY___UPDATE_RANGE__CONTROL_RANGES;

  /**
	 * The operation id for the '<em>Update Resolved</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN = ABSTRACT_FEATURE_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN;

  /**
	 * The number of operations of the '<em>Text Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_DISPLAY_OPERATION_COUNT = ABSTRACT_FEATURE_DISPLAY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.BooleanDisplayImpl <em>Boolean Display</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.BooleanDisplayImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getBooleanDisplay()
	 * @generated
	 */
  int BOOLEAN_DISPLAY = 2;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY__DESCRIPTION = ABSTRACT_FEATURE_DISPLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Displays List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY__DISPLAYS_LIST = ABSTRACT_FEATURE_DISPLAY__DISPLAYS_LIST;

  /**
	 * The feature id for the '<em><b>Abstract Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY__ABSTRACT_FEATURE_NODE = ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY__MINIMUM_WIDTH = ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH;

  /**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY__MINIMUM_HEIGHT = ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT;

  /**
	 * The number of structural features of the '<em>Boolean Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY_FEATURE_COUNT = ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Create Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY___CREATE_CONTROL__COMPOSITE = ABSTRACT_FEATURE_DISPLAY___CREATE_CONTROL__COMPOSITE;

  /**
	 * The operation id for the '<em>Get Control Minimum Size</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL = ABSTRACT_FEATURE_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL;

  /**
	 * The operation id for the '<em>Bind Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY___BIND_CONTROL__CONTROL = ABSTRACT_FEATURE_DISPLAY___BIND_CONTROL__CONTROL;

  /**
	 * The operation id for the '<em>Update Range</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY___UPDATE_RANGE__CONTROL_RANGES = ABSTRACT_FEATURE_DISPLAY___UPDATE_RANGE__CONTROL_RANGES;

  /**
	 * The operation id for the '<em>Update Resolved</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN = ABSTRACT_FEATURE_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN;

  /**
	 * The number of operations of the '<em>Boolean Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int BOOLEAN_DISPLAY_OPERATION_COUNT = ABSTRACT_FEATURE_DISPLAY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.HistoryDataHandlerImpl <em>History Data Handler</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.HistoryDataHandlerImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getHistoryDataHandler()
	 * @generated
	 */
  int HISTORY_DATA_HANDLER = 3;

  /**
	 * The number of structural features of the '<em>History Data Handler</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HISTORY_DATA_HANDLER_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get History Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HISTORY_DATA_HANDLER___GET_HISTORY_DATA__CONTROL = 0;

  /**
	 * The operation id for the '<em>Apply History Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HISTORY_DATA_HANDLER___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA = 1;

  /**
	 * The number of operations of the '<em>History Data Handler</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HISTORY_DATA_HANDLER_OPERATION_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.HistoryDataImpl <em>History Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.HistoryDataImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getHistoryData()
	 * @generated
	 */
  int HISTORY_DATA = 4;

  /**
	 * The number of structural features of the '<em>History Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HISTORY_DATA_FEATURE_COUNT = 0;

  /**
	 * The number of operations of the '<em>History Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int HISTORY_DATA_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.NumberVersusTimeHistoryDataImpl <em>Number Versus Time History Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.NumberVersusTimeHistoryDataImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getNumberVersusTimeHistoryData()
	 * @generated
	 */
  int NUMBER_VERSUS_TIME_HISTORY_DATA = 5;

  /**
	 * The feature id for the '<em><b>History Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA = HISTORY_DATA_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Number Versus Time History Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VERSUS_TIME_HISTORY_DATA_FEATURE_COUNT = HISTORY_DATA_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Number Versus Time History Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VERSUS_TIME_HISTORY_DATA_OPERATION_COUNT = HISTORY_DATA_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.AbstractPlotDisplayImpl <em>Abstract Plot Display</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.AbstractPlotDisplayImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getAbstractPlotDisplay()
	 * @generated
	 */
  int ABSTRACT_PLOT_DISPLAY = 6;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__DESCRIPTION = ABSTRACT_FEATURE_DISPLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Displays List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__DISPLAYS_LIST = ABSTRACT_FEATURE_DISPLAY__DISPLAYS_LIST;

  /**
	 * The feature id for the '<em><b>Abstract Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__ABSTRACT_FEATURE_NODE = ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__MINIMUM_WIDTH = ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH;

  /**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__MINIMUM_HEIGHT = ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT;

  /**
	 * The feature id for the '<em><b>Repeat Last Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE = ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Use Data Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING = ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>History Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH = ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Abstract Plot Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY_FEATURE_COUNT = ABSTRACT_FEATURE_DISPLAY_FEATURE_COUNT + 3;

  /**
	 * The operation id for the '<em>Create Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY___CREATE_CONTROL__COMPOSITE = ABSTRACT_FEATURE_DISPLAY___CREATE_CONTROL__COMPOSITE;

  /**
	 * The operation id for the '<em>Get Control Minimum Size</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL = ABSTRACT_FEATURE_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL;

  /**
	 * The operation id for the '<em>Bind Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY___BIND_CONTROL__CONTROL = ABSTRACT_FEATURE_DISPLAY___BIND_CONTROL__CONTROL;

  /**
	 * The operation id for the '<em>Update Range</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY___UPDATE_RANGE__CONTROL_RANGES = ABSTRACT_FEATURE_DISPLAY___UPDATE_RANGE__CONTROL_RANGES;

  /**
	 * The operation id for the '<em>Update Resolved</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN = ABSTRACT_FEATURE_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN;

  /**
	 * The operation id for the '<em>Get History Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY___GET_HISTORY_DATA__CONTROL = ABSTRACT_FEATURE_DISPLAY_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Apply History Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA = ABSTRACT_FEATURE_DISPLAY_OPERATION_COUNT + 1;

  /**
	 * The number of operations of the '<em>Abstract Plot Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_PLOT_DISPLAY_OPERATION_COUNT = ABSTRACT_FEATURE_DISPLAY_OPERATION_COUNT + 2;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.NumberVsTimePlotDisplayImpl <em>Number Vs Time Plot Display</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.NumberVsTimePlotDisplayImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getNumberVsTimePlotDisplay()
	 * @generated
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY = 7;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__DESCRIPTION = ABSTRACT_PLOT_DISPLAY__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Displays List</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__DISPLAYS_LIST = ABSTRACT_PLOT_DISPLAY__DISPLAYS_LIST;

  /**
	 * The feature id for the '<em><b>Abstract Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__ABSTRACT_FEATURE_NODE = ABSTRACT_PLOT_DISPLAY__ABSTRACT_FEATURE_NODE;

  /**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__MINIMUM_WIDTH = ABSTRACT_PLOT_DISPLAY__MINIMUM_WIDTH;

  /**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__MINIMUM_HEIGHT = ABSTRACT_PLOT_DISPLAY__MINIMUM_HEIGHT;

  /**
	 * The feature id for the '<em><b>Repeat Last Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__REPEAT_LAST_VALUE = ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE;

  /**
	 * The feature id for the '<em><b>Use Data Buffering</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__USE_DATA_BUFFERING = ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING;

  /**
	 * The feature id for the '<em><b>History Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY__HISTORY_LENGTH = ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH;

  /**
	 * The number of structural features of the '<em>Number Vs Time Plot Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY_FEATURE_COUNT = ABSTRACT_PLOT_DISPLAY_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Create Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY___CREATE_CONTROL__COMPOSITE = ABSTRACT_PLOT_DISPLAY___CREATE_CONTROL__COMPOSITE;

  /**
	 * The operation id for the '<em>Get Control Minimum Size</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL = ABSTRACT_PLOT_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL;

  /**
	 * The operation id for the '<em>Bind Control</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY___BIND_CONTROL__CONTROL = ABSTRACT_PLOT_DISPLAY___BIND_CONTROL__CONTROL;

  /**
	 * The operation id for the '<em>Update Range</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY___UPDATE_RANGE__CONTROL_RANGES = ABSTRACT_PLOT_DISPLAY___UPDATE_RANGE__CONTROL_RANGES;

  /**
	 * The operation id for the '<em>Update Resolved</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN = ABSTRACT_PLOT_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN;

  /**
	 * The operation id for the '<em>Get History Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY___GET_HISTORY_DATA__CONTROL = ABSTRACT_PLOT_DISPLAY___GET_HISTORY_DATA__CONTROL;

  /**
	 * The operation id for the '<em>Apply History Data</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA = ABSTRACT_PLOT_DISPLAY___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA;

  /**
	 * The number of operations of the '<em>Number Vs Time Plot Display</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NUMBER_VS_TIME_PLOT_DISPLAY_OPERATION_COUNT = ABSTRACT_PLOT_DISPLAY_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.display.impl.DisplayFacadeImpl <em>Display Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.display.impl.DisplayFacadeImpl
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getDisplayFacade()
	 * @generated
	 */
  int DISPLAY_FACADE = 8;

  /**
	 * The number of structural features of the '<em>Display Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAY_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get Displayed Name</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAY_FACADE___GET_DISPLAYED_NAME__ABSTRACTFEATUREDISPLAY = 0;

  /**
	 * The operation id for the '<em>Get Source</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAY_FACADE___GET_SOURCE__ABSTRACTFEATUREDISPLAY = 1;

  /**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAY_FACADE___GET_ESTRUCTURAL_FEATURE__ABSTRACTDISPLAY = 2;

  /**
	 * The operation id for the '<em>Get IObservable Value</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAY_FACADE___GET_IOBSERVABLE_VALUE__ABSTRACTFEATUREDISPLAY_CONTROL = 3;

  /**
	 * The number of operations of the '<em>Display Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DISPLAY_FACADE_OPERATION_COUNT = 4;

  /**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getList()
	 * @generated
	 */
  int LIST = 9;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 10;

  /**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getColor()
	 * @generated
	 */
  int COLOR = 11;

  /**
	 * The meta object id for the '<em>Control</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.swt.widgets.Control
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getControl()
	 * @generated
	 */
  int CONTROL = 12;

  /**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.awt.Point
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getPoint()
	 * @generated
	 */
  int POINT = 13;

  /**
	 * The meta object id for the '<em>Composite</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.swt.widgets.Composite
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getComposite()
	 * @generated
	 */
  int COMPOSITE = 14;

  /**
	 * The meta object id for the '<em>Data Binding Context</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.core.databinding.DataBindingContext
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getDataBindingContext()
	 * @generated
	 */
  int DATA_BINDING_CONTEXT = 15;

  /**
	 * The meta object id for the '<em>Editing Domain</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.edit.domain.EditingDomain
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getEditingDomain()
	 * @generated
	 */
  int EDITING_DOMAIN = 16;

  /**
	 * The meta object id for the '<em>IObservable Value</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.core.databinding.observable.value.IObservableValue
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getIObservableValue()
	 * @generated
	 */
  int IOBSERVABLE_VALUE = 17;


  /**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Number
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getNumber()
	 * @generated
	 */
  int NUMBER = 18;

  /**
	 * The meta object id for the '<em>Long</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getLong()
	 * @generated
	 */
  int LONG = 19;


  /**
	 * The meta object id for the '<em>Sorted Map</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedMap
	 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getSortedMap()
	 * @generated
	 */
  int SORTED_MAP = 20;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay <em>Abstract Feature Display</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Display</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay
	 * @generated
	 */
  EClass getAbstractFeatureDisplay();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getAbstractFeatureNode <em>Abstract Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstract Feature Node</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#getAbstractFeatureNode()
	 * @see #getAbstractFeatureDisplay()
	 * @generated
	 */
  EReference getAbstractFeatureDisplay_AbstractFeatureNode();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumWidth <em>Minimum Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Width</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumWidth()
	 * @see #getAbstractFeatureDisplay()
	 * @generated
	 */
  EAttribute getAbstractFeatureDisplay_MinimumWidth();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumHeight <em>Minimum Height</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Height</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#getMinimumHeight()
	 * @see #getAbstractFeatureDisplay()
	 * @generated
	 */
  EAttribute getAbstractFeatureDisplay_MinimumHeight();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#createControl(org.eclipse.swt.widgets.Composite) <em>Create Control</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Control</em>' operation.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#createControl(org.eclipse.swt.widgets.Composite)
	 * @generated
	 */
  EOperation getAbstractFeatureDisplay__CreateControl__Composite();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#getControlMinimumSize(org.eclipse.swt.widgets.Control) <em>Get Control Minimum Size</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Control Minimum Size</em>' operation.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#getControlMinimumSize(org.eclipse.swt.widgets.Control)
	 * @generated
	 */
  EOperation getAbstractFeatureDisplay__GetControlMinimumSize__Control();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#bindControl(org.eclipse.swt.widgets.Control) <em>Bind Control</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind Control</em>' operation.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#bindControl(org.eclipse.swt.widgets.Control)
	 * @generated
	 */
  EOperation getAbstractFeatureDisplay__BindControl__Control();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#updateRange(org.eclipse.swt.widgets.Control, ca.gc.asc_csa.eclipse.emf.ecore.Ranges) <em>Update Range</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Range</em>' operation.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#updateRange(org.eclipse.swt.widgets.Control, ca.gc.asc_csa.eclipse.emf.ecore.Ranges)
	 * @generated
	 */
  EOperation getAbstractFeatureDisplay__UpdateRange__Control_Ranges();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.AbstractFeatureDisplay#updateResolved(org.eclipse.swt.widgets.Control, boolean) <em>Update Resolved</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Resolved</em>' operation.
	 * @see org.eclipse.symphony.core.display.AbstractFeatureDisplay#updateResolved(org.eclipse.swt.widgets.Control, boolean)
	 * @generated
	 */
  EOperation getAbstractFeatureDisplay__UpdateResolved__Control_boolean();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.TextDisplay <em>Text Display</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Display</em>'.
	 * @see org.eclipse.symphony.core.display.TextDisplay
	 * @generated
	 */
  EClass getTextDisplay();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.display.TextDisplay#getDecimalFormat <em>Decimal Format</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Format</em>'.
	 * @see org.eclipse.symphony.core.display.TextDisplay#getDecimalFormat()
	 * @see #getTextDisplay()
	 * @generated
	 */
  EAttribute getTextDisplay_DecimalFormat();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.BooleanDisplay <em>Boolean Display</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Display</em>'.
	 * @see org.eclipse.symphony.core.display.BooleanDisplay
	 * @generated
	 */
  EClass getBooleanDisplay();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.HistoryDataHandler <em>History Data Handler</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Data Handler</em>'.
	 * @see org.eclipse.symphony.core.display.HistoryDataHandler
	 * @generated
	 */
  EClass getHistoryDataHandler();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.HistoryDataHandler#getHistoryData(org.eclipse.swt.widgets.Control) <em>Get History Data</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get History Data</em>' operation.
	 * @see org.eclipse.symphony.core.display.HistoryDataHandler#getHistoryData(org.eclipse.swt.widgets.Control)
	 * @generated
	 */
  EOperation getHistoryDataHandler__GetHistoryData__Control();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.HistoryDataHandler#applyHistoryData(org.eclipse.swt.widgets.Control, org.eclipse.symphony.core.display.HistoryData) <em>Apply History Data</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply History Data</em>' operation.
	 * @see org.eclipse.symphony.core.display.HistoryDataHandler#applyHistoryData(org.eclipse.swt.widgets.Control, org.eclipse.symphony.core.display.HistoryData)
	 * @generated
	 */
  EOperation getHistoryDataHandler__ApplyHistoryData__Control_HistoryData();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.HistoryData <em>History Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Data</em>'.
	 * @see org.eclipse.symphony.core.display.HistoryData
	 * @generated
	 */
  EClass getHistoryData();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.NumberVersusTimeHistoryData <em>Number Versus Time History Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Versus Time History Data</em>'.
	 * @see org.eclipse.symphony.core.display.NumberVersusTimeHistoryData
	 * @generated
	 */
  EClass getNumberVersusTimeHistoryData();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.display.NumberVersusTimeHistoryData#getHistoryData <em>History Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History Data</em>'.
	 * @see org.eclipse.symphony.core.display.NumberVersusTimeHistoryData#getHistoryData()
	 * @see #getNumberVersusTimeHistoryData()
	 * @generated
	 */
  EAttribute getNumberVersusTimeHistoryData_HistoryData();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.AbstractPlotDisplay <em>Abstract Plot Display</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Plot Display</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractPlotDisplay
	 * @generated
	 */
  EClass getAbstractPlotDisplay();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.display.AbstractPlotDisplay#isRepeatLastValue <em>Repeat Last Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Last Value</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractPlotDisplay#isRepeatLastValue()
	 * @see #getAbstractPlotDisplay()
	 * @generated
	 */
  EAttribute getAbstractPlotDisplay_RepeatLastValue();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.display.AbstractPlotDisplay#isUseDataBuffering <em>Use Data Buffering</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Data Buffering</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractPlotDisplay#isUseDataBuffering()
	 * @see #getAbstractPlotDisplay()
	 * @generated
	 */
  EAttribute getAbstractPlotDisplay_UseDataBuffering();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.display.AbstractPlotDisplay#getHistoryLength <em>History Length</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History Length</em>'.
	 * @see org.eclipse.symphony.core.display.AbstractPlotDisplay#getHistoryLength()
	 * @see #getAbstractPlotDisplay()
	 * @generated
	 */
  EAttribute getAbstractPlotDisplay_HistoryLength();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.NumberVsTimePlotDisplay <em>Number Vs Time Plot Display</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Vs Time Plot Display</em>'.
	 * @see org.eclipse.symphony.core.display.NumberVsTimePlotDisplay
	 * @generated
	 */
  EClass getNumberVsTimePlotDisplay();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.display.DisplayFacade <em>Display Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Facade</em>'.
	 * @see org.eclipse.symphony.core.display.DisplayFacade
	 * @generated
	 */
  EClass getDisplayFacade();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.DisplayFacade#getDisplayedName(org.eclipse.symphony.core.display.AbstractFeatureDisplay) <em>Get Displayed Name</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Displayed Name</em>' operation.
	 * @see org.eclipse.symphony.core.display.DisplayFacade#getDisplayedName(org.eclipse.symphony.core.display.AbstractFeatureDisplay)
	 * @generated
	 */
  EOperation getDisplayFacade__GetDisplayedName__AbstractFeatureDisplay();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.DisplayFacade#getSource(org.eclipse.symphony.core.display.AbstractFeatureDisplay) <em>Get Source</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source</em>' operation.
	 * @see org.eclipse.symphony.core.display.DisplayFacade#getSource(org.eclipse.symphony.core.display.AbstractFeatureDisplay)
	 * @generated
	 */
  EOperation getDisplayFacade__GetSource__AbstractFeatureDisplay();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.DisplayFacade#getEStructuralFeature(ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractDisplay) <em>Get EStructural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EStructural Feature</em>' operation.
	 * @see org.eclipse.symphony.core.display.DisplayFacade#getEStructuralFeature(ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractDisplay)
	 * @generated
	 */
  EOperation getDisplayFacade__GetEStructuralFeature__AbstractDisplay();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.display.DisplayFacade#getIObservableValue(org.eclipse.symphony.core.display.AbstractFeatureDisplay, org.eclipse.swt.widgets.Control) <em>Get IObservable Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get IObservable Value</em>' operation.
	 * @see org.eclipse.symphony.core.display.DisplayFacade#getIObservableValue(org.eclipse.symphony.core.display.AbstractFeatureDisplay, org.eclipse.swt.widgets.Control)
	 * @generated
	 */
  EOperation getDisplayFacade__GetIObservableValue__AbstractFeatureDisplay_Control();

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
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
  EDataType getSortedSet();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.eclipse.swt.graphics.Color
	 * @model instanceClass="org.eclipse.swt.graphics.Color"
	 * @generated
	 */
  EDataType getColor();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.swt.widgets.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Control</em>'.
	 * @see org.eclipse.swt.widgets.Control
	 * @model instanceClass="org.eclipse.swt.widgets.Control"
	 * @generated
	 */
  EDataType getControl();

  /**
	 * Returns the meta object for data type '{@link java.awt.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see java.awt.Point
	 * @model instanceClass="java.awt.Point"
	 * @generated
	 */
  EDataType getPoint();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.swt.widgets.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Composite</em>'.
	 * @see org.eclipse.swt.widgets.Composite
	 * @model instanceClass="org.eclipse.swt.widgets.Composite"
	 * @generated
	 */
  EDataType getComposite();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.core.databinding.DataBindingContext <em>Data Binding Context</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Binding Context</em>'.
	 * @see org.eclipse.core.databinding.DataBindingContext
	 * @model instanceClass="org.eclipse.core.databinding.DataBindingContext"
	 * @generated
	 */
  EDataType getDataBindingContext();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.emf.edit.domain.EditingDomain <em>Editing Domain</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Editing Domain</em>'.
	 * @see org.eclipse.emf.edit.domain.EditingDomain
	 * @model instanceClass="org.eclipse.emf.edit.domain.EditingDomain"
	 * @generated
	 */
  EDataType getEditingDomain();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.core.databinding.observable.value.IObservableValue <em>IObservable Value</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IObservable Value</em>'.
	 * @see org.eclipse.core.databinding.observable.value.IObservableValue
	 * @model instanceClass="org.eclipse.core.databinding.observable.value.IObservableValue"
	 * @generated
	 */
  EDataType getIObservableValue();

  /**
	 * Returns the meta object for data type '{@link java.lang.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.lang.Number
	 * @model instanceClass="java.lang.Number"
	 * @generated
	 */
  EDataType getNumber();

  /**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
  EDataType getLong();

  /**
	 * Returns the meta object for data type '{@link java.util.SortedMap <em>Sorted Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Map</em>'.
	 * @see java.util.SortedMap
	 * @model instanceClass="java.util.SortedMap" typeParameters="K V"
	 * @generated
	 */
  EDataType getSortedMap();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EMFEcoreInvocatorDisplayFactory getEMFEcoreInvocatorDisplayFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.AbstractFeatureDisplayImpl <em>Abstract Feature Display</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.AbstractFeatureDisplayImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getAbstractFeatureDisplay()
		 * @generated
		 */
    EClass ABSTRACT_FEATURE_DISPLAY = eINSTANCE.getAbstractFeatureDisplay();

    /**
		 * The meta object literal for the '<em><b>Abstract Feature Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE = eINSTANCE.getAbstractFeatureDisplay_AbstractFeatureNode();

    /**
		 * The meta object literal for the '<em><b>Minimum Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH = eINSTANCE.getAbstractFeatureDisplay_MinimumWidth();

    /**
		 * The meta object literal for the '<em><b>Minimum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT = eINSTANCE.getAbstractFeatureDisplay_MinimumHeight();

    /**
		 * The meta object literal for the '<em><b>Create Control</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_FEATURE_DISPLAY___CREATE_CONTROL__COMPOSITE = eINSTANCE.getAbstractFeatureDisplay__CreateControl__Composite();

    /**
		 * The meta object literal for the '<em><b>Get Control Minimum Size</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_FEATURE_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL = eINSTANCE.getAbstractFeatureDisplay__GetControlMinimumSize__Control();

    /**
		 * The meta object literal for the '<em><b>Bind Control</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_FEATURE_DISPLAY___BIND_CONTROL__CONTROL = eINSTANCE.getAbstractFeatureDisplay__BindControl__Control();

    /**
		 * The meta object literal for the '<em><b>Update Range</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_FEATURE_DISPLAY___UPDATE_RANGE__CONTROL_RANGES = eINSTANCE.getAbstractFeatureDisplay__UpdateRange__Control_Ranges();

    /**
		 * The meta object literal for the '<em><b>Update Resolved</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ABSTRACT_FEATURE_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN = eINSTANCE.getAbstractFeatureDisplay__UpdateResolved__Control_boolean();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.TextDisplayImpl <em>Text Display</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.TextDisplayImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getTextDisplay()
		 * @generated
		 */
    EClass TEXT_DISPLAY = eINSTANCE.getTextDisplay();

    /**
		 * The meta object literal for the '<em><b>Decimal Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TEXT_DISPLAY__DECIMAL_FORMAT = eINSTANCE.getTextDisplay_DecimalFormat();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.BooleanDisplayImpl <em>Boolean Display</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.BooleanDisplayImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getBooleanDisplay()
		 * @generated
		 */
    EClass BOOLEAN_DISPLAY = eINSTANCE.getBooleanDisplay();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.HistoryDataHandlerImpl <em>History Data Handler</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.HistoryDataHandlerImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getHistoryDataHandler()
		 * @generated
		 */
    EClass HISTORY_DATA_HANDLER = eINSTANCE.getHistoryDataHandler();

    /**
		 * The meta object literal for the '<em><b>Get History Data</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation HISTORY_DATA_HANDLER___GET_HISTORY_DATA__CONTROL = eINSTANCE.getHistoryDataHandler__GetHistoryData__Control();

    /**
		 * The meta object literal for the '<em><b>Apply History Data</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation HISTORY_DATA_HANDLER___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA = eINSTANCE.getHistoryDataHandler__ApplyHistoryData__Control_HistoryData();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.HistoryDataImpl <em>History Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.HistoryDataImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getHistoryData()
		 * @generated
		 */
    EClass HISTORY_DATA = eINSTANCE.getHistoryData();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.NumberVersusTimeHistoryDataImpl <em>Number Versus Time History Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.NumberVersusTimeHistoryDataImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getNumberVersusTimeHistoryData()
		 * @generated
		 */
    EClass NUMBER_VERSUS_TIME_HISTORY_DATA = eINSTANCE.getNumberVersusTimeHistoryData();

    /**
		 * The meta object literal for the '<em><b>History Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA = eINSTANCE.getNumberVersusTimeHistoryData_HistoryData();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.AbstractPlotDisplayImpl <em>Abstract Plot Display</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.AbstractPlotDisplayImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getAbstractPlotDisplay()
		 * @generated
		 */
    EClass ABSTRACT_PLOT_DISPLAY = eINSTANCE.getAbstractPlotDisplay();

    /**
		 * The meta object literal for the '<em><b>Repeat Last Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE = eINSTANCE.getAbstractPlotDisplay_RepeatLastValue();

    /**
		 * The meta object literal for the '<em><b>Use Data Buffering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING = eINSTANCE.getAbstractPlotDisplay_UseDataBuffering();

    /**
		 * The meta object literal for the '<em><b>History Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH = eINSTANCE.getAbstractPlotDisplay_HistoryLength();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.NumberVsTimePlotDisplayImpl <em>Number Vs Time Plot Display</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.NumberVsTimePlotDisplayImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getNumberVsTimePlotDisplay()
		 * @generated
		 */
    EClass NUMBER_VS_TIME_PLOT_DISPLAY = eINSTANCE.getNumberVsTimePlotDisplay();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.display.impl.DisplayFacadeImpl <em>Display Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.display.impl.DisplayFacadeImpl
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getDisplayFacade()
		 * @generated
		 */
    EClass DISPLAY_FACADE = eINSTANCE.getDisplayFacade();

    /**
		 * The meta object literal for the '<em><b>Get Displayed Name</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation DISPLAY_FACADE___GET_DISPLAYED_NAME__ABSTRACTFEATUREDISPLAY = eINSTANCE.getDisplayFacade__GetDisplayedName__AbstractFeatureDisplay();

    /**
		 * The meta object literal for the '<em><b>Get Source</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation DISPLAY_FACADE___GET_SOURCE__ABSTRACTFEATUREDISPLAY = eINSTANCE.getDisplayFacade__GetSource__AbstractFeatureDisplay();

    /**
		 * The meta object literal for the '<em><b>Get EStructural Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation DISPLAY_FACADE___GET_ESTRUCTURAL_FEATURE__ABSTRACTDISPLAY = eINSTANCE.getDisplayFacade__GetEStructuralFeature__AbstractDisplay();

    /**
		 * The meta object literal for the '<em><b>Get IObservable Value</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation DISPLAY_FACADE___GET_IOBSERVABLE_VALUE__ABSTRACTFEATUREDISPLAY_CONTROL = eINSTANCE.getDisplayFacade__GetIObservableValue__AbstractFeatureDisplay_Control();

    /**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getList()
		 * @generated
		 */
    EDataType LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

    /**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getColor()
		 * @generated
		 */
    EDataType COLOR = eINSTANCE.getColor();

    /**
		 * The meta object literal for the '<em>Control</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.swt.widgets.Control
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getControl()
		 * @generated
		 */
    EDataType CONTROL = eINSTANCE.getControl();

    /**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.awt.Point
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getPoint()
		 * @generated
		 */
    EDataType POINT = eINSTANCE.getPoint();

    /**
		 * The meta object literal for the '<em>Composite</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.swt.widgets.Composite
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getComposite()
		 * @generated
		 */
    EDataType COMPOSITE = eINSTANCE.getComposite();

    /**
		 * The meta object literal for the '<em>Data Binding Context</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.core.databinding.DataBindingContext
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getDataBindingContext()
		 * @generated
		 */
    EDataType DATA_BINDING_CONTEXT = eINSTANCE.getDataBindingContext();

    /**
		 * The meta object literal for the '<em>Editing Domain</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.edit.domain.EditingDomain
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getEditingDomain()
		 * @generated
		 */
    EDataType EDITING_DOMAIN = eINSTANCE.getEditingDomain();

    /**
		 * The meta object literal for the '<em>IObservable Value</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.core.databinding.observable.value.IObservableValue
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getIObservableValue()
		 * @generated
		 */
    EDataType IOBSERVABLE_VALUE = eINSTANCE.getIObservableValue();

    /**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Number
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getNumber()
		 * @generated
		 */
    EDataType NUMBER = eINSTANCE.getNumber();

    /**
		 * The meta object literal for the '<em>Long</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getLong()
		 * @generated
		 */
    EDataType LONG = eINSTANCE.getLong();

    /**
		 * The meta object literal for the '<em>Sorted Map</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedMap
		 * @see org.eclipse.symphony.core.display.impl.EMFEcoreInvocatorDisplayPackageImpl#getSortedMap()
		 * @generated
		 */
    EDataType SORTED_MAP = eINSTANCE.getSortedMap();

  }

} //EMFEcoreInvocatorDisplayPackage
