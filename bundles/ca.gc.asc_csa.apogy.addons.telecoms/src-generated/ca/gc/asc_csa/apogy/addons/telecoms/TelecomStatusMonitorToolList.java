package ca.gc.asc_csa.apogy.addons.telecoms;
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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.addons.SimpleTool;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telecom Status Monitor Tool List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is used to keep track of the list of telecom status monitor
 * tool.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList#getTelecomStatusMonitors <em>Telecom Status Monitors</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomStatusMonitorToolList()
 * @model
 * @generated
 */
public interface TelecomStatusMonitorToolList extends SimpleTool {
	/**
	 * Returns the value of the '<em><b>Telecom Status Monitors</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList <em>Status Monitor Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to keep track of all of the telecom status monitors
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom Status Monitors</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomStatusMonitorToolList_TelecomStatusMonitors()
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList
	 * @model opposite="statusMonitorToolList" containment="true"
	 * @generated
	 */
	EList<TelecomStatusMonitorTool> getTelecomStatusMonitors();

} // TelecomStatusMonitorToolList
