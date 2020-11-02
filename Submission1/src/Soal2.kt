//Buatlah sebuah function yang dapat menerima array deret bilangan dan mengembalikan bilangan yang genap saja

fun main() {
    val dataArray = 1..100
    val arrayList = dataArray.toList().toTypedArray()

    for (i in arrayList){
        if (i % 2 == 0) println("Nilai $i adalah bilangan Genap" )
    }
}