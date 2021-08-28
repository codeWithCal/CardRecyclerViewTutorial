package code.with.cal.cardviewrecyclerviewtutorial

var bookList = mutableListOf<Book>()

val BOOK_ID_EXTRA = "bookExtra"

class Book(
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = bookList.size
)