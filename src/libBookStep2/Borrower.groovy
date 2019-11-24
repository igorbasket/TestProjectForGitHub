package libBookStep2

class Borrower {
    def attachBook(bk) {
        borrowedBooks[bk.catalogNumber] = bk
        bk.attachBorrower(this)
    }

    def detachBook(bk) {
        borrowedBooks.remove(bk.catalogNumber)
        bk.detachBorrower()
    }

    @Override
    String toString() {
        return "borrower: ${membershipNumber}; ${name}"
    }
// ------properties----------------
    def membershipNumber
    def name
    def borrowedBooks = [:]

}
