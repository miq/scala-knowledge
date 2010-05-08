package de.miq.knowledge.properties


class YoungPerson(surname: String, firstname: String, age: Int) extends Person(surname, firstname, age) {
  require (age < 30)
}
