package bookClass

import java.time.LocalDate
import java.time.LocalDateTime

class Book {
    Book(def title,def auth){
//        LocalDateTime ldt=LocalDateTime.now()
//        catalogNumber='#'+ldt.getYear()+ldt.getMonth()
        this.title=title
        author=auth
    }

    Book(catalogNumb,title,auth){
        catalogNumber=catalogNumb
        this.title=title
        author=auth
    }

    Book(){
        author = 'I am'
    }

    void setTitle(title){
        if (this.title==null)
        this.title = title
    }

    void setCatalogNumber(catalogNumber){
        if (this.catalogNumber==null)
        this.catalogNumber = catalogNumber
    }



    @Override
    String toString(){

        // redefinition
        return "Book: ${catalogNumber}: ${title} by: ${author}"
    }
// ------properties-----------------

    protected def catalogNumber
    private def title
    def author
}
