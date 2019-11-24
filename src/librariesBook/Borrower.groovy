package librariesBook

class Borrower {
    def attachBook(bk) {
        borrowedBooks[bk.catalogNumber] = bk
        bk.attachBorrower(this)
    }
    def detachBook(bk) {
        borrowedBooks.remove(bk.catalogNumber)
        bk.detachBorrower()
    }
    String toString() {
        return "Borrower: ${membershipNumber}; ${name}"
    }
// ------свойства----------------
    def membershipNumber
    def name
    def borrowedBooks = [ : ]

}
