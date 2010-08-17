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

  def constantPatterns(x: Any): Unit = {
    x match {
      case "Scala rocks" => println("Yeah, true!")
      case PatternMatcher => println("A singleton object: The pattern matcher!")
      case 667 => println("The neighbour of the beast")
      case true => println("The truth is out there")
      case _ => println("Something unknown:" + x.toString)
    }
  }

  def main(args: Array[String]) {
    // TODO show examples for the different ways of pattern matching in Scala
    extraction
    println("Constant patterns match any literals or singleton objects:")
    constantPatterns(true)
    constantPatterns(PatternMatcher)
    constantPatterns("Scala rocks")
    constantPatterns("A string")
    constantPatterns(667L)
  }
}
