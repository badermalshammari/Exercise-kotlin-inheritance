package Library

class FictionBook( title:String,  author: String,  ISBN: Int): Book(title, author, ISBN){
    var genre: String = ""

    fun drama(){
        genre = "Drama"
    }

    fun comedy(){
        genre = "Comedy"
    }

    fun action(){
        genre = "Action"
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