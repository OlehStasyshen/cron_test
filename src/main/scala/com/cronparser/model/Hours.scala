package com.cronparser.model

import com.cronparser.parser.PartParser

case class Hours(value: List[Int])

object Hours {

  val parser = new PartParser("Hours", 23, 0)

  def parse(value: String): Hours = Hours(parser.parse(value))

}


