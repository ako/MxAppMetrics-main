// This file was generated by Mendix Modeler 7.19.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxappmetricsapitest.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MxAppMetricsAPITest module
	public static system.proxies.HttpResponse postMetrics(IContext context, system.proxies.HttpRequest _httpRequest, java.lang.String _db)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("HttpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
			params.put("db", _db);
			IMendixObject result = (IMendixObject)Core.execute(context, "MxAppMetricsAPITest.PostMetrics", params);
			return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static system.proxies.HttpResponse postQuery(IContext context, system.proxies.HttpRequest _httpRequest, java.lang.String _q)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("httpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
			params.put("q", _q);
			IMendixObject result = (IMendixObject)Core.execute(context, "MxAppMetricsAPITest.PostQuery", params);
			return result == null ? null : system.proxies.HttpResponse.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}