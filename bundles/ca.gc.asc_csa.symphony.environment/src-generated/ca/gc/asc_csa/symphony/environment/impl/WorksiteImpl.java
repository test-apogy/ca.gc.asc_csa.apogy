/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.core.AbstractOrbitModel;
import org.eclipse.symphony.core.impl.AbstractWorksiteImpl;

import ca.gc.asc_csa.symphony.environment.Environment;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.Worksite;
import ca.gc.asc_csa.symphony.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.WorksiteImpl#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.WorksiteImpl#getOrbitsModels <em>Orbits Models</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.WorksiteImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorksiteImpl extends AbstractWorksiteImpl implements Worksite
{
  /**
	 * The cached value of the '{@link #getWorksiteNode() <em>Worksite Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWorksiteNode()
	 * @generated
	 * @ordered
	 */
  protected WorksiteNode worksiteNode;

  /**
	 * The cached value of the '{@link #getOrbitsModels() <em>Orbits Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitsModels()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractOrbitModel> orbitsModels;

		/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
  protected Environment environment;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WorksiteImpl()
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
		return SymphonyEnvironmentPackage.Literals.WORKSITE;
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public WorksiteNode getWorksiteNode()
  {
	  if(getWorksiteNodeGen() == null)
	  {
		  worksiteNode = SymphonyEnvironmentFactory.eINSTANCE.createWorksiteNode();
		  worksiteNode.setWorksite(this);
	  }
	  
	  return getWorksiteNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode getWorksiteNodeGen()
  {
		if (worksiteNode != null && worksiteNode.eIsProxy()) {
			InternalEObject oldWorksiteNode = (InternalEObject)worksiteNode;
			worksiteNode = (WorksiteNode)eResolveProxy(oldWorksiteNode);
			if (worksiteNode != oldWorksiteNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.WORKSITE__WORKSITE_NODE, oldWorksiteNode, worksiteNode));
			}
		}
		return worksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode basicGetWorksiteNode()
  {
		return worksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractOrbitModel> getOrbitsModels() {
		if (orbitsModels == null) {
			orbitsModels = new EObjectResolvingEList<AbstractOrbitModel>(AbstractOrbitModel.class, this, SymphonyEnvironmentPackage.WORKSITE__ORBITS_MODELS);
		}
		return orbitsModels;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment getEnvironment()
  {
		return environment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs)
  {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEnvironment(Environment newEnvironment)
  {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT, newEnvironment, newEnvironment));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case SymphonyEnvironmentPackage.WORKSITE__WORKSITE_NODE:
				if (resolve) return getWorksiteNode();
				return basicGetWorksiteNode();
			case SymphonyEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				return getOrbitsModels();
			case SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT:
				return getEnvironment();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SymphonyEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				getOrbitsModels().clear();
				getOrbitsModels().addAll((Collection<? extends AbstractOrbitModel>)newValue);
				return;
			case SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT:
				setEnvironment((Environment)newValue);
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
			case SymphonyEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				getOrbitsModels().clear();
				return;
			case SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT:
				setEnvironment((Environment)null);
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
			case SymphonyEnvironmentPackage.WORKSITE__WORKSITE_NODE:
				return worksiteNode != null;
			case SymphonyEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				return orbitsModels != null && !orbitsModels.isEmpty();
			case SymphonyEnvironmentPackage.WORKSITE__ENVIRONMENT:
				return environment != null;
		}
		return super.eIsSet(featureID);
	}

} //WorksiteImpl
