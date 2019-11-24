package TestsProj

class TestsClass {
    static void main(String[] args) {

        def people = [new Human(name: "Vasya Pupkin", age: 21),
                      new Human(),
                      new Human(age: 40),
                      new Human(name: "Uncle Goga"),
                      new Human(name: "Aunt Sonya", age: 60),
                      new Human(name: "It's me")]

        def notBot=[]
        for (el in people) {
            if (el.age == 0) {
                println("Введите возраст для ${el.name}: ")
                def paramAge = System.in.newReader().readLine()
                el.age = paramAge
                notBot += el
            }
        }
        for (el in notBot)
            if (el.name == "NoName"){
                println("Введите имя для ${el.name}: ")
                def paramName = System.in.newReader().readLine()
                el.name = paramName
            }
                // здесь должен быть код, который позволит создать
// новый список объектов Human, в котором предложено
// пользователям ввести новые значения для дефолтных свойств

                println "Все, что создано"
        for(el in people){
            println el
        }
        println "Создано и дополнено:"
        for(el in notBot){
            println el
        }

    }
}
class Human {
    String toString() {
        "${name} was born ${age} years ago"
    }

    def name = "NoName"
    def age = 0
}
