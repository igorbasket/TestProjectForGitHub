package librariesBook

class Library {

    def addBook(bk) {
        loanStock[bk.catalogNumber] = bk
    }

    def registerBorrower(borrower) {
        borrowers[borrower.membershipNumber] = borrower
    }

    def lendBook(catalogNumber, membershipNumber) {
        def loanStockEntry = loanStock.find { entry -> entry.key == catalogNumber }
        def borrowersEntry = borrowers.find { entry -> entry.key == membershipNumber }
        if(borrowersEntry&&loanStockEntry) borrowersEntry.value.attachBook(loanStockEntry.value)
        else println 'Что-то пошло не так. Поиск не увенчался успехом'
    }
    def returnBook(catalogNumber) {
        def loanStockEntry = loanStock.find { entry -> entry.key == catalogNumber }
        def bor = loanStockEntry.value.borrower
        bor.detachBook(loanStockEntry.value)
    }
// -----свойства ------------------
    def name
    def loanStock = [ : ]
    def borrowers = [ : ]


}
