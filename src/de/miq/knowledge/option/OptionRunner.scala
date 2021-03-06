package de.miq.knowledge.option

object OptionDealer {

  def getElementById(id: Int) : Option[String] = {
    id match {
      case 32 => Some("Element 32")
      case _ => None
    }
  }
}

object OptionRunner {

  def main(args: Array[String]) {
    handleSingleElementsWithGetOrElse
    printSep
    def mixedList[Option[String]] = Some("A thing") :: None :: None :: Some("another") :: Some("more phun") :: Nil
    useForWithList(mixedList)
    printSep
    usePatternMatchWithList(mixedList)
    printSep
    println(mixedList.filter((x: Option[String]) => x.isDefined))
    printSep
    countEmpties(mixedList)
    printSep
    foreachList(mixedList)
  }

  def printSep = {
    println("-------------------------------------------")
  }

  def useForWithList(mixedList: List[Option[String]]) : Unit = {
    for (Some(x) <- mixedList) {
      println("cool element in the list: " + x)
    }
  }

  def usePatternMatchWithList(mixedList: List[Option[String]]) : Unit = {
    for (x <- mixedList) {
      x match {
        case Some(y) => println("Found: " + y)
        case None => println("empty element")
      }
    }
  }

  def foreachList(mixedList: List[Option[String]]) : Unit = {
    mixedList foreach ((x: Option[String]) => println(x.get))
  }

  def countEmpties(mixedList: List[Option[String]]) : Unit = {
    var emptyElements = 0
    mixedList.filter(_ == None) foreach (_ => emptyElements += 1)
    println("empty:" + emptyElements)
  }

  def handleSingleElementsWithGetOrElse: Unit = {
    println(OptionDealer getElementById(33) getOrElse "nothing")
    println(OptionDealer getElementById(32) getOrElse "nothing would be strange")
  }
}
