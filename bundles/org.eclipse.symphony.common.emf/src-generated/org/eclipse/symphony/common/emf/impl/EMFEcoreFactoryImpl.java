/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;

import javax.measure.unit.Unit;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.symphony.common.emf.BrowseableTimeSource;
import org.eclipse.symphony.common.emf.CollectionTimedTimeSource;
import org.eclipse.symphony.common.emf.CurrentTimeSource;
import org.eclipse.symphony.common.emf.EClassFilter;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.common.emf.EMFEcoreFactory;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;
import org.eclipse.symphony.common.emf.FixedTimeSource;
import org.eclipse.symphony.common.emf.ListFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.SelectionBasedTimeSource;
import org.eclipse.symphony.common.emf.TimeDirection;
import org.eclipse.symphony.common.emf.TimeSourcesList;
import org.eclipse.symphony.common.emf.TreeFeatureNode;
import org.eclipse.symphony.common.emf.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreFactoryImpl extends EFactoryImpl implements EMFEcoreFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EMFEcoreFactory init()
  {
		try {
			EMFEcoreFactory theEMFEcoreFactory = (EMFEcoreFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcorePackage.eNS_URI);
			if (theEMFEcoreFactory != null) {
				return theEMFEcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreFactoryImpl()
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
			case EMFEcorePackage.EMF_ECORE_FACADE: return createEMFEcoreFacade();
			case EMFEcorePackage.TIME_SOURCES_LIST: return createTimeSourcesList();
			case EMFEcorePackage.FIXED_TIME_SOURCE: return createFixedTimeSource();
			case EMFEcorePackage.CURRENT_TIME_SOURCE: return createCurrentTimeSource();
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE: return createBrowseableTimeSource();
			case EMFEcorePackage.SELECTION_BASED_TIME_SOURCE: return createSelectionBasedTimeSource();
			case EMFEcorePackage.COLLECTION_TIMED_TIME_SOURCE: return createCollectionTimedTimeSource();
			case EMFEcorePackage.FEATURE_NODE_ADAPTER: return createFeatureNodeAdapter();
			case EMFEcorePackage.TREE_ROOT_NODE: return createTreeRootNode();
			case EMFEcorePackage.TREE_FEATURE_NODE: return createTreeFeatureNode();
			case EMFEcorePackage.LIST_ROOT_NODE: return createListRootNode();
			case EMFEcorePackage.LIST_FEATURE_NODE: return createListFeatureNode();
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
			case EMFEcorePackage.TIME_DIRECTION:
				return createTimeDirectionFromString(eDataType, initialValue);
			case EMFEcorePackage.RANGES:
				return createRangesFromString(eDataType, initialValue);
			case EMFEcorePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case EMFEcorePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case EMFEcorePackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case EMFEcorePackage.ECLASS_FILTER:
				return createEClassFilterFromString(eDataType, initialValue);
			case EMFEcorePackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case EMFEcorePackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case EMFEcorePackage.RESOURCE:
				return createResourceFromString(eDataType, initialValue);
			case EMFEcorePackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case EMFEcorePackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case EMFEcorePackage.ELIST:
				return createEListFromString(eDataType, initialValue);
			case EMFEcorePackage.URI:
				return createURIFromString(eDataType, initialValue);
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
			case EMFEcorePackage.TIME_DIRECTION:
				return convertTimeDirectionToString(eDataType, instanceValue);
			case EMFEcorePackage.RANGES:
				return convertRangesToString(eDataType, instanceValue);
			case EMFEcorePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case EMFEcorePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case EMFEcorePackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case EMFEcorePackage.ECLASS_FILTER:
				return convertEClassFilterToString(eDataType, instanceValue);
			case EMFEcorePackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case EMFEcorePackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case EMFEcorePackage.RESOURCE:
				return convertResourceToString(eDataType, instanceValue);
			case EMFEcorePackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case EMFEcorePackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case EMFEcorePackage.ELIST:
				return convertEListToString(eDataType, instanceValue);
			case EMFEcorePackage.URI:
				return convertURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreFacade createEMFEcoreFacade()
  {
		EMFEcoreFacadeImpl emfEcoreFacade = new EMFEcoreFacadeImpl();
		return emfEcoreFacade;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSourcesList createTimeSourcesList() {
		TimeSourcesListImpl timeSourcesList = new TimeSourcesListImpl();
		return timeSourcesList;
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
  public EMFEcorePackage getEMFEcorePackage()
  {
		return (EMFEcorePackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EMFEcorePackage getPackage()
  {
		return EMFEcorePackage.eINSTANCE;
	}

} //EMFEcoreFactoryImpl
