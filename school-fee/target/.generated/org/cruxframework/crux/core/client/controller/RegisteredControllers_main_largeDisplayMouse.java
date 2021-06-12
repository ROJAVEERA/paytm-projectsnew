package org.cruxframework.crux.core.client.controller;

import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.Screen;
import com.google.gwt.core.client.RunAsyncCallback;
import org.cruxframework.crux.core.client.Crux;
import org.cruxframework.crux.core.client.collection.FastMap;
import org.cruxframework.crux.core.client.utils.StringUtils;

public class RegisteredControllers_main_largeDisplayMouse implements org.cruxframework.crux.core.client.controller.RegisteredControllers {
  public RegisteredControllers_main_largeDisplayMouse(org.cruxframework.crux.core.client.screen.views.View view, org.cruxframework.crux.core.client.ioc.IocContainer_main_largeDisplayMouse iocContainer){
    this.view = view;
    this.iocContainer = iocContainer;
  }
  public <T> T getController(String controller){
    T ret = (T)controllers.get(controller);
    if (ret == null){
      if (org.cruxframework.crux.core.client.utils.StringUtils.unsafeEquals(controller, "mainController")){
        paytmgroup.client.MainController_ControllerProxy __cont  = new paytmgroup.client.MainController_ControllerProxy(this.view);
        __cont.screen = iocContainer.getpaytmgroup_client_MainController_MainView(org.cruxframework.crux.core.client.ioc.IoCResource.Scope.LOCAL, null);
        controllers.put("mainController", __cont);
      }
      if (ret == null){
        ret = (T)controllers.get(controller);
      }
    }
    return ret;
  }
  private FastMap<Object> controllers = new FastMap<Object>();
  private org.cruxframework.crux.core.client.screen.views.View view;
  private org.cruxframework.crux.core.client.ioc.IocContainer_main_largeDisplayMouse iocContainer;
}
