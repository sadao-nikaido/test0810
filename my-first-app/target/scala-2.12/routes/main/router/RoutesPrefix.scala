
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vuzer/my-first-app/conf/routes
// @DATE:Tue Aug 08 17:51:35 JST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
