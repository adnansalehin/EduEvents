
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/adnan/git/Project/conf/routes
// @DATE:Tue Mar 13 15:44:12 GMT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFrontendController FrontendController = new controllers.ReverseFrontendController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFrontendController FrontendController = new controllers.javascript.ReverseFrontendController(RoutesPrefix.byNamePrefix());
  }

}
