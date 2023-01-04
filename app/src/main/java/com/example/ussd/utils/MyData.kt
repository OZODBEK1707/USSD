package com.example.ussd.utils

import com.example.ussd.models.MyTemplate

object MyData {
    val listDaqiqa = ArrayList<MyTemplate>()//0
    val listTarif = ArrayList<MyTemplate>()//1
    val listXizmat = ArrayList<MyTemplate>()//2
    val listInternet = ArrayList<MyTemplate>()//3
    val listSms = ArrayList<MyTemplate>()//4

    fun addTemplate(){
        listDaqiqa.add(MyTemplate("60 daqiqa", "1*2*4*1#", "500so'm", "bir umrga beriladi"))
        listDaqiqa.add(MyTemplate("70 daqiqa", "1*2*6*1#", "1000so'm", "bir umrga beriladi"))
        listDaqiqa.add(MyTemplate("80 daqiqa", "1*2*4*8x#", "1500so'm", "bir umrga beriladi"))
        listDaqiqa.add(MyTemplate("90 daqiqa", "1*2*0*1#", "700so'm", "bir umrga beriladi"))

        listTarif.add(MyTemplate("Zo'r 7", "!1*3#45", "40 000 so'm", "bir oyga"))
        listTarif.add(MyTemplate("Zo'r 6", "!1*3#45", "40 000 so'm", "bir oyga"))
        listTarif.add(MyTemplate("Zo'r 5", "!1*3#45", "40 000 so'm", "bir oyga"))
        listTarif.add(MyTemplate("Zo'r 4", "!1*3#45", "40 000 so'm", "bir oyga"))


        listXizmat.add(MyTemplate("Mening raqamlarim", "*148#", "bepul", "ixtiyoriy"))
        listXizmat.add(MyTemplate("Mening raqamlarim", "*148#", "bepul", "ixtiyoriy"))
        listXizmat.add(MyTemplate("Mening raqamlarim", "*148#", "bepul", "ixtiyoriy"))
        listXizmat.add(MyTemplate("Mening raqamlarim", "*148#", "bepul", "ixtiyoriy"))

        listInternet.add(MyTemplate("paket 500 MB", "*111*5*5#", "5 000 so'm", "Majburiy"))
        listInternet.add(MyTemplate("paket 500 MB", "*111*5*5#", "5 000 so'm", "Majburiy"))
        listInternet.add(MyTemplate("paket 500 MB", "*111*5*5#", "5 000 so'm", "Majburiy"))
        listInternet.add(MyTemplate("paket 500 MB", "*111*5*5#", "5 000 so'm", "Majburiy"))


        listSms.add(MyTemplate("SMS cheksiz", "*7#", "bepul", "majbursiz"))
        listSms.add(MyTemplate("SMS cheksiz", "*7#", "bepul", "majbursiz"))
        listSms.add(MyTemplate("SMS cheksiz", "*7#", "bepul", "majbursiz"))
        listSms.add(MyTemplate("SMS cheksiz", "*7#", "bepul", "majbursiz"))
    }
}