/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;

import ca.gc.space.math.MathFacade;
import ca.gc.space.math.Tuple3d;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3DUtils;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.ui.Activator;
import ca.gc.space.mrt.geometry.data3d.ui.CartesianCoordinatesSetPresentation;
import ca.gc.space.mrt.geometry.data3d.ui.Data3DUIPackage;
import ca.gc.space.mrt.geometry.data3d.ui.preferences.MRTData3DUIPreferencesConstants;
import ca.gc.space.mrt.geometry.data3d.ui.scene_objects.CartesianCoordinatesSetSceneObject;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.ui.SceneObject;
import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Set Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl#getPointCloud <em>Point Cloud</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.ui.impl.CartesianCoordinatesSetPresentationImpl#getNumberOfPoints <em>Number Of Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CartesianCoordinatesSetPresentationImpl extends NodePresentationImpl implements CartesianCoordinatesSetPresentation 
{
	protected IPropertyChangeListener preferencesListener = null;
	
	/**
	 * The cached value of the '{@link #getPointCloud() <em>Point Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointCloud()
	 * @generated
	 * @ordered
	 */
	protected CartesianCoordinatesSet pointCloud;

	/**
	 * The default value of the '{@link #getPointSize() <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSize()
	 * @generated
	 * @ordered
	 */
	protected static final int POINT_SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPointSize() <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSize()
	 * @generated
	 * @ordered
	 */
	protected int pointSize = POINT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPoints() <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfPoints() <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPoints()
	 * @generated
	 * @ordered
	 */
	protected int numberOfPoints = NUMBER_OF_POINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected CartesianCoordinatesSetPresentationImpl() 
	{
		super();
		
		// Initializes values from preferences
		applyPreferences();	
		
		// Register a listener to the preference store
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3DUIPackage.Literals.CARTESIAN_COORDINATES_SET_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSet getPointCloud() {
		if (pointCloud != null && pointCloud.eIsProxy()) {
			InternalEObject oldPointCloud = (InternalEObject)pointCloud;
			pointCloud = (CartesianCoordinatesSet)eResolveProxy(oldPointCloud);
			if (pointCloud != oldPointCloud) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD, oldPointCloud, pointCloud));
			}
		}
		return pointCloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianCoordinatesSet basicGetPointCloud() 
	{
		CartesianCoordinatesSet coordSet = null;
		
		if(getNode() != null)
		{
			ContentNode<?> cNode = (ContentNode<?>) getNode();
			
			if(cNode.getContent() instanceof CartesianCoordinatesSet)
			{
				coordSet = (CartesianCoordinatesSet) cNode.getContent();
			}
		}
		
		return coordSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointCloud(CartesianCoordinatesSet newPointCloud) {
		CartesianCoordinatesSet oldPointCloud = pointCloud;
		pointCloud = newPointCloud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD, oldPointCloud, pointCloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPointSize() {
		return pointSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointSize(int newPointSize) {
		int oldPointSize = pointSize;
		pointSize = newPointSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE, oldPointSize, pointSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public int getNumberOfPoints() 
	{
		int numberOfPoints = 0;

		if (getPointCloud() != null) 
		{
			numberOfPoints = getPointCloud().getPoints().size();
		}

		return numberOfPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD:
				if (resolve) return getPointCloud();
				return basicGetPointCloud();
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE:
				return getPointSize();
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS:
				return getNumberOfPoints();
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
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD:
				setPointCloud((CartesianCoordinatesSet)newValue);
				return;
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE:
				setPointSize((Integer)newValue);
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
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD:
				setPointCloud((CartesianCoordinatesSet)null);
				return;
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE:
				setPointSize(POINT_SIZE_EDEFAULT);
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
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_CLOUD:
				return pointCloud != null;
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE:
				return pointSize != POINT_SIZE_EDEFAULT;
			case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__NUMBER_OF_POINTS:
				return numberOfPoints != NUMBER_OF_POINTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (pointSize: ");
		result.append(pointSize);
		result.append(", numberOfPoints: ");
		result.append(numberOfPoints);
		result.append(')');
		return result.toString();
	}
		
	@Override
	public Tuple3d basicGetCentroid() {
		Data3DUtils utils = Data3dFactory.eINSTANCE.createData3DUtils();

		CartesianPositionCoordinates centroid = utils.computeCentroid(getPointCloud());

		Tuple3d point = MathFacade.INSTANCE.createTuple3d(centroid.asPoint3d());

		return point;
	}
	
	@Override
	public void setSceneObject(SceneObject newSceneObject) {
		if (newSceneObject != null
				&& !(newSceneObject instanceof CartesianCoordinatesSetSceneObject)) {
			throw new IllegalArgumentException();
		}
		super.setSceneObject(newSceneObject);
	}

	@Override
	protected void initialSceneObject() 
	{
		CartesianCoordinatesSetSceneObject pointsSceneObject = (CartesianCoordinatesSetSceneObject) getSceneObject();
		pointsSceneObject.setPointSize(getPointSize());
		
		super.initialSceneObject();
	}

	@Override
	protected void updateSceneObject(Notification notification) 
	{
		if (sceneObject != null) 
		{
			CartesianCoordinatesSetSceneObject pointsSceneObject = (CartesianCoordinatesSetSceneObject) sceneObject;

			if(notification.getNotifier() instanceof CartesianCoordinatesSetPresentation)
			{
				int featureID = notification.getFeatureID(CartesianCoordinatesSetPresentation.class);
				
				switch (featureID) 
				{
					case Data3DUIPackage.CARTESIAN_COORDINATES_SET_PRESENTATION__POINT_SIZE:
						pointsSceneObject.setPointSize(getPointSize());
					break;
														
					default:
					break;
				}
						
			}			
		}
		super.updateSceneObject(notification);
	}

	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_COLOR_ID);
		if(rgb != null) setColor(rgb);		
				
		// Change visibility.
		setVisible(store.getBoolean(MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_VISIBILITY_ID));
		
		// Change point size
		int pointSize = store.getInt(MRTData3DUIPreferencesConstants.DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE_ID);
		setPointSize(pointSize);
				
				
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
	

} //CartesianCoordinatesSetPresentationImpl
