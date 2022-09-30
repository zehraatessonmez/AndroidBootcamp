package com.zehraatessonmez.kotlindersleribootcamp.Odevler

fun main() {

    val fonkSonuc = OdevIki()

    //Soru 1
    val soru1 = fonkSonuc.fahDonusum(34)
    println("Girilen derecenin fah olarak karşılığı : $soru1")

    //Soru 2
    fonkSonuc.diktortgenCevre(7,5)

    //Soru 3
    val soru3 = fonkSonuc.faktoriyelHesapla(13)
    println("Girilen sayının faktoriyel hesabı : $soru3")

    //soru 4
    fonkSonuc.harfHesapla("Araba",'a')


    //soru 5
    val soru5 = fonkSonuc.icAcilarToplami(6)
    println("Girilen kenar sayısına göre iç açılar toplamı : $soru5")

    //soru 6
    val soru6 = fonkSonuc.maasHesabı(24)
    println("Çalışanın maaşı : $soru6")


    //soru 7
    val soru7 = fonkSonuc.kotaHesapla(60)
    println("Girilen kota miktarına göre internet ücreti: $soru7")

}