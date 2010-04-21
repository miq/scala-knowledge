package de.miq.knowhow


class YoungPerson(surname: String, firstname: String, age: Int) extends Person(surname, firstname, age) {
  require (age < 30)
}
