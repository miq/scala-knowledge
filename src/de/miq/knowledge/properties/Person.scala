package de.miq.knowledge.properties

import reflect.BeanProperty


class Person(lastname: String, val firstname: String, @BeanProperty var age: Int) {

  private[this] var sn = lastname

  def surname : String = sn

  def surname_=(newName: String) {
    this.sn = newName
  }
}
