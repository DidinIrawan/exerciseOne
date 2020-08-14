package com.example.exerciseone

class Area(var coordinateX:Int, var coordinateY:Int){

}
class Antena(area: Area){
    var location:Area= area
    val coverageArea= setOf<Area>()
}