/**
 * <copyright>
 * </copyright>
 *
 * $Id: AggregateContentNodeImpl.java,v 1.5.2.3 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.topology.AggregateContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aggregate Content Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.impl.AggregateContentNodeImpl#getAggregateContent <em>Aggregate Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateContentNodeImpl<T> extends ContentNodeImpl<T> implements
		AggregateContentNode<T> {
	/**
	 * The cached value of the '{@link #getAggregateContent() <em>Aggregate Content</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getAggregateContent()
	 * @generated
	 * @ordered
	 */
	protected T aggregateContent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateContentNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyPackage.Literals.AGGREGATE_CONTENT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetContent(T newContent, NotificationChain msgs) {
		return super.basicSetContent(newContent, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public T basicGetContent() {
		return getAggregateContent();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setContent(T newContent) {
		T oldContent = getContent();

		setAggregateContent(newContent);

		eNotify(new ENotificationImpl(this, Notification.SET,
				ApogyCommonTopologyPackage.CONTENT_NODE__CONTENT, oldContent, newContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public T getAggregateContent() {
		return aggregateContent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregateContent(T newAggregateContent,
			NotificationChain msgs) {
		T oldAggregateContent = aggregateContent;
		aggregateContent = newAggregateContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT, oldAggregateContent, newAggregateContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregateContent(T newAggregateContent) {
		if (newAggregateContent != aggregateContent) {
			NotificationChain msgs = null;
			if (aggregateContent != null)
				msgs = ((InternalEObject)aggregateContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT, null, msgs);
			if (newAggregateContent != null)
				msgs = ((InternalEObject)newAggregateContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT, null, msgs);
			msgs = basicSetAggregateContent(newAggregateContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT, newAggregateContent, newAggregateContent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT:
				return basicSetAggregateContent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT:
				return getAggregateContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT:
				setAggregateContent((T)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT:
				setAggregateContent((T)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonTopologyPackage.AGGREGATE_CONTENT_NODE__AGGREGATE_CONTENT:
				return aggregateContent != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public T getContent() {
		return getAggregateContent();
	}

} // AggregateContentNodeImpl
