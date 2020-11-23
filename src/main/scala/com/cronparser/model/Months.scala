package com.cronparser.model

import com.cronparser.parser.PartParser

case class Months(value: List[Int])

object Months {

  val parser = new PartParser("Month", 12)

  def parse(value: String): Months = Months(parser.parse(value))

}


