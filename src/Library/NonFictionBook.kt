package Library

class NonFictionBook(title:String, author: String, ISBN: Int): Book(title, author, ISBN){
    var genre: String = ""

    fun drama(){
        genre = "History"
    }

    fun comedy(){
        genre = "Comedy"
    }

    fun action(){
        genre = "Science Fiction"
    }

    override fun displayInfo(){
        if (genre == ""){
            println("Title: $title,  Author: $author, ISBN: $ISBN ")
        }
        else{
            println("Title: $title,  Author: $author, ISBN: $ISBN , genre: $genre ")
        }
    }


}