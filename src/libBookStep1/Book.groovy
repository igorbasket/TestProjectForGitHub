package libBookStep1

class Book {
    @Override
    String toString(){
        return "Book: ${catalogNumber}: ${title} by: ${author}"
    }
// ------properties-----------------

    String catalogNumber
    def title
    def author
}
