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

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Disposable;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl#getTime <em>Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.TimeSourceImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TimeSourceImpl extends MinimalEObjectImpl.Container implements TimeSource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.TIME_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.TIME_SOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.TIME_SOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getTime() 
	{
		Date tmp = getTimeGen();
				
		if(tmp == null)
		{
			tmp = new Date();
			updateTime(tmp);
		}
				
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeGen() {
		return time;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.TIME_SOURCE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.TIME_SOURCE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void dispose() {
		// Nothing to do.
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonEMFPackage.TIME_SOURCE__NAME:
				return getName();
			case ApogyCommonEMFPackage.TIME_SOURCE__DESCRIPTION:
				return getDescription();
			case ApogyCommonEMFPackage.TIME_SOURCE__TIME:
				return getTime();
			case ApogyCommonEMFPackage.TIME_SOURCE__OFFSET:
				return getOffset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonEMFPackage.TIME_SOURCE__NAME:
				setName((String)newValue);
				return;
			case ApogyCommonEMFPackage.TIME_SOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCommonEMFPackage.TIME_SOURCE__TIME:
				setTime((Date)newValue);
				return;
			case ApogyCommonEMFPackage.TIME_SOURCE__OFFSET:
				setOffset((Integer)newValue);
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
			case ApogyCommonEMFPackage.TIME_SOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCommonEMFPackage.TIME_SOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCommonEMFPackage.TIME_SOURCE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ApogyCommonEMFPackage.TIME_SOURCE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case ApogyCommonEMFPackage.TIME_SOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCommonEMFPackage.TIME_SOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCommonEMFPackage.TIME_SOURCE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ApogyCommonEMFPackage.TIME_SOURCE__OFFSET:
				return offset != OFFSET_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCommonEMFPackage.TIME_SOURCE__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case ApogyCommonEMFPackage.TIME_SOURCE__TIME: return ApogyCommonEMFPackage.TIMED__TIME;
				default: return -1;
			}
		}
		if (baseClass == Disposable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCommonEMFPackage.TIME_SOURCE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.TIMED__TIME: return ApogyCommonEMFPackage.TIME_SOURCE__TIME;
				default: return -1;
			}
		}
		if (baseClass == Disposable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Timed.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Disposable.class) {
			switch (baseOperationID) {
				case ApogyCommonEMFPackage.DISPOSABLE___DISPOSE: return ApogyCommonEMFPackage.TIME_SOURCE___DISPOSE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonEMFPackage.TIME_SOURCE___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", time: ");
		result.append(time);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

	/**
	 * Transaction safe version of setTime().
	 * @param newTime The new time.
	 */
	protected void updateTime(final Date newTime)
	{
		// Updates the TimeSource time.
		// TODO : Do this using ApogyCommonEmfTransactionFacade.
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(this);
		if(domain instanceof TransactionalEditingDomain)
		{
			SetCommand command = new SetCommand(domain, this, ApogyCommonEMFPackage.Literals.TIMED__TIME, newTime);
			domain.getCommandStack().execute(command);
		}		
	}
} //TimeSourceImpl
