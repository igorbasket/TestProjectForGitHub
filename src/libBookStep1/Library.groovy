package libBookStep1

class Library {
     def addBook(Book bk) {
            loanStock[bk.catalogNumber] = bk
        }
        @Override
        String toString() {
          String str = "Library: ${name}\n" +
            "================\n"
            loanStock.each { catalogNumber, book -> str += "${book}\n" }
            str
        }
// ------properties-----------------

    def name
    def loanStock = [ : ]

}

