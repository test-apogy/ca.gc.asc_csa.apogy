/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.ui.Activator;
import org.eclipse.symphony.common.geometry.data3d.ui.Symphony__CommonGeometryData3DUIPackage;
import org.eclipse.symphony.common.geometry.data3d.ui.TriangularMeshPresentation;
import org.eclipse.symphony.common.geometry.data3d.ui.preferences.MRTData3DUIPreferencesConstants;
import org.eclipse.symphony.common.geometry.data3d.ui.scene_objects.TriangularMeshSceneObject;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.SceneObject;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triangular Mesh Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#getMesh <em>Mesh</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#getNumberOfPoints <em>Number Of Points</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#getNumberOfPolygons <em>Number Of Polygons</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#isUseShading <em>Use Shading</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.ui.impl.TriangularMeshPresentationImpl#getTextureImage <em>Texture Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriangularMeshPresentationImpl extends NodePresentationImpl implements TriangularMeshPresentation {
	/**
	 * The cached value of the '{@link #getMesh() <em>Mesh</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesh()
	 * @generated
	 * @ordered
	 */
	protected CartesianTriangularMesh mesh;

	protected IPropertyChangeListener preferencesListener = null;
	
	/**
	 * The default value of the '{@link #getPointSize() <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPointSize()
	 * @generated
	 * @ordered
	 */
	protected static final int POINT_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPointSize() <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPointSize()
	 * @generated
	 * @ordered
	 */
	protected int pointSize = POINT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPoints() <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNumberOfPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfPoints() <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNumberOfPoints()
	 * @generated
	 * @ordered
	 */
	protected int numberOfPoints = NUMBER_OF_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPolygons() <em>Number Of Polygons</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNumberOfPolygons()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_POLYGONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfPolygons() <em>Number Of Polygons</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNumberOfPolygons()
	 * @generated
	 * @ordered
	 */
	protected int numberOfPolygons = NUMBER_OF_POLYGONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected static final MeshPresentationMode PRESENTATION_MODE_EDEFAULT = MeshPresentationMode.SURFACE;

	/**
	 * The cached value of the '{@link #getPresentationMode() <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPresentationMode()
	 * @generated
	 * @ordered
	 */
	protected MeshPresentationMode presentationMode = PRESENTATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected static final float TRANSPARENCY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTransparency()
	 * @generated
	 * @ordered
	 */
	protected float transparency = TRANSPARENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseShading() <em>Use Shading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseShading()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_SHADING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseShading() <em>Use Shading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseShading()
	 * @generated
	 * @ordered
	 */
	protected boolean useShading = USE_SHADING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextureImage() <em>Texture Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureImage()
	 * @generated
	 * @ordered
	 */
	protected AbstractEImage textureImage;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected TriangularMeshPresentationImpl() 
	{
		super();
		
		// Initializes values from preferences
		applyPreferences();	
		
		// Register a listener to the preference store
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());	
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonGeometryData3DUIPackage.Literals.TRIANGULAR_MESH_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointSize() {
		return pointSize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointSize(int newPointSize) {
		int oldPointSize = pointSize;
		pointSize = newPointSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE, oldPointSize, pointSize));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int getNumberOfPoints() {
		if (getMesh() != null) {
			return getMesh().getPoints().size();
		} else {
			return 0;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public int getNumberOfPolygons() {
		if (getMesh() != null) {
			return getMesh().getPolygons().size();
		} else {
			return 0;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMesh getMesh() {
		if (mesh != null && mesh.eIsProxy()) {
			InternalEObject oldMesh = (InternalEObject)mesh;
			mesh = (CartesianTriangularMesh)eResolveProxy(oldMesh);
			if (mesh != oldMesh) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__MESH, oldMesh, mesh));
			}
		}
		return mesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh basicGetMesh() {

		CartesianTriangularMesh mesh = null;

		if (getNode() != null) {
			ContentNode<?> cNode = (ContentNode<?>) getNode();

			if (cNode.getContent() instanceof CartesianTriangularMesh) {
				mesh = (CartesianTriangularMesh) cNode.getContent();
			}
		}

		return mesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public boolean isSetMesh() {
		return getNode() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeshPresentationMode getPresentationMode() {
		return presentationMode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationMode(MeshPresentationMode newPresentationMode) {
		MeshPresentationMode oldPresentationMode = presentationMode;
		presentationMode = newPresentationMode == null ? PRESENTATION_MODE_EDEFAULT : newPresentationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE, oldPresentationMode, presentationMode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public float getTransparency() {
		return transparency;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(float newTransparency) {
		float oldTransparency = transparency;
		transparency = newTransparency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY, oldTransparency, transparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseShading() {
		return useShading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseShading(boolean newUseShading) {
		boolean oldUseShading = useShading;
		useShading = newUseShading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__USE_SHADING, oldUseShading, useShading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage getTextureImage() {
		if (textureImage != null && textureImage.eIsProxy()) {
			InternalEObject oldTextureImage = (InternalEObject)textureImage;
			textureImage = (AbstractEImage)eResolveProxy(oldTextureImage);
			if (textureImage != oldTextureImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE, oldTextureImage, textureImage));
			}
		}
		return textureImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage basicGetTextureImage() {
		return textureImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextureImage(AbstractEImage newTextureImage) {
		AbstractEImage oldTextureImage = textureImage;
		textureImage = newTextureImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE, oldTextureImage, textureImage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__MESH:
				if (resolve) return getMesh();
				return basicGetMesh();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE:
				return getPointSize();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS:
				return getNumberOfPoints();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS:
				return getNumberOfPolygons();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE:
				return getPresentationMode();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY:
				return getTransparency();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__USE_SHADING:
				return isUseShading();
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE:
				if (resolve) return getTextureImage();
				return basicGetTextureImage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE:
				setPointSize((Integer)newValue);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode((MeshPresentationMode)newValue);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY:
				setTransparency((Float)newValue);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__USE_SHADING:
				setUseShading((Boolean)newValue);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE:
				setTextureImage((AbstractEImage)newValue);
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
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE:
				setPointSize(POINT_SIZE_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE:
				setPresentationMode(PRESENTATION_MODE_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY:
				setTransparency(TRANSPARENCY_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__USE_SHADING:
				setUseShading(USE_SHADING_EDEFAULT);
				return;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE:
				setTextureImage((AbstractEImage)null);
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
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__MESH:
				return mesh != null;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE:
				return pointSize != POINT_SIZE_EDEFAULT;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS:
				return numberOfPoints != NUMBER_OF_POINTS_EDEFAULT;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS:
				return numberOfPolygons != NUMBER_OF_POLYGONS_EDEFAULT;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE:
				return presentationMode != PRESENTATION_MODE_EDEFAULT;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY:
				return transparency != TRANSPARENCY_EDEFAULT;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__USE_SHADING:
				return useShading != USE_SHADING_EDEFAULT;
			case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE:
				return textureImage != null;
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
		result.append(" (pointSize: ");
		result.append(pointSize);
		result.append(", numberOfPoints: ");
		result.append(numberOfPoints);
		result.append(", numberOfPolygons: ");
		result.append(numberOfPolygons);
		result.append(", presentationMode: ");
		result.append(presentationMode);
		result.append(", transparency: ");
		result.append(transparency);
		result.append(", useShading: ");
		result.append(useShading);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setSceneObject(SceneObject newSceneObject) {
		if (newSceneObject != null
				&& !(newSceneObject instanceof TriangularMeshSceneObject)) {
			throw new IllegalArgumentException();
		}
		super.setSceneObject(newSceneObject);
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (sceneObject != null) 
		{
			TriangularMeshSceneObject meshSceneObject = (TriangularMeshSceneObject) sceneObject;
		
			if(notification.getNotifier() instanceof TriangularMeshPresentation)
			{
				int featureID = notification.getFeatureID(TriangularMeshPresentation.class);
				
				switch (featureID) 
				{
					case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__POINT_SIZE:
						int newPointSizeValue = notification.getNewIntValue();
						meshSceneObject.setPointSize(newPointSizeValue);
					break;
					
					case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE:
						MeshPresentationMode newMode = (MeshPresentationMode) notification.getNewValue();
						meshSceneObject.setPresentationMode(newMode);	
					break;
					
					case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY:
						meshSceneObject.setTransparency(notification.getNewFloatValue());
					break;

					case Symphony__CommonGeometryData3DUIPackage.TRIANGULAR_MESH_PRESENTATION__USE_SHADING:
						meshSceneObject.setUseShading(notification.getNewBooleanValue());
					break;
					
					default:
					break;
				}
			}
		}
		super.updateSceneObject(notification);
	}

	@Override
	protected void initialSceneObject() 
	{
		TriangularMeshSceneObject meshSceneObject = (TriangularMeshSceneObject) sceneObject;
		meshSceneObject.setPointSize(getPointSize());
		meshSceneObject.setPresentationMode(getPresentationMode());
		meshSceneObject.setTransparency(getTransparency());

		super.initialSceneObject();
	}

	@Override
	public Tuple3d basicGetCentroid() 
	{
		Tuple3d centroid = Symphony__CommonMathFacade.INSTANCE.createTuple3d(0.0, 0.0, 0.0);

		if (getSceneObject() != null) {
			centroid = Symphony__CommonMathFacade.INSTANCE.createTuple3d(getSceneObject()
					.getCentroid());
		}
		return centroid;
	}

	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_COLOR_ID);
		if(rgb != null) setColor(rgb);
		
		// Change visibility.
		setVisible(store.getBoolean(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_VISIBILITY_ID));
		
		// Change use shading
		setUseShading(store.getBoolean(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_USE_SHADING_ID));
		
		// Change point size
		setPointSize(store.getInt(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_POINT_SIZE_ID));

		// Change mode.
		setPresentationMode(MeshPresentationMode.get(store.getInt(MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE_ID)));
						
		super.applyPreferences();
	}
	
	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{

				public void propertyChange(PropertyChangeEvent event) 
				{	
					applyPreferences();		
				}	
			};
		}
		
		return preferencesListener;
	}
	} //TriangularMeshPresentationImpl
