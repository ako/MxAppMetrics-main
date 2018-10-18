// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package mxappmetrics.actions;

import mxappmetrics.impl.TagSplitter;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import java.util.HashMap;
import java.util.Map;

/**
 * Set duration in milliseconds metric.
 */
public class DurationMetric extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String Name;
	private java.lang.Long Duration;
	private java.lang.Boolean IsApplicationKPI;
	private java.lang.String TagName;
	private java.lang.String TagValue;
	private java.lang.String Tags;

	public DurationMetric(IContext context, java.lang.String Name, java.lang.Long Duration, java.lang.Boolean IsApplicationKPI, java.lang.String TagName, java.lang.String TagValue, java.lang.String Tags)
	{
		super(context);
		this.Name = Name;
		this.Duration = Duration;
		this.IsApplicationKPI = IsApplicationKPI;
		this.TagName = TagName;
		this.TagValue = TagValue;
		this.Tags = Tags;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		ILogNode logger = Core.getLogger("AppMetrics");
		logger.info("DurationMetrics");
		Map<String, String> tags = TagSplitter.splitTags(this.Tags);
		tags.put(this.TagName, this.TagValue);
		tags.put("KPI",this.IsApplicationKPI.toString());
		Core.metrics().timers().time(this.Name, this.Duration.longValue(), tags);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "DurationMetric";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}