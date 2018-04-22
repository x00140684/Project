
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
/*1.2*/import models.users.User
/*2.2*/import models.users.Login

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(loginForm: Form[Login], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.38*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Login", user)/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""

 """),format.raw/*8.2*/("""<div class="row">
    <div class="col-sm-5">
        <h3>Sign in</h3>
        """),_display_(/*11.10*/if(loginForm.hasGlobalErrors)/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
            """),format.raw/*12.13*/("""<p class="alert alert-warning">
                """),_display_(/*13.18*/loginForm/*13.27*/.globalError.message),format.raw/*13.47*/(""";
            </p>
        """)))}),format.raw/*15.10*/("""
        """),_display_(/*16.10*/if(flash.containsKey("error"))/*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
            """),format.raw/*17.13*/("""<p class="alert alert-warning">
                """),_display_(/*18.18*/flash/*18.23*/.get("loginRequired")),format.raw/*18.44*/("""
            """),format.raw/*19.13*/("""</p>
        """)))}),format.raw/*20.10*/("""


        """),_display_(/*23.10*/helper/*23.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*23.74*/ {_display_(Seq[Any](format.raw/*23.76*/("""
            """),_display_(/*24.14*/CSRF/*24.18*/.formField),format.raw/*24.28*/("""

            """),format.raw/*26.13*/("""<div class="form-group">
                """),_display_(/*27.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*28.76*/("""
            """),format.raw/*29.13*/("""</div>
            <div class="form-group">
                """),_display_(/*31.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.79*/("""
            """),format.raw/*33.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*37.10*/("""
    """),format.raw/*38.5*/("""</div>
</div>
    
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[Login],User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 15:08:26 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/login.scala.html
                  HASH: a8573b195e5d4b7b42bd0c05747a0d5fc92c1ac9
                  MATRIX: 651->1|683->27|1023->54|1132->92|1177->90|1204->108|1231->110|1258->129|1297->131|1326->134|1432->213|1470->242|1510->244|1551->257|1627->306|1645->315|1686->335|1745->363|1782->373|1821->403|1861->405|1902->418|1978->467|1992->472|2034->493|2075->506|2120->520|2159->532|2174->538|2241->596|2281->598|2322->612|2335->616|2366->626|2408->640|2477->682|2619->803|2660->816|2748->877|2900->1008|2941->1021|3122->1171|3154->1176
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|40->8|43->11|43->11|43->11|44->12|45->13|45->13|45->13|47->15|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|55->23|55->23|55->23|55->23|56->24|56->24|56->24|58->26|59->27|60->28|61->29|63->31|64->32|65->33|69->37|70->38
                  -- GENERATED --
              */
          