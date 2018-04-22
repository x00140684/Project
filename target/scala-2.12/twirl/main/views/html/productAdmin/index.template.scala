
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
      
      <title>Bootstrap Theme Simply Me</title>
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
                  DATE: Sun Apr 22 14:47:10 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/productAdmin/index.scala.html
                  HASH: 6743e29755bc0d0a56d29f88067afe227a6b76d3
                  MATRIX: 664->2|1011->29|1147->70|1174->72|1203->93|1242->95|1273->100|1360->160|1388->161|1420->166|1464->183|1492->184|1520->185|1552->190|1580->191|1612->196|1693->250|1721->251|1749->252|1778->254|1806->255|1850->272|1878->273|1906->274|1941->282|1970->283|2018->304|2046->305|2075->307|2108->313|2136->314|2167->318|2326->450|2354->451|2383->453|2416->459|2444->460|2475->464|2549->511|2577->512|2606->514|2636->517|2664->518|2692->519|2731->531|2759->532|2787->533|2819->538|2847->539|2875->540|2942->580|2970->581|2998->582|3731->1288|3746->1294|3808->1335|4700->2200|4715->2206|4777->2247|4956->2399|4971->2405|5028->2441|5206->2592|5221->2598|5277->2633
                  LINES: 24->2|29->4|34->4|35->5|35->5|35->5|36->6|39->9|39->9|40->10|41->11|41->11|42->12|42->12|42->12|43->13|45->15|45->15|46->16|46->16|46->16|47->17|47->17|48->18|48->18|48->18|49->19|49->19|51->21|51->21|51->21|52->22|60->30|60->30|62->32|62->32|62->32|63->33|66->36|66->36|68->38|68->38|68->38|69->39|70->40|70->40|71->41|71->41|71->41|72->42|74->44|74->44|75->45|86->56|86->56|86->56|106->76|106->76|106->76|111->81|111->81|111->81|116->86|116->86|116->86
                  -- GENERATED --
              */
          