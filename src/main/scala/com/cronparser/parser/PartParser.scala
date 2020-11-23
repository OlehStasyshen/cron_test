package com.cronparser.parser

class PartParser(Name: String, maximumValue: Int, minimumValue: Int = 1) {

  def parse(value: String): List[Int] = {
    value.split(",").toList.flatMap(itm => parseInterval(itm)).sorted
  }

  private def parseInterval(v: String) = {
    val (rangeSection, interval) = if (v.contains("/")) {
      val rangeValue = v.split("/")

      val interval = if (rangeValue.size > 2) {
        throw new Exception(s"The wrong format of $Name")
      } else {
        rangeValue(1).toInt
      }

      (rangeValue(0), interval)
    } else {
      (v, 1)
    }
    val (from, to) = parsRange(rangeSection)
    validateLimit(interval)
    from.to(to, interval)
  }

  private def parsRange(v: String) = {
    v match {
      case "*" => minimumValue -> maximumValue
      case itm if itm.forall(_.isDigit) =>
        val bound = itm.toInt
        validateLimit(bound)
        bound -> bound
      case itm if itm.contains("-") =>
        val range = itm.split("-")
        val lowBound = range(0).toInt
        val hiBound = range(1).toInt
        validateLimit(lowBound)
        validateLimit(hiBound)
        lowBound -> hiBound
      case _ => throw new Exception("Is wrong format of Minutes part")
    }
  }

  private def validateLimit(value: Int): Unit = {
    if (value > maximumValue) throw new Exception(s"The value $value is more than allover ${maximumValue} for ${Name}")
  }

}
