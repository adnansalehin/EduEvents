
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/EduEvents/conf/routes
// @DATE:Mon Mar 26 02:44:48 BST 2018


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
