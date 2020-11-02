//Buatlah sebuah function dengan 2 parameter (2 Double) mempunyai return value String , dan bisa di jalankan

fun main() {

    val nilai = showValue(100.0, 90.0)
    println(nilai)
}


fun showValue(hasil1:Double, hasil2: Double):String = """
    Nilai 1 : $hasil1
    Nilai 2 : $hasil2
""".trimIndent()