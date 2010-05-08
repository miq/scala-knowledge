package de.miq.knowledge.option


object OptionDealer {

  def getElementById(id: Int) : Option[String] = {
    id match {
      case 32 => Some("Element 32")
      case _ => None
    }
  }
}
