
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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], categories: List[Category],catId: Long, filter: String, user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.121*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*14.17*/routes/*14.23*/.ProductCtrl.listProducts(0, filter)),format.raw/*14.59*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*15.8*/for(c <- categories) yield /*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
        """),format.raw/*16.9*/("""<a href=""""),_display_(/*16.19*/routes/*16.25*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*16.67*/("""" class="list-group-item">"""),_display_(/*16.94*/c/*16.95*/.getName),format.raw/*16.103*/("""
          """),format.raw/*17.11*/("""<span class="badge">"""),_display_(/*17.32*/c/*17.33*/.getProducts.size()),format.raw/*17.52*/("""</span>
        </a>
      """)))}),format.raw/*19.8*/("""
    """),format.raw/*20.5*/("""</div>
  </div>
  <div class="col-sm-10">
      """),_display_(/*23.8*/if(flash.containsKey("success"))/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
        """),format.raw/*24.9*/("""<div class="alert alert-success">
          """),_display_(/*25.12*/flash/*25.17*/.get("success")),format.raw/*25.32*/("""
        """),format.raw/*26.9*/("""</div>
      """)))}),format.raw/*27.8*/("""
      """),format.raw/*28.7*/("""<div id="actions">
        <from action="routes.ProductCtrl.listProducts(catId)"method="GET">
          <input type="search" id="searchbox" name="filter" value=""""),_display_(/*30.69*/filter),format.raw/*30.75*/("""" placeholder="Search product by name...">
          <input type="submit" id="searchsubmit" value="Search" class="btn-md btn-primary">
        </form>
      </div>
    <table class="table table-striped table-hover table-condensed">   
      <thead>
        <tr>
            
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*48.10*/for(p<-products) yield /*48.26*/ {_display_(Seq[Any](format.raw/*48.28*/("""
          """),format.raw/*49.11*/("""<tr>
              """),_display_(/*50.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*50.104*/ {_display_(Seq[Any](format.raw/*50.106*/("""
                """),format.raw/*51.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*51.72*/(p.getId + ".jpg")),format.raw/*51.90*/(""""/></td>
            """)))}/*52.15*/else/*52.20*/{_display_(Seq[Any](format.raw/*52.21*/("""
                """),format.raw/*53.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*54.14*/("""
            """),format.raw/*55.13*/("""<td class="numeric">"""),_display_(/*55.34*/p/*55.35*/.getId),format.raw/*55.41*/("""</td>
            <td><a href=""""),_display_(/*56.27*/routes/*56.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*56.69*/("""">
                """),_display_(/*57.18*/p/*57.19*/.getName),format.raw/*57.27*/("""</td>
               </a>     
            <td>"""),_display_(/*59.18*/p/*59.19*/.getDescription),format.raw/*59.34*/("""</td>
            <td  class="numeric">"""),_display_(/*60.35*/p/*60.36*/.getStock),format.raw/*60.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*61.37*/("%.2f".format(p.getPrice))),format.raw/*61.64*/("""</td>
            <td><a href=""""),_display_(/*62.27*/routes/*62.33*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*62.67*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
          </tr>
        """)))}),format.raw/*64.10*/("""
      """),format.raw/*65.7*/("""</tbody>

    </table>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],catId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,catId,filter,user,env)

  def f:((List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,catId,filter,user,env) => apply(products,categories,catId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 15:32:35 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/listProducts.scala.html
                  HASH: 5330840aa7ea665142bd76f4eac7551a1d86ab87
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->211|1368->215|1397->236|1436->238|1464->240|1608->357|1623->363|1680->399|1758->451|1794->471|1834->473|1870->482|1907->492|1922->498|1985->540|2039->567|2049->568|2079->576|2118->587|2166->608|2176->609|2216->628|2274->656|2306->661|2381->710|2422->742|2462->744|2498->753|2570->798|2584->803|2620->818|2656->827|2700->841|2734->848|2923->1010|2950->1016|3463->1502|3495->1518|3535->1520|3574->1531|3621->1551|3719->1639|3760->1641|3805->1658|3887->1713|3926->1731|3967->1754|3980->1759|4019->1760|4064->1777|4182->1864|4223->1877|4271->1898|4281->1899|4308->1905|4367->1937|4382->1943|4439->1979|4486->1999|4496->2000|4525->2008|4600->2056|4610->2057|4646->2072|4713->2112|4723->2113|4753->2122|4822->2164|4870->2191|4929->2223|4944->2229|4999->2263|5154->2387|5188->2394
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|48->16|49->17|49->17|49->17|49->17|51->19|52->20|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|59->27|60->28|62->30|62->30|80->48|80->48|80->48|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|86->54|87->55|87->55|87->55|87->55|88->56|88->56|88->56|89->57|89->57|89->57|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|94->62|94->62|94->62|96->64|97->65
                  -- GENERATED --
              */
          