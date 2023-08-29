package com.example.sampleprojct

class Sample {
    val language =  "abc"
    val number:Int = 1

    var abc ="abcxyz"
    var xyz:String = "rabcd"




    fun main(args:Array<String>){

        for(i in 1..5){
            println(i)
        }

        var language = arrayOf("ruby","python","kotlin")

        for(item in language){
            println(item)
        }
        val marks = arrayOf(80,50,40)
        val marks1 = arrayOf<Int>(80,50,40)
        val marks2:IntArray = intArrayOf(80,50,40)
        marks.get(0)

        for(index in 0..marks.size-1){
            println(marks.get(index))
        }

        for(item in marks){
            println(item)
        }

        fun sum(){
            var num1 = 12
            var num2 = 11
            println("sum = " + (num1 + num2))
        }

        var string:String? = "hello"

        val name = firstname?:"unknown"
    }



//    val result =  if(number>0 ){
//
//    }
//    else{
//
//    }
}

class OuterClass(val name:String){

    init{
        val language:String;
    }


}

open class OuterClass{

    init{
        val language:String;
    }


}

class Derived:OuterClass{

}

class Sample{
    
}