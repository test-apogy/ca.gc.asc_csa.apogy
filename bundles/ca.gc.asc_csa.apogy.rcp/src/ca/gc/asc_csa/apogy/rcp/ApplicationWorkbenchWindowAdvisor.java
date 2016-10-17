package ca.gc.asc_csa.apogy.rcp;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {		
		super(configurer);
	}
	
    @Override
    public void postWindowCreate() {
//    	System.out.println("ApplicationWorkbenchWindowAdvisor.postWindowCreate()");
        // remove unwanted menu entries
	List<String> unwantedItems = Arrays.asList(
		"org.eclipse.ui.openLocalFile", 
		"converstLineDelimitersTo", 
		"org.eclipse.ui.cheatsheets.actions.CheatSheetHelpMenuAction",
		"org.eclipse.debug.ui.actions.BreakpointTypesContribution" ,
		"ExternalToolsGroup" ,
		"org.eclipse.ui.externaltools.ExternalToolMenuDelegateMenu" ,
		"navigate" ,
		"org.eclipse.search.menu", 
		"org.eclipse.ui.run",
		"org.eclipse.debug.ui"
	);
	
        IMenuManager menuManager = getWindowConfigurer().getActionBarConfigurer().getMenuManager();
        removeUnwantedItems(unwantedItems, menuManager);
        
    }
    
    private void removeUnwantedItems(final List<String> unwantedItems, final IMenuManager menuManager) {
//    	System.out.println("ApplicationWorkbenchWindowAdvisor.removeUnwantedItems()");
	IContributionItem[] items = menuManager.getItems();
	
	for (IContributionItem item : items) {
	    if (item instanceof IMenuManager) {
		removeUnwantedItems(unwantedItems, (IMenuManager) item);
	    }
	    
//	    System.out.println("ApplicationWorkbenchWindowAdvisor.removeUnwantedItems() item id = " + item.getId());
	    
	    if (unwantedItems.contains(item.getId())) {
		menuManager.remove(item);
	    }
	}
    }
}