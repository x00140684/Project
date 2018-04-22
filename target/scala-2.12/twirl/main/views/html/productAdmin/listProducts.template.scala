
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
/*2.2*/import models.products.Category
/*3.2*/import models.products.Product
/*4.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],List[Category],User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(products: List[Product], categories: List[Category], user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.93*/("""

"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""
"""),format.raw/*8.1*/("""<style>

  
</style>
<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-3">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*18.17*/routes/*18.23*/.AdminProductCtrl.listProducts(0)),format.raw/*18.56*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*19.8*/for(c <- categories) yield /*19.28*/ {_display_(Seq[Any](format.raw/*19.30*/("""
        """),format.raw/*20.9*/("""<a href=""""),_display_(/*20.19*/routes/*20.25*/.AdminProductCtrl.listProducts(c.getId)),format.raw/*20.64*/("""" class="list-group-item">"""),_display_(/*20.91*/c/*20.92*/.getName),format.raw/*20.100*/("""
          """),format.raw/*21.11*/("""<span class="badge">"""),_display_(/*21.32*/c/*21.33*/.getProducts.size()),format.raw/*21.52*/("""</span>
        </a>
      """)))}),format.raw/*23.8*/("""
    """),format.raw/*24.5*/("""</div>
  </div>
  <div class="col-sm-9">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*28.8*/if(flash.containsKey("success"))/*28.40*/ {_display_(Seq[Any](format.raw/*28.42*/("""
        """),format.raw/*29.9*/("""<div class="alert alert-success">
          """),_display_(/*30.12*/flash/*30.17*/.get("success")),format.raw/*30.32*/("""
        """),format.raw/*31.9*/("""</div>
      """)))}),format.raw/*32.8*/("""
      """),format.raw/*33.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*46.10*/for(p<-products) yield /*46.26*/ {_display_(Seq[Any](format.raw/*46.28*/("""
          """),format.raw/*47.11*/("""<tr>
              """),_display_(/*48.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*48.104*/ {_display_(Seq[Any](format.raw/*48.106*/("""
                """),format.raw/*49.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*49.72*/(p.getId + ".jpg")),format.raw/*49.90*/(""""/></td>
            """)))}/*50.15*/else/*50.20*/{_display_(Seq[Any](format.raw/*50.21*/("""
                """),format.raw/*51.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*52.14*/("""
            """),format.raw/*53.13*/("""<td class="numeric">"""),_display_(/*53.34*/p/*53.35*/.getId),format.raw/*53.41*/("""</td>
            <td><a href=""""),_display_(/*54.27*/routes/*54.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*54.69*/("""">
             """),_display_(/*55.15*/p/*55.16*/.getName),format.raw/*55.24*/("""</td>
            </a>
     
            <td>"""),_display_(/*58.18*/p/*58.19*/.getDescription),format.raw/*58.34*/("""</td>
            <td  class="numeric">"""),_display_(/*59.35*/p/*59.36*/.getStock),format.raw/*59.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*60.37*/("%.2f".format(p.getPrice))),format.raw/*60.64*/("""</td>
            <td>
              <a href=""""),_display_(/*62.25*/routes/*62.31*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*62.71*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*66.25*/routes/*66.31*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*66.71*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*71.10*/("""
      """),format.raw/*72.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*77.17*/routes/*77.23*/.AdminProductCtrl.addProduct()),format.raw/*77.53*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[Product],List[Category],User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 14:47:10 IST 2018
                  SOURCE: /home/wdd/webapps/pleaseHelp-master/app/views/productAdmin/listProducts.scala.html
                  HASH: 1cb90e807760540f1b089164de0facbe094c5203
                  MATRIX: 664->2|703->35|741->67|1125->93|1311->184|1339->187|1368->208|1407->210|1434->211|1637->387|1652->393|1706->426|1784->478|1820->498|1860->500|1896->509|1933->519|1948->525|2008->564|2062->591|2072->592|2102->600|2141->611|2189->632|2199->633|2239->652|2297->680|2329->685|2472->802|2513->834|2553->836|2589->845|2661->890|2675->895|2711->910|2747->919|2791->933|2825->940|3116->1204|3148->1220|3188->1222|3227->1233|3274->1253|3372->1341|3413->1343|3458->1360|3540->1415|3579->1433|3620->1456|3633->1461|3672->1462|3717->1479|3835->1566|3876->1579|3924->1600|3934->1601|3961->1607|4020->1639|4035->1645|4092->1681|4136->1698|4146->1699|4175->1707|4248->1753|4258->1754|4294->1769|4361->1809|4371->1810|4401->1819|4470->1861|4518->1888|4592->1935|4607->1941|4668->1981|4865->2151|4880->2157|4941->2197|5161->2386|5195->2393|5270->2441|5285->2447|5336->2477
                  LINES: 24->2|25->3|26->4|31->5|36->5|38->7|38->7|38->7|39->8|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|93->62|93->62|93->62|97->66|97->66|97->66|102->71|103->72|108->77|108->77|108->77
                  -- GENERATED --
              */
          