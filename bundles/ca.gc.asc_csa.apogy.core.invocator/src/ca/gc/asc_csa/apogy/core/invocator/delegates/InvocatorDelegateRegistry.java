package ca.gc.asc_csa.apogy.core.invocator.delegates;
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.Activator;
import ca.gc.asc_csa.apogy.core.invocator.Type;

public class InvocatorDelegateRegistry {
	public static final String INVOCATOR_DELEGATE_POINT_ID = "ca.gc.asc_csa.apogy.core.invocator.invocatorDelegate";
	public static final String INVOCATOR_DELEGATE_POINT_ID_INVOCATOR_DELEGATE_CLASS = "invocatorDelegateClass";

	private static InvocatorDelegateRegistry instance = null;

	private Map<Class <? extends Type>, InvocatorDelegate> invocatorDelegatesMap;

	private InvocatorDelegateRegistry() {
	}

	public static InvocatorDelegateRegistry getInstance() {
		if (instance == null) {
			instance = new InvocatorDelegateRegistry();
		}
		return instance;
	}

	public InvocatorDelegate getInvocatorDelegate(Class<? extends Type> typeClass) {
		if (typeClass != null) {
			InvocatorDelegate delegate = null;
			if (typeClass != null) {
				Class<? extends Type> closestMatch = null;

				Iterator<Class<? extends Type>> iterator = getInvocatorDelegatesMap().keySet().iterator();
				while (iterator.hasNext()) {
					Class<? extends Type> c = iterator.next();

					if (c != null) {
						// If c is a super class or interface of aClass
						if (c.isAssignableFrom(typeClass)) {
							// If no match found yet or the current match is a
							// superclass of the current one.
							if ((closestMatch == null)
									|| (closestMatch.isAssignableFrom(c))) {
								closestMatch = c;
							} else if (!c.isAssignableFrom(closestMatch)) {
								throw new IllegalArgumentException(
										"Cannot determine appropriate adapter");
							}
						}
					}
				}

				delegate = getInvocatorDelegatesMap().get(closestMatch);
			}

			return delegate;
		} else {
			return null;
		}
	}

	protected Map<Class<? extends Type>, InvocatorDelegate> getInvocatorDelegatesMap() {
		if (invocatorDelegatesMap == null) {
			invocatorDelegatesMap = new HashMap<Class<? extends Type>, InvocatorDelegate>();
			
			IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
					.getExtensionPoint(INVOCATOR_DELEGATE_POINT_ID);

			IConfigurationElement[] contributors = extensionPoint
					.getConfigurationElements();

			for (int i = 0; i < contributors.length; i++) {
				IConfigurationElement contributor = contributors[i];

				try {
					
					InvocatorDelegate delegate = (InvocatorDelegate) contributor
							.createExecutableExtension(INVOCATOR_DELEGATE_POINT_ID_INVOCATOR_DELEGATE_CLASS);
					Class<? extends Type> typeClass = delegate.getHandledTypeClass();
					
					invocatorDelegatesMap.put(typeClass, delegate);
					Logger.INSTANCE.log(Activator.ID, this, "Loaded InvocatorDelegate <"
							+ delegate.getClass().getName() + ">",
							EventSeverity.INFO);
				} catch (CoreException e) {
					e.printStackTrace();
					Logger.INSTANCE.log(Activator.ID, this,
							"Failed to load contributed InvocatorDelegate from <"
									+ contributor.getContributor().getName()
									+ ">", EventSeverity.ERROR, e);
				}
			}			
		}
		return invocatorDelegatesMap;
	}
}
