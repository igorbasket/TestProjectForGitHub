package librariesBook

class Action {
    def addBook() {
        print(' \nEnter book catalog number: ')
        def catalogNumber = System.in.newReader().readLine()
        print(' Enter book title: ')
        def title = System.in.newReader().readLine()
        print(' Enter book author: ')
        def author = System.in.newReader().readLine()
        def bk = new Book(catalogNumber: catalogNumber, title: title, author: author)
    library.addBook(bk)
}
    def displayStock() {
        println "\n\nLibrary: ${name}"
        println '================'
        library.loanStock.each { catalogNumber, book -> println " ${book}" }
    }

    def displayBooksAvailableForLoan() {
        println "\n\nLibrary: ${library.name} : Available for loan"
        println '================'
        library.loanStock.each { catalogNumber, book -> if (book.borrower == null) println " ${book}" }
    }

    def displayBooksOnLoan() {
        println "\n\nLibrary: ${name} : On loan"
        println '================'
        library.loanStock.each { catalogNumber, book -> if (book.borrower != null) println " ${book}" }
    }

    def displayBorrowers() {
        println "\n\nLibrary: ${name} : Borrower details"
        println '================'

        library.borrowers.each { membershipNumber, borrower ->
            println borrower
            borrower.borrowedBooks.each { catalogNumber, book -> println " ${book} " }
        }
    }

    def registerBorrower() {
        print('\nEnter borrower membership number: ')
        def membershipNumber = System.in.newReader().readLine()
        print(' Enter borrower name: ')
        def name = System.in.newReader().readLine()
        def bor = new Borrower(membershipNumber: membershipNumber, name: name)
        library.registerBorrower(bor)
    }

    def lendBook() {
        print('\nEnter book catalog number: ')
        def catalogNumber = System.in.newReader().readLine()
        print(' Enter borrower membership number: ')
        def membershipNumber = System.in.newReader().readLine()
        library.lendBook(catalogNumber, membershipNumber)
    }

    def returnBook() {
        print('\nEnter book catalog number: ')
        def catalogNumber = System.in.newReader().readLine()
        library.returnBook(catalogNumber)
    }
// -----properties -----------------
    def library
}
