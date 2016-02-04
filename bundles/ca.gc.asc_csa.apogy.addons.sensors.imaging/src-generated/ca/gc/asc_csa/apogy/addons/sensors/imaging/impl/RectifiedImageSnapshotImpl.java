package ca.gc.asc_csa.apogy.addons.sensors.imaging.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectified Image Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RectifiedImageSnapshotImpl extends ImageSnapshotImpl implements RectifiedImageSnapshot
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RectifiedImageSnapshotImpl()
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
		return ApogyAddonsSensorsImagingPackage.Literals.RECTIFIED_IMAGE_SNAPSHOT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractEImage getRectifiedImage()
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyAddonsSensorsImagingPackage.RECTIFIED_IMAGE_SNAPSHOT___GET_RECTIFIED_IMAGE:
				return getRectifiedImage();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RectifiedImageSnapshotImpl
