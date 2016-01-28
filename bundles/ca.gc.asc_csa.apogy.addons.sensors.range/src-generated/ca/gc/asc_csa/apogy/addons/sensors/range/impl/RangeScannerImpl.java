/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeScannerImpl.java,v 1.4.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.RangeScanner;
import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.processors.Monitorable;
import org.eclipse.symphony.common.processors.Processor;
import org.eclipse.symphony.common.processors.Symphony__CommonProcessorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RangeScannerImpl#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RangeScannerImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RangeScannerImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeScannerImpl<InputType> extends RangeSensorImpl implements RangeScanner<InputType> {
	/**
	 * The default value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected static final IProgressMonitor PROGRESS_MONITOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected IProgressMonitor progressMonitor = PROGRESS_MONITOR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected InputType input;
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected VolumetricCoordinatesSet25D output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeScannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsSensorsRangePackage.Literals.RANGE_SCANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor getProgressMonitor() {
		return progressMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressMonitor(IProgressMonitor newProgressMonitor) {
		IProgressMonitor oldProgressMonitor = progressMonitor;
		progressMonitor = newProgressMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__PROGRESS_MONITOR, oldProgressMonitor, progressMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(InputType newInput) {
		InputType oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricCoordinatesSet25D getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(VolumetricCoordinatesSet25D newOutput) {
		VolumetricCoordinatesSet25D oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricCoordinatesSet25D process(InputType input) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__PROGRESS_MONITOR:
				return getProgressMonitor();
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__INPUT:
				return getInput();
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__OUTPUT:
				return getOutput();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__PROGRESS_MONITOR:
				setProgressMonitor((IProgressMonitor)newValue);
				return;
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__INPUT:
				setInput((InputType)newValue);
				return;
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__OUTPUT:
				setOutput((VolumetricCoordinatesSet25D)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__PROGRESS_MONITOR:
				setProgressMonitor(PROGRESS_MONITOR_EDEFAULT);
				return;
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__INPUT:
				setInput((InputType)null);
				return;
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__OUTPUT:
				setOutput((VolumetricCoordinatesSet25D)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__PROGRESS_MONITOR:
				return PROGRESS_MONITOR_EDEFAULT == null ? progressMonitor != null : !PROGRESS_MONITOR_EDEFAULT.equals(progressMonitor);
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__INPUT:
				return input != null;
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__OUTPUT:
				return output != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Monitorable.class) {
			switch (derivedFeatureID) {
				case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__PROGRESS_MONITOR: return Symphony__CommonProcessorsPackage.MONITORABLE__PROGRESS_MONITOR;
				default: return -1;
			}
		}
		if (baseClass == Processor.class) {
			switch (derivedFeatureID) {
				case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__INPUT: return Symphony__CommonProcessorsPackage.PROCESSOR__INPUT;
				case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__OUTPUT: return Symphony__CommonProcessorsPackage.PROCESSOR__OUTPUT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Monitorable.class) {
			switch (baseFeatureID) {
				case Symphony__CommonProcessorsPackage.MONITORABLE__PROGRESS_MONITOR: return Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__PROGRESS_MONITOR;
				default: return -1;
			}
		}
		if (baseClass == Processor.class) {
			switch (baseFeatureID) {
				case Symphony__CommonProcessorsPackage.PROCESSOR__INPUT: return Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__INPUT;
				case Symphony__CommonProcessorsPackage.PROCESSOR__OUTPUT: return Symphony__AddonsSensorsRangePackage.RANGE_SCANNER__OUTPUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Monitorable.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Processor.class) {
			switch (baseOperationID) {
				case Symphony__CommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT: return Symphony__AddonsSensorsRangePackage.RANGE_SCANNER___PROCESS__OBJECT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsSensorsRangePackage.RANGE_SCANNER___PROCESS__OBJECT:
				try {
					return process((InputType)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (progressMonitor: ");
		result.append(progressMonitor);
		result.append(", input: ");
		result.append(input);
		result.append(", output: ");
		result.append(output);
		result.append(')');
		return result.toString();
	}

} //RangeScannerImpl
