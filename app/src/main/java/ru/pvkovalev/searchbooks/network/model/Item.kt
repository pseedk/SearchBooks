package ru.pvkovalev.searchbooks.network.model

data class Item(
    val accessInfo: AccessInfo,
    val etag: String,
    val id: String,
    val kind: String,
    val searchInfo: SearchInfo,
    val selfLink: String,
    val volumeInfo: VolumeInfo?
)