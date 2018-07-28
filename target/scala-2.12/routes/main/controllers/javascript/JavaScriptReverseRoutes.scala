
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/EduEvents/conf/routes
// @DATE:Tue Mar 27 02:12:44 BST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseFrontendController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def assetOrDefault: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrontendController.assetOrDefault",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrontendController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.login",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1))})
        }
      """
    )
  
    // @LINE:12
    def createEvent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.createEvent",
      """
        function(name0,address1,description2,price3,maxTickets4,tags5) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createEvent/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("address", address1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("description", description2)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("price", price3)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("maxTickets", maxTickets4)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tags", tags5))})
        }
      """
    )
  
    // @LINE:10
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.signUp",
      """
        function(username0,password1,email2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email2))})
        }
      """
    )
  
    // @LINE:14
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.search",
      """
        function(term0,tags1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchEvents/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("term", term0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tags", tags1))})
        }
      """
    )
  
    // @LINE:16
    def getModel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getModel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getModel"})
        }
      """
    )
  
  }


}
