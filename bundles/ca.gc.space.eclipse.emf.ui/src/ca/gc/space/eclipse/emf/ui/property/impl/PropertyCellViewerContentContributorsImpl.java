/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.eclipse.emf.ui.property.impl;

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

import ca.gc.space.eclipse.emf.ui.property.EmfUiPropertyPackage;
import ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributor;
import ca.gc.space.eclipse.emf.ui.property.PropertyCellViewerContentContributors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Cell Viewer Content Contributors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.eclipse.emf.ui.property.impl.PropertyCellViewerContentContributorsImpl#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyCellViewerContentContributorsImpl extends EObjectImpl implements PropertyCellViewerContentContributors {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyCellViewerContentContributor> list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyCellViewerContentContributorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfUiPropertyPackage.Literals.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyCellViewerContentContributor> getList() {
		if (list == null) {
			list = new EObjectResolvingEList<PropertyCellViewerContentContributor>(PropertyCellViewerContentContributor.class, this, EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST);
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
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST:
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
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST:
				getList().clear();
				getList().addAll((Collection<? extends PropertyCellViewerContentContributor>)newValue);
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
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST:
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
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS__LIST:
				return list != null && !list.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public PropertyCellViewerContentContributor adapt(Class<?> type) {
		Comparator<PropertyCellViewerContentContributor> comparator = new Comparator<PropertyCellViewerContentContributor>(){
			public int compare(PropertyCellViewerContentContributor o1, PropertyCellViewerContentContributor o2) {
				if (o1.getTarget() == o2.getTarget()) {
					return 0;
				} else if (o2.getTarget().isAssignableFrom(o1.getTarget())) {
					return -1;
				} else {
					return 1;
				}
			}			
		};
		
		List<PropertyCellViewerContentContributor> list = new ArrayList<PropertyCellViewerContentContributor>();
		list.addAll(getList());
		Collections.sort(list, comparator);

		Iterator<PropertyCellViewerContentContributor> contributors = list.iterator();		
		PropertyCellViewerContentContributor result = null;
		while (contributors.hasNext() && result == null){
			PropertyCellViewerContentContributor contributor = contributors.next();
			if (contributor.getTarget().isAssignableFrom(type)){
				result = contributor;
			}
		}
		return result;
	}

} //PropertyCellViewerContentContributorsImpl