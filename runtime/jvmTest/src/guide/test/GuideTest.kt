// This file was automatically generated from serialization-guide.md by Knit tool. Do not edit.
package kotlinx.serialization.example.test

import org.junit.Test
import kotlinx.knit.test.*

class GuideTest {
    @Test
    fun testExampleBasic01() {
        captureOutput("ExampleBasic01") { kotlinx.serialization.example.exampleBasic01.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.SerializationException: Serializer for class 'Repository' is not found. Mark the class as @Serializable or provide the serializer explicitly."
        )
    }

    @Test
    fun testExampleBasic02() {
        captureOutput("ExampleBasic02") { kotlinx.serialization.example.exampleBasic02.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"language\":\"Kotlin\"}"
        )
    }

    @Test
    fun testExampleBasic03() {
        captureOutput("ExampleBasic03") { kotlinx.serialization.example.exampleBasic03.main() }.verifyOutputLines(
            "Repository(name=kotlinx.serialization, language=Kotlin)"
        )
    }

    @Test
    fun testExampleClasses01() {
        captureOutput("ExampleClasses01") { kotlinx.serialization.example.exampleClasses01.main() }.verifyOutputLines(
            "{\"name\":\"Kotlin\",\"stars\":9000}"
        )
    }

    @Test
    fun testExampleClasses02() {
        captureOutput("ExampleClasses02") { kotlinx.serialization.example.exampleClasses02.main() }.verifyOutputLines(
            "{\"owner\":\"kotlin\",\"name\":\"kotlinx.serialization\"}"
        )
    }

    @Test
    fun testExampleClasses03() {
        captureOutput("ExampleClasses03") { kotlinx.serialization.example.exampleClasses03.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" java.lang.IllegalArgumentException: name cannot be empty"
        )
    }

    @Test
    fun testExampleClasses04() {
        captureOutput("ExampleClasses04") { kotlinx.serialization.example.exampleClasses04.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.MissingFieldException: Field 'language' is required, but it was missing"
        )
    }

    @Test
    fun testExampleClasses05() {
        captureOutput("ExampleClasses05") { kotlinx.serialization.example.exampleClasses05.main() }.verifyOutputLines(
            "Repository(name=kotlinx.serialization, language=Kotlin)"
        )
    }

    @Test
    fun testExampleClasses06() {
        captureOutput("ExampleClasses06") { kotlinx.serialization.example.exampleClasses06.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.MissingFieldException: Field 'language' is required, but it was missing"
        )
    }

    @Test
    fun testExampleClasses07() {
        captureOutput("ExampleClasses07") { kotlinx.serialization.example.exampleClasses07.main() }.verifyOutputLinesStart(
            "Exception in thread \"main\" kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 60: Encountered an unknown key 'language'. You can enable 'ignoreUnknownKeys' property to ignore unknown keys."
        )
    }

    @Test
    fun testExampleClasses08() {
        captureOutput("ExampleClasses08") { kotlinx.serialization.example.exampleClasses08.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"language\":\"Kotlin\"}"
        )
    }

    @Test
    fun testExampleClasses09() {
        captureOutput("ExampleClasses09") { kotlinx.serialization.example.exampleClasses09.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"owner\":{\"name\":\"kotlin\"}}"
        )
    }

    @Test
    fun testExampleClasses10() {
        captureOutput("ExampleClasses10") { kotlinx.serialization.example.exampleClasses10.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\",\"owner\":{\"name\":\"kotlin\"},\"maintainer\":{\"name\":\"kotlin\"}}"
        )
    }

    @Test
    fun testExampleBuiltin01() {
        captureOutput("ExampleBuiltin01") { kotlinx.serialization.example.exampleBuiltin01.main() }.verifyOutputLines(
            "[{\"name\":\"kotlinx.serialization\"},{\"name\":\"kotlinx.coroutines\"}]"
        )
    }

    @Test
    fun testExampleBuiltin02() {
        captureOutput("ExampleBuiltin02") { kotlinx.serialization.example.exampleBuiltin02.main() }.verifyOutputLines(
            "[{\"name\":\"kotlinx.serialization\"},{\"name\":\"kotlinx.coroutines\"}]"
        )
    }

    @Test
    fun testExampleBuiltin03() {
        captureOutput("ExampleBuiltin03") { kotlinx.serialization.example.exampleBuiltin03.main() }.verifyOutputLines(
            "Data(a=[42, 42], b=[42])"
        )
    }

    @Test
    fun testExampleJson01() {
        captureOutput("ExampleJson01") { kotlinx.serialization.example.exampleJson01.main() }.verifyOutputLines(
            "{",
            "    \"name\": \"kotlinx.serialization\",",
            "    \"language\": \"Kotlin\"",
            "}"
        )
    }

    @Test
    fun testExampleJson02() {
        captureOutput("ExampleJson02") { kotlinx.serialization.example.exampleJson02.main() }.verifyOutputLines(
            "{\"name\":\"kotlinx.serialization\"}"
        )
    }

    @Test
    fun testExampleJson03() {
        captureOutput("ExampleJson03") { kotlinx.serialization.example.exampleJson03.main() }.verifyOutputLines(
            "Repository(name=kotlinx.serialization)"
        )
    }
}