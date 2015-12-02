/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import javax.measure.unit.Unit;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.symphony.common.emf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonEMFFactoryImpl extends EFactoryImpl implements Symphony__CommonEMFFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__CommonEMFFactory init()
  {
		try {
			Symphony__CommonEMFFactory theSymphony__CommonEMFFactory = (Symphony__CommonEMFFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonEMFPackage.eNS_URI);
			if (theSymphony__CommonEMFFactory != null) {
				return theSymphony__CommonEMFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonEMFFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CommonEMFFactoryImpl()
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
			case Symphony__CommonEMFPackage.SYMPHONY_COMMON_EMF_FACADE: return createSymphony__CommonEMFFacade();
			case Symphony__CommonEMFPackage.SERVER: return createServer();
			case Symphony__CommonEMFPackage.STARTABLE: return createStartable();
			case Symphony__CommonEMFPackage.FIXED_TIME_SOURCE: return createFixedTimeSource();
			case Symphony__CommonEMFPackage.CURRENT_TIME_SOURCE: return createCurrentTimeSource();
			case Symphony__CommonEMFPackage.BROWSEABLE_TIME_SOURCE: return createBrowseableTimeSource();
			case Symphony__CommonEMFPackage.SELECTION_BASED_TIME_SOURCE: return createSelectionBasedTimeSource();
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE: return createCollectionTimedTimeSource();
			case Symphony__CommonEMFPackage.FEATURE_NODE_ADAPTER: return createFeatureNodeAdapter();
			case Symphony__CommonEMFPackage.TREE_ROOT_NODE: return createTreeRootNode();
			case Symphony__CommonEMFPackage.TREE_FEATURE_NODE: return createTreeFeatureNode();
			case Symphony__CommonEMFPackage.LIST_ROOT_NODE: return createListRootNode();
			case Symphony__CommonEMFPackage.LIST_FEATURE_NODE: return createListFeatureNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonEMFPackage.TIME_DIRECTION:
				return createTimeDirectionFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.RANGES:
				return createRangesFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.ECLASS_FILTER:
				return createEClassFilterFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.RESOURCE:
				return createResourceFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.ELIST:
				return createEListFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case Symphony__CommonEMFPackage.JOB:
				return createJobFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonEMFPackage.TIME_DIRECTION:
				return convertTimeDirectionToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.RANGES:
				return convertRangesToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.ECLASS_FILTER:
				return convertEClassFilterToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.RESOURCE:
				return convertResourceToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.ELIST:
				return convertEListToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case Symphony__CommonEMFPackage.JOB:
				return convertJobToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonEMFFacade createSymphony__CommonEMFFacade() {
		Symphony__CommonEMFFacadeImpl symphony__CommonEMFFacade = new Symphony__CommonEMFFacadeImpl();
		return symphony__CommonEMFFacade;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Startable createStartable() {
		StartableImpl startable = new StartableImpl();
		return startable;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedTimeSource createFixedTimeSource() {
		FixedTimeSourceImpl fixedTimeSource = new FixedTimeSourceImpl();
		return fixedTimeSource;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentTimeSource createCurrentTimeSource() {
		CurrentTimeSourceImpl currentTimeSource = new CurrentTimeSourceImpl();
		return currentTimeSource;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrowseableTimeSource createBrowseableTimeSource() {
		BrowseableTimeSourceImpl browseableTimeSource = new BrowseableTimeSourceImpl();
		return browseableTimeSource;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionBasedTimeSource createSelectionBasedTimeSource() {
		SelectionBasedTimeSourceImpl selectionBasedTimeSource = new SelectionBasedTimeSourceImpl();
		return selectionBasedTimeSource;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTimedTimeSource createCollectionTimedTimeSource() {
		CollectionTimedTimeSourceImpl collectionTimedTimeSource = new CollectionTimedTimeSourceImpl();
		return collectionTimedTimeSource;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FeatureNodeAdapter createFeatureNodeAdapter()
  {
		FeatureNodeAdapterImpl featureNodeAdapter = new FeatureNodeAdapterImpl();
		return featureNodeAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TreeRootNode createTreeRootNode()
  {
		TreeRootNodeImpl treeRootNode = new TreeRootNodeImpl();
		return treeRootNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TreeFeatureNode createTreeFeatureNode()
  {
		TreeFeatureNodeImpl treeFeatureNode = new TreeFeatureNodeImpl();
		return treeFeatureNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ListRootNode createListRootNode()
  {
		ListRootNodeImpl listRootNode = new ListRootNodeImpl();
		return listRootNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ListFeatureNode createListFeatureNode()
  {
		ListFeatureNodeImpl listFeatureNode = new ListFeatureNodeImpl();
		return listFeatureNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDirection createTimeDirectionFromString(EDataType eDataType, String initialValue) {
		TimeDirection result = TimeDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Ranges createRangesFromString(EDataType eDataType, String initialValue)
  {
		Ranges result = Ranges.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertRangesToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Exception createExceptionFromString(EDataType eDataType, String initialValue)
  {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertExceptionToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<?> createListFromString(EDataType eDataType, String initialValue)
  {
		return (List<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertListToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClassFilter createEClassFilterFromString(EDataType eDataType, String initialValue)
  {
		return (EClassFilter)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertEClassFilterToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Number createNumberFromString(EDataType eDataType, String initialValue)
  {
		return (Number)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertNumberToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IFile createIFileFromString(EDataType eDataType, String initialValue)
  {
		return (IFile)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertIFileToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource createResourceFromString(EDataType eDataType, String initialValue)
  {
		return (Resource)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertResourceToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  @SuppressWarnings("rawtypes")
  public Unit createUnitFromString(EDataType eDataType, String initialValue)
  {
	  try
	  {
		  Unit<?> unit = Unit.valueOf(initialValue);
		  return unit;
	  }
	  catch(Throwable t)
	  {
		  return null;
	  }    
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertUnitToString(EDataType eDataType, Object instanceValue)
  {
	  @SuppressWarnings("rawtypes")
	  Unit unit = (Unit) instanceValue;
	  return unit.toString();
  }

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> createEListFromString(EDataType eDataType, String initialValue) {
		return (EList<?>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job createJobFromString(EDataType eDataType, String initialValue) {
		return (Job)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonEMFPackage getSymphony__CommonEMFPackage() {
		return (Symphony__CommonEMFPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__CommonEMFPackage getPackage()
  {
		return Symphony__CommonEMFPackage.eINSTANCE;
	}

} //Symphony__CommonEMFFactoryImpl
