/**
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
package ca.gc.asc_csa.apogy.common.emf.impl;

import static ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage.RESOURCE;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;

import javax.measure.unit.Unit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode;
import ca.gc.asc_csa.apogy.common.emf.AbstractRootNode;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Archivable;
import ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource;
import ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Disposable;
import ca.gc.asc_csa.apogy.common.emf.Duration;
import ca.gc.asc_csa.apogy.common.emf.EClassFilter;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter;
import ca.gc.asc_csa.apogy.common.emf.FeaturePathAdapter;
import ca.gc.asc_csa.apogy.common.emf.FixedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ListFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Ranges;
import ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.Server;
import ca.gc.asc_csa.apogy.common.emf.Startable;
import ca.gc.asc_csa.apogy.common.emf.TimeDirection;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.emf.TreeFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEMFPackageImpl extends EPackageImpl implements ApogyCommonEMFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonEMFFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectReferenceEClass = null;

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
	private EClass archivableEClass = null;

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
	private EClass durationEClass = null;

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
	private EClass featureNodeAdapterEClass = null;

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
	private EClass featurePathAdapterEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listNamedEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listFeatureEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType adapterEDataType = null;

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
	private EDataType hashMapEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonEMFPackageImpl() {
		super(eNS_URI, ApogyCommonEMFFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonEMFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonEMFPackage init() {
		if (isInited) return (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonEMFPackageImpl theApogyCommonEMFPackage = (ApogyCommonEMFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonEMFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonEMFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonEMFPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonEMFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonEMFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonEMFPackage.eNS_URI, theApogyCommonEMFPackage);
		return theApogyCommonEMFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonEMFFacade() {
		return apogyCommonEMFFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAllAvailableEClasses() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAllSubEClasses__EClass() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__FilterEClasses__List_EClassFilter() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__FilterEClasses__List_List() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetEClass__String() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__SortAlphabetically__List() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAllAvailableEOperations__EClass() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__SortEOperationsAlphabetically__List() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetDocumentation__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetEngineeringUnits__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetValueUpdateRate__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetWarningOCLExpression__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAlarmOCLExpression__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetWarningMinValue__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetWarningMaxValue__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAlarmMinValue__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAlarmMaxValue__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetOutOfRangeMinValue__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetRange__ETypedElement_Object() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetFullDescription__ETypedElement() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAncestriesString__AbstractFeatureNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetFeatureRoot__AbstractFeatureNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetAncestries__AbstractFeatureNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetDescendants__AbstractFeatureNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__Resolve__EObject_AbstractFeatureNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__IsResolved__EObject_AbstractFeatureNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetLeaf__ListRootNode() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetFile__Resource() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetContent__URI() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__SortTimed__Collection() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetTimeSpan__Collection() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetID__EObject() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetEObjectById__ResourceSet_String() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetDefaultName__EObject_EObject_EReference() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__FilterArchived__EList() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetChildEClasses__EClass() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__GetSettableEReferences__EObject() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__ToString__List_String() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__AddAdaptersOnFeaturePath__FeaturePathAdapter_EObject() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__AddAdaptersOnFeaturePath__FeaturePathAdapter_EObject_List() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__RemoveAdaptersOnFeaturePath__FeaturePathAdapter_EObject() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEMFFacade__RemoveAdaptersOnFeaturePath__FeaturePathAdapter_EObject_List() {
		return apogyCommonEMFFacadeEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObjectReference() {
		return eObjectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEObjectReference_EObject() {
		return (EReference)eObjectReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribed() {
		return describedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribed_Description() {
		return (EAttribute)describedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchivable() {
		return archivableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchivable_Archived() {
		return (EAttribute)archivableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimed() {
		return timedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimed_Time() {
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
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Value() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Days() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Hours() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Minutes() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Seconds() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Milliseconds() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__GetDuration__Timed_Timed() {
		return durationEClass.getEOperations().get(0);
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
	public EClass getDisposable() {
		return disposableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisposable__Dispose() {
		return disposableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureNodeAdapter() {
		return featureNodeAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureNodeAdapter_SourceObject() {
		return (EReference)featureNodeAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureNodeAdapter_FeatureNode() {
		return (EReference)featureNodeAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureNodeAdapter_CurrentValue() {
		return (EAttribute)featureNodeAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureNodeAdapter_Resolved() {
		return (EAttribute)featureNodeAdapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureNode() {
		return abstractFeatureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureListNode() {
		return abstractFeatureListNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureListNode_Parent() {
		return (EReference)abstractFeatureListNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureListNode_Child() {
		return (EReference)abstractFeatureListNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureTreeNode() {
		return abstractFeatureTreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureTreeNode_Parent() {
		return (EReference)abstractFeatureTreeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureTreeNode_Children() {
		return (EReference)abstractFeatureTreeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRootNode() {
		return abstractRootNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRootNode_SourceClass() {
		return (EReference)abstractRootNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeRootNode() {
		return treeRootNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeFeatureNode() {
		return treeFeatureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListRootNode() {
		return listRootNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListFeatureNode() {
		return listFeatureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFeatureSpecifier() {
		return abstractFeatureSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFeatureSpecifier_StructuralFeature() {
		return (EReference)abstractFeatureSpecifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeatureSpecifier_MultiValued() {
		return (EAttribute)abstractFeatureSpecifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFeatureSpecifier_Index() {
		return (EAttribute)abstractFeatureSpecifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturePathAdapter() {
		return featurePathAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePathAdapter_EObjectAdaptersMap() {
		return (EAttribute)featurePathAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturePathAdapter_FeaturePath() {
		return (EAttribute)featurePathAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeaturePathAdapter__NotifyAdapterOnFeatureChanged__Notification() {
		return featurePathAdapterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeaturePathAdapter__NotifyChanged__Notification() {
		return featurePathAdapterEClass.getEOperations().get(1);
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
	public EEnum getRanges() {
		return rangesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortedSet() {
		return sortedSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEClassFilter() {
		return eClassFilterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIFile() {
		return iFileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResource() {
		return resourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnit() {
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
	public EDataType getResourceSet() {
		return resourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListNamed() {
		return listNamedEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListFeature() {
		return listFeatureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAdapter() {
		return adapterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNotification() {
		return notificationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashMap() {
		return hashMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEMFFactory getApogyCommonEMFFactory() {
		return (ApogyCommonEMFFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apogyCommonEMFFacadeEClass = createEClass(APOGY_COMMON_EMF_FACADE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_ECLASSES);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ALL_SUB_ECLASSES__ECLASS);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_ECLASSFILTER);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___FILTER_ECLASSES__LIST_LIST);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ECLASS__STRING);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___SORT_ALPHABETICALLY__LIST);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ALL_AVAILABLE_EOPERATIONS__ECLASS);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___SORT_EOPERATIONS_ALPHABETICALLY__LIST);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_DOCUMENTATION__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS_AS_STRING__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ENGINEERING_UNITS__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_VALUE_UPDATE_RATE__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_WARNING_OCL_EXPRESSION__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ALARM_OCL_EXPRESSION__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_OCL_EXPRESSION__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_WARNING_MIN_VALUE__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_WARNING_MAX_VALUE__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ALARM_MIN_VALUE__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ALARM_MAX_VALUE__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MIN_VALUE__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_OUT_OF_RANGE_MAX_VALUE__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_RANGE__ETYPEDELEMENT_OBJECT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_FULL_DESCRIPTION__ETYPEDELEMENT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ANCESTRIES_STRING__ABSTRACTFEATURENODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_FEATURE_ROOT__ABSTRACTFEATURENODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ANCESTRIES__ABSTRACTFEATURENODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_DESCENDANTS__ABSTRACTFEATURENODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_CHILD_ESTRUCTURAL_FEATURES__ABSTRACTFEATURENODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___RESOLVE__EOBJECT_ABSTRACTFEATURENODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___SET_VALUE__EOBJECT_ABSTRACTFEATURENODE_OBJECT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___IS_RESOLVED__EOBJECT_ABSTRACTFEATURENODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_LEAF__LISTROOTNODE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_FILE__RESOURCE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_CONTENT__URI);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___SORT_TIMED__COLLECTION);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_TIME_SPAN__COLLECTION);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_ID__EOBJECT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_EOBJECT_BY_ID__RESOURCESET_STRING);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_DEFAULT_NAME__EOBJECT_EOBJECT_EREFERENCE);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___FILTER_ARCHIVED__ELIST);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_CHILD_ECLASSES__ECLASS);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___GET_SETTABLE_EREFERENCES__EOBJECT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___TO_STRING__LIST_STRING);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___ADD_ADAPTERS_ON_FEATURE_PATH__FEATUREPATHADAPTER_EOBJECT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___ADD_ADAPTERS_ON_FEATURE_PATH__FEATUREPATHADAPTER_EOBJECT_LIST);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___REMOVE_ADAPTERS_ON_FEATURE_PATH__FEATUREPATHADAPTER_EOBJECT);
		createEOperation(apogyCommonEMFFacadeEClass, APOGY_COMMON_EMF_FACADE___REMOVE_ADAPTERS_ON_FEATURE_PATH__FEATUREPATHADAPTER_EOBJECT_LIST);

		eObjectReferenceEClass = createEClass(EOBJECT_REFERENCE);
		createEReference(eObjectReferenceEClass, EOBJECT_REFERENCE__EOBJECT);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		describedEClass = createEClass(DESCRIBED);
		createEAttribute(describedEClass, DESCRIBED__DESCRIPTION);

		archivableEClass = createEClass(ARCHIVABLE);
		createEAttribute(archivableEClass, ARCHIVABLE__ARCHIVED);

		timedEClass = createEClass(TIMED);
		createEAttribute(timedEClass, TIMED__TIME);

		serverEClass = createEClass(SERVER);
		createEAttribute(serverEClass, SERVER__SERVER_JOB);

		startableEClass = createEClass(STARTABLE);
		createEAttribute(startableEClass, STARTABLE__STARTED);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);
		createEAttribute(durationEClass, DURATION__DAYS);
		createEAttribute(durationEClass, DURATION__HOURS);
		createEAttribute(durationEClass, DURATION__MINUTES);
		createEAttribute(durationEClass, DURATION__SECONDS);
		createEAttribute(durationEClass, DURATION__MILLISECONDS);
		createEOperation(durationEClass, DURATION___GET_DURATION__TIMED_TIMED);

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

		featurePathAdapterEClass = createEClass(FEATURE_PATH_ADAPTER);
		createEAttribute(featurePathAdapterEClass, FEATURE_PATH_ADAPTER__EOBJECT_ADAPTERS_MAP);
		createEAttribute(featurePathAdapterEClass, FEATURE_PATH_ADAPTER__FEATURE_PATH);
		createEOperation(featurePathAdapterEClass, FEATURE_PATH_ADAPTER___NOTIFY_ADAPTER_ON_FEATURE_CHANGED__NOTIFICATION);
		createEOperation(featurePathAdapterEClass, FEATURE_PATH_ADAPTER___NOTIFY_CHANGED__NOTIFICATION);

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
		resourceSetEDataType = createEDataType(RESOURCE_SET);
		listNamedEDataType = createEDataType(LIST_NAMED);
		listFeatureEDataType = createEDataType(LIST_FEATURE);
		adapterEDataType = createEDataType(ADAPTER);
		notificationEDataType = createEDataType(NOTIFICATION);
		hashMapEDataType = createEDataType(HASH_MAP);
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
	public void initializePackageContents() {
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
		addETypeParameter(hashMapEDataType, "key");
		addETypeParameter(hashMapEDataType, "value");

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
		initEClass(apogyCommonEMFFacadeEClass, ApogyCommonEMFFacade.class, "ApogyCommonEMFFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCommonEMFFacade__GetAllAvailableEClasses(), null, "getAllAvailableEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__GetAllSubEClasses__EClass(), null, "getAllSubEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "superClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__FilterEClasses__List_EClassFilter(), null, "filterEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClassFilter(), "filter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__FilterEClasses__List_List(), null, "filterEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
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

		op = initEOperation(getApogyCommonEMFFacade__GetEClass__String(), theEcorePackage.getEClass(), "getEClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "str", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__SortAlphabetically__List(), null, "sortAlphabetically", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__GetAllAvailableEOperations__EClass(), null, "getAllAvailableEOperations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "eClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEOperation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__SortEOperationsAlphabetically__List(), null, "sortEOperationsAlphabetically", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEOperation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "eOperations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEcorePackage.getEOperation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__GetDocumentation__ETypedElement(), theEcorePackage.getEString(), "getDocumentation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetEngineeringUnitsAsString__ETypedElement(), theEcorePackage.getEString(), "getEngineeringUnitsAsString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetEngineeringUnits__ETypedElement(), this.getUnit(), "getEngineeringUnits", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetValueUpdateRate__ETypedElement(), theEcorePackage.getEDoubleObject(), "getValueUpdateRate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetWarningOCLExpression__ETypedElement(), theEcorePackage.getEString(), "getWarningOCLExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetAlarmOCLExpression__ETypedElement(), theEcorePackage.getEString(), "getAlarmOCLExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetOutOfRangeOCLExpression__ETypedElement(), theEcorePackage.getEString(), "getOutOfRangeOCLExpression", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetWarningMinValue__ETypedElement(), this.getNumber(), "getWarningMinValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetWarningMaxValue__ETypedElement(), this.getNumber(), "getWarningMaxValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetAlarmMinValue__ETypedElement(), this.getNumber(), "getAlarmMinValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetAlarmMaxValue__ETypedElement(), this.getNumber(), "getAlarmMaxValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetOutOfRangeMinValue__ETypedElement(), this.getNumber(), "getOutOfRangeMinValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetOutOfRangeMaxValue__ETypedElement(), this.getNumber(), "getOutOfRangeMaxValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetRange__ETypedElement_Object(), this.getRanges(), "getRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetFullDescription__ETypedElement(), theEcorePackage.getEString(), "getFullDescription", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getETypedElement(), "eTypedElement", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetAncestriesString__AbstractFeatureNode(), theEcorePackage.getEString(), "getAncestriesString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetFeatureRoot__AbstractFeatureNode(), this.getAbstractRootNode(), "getFeatureRoot", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetAncestries__AbstractFeatureNode(), null, "getAncestries", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractFeatureNode());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__GetDescendants__AbstractFeatureNode(), null, "getDescendants", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractFeatureNode());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__GetChildEStructuralFeatures__AbstractFeatureNode(), null, "getChildEStructuralFeatures", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEStructuralFeature());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__Resolve__EObject_AbstractFeatureNode(), theEcorePackage.getEJavaObject(), "resolve", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "sourceObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__SetValue__EObject_AbstractFeatureNode_Object(), null, "setValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "sourceObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__IsResolved__EObject_AbstractFeatureNode(), theEcorePackage.getEBoolean(), "isResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "sourceObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureNode(), "abstractFeatureNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetLeaf__ListRootNode(), this.getAbstractFeatureListNode(), "getLeaf", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getListRootNode(), "listRootNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetFile__Resource(), this.getIFile(), "getFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResource(), "resource", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetContent__URI(), null, "getContent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getURI(), "uri", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEList());
		g2 = createEGenericType(theEcorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__SortTimed__Collection(), null, "sortTimed", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getTimed());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timedCollection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getTimed());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__GetTimeSpan__Collection(), theEcorePackage.getEDouble(), "getTimeSpan", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getTimed());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timedCollection", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetID__EObject(), theEcorePackage.getEString(), "getID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eObject", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetEObjectById__ResourceSet_String(), theEcorePackage.getEObject(), "getEObjectById", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResourceSet(), "resourceSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "id", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetDefaultName__EObject_EObject_EReference(), theEcorePackage.getEString(), "getDefaultName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEReference(), "objectReference", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__FilterArchived__EList(), theEcorePackage.getEJavaObject(), "filterArchived", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "objects", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__GetChildEClasses__EClass(), null, "getChildEClasses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEClass(), "parentEClass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theEcorePackage.getEClass());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__GetSettableEReferences__EObject(), null, "getSettableEReferences", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "eObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEList());
		g2 = createEGenericType(theEcorePackage.getEReference());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonEMFFacade__ToString__List_String(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getListNamed(), "nameds", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "separator", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__AddAdaptersOnFeaturePath__FeaturePathAdapter_EObject(), null, "addAdaptersOnFeaturePath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeaturePathAdapter(), "featurePathAdapter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__AddAdaptersOnFeaturePath__FeaturePathAdapter_EObject_List(), null, "addAdaptersOnFeaturePath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeaturePathAdapter(), "featurePathAdapter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getListFeature(), "featurePath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__RemoveAdaptersOnFeaturePath__FeaturePathAdapter_EObject(), null, "removeAdaptersOnFeaturePath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeaturePathAdapter(), "featurePathAdapter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonEMFFacade__RemoveAdaptersOnFeaturePath__FeaturePathAdapter_EObject_List(), null, "removeAdaptersOnFeaturePath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFeaturePathAdapter(), "featurePathAdapter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "root", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getListFeature(), "featurePath", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(eObjectReferenceEClass, EObjectReference.class, "EObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectReference_EObject(), theEcorePackage.getEObject(), null, "eObject", null, 0, 1, EObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedEClass, Described.class, "Described", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribed_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Described.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archivableEClass, Archivable.class, "Archivable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchivable_Archived(), theEcorePackage.getEBoolean(), "archived", "false", 0, 1, Archivable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedEClass, Timed.class, "Timed", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimed_Time(), theEcorePackage.getEDate(), "time", null, 0, 1, Timed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServer_ServerJob(), this.getJob(), "serverJob", null, 0, 1, Server.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startableEClass, Startable.class, "Startable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartable_Started(), theEcorePackage.getEBoolean(), "started", "false", 0, 1, Startable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Value(), theEcorePackage.getELong(), "value", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Days(), theEcorePackage.getEByte(), "days", null, 0, 1, Duration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Hours(), theEcorePackage.getEByte(), "hours", null, 0, 1, Duration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Minutes(), theEcorePackage.getEByte(), "minutes", null, 0, 1, Duration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Seconds(), theEcorePackage.getEByte(), "seconds", null, 0, 1, Duration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Milliseconds(), theEcorePackage.getEInt(), "milliseconds", null, 0, 1, Duration.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDuration__GetDuration__Timed_Timed(), this.getDuration(), "getDuration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimed(), "firstEvent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimed(), "secondEvent", 0, 1, !IS_UNIQUE, IS_ORDERED);

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

		initEClass(featurePathAdapterEClass, FeaturePathAdapter.class, "FeaturePathAdapter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getHashMap());
		g2 = createEGenericType(theEcorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getAdapter());
		g1.getETypeArguments().add(g2);
		initEAttribute(getFeaturePathAdapter_EObjectAdaptersMap(), g1, "eObjectAdaptersMap", null, 0, 1, FeaturePathAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeaturePathAdapter_FeaturePath(), this.getListFeature(), "featurePath", null, 0, 1, FeaturePathAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFeaturePathAdapter__NotifyAdapterOnFeatureChanged__Notification(), null, "notifyAdapterOnFeatureChanged", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "msg", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFeaturePathAdapter__NotifyChanged__Notification(), null, "notifyChanged", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "msg", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
		initEDataType(resourceSetEDataType, ResourceSet.class, "ResourceSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listNamedEDataType, List.class, "ListNamed", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<? extends ca.gc.asc_csa.apogy.common.emf.Named>");
		initEDataType(listFeatureEDataType, List.class, "ListFeature", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<? extends org.eclipse.emf.ecore.EStructuralFeature>");
		initEDataType(adapterEDataType, Adapter.class, "Adapter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(notificationEDataType, Notification.class, "Notification", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashMapEDataType, HashMap.class, "HashMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonEMFPackageImpl
