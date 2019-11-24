package libBookStep2

class Library {
    def addBook(bk) {
        loanStock[bk.catalogNumber] = bk
    }
    def displayStock() {
        println "\n\nLibrary: ${name}"
        println '================'
        loanStock.each { catalogNumber, book -> println " ${book}" }
    }
    def displayBooksAvailableForLoan() {
        println "\n\nLibrary: ${name} : Available for loan"
        println '================'
        loanStock.each { catalogNumber, book -> if(book.borrower == null) println " ${book}" }
    }
    def displayBooksOnLoan() {
        println "\n\nLibrary: ${name} : On loan"
        println '================'
        loanStock.each { catalogNumber, book -> if(book.borrower != null) println " ${book}" }
    }
    def registerBorrower(borrower) {
        borrowers[borrower.membershipNumber] = borrower
    }
    def displayBorrowers() {
        println "\n\nLibrary: ${name} : borrower details"
        println '================'
        borrowers.each { membershipNumber, borrower ->
            println borrower
            borrower.borrowedBooks.each { catalogNumber, book -> println " ${book}" }
        }
    }

    def lendBook(catalogNumber, membershipNumber) {
        def loanStockEntry = loanStock.find { entry -> entry.key == catalogNumber }
        def borrowersEntry = borrowers.find { entry -> entry.key == membershipNumber }
        borrowersEntry.value.attachBook(loanStockEntry.value)
    }
    def returnBook(catalogNumber) {
        def loanStockEntry = loanStock.find { entry -> entry.key == catalogNumber }
        def bor = loanStockEntry.value.borrower
        bor.detachBook(loanStockEntry.value)
    }
// -----properties ------------------
    def name
    def loanStock = [ : ]
    def borrowers = [: ]

}
