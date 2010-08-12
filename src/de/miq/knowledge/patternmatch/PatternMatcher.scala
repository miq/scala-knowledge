package de.miq.knowledge.patternmatch

import caseclasses.Name


object PatternMatcher {

  def getYearMonthTuple : (Int, String) = (2010, "February")

  def getName : Name = new Name("John", "Doe")

  def extraction: Unit = {
    val (year, month) = getYearMonthTuple
    println("year:" + year)
    println("month:" + month)
    val Name(f, s) = getName
    println("Combined name: " + s + ", " + f)
    println("Full name: " + getName.toString)
  }

  def main(args: Array[String]) {
    // TODO show examples for the different ways of pattern matching in Scala
    extraction
  }
}
