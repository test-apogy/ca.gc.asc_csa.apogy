/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alexey Balyberdin (alexey.balyberdin@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui.launching;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.wst.jsdt.debug.internal.ui.IHelpContextIds;

/**
 * Apogy launch configuration tab group for JavaScript debugging
 */
@SuppressWarnings("restriction")
public class ApogyTabGroup extends AbstractLaunchConfigurationTabGroup {

    /*
     * Create standard tabs only, no need to create hostname and port input tab as 
     * they are set automatically on the launch configuration start.
     */
    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        SourceLookupTab slt = new SourceLookupTab();
        slt.setHelpContextId(IHelpContextIds.SOURCE_LOOKUP_TAB);
        EnvironmentTab et = new EnvironmentTab();
        et.setHelpContextId(IHelpContextIds.ENVIRONMENT_TAB);
        CommonTab ct = new CommonTab();
        ct.setHelpContextId(IHelpContextIds.COMMON_TAB);
        ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { slt, et, ct };
        setTabs(tabs);
    }

}
