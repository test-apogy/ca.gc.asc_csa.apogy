package ca.gc.asc_csa.apogy.addons.ros.utilities;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.ros.node.ConnectedNode;
import org.ros.node.service.ServiceClient;
import org.ros.node.topic.Publisher;
import org.ros.node.topic.Subscriber;

public class AsynchronousShutdowner
{
	private static Queue<Object> shutdownQueue = new LinkedBlockingQueue<Object>();
	
	private static Thread shutdownThread = null;
	
	public static void add(Object o)
	{
		if (shutdownThread == null)
		{
			startShutdownThread();
		}
		
		shutdownQueue.add(o);
	}
	
	private static void shutdownNode(ConnectedNode node)
	{
		node.shutdown();
	}
	
	private static void shutdownSubscriber(Subscriber<?> s)
	{
		s.shutdown();
	}
	
	public static synchronized void startShutdownThread()
	{
		if (shutdownThread == null)
		{
			shutdownThread = new Thread()
			{
				public void run()
				{
					try
					{
						while (isAlive() == true)
						{
							if (shutdownQueue.isEmpty())
							{
								Thread.sleep(1000);
							}
							else
							{
								Object o = shutdownQueue.poll();
								System.out.println("stop " + o.toString());
								if (o instanceof Subscriber)
								{
									shutdownSubscriber((Subscriber<?>)o);
								}
								else if (o instanceof ServiceClient)
								{
									((ServiceClient<?, ?>)o).shutdown();
								}
								else if (o instanceof Publisher)
								{
									((Publisher<?>)o).shutdown();
								}
								else if (o instanceof ConnectedNode)
								{
									shutdownNode((ConnectedNode)o);
								}
							}
						}
					}
					catch(Exception e)
					{
						
					}
				}
			};
			shutdownThread.start();
		}
	}
}
