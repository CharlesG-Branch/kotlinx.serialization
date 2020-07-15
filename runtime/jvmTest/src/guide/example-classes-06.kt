// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package kotlinx.serialization.example.exampleClasses06

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable 
data class Repository(val name: String, @Required val language: String = "Kotlin")

fun main() {
    val data = Json.decodeFromString<Repository>("""
        {"name":"kotlinx.serialization"}
    """)
    println(data)
}