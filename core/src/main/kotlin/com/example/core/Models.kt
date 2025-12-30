package com.example.core

abstract class Base {
  val concreteProperty : String = "base concrete"
  abstract val abstractProperty: String
}


data class Data(
  val anotherConcreteProperty: String,
  override val abstractProperty: String,
) : Base() {
  override fun toString(): String {
    return "DataClass(anotherConcreteProperty='$anotherConcreteProperty', abstractProperty='$abstractProperty', concreteProperty='$concreteProperty')"
  }
}
