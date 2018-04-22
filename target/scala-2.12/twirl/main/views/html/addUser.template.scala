
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
/*1.2*/import models.users.Customer
/*2.2*/import models.users.User

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(userForm: Form[User], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.36*/("""
"""),_display_(/*5.2*/main("Join as a Customer",user)/*5.33*/ {_display_(Seq[Any](format.raw/*5.35*/("""
    """),format.raw/*6.5*/("""<p class="lead">Register</p>
    """),_display_(/*7.6*/if(flash.containsKey("error"))/*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/(""" 
        """),_display_(/*8.10*/flash/*8.15*/.get("error")),format.raw/*8.28*/(""" 
        """)))}),format.raw/*9.10*/("""
    

    """),_display_(/*12.6*/if(flash.containsKey("success"))/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/(""" 
        """),_display_(/*13.10*/flash/*13.15*/.get("success")),format.raw/*13.30*/(""" 
        """)))}),format.raw/*14.10*/("""
    

    """),_display_(/*17.6*/form(action=routes.AccountCtrl.addUserSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*17.133*/ {_display_(Seq[Any](format.raw/*17.135*/("""
        """),format.raw/*18.37*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""
        """),_display_(/*20.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*20.84*/("""
        
        
        """),_display_(/*23.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*23.82*/("""
        """),_display_(/*24.10*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*24.90*/("""
        """),_display_(/*25.10*/inputText(userForm("role"), '_label -> "Role", 'class -> "form-control")),format.raw/*25.82*/("""
        
        """),format.raw/*27.9*/("""<br><br>
        <label>Register </label>
        <div class="actions">
            <input type="submit" value="Add User" class="btn btn-primary">
            <a href=""""),_display_(/*31.23*/routes/*31.29*/.ProductCtrl.listProducts(0)),format.raw/*31.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    
""")))}),format.raw/*36.2*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[User],User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 14:47:10 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/addUser.scala.html
                  HASH: b0b0df5f998797fbe953f94cc0ca42fdc92d23b4
                  MATRIX: 651->1|687->31|1027->57|1134->93|1179->91|1206->110|1245->141|1284->143|1315->148|1374->182|1412->212|1451->214|1488->225|1501->230|1534->243|1575->254|1613->266|1654->298|1694->300|1732->311|1746->316|1782->331|1824->342|1862->354|1999->481|2040->483|2077->520|2114->530|2127->534|2158->544|2195->554|2290->628|2345->656|2438->728|2475->738|2576->818|2613->828|2706->900|2751->918|2947->1087|2962->1093|3011->1121|3160->1240
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|44->12|44->12|44->12|45->13|45->13|45->13|46->14|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|55->23|55->23|56->24|56->24|57->25|57->25|59->27|63->31|63->31|63->31|68->36
                  -- GENERATED --
              */
          