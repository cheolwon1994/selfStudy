package com.example.startingkotlin

var a=3
var b= 15

fun main(){
    val hello1 : String = "Hello world"    //final
    val hello3 = "hello"        //이런 방식으로 사용해도 string으로 받아들임
    var hello2 : String   = "Hello world"   //int, string, 등등
    var hello4 : String? //?을 넣으면 null 사용가능, ?가 없으면 null 사용 불가
    hello()
    println(hello1)
    println(hello3)
    println(hello10())
    hello2 = "123"
    println(maxOf(a,b))
}

fun maxOf(a: Int, b: Int) = if(a>b) a else b
fun hello(){        //void 함수

}
fun hello10() : String{ //Java의 private String hello10(){ }이랑 같은 의미
    return "Hi fun"
}