// This file was generated by Mendix Modeler 7.22.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxappmetricstest.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MxAppMetricsTest module
	public static mxappmetricstest.proxies.MetricTestData create_MetricTestData(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MxAppMetricsTest.Create_MetricTestData", params);
			return result == null ? null : mxappmetricstest.proxies.MetricTestData.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void getNuNl(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxAppMetricsTest.GetNuNl", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void incrementMetricEvery6Seconds(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxAppMetricsTest.IncrementMetricEvery6Seconds", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean initApp(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MxAppMetricsTest.InitApp", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void registerCounterMetric(IContext context, mxappmetricstest.proxies.MetricTestData _metricTestData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MetricTestData", _metricTestData == null ? null : _metricTestData.getMendixObject());
			Core.execute(context, "MxAppMetricsTest.RegisterCounterMetric", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void registerDurationMetric(IContext context, mxappmetricstest.proxies.MetricTestData _metricTestData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MetricTestData", _metricTestData == null ? null : _metricTestData.getMendixObject());
			Core.execute(context, "MxAppMetricsTest.RegisterDurationMetric", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void registerGaugeMetric(IContext context, mxappmetricstest.proxies.MetricTestData _metricTestData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MetricTestData", _metricTestData == null ? null : _metricTestData.getMendixObject());
			Core.execute(context, "MxAppMetricsTest.RegisterGaugeMetric", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void registerMetric(IContext context, mxappmetricstest.proxies.Metric _metric)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Metric", _metric == null ? null : _metric.getMendixObject());
			Core.execute(context, "MxAppMetricsTest.RegisterMetric", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void registerSetMetric(IContext context, mxappmetricstest.proxies.MetricTestData _metricTestData)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MetricTestData", _metricTestData == null ? null : _metricTestData.getMendixObject());
			Core.execute(context, "MxAppMetricsTest.RegisterSetMetric", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}