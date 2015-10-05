/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.ImagesCoreFactory;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.symphony.tools.camera.AbstractTextOverlay;
import ca.gc.asc_csa.symphony.tools.camera.Activator;
import ca.gc.asc_csa.symphony.tools.camera.OverlayAlignment;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsFactory;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Text Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.AbstractTextOverlayImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.AbstractTextOverlayImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.AbstractTextOverlayImpl#getHorizontalOffset <em>Horizontal Offset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.AbstractTextOverlayImpl#getVerticalOffset <em>Vertical Offset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.AbstractTextOverlayImpl#getTextColor <em>Text Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTextOverlayImpl extends DrawnCameraOverlayImpl implements AbstractTextOverlay
{
  /**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
  protected static final String FONT_NAME_EDEFAULT = "SansSerif";

  /**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
  protected String fontName = FONT_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
  protected static final int FONT_SIZE_EDEFAULT = 10;

  /**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
  protected int fontSize = FONT_SIZE_EDEFAULT;

  /**
	 * The default value of the '{@link #getHorizontalOffset() <em>Horizontal Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHorizontalOffset()
	 * @generated
	 * @ordered
	 */
  protected static final int HORIZONTAL_OFFSET_EDEFAULT = 10;

  /**
	 * The cached value of the '{@link #getHorizontalOffset() <em>Horizontal Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHorizontalOffset()
	 * @generated
	 * @ordered
	 */
  protected int horizontalOffset = HORIZONTAL_OFFSET_EDEFAULT;

  /**
	 * The default value of the '{@link #getVerticalOffset() <em>Vertical Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVerticalOffset()
	 * @generated
	 * @ordered
	 */
  protected static final int VERTICAL_OFFSET_EDEFAULT = 10;

  /**
	 * The cached value of the '{@link #getVerticalOffset() <em>Vertical Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVerticalOffset()
	 * @generated
	 * @ordered
	 */
  protected int verticalOffset = VERTICAL_OFFSET_EDEFAULT;

  /**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
  protected static final Color3f TEXT_COLOR_EDEFAULT = (Color3f)SymphonyCameraToolsFactory.eINSTANCE.createFromString(SymphonyCameraToolsPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");

  /**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
  protected Color3f textColor = TEXT_COLOR_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractTextOverlayImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyCameraToolsPackage.Literals.ABSTRACT_TEXT_OVERLAY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFontName()
  {
		return fontName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFontName(String newFontName)
  {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_NAME, oldFontName, fontName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getFontSize()
  {
		return fontSize;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFontSize(int newFontSize)
  {
		int oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_SIZE, oldFontSize, fontSize));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getHorizontalOffset()
  {
		return horizontalOffset;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHorizontalOffset(int newHorizontalOffset)
  {
		int oldHorizontalOffset = horizontalOffset;
		horizontalOffset = newHorizontalOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET, oldHorizontalOffset, horizontalOffset));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getVerticalOffset()
  {
		return verticalOffset;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setVerticalOffset(int newVerticalOffset)
  {
		int oldVerticalOffset = verticalOffset;
		verticalOffset = newVerticalOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET, oldVerticalOffset, verticalOffset));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Color3f getTextColor()
  {
		return textColor;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTextColor(Color3f newTextColor)
  {
		Color3f oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__TEXT_COLOR, oldTextColor, textColor));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDisplayedString()
  {
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
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_NAME:
				return getFontName();
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_SIZE:
				return getFontSize();
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET:
				return getHorizontalOffset();
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET:
				return getVerticalOffset();
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__TEXT_COLOR:
				return getTextColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_NAME:
				setFontName((String)newValue);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET:
				setHorizontalOffset((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET:
				setVerticalOffset((Integer)newValue);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__TEXT_COLOR:
				setTextColor((Color3f)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET:
				setHorizontalOffset(HORIZONTAL_OFFSET_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET:
				setVerticalOffset(VERTICAL_OFFSET_EDEFAULT);
				return;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__HORIZONTAL_OFFSET:
				return horizontalOffset != HORIZONTAL_OFFSET_EDEFAULT;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__VERTICAL_OFFSET:
				return verticalOffset != VERTICAL_OFFSET_EDEFAULT;
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyCameraToolsPackage.ABSTRACT_TEXT_OVERLAY___GET_DISPLAYED_STRING:
				return getDisplayedString();
		}
		return super.eInvoke(operationID, arguments);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fontName: ");
		result.append(fontName);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", horizontalOffset: ");
		result.append(horizontalOffset);
		result.append(", verticalOffset: ");
		result.append(verticalOffset);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(')');
		return result.toString();
	}

  @Override
  public AbstractEImage applyOverlay(AbstractCamera camera,	AbstractEImage cameraImage, OverlayAlignment overlayAlignment, int overlayWidth, int overlayHeight) 
  {
	  // Gets the string to display.
	  String text = getDisplayedString();	  
  
	  if(text != null && text.length() > 0)
	  {		  		
		  EImage result = ImagesCoreFactory.eINSTANCE.createEImage();
		  result.setImageContent(cameraImage.asBufferedImage());
		  
		  // Setup to write text on image.
		  BufferedImage image = result.asBufferedImage();
		  
		  Graphics2D g2d = image.createGraphics();	  
		  g2d.setColor(getColorOfText());		  
		  Font font = getFont(getFontName(), Font.BOLD, getFontSize());	  
		  g2d.setFont(font);
		  	  	  	 
		  // Find text location.
		  FontMetrics fontMetrics = g2d.getFontMetrics(font);
		  Rectangle2D textArea = fontMetrics.getStringBounds(text, g2d);
		  
		  int x = 0;
		  int y = 0;
		  
		  switch (overlayAlignment.getValue()) 
		  {
		  	case OverlayAlignment.CENTER_VALUE:	
		  		x = (int) Math.floor(((overlayWidth - textArea.getWidth()) * 0.5));
		  		y = (int) Math.floor(((overlayHeight - textArea.getHeight()) * 0.5));
			break;
			
		  	case OverlayAlignment.LOWER_LEFT_CORNER_VALUE:	
		  		x = getHorizontalOffset();
		  		y = overlayHeight - getVerticalOffset();
			break;
			
		  	case OverlayAlignment.LOWER_RIGHT_CORNER_VALUE:	
		  		x = overlayWidth - getHorizontalOffset() - (int) Math.round(textArea.getWidth());
		  		y = overlayHeight - getVerticalOffset();
			break;
			
		  	case OverlayAlignment.UPPER_LEFT_CORNER_VALUE:	
		  		x = getHorizontalOffset();
		  		y = getVerticalOffset() + (int) Math.round(textArea.getHeight());
			break;
			
		  	case OverlayAlignment.UPPER_RIGHT_CORNER_VALUE:		 
		  		x = overlayWidth - getHorizontalOffset() - (int) Math.round(textArea.getWidth());
		  		y = getVerticalOffset() + (int) Math.round(textArea.getHeight()); 
			break;
	
		  	default:
			break;
		  }
		  
		  // Writes the text onto the image.
		  g2d.drawString(text, x, y);
		  g2d.dispose();	 
		  result.setImageContent(image);
		  
		  return result;
	  }
	  else
	  {	  
		  return cameraImage;
	  }
  }
  
  protected Font getFont(String fontName, int style, int size)
  {
	  Font font  = null;
	  try
	  {
		  font = new Font(fontName, style, size);
	  }
	  catch(Throwable t)
	  {
		  // Log error.
		  Logger.INSTANCE.log(Activator.ID, this, "Failed to create font < name : " + fontName + ", style : " + style + ", size" + size + "> !", EventSeverity.ERROR, t);
		  
		  // Returns a default font.
		  font = new Font(Font.SERIF,Font.PLAIN, size);
	  }
	  
	  return font;
  }
  
  protected Color getColorOfText()
  {
	  if(getTextColor() != null)
	  {
		  return new Color(getTextColor().getX(), getTextColor().getY(), getTextColor().getZ());
	  }
	  else
	  {
		  return Color.GREEN;
	  }
  }  
} //AbstractTextOverlayImpl
