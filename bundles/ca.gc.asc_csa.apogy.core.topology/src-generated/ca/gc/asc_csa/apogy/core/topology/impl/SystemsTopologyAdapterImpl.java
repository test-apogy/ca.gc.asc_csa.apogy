/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.topology.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;
import ca.gc.asc_csa.apogy.core.topology.SystemsTopologyAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Systems Topology Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.SystemsTopologyAdapterImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.impl.SystemsTopologyAdapterImpl#getSystemsGroup <em>Systems Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemsTopologyAdapterImpl extends MinimalEObjectImpl.Container implements SystemsTopologyAdapter
{
  /**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
  protected ApogyEnvironment deployment;

  /**
	 * The cached value of the '{@link #getSystemsGroup() <em>Systems Group</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSystemsGroup()
	 * @generated
	 * @ordered
	 */
  protected ReferencedGroupNode systemsGroup;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SystemsTopologyAdapterImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreTopologyPackage.Literals.SYSTEMS_TOPOLOGY_ADAPTER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyEnvironment getDeployment()
  {
		if (deployment != null && deployment.eIsProxy()) {
			InternalEObject oldDeployment = (InternalEObject)deployment;
			deployment = (ApogyEnvironment)eResolveProxy(oldDeployment);
			if (deployment != oldDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT, oldDeployment, deployment));
			}
		}
		return deployment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyEnvironment basicGetDeployment()
  {
		return deployment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDeployment(ApogyEnvironment newDeployment)
  {
		ApogyEnvironment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT, oldDeployment, deployment));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ReferencedGroupNode getSystemsGroup()
  {
		if (systemsGroup != null && systemsGroup.eIsProxy()) {
			InternalEObject oldSystemsGroup = (InternalEObject)systemsGroup;
			systemsGroup = (ReferencedGroupNode)eResolveProxy(oldSystemsGroup);
			if (systemsGroup != oldSystemsGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP, oldSystemsGroup, systemsGroup));
			}
		}
		return systemsGroup;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ReferencedGroupNode basicGetSystemsGroup()
  {
		return systemsGroup;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSystemsGroup(ReferencedGroupNode newSystemsGroup)
  {
		ReferencedGroupNode oldSystemsGroup = systemsGroup;
		systemsGroup = newSystemsGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP, oldSystemsGroup, systemsGroup));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT:
				if (resolve) return getDeployment();
				return basicGetDeployment();
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP:
				if (resolve) return getSystemsGroup();
				return basicGetSystemsGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT:
				setDeployment((ApogyEnvironment)newValue);
				return;
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP:
				setSystemsGroup((ReferencedGroupNode)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT:
				setDeployment((ApogyEnvironment)null);
				return;
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP:
				setSystemsGroup((ReferencedGroupNode)null);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__DEPLOYMENT:
				return deployment != null;
			case ApogyCoreTopologyPackage.SYSTEMS_TOPOLOGY_ADAPTER__SYSTEMS_GROUP:
				return systemsGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemsTopologyAdapterImpl
