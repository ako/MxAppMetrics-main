// This file was generated by Mendix Modeler 7.22.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxappmetrics.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the MxAppMetrics module

	public static java.lang.String getAPP_METRICS_VERSION()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("MxAppMetrics.APP_METRICS_VERSION");
	}
}