/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.bindings.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.ConicalFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.MRTFOVBindingsPackage;
import org.eclipse.symphony.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;

import ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.fov.bindings.MRTFOVBindingsPackage
 * @generated
 */
public class MRTFOVBindingsSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static MRTFOVBindingsPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MRTFOVBindingsSwitch()
  {
		if (modelPackage == null) {
			modelPackage = MRTFOVBindingsPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case MRTFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING: {
				CircularSectorFieldOfViewBinding circularSectorFieldOfViewBinding = (CircularSectorFieldOfViewBinding)theEObject;
				T result = caseCircularSectorFieldOfViewBinding(circularSectorFieldOfViewBinding);
				if (result == null) result = caseAbstractTopologyBinding(circularSectorFieldOfViewBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRTFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING: {
				ConicalFieldOfViewBinding conicalFieldOfViewBinding = (ConicalFieldOfViewBinding)theEObject;
				T result = caseConicalFieldOfViewBinding(conicalFieldOfViewBinding);
				if (result == null) result = caseAbstractTopologyBinding(conicalFieldOfViewBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MRTFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING: {
				RectangularFrustrumFieldOfViewBinding rectangularFrustrumFieldOfViewBinding = (RectangularFrustrumFieldOfViewBinding)theEObject;
				T result = caseRectangularFrustrumFieldOfViewBinding(rectangularFrustrumFieldOfViewBinding);
				if (result == null) result = caseAbstractTopologyBinding(rectangularFrustrumFieldOfViewBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Circular Sector Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circular Sector Field Of View Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCircularSectorFieldOfViewBinding(CircularSectorFieldOfViewBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Conical Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conical Field Of View Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseConicalFieldOfViewBinding(ConicalFieldOfViewBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Frustrum Field Of View Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRectangularFrustrumFieldOfViewBinding(RectangularFrustrumFieldOfViewBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Topology Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Topology Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractTopologyBinding(AbstractTopologyBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //MRTFOVBindingsSwitch
