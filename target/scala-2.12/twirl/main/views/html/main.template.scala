
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
   <head>
     
     <title>Project</title>
     <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
     <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
     <link href=""""),_display_(/*13.19*/routes/*13.25*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.66*/("""" rel="stylesheet" />
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
         <a class="navbar-brand" href=""""),_display_(/*30.41*/routes/*30.47*/.ProductCtrl.index()),format.raw/*30.67*/("""">TechCenter</a>
       </div>
       <div class="collapse navbar-collapse" id="myNavbar">
         <ul class="nav navbar-nav navbar-right">
           <li><a href=""""),_display_(/*34.26*/routes/*34.32*/.ProductCtrl.listProducts()),format.raw/*34.59*/("""">STORE</a></li>
           

        <li>
            <a href=""""),_display_(/*38.23*/routes/*38.29*/.ShoppingCtrl.showBasket),format.raw/*38.53*/("""">BASKET</a>
        </li>
        <li>
          <a href=""""),_display_(/*41.21*/routes/*41.27*/.ShoppingCtrl.viewOrders),format.raw/*41.51*/("""">ORDERS</a>
      </li>
      <li """),_display_(/*43.12*/if(title=="Login")/*43.30*/{_display_(Seq[Any](format.raw/*43.31*/("""class="active"""")))}),format.raw/*43.46*/(""">
          """),_display_(/*44.12*/if(user != null)/*44.28*/ {_display_(Seq[Any](format.raw/*44.30*/("""
              """),format.raw/*45.15*/("""<a href=""""),_display_(/*45.25*/controllers/*45.36*/.security.routes.LoginCtrl.logout()),format.raw/*45.71*/("""">LOGOUT</a>
          """)))}/*46.13*/else/*46.18*/{_display_(Seq[Any](format.raw/*46.19*/("""
              """),format.raw/*47.15*/("""<a href=""""),_display_(/*47.25*/controllers/*47.36*/.security.routes.LoginCtrl.login()),format.raw/*47.70*/("""">LOGIN</a>
              <li><a href=""""),_display_(/*48.29*/routes/*48.35*/.AccountCtrl.addUser()),format.raw/*48.57*/("""">REGISTER</a></li>
          """)))}),format.raw/*49.12*/("""

      """),format.raw/*51.7*/("""</li>
         </ul>
       </div>
     </div>
   </nav>
   <div class="content">
  
   """),_display_(/*58.5*/content),format.raw/*58.12*/("""
   """),format.raw/*59.4*/("""</div>
   <!-- Footer -->
  
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
       <script src=""""),_display_(/*77.22*/routes/*77.28*/.Assets.versioned("javascripts/main.js")),format.raw/*77.68*/(""""></script>
   </body>
   </html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 15:23:10 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/main.scala.html
                  HASH: 39ba4e7a7faecce576beb8046e487cafa78d749c
                  MATRIX: 970->1|1121->57|1150->60|1567->450|1582->456|1644->497|2462->1288|2477->1294|2518->1314|2711->1480|2726->1486|2774->1513|2866->1578|2881->1584|2926->1608|3013->1668|3028->1674|3073->1698|3136->1734|3163->1752|3202->1753|3248->1768|3288->1781|3313->1797|3353->1799|3396->1814|3433->1824|3453->1835|3509->1870|3552->1895|3565->1900|3604->1901|3647->1916|3684->1926|3704->1937|3759->1971|3826->2011|3841->2017|3884->2039|3946->2070|3981->2078|4096->2167|4124->2174|4155->2178|4960->2956|4975->2962|5036->3002
                  LINES: 28->1|33->1|36->4|45->13|45->13|45->13|62->30|62->30|62->30|66->34|66->34|66->34|70->38|70->38|70->38|73->41|73->41|73->41|75->43|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|79->47|80->48|80->48|80->48|81->49|83->51|90->58|90->58|91->59|109->77|109->77|109->77
                  -- GENERATED --
              */
          