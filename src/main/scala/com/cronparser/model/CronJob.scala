package com.cronparser.model

case class CronJob(minutes: Minutes, hours: Hours, daysOfMonth: DaysOfMonth, months: Months, daysOfWeek: DaysOfWeek, command: String)

object CronJob {
  def printJob(job: CronJob) = {
    print("minute".padTo(14, ' '))
    println(job.minutes.value.mkString(" "))
    print("hour".padTo(14, ' '))
    println(job.hours.value.mkString(" "))
    print("day of month".padTo(14, ' '))
    println(job.daysOfMonth.value.mkString(" "))
    print("month".padTo(14, ' '))
    println(job.months.value.mkString(" "))
    print("day of week".padTo(14, ' '))
    println(job.daysOfWeek.value.mkString(" "))
    print("command".padTo(14, ' '))
    println(job.command)
  }
}
