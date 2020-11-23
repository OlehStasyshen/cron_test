package com.cronparser.model

import com.cronparser.parser.PartParser

case class DaysOfWeek(value: List[Int])

object DaysOfWeek {

  val parser = new PartParser("Day of Week", 6, 0)

  def parse(value: String): DaysOfWeek = DaysOfWeek(parser.parse(value))

}


