
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msg: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Sample Page")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned("javascripts/jquery.3.2.1.min.js")),format.raw/*4.74*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.versioned("javascripts/index.js")),format.raw/*5.63*/("""" type="text/javascript"></script>
	<h1>Hello!</h1>
	<p id="message">"""),_display_(/*7.19*/msg),format.raw/*7.22*/("""</p>
	<p><input type="text" id="input"><button id="sendbtn">submit</button></p>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(msg:String): play.twirl.api.HtmlFormat.Appendable = apply(msg)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (msg) => apply(msg)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Aug 09 23:50:32 JST 2017
                  SOURCE: /home/vuzer/my-first-app/app/views/index.scala.html
                  HASH: 0dd2af4d4842c64ad79f9cac4453df4bb038f7df
                  MATRIX: 948->1|1056->14|1084->17|1111->36|1150->38|1178->40|1218->54|1232->60|1304->112|1380->162|1394->168|1455->209|1551->279|1574->282|1684->363
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|39->7|39->7|41->9
                  -- GENERATED --
              */
          