package rises

import scala.xml
import scalaj.http

object Rises {
  val targets = List("http://degoes.net/feed.xml")

  def main(args: Array[String]) {
    val response: scalaj.http.HttpResponse[String] = scalaj.http.Http(targets.head).asString
    val xml = scala.xml.XML.loadString(response.body)
    println(xml \ "entry")
  }
}
