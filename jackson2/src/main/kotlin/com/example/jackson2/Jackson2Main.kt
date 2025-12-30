package com.example.jackson2

import com.example.core.Data
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule

fun main(args: Array<String>) {
  val mapper = JsonMapper.builder()
    .addModule(KotlinModule.Builder().build())
    .build()

  val serialized = mapper.writeValueAsString(
    Data(
      anotherConcreteProperty = "data class concrete",
      abstractProperty = "data class abstract",
    )
  )
  println("---- Serialized to ----")
  println(serialized)

  println("---- Deserialized from ----")
  println(
    mapper.readValue(
      """
    {
      "concreteProperty":"concrete",
      "abstractProperty":"abstract",
      "anotherConcreteProperty":"another concrete"
    }
  """.trimIndent(), Data::class.java
    )
  )
}
