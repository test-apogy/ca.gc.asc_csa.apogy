/**
 */
package org.eclipse.symphony.common.emf.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.*;
import org.eclipse.symphony.common.emf.AbstractFeatureListNode;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.AbstractFeatureTreeNode;
import org.eclipse.symphony.common.emf.AbstractRootNode;
import org.eclipse.symphony.common.emf.BrowseableTimeSource;
import org.eclipse.symphony.common.emf.CollectionTimedTimeSource;
import org.eclipse.symphony.common.emf.CurrentTimeSource;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Disposable;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;
import org.eclipse.symphony.common.emf.FixedTimeSource;
import org.eclipse.symphony.common.emf.ListFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.SelectionBasedTimeSource;
import org.eclipse.symphony.common.emf.TimeSource;
import org.eclipse.symphony.common.emf.TimeSourcesList;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.emf.TreeFeatureNode;
import org.eclipse.symphony.common.emf.TreeRootNode;

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
 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage
 * @generated
 */
public class Symphony__CommonEMFSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Symphony__CommonEMFPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CommonEMFSwitch()
  {
		if (modelPackage == null) {
			modelPackage = Symphony__CommonEMFPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case Symphony__CommonEMFPackage.SYMPHONY_COMMON_EMF_FACADE: {
				Symphony__CommonEMFFacade symphony__CommonEMFFacade = (Symphony__CommonEMFFacade)theEObject;
				T result = caseSymphony__CommonEMFFacade(symphony__CommonEMFFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.NAMED: {
				Named named = (Named)theEObject;
				T result = caseNamed(named);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.DESCRIBED: {
				Described described = (Described)theEObject;
				T result = caseDescribed(described);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.TIMED: {
				Timed timed = (Timed)theEObject;
				T result = caseTimed(timed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseStartable(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.STARTABLE: {
				Startable startable = (Startable)theEObject;
				T result = caseStartable(startable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.TIME_SOURCES_LIST: {
				TimeSourcesList timeSourcesList = (TimeSourcesList)theEObject;
				T result = caseTimeSourcesList(timeSourcesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.TIME_SOURCE: {
				TimeSource timeSource = (TimeSource)theEObject;
				T result = caseTimeSource(timeSource);
				if (result == null) result = caseNamed(timeSource);
				if (result == null) result = caseDescribed(timeSource);
				if (result == null) result = caseTimed(timeSource);
				if (result == null) result = caseDisposable(timeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.FIXED_TIME_SOURCE: {
				FixedTimeSource fixedTimeSource = (FixedTimeSource)theEObject;
				T result = caseFixedTimeSource(fixedTimeSource);
				if (result == null) result = caseTimeSource(fixedTimeSource);
				if (result == null) result = caseNamed(fixedTimeSource);
				if (result == null) result = caseDescribed(fixedTimeSource);
				if (result == null) result = caseTimed(fixedTimeSource);
				if (result == null) result = caseDisposable(fixedTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.CURRENT_TIME_SOURCE: {
				CurrentTimeSource currentTimeSource = (CurrentTimeSource)theEObject;
				T result = caseCurrentTimeSource(currentTimeSource);
				if (result == null) result = caseTimeSource(currentTimeSource);
				if (result == null) result = caseNamed(currentTimeSource);
				if (result == null) result = caseDescribed(currentTimeSource);
				if (result == null) result = caseTimed(currentTimeSource);
				if (result == null) result = caseDisposable(currentTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.BROWSEABLE_TIME_SOURCE: {
				BrowseableTimeSource browseableTimeSource = (BrowseableTimeSource)theEObject;
				T result = caseBrowseableTimeSource(browseableTimeSource);
				if (result == null) result = caseTimeSource(browseableTimeSource);
				if (result == null) result = caseNamed(browseableTimeSource);
				if (result == null) result = caseDescribed(browseableTimeSource);
				if (result == null) result = caseTimed(browseableTimeSource);
				if (result == null) result = caseDisposable(browseableTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.SELECTION_BASED_TIME_SOURCE: {
				SelectionBasedTimeSource selectionBasedTimeSource = (SelectionBasedTimeSource)theEObject;
				T result = caseSelectionBasedTimeSource(selectionBasedTimeSource);
				if (result == null) result = caseTimeSource(selectionBasedTimeSource);
				if (result == null) result = caseNamed(selectionBasedTimeSource);
				if (result == null) result = caseDescribed(selectionBasedTimeSource);
				if (result == null) result = caseTimed(selectionBasedTimeSource);
				if (result == null) result = caseDisposable(selectionBasedTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE: {
				CollectionTimedTimeSource collectionTimedTimeSource = (CollectionTimedTimeSource)theEObject;
				T result = caseCollectionTimedTimeSource(collectionTimedTimeSource);
				if (result == null) result = caseBrowseableTimeSource(collectionTimedTimeSource);
				if (result == null) result = caseTimeSource(collectionTimedTimeSource);
				if (result == null) result = caseNamed(collectionTimedTimeSource);
				if (result == null) result = caseDescribed(collectionTimedTimeSource);
				if (result == null) result = caseTimed(collectionTimedTimeSource);
				if (result == null) result = caseDisposable(collectionTimedTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.DISPOSABLE: {
				Disposable disposable = (Disposable)theEObject;
				T result = caseDisposable(disposable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.FEATURE_NODE_ADAPTER: {
				FeatureNodeAdapter featureNodeAdapter = (FeatureNodeAdapter)theEObject;
				T result = caseFeatureNodeAdapter(featureNodeAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.ABSTRACT_FEATURE_NODE: {
				AbstractFeatureNode abstractFeatureNode = (AbstractFeatureNode)theEObject;
				T result = caseAbstractFeatureNode(abstractFeatureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE: {
				AbstractFeatureListNode abstractFeatureListNode = (AbstractFeatureListNode)theEObject;
				T result = caseAbstractFeatureListNode(abstractFeatureListNode);
				if (result == null) result = caseAbstractFeatureNode(abstractFeatureListNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE: {
				AbstractFeatureTreeNode abstractFeatureTreeNode = (AbstractFeatureTreeNode)theEObject;
				T result = caseAbstractFeatureTreeNode(abstractFeatureTreeNode);
				if (result == null) result = caseAbstractFeatureNode(abstractFeatureTreeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.ABSTRACT_ROOT_NODE: {
				AbstractRootNode abstractRootNode = (AbstractRootNode)theEObject;
				T result = caseAbstractRootNode(abstractRootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.TREE_ROOT_NODE: {
				TreeRootNode treeRootNode = (TreeRootNode)theEObject;
				T result = caseTreeRootNode(treeRootNode);
				if (result == null) result = caseAbstractFeatureTreeNode(treeRootNode);
				if (result == null) result = caseAbstractRootNode(treeRootNode);
				if (result == null) result = caseAbstractFeatureNode(treeRootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.TREE_FEATURE_NODE: {
				TreeFeatureNode treeFeatureNode = (TreeFeatureNode)theEObject;
				T result = caseTreeFeatureNode(treeFeatureNode);
				if (result == null) result = caseAbstractFeatureTreeNode(treeFeatureNode);
				if (result == null) result = caseAbstractFeatureSpecifier(treeFeatureNode);
				if (result == null) result = caseAbstractFeatureNode(treeFeatureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.LIST_ROOT_NODE: {
				ListRootNode listRootNode = (ListRootNode)theEObject;
				T result = caseListRootNode(listRootNode);
				if (result == null) result = caseAbstractFeatureListNode(listRootNode);
				if (result == null) result = caseAbstractRootNode(listRootNode);
				if (result == null) result = caseAbstractFeatureNode(listRootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.LIST_FEATURE_NODE: {
				ListFeatureNode listFeatureNode = (ListFeatureNode)theEObject;
				T result = caseListFeatureNode(listFeatureNode);
				if (result == null) result = caseAbstractFeatureListNode(listFeatureNode);
				if (result == null) result = caseAbstractFeatureSpecifier(listFeatureNode);
				if (result == null) result = caseAbstractFeatureNode(listFeatureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CommonEMFPackage.ABSTRACT_FEATURE_SPECIFIER: {
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
	public T caseSymphony__CommonEMFFacade(Symphony__CommonEMFFacade object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Startable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Startable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartable(Startable object) {
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

} //Symphony__CommonEMFSwitch
