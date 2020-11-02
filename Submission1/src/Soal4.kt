//Buatlah sebuah function yang ada parameter integer ,di dalam function ada when expression,
//jika integer nilainya di atas 60 sampai 80 --> memuaskan
//jika integer nilainya di atas 80 sampai 90 --> sangat memuaskan
//jika integer nilainya di atas 90 sampai 100 --> terpuji
//di bawah 60 --> tidak lulus
//di atas 100 --> nilai tidak valid

fun main() {
    Nilai(60)
    Nilai(81)
    Nilai(99)
    Nilai(59)
    Nilai(150)

}


fun Nilai(nilai:Int){
    when{
        nilai in 60..80 -> println("Memuaskan")
        nilai in 81..90 -> println("Sangat memuaskan")
        nilai in 91..100 -> println("Terpuji")
        nilai < 60 -> println("Tidak Lulus")
        nilai > 100 -> println("Nilai Tidak Valid")
    }

}