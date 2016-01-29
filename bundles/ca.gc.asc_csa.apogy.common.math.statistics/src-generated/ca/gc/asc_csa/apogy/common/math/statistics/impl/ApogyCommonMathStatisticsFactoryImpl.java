/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.apogy.common.math.statistics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.math.statistics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonMathStatisticsFactoryImpl extends EFactoryImpl implements ApogyCommonMathStatisticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonMathStatisticsFactory init() {
		try {
			ApogyCommonMathStatisticsFactory theApogyCommonMathStatisticsFactory = (ApogyCommonMathStatisticsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonMathStatisticsPackage.eNS_URI);
			if (theApogyCommonMathStatisticsFactory != null) {
				return theApogyCommonMathStatisticsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonMathStatisticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonMathStatisticsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyCommonMathStatisticsPackage.POPULATION: return createPopulation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population createPopulation() {
		PopulationImpl population = new PopulationImpl();
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonMathStatisticsPackage getApogyCommonMathStatisticsPackage() {
		return (ApogyCommonMathStatisticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonMathStatisticsPackage getPackage() {
		return ApogyCommonMathStatisticsPackage.eINSTANCE;
	}

} //ApogyCommonMathStatisticsFactoryImpl
