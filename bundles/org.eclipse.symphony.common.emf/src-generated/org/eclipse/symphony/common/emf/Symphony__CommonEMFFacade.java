/**
 */
package org.eclipse.symphony.common.emf;

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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.symphony.common.emf.EClassFilter;
import org.eclipse.symphony.common.emf.impl.Symphony__CommonEMFFacadeImpl;

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
 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage#getSymphony__CommonEMFFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonEMFFacade extends EObject
{
	public static Symphony__CommonEMFFacade INSTANCE = Symphony__CommonEMFFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false" superClassUnique="false"
	 * @generated
	 */
  List<EClass> getAllSubEClasses(EClass superClass);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false" eClassesDataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EClass>" eClassesUnique="false" eClassesMany="false" filterDataType="org.eclipse.symphony.common.emf.EClassFilter" filterUnique="false"
	 * @generated
	 */
  List<EClass> filterEClasses(List<EClass> eClasses, EClassFilter filter);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EClass>" unique="false" many="false" eClassesDataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EClass>" eClassesUnique="false" eClassesMany="false" filtersDataType="org.eclipse.symphony.common.emf.List<org.eclipse.symphony.common.emf.EClassFilter>" filtersUnique="false" filtersMany="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.SortedSet<org.eclipse.emf.ecore.EClass>" unique="false" eClassesDataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EClass>" eClassesUnique="false" eClassesMany="false"
	 * @generated
	 */
  SortedSet<EClass> sortAlphabetically(List<EClass> eClasses);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EOperation>" unique="false" many="false" eClassUnique="false"
	 * @generated
	 */
  List<EOperation> getAllAvailableEOperations(EClass eClass);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.SortedSet<org.eclipse.emf.ecore.EOperation>" unique="false" eOperationsDataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EOperation>" eOperationsUnique="false" eOperationsMany="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.Unit" unique="false" eTypedElementUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getWarningMinValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getWarningMaxValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getAlarmMinValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getAlarmMaxValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.Number" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Number getOutOfRangeMinValue(ETypedElement eTypedElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.Number" unique="false" eTypedElementUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.symphony.common.emf.AbstractFeatureNode>" unique="false" many="false" abstractFeatureNodeUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.symphony.common.emf.AbstractFeatureNode>" unique="false" many="false" abstractFeatureNodeUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.emf.ecore.EStructuralFeature>" unique="false" many="false" abstractFeatureNodeUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.IFile" unique="false" resourceDataType="org.eclipse.symphony.common.emf.Resource" resourceUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.EList<org.eclipse.emf.ecore.EObject>" unique="false" many="false" uriDataType="org.eclipse.symphony.common.emf.URI" uriUnique="false"
	 * @generated
	 */
	EList<EObject> getContent(URI uri);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timed Support
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.common.emf.SortedSet<org.eclipse.symphony.common.emf.Timed>" unique="false" timedCollectionDataType="org.eclipse.symphony.common.emf.Collection<org.eclipse.symphony.common.emf.Timed>" timedCollectionUnique="false"
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
	 * @model unique="false" timedCollectionDataType="org.eclipse.symphony.common.emf.Collection<org.eclipse.symphony.common.emf.Timed>" timedCollectionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='s'"
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

} // Symphony__CommonEMFFacade
