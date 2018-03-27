
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/EduEvents/conf/routes
// @DATE:Tue Mar 27 02:12:44 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseFrontendController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
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

  
    // @LINE:8
    def login(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)))
    }
  
    // @LINE:12
    def createEvent(name:String, address:String, description:String, price:Double, maxTickets:Integer, tags:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createEvent/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("address", address)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("description", description)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("price", price)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("maxTickets", maxTickets)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tags", tags)))
    }
  
    // @LINE:10
    def signUp(username:String, password:String, email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:14
    def search(term:String, tags:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "searchEvents/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("term", term)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tags", tags)))
    }
  
    // @LINE:16
    def getModel(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getModel")
    }
  
  }


}
