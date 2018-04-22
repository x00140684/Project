
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
/*2.2*/import models.users.User

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String, user: models.users.User ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.43*/("""
"""),_display_(/*5.2*/main("Products",user)/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
    """),format.raw/*6.5*/("""<!DOCTYPE html>
    <html lang="en">
      <style>
      h2 """),format.raw/*9.10*/("""{"""),format.raw/*9.11*/("""
    """),format.raw/*10.5*/("""font-size: 25px;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
"""),format.raw/*12.1*/("""body """),format.raw/*12.6*/("""{"""),format.raw/*12.7*/("""
    """),format.raw/*13.5*/("""font: 20px Montserrat, sans-serif;
    color: #fff;
  """),format.raw/*15.3*/("""}"""),format.raw/*15.4*/("""
"""),format.raw/*16.1*/("""p """),format.raw/*16.3*/("""{"""),format.raw/*16.4*/("""font-size: 16px;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""
"""),format.raw/*18.1*/(""".margin """),format.raw/*18.9*/("""{"""),format.raw/*18.10*/("""margin-bottom: 45px;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/(""".bg-1 """),format.raw/*21.7*/("""{"""),format.raw/*21.8*/(""" 
  """),format.raw/*22.3*/("""background-color: #383737;
  color: #ffffff;
  text-indent: 65px;
  line-height: 2;
  word-spacing: 2px;
  text-align : center;
 
 
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""

"""),format.raw/*32.1*/(""".bg-3 """),format.raw/*32.7*/("""{"""),format.raw/*32.8*/(""" 
  """),format.raw/*33.3*/("""background-color: #383737; 
  color: #ffffff;

"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""

"""),format.raw/*38.1*/("""hr """),format.raw/*38.4*/("""{"""),format.raw/*38.5*/("""
"""),format.raw/*39.1*/("""width: 85%;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
"""),format.raw/*41.1*/(""".img2"""),format.raw/*41.6*/("""{"""),format.raw/*41.7*/("""
"""),format.raw/*42.1*/("""margin-top: 50px;
padding-bottom: 61px;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
"""),format.raw/*45.1*/("""</style>
    <head>
      
      <title>Software Development Play FrameWork TechCenter Project</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <link href=""""),_display_(/*56.20*/routes/*56.26*/.Assets.versioned("stylesheets/main.css")),format.raw/*56.67*/("""" rel="stylesheet" />
    </head>
    <body>
    <!-- First Container -->
    <div class="container-fluid bg-1 text-center">
    <h2>Welcome to TechCenter</h2>
    <p>TechCenter is a online IT shop. On our website, you can find latest realeases of many peripherals provided by top companies such as Nvidia, MSI, Intel and many more. Our website creates a relaible source of PC peripherals as-well as the ability to purchase such items. To find our more about our objective in the IT world, feel free to check-out our <a href="mailto:someone">
      About-Us</a> & <a href="mailto:someone">
      Contact-Us</a> page</p>
    <hr>
    </div>
    
    
    
    <!-- Third Container (Grid) -->
    <div class="container-fluid bg-3 text-center">    
      <h2>Our Products</h3><br>
      <div class="row">
        <div class="col-sm-4">
          
          <img src=""""),_display_(/*76.22*/routes/*76.28*/.Assets.versioned("images/processor.png")),format.raw/*76.69*/(""""width="50%">
          <p>Intel Core i7-2630QM - Processor - 2.9GHz</p>
        </div>
        <div class="col-sm-4"> 
          
          <img src=""""),_display_(/*81.22*/routes/*81.28*/.Assets.versioned("images/card.png")),format.raw/*81.64*/(""""width="60%">
           <p>Nvidia GTX 1080TI - Graphics Card - 8GB</p>
        </div>
        <div class="col-sm-4"> 
          
          <img src=""""),_display_(/*86.22*/routes/*86.28*/.Assets.versioned("images/ssd.png")),format.raw/*86.63*/(""""width="50%">
          <p>Samsung Evo - Solid State Disc - 500GB</p>
          
        </div>
        <hr>
      </div>
    </div>
    
    </body>
    </html>
  """)))}))
      }
    }
  }

  def render(title:String,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(title,user)

  def f:((String,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => apply(title,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 15:28:01 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/index.scala.html
                  HASH: 62e0dd852ac0d1c73063da30c05227a14f6c2836
                  MATRIX: 651->2|998->29|1134->70|1161->72|1190->93|1229->95|1260->100|1347->160|1375->161|1407->166|1451->183|1479->184|1507->185|1539->190|1567->191|1599->196|1680->250|1708->251|1736->252|1765->254|1793->255|1837->272|1865->273|1893->274|1928->282|1957->283|2005->304|2033->305|2062->307|2095->313|2123->314|2154->318|2313->450|2341->451|2370->453|2403->459|2431->460|2462->464|2536->511|2564->512|2593->514|2623->517|2651->518|2679->519|2718->531|2746->532|2774->533|2806->538|2834->539|2862->540|2929->580|2957->581|2985->582|3747->1317|3762->1323|3824->1364|4716->2229|4731->2235|4793->2276|4972->2428|4987->2434|5044->2470|5222->2621|5237->2627|5293->2662
                  LINES: 24->2|29->4|34->4|35->5|35->5|35->5|36->6|39->9|39->9|40->10|41->11|41->11|42->12|42->12|42->12|43->13|45->15|45->15|46->16|46->16|46->16|47->17|47->17|48->18|48->18|48->18|49->19|49->19|51->21|51->21|51->21|52->22|60->30|60->30|62->32|62->32|62->32|63->33|66->36|66->36|68->38|68->38|68->38|69->39|70->40|70->40|71->41|71->41|71->41|72->42|74->44|74->44|75->45|86->56|86->56|86->56|106->76|106->76|106->76|111->81|111->81|111->81|116->86|116->86|116->86
                  -- GENERATED --
              */
          