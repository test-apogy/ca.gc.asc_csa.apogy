/**
 */
package org.eclipse.symphony.common.emf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage
 * @generated
 */
public class Symphony__CommonEMFAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Symphony__CommonEMFPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CommonEMFAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = Symphony__CommonEMFPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Symphony__CommonEMFSwitch<Adapter> modelSwitch =
    new Symphony__CommonEMFSwitch<Adapter>() {
			@Override
			public Adapter caseEMFEcoreFacade(EMFEcoreFacade object) {
				return createEMFEcoreFacadeAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseStartable(Startable object) {
				return createStartableAdapter();
			}
			@Override
			public Adapter caseTimeSourcesList(TimeSourcesList object) {
				return createTimeSourcesListAdapter();
			}
			@Override
			public Adapter caseTimeSource(TimeSource object) {
				return createTimeSourceAdapter();
			}
			@Override
			public Adapter caseFixedTimeSource(FixedTimeSource object) {
				return createFixedTimeSourceAdapter();
			}
			@Override
			public Adapter caseCurrentTimeSource(CurrentTimeSource object) {
				return createCurrentTimeSourceAdapter();
			}
			@Override
			public Adapter caseBrowseableTimeSource(BrowseableTimeSource object) {
				return createBrowseableTimeSourceAdapter();
			}
			@Override
			public Adapter caseSelectionBasedTimeSource(SelectionBasedTimeSource object) {
				return createSelectionBasedTimeSourceAdapter();
			}
			@Override
			public Adapter caseCollectionTimedTimeSource(CollectionTimedTimeSource object) {
				return createCollectionTimedTimeSourceAdapter();
			}
			@Override
			public Adapter caseDisposable(Disposable object) {
				return createDisposableAdapter();
			}
			@Override
			public Adapter caseFeatureNodeAdapter(FeatureNodeAdapter object) {
				return createFeatureNodeAdapterAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureNode(AbstractFeatureNode object) {
				return createAbstractFeatureNodeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureListNode(AbstractFeatureListNode object) {
				return createAbstractFeatureListNodeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureTreeNode(AbstractFeatureTreeNode object) {
				return createAbstractFeatureTreeNodeAdapter();
			}
			@Override
			public Adapter caseAbstractRootNode(AbstractRootNode object) {
				return createAbstractRootNodeAdapter();
			}
			@Override
			public Adapter caseTreeRootNode(TreeRootNode object) {
				return createTreeRootNodeAdapter();
			}
			@Override
			public Adapter caseTreeFeatureNode(TreeFeatureNode object) {
				return createTreeFeatureNodeAdapter();
			}
			@Override
			public Adapter caseListRootNode(ListRootNode object) {
				return createListRootNodeAdapter();
			}
			@Override
			public Adapter caseListFeatureNode(ListFeatureNode object) {
				return createListFeatureNodeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureSpecifier(AbstractFeatureSpecifier object) {
				return createAbstractFeatureSpecifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.EMFEcoreFacade <em>EMF Ecore Facade</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.EMFEcoreFacade
	 * @generated
	 */
  public Adapter createEMFEcoreFacadeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Named
	 * @generated
	 */
  public Adapter createNamedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Described
	 * @generated
	 */
  public Adapter createDescribedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Timed
	 * @generated
	 */
  public Adapter createTimedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Startable <em>Startable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Startable
	 * @generated
	 */
	public Adapter createStartableAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.TimeSourcesList <em>Time Sources List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.TimeSourcesList
	 * @generated
	 */
	public Adapter createTimeSourcesListAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.TimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.TimeSource
	 * @generated
	 */
	public Adapter createTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.FixedTimeSource <em>Fixed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.FixedTimeSource
	 * @generated
	 */
	public Adapter createFixedTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.CurrentTimeSource <em>Current Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.CurrentTimeSource
	 * @generated
	 */
	public Adapter createCurrentTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.BrowseableTimeSource <em>Browseable Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.BrowseableTimeSource
	 * @generated
	 */
	public Adapter createBrowseableTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.SelectionBasedTimeSource <em>Selection Based Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.SelectionBasedTimeSource
	 * @generated
	 */
	public Adapter createSelectionBasedTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.CollectionTimedTimeSource <em>Collection Timed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.CollectionTimedTimeSource
	 * @generated
	 */
	public Adapter createCollectionTimedTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.Disposable <em>Disposable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.Disposable
	 * @generated
	 */
  public Adapter createDisposableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.AbstractFeatureNode <em>Abstract Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureNode
	 * @generated
	 */
  public Adapter createAbstractFeatureNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.FeatureNodeAdapter <em>Feature Node Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.FeatureNodeAdapter
	 * @generated
	 */
  public Adapter createFeatureNodeAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode <em>Abstract Feature List Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureListNode
	 * @generated
	 */
  public Adapter createAbstractFeatureListNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode <em>Abstract Feature Tree Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureTreeNode
	 * @generated
	 */
  public Adapter createAbstractFeatureTreeNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.AbstractRootNode <em>Abstract Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.AbstractRootNode
	 * @generated
	 */
  public Adapter createAbstractRootNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.TreeRootNode <em>Tree Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.TreeRootNode
	 * @generated
	 */
  public Adapter createTreeRootNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.TreeFeatureNode <em>Tree Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.TreeFeatureNode
	 * @generated
	 */
  public Adapter createTreeFeatureNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.ListRootNode <em>List Root Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.ListRootNode
	 * @generated
	 */
  public Adapter createListRootNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.ListFeatureNode <em>List Feature Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.ListFeatureNode
	 * @generated
	 */
  public Adapter createListFeatureNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.emf.AbstractFeatureSpecifier <em>Abstract Feature Specifier</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureSpecifier
	 * @generated
	 */
  public Adapter createAbstractFeatureSpecifierAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //Symphony__CommonEMFAdapterFactory
