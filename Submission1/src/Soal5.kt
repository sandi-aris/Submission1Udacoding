//Di sini ada sebuah array,{“jakarta”,”jakarta”,”Padang”,”Solo”,”Padang”,”Bandung”,”Padang”,”Malang”,”Bali”}Ketika di running hasilnya seperti ini

fun main() {
    val arrayKota = arrayOf("jakarta","jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali")


    for (i in arrayKota.toSet()){
        println("$i : ${arrayKota.count { it == i }}")
    }

}