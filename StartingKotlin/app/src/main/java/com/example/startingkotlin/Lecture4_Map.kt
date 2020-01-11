package com.example.startingkotlin

fun main(){
    //map - (key, value) => pair ex. JSON
    //{"name","CCW"}의 형태를 지님

    var map1 = mapOf(Pair("name","CCW"))            //수정 불가
    var map2 = mutableMapOf<String, String>()     //type, 수정 가능
    map2.put("name","CCW")
    map2.put("age","27")

    //keys
    println(map2.keys)

    for(map in map2){
        println(map.key)
    }
}