
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/EduEvents/conf/routes
// @DATE:Tue Mar 27 02:12:44 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  FrontendController_1: controllers.FrontendController,
  // @LINE:8
  UserController_0: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    FrontendController_1: controllers.FrontendController,
    // @LINE:8
    UserController_0: controllers.UserController
  ) = this(errorHandler, FrontendController_1, UserController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FrontendController_1, UserController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.FrontendController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/""" + "$" + """username<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.UserController.login(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/""" + "$" + """username<[^/]+>/""" + "$" + """password<[^/]+>/""" + "$" + """email<[^/]+>""", """controllers.UserController.signUp(username:String, password:String, email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createEvent/""" + "$" + """name<[^/]+>/""" + "$" + """address<[^/]+>/""" + "$" + """description<[^/]+>/""" + "$" + """price<[^/]+>/""" + "$" + """maxTickets<[^/]+>/""" + "$" + """tags<[^/]+>""", """controllers.UserController.createEvent(name:String, address:String, description:String, price:Double, maxTickets:Integer, tags:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchEvents/""" + "$" + """term<[^/]+>/""" + "$" + """tags<[^/]+>""", """controllers.UserController.search(term:String, tags:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getModel""", """controllers.UserController.getModel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.FrontendController.assetOrDefault(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_FrontendController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_FrontendController_index0_invoker = createInvoker(
    FrontendController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontendController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Serve index page from public directory""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_login1_invoker = createInvoker(
    UserController_0.login(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """login/""" + "$" + """username<[^/]+>/""" + "$" + """password<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UserController_signUp2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true), StaticPart("/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_signUp2_invoker = createInvoker(
    UserController_0.signUp(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "signUp",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """signup/""" + "$" + """username<[^/]+>/""" + "$" + """password<[^/]+>/""" + "$" + """email<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_createEvent3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createEvent/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("address", """[^/]+""",true), StaticPart("/"), DynamicPart("description", """[^/]+""",true), StaticPart("/"), DynamicPart("price", """[^/]+""",true), StaticPart("/"), DynamicPart("maxTickets", """[^/]+""",true), StaticPart("/"), DynamicPart("tags", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_createEvent3_invoker = createInvoker(
    UserController_0.createEvent(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Double], fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "createEvent",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Double], classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """createEvent/""" + "$" + """name<[^/]+>/""" + "$" + """address<[^/]+>/""" + "$" + """description<[^/]+>/""" + "$" + """price<[^/]+>/""" + "$" + """maxTickets<[^/]+>/""" + "$" + """tags<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_search4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchEvents/"), DynamicPart("term", """[^/]+""",true), StaticPart("/"), DynamicPart("tags", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_search4_invoker = createInvoker(
    UserController_0.search(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "search",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """searchEvents/""" + "$" + """term<[^/]+>/""" + "$" + """tags<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_getModel5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getModel")))
  )
  private[this] lazy val controllers_UserController_getModel5_invoker = createInvoker(
    UserController_0.getModel(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getModel",
      Nil,
      "GET",
      this.prefix + """getModel""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_FrontendController_assetOrDefault6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_FrontendController_assetOrDefault6_invoker = createInvoker(
    FrontendController_1.assetOrDefault(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontendController",
      "assetOrDefault",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """file<.+>""",
      """ Serve static assets under public directory""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_FrontendController_index0_route(params@_) =>
      call { 
        controllers_FrontendController_index0_invoker.call(FrontendController_1.index())
      }
  
    // @LINE:8
    case controllers_UserController_login1_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("password", None)) { (username, password) =>
        controllers_UserController_login1_invoker.call(UserController_0.login(username, password))
      }
  
    // @LINE:10
    case controllers_UserController_signUp2_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("password", None), params.fromPath[String]("email", None)) { (username, password, email) =>
        controllers_UserController_signUp2_invoker.call(UserController_0.signUp(username, password, email))
      }
  
    // @LINE:12
    case controllers_UserController_createEvent3_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromPath[String]("address", None), params.fromPath[String]("description", None), params.fromPath[Double]("price", None), params.fromPath[Integer]("maxTickets", None), params.fromPath[String]("tags", None)) { (name, address, description, price, maxTickets, tags) =>
        controllers_UserController_createEvent3_invoker.call(UserController_0.createEvent(name, address, description, price, maxTickets, tags))
      }
  
    // @LINE:14
    case controllers_UserController_search4_route(params@_) =>
      call(params.fromPath[String]("term", None), params.fromPath[String]("tags", None)) { (term, tags) =>
        controllers_UserController_search4_invoker.call(UserController_0.search(term, tags))
      }
  
    // @LINE:16
    case controllers_UserController_getModel5_route(params@_) =>
      call { 
        controllers_UserController_getModel5_invoker.call(UserController_0.getModel())
      }
  
    // @LINE:19
    case controllers_FrontendController_assetOrDefault6_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_FrontendController_assetOrDefault6_invoker.call(FrontendController_1.assetOrDefault(file))
      }
  }
}
