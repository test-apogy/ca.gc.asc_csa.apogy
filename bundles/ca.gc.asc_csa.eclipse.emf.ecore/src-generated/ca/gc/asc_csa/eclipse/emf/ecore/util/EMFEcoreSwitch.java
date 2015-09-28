/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureListNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureTreeNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractRootNode;
import ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.CollectionTimedTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.CurrentTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Disposable;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.FeatureNodeAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.FixedTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.ListFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.ListRootNode;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.SelectionBasedTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.TimeSourcesList;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.asc_csa.eclipse.emf.ecore.TreeFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage
 * @generated
 */
public class EMFEcoreSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcorePackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreSwitch()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcorePackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case EMFEcorePackage.EMF_ECORE_FACADE: {
				EMFEcoreFacade emfEcoreFacade = (EMFEcoreFacade)theEObject;
				T result = caseEMFEcoreFacade(emfEcoreFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.NAMED: {
				Named named = (Named)theEObject;
				T result = caseNamed(named);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.DESCRIBED: {
				Described described = (Described)theEObject;
				T result = caseDescribed(described);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.TIMED: {
				Timed timed = (Timed)theEObject;
				T result = caseTimed(timed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.TIME_SOURCES_LIST: {
				TimeSourcesList timeSourcesList = (TimeSourcesList)theEObject;
				T result = caseTimeSourcesList(timeSourcesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.TIME_SOURCE: {
				TimeSource timeSource = (TimeSource)theEObject;
				T result = caseTimeSource(timeSource);
				if (result == null) result = caseTimed(timeSource);
				if (result == null) result = caseDisposable(timeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.FIXED_TIME_SOURCE: {
				FixedTimeSource fixedTimeSource = (FixedTimeSource)theEObject;
				T result = caseFixedTimeSource(fixedTimeSource);
				if (result == null) result = caseTimeSource(fixedTimeSource);
				if (result == null) result = caseTimed(fixedTimeSource);
				if (result == null) result = caseDisposable(fixedTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.CURRENT_TIME_SOURCE: {
				CurrentTimeSource currentTimeSource = (CurrentTimeSource)theEObject;
				T result = caseCurrentTimeSource(currentTimeSource);
				if (result == null) result = caseTimeSource(currentTimeSource);
				if (result == null) result = caseTimed(currentTimeSource);
				if (result == null) result = caseDisposable(currentTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE: {
				BrowseableTimeSource browseableTimeSource = (BrowseableTimeSource)theEObject;
				T result = caseBrowseableTimeSource(browseableTimeSource);
				if (result == null) result = caseTimeSource(browseableTimeSource);
				if (result == null) result = caseTimed(browseableTimeSource);
				if (result == null) result = caseDisposable(browseableTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.SELECTION_BASED_TIME_SOURCE: {
				SelectionBasedTimeSource selectionBasedTimeSource = (SelectionBasedTimeSource)theEObject;
				T result = caseSelectionBasedTimeSource(selectionBasedTimeSource);
				if (result == null) result = caseTimeSource(selectionBasedTimeSource);
				if (result == null) result = caseTimed(selectionBasedTimeSource);
				if (result == null) result = caseDisposable(selectionBasedTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.COLLECTION_TIMED_TIME_SOURCE: {
				CollectionTimedTimeSource collectionTimedTimeSource = (CollectionTimedTimeSource)theEObject;
				T result = caseCollectionTimedTimeSource(collectionTimedTimeSource);
				if (result == null) result = caseBrowseableTimeSource(collectionTimedTimeSource);
				if (result == null) result = caseTimeSource(collectionTimedTimeSource);
				if (result == null) result = caseTimed(collectionTimedTimeSource);
				if (result == null) result = caseDisposable(collectionTimedTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.DISPOSABLE: {
				Disposable disposable = (Disposable)theEObject;
				T result = caseDisposable(disposable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.FEATURE_NODE_ADAPTER: {
				FeatureNodeAdapter featureNodeAdapter = (FeatureNodeAdapter)theEObject;
				T result = caseFeatureNodeAdapter(featureNodeAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.ABSTRACT_FEATURE_NODE: {
				AbstractFeatureNode abstractFeatureNode = (AbstractFeatureNode)theEObject;
				T result = caseAbstractFeatureNode(abstractFeatureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.ABSTRACT_FEATURE_LIST_NODE: {
				AbstractFeatureListNode abstractFeatureListNode = (AbstractFeatureListNode)theEObject;
				T result = caseAbstractFeatureListNode(abstractFeatureListNode);
				if (result == null) result = caseAbstractFeatureNode(abstractFeatureListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.ABSTRACT_FEATURE_TREE_NODE: {
				AbstractFeatureTreeNode abstractFeatureTreeNode = (AbstractFeatureTreeNode)theEObject;
				T result = caseAbstractFeatureTreeNode(abstractFeatureTreeNode);
				if (result == null) result = caseAbstractFeatureNode(abstractFeatureTreeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.ABSTRACT_ROOT_NODE: {
				AbstractRootNode abstractRootNode = (AbstractRootNode)theEObject;
				T result = caseAbstractRootNode(abstractRootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.TREE_ROOT_NODE: {
				TreeRootNode treeRootNode = (TreeRootNode)theEObject;
				T result = caseTreeRootNode(treeRootNode);
				if (result == null) result = caseAbstractFeatureTreeNode(treeRootNode);
				if (result == null) result = caseAbstractRootNode(treeRootNode);
				if (result == null) result = caseAbstractFeatureNode(treeRootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.TREE_FEATURE_NODE: {
				TreeFeatureNode treeFeatureNode = (TreeFeatureNode)theEObject;
				T result = caseTreeFeatureNode(treeFeatureNode);
				if (result == null) result = caseAbstractFeatureTreeNode(treeFeatureNode);
				if (result == null) result = caseAbstractFeatureSpecifier(treeFeatureNode);
				if (result == null) result = caseAbstractFeatureNode(treeFeatureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.LIST_ROOT_NODE: {
				ListRootNode listRootNode = (ListRootNode)theEObject;
				T result = caseListRootNode(listRootNode);
				if (result == null) result = caseAbstractFeatureListNode(listRootNode);
				if (result == null) result = caseAbstractRootNode(listRootNode);
				if (result == null) result = caseAbstractFeatureNode(listRootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.LIST_FEATURE_NODE: {
				ListFeatureNode listFeatureNode = (ListFeatureNode)theEObject;
				T result = caseListFeatureNode(listFeatureNode);
				if (result == null) result = caseAbstractFeatureListNode(listFeatureNode);
				if (result == null) result = caseAbstractFeatureSpecifier(listFeatureNode);
				if (result == null) result = caseAbstractFeatureNode(listFeatureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcorePackage.ABSTRACT_FEATURE_SPECIFIER: {
				AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier)theEObject;
				T result = caseAbstractFeatureSpecifier(abstractFeatureSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEMFEcoreFacade(EMFEcoreFacade object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNamed(Named object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDescribed(Described object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTimed(Timed object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Time Sources List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Sources List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSourcesList(TimeSourcesList object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSource(TimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedTimeSource(FixedTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentTimeSource(CurrentTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Browseable Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browseable Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseableTimeSource(BrowseableTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Based Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Based Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionBasedTimeSource(SelectionBasedTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Timed Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Timed Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTimedTimeSource(CollectionTimedTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Disposable</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disposable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDisposable(Disposable object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractFeatureNode(AbstractFeatureNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Node Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Node Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFeatureNodeAdapter(FeatureNodeAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature List Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature List Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractFeatureListNode(AbstractFeatureListNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Tree Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Tree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractFeatureTreeNode(AbstractFeatureTreeNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Root Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Root Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractRootNode(AbstractRootNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Root Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Root Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTreeRootNode(TreeRootNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Feature Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Feature Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTreeFeatureNode(TreeFeatureNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>List Root Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Root Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseListRootNode(ListRootNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>List Feature Node</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Feature Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseListFeatureNode(ListFeatureNode object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Specifier</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractFeatureSpecifier(AbstractFeatureSpecifier object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //EMFEcoreSwitch
