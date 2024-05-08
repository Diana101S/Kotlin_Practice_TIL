
    class Book(
        private val name: String,
        val desc: String,
        val originalPrice: Int,
    ) {

        private var discount: Int = 0
        fun use() {
            discount = if (discount < 10) 10
            else if (discount < 50) 50
            else 80
        }

        fun printInfo() {
            println("name: $name")
            println("price: ${getPrice()}")
        }

        fun getPrice(): Int {
            return originalPrice * (100 - discount) / 100
        }
    }

    val myBook = Book(
        "easy Kotlin",
        "like it better than Java",
        10000
    )

    myBook.printInfo()
    myBook.use()
    myBook.printInfo()
    myBook.use()
    myBook.printInfo()



------출력결과------

class Book






















val myBook: Scratch.Book





name: easy Kotlin
price: 10000

name: easy Kotlin
price: 9000

name: easy Kotlin
price: 5000

