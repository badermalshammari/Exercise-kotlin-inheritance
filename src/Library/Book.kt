package Library

open class Book(var title: String, var author: String, var ISBN: Int) {

    open fun displayInfo() {
        println("Title: ${title}, Author: $author, ISBN: $ISBN")
    }
}