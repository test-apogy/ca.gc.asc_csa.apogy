/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.images.AbstractEImage;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureListNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference;
import ca.gc.asc_csa.symphony.tools.camera.AzimuthFeatureReference;
import ca.gc.asc_csa.symphony.tools.camera.EMFFeatureAzimuthElevationFOVOverlay;
import ca.gc.asc_csa.symphony.tools.camera.ElevationFeatureReference;
import ca.gc.asc_csa.symphony.tools.camera.OverlayAlignment;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMF Feature Azimuth Elevation FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.EMFFeatureAzimuthElevationFOVOverlayImpl#getAzimuthFeatureReference <em>Azimuth Feature Reference</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.EMFFeatureAzimuthElevationFOVOverlayImpl#getElevationFeatureReference <em>Elevation Feature Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMFFeatureAzimuthElevationFOVOverlayImpl extends AzimuthElevationFOVOverlayImpl implements EMFFeatureAzimuthElevationFOVOverlay 
{
	private Unit<?> degreeUnits = Unit.valueOf("°");
	
	/**
	 * The cached value of the '{@link #getAzimuthFeatureReference() <em>Azimuth Feature Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthFeatureReference()
	 * @generated
	 * @ordered
	 */
	protected AzimuthFeatureReference azimuthFeatureReference;

	/**
	 * The cached value of the '{@link #getElevationFeatureReference() <em>Elevation Feature Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationFeatureReference()
	 * @generated
	 * @ordered
	 */
	protected ElevationFeatureReference elevationFeatureReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFFeatureAzimuthElevationFOVOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCameraToolsPackage.Literals.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzimuthFeatureReference getAzimuthFeatureReference() {
		return azimuthFeatureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAzimuthFeatureReference(AzimuthFeatureReference newAzimuthFeatureReference, NotificationChain msgs) {
		AzimuthFeatureReference oldAzimuthFeatureReference = azimuthFeatureReference;
		azimuthFeatureReference = newAzimuthFeatureReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE, oldAzimuthFeatureReference, newAzimuthFeatureReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzimuthFeatureReference(AzimuthFeatureReference newAzimuthFeatureReference) {
		if (newAzimuthFeatureReference != azimuthFeatureReference) {
			NotificationChain msgs = null;
			if (azimuthFeatureReference != null)
				msgs = ((InternalEObject)azimuthFeatureReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE, null, msgs);
			if (newAzimuthFeatureReference != null)
				msgs = ((InternalEObject)newAzimuthFeatureReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE, null, msgs);
			msgs = basicSetAzimuthFeatureReference(newAzimuthFeatureReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE, newAzimuthFeatureReference, newAzimuthFeatureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevationFeatureReference getElevationFeatureReference() {
		return elevationFeatureReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElevationFeatureReference(ElevationFeatureReference newElevationFeatureReference, NotificationChain msgs) {
		ElevationFeatureReference oldElevationFeatureReference = elevationFeatureReference;
		elevationFeatureReference = newElevationFeatureReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE, oldElevationFeatureReference, newElevationFeatureReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationFeatureReference(ElevationFeatureReference newElevationFeatureReference) {
		if (newElevationFeatureReference != elevationFeatureReference) {
			NotificationChain msgs = null;
			if (elevationFeatureReference != null)
				msgs = ((InternalEObject)elevationFeatureReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE, null, msgs);
			if (newElevationFeatureReference != null)
				msgs = ((InternalEObject)newElevationFeatureReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE, null, msgs);
			msgs = basicSetElevationFeatureReference(newElevationFeatureReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE, newElevationFeatureReference, newElevationFeatureReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE:
				return basicSetAzimuthFeatureReference(null, msgs);
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE:
				return basicSetElevationFeatureReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE:
				return getAzimuthFeatureReference();
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE:
				return getElevationFeatureReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE:
				setAzimuthFeatureReference((AzimuthFeatureReference)newValue);
				return;
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE:
				setElevationFeatureReference((ElevationFeatureReference)newValue);
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
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE:
				setAzimuthFeatureReference((AzimuthFeatureReference)null);
				return;
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE:
				setElevationFeatureReference((ElevationFeatureReference)null);
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
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__AZIMUTH_FEATURE_REFERENCE:
				return azimuthFeatureReference != null;
			case SymphonyCameraToolsPackage.EMF_FEATURE_AZIMUTH_ELEVATION_FOV_OVERLAY__ELEVATION_FEATURE_REFERENCE:
				return elevationFeatureReference != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public AbstractEImage applyOverlay(AbstractCamera camera,
			AbstractEImage cameraImage, OverlayAlignment overlayAlignment,
			int overlayWidth, int overlayHeight) 
	{
		try
		{
			// Updates the azimuth and elevation from the refered features.
			changeAzimuth(getAzimuth());
			changeElevation(getElevation());
			
			// Gets the overlay.
			return super.applyOverlay(camera, cameraImage, overlayAlignment, overlayWidth, overlayHeight);
		}
		catch(Throwable t)
		{
			return cameraImage;
		}
	}
	
	protected double getAzimuth()
	{
		return getValue(getAzimuthFeatureReference());		
	}
	
	protected double getElevation()
	{
		return getValue(getElevationFeatureReference());		
	}
	
	protected double getValue(VariableFeatureReference variableFeatureReference)
	{
		Number featureValue = (Number) EMFEcoreInvocatorFacade.INSTANCE.getEMFFeatureValue(variableFeatureReference);
		
		// Gets the feature associated with the azimuth.
		AbstractFeatureListNode abstractFeatureListNode = EMFEcoreFacade.INSTANCE.getLeaf(variableFeatureReference.getFeatureRoot());
		AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) abstractFeatureListNode;
		ETypedElement eTypedElement = abstractFeatureSpecifier.getStructuralFeature();
				
		// Gets the units associated with the feature
		Unit<?> units = EMFEcoreFacade.INSTANCE.getEngineeringUnits(eTypedElement);
		
		double value = featureValue.doubleValue();				
		if(units != null)
		{
			// Converts to degrees through units.	
			value = units.getConverterTo(getDegreesUnits()).convert(value);
		}
					
		return value;				
	}
	
	protected Unit<?> getDegreesUnits()
	{
		return degreeUnits;
	}
} //EMFFeatureAzimuthElevationFOVOverlayImpl
