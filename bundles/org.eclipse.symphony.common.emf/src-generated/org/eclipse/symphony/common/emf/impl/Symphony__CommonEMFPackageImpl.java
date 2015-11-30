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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.symphony.common.emf.EClassFilter;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFactory;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;
import org.eclipse.symphony.common.emf.FixedTimeSource;
import org.eclipse.symphony.common.emf.ListFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.SelectionBasedTimeSource;
import org.eclipse.symphony.common.emf.Server;
import org.eclipse.symphony.common.emf.Startable;
import org.eclipse.symphony.common.emf.TimeDirection;
import org.eclipse.symphony.common.emf.TimeSource;
import org.eclipse.symphony.common.emf.TimeSourcesList;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.emf.TreeFeatureNode;
import org.eclipse.symphony.common.emf.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonEMFPackageImpl extends EPackageImpl implements Symphony__CommonEMFPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CommonEMFFacadeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass namedEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass describedEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass timedEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startableEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSourcesListEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSourceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedTimeSourceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentTimeSourceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass browseableTimeSourceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionBasedTimeSourceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTimedTimeSourceEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass disposableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractFeatureNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass featureNodeAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractFeatureListNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractFeatureTreeNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractRootNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass treeRootNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass treeFeatureNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass listRootNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass listFeatureNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractFeatureSpecifierEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeDirectionEEnum = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum rangesEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType exceptionEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType listEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType sortedSetEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType eClassFilterEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType numberEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType iFileEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType resourceEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType unitEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eListEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jobEDataType = null;

		/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__CommonEMFPackageImpl()
  {
		super(eNS_URI, Symphony__CommonEMFFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Symphony__CommonEMFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__CommonEMFPackage init()
  {
		if (isInited) return (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonEMFPackageImpl theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonEMFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonEMFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonEMFPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonEMFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonEMFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonEMFPackage.eNS_URI, theSymphony__CommonEMFPackage);
		return theSymphony__CommonEMFPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CommonEMFFacade() {
		return symphony__CommonEMFFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAllAvailableEClasses() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAllSubEClasses__EClass() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__FilterEClasses__List_EClassFilter() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__FilterEClasses__List_List() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetEClass__String() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__SortAlphabetically__List() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAllAvailableEOperations__EClass() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__SortEOperationsAlphabetically__List() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetDocumentation__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetEngineeringUnits__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetValueUpdateRate__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(11);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetWarningOCLExpression__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(12);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAlarmOCLExpression__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(13);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(14);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetWarningMinValue__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(15);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetWarningMaxValue__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(16);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAlarmMinValue__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(17);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAlarmMaxValue__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(18);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetOutOfRangeMinValue__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(19);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(20);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetRange__ETypedElement_Object() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(21);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetFullDescription__ETypedElement() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(22);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAncestriesString__AbstractFeatureNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(23);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetFeatureRoot__AbstractFeatureNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(24);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetAncestries__AbstractFeatureNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(25);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetDescendants__AbstractFeatureNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(26);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(27);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__Resolve__EObject_AbstractFeatureNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(28);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(29);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__IsResolved__EObject_AbstractFeatureNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(30);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetLeaf__ListRootNode() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(31);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetFile__Resource() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(32);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetContent__URI() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(33);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__SortTimed__Collection() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(34);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetTimeSpan__Collection() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(35);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonEMFFacade__GetID__EObject() {
		return symphony__CommonEMFFacadeEClass.getEOperations().get(36);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNamed()
  {
		return namedEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNamed_Name()
  {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDescribed()
  {
		return describedEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDescribed_Description()
  {
		return (EAttribute)describedEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTimed()
  {
		return timedEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTimed_Time()
  {
		return (EAttribute)timedEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServer_ServerJob() {
		return (EAttribute)serverEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartable() {
		return startableEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartable_Started() {
		return (EAttribute)startableEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSourcesList() {
		return timeSourcesListEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSourcesList_TimeSources() {
		return (EReference)timeSourcesListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSource() {
		return timeSourceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSource_Offset() {
		return (EAttribute)timeSourceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedTimeSource() {
		return fixedTimeSourceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentTimeSource() {
		return currentTimeSourceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentTimeSource_UpdatePeriod() {
		return (EAttribute)currentTimeSourceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentTimeSource_Paused() {
		return (EAttribute)currentTimeSourceEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrentTimeSource__Pause() {
		return currentTimeSourceEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCurrentTimeSource__Resume() {
		return currentTimeSourceEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrowseableTimeSource() {
		return browseableTimeSourceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseableTimeSource_StartTime() {
		return (EAttribute)browseableTimeSourceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseableTimeSource_UpdatePeriod() {
		return (EAttribute)browseableTimeSourceEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseableTimeSource_TimeAcceration() {
		return (EAttribute)browseableTimeSourceEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrowseableTimeSource_TimeDirection() {
		return (EAttribute)browseableTimeSourceEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBrowseableTimeSource__PlayForward() {
		return browseableTimeSourceEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBrowseableTimeSource__PlayReverse() {
		return browseableTimeSourceEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBrowseableTimeSource__Pause() {
		return browseableTimeSourceEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBrowseableTimeSource__Reset() {
		return browseableTimeSourceEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionBasedTimeSource() {
		return selectionBasedTimeSourceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSelectionBasedTimeSource__SetSelection__Timed() {
		return selectionBasedTimeSourceEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionTimedTimeSource() {
		return collectionTimedTimeSourceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionTimedTimeSource_LoopEnable() {
		return (EAttribute)collectionTimedTimeSourceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTimedTimeSource_TimedsList() {
		return (EReference)collectionTimedTimeSourceEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionTimedTimeSource_CurrentTimedElement() {
		return (EReference)collectionTimedTimeSourceEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionTimedTimeSource_EarliestDate() {
		return (EAttribute)collectionTimedTimeSourceEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionTimedTimeSource_LatestDate() {
		return (EAttribute)collectionTimedTimeSourceEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionTimedTimeSource__JumpToNext() {
		return collectionTimedTimeSourceEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollectionTimedTimeSource__JumpToPrevious() {
		return collectionTimedTimeSourceEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDisposable()
  {
		return disposableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getDisposable__Dispose()
  {
		return disposableEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractFeatureNode()
  {
		return abstractFeatureNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFeatureNodeAdapter()
  {
		return featureNodeAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFeatureNodeAdapter_SourceObject()
  {
		return (EReference)featureNodeAdapterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getFeatureNodeAdapter_FeatureNode()
  {
		return (EReference)featureNodeAdapterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFeatureNodeAdapter_CurrentValue()
  {
		return (EAttribute)featureNodeAdapterEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getFeatureNodeAdapter_Resolved()
  {
		return (EAttribute)featureNodeAdapterEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractFeatureListNode()
  {
		return abstractFeatureListNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractFeatureListNode_Parent()
  {
		return (EReference)abstractFeatureListNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractFeatureListNode_Child()
  {
		return (EReference)abstractFeatureListNodeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractFeatureTreeNode()
  {
		return abstractFeatureTreeNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractFeatureTreeNode_Parent()
  {
		return (EReference)abstractFeatureTreeNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractFeatureTreeNode_Children()
  {
		return (EReference)abstractFeatureTreeNodeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractRootNode()
  {
		return abstractRootNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractRootNode_SourceClass()
  {
		return (EReference)abstractRootNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTreeRootNode()
  {
		return treeRootNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTreeFeatureNode()
  {
		return treeFeatureNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getListRootNode()
  {
		return listRootNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getListFeatureNode()
  {
		return listFeatureNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractFeatureSpecifier()
  {
		return abstractFeatureSpecifierEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractFeatureSpecifier_StructuralFeature()
  {
		return (EReference)abstractFeatureSpecifierEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractFeatureSpecifier_MultiValued()
  {
		return (EAttribute)abstractFeatureSpecifierEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractFeatureSpecifier_Index()
  {
		return (EAttribute)abstractFeatureSpecifierEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeDirection() {
		return timeDirectionEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getRanges()
  {
		return rangesEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getException()
  {
		return exceptionEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getList()
  {
		return listEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedSet()
  {
		return sortedSetEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getEClassFilter()
  {
		return eClassFilterEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getNumber()
  {
		return numberEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getIFile()
  {
		return iFileEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getResource()
  {
		return resourceEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getUnit()
  {
		return unitEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEList() {
		return eListEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJob() {
		return jobEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonEMFFactory getSymphony__CommonEMFFactory() {
		return (Symphony__CommonEMFFactory)getEFactoryInstance();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		symphony__CommonEMFFacadeEClass = createEClass(SYMPHONY_COMMON_EMF_FACADE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_ECLASSES);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ALL_SUB_ECLASSES__ECLASS);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_ECLASSFILTER);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_LIST);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ECLASS__STRING);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___SORT_ALPHABETICALLY__LIST);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_EOPERATIONS__ECLASS);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___SORT_EOPERATIONS_ALPHABETICALLY__LIST);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_DOCUMENTATION__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS_AS_STRING__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_VALUE_UPDATE_RATE__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_OCL_EXPRESSION__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_OCL_EXPRESSION__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_OCL_EXPRESSION__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_MIN_VALUE__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_WARNING_MAX_VALUE__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_MIN_VALUE__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ALARM_MAX_VALUE__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MIN_VALUE__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MAX_VALUE__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_RANGE__ETYPEDELEMENT_OBJECT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_FULL_DESCRIPTION__ETYPEDELEMENT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ANCESTRIES_STRING__ABSTRACTFEATURENODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_FEATURE_ROOT__ABSTRACTFEATURENODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ANCESTRIES__ABSTRACTFEATURENODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_DESCENDANTS__ABSTRACTFEATURENODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_CHILD_ESTRUCTURAL_FEATURES__ABSTRACTFEATURENODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___RESOLVE__EOBJECT_ABSTRACTFEATURENODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___SET_VALUE__EOBJECT_ABSTRACTFEATURENODE_OBJECT);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___IS_RESOLVED__EOBJECT_ABSTRACTFEATURENODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_LEAF__LISTROOTNODE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_FILE__RESOURCE);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_CONTENT__URI);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___SORT_TIMED__COLLECTION);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_TIME_SPAN__COLLECTION);
		createEOperation(symphony__CommonEMFFacadeEClass, SYMPHONY_COMMON_EMF_FACADE___GET_ID__EOBJECT);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		describedEClass = createEClass(DESCRIBED);
		createEAttribute(describedEClass, DESCRIBED__DESCRIPTION);

		timedEClass = createEClass(TIMED);
		createEAttribute(timedEClass, TIMED__TIME);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__SERVER_JOB);

		startableEClass = createEClass(STARTABLE);
		createEAttribute(startableEClass, STARTABLE__STARTED);

		timeSourcesListEClass = createEClass(TIME_SOURCES_LIST);
		createEReference(timeSourcesListEClass, TIME_SOURCES_LIST__TIME_SOURCES);

		timeSourceEClass = createEClass(TIME_SOURCE);
		createEAttribute(timeSourceEClass, TIME_SOURCE__OFFSET);

		fixedTimeSourceEClass = createEClass(FIXED_TIME_SOURCE);

		currentTimeSourceEClass = createEClass(CURRENT_TIME_SOURCE);
		createEAttribute(currentTimeSourceEClass, CURRENT_TIME_SOURCE__UPDATE_PERIOD);
		createEAttribute(currentTimeSourceEClass, CURRENT_TIME_SOURCE__PAUSED);
		createEOperation(currentTimeSourceEClass, CURRENT_TIME_SOURCE___PAUSE);
		createEOperation(currentTimeSourceEClass, CURRENT_TIME_SOURCE___RESUME);

		browseableTimeSourceEClass = createEClass(BROWSEABLE_TIME_SOURCE);
		createEAttribute(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE__START_TIME);
		createEAttribute(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD);
		createEAttribute(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE__TIME_ACCERATION);
		createEAttribute(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE__TIME_DIRECTION);
		createEOperation(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE___PLAY_FORWARD);
		createEOperation(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE___PLAY_REVERSE);
		createEOperation(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE___PAUSE);
		createEOperation(browseableTimeSourceEClass, BROWSEABLE_TIME_SOURCE___RESET);

		selectionBasedTimeSourceEClass = createEClass(SELECTION_BASED_TIME_SOURCE);
		createEOperation(selectionBasedTimeSourceEClass, SELECTION_BASED_TIME_SOURCE___SET_SELECTION__TIMED);

		collectionTimedTimeSourceEClass = createEClass(COLLECTION_TIMED_TIME_SOURCE);
		createEAttribute(collectionTimedTimeSourceEClass, COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE);
		createEReference(collectionTimedTimeSourceEClass, COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST);
		createEReference(collectionTimedTimeSourceEClass, COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT);
		createEAttribute(collectionTimedTimeSourceEClass, COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE);
		createEAttribute(collectionTimedTimeSourceEClass, COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE);
		createEOperation(collectionTimedTimeSourceEClass, COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT);
		createEOperation(collectionTimedTimeSourceEClass, COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS);

		disposableEClass = createEClass(DISPOSABLE);
		createEOperation(disposableEClass, DISPOSABLE___DISPOSE);

		featureNodeAdapterEClass = createEClass(FEATURE_NODE_ADAPTER);
		createEReference(featureNodeAdapterEClass, FEATURE_NODE_ADAPTER__SOURCE_OBJECT);
		createEReference(featureNodeAdapterEClass, FEATURE_NODE_ADAPTER__FEATURE_NODE);
		createEAttribute(featureNodeAdapterEClass, FEATURE_NODE_ADAPTER__CURRENT_VALUE);
		createEAttribute(featureNodeAdapterEClass, FEATURE_NODE_ADAPTER__RESOLVED);

		abstractFeatureNodeEClass = createEClass(ABSTRACT_FEATURE_NODE);

		abstractFeatureListNodeEClass = createEClass(ABSTRACT_FEATURE_LIST_NODE);
		createEReference(abstractFeatureListNodeEClass, ABSTRACT_FEATURE_LIST_NODE__PARENT);
		createEReference(abstractFeatureListNodeEClass, ABSTRACT_FEATURE_LIST_NODE__CHILD);

		abstractFeatureTreeNodeEClass = createEClass(ABSTRACT_FEATURE_TREE_NODE);
		createEReference(abstractFeatureTreeNodeEClass, ABSTRACT_FEATURE_TREE_NODE__PARENT);
		createEReference(abstractFeatureTreeNodeEClass, ABSTRACT_FEATURE_TREE_NODE__CHILDREN);

		abstractRootNodeEClass = createEClass(ABSTRACT_ROOT_NODE);
		createEReference(abstractRootNodeEClass, ABSTRACT_ROOT_NODE__SOURCE_CLASS);

		treeRootNodeEClass = createEClass(TREE_ROOT_NODE);

		treeFeatureNodeEClass = createEClass(TREE_FEATURE_NODE);

		listRootNodeEClass = createEClass(LIST_ROOT_NODE);

		listFeatureNodeEClass = createEClass(LIST_FEATURE_NODE);

		abstractFeatureSpecifierEClass = createEClass(ABSTRACT_FEATURE_SPECIFIER);
		createEReference(abstractFeatureSpecifierEClass, ABSTRACT_FEATURE_SPECIFIER__STRUCTURAL_FEATURE);
		createEAttribute(abstractFeatureSpecifierEClass, ABSTRACT_FEATURE_SPECIFIER__MULTI_VALUED);
		createEAttribute(abstractFeatureSpecifierEClass, ABSTRACT_FEATURE_SPECIFIER__INDEX);

		// Create enums
		timeDirectionEEnum = createEEnum(TIME_DIRECTION);
		rangesEEnum = createEEnum(RANGES);

		// Create data types
		exceptionEDataType = createEDataType(EXCEPTION);
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
		eClassFilterEDataType = createEDataType(ECLASS_FILTER);
		numberEDataType = createEDataType(NUMBER);
		iFileEDataType = createEDataType(IFILE);
		resourceEDataType = createEDataType(RESOURCE);
		unitEDataType = createEDataType(UNIT);
		collectionEDataType = createEDataType(COLLECTION);
		eListEDataType = createEDataType(ELIST);
		uriEDataType = createEDataType(URI);
		jobEDataType = createEDataType(JOB);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");
		addETypeParameter(collectionEDataType, "T");
		addETypeParameter(eListEDataType, "EObject");

		// Set bounds for type parameters

		// Add supertypes to classes
		serverEClass.getESuperTypes().add(this.getStartable());
		timeSourceEClass.getESuperTypes().add(this.getNamed());
		timeSourceEClass.getESuperTypes().add(this.getDescribed());
		timeSourceEClass.getESuperTypes().add(this.getTimed());
		timeSourceEClass.getESuperTypes().add(this.getDisposable());
		fixedTimeSourceEClass.getESuperTypes().add(this.getTimeSource());
		currentTimeSourceEClass.getESuperTypes().add(this.getTimeSource());
		browseableTimeSourceEClass.getESuperTypes().add(this.getTimeSource());
		selectionBasedTimeSourceEClass.getESuperTypes().add(this.getTimeSource());
		collectionTimedTimeSourceEClass.getESuperTypes().add(this.getBrowseableTimeSource());
		abstractFeatureListNodeEClass.getESuperTypes().add(this.getAbstractFeatureNode());
		abstractFeatureTreeNodeEClass.getESuperTypes().add(this.getAbstractFeatureNode());
		treeRootNodeEClass.getESuperTypes().add(this.getAbstractFeatureTreeNode());
		treeRootNodeEClass.getESuperTypes().add(this.getAbstractRootNode());
		treeFeatureNodeEClass.getESuperTypes().add(this.getAbstractFeatureTreeNode());
		treeFeatureNodeEClass.getESuperTypes().add(this.getAbstractFeatureSpecifier());
		listRootNodeEClass.getESuperTypes().add(this.getAbstractFeatureListNode());
		listRootNodeEClass.getESuperTypes().add(this.getAbstractRootNode());
		listFeatureNodeEClass.getESuperTypes().add(this.getAbstractFeatureListNode());
		listFeatureNodeEClass.getESuperTypes().add(this.getAbstractFeatureSpecifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__CommonEMFFacadeEClass, Symphony__CommonEMFFacade.class, "Symphony__CommonEMFFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CommonEMFFacade__GetAllAvailableEClasses(), null, "getAllAvailableEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__GetAllSubEClasses__EClass(), null, "getAllSubEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "superClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__FilterEClasses__List_EClassFilter(), null, "filterEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClassFilter(), "filter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__FilterEClasses__List_List(), null, "filterEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getEClassFilter());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "filters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__GetEClass__String(), theEcorePackage.getEClass(), "getEClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "str", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__SortAlphabetically__List(), null, "sortAlphabetically", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__GetAllAvailableEOperations__EClass(), null, "getAllAvailableEOperations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "eClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEOperation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__SortEOperationsAlphabetically__List(), null, "sortEOperationsAlphabetically", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEOperation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eOperations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEcorePackage.getEOperation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__GetDocumentation__ETypedElement(), theEcorePackage.getEString(), "getDocumentation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement(), theEcorePackage.getEString(), "getEngineeringUnitsAsString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetEngineeringUnits__ETypedElement(), this.getUnit(), "getEngineeringUnits", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetValueUpdateRate__ETypedElement(), theEcorePackage.getEDoubleObject(), "getValueUpdateRate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetWarningOCLExpression__ETypedElement(), theEcorePackage.getEString(), "getWarningOCLExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetAlarmOCLExpression__ETypedElement(), theEcorePackage.getEString(), "getAlarmOCLExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement(), theEcorePackage.getEString(), "getOutOfRangeOCLExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetWarningMinValue__ETypedElement(), this.getNumber(), "getWarningMinValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetWarningMaxValue__ETypedElement(), this.getNumber(), "getWarningMaxValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetAlarmMinValue__ETypedElement(), this.getNumber(), "getAlarmMinValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetAlarmMaxValue__ETypedElement(), this.getNumber(), "getAlarmMaxValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetOutOfRangeMinValue__ETypedElement(), this.getNumber(), "getOutOfRangeMinValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement(), this.getNumber(), "getOutOfRangeMaxValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetRange__ETypedElement_Object(), this.getRanges(), "getRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetFullDescription__ETypedElement(), theEcorePackage.getEString(), "getFullDescription", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetAncestriesString__AbstractFeatureNode(), theEcorePackage.getEString(), "getAncestriesString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetFeatureRoot__AbstractFeatureNode(), this.getAbstractRootNode(), "getFeatureRoot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetAncestries__AbstractFeatureNode(), null, "getAncestries", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractFeatureNode());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__GetDescendants__AbstractFeatureNode(), null, "getDescendants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractFeatureNode());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode(), null, "getChildEStructuralFeatures", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEStructuralFeature());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__Resolve__EObject_AbstractFeatureNode(), theEcorePackage.getEJavaObject(), "resolve", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "sourceObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object(), null, "setValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "sourceObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__IsResolved__EObject_AbstractFeatureNode(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "sourceObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetLeaf__ListRootNode(), this.getAbstractFeatureListNode(), "getLeaf", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getListRootNode(), "listRootNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetFile__Resource(), this.getIFile(), "getFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResource(), "resource", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetContent__URI(), null, "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getURI(), "uri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEList());
		g2 = createEGenericType(theEcorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__SortTimed__Collection(), null, "sortTimed", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getTimed());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timedCollection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getTimed());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonEMFFacade__GetTimeSpan__Collection(), theEcorePackage.getEDouble(), "getTimeSpan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getTimed());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timedCollection", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonEMFFacade__GetID__EObject(), theEcorePackage.getEString(), "getID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedEClass, Described.class, "Described", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribed_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Described.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedEClass, Timed.class, "Timed", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimed_Time(), theEcorePackage.getEDate(), "time", null, 0, 1, Timed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_ServerJob(), this.getJob(), "serverJob", null, 0, 1, Server.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startableEClass, Startable.class, "Startable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartable_Started(), theEcorePackage.getEBoolean(), "started", "false", 0, 1, Startable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSourcesListEClass, TimeSourcesList.class, "TimeSourcesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSourcesList_TimeSources(), this.getTimeSource(), null, "timeSources", null, 0, -1, TimeSourcesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSourceEClass, TimeSource.class, "TimeSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSource_Offset(), theEcorePackage.getEInt(), "offset", "0", 0, 1, TimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedTimeSourceEClass, FixedTimeSource.class, "FixedTimeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(currentTimeSourceEClass, CurrentTimeSource.class, "CurrentTimeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrentTimeSource_UpdatePeriod(), theEcorePackage.getEInt(), "updatePeriod", "1000", 0, 1, CurrentTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrentTimeSource_Paused(), theEcorePackage.getEBoolean(), "paused", "false", 0, 1, CurrentTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCurrentTimeSource__Pause(), null, "pause", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCurrentTimeSource__Resume(), null, "resume", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(browseableTimeSourceEClass, BrowseableTimeSource.class, "BrowseableTimeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBrowseableTimeSource_StartTime(), theEcorePackage.getEDate(), "startTime", null, 0, 1, BrowseableTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrowseableTimeSource_UpdatePeriod(), theEcorePackage.getEInt(), "updatePeriod", "1000", 0, 1, BrowseableTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrowseableTimeSource_TimeAcceration(), theEcorePackage.getEFloat(), "timeAcceration", "10.0", 0, 1, BrowseableTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrowseableTimeSource_TimeDirection(), this.getTimeDirection(), "timeDirection", null, 0, 1, BrowseableTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBrowseableTimeSource__PlayForward(), null, "playForward", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBrowseableTimeSource__PlayReverse(), null, "playReverse", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBrowseableTimeSource__Pause(), null, "pause", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBrowseableTimeSource__Reset(), null, "reset", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(selectionBasedTimeSourceEClass, SelectionBasedTimeSource.class, "SelectionBasedTimeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSelectionBasedTimeSource__SetSelection__Timed(), null, "setSelection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimed(), "timedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(collectionTimedTimeSourceEClass, CollectionTimedTimeSource.class, "CollectionTimedTimeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectionTimedTimeSource_LoopEnable(), theEcorePackage.getEBoolean(), "loopEnable", "false", 0, 1, CollectionTimedTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionTimedTimeSource_TimedsList(), this.getTimed(), null, "timedsList", null, 0, -1, CollectionTimedTimeSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionTimedTimeSource_CurrentTimedElement(), this.getTimed(), null, "currentTimedElement", null, 0, 1, CollectionTimedTimeSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionTimedTimeSource_EarliestDate(), theEcorePackage.getEDate(), "earliestDate", null, 0, 1, CollectionTimedTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectionTimedTimeSource_LatestDate(), theEcorePackage.getEDate(), "latestDate", null, 0, 1, CollectionTimedTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCollectionTimedTimeSource__JumpToNext(), null, "jumpToNext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCollectionTimedTimeSource__JumpToPrevious(), null, "jumpToPrevious", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(disposableEClass, Disposable.class, "Disposable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDisposable__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(featureNodeAdapterEClass, FeatureNodeAdapter.class, "FeatureNodeAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureNodeAdapter_SourceObject(), theEcorePackage.getEObject(), null, "sourceObject", null, 0, 1, FeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureNodeAdapter_FeatureNode(), this.getAbstractFeatureNode(), null, "featureNode", null, 0, 1, FeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureNodeAdapter_CurrentValue(), theEcorePackage.getEJavaObject(), "currentValue", null, 0, 1, FeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureNodeAdapter_Resolved(), theEcorePackage.getEBoolean(), "resolved", "false", 0, 1, FeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureNodeEClass, AbstractFeatureNode.class, "AbstractFeatureNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractFeatureListNodeEClass, AbstractFeatureListNode.class, "AbstractFeatureListNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFeatureListNode_Parent(), this.getAbstractFeatureListNode(), this.getAbstractFeatureListNode_Child(), "parent", null, 0, 1, AbstractFeatureListNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFeatureListNode_Child(), this.getAbstractFeatureListNode(), this.getAbstractFeatureListNode_Parent(), "child", null, 0, 1, AbstractFeatureListNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFeatureTreeNodeEClass, AbstractFeatureTreeNode.class, "AbstractFeatureTreeNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFeatureTreeNode_Parent(), this.getAbstractFeatureTreeNode(), this.getAbstractFeatureTreeNode_Children(), "parent", null, 0, 1, AbstractFeatureTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFeatureTreeNode_Children(), this.getAbstractFeatureTreeNode(), this.getAbstractFeatureTreeNode_Parent(), "children", null, 0, -1, AbstractFeatureTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRootNodeEClass, AbstractRootNode.class, "AbstractRootNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRootNode_SourceClass(), theEcorePackage.getEClass(), null, "sourceClass", null, 1, 1, AbstractRootNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeRootNodeEClass, TreeRootNode.class, "TreeRootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(treeFeatureNodeEClass, TreeFeatureNode.class, "TreeFeatureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listRootNodeEClass, ListRootNode.class, "ListRootNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listFeatureNodeEClass, ListFeatureNode.class, "ListFeatureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractFeatureSpecifierEClass, AbstractFeatureSpecifier.class, "AbstractFeatureSpecifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFeatureSpecifier_StructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "structuralFeature", null, 1, 1, AbstractFeatureSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeatureSpecifier_MultiValued(), theEcorePackage.getEBoolean(), "multiValued", "false", 0, 1, AbstractFeatureSpecifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeatureSpecifier_Index(), theEcorePackage.getEInt(), "index", "0", 0, 1, AbstractFeatureSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeDirectionEEnum, TimeDirection.class, "TimeDirection");
		addEEnumLiteral(timeDirectionEEnum, TimeDirection.FORWARD);
		addEEnumLiteral(timeDirectionEEnum, TimeDirection.REVERSE);

		initEEnum(rangesEEnum, Ranges.class, "Ranges");
		addEEnumLiteral(rangesEEnum, Ranges.UNKNOWN);
		addEEnumLiteral(rangesEEnum, Ranges.NOMINAL);
		addEEnumLiteral(rangesEEnum, Ranges.WARNING);
		addEEnumLiteral(rangesEEnum, Ranges.ALARM);
		addEEnumLiteral(rangesEEnum, Ranges.OUT_OF_RANGE);

		// Initialize data types
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eClassFilterEDataType, EClassFilter.class, "EClassFilter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberEDataType, Number.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iFileEDataType, IFile.class, "IFile", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceEDataType, Resource.class, "Resource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitEDataType, Unit.class, "Unit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "javax.measure.unit.Unit<?>");
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eListEDataType, EList.class, "EList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, org.eclipse.emf.common.util.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jobEDataType, Job.class, "Job", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonEMFPackageImpl
