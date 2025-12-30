package com.example.jackson3

import com.example.core.Data
import tools.jackson.databind.DeserializationFeature
import tools.jackson.databind.json.JsonMapper
import tools.jackson.module.kotlin.KotlinModule

fun main(args: Array<String>) {
  val mapper = JsonMapper.builder()
    // .enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
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
