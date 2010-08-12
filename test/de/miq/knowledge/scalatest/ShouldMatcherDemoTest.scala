package de.miq.knowledge.scalatest

import org.scalatest.junit.{ShouldMatchersForJUnit, JUnitSuite}
import org.junit.Test

class ShouldMatcherDemoTest extends JUnitSuite with ShouldMatchersForJUnit {

  @Test def simpleShouldMatchers() {
    12 should be < (13)
  }

}

