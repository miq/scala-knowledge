package de.miq.knowhow.properties


object Runner {

  def main(args: Array[String]) {
    val miq = new Person("Vrbanec", "Mihael", 34)
    println(miq.firstname)
    println(miq.age)
    println(miq.getAge)
    miq.age = 30
    println(miq.age)
    val baby = new YoungPerson("??", "??", 1)
    println(baby.age)
    println(baby.surname)
    baby.surname = "ParentName"
  }

}
