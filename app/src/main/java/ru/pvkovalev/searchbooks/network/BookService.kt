package ru.pvkovalev.searchbooks.network

import retrofit2.http.GET
import retrofit2.http.Query
import ru.pvkovalev.searchbooks.network.model.BookShelf

interface BookService {

    @GET("volumes")
    suspend fun bookSearch(
        @Query("q") searchQuery: String,
        @Query("maxResults") maxResults: Int
    ): BookShelf
}