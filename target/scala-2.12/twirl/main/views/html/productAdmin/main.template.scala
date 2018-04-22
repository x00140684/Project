
package views.html.productAdmin

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, user: User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.45*/("""


"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
   <head>
     
     <title>Project</title>
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
     <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
     <link href=""""),_display_(/*14.19*/routes/*14.25*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.66*/("""" rel="stylesheet" />
       <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

   </head>
   <body>
   
   <!-- Navbar -->
   <nav class="navbar navbar-default">
     <div class="container">
       <div class="navbar-header">
         <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>                        
         </button>
         <a class="navbar-brand" href=""""),_display_(/*31.41*/routes/*31.47*/.AdminProductCtrl.index()),format.raw/*31.72*/("""">TechCenter</a>
       </div>
       <div class="collapse navbar-collapse" id="myNavbar">
         <ul class="nav navbar-nav navbar-right">
           <li><a href=""""),_display_(/*35.26*/routes/*35.32*/.AdminProductCtrl.listProducts(0)),format.raw/*35.65*/("""">STORE</a></li>
           <li """),_display_(/*36.17*/if(title=="Login")/*36.35*/{_display_(Seq[Any](format.raw/*36.36*/("""class="active"""")))}),format.raw/*36.51*/(""">
              """),_display_(/*37.16*/if(user != null)/*37.32*/ {_display_(Seq[Any](format.raw/*37.34*/("""
                  """),format.raw/*38.19*/("""<a href=""""),_display_(/*38.29*/controllers/*38.40*/.security.routes.LoginCtrl.logout()),format.raw/*38.75*/("""">LOGOUT</a>
              """)))}/*39.17*/else/*39.22*/{_display_(Seq[Any](format.raw/*39.23*/("""
                  """),format.raw/*40.19*/("""<a href=""""),_display_(/*40.29*/controllers/*40.40*/.security.routes.LoginCtrl.login()),format.raw/*40.74*/("""">LOGIN</a>
              """)))}),format.raw/*41.16*/("""
  
          """),format.raw/*43.11*/("""</li>
           <li><a href="#">REGISTER</a></li>
         </ul>
       </div>
     </div>
   </nav>
   
   """),_display_(/*50.5*/content),format.raw/*50.12*/("""
   
   """),format.raw/*52.4*/("""<!-- Footer -->
   <div class="content">
   </div>
       <footer id="myFooter">
           <div class="container">
              
           </div>
           <div class="social-networks">
               <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
               <a href="#" class="facebook"><i class="fa fa-facebook-official"></i></a>
               <a href="#" class="google"><i class="fa fa-google-plus"></i></a>
           </div>
           <div class="footer-copyright">
               <p>© 2018 Copyright - Tech Center </p>
           </div>
       </footer>
       <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
       <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   </body>
   </html>"""))
      }
    }
  }

  def render(title:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 14:47:10 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/productAdmin/main.scala.html
                  HASH: cdf4a6617cfd1d01b078a5003b1631a0eed44824
                  MATRIX: 664->1|1002->27|1140->70|1169->73|1586->463|1601->469|1663->510|2481->1301|2496->1307|2542->1332|2735->1498|2750->1504|2804->1537|2864->1570|2891->1588|2930->1589|2976->1604|3020->1621|3045->1637|3085->1639|3132->1658|3169->1668|3189->1679|3245->1714|3292->1743|3305->1748|3344->1749|3391->1768|3428->1778|3448->1789|3503->1823|3561->1850|3603->1864|3739->1974|3767->1981|3802->1989
                  LINES: 24->1|29->2|34->2|37->5|46->14|46->14|46->14|63->31|63->31|63->31|67->35|67->35|67->35|68->36|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|73->41|75->43|82->50|82->50|84->52
                  -- GENERATED --
              */
          