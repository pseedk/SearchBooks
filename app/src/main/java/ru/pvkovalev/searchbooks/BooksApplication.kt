package ru.pvkovalev.searchbooks

import android.app.Application
import ru.pvkovalev.searchbooks.data.AppContainer
import ru.pvkovalev.searchbooks.data.DefaultAppContainer

class BooksApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}