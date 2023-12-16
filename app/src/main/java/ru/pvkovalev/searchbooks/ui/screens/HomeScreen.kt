package ru.pvkovalev.searchbooks.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.pvkovalev.searchbooks.data.Book
import ru.pvkovalev.searchbooks.ui.BooksUiState

@Composable
fun HomeScreen(
    booksUiState: BooksUiState,
    retryAction: () -> Unit,
    modifier: Modifier = Modifier,
    onBooksClicked: (Book) -> Unit
) {
    when (booksUiState) {
        is BooksUiState.Loading -> LoadingScreen(modifier)
        is BooksUiState.Success -> BooksGridScreen(
            books = booksUiState.bookSearch,
            modifier = modifier,
            onBooksClicked
        )
        is BooksUiState.Error -> ErrorScreen(retryAction = retryAction, modifier)
    }
}