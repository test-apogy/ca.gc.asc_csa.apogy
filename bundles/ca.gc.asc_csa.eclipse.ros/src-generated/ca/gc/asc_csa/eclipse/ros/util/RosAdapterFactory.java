/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.ros.util;

import ca.gc.asc_csa.eclipse.ros.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.ros.internal.message.Message;
import ca.gc.asc_csa.eclipse.ros.RosInterface;
import ca.gc.asc_csa.eclipse.ros.RosListener;
import ca.gc.asc_csa.eclipse.ros.RosNode;
import ca.gc.asc_csa.eclipse.ros.RosPackage;
import ca.gc.asc_csa.eclipse.ros.RosPublisher;
import ca.gc.asc_csa.eclipse.ros.RosPublisherManager;
import ca.gc.asc_csa.eclipse.ros.RosService;
import ca.gc.asc_csa.eclipse.ros.RosServiceManager;
import ca.gc.asc_csa.eclipse.ros.RosTopicLauncher;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.ros.RosPackage
 * @generated
 */
public class RosAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static RosPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RosAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = RosPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RosSwitch<Adapter> modelSwitch =
    new RosSwitch<Adapter>() {
			@Override
			public Adapter caseRosNode(RosNode object) {
				return createRosNodeAdapter();
			}
			@Override
			public Adapter caseRosInterface(RosInterface object) {
				return createRosInterfaceAdapter();
			}
			@Override
			public Adapter caseRosPublisherManager(RosPublisherManager object) {
				return createRosPublisherManagerAdapter();
			}
			@Override
			public <T extends Message> Adapter caseRosPublisher(RosPublisher<T> object) {
				return createRosPublisherAdapter();
			}
			@Override
			public Adapter caseRosServiceManager(RosServiceManager object) {
				return createRosServiceManagerAdapter();
			}
			@Override
			public <Request extends Message, Response extends Message> Adapter caseRosService(RosService<Request, Response> object) {
				return createRosServiceAdapter();
			}
			@Override
			public Adapter caseRosTopicLauncher(RosTopicLauncher object) {
				return createRosTopicLauncherAdapter();
			}
			@Override
			public <T extends Message> Adapter caseRosListener(RosListener<T> object) {
				return createRosListenerAdapter();
			}
			@Override
			public Adapter caseRosFacade(RosFacade object) {
				return createRosFacadeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosInterface
	 * @generated
	 */
  public Adapter createRosInterfaceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisher
	 * @generated
	 */
  public Adapter createRosPublisherAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosService
	 * @generated
	 */
  public Adapter createRosServiceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosListener <em>Listener</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosListener
	 * @generated
	 */
  public Adapter createRosListenerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosFacade
	 * @generated
	 */
	public Adapter createRosFacadeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosPublisherManager <em>Publisher Manager</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosPublisherManager
	 * @generated
	 */
  public Adapter createRosPublisherManagerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosServiceManager <em>Service Manager</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosServiceManager
	 * @generated
	 */
  public Adapter createRosServiceManagerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosTopicLauncher <em>Topic Launcher</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosTopicLauncher
	 * @generated
	 */
  public Adapter createRosTopicLauncherAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.ros.RosNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.ros.RosNode
	 * @generated
	 */
  public Adapter createRosNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //RosAdapterFactory
