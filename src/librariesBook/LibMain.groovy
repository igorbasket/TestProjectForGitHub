package librariesBook

class LibMain {
   static def readMenuSelection() {
       println()
       println('0: Quit')
       println('1: Add new book')
       println('2: Display stock')
       println('3: Display books available for loan')
       println('4: Display books on loan')
       println('5: Register new borrower')
       println('6: Display borrowers')
       println('7: Lend one book')
       println('8: Return one book')
       print('\n \tEnter choice >>> ')
       return System.in.newReader().readLine()
   }
    static void main(String[] args) {

        // make the Action object
        def action = new Action(library: new Library(name: 'Букинист'))
// make first selection
        def choice = readMenuSelection()
        while (choice != '0') {
            switch (choice) {
                case '1':
                    action.addBook()
                    break
                case '2':
                    action.displayStock()
                    break
                case '3':
                    action.displayBooksAvailableForLoan()
                    break
                case '4':
                    action.displayBooksOnLoan()
                    break
                case '5':
                    action.registerBorrower()
                    break
                case '6':
                    action.displayBorrowers()
                    break
                case '7':
                    action.lendBook()
                    break
                case '8':
                    action.returnBook()
                    break
                default: println "Unknown selection"
            }
            // next selection
            choice = readMenuSelection()
        }
        }
}
