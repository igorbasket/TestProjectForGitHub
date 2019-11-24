package libBookStep2

class LibMain {
    static void main(String[] args) {
        def lib = new Library(name : 'Букинист')

        def bk1 = new Book(catalogNumber : '#GR120919', title : 'Groovy', author : 'Ken')
        def bk2 = new Book(catalogNumber : '#OD121419', title : 'OOD', author : 'Ken')
        def bk3 = new Book(catalogNumber : '#UM121419', title : 'UML', author : 'John')

        lib.addBook(bk1)
        lib.addBook(bk2)
        lib.addBook(bk3)

        lib.displayStock()
        // Now introduce some borrowers
        def user1 = new Borrower(membershipNumber : '1234', name : 'Кристина')
        def user2 = new Borrower(membershipNumber : '5678', name : 'София')
        lib.registerBorrower(user1)
        lib.registerBorrower(user2)
// See borrowers
        lib.displayBorrowers()
// Finally, make some transactions
        lib.displayBooksAvailableForLoan()
        lib.lendBook('#GR120919', '1234')
        lib.displayBooksAvailableForLoan()
        lib.displayBooksOnLoan()
        lib.displayBorrowers()
        lib.returnBook('#GR120919')
        lib.displayBooksAvailableForLoan()
        lib.displayBooksOnLoan()
        lib.displayBorrowers()


    }
}
