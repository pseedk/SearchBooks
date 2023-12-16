package ru.pvkovalev.searchbooks.network.model

data class BookShelf(
    val items: List<Item>,
    val kind: String,
    val totalItems: Int
)