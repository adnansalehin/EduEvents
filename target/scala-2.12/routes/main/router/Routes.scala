
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/EduEvents/conf/routes
// @DATE:Fri Mar 23 20:44:43 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  FrontendController_2: controllers.FrontendController,
  // @LINE:8
  UserController_1: controllers.UserController,
  // @LINE:14
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    FrontendController_2: controllers.FrontendController,
    // @LINE:8
    UserController_1: controllers.UserController,
    // @LINE:14
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, FrontendController_2, UserController_1, HomeController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FrontendController_2, UserController_1, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.FrontendController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/""" + "$" + """username<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.UserController.login(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testLogin""", """controllers.UserController.testLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/summary""", """controllers.HomeController.appSummary"""),
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
    FrontendController_2.index(),
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
    UserController_1.login(fakeValue[String], fakeValue[String]),
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

  // @LINE:11
  private[this] lazy val controllers_UserController_testLogin2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testLogin")))
  )
  private[this] lazy val controllers_UserController_testLogin2_invoker = createInvoker(
    UserController_1.testLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "testLogin",
      Nil,
      "GET",
      this.prefix + """testLogin""",
      """Test url can be removed""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_appSummary3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/summary")))
  )
  private[this] lazy val controllers_HomeController_appSummary3_invoker = createInvoker(
    HomeController_0.appSummary,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "appSummary",
      Nil,
      "GET",
      this.prefix + """api/summary""",
      """ An example route (Prefix all API routes with apiPrefix defined in application.conf)""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_FrontendController_assetOrDefault4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_FrontendController_assetOrDefault4_invoker = createInvoker(
    FrontendController_2.assetOrDefault(fakeValue[String]),
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
        controllers_FrontendController_index0_invoker.call(FrontendController_2.index())
      }
  
    // @LINE:8
    case controllers_UserController_login1_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("password", None)) { (username, password) =>
        controllers_UserController_login1_invoker.call(UserController_1.login(username, password))
      }
  
    // @LINE:11
    case controllers_UserController_testLogin2_route(params@_) =>
      call { 
        controllers_UserController_testLogin2_invoker.call(UserController_1.testLogin)
      }
  
    // @LINE:14
    case controllers_HomeController_appSummary3_route(params@_) =>
      call { 
        controllers_HomeController_appSummary3_invoker.call(HomeController_0.appSummary)
      }
  
    // @LINE:17
    case controllers_FrontendController_assetOrDefault4_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_FrontendController_assetOrDefault4_invoker.call(FrontendController_2.assetOrDefault(file))
      }
  }
}
