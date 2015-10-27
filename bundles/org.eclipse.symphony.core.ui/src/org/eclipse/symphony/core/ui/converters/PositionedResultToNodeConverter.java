package org.eclipse.symphony.core.ui.converters;

import java.util.Iterator;

import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.core.PositionedResult;
import org.eclipse.symphony.core.ResultNode;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.SymphonyTopology;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.InvocatorSession;

public class PositionedResultToNodeConverter implements IConverter{

	@Override
	public boolean canConvert(Object arg0) {
		return getNode((PositionedResult) arg0) != null;
	}

	@Override
	public Object convert(Object arg0) throws Exception {
		return getNode((PositionedResult) arg0);
	}

	@Override
	public Class<?> getInputType() {
		return PositionedResult.class;
	}

	@Override
	public Class<?> getOutputType() {
		return Node.class;
	}
	
	/**
	 * Searches the {@link Node} associated to the {@link PositionedResult}
	 * @param positionedResult Reference to the {@link PositionedResult}
	 * @return Reference to the {@link Node} or null if not found.
	 */
	protected Node getNode(PositionedResult positionedResult){
		Node node = null;
				
		InvocatorSession invocatorSession = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (invocatorSession != null){
			Environment environment = invocatorSession.getEnvironment();
			if (environment instanceof SymphonyEnvironment){
				SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) environment;				
				SymphonyTopology symphonyTopology = symphonyEnvironment.getSymphonyTopology();				
				if (symphonyTopology != null){
					GroupNode groupNode = symphonyTopology.getRootNode();
					
					if (groupNode != null){
						Iterator<Node> resultNodes = TopologyFacade.INSTANCE.findNodesByType(Symphony__CorePackage.Literals.RESULT_NODE, groupNode).iterator();
						ResultNode resultNode = null;
						
						while (resultNodes.hasNext() && resultNode == null){
							ResultNode current = (ResultNode) resultNodes.next();
							if (current.getResult() == positionedResult){
								resultNode = current;
							}
						}
						
						if (resultNode != null){						
							if (!resultNode.getAggregatedChildren().isEmpty()){
								node = resultNode.getAggregatedChildren().get(0);
							}							
						}
					}
				}
			}		
		}
		
		return node;
	}
}