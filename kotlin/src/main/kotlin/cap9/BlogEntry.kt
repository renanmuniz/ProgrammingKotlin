package cap9

import java.net.URI
import java.time.LocalDateTime

data class BlogEntry(var title: String, var description: String, val publishTime: LocalDateTime,
                     val approved: Boolean?, val lastUpdated: LocalDateTime, val url: URI, val commentCount: Int?,
                     val topTags: List<String>, val email: String?)
