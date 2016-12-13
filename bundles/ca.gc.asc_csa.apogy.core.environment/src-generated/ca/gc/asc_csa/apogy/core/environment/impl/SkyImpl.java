package ca.gc.asc_csa.apogy.core.environment.impl;
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
import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.Worksite;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Sky</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl#getTime <em>Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl#getWorksite <em>Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl#getSkyNode <em>Sky Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl#getSun <em>Sun</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyImpl#getStarField <em>Star Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkyImpl extends MinimalEObjectImpl.Container implements Sky 
{
	protected Adapter worksiteAdapter;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSkyNode() <em>Sky Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSkyNode()
	 * @generated
	 * @ordered
	 */
	protected SkyNode skyNode;
	/**
	 * The cached value of the '{@link #getSun() <em>Sun</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSun()
	 * @generated
	 * @ordered
	 */
	protected Sun sun;
	/**
	 * The cached value of the '{@link #getStarField() <em>Star Field</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStarField()
	 * @generated
	 * @ordered
	 */
	protected StarField starField;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected SkyImpl() {
		super();

		eAdapters().add(getWorksiteAdapter());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.SKY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.SKY__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Worksite getWorksite() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.SKY__WORKSITE) return null;
		return (Worksite)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Worksite basicGetWorksite() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.SKY__WORKSITE) return null;
		return (Worksite)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public NotificationChain basicSetWorksite(Worksite newWorksite, NotificationChain msgs) {
		if (basicGetWorksite() != null) {
			// Un-Register Listener from previous to the worksite.
			basicGetWorksite().eAdapters().remove(getWorksiteAdapter());
		}

		if (newWorksite != null) {
			// Register Listener for changes to the worksite.
			newWorksite.eAdapters().add(getWorksiteAdapter());
		}

		return basicSetWorksiteGen(newWorksite, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorksiteGen(Worksite newWorksite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorksite, ApogyCoreEnvironmentPackage.SKY__WORKSITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorksite(Worksite newWorksite) {
		if (newWorksite != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentPackage.SKY__WORKSITE && newWorksite != null)) {
			if (EcoreUtil.isAncestor(this, newWorksite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorksite != null)
				msgs = ((InternalEObject)newWorksite).eInverseAdd(this, ApogyCoreEnvironmentPackage.WORKSITE__SKY, Worksite.class, msgs);
			msgs = basicSetWorksite(newWorksite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.SKY__WORKSITE, newWorksite, newWorksite));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SkyNode getSkyNode() {
		if (skyNode != null && skyNode.eIsProxy()) {
			InternalEObject oldSkyNode = (InternalEObject)skyNode;
			skyNode = (SkyNode)eResolveProxy(oldSkyNode);
			if (skyNode != oldSkyNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.SKY__SKY_NODE, oldSkyNode, skyNode));
			}
		}
		return skyNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SkyNode basicGetSkyNode() {
		return skyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkyNode(SkyNode newSkyNode, NotificationChain msgs) {
		SkyNode oldSkyNode = skyNode;
		skyNode = newSkyNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.SKY__SKY_NODE, oldSkyNode, newSkyNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkyNode(SkyNode newSkyNode) {
		if (newSkyNode != skyNode) {
			NotificationChain msgs = null;
			if (skyNode != null)
				msgs = ((InternalEObject)skyNode).eInverseRemove(this, ApogyCoreEnvironmentPackage.SKY_NODE__SKY, SkyNode.class, msgs);
			if (newSkyNode != null)
				msgs = ((InternalEObject)newSkyNode).eInverseAdd(this, ApogyCoreEnvironmentPackage.SKY_NODE__SKY, SkyNode.class, msgs);
			msgs = basicSetSkyNode(newSkyNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.SKY__SKY_NODE, newSkyNode, newSkyNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Sun getSun() 
	{
		// Explores children to find the Sun.
		if (basicGetSun() == null) {
			sun = findSunInTopology();
		}
		return sun;
	}

	/**
	 * Searches the topology to find the Sun.
	 * 
	 * @return The Sun, null if not found.
	 */
	private Sun findSunInTopology() 
	{
		Sun sunFound = null;

		EList<Node> children = getSkyNode().getChildren();
		Iterator<Node> it = children.iterator();
		while (it.hasNext() && (sunFound == null)) {
			Node node = it.next();

			if (node instanceof TransformNode) {
				TransformNode t = (TransformNode) node;

				EList<Node> tChildren = t.getChildren();
				Iterator<Node> tIt = tChildren.iterator();
				while (tIt.hasNext() && (sunFound == null)) {
					Node n = tIt.next();

					if (n instanceof Sun) {
						sunFound = (Sun) n;
					}
				}
			}
		}

		return sunFound;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Sun basicGetSun() {
		return sun;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public StarField getStarField() {
		// Explores children to find the StarField.
		if (basicGetStarField() == null) {
			starField = findStarFieldInTopology();
		}

		return starField;
	}

	/**
	 * Searches the topology to find the StarField.
	 * 
	 * @return The StarField, null if not found.
	 */
	private StarField findStarFieldInTopology() {
		StarField foundStarField = null;

		EList<Node> children = getSkyNode().getChildren();
		Iterator<Node> it = children.iterator();
		while (it.hasNext() && (foundStarField == null)) {
			Node node = it.next();

			if (node instanceof TransformNode) {
				TransformNode t = (TransformNode) node;

				EList<Node> tChildren = t.getChildren();
				Iterator<Node> tIt = tChildren.iterator();
				while (tIt.hasNext() && (foundStarField == null)) {
					Node n = tIt.next();

					if (n instanceof StarField) {
						foundStarField = (StarField) n;
					}
				}
			}
		}

		return foundStarField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StarField basicGetStarField() {
		return starField;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getSunAngularDiameter() {
		// TODO : Fix the problem with the distance calculation.

		// // Find the distance between the sun and the origin.
		// TransformNode transform = (TransformNode) getSun().getParent();
		// Vector3d vector = new Vector3d();
		// transform.asMatrix4d().get(vector);
		// double distance = vector.length();
		//
		// // Computes the angular diameter.
		// double angularDiameter = Math.atan(getSun().getRadius() / distance) *
		// 2;

		// Return the average angular size for now.
		double angularDiameter = Math.toRadians(0.535833333);

		return angularDiameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.SKY__WORKSITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorksite((Worksite)otherEnd, msgs);
			case ApogyCoreEnvironmentPackage.SKY__SKY_NODE:
				if (skyNode != null)
					msgs = ((InternalEObject)skyNode).eInverseRemove(this, ApogyCoreEnvironmentPackage.SKY_NODE__SKY, SkyNode.class, msgs);
				return basicSetSkyNode((SkyNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.SKY__WORKSITE:
				return basicSetWorksite(null, msgs);
			case ApogyCoreEnvironmentPackage.SKY__SKY_NODE:
				return basicSetSkyNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyCoreEnvironmentPackage.SKY__WORKSITE:
				return eInternalContainer().eInverseRemove(this, ApogyCoreEnvironmentPackage.WORKSITE__SKY, Worksite.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.SKY__TIME:
				return getTime();
			case ApogyCoreEnvironmentPackage.SKY__WORKSITE:
				if (resolve) return getWorksite();
				return basicGetWorksite();
			case ApogyCoreEnvironmentPackage.SKY__SKY_NODE:
				if (resolve) return getSkyNode();
				return basicGetSkyNode();
			case ApogyCoreEnvironmentPackage.SKY__SUN:
				if (resolve) return getSun();
				return basicGetSun();
			case ApogyCoreEnvironmentPackage.SKY__STAR_FIELD:
				if (resolve) return getStarField();
				return basicGetStarField();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.SKY__TIME:
				setTime((Date)newValue);
				return;
			case ApogyCoreEnvironmentPackage.SKY__WORKSITE:
				setWorksite((Worksite)newValue);
				return;
			case ApogyCoreEnvironmentPackage.SKY__SKY_NODE:
				setSkyNode((SkyNode)newValue);
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
			case ApogyCoreEnvironmentPackage.SKY__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ApogyCoreEnvironmentPackage.SKY__WORKSITE:
				setWorksite((Worksite)null);
				return;
			case ApogyCoreEnvironmentPackage.SKY__SKY_NODE:
				setSkyNode((SkyNode)null);
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
			case ApogyCoreEnvironmentPackage.SKY__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ApogyCoreEnvironmentPackage.SKY__WORKSITE:
				return basicGetWorksite() != null;
			case ApogyCoreEnvironmentPackage.SKY__SKY_NODE:
				return skyNode != null;
			case ApogyCoreEnvironmentPackage.SKY__SUN:
				return sun != null;
			case ApogyCoreEnvironmentPackage.SKY__STAR_FIELD:
				return starField != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentPackage.SKY___GET_SUN_ANGULAR_DIAMETER:
				return getSunAngularDiameter();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

	protected Adapter getWorksiteAdapter() {
		if (worksiteAdapter == null) {
			worksiteAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getNotifier() instanceof AbstractWorksite) {
						int featureId = msg.getFeatureID(AbstractWorksite.class);

						// The Worksite time has changed, update the Sky time.
						if (featureId == ApogyCoreEnvironmentPackage.ABSTRACT_WORKSITE__TIME) {
							if (msg.getNewValue() instanceof Date) {
								Date newDate = (Date) msg.getNewValue();
								setTime(newDate);
							}
						}
					} else if (msg.getNotifier() instanceof Sky) {
						int featureId = msg.getFeatureID(Sky.class);

						switch (featureId) {
						// The worksite has changed, unregister from previous,
						// register to new and update.
						case ApogyCoreEnvironmentPackage.SKY__WORKSITE: {

							if (msg.getOldValue() instanceof Worksite) {
								Worksite oldWorksite = (Worksite) msg.getOldValue();
								oldWorksite.eAdapters().remove(getWorksiteAdapter());
							}

							if (msg.getNewValue() instanceof Worksite) {
								Worksite newWorksite = (Worksite) msg.getNewValue();
								newWorksite.eAdapters().add(getWorksiteAdapter());

								// Updates time.
								setTime(newWorksite.getTime());
							}
						}
							break;

						default:
							break;
						}
					}
				}
			};
		}

		return worksiteAdapter;
	}
} // SkyImpl
