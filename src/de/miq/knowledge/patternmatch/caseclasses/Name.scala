package de.miq.knowledge.patternmatch.caseclasses

/**
 * Case classes generate quite some convenience methods and add support for pattern matching
 */
case class Name(forename: String, surname: String) {

  def getFullName = List(forename, surname).mkString(" ")
}

object CaseClasses {

  def main(args : Array[String]) {
    println("case classes have natural toString() implementations: " + new Name("Jane", "Doe"))
    // case classes automatically have factory methods
    val herName = Name("Jane", "Doe")
    println("case classes have their constructor args as readonly properties: forename=" + herName.forename + ", surname=" + herName.surname)
    val herNewName = new Name("Jane", "Doe")
    println("case classes have natural hashcode and equals, so that " + herName + " equals " + herNewName + " == " + (herName == herNewName))
  }
}

