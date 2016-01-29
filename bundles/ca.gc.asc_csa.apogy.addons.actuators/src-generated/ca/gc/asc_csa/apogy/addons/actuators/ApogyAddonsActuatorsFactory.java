/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.actuators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage
 * @generated
 */
public interface ApogyAddonsActuatorsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsActuatorsFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsFactoryImpl.init();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsActuatorsPackage getApogyAddonsActuatorsPackage();

} //ApogyAddonsActuatorsFactory
