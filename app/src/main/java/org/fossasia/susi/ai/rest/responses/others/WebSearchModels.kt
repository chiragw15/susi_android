package org.fossasia.susi.ai.rest.responses.others

import com.squareup.moshi.Json

/**
 * <h1>Parse retrofit response from websearch client.</h1>
 *
 * Created by mayank on 12-12-2016.
 */

class WebSearch (
    @Json(name = "Heading")
    var heading: String?,

    @Json(name = "RelatedTopics")
    var relatedTopics: List<RelatedTopics>?
)

class RelatedTopics (
        @Json(name = "FirstURL")
        var url: String?,

        @Json(name = "Text")
        var text: String?,

        @Json(name = "Icon")
        var icon: WebIcon?,

        @Json(name = "Result")
        var result: String?
)

class WebIcon (
    @Json(name = "URL")
    var url: String? = null
)
