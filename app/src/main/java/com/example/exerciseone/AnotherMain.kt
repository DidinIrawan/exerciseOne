package com.example.exerciseone

import android.icu.util.DateInterval

// map = menambahkan setiap element yang ada
// filter menerima false dan true
// e= numbers mod 2== 1
// Thread punya name and id=1 / name=main thread
// running auto gpm
// Thread adalah asyncronouse
// coroutin adalah penyempurna lagi dari thread
fun main(){
    println("Start")
//    val customThread=CustomThread()
//    customThread.start()
//    for(i in 1..100){
//        Thread.sleep(1000) //Thread utama/parent
//        println("${Thread.currentThread().name} $i")
//    }

    for (i in 1..3){
        val customThread=CustomThread((i*1000).toLong())
        customThread.start()
    }
    println("Stop")
}

class CustomThread(var interval: Long): Thread(){
    override fun run() {
        for (i in 1..20){
            sleep(2000) // Thread child dengan menunggu 2 detik
            println("${Thread.currentThread().name} $i")
        }
    }
}