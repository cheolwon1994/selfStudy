package com.example.startingkotlin

fun main(){
    //1. 배열
    //2. loop 반복
    //3. 캐스팅(간단하게)

    //1. 배열 = {"","",""}
    var arr1 = listOf("1","2")               //리스트 수정불가 Java에서는 ArrayList <= 넣고 빼고 "수정"가능했음
    var arr2 = mutableListOf("1","2")       //리스트 수정가능
    arr2.add("3")

    //2. 반복문 (향상된 반복문)
    for(item in arr1){
        println(item)
    }
    for((index,item) in arr2.withIndex()){
        println("$index, $item")
        //arr2.removeAt(0)        //for문을 도는 중에 지우는 것이므로, 범위 밖의 arr를 탐색하게 되어 error 발생
    }

    //3. Casting. Java에서는 object <String, int, long .... // 코틀린에서는 Any
    var hello: Any = "hello"
    if(hello is Int){
        var a: Int = hello
        println(a)
    }
    else if(hello is String){
        var str : String = hello
        println(str)
    }
}