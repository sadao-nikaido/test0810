
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vuzer/my-first-app/conf/routes
// @DATE:Tue Aug 08 17:51:35 JST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:13
  class ReverseMyJsonSample(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def sayHello(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test/jsonresp")
    }
  
    // @LINE:15
    def sayHello2(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "test/jsonreq")
    }
  
  }

  // @LINE:18
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def ajax(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "ajax")
    }
  
    // @LINE:18
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
