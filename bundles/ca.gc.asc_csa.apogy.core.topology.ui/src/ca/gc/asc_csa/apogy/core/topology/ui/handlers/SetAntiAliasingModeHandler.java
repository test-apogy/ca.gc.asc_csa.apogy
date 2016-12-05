package ca.gc.asc_csa.apogy.core.topology.ui.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.topology.ui.parts.AbstractApogyTopologyBasedPart;

public class SetAntiAliasingModeHandler {

	@CanExecute
	public boolean canExecute(MPart part){
		return ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null;
	}
	
	@Execute
	public void execute(MPart part, final MToolItem item){
		if (part.getObject() instanceof AbstractApogyTopologyBasedPart){
			AbstractApogyTopologyBasedPart apogyTopologyBasedPart = (AbstractApogyTopologyBasedPart) part.getObject();
			apogyTopologyBasedPart.setAntiAliasing(item.isSelected());
		}
	}
}