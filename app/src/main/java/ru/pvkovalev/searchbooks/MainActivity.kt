package ru.pvkovalev.searchbooks

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import ru.pvkovalev.searchbooks.ui.BooksApp
import ru.pvkovalev.searchbooks.ui.theme.SearchBooksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SearchBooksTheme {
               BooksApp(
                   onBooksClicked = {
                       ContextCompat.startActivity(
                           this,
                           Intent(Intent.ACTION_VIEW, Uri.parse(it.previewLink)),
                           null
                       )
                   }
               )
            }
        }
    }
}