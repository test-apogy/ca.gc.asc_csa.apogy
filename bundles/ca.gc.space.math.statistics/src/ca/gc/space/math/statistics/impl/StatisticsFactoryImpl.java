/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.math.statistics.impl;

import ca.gc.space.math.statistics.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.math.statistics.Population;
import ca.gc.space.math.statistics.StatisticsFactory;
import ca.gc.space.math.statistics.StatisticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatisticsFactoryImpl extends EFactoryImpl implements StatisticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatisticsFactory init() {
		try {
			StatisticsFactory theStatisticsFactory = (StatisticsFactory)EPackage.Registry.INSTANCE.getEFactory(StatisticsPackage.eNS_URI);
			if (theStatisticsFactory != null) {
				return theStatisticsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatisticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsFactoryImpl() {
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
			case StatisticsPackage.POPULATION: return createPopulation();
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
	public StatisticsPackage getStatisticsPackage() {
		return (StatisticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatisticsPackage getPackage() {
		return StatisticsPackage.eINSTANCE;
	}

} //StatisticsFactoryImpl
