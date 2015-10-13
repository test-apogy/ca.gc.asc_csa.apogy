/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.EmfUiPropertyPackage;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributor;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Cell Editor Contributors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl.PropertyCellEditorContributorsImpl#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyCellEditorContributorsImpl extends EObjectImpl implements PropertyCellEditorContributors {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyCellEditorContributor> list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCellEditorContributorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfUiPropertyPackage.Literals.PROPERTY_CELL_EDITOR_CONTRIBUTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyCellEditorContributor> getList() {
		if (list == null) {
			list = new EObjectResolvingEList<PropertyCellEditorContributor>(PropertyCellEditorContributor.class, this, EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST:
				return getList();
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
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST:
				getList().clear();
				getList().addAll((Collection<? extends PropertyCellEditorContributor>)newValue);
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
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST:
				getList().clear();
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
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTORS__LIST:
				return list != null && !list.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributors#adapt(java.lang.Class)
	 */
	public PropertyCellEditorContributor adapt(Class<?> type) {
		Comparator<PropertyCellEditorContributor> comparator = new Comparator<PropertyCellEditorContributor>(){
			public int compare(PropertyCellEditorContributor o1, PropertyCellEditorContributor o2) {
				if (o1.getTarget() == o2.getTarget()) {
					return 0;
				} else if (o2.getTarget().isAssignableFrom(o1.getTarget())) {
					return -1;
				} else {
					return 1;
				}
			}			
		};
		
		List<PropertyCellEditorContributor> list = new ArrayList<PropertyCellEditorContributor>();
		list.addAll(getList());
		Collections.sort(list, comparator);

		Iterator<PropertyCellEditorContributor> contributors = list.iterator();		
		PropertyCellEditorContributor result = null;
		while (contributors.hasNext() && result == null){
			PropertyCellEditorContributor contributor = contributors.next();
			if (contributor.getTarget().isAssignableFrom(type)){
				result = contributor;
			}
		}
		return result;
	}
	
} //PropertyCellEditorContributorsImpl