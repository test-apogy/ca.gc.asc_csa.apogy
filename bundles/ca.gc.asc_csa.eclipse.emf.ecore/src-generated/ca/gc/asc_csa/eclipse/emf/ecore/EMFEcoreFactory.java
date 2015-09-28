/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage
 * @generated
 */
public interface EMFEcoreFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreFactory eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.impl.EMFEcoreFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
  EMFEcoreFacade createEMFEcoreFacade();

  /**
	 * Returns a new object of class '<em>Time Sources List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Sources List</em>'.
	 * @generated
	 */
	TimeSourcesList createTimeSourcesList();

		/**
	 * Returns a new object of class '<em>Fixed Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Time Source</em>'.
	 * @generated
	 */
	FixedTimeSource createFixedTimeSource();

		/**
	 * Returns a new object of class '<em>Current Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Time Source</em>'.
	 * @generated
	 */
	CurrentTimeSource createCurrentTimeSource();

		/**
	 * Returns a new object of class '<em>Browseable Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Browseable Time Source</em>'.
	 * @generated
	 */
	BrowseableTimeSource createBrowseableTimeSource();

		/**
	 * Returns a new object of class '<em>Selection Based Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Based Time Source</em>'.
	 * @generated
	 */
	SelectionBasedTimeSource createSelectionBasedTimeSource();

		/**
	 * Returns a new object of class '<em>Collection Timed Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Timed Time Source</em>'.
	 * @generated
	 */
	CollectionTimedTimeSource createCollectionTimedTimeSource();

		/**
	 * Returns a new object of class '<em>Feature Node Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Node Adapter</em>'.
	 * @generated
	 */
  FeatureNodeAdapter createFeatureNodeAdapter();

  /**
	 * Returns a new object of class '<em>Tree Root Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Root Node</em>'.
	 * @generated
	 */
  TreeRootNode createTreeRootNode();

  /**
	 * Returns a new object of class '<em>Tree Feature Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Feature Node</em>'.
	 * @generated
	 */
  TreeFeatureNode createTreeFeatureNode();

  /**
	 * Returns a new object of class '<em>List Root Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Root Node</em>'.
	 * @generated
	 */
  ListRootNode createListRootNode();

  /**
	 * Returns a new object of class '<em>List Feature Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Feature Node</em>'.
	 * @generated
	 */
  ListFeatureNode createListFeatureNode();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EMFEcorePackage getEMFEcorePackage();

} //EMFEcoreFactory
