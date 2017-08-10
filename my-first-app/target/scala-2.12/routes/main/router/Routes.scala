
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vuzer/my-first-app/conf/routes
// @DATE:Tue Aug 08 17:51:35 JST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  Assets_2: controllers.Assets,
  // @LINE:13
  MyJsonSample_0: controllers.MyJsonSample,
  // @LINE:18
  Application_1: controllers.Application,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    Assets_2: controllers.Assets,
    // @LINE:13
    MyJsonSample_0: controllers.MyJsonSample,
    // @LINE:18
    Application_1: controllers.Application
  ) = this(errorHandler, Assets_2, MyJsonSample_0, Application_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_2, MyJsonSample_0, Application_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test/jsonresp""", """controllers.MyJsonSample.sayHello()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test/jsonreq""", """controllers.MyJsonSample.sayHello2()"""),
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ajax""", """controllers.Application.ajax()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_MyJsonSample_sayHello1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test/jsonresp")))
  )
  private[this] lazy val controllers_MyJsonSample_sayHello1_invoker = createInvoker(
    MyJsonSample_0.sayHello(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyJsonSample",
      "sayHello",
      Nil,
      "GET",
      this.prefix + """test/jsonresp""",
      """ JSON Server
 return method""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MyJsonSample_sayHello22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test/jsonreq")))
  )
  private[this] lazy val controllers_MyJsonSample_sayHello22_invoker = createInvoker(
    MyJsonSample_0.sayHello2(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyJsonSample",
      "sayHello2",
      Nil,
      "POST",
      this.prefix + """test/jsonreq""",
      """ receive method""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index3_invoker = createInvoker(
    Application_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Ajax""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_ajax4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ajax")))
  )
  private[this] lazy val controllers_Application_ajax4_invoker = createInvoker(
    Application_1.ajax(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ajax",
      Nil,
      "POST",
      this.prefix + """ajax""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:13
    case controllers_MyJsonSample_sayHello1_route(params) =>
      call { 
        controllers_MyJsonSample_sayHello1_invoker.call(MyJsonSample_0.sayHello())
      }
  
    // @LINE:15
    case controllers_MyJsonSample_sayHello22_route(params) =>
      call { 
        controllers_MyJsonSample_sayHello22_invoker.call(MyJsonSample_0.sayHello2())
      }
  
    // @LINE:18
    case controllers_Application_index3_route(params) =>
      call { 
        controllers_Application_index3_invoker.call(Application_1.index)
      }
  
    // @LINE:19
    case controllers_Application_ajax4_route(params) =>
      call { 
        controllers_Application_ajax4_invoker.call(Application_1.ajax())
      }
  }
}
