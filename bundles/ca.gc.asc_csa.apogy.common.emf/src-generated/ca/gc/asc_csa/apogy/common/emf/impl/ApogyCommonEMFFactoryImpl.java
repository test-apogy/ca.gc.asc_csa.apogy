package ca.gc.asc_csa.apogy.common.emf.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.emf.*;
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
import org.eclipse.emf.ecore.resource.ResourceSet;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource;
import ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource;
import ca.gc.asc_csa.apogy.common.emf.Duration;
import ca.gc.asc_csa.apogy.common.emf.EClassFilter;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter;
import ca.gc.asc_csa.apogy.common.emf.FixedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ListFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.common.emf.Ranges;
import ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.Server;
import ca.gc.asc_csa.apogy.common.emf.Startable;
import ca.gc.asc_csa.apogy.common.emf.TimeDirection;
import ca.gc.asc_csa.apogy.common.emf.TreeFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEMFFactoryImpl extends EFactoryImpl implements ApogyCommonEMFFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCommonEMFFactory init()
  {
		try {
			ApogyCommonEMFFactory theApogyCommonEMFFactory = (ApogyCommonEMFFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonEMFPackage.eNS_URI);
			if (theApogyCommonEMFFactory != null) {
				return theApogyCommonEMFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonEMFFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCommonEMFFactoryImpl()
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
			case ApogyCommonEMFPackage.APOGY_COMMON_EMF_FACADE: return createApogyCommonEMFFacade();
			case ApogyCommonEMFPackage.EOBJECT_REFERENCE: return createEObjectReference();
			case ApogyCommonEMFPackage.SERVER: return createServer();
			case ApogyCommonEMFPackage.STARTABLE: return createStartable();
			case ApogyCommonEMFPackage.DURATION: return createDuration();
			case ApogyCommonEMFPackage.FIXED_TIME_SOURCE: return createFixedTimeSource();
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE: return createCurrentTimeSource();
			case ApogyCommonEMFPackage.BROWSEABLE_TIME_SOURCE: return createBrowseableTimeSource();
			case ApogyCommonEMFPackage.SELECTION_BASED_TIME_SOURCE: return createSelectionBasedTimeSource();
			case ApogyCommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE: return createCollectionTimedTimeSource();
			case ApogyCommonEMFPackage.FEATURE_NODE_ADAPTER: return createFeatureNodeAdapter();
			case ApogyCommonEMFPackage.TREE_ROOT_NODE: return createTreeRootNode();
			case ApogyCommonEMFPackage.TREE_FEATURE_NODE: return createTreeFeatureNode();
			case ApogyCommonEMFPackage.LIST_ROOT_NODE: return createListRootNode();
			case ApogyCommonEMFPackage.LIST_FEATURE_NODE: return createListFeatureNode();
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
			case ApogyCommonEMFPackage.TIME_DIRECTION:
				return createTimeDirectionFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.RANGES:
				return createRangesFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.ECLASS_FILTER:
				return createEClassFilterFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.RESOURCE:
				return createResourceFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.ELIST:
				return createEListFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.URI:
				return createURIFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.JOB:
				return createJobFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.RESOURCE_SET:
				return createResourceSetFromString(eDataType, initialValue);
			case ApogyCommonEMFPackage.LIST_NAMED:
				return createListNamedFromString(eDataType, initialValue);
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
			case ApogyCommonEMFPackage.TIME_DIRECTION:
				return convertTimeDirectionToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.RANGES:
				return convertRangesToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.ECLASS_FILTER:
				return convertEClassFilterToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.RESOURCE:
				return convertResourceToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.ELIST:
				return convertEListToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.JOB:
				return convertJobToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.RESOURCE_SET:
				return convertResourceSetToString(eDataType, instanceValue);
			case ApogyCommonEMFPackage.LIST_NAMED:
				return convertListNamedToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFFacade createApogyCommonEMFFacade() {
		ApogyCommonEMFFacadeImpl apogyCommonEMFFacade = new ApogyCommonEMFFacadeImpl();
		return apogyCommonEMFFacade;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectReference createEObjectReference() {
		EObjectReferenceImpl eObjectReference = new EObjectReferenceImpl();
		return eObjectReference;
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
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
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
	public ResourceSet createResourceSetFromString(EDataType eDataType, String initialValue) {
		return (ResourceSet)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<? extends Named> createListNamedFromString(EDataType eDataType, String initialValue) {
		return (List<? extends Named>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListNamedToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFPackage getApogyCommonEMFPackage() {
		return (ApogyCommonEMFPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCommonEMFPackage getPackage()
  {
		return ApogyCommonEMFPackage.eINSTANCE;
	}

} //ApogyCommonEMFFactoryImpl
