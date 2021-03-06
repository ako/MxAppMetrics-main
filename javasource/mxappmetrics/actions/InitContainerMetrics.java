// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxappmetrics.actions;

import mxappmetrics.impl.ContainerMetricsReporter;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Initiate periodic reporting of JVM and OS metrics.
 */
public class InitContainerMetrics extends CustomJavaAction<java.lang.Boolean>
{
	public InitContainerMetrics(IContext context)
	{
		super(context);
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        synchronized (isInitialized) {
            if (!isInitialized) {
                Core.getLogger("AppMetrics").warn("Starting ContainerMetricsReporter");
                ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
                scheduler.scheduleAtFixedRate(new ContainerMetricsReporter(), 60, 60, TimeUnit.SECONDS);
                isInitialized = true;
            } else {
                Core.getLogger("AppMetrics").warn("ContainerMetricsReporter already started");
            }
        }
        return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "InitContainerMetrics";
	}

	// BEGIN EXTRA CODE
    private static Boolean isInitialized = false;
	// END EXTRA CODE
}
