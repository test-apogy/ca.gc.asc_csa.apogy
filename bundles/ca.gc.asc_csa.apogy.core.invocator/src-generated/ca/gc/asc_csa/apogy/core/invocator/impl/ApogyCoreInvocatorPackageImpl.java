/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;


import org.eclipse.emf.common.notify.Notification;
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
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.AbstractChannel;
import ca.gc.asc_csa.apogy.core.invocator.AbstractDisplay;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer;
import ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;
import ca.gc.asc_csa.apogy.core.invocator.AbstractType;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue;
import ca.gc.asc_csa.apogy.core.invocator.AttributeValue;
import ca.gc.asc_csa.apogy.core.invocator.BasicContext;
import ca.gc.asc_csa.apogy.core.invocator.ChannelsList;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.DisplaysList;
import ca.gc.asc_csa.apogy.core.invocator.DisplaysListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.EClassArgument;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer;
import ca.gc.asc_csa.apogy.core.invocator.IVariableListener;
import ca.gc.asc_csa.apogy.core.invocator.InitializationData;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.LocalTypesList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;
import ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList;
import ca.gc.asc_csa.apogy.core.invocator.ResultsList;
import ca.gc.asc_csa.apogy.core.invocator.ToolsList;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement;
import ca.gc.asc_csa.apogy.core.invocator.TypesList;
import ca.gc.asc_csa.apogy.core.invocator.Value;
import ca.gc.asc_csa.apogy.core.invocator.ValuesList;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList;
import ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.Watch;
import ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter;
import ca.gc.asc_csa.apogy.core.invocator.WatchesList;
import ca.gc.asc_csa.apogy.core.invocator.WatchesListsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreInvocatorPackageImpl extends EPackageImpl implements ApogyCoreInvocatorPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogy__CoreInvocatorFacadeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass invocatorSessionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass environmentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dataProductsListsContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dataProductsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass toolsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractToolsListContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typesListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass localTypesListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass registeredTypesListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeApiAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeMemberEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeMemberReferenceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeMemberReferenceListElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeMemberReferenceTreeElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variablesListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass contextsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass contextEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass basicContextEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableImplementationsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractInitializationDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass initializationDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractTypeImplementationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableImplementationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeMemberImplementationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valuesListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass programsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass programEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationCallContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationCallsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableFeatureReferenceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationCallEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass argumentsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass argumentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eDataTypeArgumentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eEnumArgumentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eClassArgumentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass resultsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationCallResultsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass recordingResultsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractResultEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractResultValueEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationCallResultEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass exceptionContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass attributeResultValueEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass attributeValueEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass referenceResultValueEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass watchesListsContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass watchesListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass watchEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass watchFeatureNodeAdapterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass displaysListsContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass displaysListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractDisplayEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordingToolsContainerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelsListEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractChannelEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractRecorderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractPlayerEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallResultsListTimeSourceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableListenerEventTypeEEnum = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType throwableEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType notificationEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType typeMemberImplementationsEListEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeMembersArrayEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iVariableListenerEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyCoreInvocatorPackageImpl()
  {
		super(eNS_URI, ApogyCoreInvocatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreInvocatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyCoreInvocatorPackage init()
  {
		if (isInited) return (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreInvocatorPackageImpl theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreInvocatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreInvocatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreInvocatorPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreInvocatorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreInvocatorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreInvocatorPackage.eNS_URI, theApogyCoreInvocatorPackage);
		return theApogyCoreInvocatorPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreInvocatorFacade() {
		return apogy__CoreInvocatorFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApogyCoreInvocatorFacade_InitVariableInstancesDate() {
		return (EAttribute)apogy__CoreInvocatorFacadeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApogyCoreInvocatorFacade_ActiveInvocatorSession() {
		return (EReference)apogy__CoreInvocatorFacadeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__Exec__OperationCall() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__Exec__OperationCall_boolean() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__Exec__OperationCallsList() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__CreateAbstractResultValue__Object() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__ResolveWatch__AbstractFeatureNode() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__ResolveWatch__TypeMemberReferenceTreeElement() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetValue__AbstractFeatureNode() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetInstance__Variable() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetInstanceClass__Variable() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetTypeApiAdapter__VariableFeatureReference() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetInstance__VariableFeatureReference() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetTypeMemberInstance__VariableFeatureReference() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(11);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetEMFFeatureValue__VariableFeatureReference() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(12);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetInstanceClass__VariableFeatureReference() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(13);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetInstance__TypeMemberReferenceTreeElement() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(14);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__OperationCall() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(15);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__Variable_AbstractType() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(16);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__Variable() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(17);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetVariableByName__InvocatorSession_String() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(18);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__CreateTypeMemberReferences__TypeMember() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(19);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetTypeImplementation__Environment_String() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(20);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetFullyQualifiedName__TypeMemberReferenceTreeElement() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(21);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetFullyQualifiedName__AbstractFeatureNode() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(22);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__CreateTypeMemberImplementations__Type() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(23);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__InitVariableInstances__Environment() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(24);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__DisposeVariableInstances__Environment() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(25);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetOperationCallContainer__TypeMemberReferenceListElement() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(26);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__ApplyInitializationData__Environment() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(27);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__CollectInitializationData__Environment() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(28);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__ApplyInitializationData__Variable() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(29);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__CollectInitializationData__Variable() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(30);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__LoadRegisteredTypes__InvocatorSession() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(31);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__GetAllTypes__Environment() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(32);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__AddVariableListener__IVariableListener() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(33);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__RemoveVariableListener__IVariableListener() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(34);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreInvocatorFacade__NotifyVariableListeners__Variable_VariableListenerEventType() {
		return apogy__CoreInvocatorFacadeEClass.getEOperations().get(35);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInvocatorSession()
  {
		return invocatorSessionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInvocatorSession_Environment()
  {
		return (EReference)invocatorSessionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInvocatorSession_ProgramsList()
  {
		return (EReference)invocatorSessionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInvocatorSession_DataProductsListContainer()
  {
		return (EReference)invocatorSessionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getInvocatorSession_ToolsList()
  {
		return (EReference)invocatorSessionEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnvironment()
  {
		return environmentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnvironment_InvocatorSession()
  {
		return (EReference)environmentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnvironment_TypesList()
  {
		return (EReference)environmentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnvironment_VariablesList()
  {
		return (EReference)environmentEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnvironment_ContextsList()
  {
		return (EReference)environmentEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEnvironment_ActiveContext()
  {
		return (EReference)environmentEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDataProductsListsContainer()
  {
		return dataProductsListsContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataProductsListsContainer_InvocatorSession()
  {
		return (EReference)dataProductsListsContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataProductsListsContainer_DataProductsList()
  {
		return (EReference)dataProductsListsContainerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDataProductsList()
  {
		return dataProductsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataProductsList_DataProductsListsContainer()
  {
		return (EReference)dataProductsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataProductsList_OperationCallResultsList()
  {
		return (EReference)dataProductsListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDataProductsList_RecordingResultsList()
  {
		return (EReference)dataProductsListEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataProductsList_InvocatorSession() {
		return (EReference)dataProductsListEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getToolsList()
  {
		return toolsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getToolsList_InvocatorSession()
  {
		return (EReference)toolsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getToolsList_ToolsListContainers()
  {
		return (EReference)toolsListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractToolsListContainer()
  {
		return abstractToolsListContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractToolsListContainer_ToolsList()
  {
		return (EReference)abstractToolsListContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypesList()
  {
		return typesListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypesList_LocalTypes()
  {
		return (EReference)typesListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypesList_RegisteredTypes()
  {
		return (EReference)typesListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLocalTypesList()
  {
		return localTypesListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLocalTypesList_Types()
  {
		return (EReference)localTypesListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRegisteredTypesList()
  {
		return registeredTypesListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRegisteredTypesList_Types()
  {
		return (EReference)registeredTypesListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractType()
  {
		return abstractTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getType()
  {
		return typeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getType_Members()
  {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getType_InterfaceClass()
  {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getType_TypeApiAdapterClass()
  {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeApiAdapter()
  {
		return typeApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeApiAdapter_Environment()
  {
		return (EReference)typeApiAdapterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeApiAdapter_Instance()
  {
		return (EReference)typeApiAdapterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeApiAdapter_ElementType()
  {
		return (EReference)typeApiAdapterEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeApiAdapter__Init__Environment_Type_EObject()
  {
		return typeApiAdapterEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeApiAdapter__Apply__AbstractInitializationData()
  {
		return typeApiAdapterEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeApiAdapter__CreateInitializationData()
  {
		return typeApiAdapterEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeApiAdapter__Collect__AbstractInitializationData()
  {
		return typeApiAdapterEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeApiAdapter__CreateResult__OperationCall()
  {
		return typeApiAdapterEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeApiAdapter__CreateResult__OperationCall_long_Object_Exception()
  {
		return typeApiAdapterEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypeApiAdapter__Invoke__EObject_OperationCall_boolean() {
		return typeApiAdapterEClass.getEOperations().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTypeApiAdapter__Dispose()
  {
		return typeApiAdapterEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeMember()
  {
		return typeMemberEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMember_MemberType()
  {
		return (EReference)typeMemberEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMember_TypeFeatureRootNode()
  {
		return (EReference)typeMemberEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeMemberReference()
  {
		return typeMemberReferenceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReference_TypeMember()
  {
		return (EReference)typeMemberReferenceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeMemberReferenceListElement()
  {
		return typeMemberReferenceListElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceListElement_Child()
  {
		return (EReference)typeMemberReferenceListElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceListElement_Parent()
  {
		return (EReference)typeMemberReferenceListElementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeMemberReferenceListElement_Root()
  {
		return (EAttribute)typeMemberReferenceListElementEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceListElement_RootElement()
  {
		return (EReference)typeMemberReferenceListElementEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceListElement_LeafElement()
  {
		return (EReference)typeMemberReferenceListElementEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeMemberReferenceListElement_Leaf()
  {
		return (EAttribute)typeMemberReferenceListElementEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeMemberReferenceListElement_SubSegmentsCount() {
		return (EAttribute)typeMemberReferenceListElementEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeMemberReferenceTreeElement()
  {
		return typeMemberReferenceTreeElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceTreeElement_Child()
  {
		return (EReference)typeMemberReferenceTreeElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceTreeElement_Parent()
  {
		return (EReference)typeMemberReferenceTreeElementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceTreeElement_FeatureRootNode()
  {
		return (EReference)typeMemberReferenceTreeElementEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeMemberReferenceTreeElement_Root()
  {
		return (EAttribute)typeMemberReferenceTreeElementEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberReferenceTreeElement_RootElement()
  {
		return (EReference)typeMemberReferenceTreeElementEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTypeMemberReferenceTreeElement_Leaf()
  {
		return (EAttribute)typeMemberReferenceTreeElementEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariablesList()
  {
		return variablesListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariablesList_Environment()
  {
		return (EReference)variablesListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariablesList_Variables()
  {
		return (EReference)variablesListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariable()
  {
		return variableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariable_VariablesList()
  {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariable_VariableType()
  {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariable_Environment()
  {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getContextsList()
  {
		return contextsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContextsList_Environment()
  {
		return (EReference)contextsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContextsList_Contexts()
  {
		return (EReference)contextsListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getContext()
  {
		return contextEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContext_ContextsList()
  {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContext_VariableImplementationsList()
  {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContext_Environment()
  {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getContext_DataProductsList()
  {
		return (EReference)contextEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getContext_InstancesCreationDate()
  {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getContext_InstancesDisposalDate()
  {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBasicContext()
  {
		return basicContextEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariableImplementationsList()
  {
		return variableImplementationsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableImplementationsList_VariableImplementations()
  {
		return (EReference)variableImplementationsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getVariableImplementationsList__GetVariableImplementation__Variable()
  {
		return variableImplementationsListEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getVariableImplementationsList__GetVariableImplementation__String()
  {
		return variableImplementationsListEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractInitializationData()
  {
		return abstractInitializationDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInitializationData()
  {
		return initializationDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractTypeImplementation()
  {
		return abstractTypeImplementationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTypeImplementation_TypeMemberImplementations()
  {
		return (EReference)abstractTypeImplementationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTypeImplementation_ImplementationClass()
  {
		return (EReference)abstractTypeImplementationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTypeImplementation_AbstractInitializationData()
  {
		return (EReference)abstractTypeImplementationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTypeImplementation_Instance()
  {
		return (EReference)abstractTypeImplementationEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTypeImplementation_AdapterInstance()
  {
		return (EReference)abstractTypeImplementationEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractTypeImplementation_HandlingType()
  {
		return (EReference)abstractTypeImplementationEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractTypeImplementation__GetTypeMemberImplementation__String()
  {
		return abstractTypeImplementationEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractTypeImplementation__GetTypeMemberImplementation__TypeMember()
  {
		return abstractTypeImplementationEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariableImplementation()
  {
		return variableImplementationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableImplementation_VariableImplementationsList()
  {
		return (EReference)variableImplementationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableImplementation_Variable()
  {
		return (EReference)variableImplementationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeMemberImplementation()
  {
		return typeMemberImplementationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTypeMemberImplementation_TypeMember()
  {
		return (EReference)typeMemberImplementationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValuesList()
  {
		return valuesListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getValuesList_Values()
  {
		return (EReference)valuesListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValue()
  {
		return valueEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getValue_Value()
  {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProgramsList()
  {
		return programsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProgramsList_InvocatorSession()
  {
		return (EReference)programsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProgramsList_Programs()
  {
		return (EReference)programsListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getProgram()
  {
		return programEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProgram_ProgramsList()
  {
		return (EReference)programEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getProgram_InvocatorSession()
  {
		return (EReference)programEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgram_ValuesList() {
		return (EReference)programEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationCallContainer()
  {
		return operationCallContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCallContainer_OperationCalls()
  {
		return (EReference)operationCallContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getOperationCallContainer__GetInvocatorSession()
  {
		return operationCallContainerEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationCallsList()
  {
		return operationCallsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariableFeatureReference()
  {
		return variableFeatureReferenceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableFeatureReference_Variable()
  {
		return (EReference)variableFeatureReferenceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableFeatureReference_TypeMemberReferenceListElement()
  {
		return (EReference)variableFeatureReferenceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableFeatureReference_FeatureRoot()
  {
		return (EReference)variableFeatureReferenceEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationCall()
  {
		return operationCallEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCall_EOperation()
  {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCall_ArgumentsList()
  {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCall_OperationCallContainer()
  {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCall_InvocatorSession()
  {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCall_Environment()
  {
		return (EReference)operationCallEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getArgumentsList()
  {
		return argumentsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgumentsList_OperationCall()
  {
		return (EReference)argumentsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgumentsList_Arguments()
  {
		return (EReference)argumentsListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getArgumentsList__GetArgumentValues()
  {
		return argumentsListEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getArgument()
  {
		return argumentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgument_ArgumentsList()
  {
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getArgument_OperationCall()
  {
		return (EReference)argumentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getArgument__GetEParameter()
  {
		return argumentEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getArgument__GetParameterValue()
  {
		return argumentEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEDataTypeArgument()
  {
		return eDataTypeArgumentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEDataTypeArgument_Value()
  {
		return (EAttribute)eDataTypeArgumentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEEnumArgument()
  {
		return eEnumArgumentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEEnumArgument_EEnumLiteral()
  {
		return (EReference)eEnumArgumentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEEnumArgument_EEnum()
  {
		return (EReference)eEnumArgumentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEClassArgument()
  {
		return eClassArgumentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEClassArgument_Value()
  {
		return (EReference)eClassArgumentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getResultsList()
  {
		return resultsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getResultsList_Results()
  {
		return (EReference)resultsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResultsList__GetInvocatorSession() {
		return resultsListEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationCallResultsList()
  {
		return operationCallResultsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCallResultsList_DataProductsList() {
		return (EReference)operationCallResultsListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCallResultsList_InvocatorSession() {
		return (EReference)operationCallResultsListEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRecordingResultsList()
  {
		return recordingResultsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordingResultsList_DataProductsList() {
		return (EReference)recordingResultsListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordingResultsList_InvocatorSession() {
		return (EReference)recordingResultsListEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractResult()
  {
		return abstractResultEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractResult_ResultsList() {
		return (EReference)abstractResultEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractResult_InvocatorSession() {
		return (EReference)abstractResultEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractResult_Context()
  {
		return (EReference)abstractResultEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractResult_ResultValue()
  {
		return (EReference)abstractResultEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractResultValue()
  {
		return abstractResultValueEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractResultValue_Result()
  {
		return (EReference)abstractResultValueEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationCallResult()
  {
		return operationCallResultEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCallResult_OperationCall()
  {
		return (EReference)operationCallResultEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCallResult_ExceptionContainer()
  {
		return (EReference)operationCallResultEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getExceptionContainer()
  {
		return exceptionContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getExceptionContainer_Exception()
  {
		return (EAttribute)exceptionContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAttributeResultValue()
  {
		return attributeResultValueEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAttributeResultValue_Value()
  {
		return (EReference)attributeResultValueEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAttributeValue()
  {
		return attributeValueEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAttributeValue_Object()
  {
		return (EAttribute)attributeValueEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getReferenceResultValue()
  {
		return referenceResultValueEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getReferenceResultValue_Value()
  {
		return (EReference)referenceResultValueEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWatchesListsContainer()
  {
		return watchesListsContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatchesListsContainer_Watches()
  {
		return (EReference)watchesListsContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWatchesList()
  {
		return watchesListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatchesList_WatchesListsContainer()
  {
		return (EReference)watchesListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatchesList_Watches()
  {
		return (EReference)watchesListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWatch()
  {
		return watchEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatch_WatchesList()
  {
		return (EReference)watchEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatch_Variable()
  {
		return (EReference)watchEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatch_TypeMemberReferenceTreeElement()
  {
		return (EReference)watchEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatch_TreeRootNode()
  {
		return (EReference)watchEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWatchFeatureNodeAdapter()
  {
		return watchFeatureNodeAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatchFeatureNodeAdapter_SourceObject()
  {
		return (EReference)watchFeatureNodeAdapterEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWatchFeatureNodeAdapter_FeatureNode()
  {
		return (EReference)watchFeatureNodeAdapterEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWatchFeatureNodeAdapter_CurrentValue()
  {
		return (EAttribute)watchFeatureNodeAdapterEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getWatchFeatureNodeAdapter_Resolved()
  {
		return (EAttribute)watchFeatureNodeAdapterEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDisplaysListsContainer()
  {
		return displaysListsContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDisplaysListsContainer_Displays()
  {
		return (EReference)displaysListsContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDisplaysList()
  {
		return displaysListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDisplaysList_DisplaysListsContainer()
  {
		return (EReference)displaysListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDisplaysList_Displays()
  {
		return (EReference)displaysListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractDisplay()
  {
		return abstractDisplayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractDisplay_DisplaysList()
  {
		return (EReference)abstractDisplayEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordingToolsContainer() {
		return recordingToolsContainerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordingToolsContainer_Recorder() {
		return (EReference)recordingToolsContainerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordingToolsContainer_Player() {
		return (EReference)recordingToolsContainerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordingToolsContainer_ChannelsLists() {
		return (EReference)recordingToolsContainerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelsList() {
		return channelsListEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelsList_Channels() {
		return (EReference)channelsListEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelsList_RecordingToolsContainer() {
		return (EReference)channelsListEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractChannel() {
		return abstractChannelEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractChannel_ChannelsList() {
		return (EReference)abstractChannelEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractRecorder()
  {
		return abstractRecorderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRecorder_RecordingToolsContainer() {
		return (EReference)abstractRecorderEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractPlayer()
  {
		return abstractPlayerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPlayer_RecordingToolsContainer() {
		return (EReference)abstractPlayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationCallResultsListTimeSource() {
		return operationCallResultsListTimeSourceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationCallResultsListTimeSource_OpsCallList() {
		return (EReference)operationCallResultsListTimeSourceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableListenerEventType() {
		return variableListenerEventTypeEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getThrowable()
  {
		return throwableEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getNotification()
  {
		return notificationEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getTypeMemberImplementationsEList()
  {
		return typeMemberImplementationsEListEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeMembersArray() {
		return typeMembersArrayEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIVariableListener() {
		return iVariableListenerEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorFactory getApogyCoreInvocatorFactory() {
		return (ApogyCoreInvocatorFactory)getEFactoryInstance();
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
		apogy__CoreInvocatorFacadeEClass = createEClass(APOGY_CORE_INVOCATOR_FACADE);
		createEAttribute(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE);
		createEReference(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL_BOOLEAN);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALLSLIST);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___CREATE_ABSTRACT_RESULT_VALUE__OBJECT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___RESOLVE_WATCH__ABSTRACTFEATURENODE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___RESOLVE_WATCH__TYPEMEMBERREFERENCETREEELEMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_VALUE__ABSTRACTFEATURENODE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_API_ADAPTER__VARIABLEFEATUREREFERENCE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLEFEATUREREFERENCE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_MEMBER_INSTANCE__VARIABLEFEATUREREFERENCE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_EMF_FEATURE_VALUE__VARIABLEFEATUREREFERENCE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLEFEATUREREFERENCE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__TYPEMEMBERREFERENCETREEELEMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__OPERATIONCALL);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE_ABSTRACTTYPE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_VARIABLE_BY_NAME__INVOCATORSESSION_STRING);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_REFERENCES__TYPEMEMBER);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__ENVIRONMENT_STRING);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__TYPEMEMBERREFERENCETREEELEMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__ABSTRACTFEATURENODE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_IMPLEMENTATIONS__TYPE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___INIT_VARIABLE_INSTANCES__ENVIRONMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___DISPOSE_VARIABLE_INSTANCES__ENVIRONMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_OPERATION_CALL_CONTAINER__TYPEMEMBERREFERENCELISTELEMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__ENVIRONMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__ENVIRONMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__VARIABLE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__VARIABLE);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___LOAD_REGISTERED_TYPES__INVOCATORSESSION);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___GET_ALL_TYPES__ENVIRONMENT);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___ADD_VARIABLE_LISTENER__IVARIABLELISTENER);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___REMOVE_VARIABLE_LISTENER__IVARIABLELISTENER);
		createEOperation(apogy__CoreInvocatorFacadeEClass, APOGY_CORE_INVOCATOR_FACADE___NOTIFY_VARIABLE_LISTENERS__VARIABLE_VARIABLELISTENEREVENTTYPE);

		invocatorSessionEClass = createEClass(INVOCATOR_SESSION);
		createEReference(invocatorSessionEClass, INVOCATOR_SESSION__ENVIRONMENT);
		createEReference(invocatorSessionEClass, INVOCATOR_SESSION__PROGRAMS_LIST);
		createEReference(invocatorSessionEClass, INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER);
		createEReference(invocatorSessionEClass, INVOCATOR_SESSION__TOOLS_LIST);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__INVOCATOR_SESSION);
		createEReference(environmentEClass, ENVIRONMENT__TYPES_LIST);
		createEReference(environmentEClass, ENVIRONMENT__VARIABLES_LIST);
		createEReference(environmentEClass, ENVIRONMENT__CONTEXTS_LIST);
		createEReference(environmentEClass, ENVIRONMENT__ACTIVE_CONTEXT);

		dataProductsListsContainerEClass = createEClass(DATA_PRODUCTS_LISTS_CONTAINER);
		createEReference(dataProductsListsContainerEClass, DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION);
		createEReference(dataProductsListsContainerEClass, DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST);

		dataProductsListEClass = createEClass(DATA_PRODUCTS_LIST);
		createEReference(dataProductsListEClass, DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER);
		createEReference(dataProductsListEClass, DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST);
		createEReference(dataProductsListEClass, DATA_PRODUCTS_LIST__RECORDING_RESULTS_LIST);
		createEReference(dataProductsListEClass, DATA_PRODUCTS_LIST__INVOCATOR_SESSION);

		toolsListEClass = createEClass(TOOLS_LIST);
		createEReference(toolsListEClass, TOOLS_LIST__INVOCATOR_SESSION);
		createEReference(toolsListEClass, TOOLS_LIST__TOOLS_LIST_CONTAINERS);

		abstractToolsListContainerEClass = createEClass(ABSTRACT_TOOLS_LIST_CONTAINER);
		createEReference(abstractToolsListContainerEClass, ABSTRACT_TOOLS_LIST_CONTAINER__TOOLS_LIST);

		typesListEClass = createEClass(TYPES_LIST);
		createEReference(typesListEClass, TYPES_LIST__LOCAL_TYPES);
		createEReference(typesListEClass, TYPES_LIST__REGISTERED_TYPES);

		localTypesListEClass = createEClass(LOCAL_TYPES_LIST);
		createEReference(localTypesListEClass, LOCAL_TYPES_LIST__TYPES);

		registeredTypesListEClass = createEClass(REGISTERED_TYPES_LIST);
		createEReference(registeredTypesListEClass, REGISTERED_TYPES_LIST__TYPES);

		abstractTypeEClass = createEClass(ABSTRACT_TYPE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__MEMBERS);
		createEReference(typeEClass, TYPE__INTERFACE_CLASS);
		createEReference(typeEClass, TYPE__TYPE_API_ADAPTER_CLASS);

		typeApiAdapterEClass = createEClass(TYPE_API_ADAPTER);
		createEReference(typeApiAdapterEClass, TYPE_API_ADAPTER__ENVIRONMENT);
		createEReference(typeApiAdapterEClass, TYPE_API_ADAPTER__INSTANCE);
		createEReference(typeApiAdapterEClass, TYPE_API_ADAPTER__ELEMENT_TYPE);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN);
		createEOperation(typeApiAdapterEClass, TYPE_API_ADAPTER___DISPOSE);

		typeMemberEClass = createEClass(TYPE_MEMBER);
		createEReference(typeMemberEClass, TYPE_MEMBER__MEMBER_TYPE);
		createEReference(typeMemberEClass, TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE);

		typeMemberReferenceEClass = createEClass(TYPE_MEMBER_REFERENCE);
		createEReference(typeMemberReferenceEClass, TYPE_MEMBER_REFERENCE__TYPE_MEMBER);

		typeMemberReferenceListElementEClass = createEClass(TYPE_MEMBER_REFERENCE_LIST_ELEMENT);
		createEReference(typeMemberReferenceListElementEClass, TYPE_MEMBER_REFERENCE_LIST_ELEMENT__CHILD);
		createEReference(typeMemberReferenceListElementEClass, TYPE_MEMBER_REFERENCE_LIST_ELEMENT__PARENT);
		createEAttribute(typeMemberReferenceListElementEClass, TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT);
		createEReference(typeMemberReferenceListElementEClass, TYPE_MEMBER_REFERENCE_LIST_ELEMENT__ROOT_ELEMENT);
		createEReference(typeMemberReferenceListElementEClass, TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF_ELEMENT);
		createEAttribute(typeMemberReferenceListElementEClass, TYPE_MEMBER_REFERENCE_LIST_ELEMENT__LEAF);
		createEAttribute(typeMemberReferenceListElementEClass, TYPE_MEMBER_REFERENCE_LIST_ELEMENT__SUB_SEGMENTS_COUNT);

		typeMemberReferenceTreeElementEClass = createEClass(TYPE_MEMBER_REFERENCE_TREE_ELEMENT);
		createEReference(typeMemberReferenceTreeElementEClass, TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD);
		createEReference(typeMemberReferenceTreeElementEClass, TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT);
		createEReference(typeMemberReferenceTreeElementEClass, TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE);
		createEAttribute(typeMemberReferenceTreeElementEClass, TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT);
		createEReference(typeMemberReferenceTreeElementEClass, TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT_ELEMENT);
		createEAttribute(typeMemberReferenceTreeElementEClass, TYPE_MEMBER_REFERENCE_TREE_ELEMENT__LEAF);

		variablesListEClass = createEClass(VARIABLES_LIST);
		createEReference(variablesListEClass, VARIABLES_LIST__ENVIRONMENT);
		createEReference(variablesListEClass, VARIABLES_LIST__VARIABLES);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__VARIABLES_LIST);
		createEReference(variableEClass, VARIABLE__VARIABLE_TYPE);
		createEReference(variableEClass, VARIABLE__ENVIRONMENT);

		contextsListEClass = createEClass(CONTEXTS_LIST);
		createEReference(contextsListEClass, CONTEXTS_LIST__ENVIRONMENT);
		createEReference(contextsListEClass, CONTEXTS_LIST__CONTEXTS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CONTEXTS_LIST);
		createEReference(contextEClass, CONTEXT__VARIABLE_IMPLEMENTATIONS_LIST);
		createEReference(contextEClass, CONTEXT__ENVIRONMENT);
		createEReference(contextEClass, CONTEXT__DATA_PRODUCTS_LIST);
		createEAttribute(contextEClass, CONTEXT__INSTANCES_CREATION_DATE);
		createEAttribute(contextEClass, CONTEXT__INSTANCES_DISPOSAL_DATE);

		basicContextEClass = createEClass(BASIC_CONTEXT);

		variableImplementationsListEClass = createEClass(VARIABLE_IMPLEMENTATIONS_LIST);
		createEReference(variableImplementationsListEClass, VARIABLE_IMPLEMENTATIONS_LIST__VARIABLE_IMPLEMENTATIONS);
		createEOperation(variableImplementationsListEClass, VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__VARIABLE);
		createEOperation(variableImplementationsListEClass, VARIABLE_IMPLEMENTATIONS_LIST___GET_VARIABLE_IMPLEMENTATION__STRING);

		abstractInitializationDataEClass = createEClass(ABSTRACT_INITIALIZATION_DATA);

		initializationDataEClass = createEClass(INITIALIZATION_DATA);

		abstractTypeImplementationEClass = createEClass(ABSTRACT_TYPE_IMPLEMENTATION);
		createEReference(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION__TYPE_MEMBER_IMPLEMENTATIONS);
		createEReference(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS);
		createEReference(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA);
		createEReference(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION__INSTANCE);
		createEReference(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION__ADAPTER_INSTANCE);
		createEReference(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION__HANDLING_TYPE);
		createEOperation(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__STRING);
		createEOperation(abstractTypeImplementationEClass, ABSTRACT_TYPE_IMPLEMENTATION___GET_TYPE_MEMBER_IMPLEMENTATION__TYPEMEMBER);

		variableImplementationEClass = createEClass(VARIABLE_IMPLEMENTATION);
		createEReference(variableImplementationEClass, VARIABLE_IMPLEMENTATION__VARIABLE_IMPLEMENTATIONS_LIST);
		createEReference(variableImplementationEClass, VARIABLE_IMPLEMENTATION__VARIABLE);

		typeMemberImplementationEClass = createEClass(TYPE_MEMBER_IMPLEMENTATION);
		createEReference(typeMemberImplementationEClass, TYPE_MEMBER_IMPLEMENTATION__TYPE_MEMBER);

		valuesListEClass = createEClass(VALUES_LIST);
		createEReference(valuesListEClass, VALUES_LIST__VALUES);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__VALUE);

		programsListEClass = createEClass(PROGRAMS_LIST);
		createEReference(programsListEClass, PROGRAMS_LIST__INVOCATOR_SESSION);
		createEReference(programsListEClass, PROGRAMS_LIST__PROGRAMS);

		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__PROGRAMS_LIST);
		createEReference(programEClass, PROGRAM__INVOCATOR_SESSION);
		createEReference(programEClass, PROGRAM__VALUES_LIST);

		operationCallContainerEClass = createEClass(OPERATION_CALL_CONTAINER);
		createEReference(operationCallContainerEClass, OPERATION_CALL_CONTAINER__OPERATION_CALLS);
		createEOperation(operationCallContainerEClass, OPERATION_CALL_CONTAINER___GET_INVOCATOR_SESSION);

		operationCallsListEClass = createEClass(OPERATION_CALLS_LIST);

		variableFeatureReferenceEClass = createEClass(VARIABLE_FEATURE_REFERENCE);
		createEReference(variableFeatureReferenceEClass, VARIABLE_FEATURE_REFERENCE__VARIABLE);
		createEReference(variableFeatureReferenceEClass, VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);
		createEReference(variableFeatureReferenceEClass, VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);

		operationCallEClass = createEClass(OPERATION_CALL);
		createEReference(operationCallEClass, OPERATION_CALL__EOPERATION);
		createEReference(operationCallEClass, OPERATION_CALL__ARGUMENTS_LIST);
		createEReference(operationCallEClass, OPERATION_CALL__OPERATION_CALL_CONTAINER);
		createEReference(operationCallEClass, OPERATION_CALL__INVOCATOR_SESSION);
		createEReference(operationCallEClass, OPERATION_CALL__ENVIRONMENT);

		argumentsListEClass = createEClass(ARGUMENTS_LIST);
		createEReference(argumentsListEClass, ARGUMENTS_LIST__OPERATION_CALL);
		createEReference(argumentsListEClass, ARGUMENTS_LIST__ARGUMENTS);
		createEOperation(argumentsListEClass, ARGUMENTS_LIST___GET_ARGUMENT_VALUES);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__ARGUMENTS_LIST);
		createEReference(argumentEClass, ARGUMENT__OPERATION_CALL);
		createEOperation(argumentEClass, ARGUMENT___GET_EPARAMETER);
		createEOperation(argumentEClass, ARGUMENT___GET_PARAMETER_VALUE);

		eDataTypeArgumentEClass = createEClass(EDATA_TYPE_ARGUMENT);
		createEAttribute(eDataTypeArgumentEClass, EDATA_TYPE_ARGUMENT__VALUE);

		eEnumArgumentEClass = createEClass(EENUM_ARGUMENT);
		createEReference(eEnumArgumentEClass, EENUM_ARGUMENT__EENUM_LITERAL);
		createEReference(eEnumArgumentEClass, EENUM_ARGUMENT__EENUM);

		eClassArgumentEClass = createEClass(ECLASS_ARGUMENT);
		createEReference(eClassArgumentEClass, ECLASS_ARGUMENT__VALUE);

		resultsListEClass = createEClass(RESULTS_LIST);
		createEReference(resultsListEClass, RESULTS_LIST__RESULTS);
		createEOperation(resultsListEClass, RESULTS_LIST___GET_INVOCATOR_SESSION);

		operationCallResultsListEClass = createEClass(OPERATION_CALL_RESULTS_LIST);
		createEReference(operationCallResultsListEClass, OPERATION_CALL_RESULTS_LIST__DATA_PRODUCTS_LIST);
		createEReference(operationCallResultsListEClass, OPERATION_CALL_RESULTS_LIST__INVOCATOR_SESSION);

		recordingResultsListEClass = createEClass(RECORDING_RESULTS_LIST);
		createEReference(recordingResultsListEClass, RECORDING_RESULTS_LIST__DATA_PRODUCTS_LIST);
		createEReference(recordingResultsListEClass, RECORDING_RESULTS_LIST__INVOCATOR_SESSION);

		abstractResultEClass = createEClass(ABSTRACT_RESULT);
		createEReference(abstractResultEClass, ABSTRACT_RESULT__RESULTS_LIST);
		createEReference(abstractResultEClass, ABSTRACT_RESULT__INVOCATOR_SESSION);
		createEReference(abstractResultEClass, ABSTRACT_RESULT__CONTEXT);
		createEReference(abstractResultEClass, ABSTRACT_RESULT__RESULT_VALUE);

		abstractResultValueEClass = createEClass(ABSTRACT_RESULT_VALUE);
		createEReference(abstractResultValueEClass, ABSTRACT_RESULT_VALUE__RESULT);

		operationCallResultEClass = createEClass(OPERATION_CALL_RESULT);
		createEReference(operationCallResultEClass, OPERATION_CALL_RESULT__OPERATION_CALL);
		createEReference(operationCallResultEClass, OPERATION_CALL_RESULT__EXCEPTION_CONTAINER);

		exceptionContainerEClass = createEClass(EXCEPTION_CONTAINER);
		createEAttribute(exceptionContainerEClass, EXCEPTION_CONTAINER__EXCEPTION);

		attributeResultValueEClass = createEClass(ATTRIBUTE_RESULT_VALUE);
		createEReference(attributeResultValueEClass, ATTRIBUTE_RESULT_VALUE__VALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEAttribute(attributeValueEClass, ATTRIBUTE_VALUE__OBJECT);

		referenceResultValueEClass = createEClass(REFERENCE_RESULT_VALUE);
		createEReference(referenceResultValueEClass, REFERENCE_RESULT_VALUE__VALUE);

		watchesListsContainerEClass = createEClass(WATCHES_LISTS_CONTAINER);
		createEReference(watchesListsContainerEClass, WATCHES_LISTS_CONTAINER__WATCHES);

		watchesListEClass = createEClass(WATCHES_LIST);
		createEReference(watchesListEClass, WATCHES_LIST__WATCHES_LISTS_CONTAINER);
		createEReference(watchesListEClass, WATCHES_LIST__WATCHES);

		watchEClass = createEClass(WATCH);
		createEReference(watchEClass, WATCH__WATCHES_LIST);
		createEReference(watchEClass, WATCH__VARIABLE);
		createEReference(watchEClass, WATCH__TYPE_MEMBER_REFERENCE_TREE_ELEMENT);
		createEReference(watchEClass, WATCH__TREE_ROOT_NODE);

		watchFeatureNodeAdapterEClass = createEClass(WATCH_FEATURE_NODE_ADAPTER);
		createEReference(watchFeatureNodeAdapterEClass, WATCH_FEATURE_NODE_ADAPTER__SOURCE_OBJECT);
		createEReference(watchFeatureNodeAdapterEClass, WATCH_FEATURE_NODE_ADAPTER__FEATURE_NODE);
		createEAttribute(watchFeatureNodeAdapterEClass, WATCH_FEATURE_NODE_ADAPTER__CURRENT_VALUE);
		createEAttribute(watchFeatureNodeAdapterEClass, WATCH_FEATURE_NODE_ADAPTER__RESOLVED);

		displaysListsContainerEClass = createEClass(DISPLAYS_LISTS_CONTAINER);
		createEReference(displaysListsContainerEClass, DISPLAYS_LISTS_CONTAINER__DISPLAYS);

		displaysListEClass = createEClass(DISPLAYS_LIST);
		createEReference(displaysListEClass, DISPLAYS_LIST__DISPLAYS_LISTS_CONTAINER);
		createEReference(displaysListEClass, DISPLAYS_LIST__DISPLAYS);

		abstractDisplayEClass = createEClass(ABSTRACT_DISPLAY);
		createEReference(abstractDisplayEClass, ABSTRACT_DISPLAY__DISPLAYS_LIST);

		recordingToolsContainerEClass = createEClass(RECORDING_TOOLS_CONTAINER);
		createEReference(recordingToolsContainerEClass, RECORDING_TOOLS_CONTAINER__RECORDER);
		createEReference(recordingToolsContainerEClass, RECORDING_TOOLS_CONTAINER__PLAYER);
		createEReference(recordingToolsContainerEClass, RECORDING_TOOLS_CONTAINER__CHANNELS_LISTS);

		channelsListEClass = createEClass(CHANNELS_LIST);
		createEReference(channelsListEClass, CHANNELS_LIST__CHANNELS);
		createEReference(channelsListEClass, CHANNELS_LIST__RECORDING_TOOLS_CONTAINER);

		abstractChannelEClass = createEClass(ABSTRACT_CHANNEL);
		createEReference(abstractChannelEClass, ABSTRACT_CHANNEL__CHANNELS_LIST);

		abstractRecorderEClass = createEClass(ABSTRACT_RECORDER);
		createEReference(abstractRecorderEClass, ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER);

		abstractPlayerEClass = createEClass(ABSTRACT_PLAYER);
		createEReference(abstractPlayerEClass, ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER);

		operationCallResultsListTimeSourceEClass = createEClass(OPERATION_CALL_RESULTS_LIST_TIME_SOURCE);
		createEReference(operationCallResultsListTimeSourceEClass, OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST);

		// Create enums
		variableListenerEventTypeEEnum = createEEnum(VARIABLE_LISTENER_EVENT_TYPE);

		// Create data types
		throwableEDataType = createEDataType(THROWABLE);
		notificationEDataType = createEDataType(NOTIFICATION);
		typeMemberImplementationsEListEDataType = createEDataType(TYPE_MEMBER_IMPLEMENTATIONS_ELIST);
		typeMembersArrayEDataType = createEDataType(TYPE_MEMBERS_ARRAY);
		iVariableListenerEDataType = createEDataType(IVARIABLE_LISTENER);
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
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		invocatorSessionEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		invocatorSessionEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		environmentEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		environmentEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		dataProductsListsContainerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		dataProductsListsContainerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		dataProductsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		dataProductsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		toolsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		toolsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		typeEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		typeEClass.getESuperTypes().add(this.getAbstractType());
		typeMemberEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		typeMemberEClass.getESuperTypes().add(this.getAbstractType());
		typeMemberReferenceListElementEClass.getESuperTypes().add(this.getTypeMemberReference());
		typeMemberReferenceTreeElementEClass.getESuperTypes().add(this.getTypeMemberReference());
		variableEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		contextEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		basicContextEClass.getESuperTypes().add(this.getContext());
		initializationDataEClass.getESuperTypes().add(this.getAbstractInitializationData());
		variableImplementationEClass.getESuperTypes().add(this.getAbstractTypeImplementation());
		typeMemberImplementationEClass.getESuperTypes().add(this.getAbstractTypeImplementation());
		valueEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		programEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		programEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		operationCallsListEClass.getESuperTypes().add(this.getProgram());
		operationCallsListEClass.getESuperTypes().add(this.getOperationCallContainer());
		variableFeatureReferenceEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		operationCallEClass.getESuperTypes().add(this.getVariableFeatureReference());
		operationCallEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		operationCallEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		eDataTypeArgumentEClass.getESuperTypes().add(this.getArgument());
		eEnumArgumentEClass.getESuperTypes().add(this.getArgument());
		eClassArgumentEClass.getESuperTypes().add(this.getArgument());
		resultsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		resultsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		operationCallResultsListEClass.getESuperTypes().add(this.getResultsList());
		recordingResultsListEClass.getESuperTypes().add(this.getResultsList());
		abstractResultEClass.getESuperTypes().add(theApogyCommonEMFPackage.getTimed());
		abstractResultEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		operationCallResultEClass.getESuperTypes().add(this.getAbstractResult());
		operationCallResultEClass.getESuperTypes().add(this.getOperationCallContainer());
		attributeResultValueEClass.getESuperTypes().add(this.getAbstractResultValue());
		referenceResultValueEClass.getESuperTypes().add(this.getAbstractResultValue());
		watchesListsContainerEClass.getESuperTypes().add(this.getAbstractToolsListContainer());
		watchesListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		watchesListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		watchEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		watchEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		displaysListsContainerEClass.getESuperTypes().add(this.getAbstractToolsListContainer());
		displaysListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		displaysListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		abstractDisplayEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		recordingToolsContainerEClass.getESuperTypes().add(this.getAbstractToolsListContainer());
		channelsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		channelsListEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		abstractChannelEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractChannelEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		abstractRecorderEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractRecorderEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		abstractPlayerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractPlayerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		operationCallResultsListTimeSourceEClass.getESuperTypes().add(theApogyCommonEMFPackage.getCollectionTimedTimeSource());

		// Initialize classes, features, and operations; add parameters
		initEClass(apogy__CoreInvocatorFacadeEClass, ApogyCoreInvocatorFacade.class, "ApogyCoreInvocatorFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApogyCoreInvocatorFacade_InitVariableInstancesDate(), theEcorePackage.getEDate(), "initVariableInstancesDate", null, 0, 1, ApogyCoreInvocatorFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApogyCoreInvocatorFacade_ActiveInvocatorSession(), this.getInvocatorSession(), null, "activeInvocatorSession", null, 0, 1, ApogyCoreInvocatorFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getApogyCoreInvocatorFacade__Exec__OperationCall(), null, "exec", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__Exec__OperationCall_boolean(), null, "exec", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "saveResult", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__Exec__OperationCallsList(), null, "exec", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperationCallsList(), "operationCallsList", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__CreateAbstractResultValue__Object(), this.getAbstractResultValue(), "createAbstractResultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__ResolveWatch__AbstractFeatureNode(), this.getWatch(), "resolveWatch", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonEMFPackage.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__ResolveWatch__TypeMemberReferenceTreeElement(), this.getWatch(), "resolveWatch", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeMemberReferenceTreeElement(), "typeMemberReferenceTreeElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetValue__AbstractFeatureNode(), theEcorePackage.getEJavaObject(), "getValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonEMFPackage.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetInstance__Variable(), theEcorePackage.getEObject(), "getInstance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetInstanceClass__Variable(), theEcorePackage.getEClass(), "getInstanceClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetTypeApiAdapter__VariableFeatureReference(), this.getTypeApiAdapter(), "getTypeApiAdapter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableFeatureReference(), "variableFeatureReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetInstance__VariableFeatureReference(), theEcorePackage.getEObject(), "getInstance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableFeatureReference(), "variableFeatureReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetTypeMemberInstance__VariableFeatureReference(), theEcorePackage.getEObject(), "getTypeMemberInstance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableFeatureReference(), "variableFeatureReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetEMFFeatureValue__VariableFeatureReference(), theEcorePackage.getEJavaObject(), "getEMFFeatureValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableFeatureReference(), "variableFeatureReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetInstanceClass__VariableFeatureReference(), theEcorePackage.getEClass(), "getInstanceClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableFeatureReference(), "variableFeatureReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetInstance__TypeMemberReferenceTreeElement(), theEcorePackage.getEObject(), "getInstance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeMemberReferenceTreeElement(), "typeMemberReferenceTreeElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetTypeImplementation__OperationCall(), this.getAbstractTypeImplementation(), "getTypeImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetTypeImplementation__Variable_AbstractType(), this.getAbstractTypeImplementation(), "getTypeImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractType(), "elementType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetTypeImplementation__Variable(), this.getAbstractTypeImplementation(), "getTypeImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetVariableByName__InvocatorSession_String(), null, "getVariableByName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInvocatorSession(), "session", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theApogyCommonEMFPackage.getList());
		EGenericType g2 = createEGenericType(this.getVariable());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreInvocatorFacade__CreateTypeMemberReferences__TypeMember(), this.getTypeMemberReferenceListElement(), "createTypeMemberReferences", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeMembersArray(), "typeMembers", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetTypeImplementation__Environment_String(), this.getAbstractTypeImplementation(), "getTypeImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fullyQualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetFullyQualifiedName__TypeMemberReferenceTreeElement(), theEcorePackage.getEString(), "getFullyQualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeMemberReferenceTreeElement(), "typeMemberReferenceTreeElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetFullyQualifiedName__AbstractFeatureNode(), theEcorePackage.getEString(), "getFullyQualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonEMFPackage.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__CreateTypeMemberImplementations__Type(), null, "createTypeMemberImplementations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "variableType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonEMFPackage.getList());
		g2 = createEGenericType(this.getTypeMemberImplementation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreInvocatorFacade__InitVariableInstances__Environment(), null, "initVariableInstances", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__DisposeVariableInstances__Environment(), null, "disposeVariableInstances", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetOperationCallContainer__TypeMemberReferenceListElement(), this.getOperationCall(), "getOperationCallContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeMemberReferenceListElement(), "typeMemberReferenceListElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__ApplyInitializationData__Environment(), null, "applyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__CollectInitializationData__Environment(), null, "collectInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__ApplyInitializationData__Variable(), null, "applyInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__CollectInitializationData__Variable(), null, "collectInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__LoadRegisteredTypes__InvocatorSession(), null, "loadRegisteredTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInvocatorSession(), "session", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__GetAllTypes__Environment(), null, "getAllTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonEMFPackage.getList());
		g2 = createEGenericType(this.getType());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreInvocatorFacade__AddVariableListener__IVariableListener(), null, "addVariableListener", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIVariableListener(), "listener", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__RemoveVariableListener__IVariableListener(), null, "removeVariableListener", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIVariableListener(), "listener", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreInvocatorFacade__NotifyVariableListeners__Variable_VariableListenerEventType(), null, "notifyVariableListeners", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariableListenerEventType(), "event", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(invocatorSessionEClass, InvocatorSession.class, "InvocatorSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocatorSession_Environment(), this.getEnvironment(), this.getEnvironment_InvocatorSession(), "environment", null, 0, 1, InvocatorSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocatorSession_ProgramsList(), this.getProgramsList(), this.getProgramsList_InvocatorSession(), "programsList", null, 0, 1, InvocatorSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocatorSession_DataProductsListContainer(), this.getDataProductsListsContainer(), this.getDataProductsListsContainer_InvocatorSession(), "dataProductsListContainer", null, 0, 1, InvocatorSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocatorSession_ToolsList(), this.getToolsList(), this.getToolsList_InvocatorSession(), "toolsList", null, 0, 1, InvocatorSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_InvocatorSession(), this.getInvocatorSession(), this.getInvocatorSession_Environment(), "invocatorSession", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_TypesList(), this.getTypesList(), null, "typesList", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_VariablesList(), this.getVariablesList(), this.getVariablesList_Environment(), "variablesList", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_ContextsList(), this.getContextsList(), this.getContextsList_Environment(), "contextsList", null, 0, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironment_ActiveContext(), this.getContext(), null, "activeContext", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataProductsListsContainerEClass, DataProductsListsContainer.class, "DataProductsListsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataProductsListsContainer_InvocatorSession(), this.getInvocatorSession(), this.getInvocatorSession_DataProductsListContainer(), "invocatorSession", null, 0, 1, DataProductsListsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProductsListsContainer_DataProductsList(), this.getDataProductsList(), this.getDataProductsList_DataProductsListsContainer(), "dataProductsList", null, 0, -1, DataProductsListsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataProductsListEClass, DataProductsList.class, "DataProductsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataProductsList_DataProductsListsContainer(), this.getDataProductsListsContainer(), this.getDataProductsListsContainer_DataProductsList(), "dataProductsListsContainer", null, 0, 1, DataProductsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProductsList_OperationCallResultsList(), this.getOperationCallResultsList(), this.getOperationCallResultsList_DataProductsList(), "operationCallResultsList", null, 1, 1, DataProductsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProductsList_RecordingResultsList(), this.getRecordingResultsList(), this.getRecordingResultsList_DataProductsList(), "recordingResultsList", null, 0, 1, DataProductsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataProductsList_InvocatorSession(), this.getInvocatorSession(), null, "invocatorSession", null, 0, 1, DataProductsList.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(toolsListEClass, ToolsList.class, "ToolsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToolsList_InvocatorSession(), this.getInvocatorSession(), this.getInvocatorSession_ToolsList(), "invocatorSession", null, 0, 1, ToolsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getToolsList_ToolsListContainers(), this.getAbstractToolsListContainer(), this.getAbstractToolsListContainer_ToolsList(), "toolsListContainers", null, 0, -1, ToolsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractToolsListContainerEClass, AbstractToolsListContainer.class, "AbstractToolsListContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractToolsListContainer_ToolsList(), this.getToolsList(), this.getToolsList_ToolsListContainers(), "toolsList", null, 0, 1, AbstractToolsListContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typesListEClass, TypesList.class, "TypesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypesList_LocalTypes(), this.getLocalTypesList(), null, "localTypes", null, 0, 1, TypesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypesList_RegisteredTypes(), this.getRegisteredTypesList(), null, "registeredTypes", null, 0, 1, TypesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localTypesListEClass, LocalTypesList.class, "LocalTypesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalTypesList_Types(), this.getType(), null, "types", null, 0, -1, LocalTypesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(registeredTypesListEClass, RegisteredTypesList.class, "RegisteredTypesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegisteredTypesList_Types(), this.getType(), null, "types", null, 0, -1, RegisteredTypesList.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Members(), this.getTypeMember(), null, "members", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_InterfaceClass(), theEcorePackage.getEClass(), null, "interfaceClass", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_TypeApiAdapterClass(), theEcorePackage.getEClass(), null, "typeApiAdapterClass", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeApiAdapterEClass, TypeApiAdapter.class, "TypeApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeApiAdapter_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, TypeApiAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeApiAdapter_Instance(), theEcorePackage.getEObject(), null, "instance", null, 0, 1, TypeApiAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeApiAdapter_ElementType(), this.getType(), null, "elementType", null, 0, 1, TypeApiAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTypeApiAdapter__Init__Environment_Type_EObject(), null, "init", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "elementType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "instance", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeApiAdapter__Apply__AbstractInitializationData(), null, "apply", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractInitializationData(), "initializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTypeApiAdapter__CreateInitializationData(), this.getAbstractInitializationData(), "createInitializationData", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeApiAdapter__Collect__AbstractInitializationData(), null, "collect", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractInitializationData(), "data", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeApiAdapter__CreateResult__OperationCall(), this.getOperationCallResult(), "createResult", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeApiAdapter__CreateResult__OperationCall_long_Object_Exception(), this.getOperationCallResult(), "createResult", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELong(), "invocationTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "resultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonEMFPackage.getException(), "exception", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTypeApiAdapter__Invoke__EObject_OperationCall_boolean(), null, "invoke", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "instance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperationCall(), "operationCall", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "saveResult", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTypeApiAdapter__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(typeMemberEClass, TypeMember.class, "TypeMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeMember_MemberType(), this.getType(), null, "memberType", null, 0, 1, TypeMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMember_TypeFeatureRootNode(), theApogyCommonEMFPackage.getTreeRootNode(), null, "typeFeatureRootNode", null, 0, 1, TypeMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeMemberReferenceEClass, TypeMemberReference.class, "TypeMemberReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeMemberReference_TypeMember(), this.getTypeMember(), null, "typeMember", null, 1, 1, TypeMemberReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeMemberReferenceListElementEClass, TypeMemberReferenceListElement.class, "TypeMemberReferenceListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeMemberReferenceListElement_Child(), this.getTypeMemberReferenceListElement(), this.getTypeMemberReferenceListElement_Parent(), "child", null, 0, 1, TypeMemberReferenceListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMemberReferenceListElement_Parent(), this.getTypeMemberReferenceListElement(), this.getTypeMemberReferenceListElement_Child(), "parent", null, 0, 1, TypeMemberReferenceListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeMemberReferenceListElement_Root(), theEcorePackage.getEBoolean(), "root", null, 0, 1, TypeMemberReferenceListElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMemberReferenceListElement_RootElement(), this.getTypeMemberReferenceListElement(), null, "rootElement", null, 0, 1, TypeMemberReferenceListElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMemberReferenceListElement_LeafElement(), this.getTypeMemberReferenceListElement(), null, "leafElement", null, 0, 1, TypeMemberReferenceListElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeMemberReferenceListElement_Leaf(), theEcorePackage.getEBoolean(), "leaf", null, 0, 1, TypeMemberReferenceListElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeMemberReferenceListElement_SubSegmentsCount(), theEcorePackage.getEInt(), "subSegmentsCount", null, 0, 1, TypeMemberReferenceListElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(typeMemberReferenceTreeElementEClass, TypeMemberReferenceTreeElement.class, "TypeMemberReferenceTreeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeMemberReferenceTreeElement_Child(), this.getTypeMemberReferenceTreeElement(), this.getTypeMemberReferenceTreeElement_Parent(), "child", null, 0, -1, TypeMemberReferenceTreeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMemberReferenceTreeElement_Parent(), this.getTypeMemberReferenceTreeElement(), this.getTypeMemberReferenceTreeElement_Child(), "parent", null, 0, 1, TypeMemberReferenceTreeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMemberReferenceTreeElement_FeatureRootNode(), theApogyCommonEMFPackage.getTreeRootNode(), null, "featureRootNode", null, 0, 1, TypeMemberReferenceTreeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeMemberReferenceTreeElement_Root(), theEcorePackage.getEBoolean(), "root", null, 0, 1, TypeMemberReferenceTreeElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMemberReferenceTreeElement_RootElement(), this.getTypeMemberReferenceTreeElement(), null, "rootElement", null, 0, 1, TypeMemberReferenceTreeElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeMemberReferenceTreeElement_Leaf(), theEcorePackage.getEBoolean(), "leaf", null, 0, 1, TypeMemberReferenceTreeElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(variablesListEClass, VariablesList.class, "VariablesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariablesList_Environment(), this.getEnvironment(), this.getEnvironment_VariablesList(), "environment", null, 0, 1, VariablesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariablesList_Variables(), this.getVariable(), this.getVariable_VariablesList(), "variables", null, 0, -1, VariablesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_VariablesList(), this.getVariablesList(), this.getVariablesList_Variables(), "variablesList", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_VariableType(), this.getType(), null, "variableType", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Variable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(contextsListEClass, ContextsList.class, "ContextsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextsList_Environment(), this.getEnvironment(), this.getEnvironment_ContextsList(), "environment", null, 0, 1, ContextsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextsList_Contexts(), this.getContext(), this.getContext_ContextsList(), "contexts", null, 0, -1, ContextsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_ContextsList(), this.getContextsList(), this.getContextsList_Contexts(), "contextsList", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_VariableImplementationsList(), this.getVariableImplementationsList(), null, "variableImplementationsList", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Context.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContext_DataProductsList(), this.getDataProductsList(), null, "dataProductsList", null, 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_InstancesCreationDate(), theEcorePackage.getEDate(), "instancesCreationDate", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_InstancesDisposalDate(), theEcorePackage.getEDate(), "instancesDisposalDate", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicContextEClass, BasicContext.class, "BasicContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableImplementationsListEClass, VariableImplementationsList.class, "VariableImplementationsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableImplementationsList_VariableImplementations(), this.getVariableImplementation(), this.getVariableImplementation_VariableImplementationsList(), "variableImplementations", null, 0, -1, VariableImplementationsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVariableImplementationsList__GetVariableImplementation__Variable(), this.getVariableImplementation(), "getVariableImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVariable(), "variable", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariableImplementationsList__GetVariableImplementation__String(), this.getVariableImplementation(), "getVariableImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractInitializationDataEClass, AbstractInitializationData.class, "AbstractInitializationData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializationDataEClass, InitializationData.class, "InitializationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractTypeImplementationEClass, AbstractTypeImplementation.class, "AbstractTypeImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractTypeImplementation_TypeMemberImplementations(), this.getTypeMemberImplementation(), null, "typeMemberImplementations", null, 0, -1, AbstractTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeImplementation_ImplementationClass(), theEcorePackage.getEClass(), null, "implementationClass", null, 0, 1, AbstractTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeImplementation_AbstractInitializationData(), this.getAbstractInitializationData(), null, "abstractInitializationData", null, 0, 1, AbstractTypeImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeImplementation_Instance(), theEcorePackage.getEObject(), null, "instance", null, 0, 1, AbstractTypeImplementation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeImplementation_AdapterInstance(), this.getTypeApiAdapter(), null, "adapterInstance", null, 0, 1, AbstractTypeImplementation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeImplementation_HandlingType(), this.getType(), null, "handlingType", null, 0, 1, AbstractTypeImplementation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractTypeImplementation__GetTypeMemberImplementation__String(), this.getTypeMemberImplementation(), "getTypeMemberImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractTypeImplementation__GetTypeMemberImplementation__TypeMember(), this.getTypeMemberImplementation(), "getTypeMemberImplementation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTypeMember(), "typeMember", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(variableImplementationEClass, VariableImplementation.class, "VariableImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableImplementation_VariableImplementationsList(), this.getVariableImplementationsList(), this.getVariableImplementationsList_VariableImplementations(), "variableImplementationsList", null, 0, 1, VariableImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableImplementation_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeMemberImplementationEClass, TypeMemberImplementation.class, "TypeMemberImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeMemberImplementation_TypeMember(), this.getTypeMember(), null, "typeMember", null, 1, 1, TypeMemberImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuesListEClass, ValuesList.class, "ValuesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuesList_Values(), this.getValue(), null, "values", null, 0, -1, ValuesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_Value(), theEcorePackage.getEObject(), null, "value", null, 1, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programsListEClass, ProgramsList.class, "ProgramsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramsList_InvocatorSession(), this.getInvocatorSession(), this.getInvocatorSession_ProgramsList(), "invocatorSession", null, 0, 1, ProgramsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramsList_Programs(), this.getProgram(), this.getProgram_ProgramsList(), "programs", null, 0, -1, ProgramsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_ProgramsList(), this.getProgramsList(), this.getProgramsList_Programs(), "programsList", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_InvocatorSession(), this.getInvocatorSession(), null, "invocatorSession", null, 0, 1, Program.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_ValuesList(), this.getValuesList(), null, "valuesList", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallContainerEClass, OperationCallContainer.class, "OperationCallContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCallContainer_OperationCalls(), this.getOperationCall(), this.getOperationCall_OperationCallContainer(), "operationCalls", null, 0, -1, OperationCallContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperationCallContainer__GetInvocatorSession(), this.getInvocatorSession(), "getInvocatorSession", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(operationCallsListEClass, OperationCallsList.class, "OperationCallsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableFeatureReferenceEClass, VariableFeatureReference.class, "VariableFeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableFeatureReference_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableFeatureReference_TypeMemberReferenceListElement(), this.getTypeMemberReferenceListElement(), null, "typeMemberReferenceListElement", null, 0, 1, VariableFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableFeatureReference_FeatureRoot(), theApogyCommonEMFPackage.getListRootNode(), null, "featureRoot", null, 0, 1, VariableFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCall_EOperation(), theEcorePackage.getEOperation(), null, "eOperation", null, 1, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_ArgumentsList(), this.getArgumentsList(), this.getArgumentsList_OperationCall(), "argumentsList", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_OperationCallContainer(), this.getOperationCallContainer(), this.getOperationCallContainer_OperationCalls(), "operationCallContainer", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_InvocatorSession(), this.getInvocatorSession(), null, "invocatorSession", null, 0, 1, OperationCall.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCall_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, OperationCall.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(argumentsListEClass, ArgumentsList.class, "ArgumentsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentsList_OperationCall(), this.getOperationCall(), this.getOperationCall_ArgumentsList(), "operationCall", null, 0, 1, ArgumentsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentsList_Arguments(), this.getArgument(), this.getArgument_ArgumentsList(), "arguments", null, 0, -1, ArgumentsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getArgumentsList__GetArgumentValues(), null, "getArgumentValues", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonEMFPackage.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(argumentEClass, Argument.class, "Argument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_ArgumentsList(), this.getArgumentsList(), this.getArgumentsList_Arguments(), "argumentsList", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_OperationCall(), this.getOperationCall(), null, "operationCall", null, 0, 1, Argument.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getArgument__GetEParameter(), theEcorePackage.getEParameter(), "getEParameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getArgument__GetParameterValue(), theEcorePackage.getEJavaObject(), "getParameterValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eDataTypeArgumentEClass, EDataTypeArgument.class, "EDataTypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDataTypeArgument_Value(), theEcorePackage.getEString(), "value", null, 0, 1, EDataTypeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumArgumentEClass, EEnumArgument.class, "EEnumArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnumArgument_EEnumLiteral(), theEcorePackage.getEEnumLiteral(), null, "eEnumLiteral", null, 0, 1, EEnumArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEnumArgument_EEnum(), theEcorePackage.getEEnum(), null, "eEnum", null, 0, 1, EEnumArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassArgumentEClass, EClassArgument.class, "EClassArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClassArgument_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, EClassArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultsListEClass, ResultsList.class, "ResultsList", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultsList_Results(), this.getAbstractResult(), this.getAbstractResult_ResultsList(), "results", null, 0, -1, ResultsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getResultsList__GetInvocatorSession(), this.getInvocatorSession(), "getInvocatorSession", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(operationCallResultsListEClass, OperationCallResultsList.class, "OperationCallResultsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCallResultsList_DataProductsList(), this.getDataProductsList(), this.getDataProductsList_OperationCallResultsList(), "dataProductsList", null, 0, 1, OperationCallResultsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCallResultsList_InvocatorSession(), this.getInvocatorSession(), null, "invocatorSession", null, 0, 1, OperationCallResultsList.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(recordingResultsListEClass, RecordingResultsList.class, "RecordingResultsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordingResultsList_DataProductsList(), this.getDataProductsList(), this.getDataProductsList_RecordingResultsList(), "dataProductsList", null, 0, 1, RecordingResultsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecordingResultsList_InvocatorSession(), this.getInvocatorSession(), null, "invocatorSession", null, 0, 1, RecordingResultsList.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractResultEClass, AbstractResult.class, "AbstractResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractResult_ResultsList(), this.getResultsList(), this.getResultsList_Results(), "resultsList", null, 0, 1, AbstractResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractResult_InvocatorSession(), this.getInvocatorSession(), null, "invocatorSession", null, 0, 1, AbstractResult.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractResult_Context(), this.getContext(), null, "context", null, 1, 1, AbstractResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractResult_ResultValue(), this.getAbstractResultValue(), this.getAbstractResultValue_Result(), "resultValue", null, 0, 1, AbstractResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractResultValueEClass, AbstractResultValue.class, "AbstractResultValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractResultValue_Result(), this.getAbstractResult(), this.getAbstractResult_ResultValue(), "result", null, 0, 1, AbstractResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallResultEClass, OperationCallResult.class, "OperationCallResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCallResult_OperationCall(), this.getOperationCall(), null, "operationCall", null, 0, 1, OperationCallResult.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCallResult_ExceptionContainer(), this.getExceptionContainer(), null, "exceptionContainer", null, 0, 1, OperationCallResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionContainerEClass, ExceptionContainer.class, "ExceptionContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionContainer_Exception(), this.getThrowable(), "exception", null, 0, 1, ExceptionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeResultValueEClass, AttributeResultValue.class, "AttributeResultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeResultValue_Value(), this.getAttributeValue(), null, "value", null, 0, 1, AttributeResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValue_Object(), theEcorePackage.getEJavaObject(), "object", null, 0, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceResultValueEClass, ReferenceResultValue.class, "ReferenceResultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceResultValue_Value(), theEcorePackage.getEObject(), null, "value", null, 0, 1, ReferenceResultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(watchesListsContainerEClass, WatchesListsContainer.class, "WatchesListsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWatchesListsContainer_Watches(), this.getWatchesList(), this.getWatchesList_WatchesListsContainer(), "watches", null, 0, -1, WatchesListsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(watchesListEClass, WatchesList.class, "WatchesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWatchesList_WatchesListsContainer(), this.getWatchesListsContainer(), this.getWatchesListsContainer_Watches(), "watchesListsContainer", null, 0, 1, WatchesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWatchesList_Watches(), this.getWatch(), this.getWatch_WatchesList(), "watches", null, 0, -1, WatchesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(watchEClass, Watch.class, "Watch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWatch_WatchesList(), this.getWatchesList(), this.getWatchesList_Watches(), "watchesList", null, 0, 1, Watch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWatch_Variable(), this.getVariable(), null, "variable", null, 1, 1, Watch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWatch_TypeMemberReferenceTreeElement(), this.getTypeMemberReferenceTreeElement(), null, "typeMemberReferenceTreeElement", null, 0, 1, Watch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWatch_TreeRootNode(), theApogyCommonEMFPackage.getTreeRootNode(), null, "treeRootNode", null, 0, 1, Watch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(watchFeatureNodeAdapterEClass, WatchFeatureNodeAdapter.class, "WatchFeatureNodeAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWatchFeatureNodeAdapter_SourceObject(), theEcorePackage.getEObject(), null, "sourceObject", null, 0, 1, WatchFeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWatchFeatureNodeAdapter_FeatureNode(), theApogyCommonEMFPackage.getAbstractFeatureNode(), null, "featureNode", null, 0, 1, WatchFeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWatchFeatureNodeAdapter_CurrentValue(), theEcorePackage.getEJavaObject(), "currentValue", null, 0, 1, WatchFeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWatchFeatureNodeAdapter_Resolved(), theEcorePackage.getEBoolean(), "resolved", "false", 0, 1, WatchFeatureNodeAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displaysListsContainerEClass, DisplaysListsContainer.class, "DisplaysListsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplaysListsContainer_Displays(), this.getDisplaysList(), this.getDisplaysList_DisplaysListsContainer(), "displays", null, 0, -1, DisplaysListsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displaysListEClass, DisplaysList.class, "DisplaysList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplaysList_DisplaysListsContainer(), this.getDisplaysListsContainer(), this.getDisplaysListsContainer_Displays(), "displaysListsContainer", null, 0, 1, DisplaysList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplaysList_Displays(), this.getAbstractDisplay(), this.getAbstractDisplay_DisplaysList(), "displays", null, 0, -1, DisplaysList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDisplayEClass, AbstractDisplay.class, "AbstractDisplay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDisplay_DisplaysList(), this.getDisplaysList(), this.getDisplaysList_Displays(), "displaysList", null, 0, 1, AbstractDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordingToolsContainerEClass, RecordingToolsContainer.class, "RecordingToolsContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordingToolsContainer_Recorder(), this.getAbstractRecorder(), this.getAbstractRecorder_RecordingToolsContainer(), "recorder", null, 1, 1, RecordingToolsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecordingToolsContainer_Player(), this.getAbstractPlayer(), this.getAbstractPlayer_RecordingToolsContainer(), "player", null, 1, 1, RecordingToolsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecordingToolsContainer_ChannelsLists(), this.getChannelsList(), this.getChannelsList_RecordingToolsContainer(), "channelsLists", null, 0, -1, RecordingToolsContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelsListEClass, ChannelsList.class, "ChannelsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelsList_Channels(), this.getAbstractChannel(), this.getAbstractChannel_ChannelsList(), "channels", null, 0, -1, ChannelsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelsList_RecordingToolsContainer(), this.getRecordingToolsContainer(), this.getRecordingToolsContainer_ChannelsLists(), "recordingToolsContainer", null, 0, 1, ChannelsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractChannelEClass, AbstractChannel.class, "AbstractChannel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractChannel_ChannelsList(), this.getChannelsList(), this.getChannelsList_Channels(), "channelsList", null, 0, 1, AbstractChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRecorderEClass, AbstractRecorder.class, "AbstractRecorder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRecorder_RecordingToolsContainer(), this.getRecordingToolsContainer(), this.getRecordingToolsContainer_Recorder(), "recordingToolsContainer", null, 0, 1, AbstractRecorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPlayerEClass, AbstractPlayer.class, "AbstractPlayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPlayer_RecordingToolsContainer(), this.getRecordingToolsContainer(), this.getRecordingToolsContainer_Player(), "recordingToolsContainer", null, 0, 1, AbstractPlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallResultsListTimeSourceEClass, OperationCallResultsListTimeSource.class, "OperationCallResultsListTimeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCallResultsListTimeSource_OpsCallList(), this.getOperationCallResultsList(), null, "opsCallList", null, 0, 1, OperationCallResultsListTimeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableListenerEventTypeEEnum, VariableListenerEventType.class, "VariableListenerEventType");
		addEEnumLiteral(variableListenerEventTypeEEnum, VariableListenerEventType.NEW);
		addEEnumLiteral(variableListenerEventTypeEEnum, VariableListenerEventType.CLEAR);

		// Initialize data types
		initEDataType(throwableEDataType, Throwable.class, "Throwable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(notificationEDataType, Notification.class, "Notification", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeMemberImplementationsEListEDataType, EList.class, "TypeMemberImplementationsEList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "org.eclipse.emf.common.util.EList<ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation>");
		initEDataType(typeMembersArrayEDataType, TypeMember[].class, "TypeMembersArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iVariableListenerEDataType, IVariableListener.class, "IVariableListener", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCoreInvocatorPackageImpl
