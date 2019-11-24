package bookClass


class MainBook {
    static void main(String[] args) {
        def exemplar1 = new Book()
        println exemplar1
        Book exemplar2 = new Book('#560803', 'Colobok', 'обработка Афанасьев А.Н.')
        println exemplar2
        exemplar1.setTitle('Groovy programming : an introduction for Java developers ')
        exemplar1.author = 'Kenneth Barclay, John Savage'
        exemplar1.setCatalogNumber('#GP112219')
        println exemplar1
        def exemplar3=new Book(title: 'Собака на сене')
        exemplar3.setAuthor('Лопе де Вега')
        exemplar3.setCatalogNumber('#SN112619')
        println exemplar3
        println exemplar3.getProperties()
    }
}
