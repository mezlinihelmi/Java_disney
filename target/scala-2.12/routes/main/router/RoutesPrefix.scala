// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/MBOUZIDI/Desktop/Java/conf/routes
// @DATE:Wed Nov 06 15:25:15 CET 2019


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
