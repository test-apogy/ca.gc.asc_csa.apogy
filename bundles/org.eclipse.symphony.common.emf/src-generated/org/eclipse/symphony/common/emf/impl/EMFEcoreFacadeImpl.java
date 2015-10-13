/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.measure.unit.Unit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.symphony.common.emf.AbstractFeatureListNode;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;
import org.eclipse.symphony.common.emf.AbstractFeatureTreeNode;
import org.eclipse.symphony.common.emf.AbstractRootNode;
import org.eclipse.symphony.common.emf.Activator;
import org.eclipse.symphony.common.emf.EClassFilter;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.EcoreConstants;
import org.eclipse.symphony.common.emf.ListFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.common.emf.Ranges;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.emf.TreeFeatureNode;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class EMFEcoreFacadeImpl extends MinimalEObjectImpl.Container implements
		EMFEcoreFacade {

	private static List<EClass> availableTypes = null;

	private static EMFEcoreFacade instance = null;

	public static EMFEcoreFacade getInstance() {
		if (instance == null) {
			instance = new EMFEcoreFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFEcoreFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcorePackage.Literals.EMF_ECORE_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ALL_AVAILABLE_ECLASSES:
				return getAllAvailableEClasses();
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ALL_SUB_ECLASSES__ECLASS:
				return getAllSubEClasses((EClass)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___FILTER_ECLASSES__LIST_ECLASSFILTER:
				return filterEClasses((List<EClass>)arguments.get(0), (EClassFilter)arguments.get(1));
			case EMFEcorePackage.EMF_ECORE_FACADE___FILTER_ECLASSES__LIST_LIST:
				return filterEClasses((List<EClass>)arguments.get(0), (List<EClassFilter>)arguments.get(1));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ECLASS__STRING:
				return getEClass((String)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___SORT_ALPHABETICALLY__LIST:
				return sortAlphabetically((List<EClass>)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ALL_AVAILABLE_EOPERATIONS__ECLASS:
				return getAllAvailableEOperations((EClass)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___SORT_EOPERATIONS_ALPHABETICALLY__LIST:
				return sortEOperationsAlphabetically((List<EOperation>)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_DOCUMENTATION__ETYPEDELEMENT:
				return getDocumentation((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ENGINEERING_UNITS_AS_STRING__ETYPEDELEMENT:
				return getEngineeringUnitsAsString((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ENGINEERING_UNITS__ETYPEDELEMENT:
				return getEngineeringUnits((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_VALUE_UPDATE_RATE__ETYPEDELEMENT:
				return getValueUpdateRate((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_WARNING_OCL_EXPRESSION__ETYPEDELEMENT:
				return getWarningOCLExpression((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ALARM_OCL_EXPRESSION__ETYPEDELEMENT:
				return getAlarmOCLExpression((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_OUT_OF_RANGE_OCL_EXPRESSION__ETYPEDELEMENT:
				return getOutOfRangeOCLExpression((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_WARNING_MIN_VALUE__ETYPEDELEMENT:
				return getWarningMinValue((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_WARNING_MAX_VALUE__ETYPEDELEMENT:
				return getWarningMaxValue((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ALARM_MIN_VALUE__ETYPEDELEMENT:
				return getAlarmMinValue((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ALARM_MAX_VALUE__ETYPEDELEMENT:
				return getAlarmMaxValue((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_OUT_OF_RANGE_MIN_VALUE__ETYPEDELEMENT:
				return getOutOfRangeMinValue((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_OUT_OF_RANGE_MAX_VALUE__ETYPEDELEMENT:
				return getOutOfRangeMaxValue((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_RANGE__ETYPEDELEMENT_OBJECT:
				return getRange((ETypedElement)arguments.get(0), arguments.get(1));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_FULL_DESCRIPTION__ETYPEDELEMENT:
				return getFullDescription((ETypedElement)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ANCESTRIES_STRING__ABSTRACTFEATURENODE:
				return getAncestriesString((AbstractFeatureNode)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_FEATURE_ROOT__ABSTRACTFEATURENODE:
				return getFeatureRoot((AbstractFeatureNode)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ANCESTRIES__ABSTRACTFEATURENODE:
				return getAncestries((AbstractFeatureNode)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_DESCENDANTS__ABSTRACTFEATURENODE:
				return getDescendants((AbstractFeatureNode)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_CHILD_ESTRUCTURAL_FEATURES__ABSTRACTFEATURENODE:
				return getChildEStructuralFeatures((AbstractFeatureNode)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___RESOLVE__EOBJECT_ABSTRACTFEATURENODE:
				return resolve((EObject)arguments.get(0), (AbstractFeatureNode)arguments.get(1));
			case EMFEcorePackage.EMF_ECORE_FACADE___SET_VALUE__EOBJECT_ABSTRACTFEATURENODE_OBJECT:
				setValue((EObject)arguments.get(0), (AbstractFeatureNode)arguments.get(1), arguments.get(2));
				return null;
			case EMFEcorePackage.EMF_ECORE_FACADE___IS_RESOLVED__EOBJECT_ABSTRACTFEATURENODE:
				return isResolved((EObject)arguments.get(0), (AbstractFeatureNode)arguments.get(1));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_LEAF__LISTROOTNODE:
				return getLeaf((ListRootNode)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_FILE__RESOURCE:
				return getFile((Resource)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_CONTENT__URI:
				return getContent((URI)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___SORT_TIMED__COLLECTION:
				return sortTimed((Collection<Timed>)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_TIME_SPAN__COLLECTION:
				return getTimeSpan((Collection<Timed>)arguments.get(0));
			case EMFEcorePackage.EMF_ECORE_FACADE___GET_ID__EOBJECT:
				return getID((EObject)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<EClass> getAllAvailableEClasses() {
		try {
			if (availableTypes == null) {
				availableTypes = new ArrayList<EClass>();
				List<EPackage> ePackages = new ArrayList<EPackage>();
				List<String> ePackagesDescriptor = new ArrayList<String>();

				Set<Entry<String, Object>> packageSet = EPackage.Registry.INSTANCE
						.entrySet();

				for (Entry<String, Object> mp_entry : packageSet) {
					Object val = mp_entry.getValue();

					if (val instanceof EPackage) {
						ePackages.add((EPackage) val);
					} else if (val instanceof EPackage.Descriptor) {
						// instance of EPackageDescriptor, therefore we need to
						// get that package
						// in a seperate call because we will get a
						// ConcurrentModification (since we are already
						// iterating over the Registry hashmap)
						ePackagesDescriptor.add(mp_entry.getKey());
					}
				}
				// recover uninstantiate package from their description
				for (String description : ePackagesDescriptor) {
					try {
						EPackage ePackage = EPackage.Registry.INSTANCE
								.getEPackage(description);
						ePackages.add(ePackage);
					} catch (Throwable t) {
						t.printStackTrace();
					}
				}

				// retrieve EClass from EPackages
				for (EPackage iPackage : ePackages) {
					for (EObject eObj : iPackage.eContents()) {
						if (!(eObj instanceof EClass)) {
							continue;
						}
						EClass eClass = (EClass) eObj;
						availableTypes.add(eClass);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return availableTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<EClass> getAllSubEClasses(final EClass superClass) {
		List<EClass> classes = null;

		if (superClass != null) {
			EClassFilter filter = new EClassFilter() {
				public boolean filter(EClass eClass) {
					boolean result = superClass.isSuperTypeOf(eClass)
							&& !eClass.isInterface() && !eClass.isAbstract();

					return result;
				}
			};

			List<EClass> list = EMFEcoreFacade.INSTANCE
					.getAllAvailableEClasses();
			classes = EMFEcoreFacade.INSTANCE.filterEClasses(list, filter);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public SortedSet<EClass> sortAlphabetically(List<EClass> eClasses) {
		SortedSet<EClass> sortedTypes = new TreeSet<EClass>(
				new Comparator<EClass>() {
					public int compare(EClass o1, EClass o2) {
						try {
							if (o1.getName().compareTo(o2.getName()) == 0) {
								return o1.getInstanceClassName().compareTo(
										o2.getInstanceClassName());
							} else {
								return o1.getName().compareTo(o2.getName());
							}
						} catch (Exception e) {
							e.printStackTrace();
							return -1;
						}
					}
				});

		for (EClass eClass : eClasses) {
			// Keep only classes that has a proper name and InstanceClassName.
			if ((eClass != null) && (eClass.getName() != null)
					&& (eClass.getInstanceClassName() != null)) {
				sortedTypes.add(eClass);
			}
		}

		return sortedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<EOperation> getAllAvailableEOperations(EClass eClass) {
		return eClass.getEAllOperations();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public SortedSet<EOperation> sortEOperationsAlphabetically(
			List<EOperation> eOperations) {
		SortedSet<EOperation> sortedTypes = new TreeSet<EOperation>(
				new Comparator<EOperation>() {
					public int compare(EOperation o1, EOperation o2) {
						try {
							return o1.getName().compareTo(o2.getName());
						} catch (Exception e) {
							e.printStackTrace();
							return -1;
						}
					}
				});

		for (EOperation eOperation : eOperations) {
			// Keep only eOperations that has a proper name.
			if ((eOperation != null) && (eOperation.getName() != null)) {
				sortedTypes.add(eOperation);
			}
		}

		return sortedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getDocumentation(ETypedElement eTypedElement) 
	{
		return getAnnotationDetail(eTypedElement, "documentation");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Unit getEngineeringUnits(ETypedElement eTypedElement) 
	{
		Unit<?> unit = null;
		
		// Gets the string defining the units.
		String unitsAsString = getEngineeringUnitsAsString(eTypedElement);
		if(unitsAsString != null)
		{
			try
			{
				unit = Unit.valueOf(unitsAsString);
			}
			catch(Throwable t)
			{
				Logger.INSTANCE.log(Activator.ID, this, "No units found for <" + unitsAsString + "> !", EventSeverity.WARNING, t);
				t.printStackTrace();
			}		
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getEngineeringUnitsAsString(ETypedElement eTypedElement)
	{
		return getAnnotationDetail(eTypedElement, EcoreConstants.CSA_ENGINEERING_UNITS);
	} 

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Double getValueUpdateRate(ETypedElement eTypedElement) {
		String updateRate = getAnnotationDetail(eTypedElement,
				EcoreConstants.CSA_UPDATE_RATE);
		if (updateRate != null) {
			try {
				return Double.parseDouble(updateRate);
			} catch (Exception e) {
				e.printStackTrace();
				return -1.0;
			}
		}

		return -1.0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getWarningOCLExpression(ETypedElement eTypedElement) {
		return getAnnotationDetail(eTypedElement,
				EcoreConstants.CSA_WARNING_OCL_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getAlarmOCLExpression(ETypedElement eTypedElement) {
		return getAnnotationDetail(eTypedElement,
				EcoreConstants.CSA_ALARM_OCL_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getOutOfRangeOCLExpression(ETypedElement eTypedElement) {
		return getAnnotationDetail(eTypedElement,
				EcoreConstants.CSA_OUTSIDE_RANGE_OCL_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Number getWarningMinValue(ETypedElement eTypedElement) {
		return getAnnotationDetailAsNumber(eTypedElement,
				EcoreConstants.CSA_WARNING_MIN_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Number getWarningMaxValue(ETypedElement eTypedElement) {
		return getAnnotationDetailAsNumber(eTypedElement,
				EcoreConstants.CSA_WARNING_MAX_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Number getAlarmMinValue(ETypedElement eTypedElement) {
		return getAnnotationDetailAsNumber(eTypedElement,
				EcoreConstants.CSA_ALARM_MIN_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Number getAlarmMaxValue(ETypedElement eTypedElement) {
		return getAnnotationDetailAsNumber(eTypedElement,
				EcoreConstants.CSA_ALARM_MAX_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Number getOutOfRangeMinValue(ETypedElement eTypedElement) {
		return getAnnotationDetailAsNumber(eTypedElement,
				EcoreConstants.CSA_OUTSIDE_RANGE_MIN_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Number getOutOfRangeMaxValue(ETypedElement eTypedElement) {
		return getAnnotationDetailAsNumber(eTypedElement,
				EcoreConstants.CSA_OUTSIDE_RANGE_MAX_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Ranges getRange(ETypedElement eTypedElement, Object value) {
		if (value instanceof Number) {
			Number number = (Number) value;

			// Check for violation for minimum values
			// Check if the value is below the OutOfRange minimum.
			Number outOfRangeMin = getOutOfRangeMinValue(eTypedElement);
			if (outOfRangeMin != null
					&& number.doubleValue() <= outOfRangeMin.doubleValue())
				return Ranges.OUT_OF_RANGE;

			// Check if the value is below the Alarm minimum.
			Number alarmMin = getAlarmMinValue(eTypedElement);
			if (alarmMin != null
					&& number.doubleValue() <= alarmMin.doubleValue())
				return Ranges.ALARM;

			// Check if the value is below the Warning minimum.
			Number warningMin = getWarningMinValue(eTypedElement);
			if (warningMin != null
					&& number.doubleValue() <= warningMin.doubleValue())
				return Ranges.WARNING;

			// Check for violation for maximum values
			// Check if the value is above the OutOfRange maximum.
			Number outOfRangeMax = getOutOfRangeMaxValue(eTypedElement);
			if (outOfRangeMax != null
					&& number.doubleValue() >= outOfRangeMax.doubleValue())
				return Ranges.OUT_OF_RANGE;

			// Check if the value is above the Alarm maximum.
			Number alarmMax = getAlarmMaxValue(eTypedElement);
			if (alarmMax != null
					&& number.doubleValue() >= alarmMax.doubleValue())
				return Ranges.ALARM;

			// Check if the value is above the Warning maximum.
			Number warningMax = getWarningMaxValue(eTypedElement);
			if (warningMax != null
					&& number.doubleValue() >= warningMax.doubleValue())
				return Ranges.WARNING;

			// If we got to here, either we are NOMINAL or no Ranges were
			// defined.
			if (outOfRangeMin != null || alarmMin != null || warningMin != null
					|| outOfRangeMax != null || alarmMax != null
					|| warningMax != null) {
				return Ranges.NOMINAL;
			} else {
				return Ranges.UNKNOWN;
			}
		} else {
			return Ranges.UNKNOWN;
		}
	}

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated_NOT
	   */
	  public String getFullDescription(ETypedElement eTypedElement)
	  {
		  String fullDocumentation = "";
		  
		  String description = "Description : " + EMFEcoreFacade.INSTANCE.getDocumentation(eTypedElement);
		  String units = "Units : " + EMFEcoreFacade.INSTANCE.getEngineeringUnits(eTypedElement);
		  
		  // Out Of range
		  Number oorMin = EMFEcoreFacade.INSTANCE.getOutOfRangeMinValue(eTypedElement);
		  Number oorMax = EMFEcoreFacade.INSTANCE.getOutOfRangeMaxValue(eTypedElement);
		  String oorLimits = "Out Of Range Limits : " + getRangeString(oorMin, oorMax);
		  
		  // Alarm range
		  Number alarmMin = EMFEcoreFacade.INSTANCE.getAlarmMinValue(eTypedElement);
		  Number alarmMax = EMFEcoreFacade.INSTANCE.getAlarmMaxValue(eTypedElement);
		  String alarmsLimits = "Alarms Limits : " + getRangeString(alarmMin, alarmMax);
		  
		  // Warning
		  Number warningMin = EMFEcoreFacade.INSTANCE.getWarningMinValue(eTypedElement);
		  Number warningMax = EMFEcoreFacade.INSTANCE.getWarningMaxValue(eTypedElement);
		  String warningLimits = "Warning Limits : " + getRangeString(warningMin, warningMax);
		  
		  fullDocumentation += description + "\n";
		  fullDocumentation += units + "\n";
		  fullDocumentation += oorLimits + "\n";
		  fullDocumentation += alarmsLimits + "\n";
		  fullDocumentation += warningLimits + "\n";
		  
		  return fullDocumentation;
	  }
	  
	  private String getRangeString(Number min, Number max)
	  {
		  String rangeString = "";
		  if(min != null && max != null) 
		  {
			  rangeString = min.toString() + " > value > " + max.toString();
		  }	  
		  else if(min != null && max == null)
		  {
			  rangeString = min.toString() + " > value";
		  }
		  else if(min == null && max != null)
		  {
			  rangeString = "value > " + max.toString();	 	 
		  }
		  else
		  {
			  rangeString = "N/A";
		  }
		  
		  return rangeString;
	  }
	  
 	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getAncestriesString(AbstractFeatureNode abstractFeatureNode) {
		String result = "";

		List<AbstractFeatureNode> ancestries = getAncestries(abstractFeatureNode);

		Iterator<AbstractFeatureNode> it = ancestries.iterator();

		while (it.hasNext()) {
			AbstractFeatureNode node = it.next();
			if (node instanceof AbstractFeatureSpecifier) {
				AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) node;

				if (abstractFeatureSpecifier.getStructuralFeature() != null) {
					result += abstractFeatureSpecifier.getStructuralFeature()
							.getName();

					if (abstractFeatureSpecifier.isMultiValued()) {
						result += "[" + abstractFeatureSpecifier.getIndex()
								+ "]";
					}

					if (it.hasNext())
						result += ".";
				}
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractRootNode getFeatureRoot(
			AbstractFeatureNode abstractFeatureNode) {
		if (abstractFeatureNode instanceof AbstractRootNode) {
			return (AbstractRootNode) abstractFeatureNode;
		} else {
			AbstractRootNode root = null;
			AbstractFeatureNode node = abstractFeatureNode;

			while (root == null && node != null) {
				if (node instanceof AbstractRootNode) {
					root = (AbstractRootNode) node;
				} else if (node instanceof ListFeatureNode) {
					node = ((ListFeatureNode) node).getParent();
				} else if (node instanceof TreeFeatureNode) {
					node = ((TreeFeatureNode) node).getParent();
				}
			}

			return root;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<AbstractFeatureNode> getAncestries(
			AbstractFeatureNode abstractFeatureNode) {
		List<AbstractFeatureNode> ancestries = new ArrayList<AbstractFeatureNode>();

		AbstractFeatureNode feature = abstractFeatureNode;
		while (feature != null) {
			ancestries.add(0, feature);

			if (feature instanceof ListFeatureNode) {
				feature = ((ListFeatureNode) feature).getParent();
			} else if (feature instanceof TreeFeatureNode) {
				feature = ((TreeFeatureNode) feature).getParent();
			} else if (feature instanceof AbstractRootNode) {
				feature = null;
			}
		}

		return ancestries;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<AbstractFeatureNode> getDescendants(
			AbstractFeatureNode abstractFeatureNode) {
		List<AbstractFeatureNode> descendants = new ArrayList<AbstractFeatureNode>();

		// Explore the node childrens
		AbstractFeatureNode node = abstractFeatureNode;
		if (node instanceof AbstractFeatureTreeNode) {
			getDescendants((AbstractFeatureTreeNode) node, descendants);
		} else if (node instanceof AbstractFeatureListNode) {
			AbstractFeatureListNode abstractFeatureListNode = (AbstractFeatureListNode) node;
			getDescendants(abstractFeatureListNode, descendants);
		}

		return descendants;
	}

	private void getDescendants(
			AbstractFeatureTreeNode abstractFeatureTreeNode,
			final List<AbstractFeatureNode> descendants) {
		// Adds children of the node to the list.
		descendants.addAll(abstractFeatureTreeNode.getChildren());

		// Goes through the list of children
		for (AbstractFeatureTreeNode child : abstractFeatureTreeNode
				.getChildren()) {
			getDescendants(child, descendants);
		}
	}

	private void getDescendants(
			AbstractFeatureListNode abstractFeatureListNode,
			final List<AbstractFeatureNode> descendants) {
		// Adds children of the node to the list.
		if (abstractFeatureListNode.getChild() != null) {
			descendants.add(abstractFeatureListNode.getChild());
			getDescendants(abstractFeatureListNode.getChild());
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<EStructuralFeature> getChildEStructuralFeatures(
			AbstractFeatureNode abstractFeatureNode) {
		List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();

		if (abstractFeatureNode instanceof AbstractRootNode) {
			AbstractRootNode abstractRootNode = (AbstractRootNode) abstractFeatureNode;
			if (abstractRootNode.getSourceClass() instanceof EClass) {
				EClass eClass = (EClass) abstractRootNode.getSourceClass();
				features.addAll(eClass.getEAllStructuralFeatures());
			}
		} else if (abstractFeatureNode instanceof AbstractFeatureSpecifier) {
			AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) abstractFeatureNode;
			EStructuralFeature eStructuralFeature = abstractFeatureSpecifier
					.getStructuralFeature();

			if (eStructuralFeature != null) {
				if (eStructuralFeature.getEType() instanceof EClass) {
					EClass eClass = (EClass) eStructuralFeature.getEType();
					features.addAll(eClass.getEAllStructuralFeatures());
				}
			}
		}

		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Object resolve(EObject sourceObject,
			AbstractFeatureNode abstractFeatureNode) {
		AbstractRootNode featureRoot = getFeatureRoot(abstractFeatureNode);

		Object result = null;

		// Check that the specified source object is compatible with the tree
		// root.
		if (featureRoot.getSourceClass().isSuperTypeOf(sourceObject.eClass())) {
			// Explore the ancestors of the abstractFeatureNode
			List<AbstractFeatureNode> ancestries = getAncestries(abstractFeatureNode);

			EObject eObject = sourceObject;
			Iterator<AbstractFeatureNode> it = ancestries.iterator();
			while (it.hasNext() && (eObject != null)) {
				AbstractFeatureNode node = (AbstractFeatureNode) it.next();
				if (node instanceof AbstractFeatureSpecifier) {
					AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) node;
					Object object = null;
					if (featureSpecifier.isMultiValued()) {
						BasicEList<?> list = (BasicEList<?>) eObject
								.eGet(featureSpecifier.getStructuralFeature());

						// Check the index of the FeatureNode is valid
						if (featureSpecifier.getIndex() >= 0
								&& featureSpecifier.getIndex() < list.size()) {
							object = list.get(featureSpecifier.getIndex());
						} else {
							object = null;
						}
					} else {
						object = eObject.eGet(featureSpecifier
								.getStructuralFeature());
					}

					// If the end of the list has not been reached yet
					if (it.hasNext()) {
						if (object instanceof EObject) {
							eObject = (EObject) object;
						} else {
							eObject = null;
						}
					} else {
						result = object;
					}
				}
			}

			return result;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setValue(EObject sourceObject,
			AbstractFeatureNode abstractFeatureNode, Object value) {
		if (abstractFeatureNode instanceof AbstractFeatureSpecifier) {
			List<AbstractFeatureNode> ancestries = getAncestries(abstractFeatureNode);
			ancestries.remove(abstractFeatureNode);

			EObject eObject = sourceObject;
			Iterator<AbstractFeatureNode> it = ancestries.iterator();
			while (it.hasNext()) {
				AbstractFeatureNode node = it.next();
				if (node instanceof AbstractFeatureSpecifier) {
					AbstractFeatureSpecifier specifier = (AbstractFeatureSpecifier) node;
					eObject = (EObject) eObject.eGet(specifier
							.getStructuralFeature());
				}
			}

			if (eObject != null) {
				AbstractFeatureSpecifier s = (AbstractFeatureSpecifier) abstractFeatureNode;
				eObject.eSet(s.getStructuralFeature(), value);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public boolean isResolved(EObject sourceObject,
			AbstractFeatureNode abstractFeatureNode) {
		boolean result = true;
		AbstractRootNode featureRoot = getFeatureRoot(abstractFeatureNode);

		// Check that the specified source object is compatible with the tree
		// root.
		if (featureRoot.getSourceClass().isSuperTypeOf(sourceObject.eClass())) {
			// Explore the ancestors of the abstractFeatureNode
			List<AbstractFeatureNode> ancestries = getAncestries(abstractFeatureNode);

			EObject eObject = sourceObject;
			Iterator<AbstractFeatureNode> it = ancestries.iterator();
			while (it.hasNext() && (eObject != null) && (result)) {
				AbstractFeatureNode node = (AbstractFeatureNode) it.next();
				if (node instanceof AbstractFeatureSpecifier) {
					AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) node;
					Object object = null;
					if (featureSpecifier.isMultiValued()) {
						BasicEList<?> list = (BasicEList<?>) eObject
								.eGet(featureSpecifier.getStructuralFeature());

						// Check the index of the FeatureNode is valid
						if (featureSpecifier.getIndex() >= 0
								&& featureSpecifier.getIndex() < list.size()) {
							object = list.get(featureSpecifier.getIndex());
						} else {
							object = null;
							result = false;
						}
					} else {
						object = eObject.eGet(featureSpecifier
								.getStructuralFeature());
					}

					// If the end of the list has not been reached yet
					if (it.hasNext()) {
						if (object instanceof EObject) {
							eObject = (EObject) object;
						} else {
							result = false;
						}
					}
				}
			}
		} else {
			result = false;
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractFeatureListNode getLeaf(ListRootNode listRootNode) {
		AbstractFeatureListNode node = listRootNode;
		if (node != null){
			while (node.getChild() != null) {
				node = node.getChild();
			}
		}

		return node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IFile getFile(Resource resource) {
		if (resource != null) {
			URI uri = resource.getURI();
			uri = resource.getResourceSet().getURIConverter().normalize(uri);
			String scheme = uri.scheme();
			if ("platform".equals(scheme) && uri.segmentCount() > 1
					&& "resource".equals(uri.segment(0))) {
				StringBuffer platformResourcePath = new StringBuffer();
				for (int j = 1, size = uri.segmentCount(); j < size; ++j) {
					platformResourcePath.append('/');
					platformResourcePath.append(uri.segment(j));
				}
				return ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(platformResourcePath.toString()));
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EList<EObject> getContent(URI uri) {
		
		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new XMIResourceFactoryImpl());
				
		Resource resource = resourceSet.getResource(uri, true);

		return resource.getContents();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<Timed> sortTimed(Collection<Timed> timedCollection) 
	{
		SortedSet<Timed> sorted = new TreeSet<Timed>(new TimedComparator());
		
		sorted.addAll(timedCollection);
		
		return sorted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getTimeSpan(Collection<Timed> timedCollection) 
	{
		double span = 0;
		
		// Gets a sorted set first.
		SortedSet<Timed> sorted = sortTimed(timedCollection);
		
		if(sorted.size() > 1)
		{
			Timed earliest = sorted.first();
			Timed latest = sorted.last();
			
			span = (latest.getTime().getTime() - earliest.getTime().getTime()) * 0.001;
		}
		
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getID(EObject eObject) 
	{
		String id = null;
		if (eObject != null && eObject.eResource() instanceof XMIResource) 
		{
			id = ((XMIResource) eObject.eResource()).getID(eObject);		
		}		
		return id;
	}

	/**
	 * Returns the string value found in the EAnnotation GenModel for a given
	 * ETypedElement and key.
	 * 
	 * @param eTypedElement
	 *            The eTypedElement.
	 * @param key
	 *            The key of the details in the annotation.
	 * @return The value string found, or null if none could be extracted.
	 */
	protected String getAnnotationDetail(ETypedElement eTypedElement, String key) {
		EAnnotation annotation = eTypedElement
				.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
		if (annotation != null) {
			EMap<String, String> map = annotation.getDetails();
			if (map != null)
				return map.get(key);
		}
		return null;
	}

	/**
	 * Returns the number value found in the EAnnotation GenModel for a given
	 * ETypedElement and key.
	 * 
	 * @param eTypedElement
	 *            The eTypedElement.
	 * @param key
	 *            The key of the details in the annotation.
	 * @return The value number found, or null if none could be extracted.
	 */
	protected Number getAnnotationDetailAsNumber(ETypedElement eTypedElement,
			String key) {
		EAnnotation annotation = eTypedElement
				.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
		if (annotation != null) {
			EMap<String, String> map = annotation.getDetails();
			if (map != null) {
				String valueString = map.get(key);
				try {
					return new Double(valueString);
				} catch (Exception e) {
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<EClass> filterEClasses(List<EClass> eClasses,
			EClassFilter filter) {
		List<EClassFilter> filters = new ArrayList<EClassFilter>();
		filters.add(filter);
		return filterEClasses(eClasses, filters);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<EClass> filterEClasses(List<EClass> eClasses,
			List<EClassFilter> filters) {
		List<EClass> output = new ArrayList<EClass>();

		for (EClass eClass : eClasses) {
			boolean keep = true;
			Iterator<EClassFilter> it = filters.iterator();
			while (it.hasNext() && (keep == true)) {
				EClassFilter filter = it.next();
				keep = filter.filter(eClass);
			}

			if (keep) {
				output.add(eClass);
			}
		}

		return output;
	}

	/**
	 * Returns the {@link EClass} that fits the specified fully qualified name.
	 * 
	 * @param eClasses
	 *            List of classes.
	 * @param str
	 *            Fully qualified name.
	 * @return Reference to the class or null there is no match.
	 * @generated_NOT
	 */
	public EClass getEClass(String str) {
		EClass result = null;
		Iterator<EClass> classes = getAllAvailableEClasses().iterator();
		while (result == null && classes.hasNext()) {
			EClass clazz = classes.next();
			if (clazz.getInstanceTypeName() != null &&
				clazz.getInstanceTypeName().equals(str)) {
				result = clazz;
			}
		}
		return result;
	}
	
	protected class TimedComparator implements Comparator<Timed>
	{
		@Override
		public int compare(Timed o1, Timed o2) 
		{
			long time1 = o1.getTime().getTime();
			long time2 = o2.getTime().getTime();
			
			if(time1 < time2)
			{
				return -1;
			}
			else if(time1 > time2)
			{
				return 1;
			}
			else 
			{
				return 0;
			}
		}		
	}
} // EMFEcoreFacadeImpl
