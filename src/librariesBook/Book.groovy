package librariesBook

class Book {
    def attachBorrower(borrower) {
        this.borrower = borrower
    }

    def detachBorrower() {
        borrower = null
    }

    @Override
    String toString() {
        // redefinition
        return "Book: ${catalogNumber}: ${title} by: ${author}"
    }
//------properties-----------------

    def catalogNumber
    def title
    def author
    def borrower = null

}
