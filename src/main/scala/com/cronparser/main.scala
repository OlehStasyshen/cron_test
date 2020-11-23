package com.cronparser

import com.cronparser.model.CronJob
import com.cronparser.parser.CronParser

object Main extends App {

  val inputString = if (args.nonEmpty) {
    args.head
  } else {
    println("Enter you CronJob row")
    Console.in.readLine()
  }

  val part = CronParser.parseCronJob(inputString)

  CronJob.printJob(part)
}
