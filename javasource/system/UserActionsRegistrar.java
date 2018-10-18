package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(mxappmetrics.actions.CounterDecrementMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.CounterIncrementMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.CounterMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.DurationMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.GaugeMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.InitContainerMetrics.class);
    registrator.registerUserAction(mxappmetrics.actions.SetMetric.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
