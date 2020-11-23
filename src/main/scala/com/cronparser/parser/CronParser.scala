package com.cronparser.parser

import com.cronparser.model._

object CronParser {

  val NUMBER_OF_CRONJOB_ELEMENTS = 6

  def parseCronJob(job: String): CronJob = {
    val parts = job.split(" ")
    if (parts.length != NUMBER_OF_CRONJOB_ELEMENTS) throw new Exception("The Job is Invalid")

    CronJob(Minutes.parse(parts(0)), Hours.parse(parts(1)), DaysOfMonth.parse(parts(2)), Months.parse(parts(3)), DaysOfWeek.parse(parts(4)), parts.drop(5).mkString(" "))

  }

}
