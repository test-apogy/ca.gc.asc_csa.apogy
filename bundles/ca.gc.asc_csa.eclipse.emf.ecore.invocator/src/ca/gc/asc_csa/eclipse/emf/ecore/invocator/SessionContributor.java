package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.URI;

public class SessionContributor 
{
	public String name;
	public String description;
	public URI uri;
	
	public SessionContributor(String name,String description, URI uri)
	{
		this.name = name;
		this.description = description;
		this.uri = uri;
	}
}
