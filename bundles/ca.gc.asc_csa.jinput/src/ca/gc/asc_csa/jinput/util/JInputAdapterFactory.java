/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput.util;

import ca.gc.asc_csa.jinput.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.jinput.EAxis;
import ca.gc.asc_csa.jinput.EButton;
import ca.gc.asc_csa.jinput.EComponent;
import ca.gc.asc_csa.jinput.EComponentQualifier;
import ca.gc.asc_csa.jinput.EComponents;
import ca.gc.asc_csa.jinput.EController;
import ca.gc.asc_csa.jinput.EControllerEnvironment;
import ca.gc.asc_csa.jinput.EKey;
import ca.gc.asc_csa.jinput.EVirtualComponent;
import ca.gc.asc_csa.jinput.JInputPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.jinput.JInputPackage
 * @generated
 */
public class JInputAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JInputPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JInputAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JInputPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
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
	protected JInputSwitch<Adapter> modelSwitch =
		new JInputSwitch<Adapter>() {
			@Override
			public Adapter caseEController(EController object) {
				return createEControllerAdapter();
			}
			@Override
			public Adapter caseEControllerEnvironment(EControllerEnvironment object) {
				return createEControllerEnvironmentAdapter();
			}
			@Override
			public Adapter caseEComponent(EComponent object) {
				return createEComponentAdapter();
			}
			@Override
			public Adapter caseEComponents(EComponents object) {
				return createEComponentsAdapter();
			}
			@Override
			public Adapter caseEButton(EButton object) {
				return createEButtonAdapter();
			}
			@Override
			public Adapter caseEAxis(EAxis object) {
				return createEAxisAdapter();
			}
			@Override
			public Adapter caseEKey(EKey object) {
				return createEKeyAdapter();
			}
			@Override
			public Adapter caseEComponentQualifier(EComponentQualifier object) {
				return createEComponentQualifierAdapter();
			}
			@Override
			public Adapter caseEVirtualComponent(EVirtualComponent object) {
				return createEVirtualComponentAdapter();
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EController <em>EController</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EController
	 * @generated
	 */
	public Adapter createEControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EControllerEnvironment <em>EController Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EControllerEnvironment
	 * @generated
	 */
	public Adapter createEControllerEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EComponent <em>EComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EComponent
	 * @generated
	 */
	public Adapter createEComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EComponents
	 * @generated
	 */
	public Adapter createEComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EButton <em>EButton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EButton
	 * @generated
	 */
	public Adapter createEButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EAxis <em>EAxis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EAxis
	 * @generated
	 */
	public Adapter createEAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EKey <em>EKey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EKey
	 * @generated
	 */
	public Adapter createEKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EComponentQualifier <em>EComponent Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EComponentQualifier
	 * @generated
	 */
	public Adapter createEComponentQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.jinput.EVirtualComponent <em>EVirtual Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.jinput.EVirtualComponent
	 * @generated
	 */
	public Adapter createEVirtualComponentAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JInputAdapterFactory
