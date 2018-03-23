
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/EduEvents/conf/routes
// @DATE:Fri Mar 23 20:44:43 GMT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:14
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def appSummary(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/summary")
    }
  
  }

  // @LINE:6
  class ReverseFrontendController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def assetOrDefault(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:8
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def testLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "testLogin")
    }
  
    // @LINE:8
    def login(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)))
    }
  
  }


}
