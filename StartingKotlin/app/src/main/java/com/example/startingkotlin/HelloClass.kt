package com.example.startingkotlin

fun main(){
    //유사 기능들(함수)의 집합체(객체)
    //1.class - 자동차(시동, 운전 ...), 사람, 동물, 식물 등등
    //2.data class - set, get

    //1. 코딩
    //2. 호출
    var cls = HelloClass()                //기본 생성자 호출
    var cls2 = HelloClass(10)        //보조생성자 호출
    println(cls2.age)
    var person = Person(27,"Cheol won")
    println(person.age)
    println(person.name)
}

class HelloClass{
    var age: Int=0
    //초기값 설정
    init{

    }
    //def 생성자, 보조 생성자
    constructor()                //생성자 : 값을 넘기면서 초기화 불가능
    constructor(age: Int) {      //보조 생성자 : 값을 넘기면서 초기화 가능 (Setting)
        this.age = age
    }
}

data class Person(var age: Int, val name: String)
