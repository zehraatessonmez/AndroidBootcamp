package com.zehraatessonmez.kotlindersleribootcamp.Odevler

class OdevIki {

    //Soru 1
    fun fahDonusum(derece:Int):Double{
        val sonuc = (derece*1.8) + 32
        return sonuc
    }

    //Soru 2
    fun diktortgenCevre(a:Int,b:Int){
        val sonuc = 2*(a + b)
        println("Kenar uzunlukları $a ve $b olan diktörgenin çevresi : $sonuc")
    }

    //Soru 3
    fun faktoriyelHesapla(sayi:Int):Long{
        var sonuc:Long = 1
        for(i in 1..sayi){
            sonuc = sonuc*i
        }
        return sonuc
    }


    //Soru 4
    fun harfHesapla(kelime:String,harf:Char){
        var newkelime = kelime.lowercase()
        var hesapla = 0
        for(i in newkelime){
            if(i == harf){
                hesapla++
            }
        }
        println("$kelime kelimesinde bulunan $harf sayısı : $hesapla")
    }

    //Soru 5
    fun icAcilarToplami(kenarSayisi:Int):Int{
        val sonuc = (kenarSayisi-2)*180
        return sonuc
    }

    //Soru 6
    fun maasHesabı(günSayisi:Int):Int{
        var calisilanSaat = günSayisi*8
        var maas = 0
        var mesaiSaati = 0
        if(calisilanSaat<160){
            maas = calisilanSaat*10

        }else if(calisilanSaat>=160){
            mesaiSaati = calisilanSaat - 160
            maas = 1590 + (mesaiSaati*20)

        }else{
            var sonuc = println("Geçersiz gün sayısı")
        }
       return maas
    }

    //Soru 7
    fun kotaHesapla(kotaMiktar:Int):Int{
        var ücret = 0
        if(kotaMiktar<=50){
            ücret = 100
        }else{
            var kotaAsimi = kotaMiktar - 50
            ücret = 100 + (kotaAsimi*4)
        }
      return ücret
    }





}