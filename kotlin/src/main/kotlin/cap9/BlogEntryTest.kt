package cap9

import java.net.URI
import java.time.LocalDateTime

fun main() {
    val blogEntry = BlogEntry("Data Classes are here", "Because Kotlin rulz!",
        LocalDateTime.now(), true, LocalDateTime.now(), URI("http://packt.com/blog/programming_kotlin/data_classes"),
        0, emptyList(), null)

    println(blogEntry.title)
    println(blogEntry.description)

    blogEntry.title = "Title modified"
    println(blogEntry.title)

//    blogEntry.url = URI("cannot modify a val field")

    println(blogEntry.toString())

    val blogEntryCopy = blogEntry.copy()
    println(blogEntryCopy.toString())

    val blogEntryCopyModified = blogEntry.copy(title = "Copy with title modified")
    println(blogEntryCopyModified.toString())
}