/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import javax.vecmath.Color3f;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.addons.Ruler3DTool;
import org.eclipse.symphony.addons.Ruler3dToolNode;
import org.eclipse.symphony.addons.SymphonyToolsCoreFactory;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.ui.NodeSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruler3 DTool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getRulerColor <em>Ruler Color</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getExtremitiesRadius <em>Extremities Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getMinorTickColor <em>Minor Tick Color</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getMinorTickSpacing <em>Minor Tick Spacing</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getMinorTickLenght <em>Minor Tick Lenght</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getMajorTickColor <em>Major Tick Color</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getMajorTickSpacing <em>Major Tick Spacing</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getMajorTickLenght <em>Major Tick Lenght</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Ruler3DToolImpl#getRuler3dToolNode <em>Ruler3d Tool Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Ruler3DToolImpl extends AbstractTwoPoints3DToolImpl implements Ruler3DTool 
{
	public static int FROM_NODE_INDEX = 0;
	public static int TO_NODE_INDEX = 1;
	private int nextNode = FROM_NODE_INDEX;	
	
	/**
	 * The default value of the '{@link #getRulerColor() <em>Ruler Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulerColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f RULER_COLOR_EDEFAULT = (Color3f)SymphonyToolsCoreFactory.eINSTANCE.createFromString(SymphonyToolsCorePackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");
	/**
	 * The cached value of the '{@link #getRulerColor() <em>Ruler Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulerColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f rulerColor = RULER_COLOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getExtremitiesRadius() <em>Extremities Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtremitiesRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double EXTREMITIES_RADIUS_EDEFAULT = 0.01;
	/**
	 * The cached value of the '{@link #getExtremitiesRadius() <em>Extremities Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtremitiesRadius()
	 * @generated
	 * @ordered
	 */
	protected double extremitiesRadius = EXTREMITIES_RADIUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinorTickColor() <em>Minor Tick Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorTickColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f MINOR_TICK_COLOR_EDEFAULT = (Color3f)SymphonyToolsCoreFactory.eINSTANCE.createFromString(SymphonyToolsCorePackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");
	/**
	 * The cached value of the '{@link #getMinorTickColor() <em>Minor Tick Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorTickColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f minorTickColor = MINOR_TICK_COLOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinorTickSpacing() <em>Minor Tick Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorTickSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double MINOR_TICK_SPACING_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getMinorTickSpacing() <em>Minor Tick Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorTickSpacing()
	 * @generated
	 * @ordered
	 */
	protected double minorTickSpacing = MINOR_TICK_SPACING_EDEFAULT;
	/**
	 * The default value of the '{@link #getMinorTickLenght() <em>Minor Tick Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorTickLenght()
	 * @generated
	 * @ordered
	 */
	protected static final double MINOR_TICK_LENGHT_EDEFAULT = 0.1;
	/**
	 * The cached value of the '{@link #getMinorTickLenght() <em>Minor Tick Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinorTickLenght()
	 * @generated
	 * @ordered
	 */
	protected double minorTickLenght = MINOR_TICK_LENGHT_EDEFAULT;
	/**
	 * The default value of the '{@link #getMajorTickColor() <em>Major Tick Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorTickColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f MAJOR_TICK_COLOR_EDEFAULT = (Color3f)SymphonyToolsCoreFactory.eINSTANCE.createFromString(SymphonyToolsCorePackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");
	/**
	 * The cached value of the '{@link #getMajorTickColor() <em>Major Tick Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorTickColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f majorTickColor = MAJOR_TICK_COLOR_EDEFAULT;
	/**
	 * The default value of the '{@link #getMajorTickSpacing() <em>Major Tick Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorTickSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double MAJOR_TICK_SPACING_EDEFAULT = 1.0;
	/**
	 * The cached value of the '{@link #getMajorTickSpacing() <em>Major Tick Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorTickSpacing()
	 * @generated
	 * @ordered
	 */
	protected double majorTickSpacing = MAJOR_TICK_SPACING_EDEFAULT;
	/**
	 * The default value of the '{@link #getMajorTickLenght() <em>Major Tick Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorTickLenght()
	 * @generated
	 * @ordered
	 */
	protected static final double MAJOR_TICK_LENGHT_EDEFAULT = 0.2;
	/**
	 * The cached value of the '{@link #getMajorTickLenght() <em>Major Tick Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorTickLenght()
	 * @generated
	 * @ordered
	 */
	protected double majorTickLenght = MAJOR_TICK_LENGHT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRuler3dToolNode() <em>Ruler3d Tool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuler3dToolNode()
	 * @generated
	 * @ordered
	 */
	protected Ruler3dToolNode ruler3dToolNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ruler3DToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsCorePackage.Literals.RULER3_DTOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3dToolNode getRuler3dToolNode() {
		if (ruler3dToolNode != null && ruler3dToolNode.eIsProxy()) {
			InternalEObject oldRuler3dToolNode = (InternalEObject)ruler3dToolNode;
			ruler3dToolNode = (Ruler3dToolNode)eResolveProxy(oldRuler3dToolNode);
			if (ruler3dToolNode != oldRuler3dToolNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE, oldRuler3dToolNode, ruler3dToolNode));
			}
		}
		return ruler3dToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3dToolNode basicGetRuler3dToolNode() {
		return ruler3dToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuler3dToolNode(Ruler3dToolNode newRuler3dToolNode, NotificationChain msgs) {
		Ruler3dToolNode oldRuler3dToolNode = ruler3dToolNode;
		ruler3dToolNode = newRuler3dToolNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE, oldRuler3dToolNode, newRuler3dToolNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuler3dToolNode(Ruler3dToolNode newRuler3dToolNode) {
		if (newRuler3dToolNode != ruler3dToolNode) {
			NotificationChain msgs = null;
			if (ruler3dToolNode != null)
				msgs = ((InternalEObject)ruler3dToolNode).eInverseRemove(this, SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL, Ruler3dToolNode.class, msgs);
			if (newRuler3dToolNode != null)
				msgs = ((InternalEObject)newRuler3dToolNode).eInverseAdd(this, SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL, Ruler3dToolNode.class, msgs);
			msgs = basicSetRuler3dToolNode(newRuler3dToolNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE, newRuler3dToolNode, newRuler3dToolNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
				if (ruler3dToolNode != null)
					msgs = ((InternalEObject)ruler3dToolNode).eInverseRemove(this, SymphonyToolsCorePackage.RULER3D_TOOL_NODE__RULER3_DTOOL, Ruler3dToolNode.class, msgs);
				return basicSetRuler3dToolNode((Ruler3dToolNode)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
				return basicSetRuler3dToolNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getRulerColor() {
		return rulerColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRulerColor(Color3f newRulerColor) {
		Color3f oldRulerColor = rulerColor;
		rulerColor = newRulerColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__RULER_COLOR, oldRulerColor, rulerColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExtremitiesRadius() {
		return extremitiesRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtremitiesRadius(double newExtremitiesRadius) {
		double oldExtremitiesRadius = extremitiesRadius;
		extremitiesRadius = newExtremitiesRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__EXTREMITIES_RADIUS, oldExtremitiesRadius, extremitiesRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getMinorTickColor() {
		return minorTickColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorTickColor(Color3f newMinorTickColor) {
		Color3f oldMinorTickColor = minorTickColor;
		minorTickColor = newMinorTickColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_COLOR, oldMinorTickColor, minorTickColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinorTickSpacing() {
		return minorTickSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorTickSpacing(double newMinorTickSpacing) {
		double oldMinorTickSpacing = minorTickSpacing;
		minorTickSpacing = newMinorTickSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_SPACING, oldMinorTickSpacing, minorTickSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinorTickLenght() {
		return minorTickLenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinorTickLenght(double newMinorTickLenght) {
		double oldMinorTickLenght = minorTickLenght;
		minorTickLenght = newMinorTickLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_LENGHT, oldMinorTickLenght, minorTickLenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getMajorTickColor() {
		return majorTickColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorTickColor(Color3f newMajorTickColor) {
		Color3f oldMajorTickColor = majorTickColor;
		majorTickColor = newMajorTickColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_COLOR, oldMajorTickColor, majorTickColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMajorTickSpacing() {
		return majorTickSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorTickSpacing(double newMajorTickSpacing) {
		double oldMajorTickSpacing = majorTickSpacing;
		majorTickSpacing = newMajorTickSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_SPACING, oldMajorTickSpacing, majorTickSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMajorTickLenght() {
		return majorTickLenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorTickLenght(double newMajorTickLenght) {
		double oldMajorTickLenght = majorTickLenght;
		majorTickLenght = newMajorTickLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_LENGHT, oldMajorTickLenght, majorTickLenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER_COLOR:
				return getRulerColor();
			case SymphonyToolsCorePackage.RULER3_DTOOL__EXTREMITIES_RADIUS:
				return getExtremitiesRadius();
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_COLOR:
				return getMinorTickColor();
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_SPACING:
				return getMinorTickSpacing();
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_LENGHT:
				return getMinorTickLenght();
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_COLOR:
				return getMajorTickColor();
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_SPACING:
				return getMajorTickSpacing();
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_LENGHT:
				return getMajorTickLenght();
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
				if (resolve) return getRuler3dToolNode();
				return basicGetRuler3dToolNode();
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
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER_COLOR:
				setRulerColor((Color3f)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__EXTREMITIES_RADIUS:
				setExtremitiesRadius((Double)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_COLOR:
				setMinorTickColor((Color3f)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_SPACING:
				setMinorTickSpacing((Double)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_LENGHT:
				setMinorTickLenght((Double)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_COLOR:
				setMajorTickColor((Color3f)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_SPACING:
				setMajorTickSpacing((Double)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_LENGHT:
				setMajorTickLenght((Double)newValue);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
				setRuler3dToolNode((Ruler3dToolNode)newValue);
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
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER_COLOR:
				setRulerColor(RULER_COLOR_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__EXTREMITIES_RADIUS:
				setExtremitiesRadius(EXTREMITIES_RADIUS_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_COLOR:
				setMinorTickColor(MINOR_TICK_COLOR_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_SPACING:
				setMinorTickSpacing(MINOR_TICK_SPACING_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_LENGHT:
				setMinorTickLenght(MINOR_TICK_LENGHT_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_COLOR:
				setMajorTickColor(MAJOR_TICK_COLOR_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_SPACING:
				setMajorTickSpacing(MAJOR_TICK_SPACING_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_LENGHT:
				setMajorTickLenght(MAJOR_TICK_LENGHT_EDEFAULT);
				return;
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
				setRuler3dToolNode((Ruler3dToolNode)null);
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
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER_COLOR:
				return RULER_COLOR_EDEFAULT == null ? rulerColor != null : !RULER_COLOR_EDEFAULT.equals(rulerColor);
			case SymphonyToolsCorePackage.RULER3_DTOOL__EXTREMITIES_RADIUS:
				return extremitiesRadius != EXTREMITIES_RADIUS_EDEFAULT;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_COLOR:
				return MINOR_TICK_COLOR_EDEFAULT == null ? minorTickColor != null : !MINOR_TICK_COLOR_EDEFAULT.equals(minorTickColor);
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_SPACING:
				return minorTickSpacing != MINOR_TICK_SPACING_EDEFAULT;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MINOR_TICK_LENGHT:
				return minorTickLenght != MINOR_TICK_LENGHT_EDEFAULT;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_COLOR:
				return MAJOR_TICK_COLOR_EDEFAULT == null ? majorTickColor != null : !MAJOR_TICK_COLOR_EDEFAULT.equals(majorTickColor);
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_SPACING:
				return majorTickSpacing != MAJOR_TICK_SPACING_EDEFAULT;
			case SymphonyToolsCorePackage.RULER3_DTOOL__MAJOR_TICK_LENGHT:
				return majorTickLenght != MAJOR_TICK_LENGHT_EDEFAULT;
			case SymphonyToolsCorePackage.RULER3_DTOOL__RULER3D_TOOL_NODE:
				return ruler3dToolNode != null;
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
		result.append(" (rulerColor: ");
		result.append(rulerColor);
		result.append(", extremitiesRadius: ");
		result.append(extremitiesRadius);
		result.append(", minorTickColor: ");
		result.append(minorTickColor);
		result.append(", minorTickSpacing: ");
		result.append(minorTickSpacing);
		result.append(", minorTickLenght: ");
		result.append(minorTickLenght);
		result.append(", majorTickColor: ");
		result.append(majorTickColor);
		result.append(", majorTickSpacing: ");
		result.append(majorTickSpacing);
		result.append(", majorTickLenght: ");
		result.append(majorTickLenght);
		result.append(')');
		return result.toString();
	}

	@Override
	public void selectionChanged(NodeSelection nodeSelection) 
	{					
		if(!isDisposed())
		{
			Node node = nodeSelection.getSelectedNode();
			
			Tuple3d relativePosition = null;
			if(nodeSelection.getRelativeIntersectionPoint() != null)
			{
				relativePosition = MathFacade.INSTANCE.createTuple3d(nodeSelection.getRelativeIntersectionPoint());
			}
			
			Tuple3d normal = null;
			if(nodeSelection.getAbsoluteIntersectionNormal() != null)
			{				
				normal = MathFacade.INSTANCE.createTuple3d(nodeSelection.getAbsoluteIntersectionNormal().x, nodeSelection.getAbsoluteIntersectionNormal().y, nodeSelection.getAbsoluteIntersectionNormal().z);
			}
			
			if(nextNode == TO_NODE_INDEX)
			{
				if(!isFromNodeLock())
				{
					updateFromNode(node, relativePosition, normal);
				}	
				else if(!isToNodeLock())
				{
					updateToNode(node, relativePosition, normal);
				}
				
				nextNode = FROM_NODE_INDEX;
			}
			else if(nextNode == FROM_NODE_INDEX)
			{
				if(!isToNodeLock())
				{
					updateToNode(node, relativePosition, normal);
				}
				else if(!isFromNodeLock())
				{
					updateFromNode(node, relativePosition, normal);
				}
				
				nextNode = TO_NODE_INDEX;
			}							
		}
	}
	
	@Override
	public void pointsRelativePoseChanged(Matrix4d newPose) 
	{
		if(!isDisposed()) updateRuler();
	}

	@Override
	public void dispose() 
	{
		if(getRuler3dToolNode() != null)
		{
			detachRuler3dToolNode();
		}
		setRuler3dToolNode(null);
		
		super.dispose();
	}
	
	protected void updateFromNode(Node node, Tuple3d relativePosition,Tuple3d normal)
	{
		setFromNode(node);
		if(relativePosition != null)
		{
			setFromRelativePosition(EcoreUtil.copy(relativePosition));
		}			
		updateRuler();
	}
	
	protected void updateToNode(Node node, Tuple3d relativePosition,Tuple3d normal)
	{
		setToNode(node);
		if(relativePosition != null)
		{
			setToRelativePosition(EcoreUtil.copy(relativePosition));
		}
		updateRuler();	
	}
	
	protected void updateRuler()
	{
//		updateFromAbsolutePosition();
//		updateToAbsolutePosition();
					
		// Creates Ruler3dToolNode if no yet initialized.
		if(getRuler3dToolNode() == null) 
		{
			setRuler3dToolNode(SymphonyToolsCoreFactory.eINSTANCE.createRuler3dToolNode());
		}		
		attachRuler3dToolNode();
		
		if(getFromNode() != null && getToNode() != null)
		{		
			if(getToAbsolutePosition() != null && getFromAbsolutePosition() != null)
			{
				Point3d from = new Point3d(getFromAbsolutePosition().asTuple3d());
				Point3d to = new Point3d(getToAbsolutePosition().asTuple3d());
				setDistance(from.distance(to));
				return;
			}
			else
			{
				setDistance(0.0);
				return;
			}		
		}
		setDistance(0.0);
	}
	
	protected boolean attachRuler3dToolNode()
	{
		GroupNode root = null;
		if(getFromNode() != null)
		{
			Node node = TopologyFacade.INSTANCE.findRoot(getFromNode());
			
			if(node instanceof GroupNode)
			{
				root = (GroupNode) node;	
			}			
		}
		
		if(root == null && getToNode() != null)
		{
			Node node = TopologyFacade.INSTANCE.findRoot(getToNode());
			
			if(node instanceof GroupNode)
			{
				root = (GroupNode) node;	
			}
		}
		
		if(root != null)
		{
			root.getChildren().add(getRuler3dToolNode());
			getRuler3dToolNode().setParent(root);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	protected void detachRuler3dToolNode()
	{
		if(getRuler3dToolNode() != null && getRuler3dToolNode().getParent() instanceof GroupNode)
		{
			GroupNode parent = (GroupNode) getRuler3dToolNode().getParent();
			parent.getChildren().remove(getRuler3dToolNode());			
		}
	}
	
} //Ruler3DToolImpl
