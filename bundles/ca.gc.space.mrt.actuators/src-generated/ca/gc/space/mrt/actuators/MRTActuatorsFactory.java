/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package ca.gc.space.mrt.actuators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.actuators.MRTActuatorsPackage
 * @generated
 */
public interface MRTActuatorsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  MRTActuatorsFactory eINSTANCE = ca.gc.space.mrt.actuators.impl.MRTActuatorsFactoryImpl.init();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  MRTActuatorsPackage getMRTActuatorsPackage();

} //MRTActuatorsFactory
