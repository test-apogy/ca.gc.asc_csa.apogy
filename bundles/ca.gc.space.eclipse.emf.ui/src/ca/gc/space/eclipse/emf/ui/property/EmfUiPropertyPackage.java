/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.eclipse.emf.ui.property;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.eclipse.emf.ui.property.EmfUiPropertyFactory
 * @model kind="package"
 * @generated
 */
public interface EmfUiPropertyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "property";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/eclipse/emf/ui/property.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.eclipse.emf.ui.property";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfUiPropertyPackage eINSTANCE = ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorImpl <em>Property Cell Editor Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorImpl
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellEditorContributor()
	 * @generated
	 */
	int PROPERTY_CELL_EDITOR_CONTRIBUTOR = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Cell Editor Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER = 1;

	/**
	 * The number of structural features of the '<em>Property Cell Editor Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_EDITOR_CONTRIBUTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorsImpl <em>Property Cell Editor Contributors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorsImpl
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellEditorContributors()
	 * @generated
	 */
	int PROPERTY_CELL_EDITOR_CONTRIBUTORS = 1;

	/**
	 * The feature id for the '<em><b>List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST = 0;

	/**
	 * The number of structural features of the '<em>Property Cell Editor Contributors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_EDITOR_CONTRIBUTORS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorImpl <em>Property Cell Viewer Content Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorImpl
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellViewerContentContributor()
	 * @generated
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Cell Viewer Content Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER = 1;

	/**
	 * The number of structural features of the '<em>Property Cell Viewer Content Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorsImpl <em>Property Cell Viewer Content Contributors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorsImpl
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellViewerContentContributors()
	 * @generated
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS = 3;

	/**
	 * The feature id for the '<em><b>List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST = 0;

	/**
	 * The number of structural features of the '<em>Property Cell Viewer Content Contributors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Property Cell Editor Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorProvider
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellEditorProvider()
	 * @generated
	 */
	int PROPERTY_CELL_EDITOR_PROVIDER = 4;


	/**
	 * The meta object id for the '<em>Property Cell Viewer Content Provider</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentProvider
	 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellViewerContentProvider()
	 * @generated
	 */
	int PROPERTY_CELL_VIEWER_CONTENT_PROVIDER = 5;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributor <em>Property Cell Editor Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Cell Editor Contributor</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributor
	 * @generated
	 */
	EClass getPropertyCellEditorContributor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributor#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributor#getTarget()
	 * @see #getPropertyCellEditorContributor()
	 * @generated
	 */
	EAttribute getPropertyCellEditorContributor_Target();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributor#getCellEditorProvider <em>Cell Editor Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Editor Provider</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributor#getCellEditorProvider()
	 * @see #getPropertyCellEditorContributor()
	 * @generated
	 */
	EAttribute getPropertyCellEditorContributor_CellEditorProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributors <em>Property Cell Editor Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Cell Editor Contributors</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributors
	 * @generated
	 */
	EClass getPropertyCellEditorContributors();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributors#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorContributors#getList()
	 * @see #getPropertyCellEditorContributors()
	 * @generated
	 */
	EReference getPropertyCellEditorContributors_List();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor <em>Property Cell Viewer Content Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Cell Viewer Content Contributor</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor
	 * @generated
	 */
	EClass getPropertyCellViewerContentContributor();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor#getTarget()
	 * @see #getPropertyCellViewerContentContributor()
	 * @generated
	 */
	EAttribute getPropertyCellViewerContentContributor_Target();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor#getCellViewerContentProvider <em>Cell Viewer Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Viewer Content Provider</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor#getCellViewerContentProvider()
	 * @see #getPropertyCellViewerContentContributor()
	 * @generated
	 */
	EAttribute getPropertyCellViewerContentContributor_CellViewerContentProvider();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributors <em>Property Cell Viewer Content Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Cell Viewer Content Contributors</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributors
	 * @generated
	 */
	EClass getPropertyCellViewerContentContributors();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributors#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributors#getList()
	 * @see #getPropertyCellViewerContentContributors()
	 * @generated
	 */
	EReference getPropertyCellViewerContentContributors_List();

	/**
	 * Returns the meta object for data type '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorProvider <em>Property Cell Editor Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Cell Editor Provider</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorProvider
	 * @model instanceClass="ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorProvider"
	 * @generated
	 */
	EDataType getPropertyCellEditorProvider();

	/**
	 * Returns the meta object for data type '{@link ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentProvider <em>Property Cell Viewer Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Cell Viewer Content Provider</em>'.
	 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentProvider
	 * @model instanceClass="ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentProvider"
	 * @generated
	 */
	EDataType getPropertyCellViewerContentProvider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfUiPropertyFactory getEmfUiPropertyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorImpl <em>Property Cell Editor Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorImpl
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellEditorContributor()
		 * @generated
		 */
		EClass PROPERTY_CELL_EDITOR_CONTRIBUTOR = eINSTANCE.getPropertyCellEditorContributor();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CELL_EDITOR_CONTRIBUTOR__TARGET = eINSTANCE.getPropertyCellEditorContributor_Target();

		/**
		 * The meta object literal for the '<em><b>Cell Editor Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CELL_EDITOR_CONTRIBUTOR__CELL_EDITOR_PROVIDER = eINSTANCE.getPropertyCellEditorContributor_CellEditorProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorsImpl <em>Property Cell Editor Contributors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellEditorContributorsImpl
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellEditorContributors()
		 * @generated
		 */
		EClass PROPERTY_CELL_EDITOR_CONTRIBUTORS = eINSTANCE.getPropertyCellEditorContributors();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST = eINSTANCE.getPropertyCellEditorContributors_List();

		/**
		 * The meta object literal for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorImpl <em>Property Cell Viewer Content Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorImpl
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellViewerContentContributor()
		 * @generated
		 */
		EClass PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR = eINSTANCE.getPropertyCellViewerContentContributor();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__TARGET = eINSTANCE.getPropertyCellViewerContentContributor_Target();

		/**
		 * The meta object literal for the '<em><b>Cell Viewer Content Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR__CELL_VIEWER_CONTENT_PROVIDER = eINSTANCE.getPropertyCellViewerContentContributor_CellViewerContentProvider();

		/**
		 * The meta object literal for the '{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorsImpl <em>Property Cell Viewer Content Contributors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorsImpl
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellViewerContentContributors()
		 * @generated
		 */
		EClass PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS = eINSTANCE.getPropertyCellViewerContentContributors();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST = eINSTANCE.getPropertyCellViewerContentContributors_List();

		/**
		 * The meta object literal for the '<em>Property Cell Editor Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellEditorProvider
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellEditorProvider()
		 * @generated
		 */
		EDataType PROPERTY_CELL_EDITOR_PROVIDER = eINSTANCE.getPropertyCellEditorProvider();

			/**
		 * The meta object literal for the '<em>Property Cell Viewer Content Provider</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentProvider
		 * @see ca.gc.space.eclipse.emf.ui.property.impl.EmfUiPropertyPackageImpl#getPropertyCellViewerContentProvider()
		 * @generated
		 */
		EDataType PROPERTY_CELL_VIEWER_CONTENT_PROVIDER = eINSTANCE.getPropertyCellViewerContentProvider();

	}

} //EmfUiPropertyPackage
