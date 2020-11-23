package com.cronparser.model

import com.cronparser.parser.PartParser

case class DaysOfMonth(value: List[Int])

object DaysOfMonth {

  val parser = new PartParser("Day Of Month", 31)

  def parse(value: String): DaysOfMonth = DaysOfMonth(parser.parse(value))

}



