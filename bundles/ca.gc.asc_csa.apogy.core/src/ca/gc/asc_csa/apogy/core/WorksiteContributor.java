package ca.gc.asc_csa.apogy.core;

import org.eclipse.emf.common.util.URI;

public class WorksiteContributor 
{
	public String name;
	public String description;
	public URI uri;
	
	public WorksiteContributor(String name, String description, URI uri)
	{
		this.name = name;
		this.description = description;
		this.uri = uri;
	}
}