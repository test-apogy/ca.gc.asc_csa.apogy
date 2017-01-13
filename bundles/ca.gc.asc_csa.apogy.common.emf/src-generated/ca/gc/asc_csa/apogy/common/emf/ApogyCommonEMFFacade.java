package ca.gc.asc_csa.apogy.common.emf;
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

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;

import javax.measure.unit.Unit;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ------------------------------------------------------------------------------------------
 * 
 * Facade & Utilities.
 * 
 * ------------------------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getApogyCommonEMFFacade()
 * @model
 * @generated
 */
public interface ApogyCommonEMFFacade extends EObject
{
	public static ApogyCommonEMFFacade INSTANCE = ApogyCommonEMFFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false"
	 * @generated
	 */
  List<EClass> getAllAvailableEClasses();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the sub classes of the specified super class.  The result list contains
	 * only implementation classes (not abstract).
	 * @param superClass Super type of the classes to be found.
	 * @return List of sub classes.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false" superClassUnique="false"
	 * @generated
	 */
  List<EClass> getAllSubEClasses(EClass superClass);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false" eClassesDataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" eClassesUnique="false" eClassesMany="false" filterDataType="ca.gc.asc_csa.apogy.common.emf.EClassFilter" filterUnique="false"
	 * @generated
	 */
  List<EClass> filterEClasses(List<EClass> eClasses, EClassFilter filter);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false" eClassesDataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" eClassesUnique="false" eClassesMany="false" filtersDataType="ca.gc.asc_csa.apogy.common.emf.List<ca.gc.asc_csa.apogy.common.emf.EClassFilter>" filtersUnique="false" filtersMany="false"
	 * @generated
	 */
  List<EClass> filterEClasses(List<EClass> eClasses, List<EClassFilter> filters);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the {@link EClass} that fits the specified fully qualified name.
	 * @param str Fully qualified name.
	 * @return Reference to the class or null there is no match.
	 * <!-- end-model-doc -->
	 * @model unique="false" strUnique="false"
	 * @generated
	 */
  EClass getEClass(String str);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.SortedSet<org.eclipse.emf.ecore.EClass>" unique="false" eClassesDataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" eClassesUnique="false" eClassesMany="false"
	 * @generated
	 */
  SortedSet<EClass> sortAlphabetically(List<EClass> eClasses);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EOperation>" unique="false" many="false" eClassUnique="false"
	 * @generated
	 */
  List<EOperation> getAllAvailableEOperations(EClass eClass);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.SortedSet<org.eclipse.emf.ecore.EOperation>" unique="false" eOperationsDataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EOperation>" eOperationsUnique="false" eOperationsMany="false"
	 * @generated
	 */
  SortedSet<EOperation> sortEOperationsAlphabetically(List<EOperation> eOperations);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Documentation tags utility methods.
	 * <!-- end-model-doc -->
	 * @model unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  String getDocumentation(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  String getEngineeringUnitsAsString(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Unit defined for a specified eTypedElement.
	 * @param eTypedElement The specified ETypedElement.
	 * @return the Unit, or null if none found.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.Unit" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Unit<?> getEngineeringUnits(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Double getValueUpdateRate(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  String getWarningOCLExpression(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  String getAlarmOCLExpression(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  String getOutOfRangeOCLExpression(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getWarningMinValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getWarningMaxValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getAlarmMinValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getAlarmMaxValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getOutOfRangeMinValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getOutOfRangeMaxValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eTypedElementUnique="false" valueUnique="false"
	 * @generated
	 */
  Ranges getRange(ETypedElement eTypedElement, Object value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  String getFullDescription(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature Tree Methods.
	 * <!-- end-model-doc -->
	 * @model unique="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
  String getAncestriesString(AbstractFeatureNode abstractFeatureNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that return the root of the tree for a
	 * specified AbstractFeatureNode.
	 * <!-- end-model-doc -->
	 * @model unique="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
  AbstractRootNode getFeatureRoot(AbstractFeatureNode abstractFeatureNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that return the list of ancestor of a
	 * specified AbstractFeatureNode, from FeatureRoot to
	 * (and including) the specified AbstractFeatureNode.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode>" unique="false" many="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
  List<AbstractFeatureNode> getAncestries(AbstractFeatureNode abstractFeatureNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that return the list of descendants of a
	 * specified AbstractFeatureNode, excluding the specified
	 * AbstractFeatureNode.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode>" unique="false" many="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
  List<AbstractFeatureNode> getDescendants(AbstractFeatureNode abstractFeatureNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that return the list of available child
	 * EStructuralFeature type for a given Node.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EStructuralFeature>" unique="false" many="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
  List<EStructuralFeature> getChildEStructuralFeatures(AbstractFeatureNode abstractFeatureNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that resolve the value of a FeatureNode
	 * for a specified source EObjet.
	 * <!-- end-model-doc -->
	 * @model unique="false" sourceObjectUnique="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
  Object resolve(EObject sourceObject, AbstractFeatureNode abstractFeatureNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model sourceObjectUnique="false" abstractFeatureNodeUnique="false" valueUnique="false"
	 * @generated
	 */
  void setValue(EObject sourceObject, AbstractFeatureNode abstractFeatureNode, Object value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that tells whether or not the
	 * FeatureNode is currently accessible for
	 * the specified source EObject.
	 * <!-- end-model-doc -->
	 * @model unique="false" sourceObjectUnique="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
  boolean isResolved(EObject sourceObject, AbstractFeatureNode abstractFeatureNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" listRootNodeUnique="false"
	 * @generated
	 */
  AbstractFeatureListNode getLeaf(ListRootNode listRootNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource Support.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.IFile" unique="false" resourceDataType="ca.gc.asc_csa.apogy.common.emf.Resource" resourceUnique="false"
	 * @generated
	 */
  IFile getFile(Resource resource);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the content contained in the resource.
	 * @param uri Resource uri.
	 * @return Reference to the content.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.EList<org.eclipse.emf.ecore.EObject>" unique="false" many="false" uriDataType="ca.gc.asc_csa.apogy.common.emf.URI" uriUnique="false"
	 * @generated
	 */
	EList<EObject> getContent(URI uri);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timed Support
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.SortedSet<ca.gc.asc_csa.apogy.common.emf.Timed>" unique="false" timedCollectionDataType="ca.gc.asc_csa.apogy.common.emf.Collection<ca.gc.asc_csa.apogy.common.emf.Timed>" timedCollectionUnique="false"
	 * @generated
	 */
	SortedSet<Timed> sortTimed(Collection<Timed> timedCollection);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the time span of a collection
	 * of Timed elements.
	 * <!-- end-model-doc -->
	 * @model unique="false" timedCollectionDataType="ca.gc.asc_csa.apogy.common.emf.Collection<ca.gc.asc_csa.apogy.common.emf.Timed>" timedCollectionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='s'"
	 * @generated
	 */
	double getTimeSpan(Collection<Timed> timedCollection);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return an EObject unique ID.
	 * @param eObject The EObject.
	 * @return the unique ID, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" eObjectUnique="false"
	 * @generated
	 */
	String getID(EObject eObject);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Searches the ResourceSet for an EObject with the specified id.
	 * @param resourceSet Reference to the resourceSet
	 * @param id Object identifier.
	 * <!-- end-model-doc -->
	 * @model unique="false" resourceSetDataType="ca.gc.asc_csa.apogy.common.emf.ResourceSet" resourceSetUnique="false" idUnique="false"
	 * @generated
	 */
	EObject getEObjectById(ResourceSet resourceSet, String id);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generates and returns a default name for a specific feature container.
	 * @param eContainer The instance of the container.
	 * @param eObject The instance of the object to name.
	 * @param objectReference The reference to the object.
	 * @return A unique name.
	 * <!-- end-model-doc -->
	 * @model unique="false" eContainerUnique="false" eObjectUnique="false" objectReferenceUnique="false"
	 * @generated
	 */
	String getDefaultName(EObject eContainer, EObject eObject, EReference objectReference);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns only the objects that are not archived
	 * @param objects Refers to the array containing the objects to filter
	 * @return Array of filtered objects
	 * <!-- end-model-doc -->
	 * @model unique="false" objectsUnique="false" objectsMany="true"
	 * @generated
	 */
	EList<Object> filterArchived(EList<Object> objects);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the child classes of the specified parent class. The result list contains
	 * only implementation classes (not abstract).
	 * @param parentEClass Type of the class to find child classes.
	 * @return List of child classes.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false" parentEClassUnique="false"
	 * @generated
	 */
	List<EClass> getChildEClasses(EClass parentEClass);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of all the object's child EReferences that are either null or a list
	 * @param eObject The parent object
	 * @return List of EReferences that are either null or a list
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.EList<org.eclipse.emf.ecore.EReference>" unique="false" many="false" eObjectUnique="false"
	 * @generated
	 */
	EList<EReference> getSettableEReferences(EObject eObject);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the string representation of the list of {@link Named}.
	 * @param nameds List of named.
	 * @param separator String used to separate the nameds.
	 * @return Reference to the string representation.
	 * <!-- end-model-doc -->
	 * @model unique="false" namedsDataType="ca.gc.asc_csa.apogy.common.emf.ListNamed" namedsUnique="false" separatorUnique="false"
	 * @generated
	 */
	String toString(List<? extends Named> nameds, String separator);

} // ApogyCommonEMFFacade
