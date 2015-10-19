/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.statistics.impl;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.symphony.common.math.statistics.Population;
import org.eclipse.symphony.common.math.statistics.StatisticsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Population</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getStandardDeviation <em>Standard Deviation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getAverage <em>Average</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getMedian <em>Median</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getSumSquared <em>Sum Squared</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getVariance <em>Variance</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.math.statistics.impl.PopulationImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopulationImpl extends MinimalEObjectImpl.Container implements Population {

	private boolean averageDirty = true;
	private boolean sumDirty = true;
	private boolean medianDirty = true;
	private boolean sumSquaredDirty = true;
	private boolean stdDirty = true;
	private boolean isDirty = true;
//	private boolean isMinMaxDirty = true;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> data;

	/**
	 * The default value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double STANDARD_DEVIATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStandardDeviation() <em>Standard Deviation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStandardDeviation()
	 * @generated
	 * @ordered
	 */
	protected double standardDeviation = STANDARD_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAverage()
	 * @generated
	 * @ordered
	 */
	protected double average = AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSum() <em>Sum</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSum()
	 * @generated
	 * @ordered
	 */
	protected static final double SUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSum() <em>Sum</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSum()
	 * @generated
	 * @ordered
	 */
	protected double sum = SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedian() <em>Median</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMedian()
	 * @generated
	 * @ordered
	 */
	protected static final double MEDIAN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMedian() <em>Median</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMedian()
	 * @generated
	 * @ordered
	 */
	protected double median = MEDIAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSumSquared() <em>Sum Squared</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSumSquared()
	 * @generated
	 * @ordered
	 */
	protected static final double SUM_SQUARED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSumSquared() <em>Sum Squared</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSumSquared()
	 * @generated
	 * @ordered
	 */
	protected double sumSquared = SUM_SQUARED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariance() <em>Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariance()
	 * @generated
	 * @ordered
	 */
	protected static final double VARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVariance() <em>Variance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariance()
	 * @generated
	 * @ordered
	 */
	protected double variance = VARIANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;
	private Adapter populationListener;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected PopulationImpl() {
		super();
		this.eAdapters().add(getPopulationListener());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatisticsPackage.Literals.POPULATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@SuppressWarnings("serial")
	public EList<Double> getData() {
		if (data == null) {
			data = new EDataTypeEList<Double>(Double.class, this,
					StatisticsPackage.POPULATION__DATA) {
				@Override
				protected boolean isUnique() {
					return false;
				}
			};
		}

		return data;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getStandardDeviation() {

		if (stdDirty) {
			if (getData().isEmpty()) {
				standardDeviation = 0.0;
			} else {
				double averageEltSquared = getSumSquared()
						/ (double) getData().size();
				double averageSquared = getAverage() * getAverage();

				standardDeviation = Math.sqrt(averageEltSquared
						- averageSquared);
			}
			stdDirty = false;
		}

		return standardDeviation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getAverage() {

		if (averageDirty) {
			// If population is empty, average is 0.0.
			if (getData().isEmpty()) {
				average = 0.0;
			} else {
				average = getSum() / (double) getData().size();
			}
			averageDirty = false;
		}

		return average;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getSum() {
		if (sumDirty) {
			sum = 0.0;

			for (Double element : getData()) {
				sum += element.doubleValue();
			}

			sumDirty = false;
		}
		return sum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getMedian() {

		sort();

		if (medianDirty) {

			int middle = getData().size() / 2;

			median = getData().get(middle).doubleValue();

			medianDirty = false;
		}

		return median;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getSumSquared() {

		if (sumSquaredDirty) {

			sumSquared = 0.0;

			for (Double element : getData()) {
				double eltSquared = element.doubleValue()
						* element.doubleValue();

				sumSquared += eltSquared;
			}

			sumSquaredDirty = false;
		}

		return sumSquared;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getVariance() {

		variance = getStandardDeviation() * getStandardDeviation();

		return variance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getMin() {

		sort();

		if (getData().size() == 0) {
			return Double.MAX_VALUE;
		} else {
			return getData().get(0).doubleValue();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getMax() {

		sort();

		if (getData().size() == 0) {
			return Double.MIN_VALUE;
		} else {
			int size = getData().size();
			return getData().get(size - 1).doubleValue();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatisticsPackage.POPULATION__DATA:
				return getData();
			case StatisticsPackage.POPULATION__STANDARD_DEVIATION:
				return getStandardDeviation();
			case StatisticsPackage.POPULATION__AVERAGE:
				return getAverage();
			case StatisticsPackage.POPULATION__SUM:
				return getSum();
			case StatisticsPackage.POPULATION__MEDIAN:
				return getMedian();
			case StatisticsPackage.POPULATION__SUM_SQUARED:
				return getSumSquared();
			case StatisticsPackage.POPULATION__VARIANCE:
				return getVariance();
			case StatisticsPackage.POPULATION__MIN:
				return getMin();
			case StatisticsPackage.POPULATION__MAX:
				return getMax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatisticsPackage.POPULATION__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Double>)newValue);
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
			case StatisticsPackage.POPULATION__DATA:
				getData().clear();
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
			case StatisticsPackage.POPULATION__DATA:
				return data != null && !data.isEmpty();
			case StatisticsPackage.POPULATION__STANDARD_DEVIATION:
				return standardDeviation != STANDARD_DEVIATION_EDEFAULT;
			case StatisticsPackage.POPULATION__AVERAGE:
				return average != AVERAGE_EDEFAULT;
			case StatisticsPackage.POPULATION__SUM:
				return sum != SUM_EDEFAULT;
			case StatisticsPackage.POPULATION__MEDIAN:
				return median != MEDIAN_EDEFAULT;
			case StatisticsPackage.POPULATION__SUM_SQUARED:
				return sumSquared != SUM_SQUARED_EDEFAULT;
			case StatisticsPackage.POPULATION__VARIANCE:
				return variance != VARIANCE_EDEFAULT;
			case StatisticsPackage.POPULATION__MIN:
				return getMin() != MIN_EDEFAULT;
			case StatisticsPackage.POPULATION__MAX:
				return getMax() != MAX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (data: ");
		result.append(data);
		result.append(", standardDeviation: ");
		result.append(standardDeviation);
		result.append(", average: ");
		result.append(average);
		result.append(", sum: ");
		result.append(sum);
		result.append(", median: ");
		result.append(median);
		result.append(", sumSquared: ");
		result.append(sumSquared);
		result.append(", variance: ");
		result.append(variance);
		result.append(')');
		return result.toString();
	}

	private Adapter getPopulationListener() {
		if (populationListener == null) {
			populationListener = new Adapter() {

				@Override
				public Notifier getTarget() {
					return null;
				}

				@Override
				public boolean isAdapterForType(Object type) {
					return false;
				}

				@Override
				public void notifyChanged(Notification notification) {

					if (notification.getNotifier() instanceof Population) {

						int featureID = notification
								.getFeatureID(Population.class);

						if (featureID == StatisticsPackage.POPULATION__DATA) {
							if (!notification.isTouch()) {
								averageDirty = true;
								sumDirty = true;
								medianDirty = true;
								sumSquaredDirty = true;
								stdDirty = true;
								isDirty = true;
							}
						}
					}
				}

				@Override
				public void setTarget(Notifier newTarget) {

				}

			};
		}
		return populationListener;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();

		this.eAdapters().remove(getPopulationListener());
	}

	private void sort() {
		if (isDirty) {
			Collections.sort(getData());
			isDirty = false;
		}
	}

} // PopulationImpl
