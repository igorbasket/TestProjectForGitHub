package libBookStep1

class LibMain {
    static void main(String[] args) {
        // Create a library object
        def lib = new Library(name : 'Букинист')
//        Create some books...
        def bk1 = new Book(catalogNumber : '#GR120919', title : 'Groovy', author : 'Ken')
        def bk2 = new Book(catalogNumber : '#OD121419', title : 'OOD', author : 'Ken')
        def bk3 = new Book(catalogNumber : '#UM121419', title : 'UML', author : 'John')
        // ...add them to the loan stock
        lib.addBook(bk1)
        lib.addBook(bk2)
        lib.addBook(bk3)
// See stock
        println lib

    }
}
