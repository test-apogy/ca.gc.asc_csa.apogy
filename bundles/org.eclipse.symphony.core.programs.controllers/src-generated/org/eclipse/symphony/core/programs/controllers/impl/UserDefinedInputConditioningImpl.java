/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import java.util.Collection;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.io.jinput.EComponent;
import org.eclipse.symphony.core.programs.controllers.ControllerFacade;
import org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;
import org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Defined Input Conditionning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.UserDefinedInputConditioningImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.UserDefinedInputConditioningImpl#getTransferFunction <em>Transfer Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserDefinedInputConditioningImpl extends AbstractInputConditioningImpl implements UserDefinedInputConditioning 
{
	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	private TreeSet<CustomInputConditioningPoint> sortedPoints = null;
	
	private Adapter pointsAdapter;
	
	/**
	 * The cached value of the '{@link #getTransferFunction() <em>Transfer Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomInputConditioningPoint> transferFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected UserDefinedInputConditioningImpl() 
	{
		super();
		this.eAdapters().add(getPointsAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreControllersPackage.Literals.USER_DEFINED_INPUT_CONDITIONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomInputConditioningPoint> getTransferFunction() 
	{
		if (transferFunction == null) {
			transferFunction = new EObjectContainmentEList<CustomInputConditioningPoint>(CustomInputConditioningPoint.class, this, EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION);
		}
		return transferFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION:
				return ((InternalEList<?>)getTransferFunction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__UNITS:
				return getUnits();
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION:
				return getTransferFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__UNITS:
				setUnits((String)newValue);
				return;
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION:
				getTransferFunction().clear();
				getTransferFunction().addAll((Collection<? extends CustomInputConditioningPoint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION:
				getTransferFunction().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION:
				return transferFunction != null && !transferFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (units: ");
		result.append(units);
		result.append(')');
		return result.toString();
	}

	@Override
	public float conditionInput(EComponent component) 
	{	
		float rawData = component.getPollData();
	
		if(getSortedPoints().size() > 0)
		{			
			CustomInputConditioningPoint point = ControllerFacade.INSTANCE.createCustomInputConditioningPoint(rawData, 0);
			
			TreeSet<CustomInputConditioningPoint> sortedSet = getSortedPoints();
			
			CustomInputConditioningPoint low = sortedSet.lower(point);
			CustomInputConditioningPoint high = sortedSet.higher(point);
			
			if(low != null)
			{
				if(high != null)
				{
					double m = (high.getOutputValue() - low.getOutputValue()) / (high.getInputValue() - low.getInputValue());
					double b = high.getOutputValue() - m * high.getInputValue();
					
					return (float)(m * rawData + b);
				}
				else
				{
					return (float) sortedSet.last().getOutputValue();
				}
			}
			else
			{
				return (float) sortedSet.first().getOutputValue();
			}		
		}
		else
		{
			return rawData;
		}
	}
	
	protected TreeSet<CustomInputConditioningPoint> getSortedPoints() 
	{		
		if(sortedPoints == null)
		{
			sortedPoints = ControllerFacade.INSTANCE.sortCustomInputConditioningPoint(getTransferFunction());
		}
		return sortedPoints;
	}
	
	protected Adapter getPointsAdapter()
	{
		if(pointsAdapter == null)
		{
			pointsAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{			
					if(msg.getFeatureID(UserDefinedInputConditioning.class) == EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION)
					{
						sortedPoints = null;
					}
				}
			};
		}
		
		return pointsAdapter;
	}
	
} //UserDefinedInputConditionningImpl
