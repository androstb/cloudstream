package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class ExampleProvider : MainAPI() {
    override var mainUrl = "https://example.com"
    override var name = "Example provider"
    override val supportedTypes = setOf(TvType.Movie)
    override var lang = "id"
    override val hasMainPage = false

    override suspend fun search(query: String, page: Int): SearchResponseList {
        return newSearchResponseList(emptyList())
    }
}
