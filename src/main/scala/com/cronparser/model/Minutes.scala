package com.cronparser.model

import com.cronparser.parser.PartParser

case class Minutes(value: List[Int])

object Minutes {

  val parser = new PartParser("Minutes", 59, 0)

  def parse(value: String): Minutes = Minutes(parser.parse(value))

}
