package com.example.stone.kotlindemo

/**
 * Created by stone on 2017/6/21.
 */
class JavaCode {
    fun toJSON(collection:Collection<Int>):String{
        val sb = StringBuilder();
        sb.append("[");
        val iterator = collection.iterator();
        while(iterator.hasNext()) {
            val element = iterator.next();
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(",")
            }
        }
        sb.append("]")
        return sb.toString()
    }

    fun sum(a:Int,b:Int):Int{
        return  a + b
    }

    fun sum1(a:Int,b:Int)=a+b

    fun printSum(a:Int,b:Int):Unit{
        print("sum of $a and $b is ${a + b}")
    }

    fun printSum1(a:Int,b:Int) {
        print("sum of $a and $b is ${a + b}")
    }

    fun prints2() {
        a = 2;
        var s2 = "${s1.replace("is","was")},but now is $a"
    }

    var a  = 1
    var b = 2

    var c = 1
    var s1 = "c is $c"

    fun maxOf(a:Int,b:Int):Int{
        if (a > b) {
            return a
        }else {
            return b
        }
    }

    fun maxOf1(a:Int,b:Int) = if (a>b)a else b

    fun parseInt(str:String):Int ?{
        return null;
    }

    fun getStringLength(obj:Any):Int?{
        if (obj is String){
            return obj.length
        }
        return null
    }

    fun getStringLength1(obj:Any):Int?{
        if (obj !is String) return null
        return obj.length
    }

    fun forPring() {
        val items = listOf<String>("apple","banana","kiwi")
        for(item in items) {
            print(item)
        }
    }
    fun forPring1() {
        val items = listOf<String>("apple","banana","kiwi")
        for(index in items.indices) {
            print("item at $index is ${items[index]}")
        }
    }

    fun func1() {
        val items = listOf("apple","banana","orange","kiwi")
        for(item in items) {
            print(item)
        }
        when {
            "orange" in items -> print("juicy")
            "apple" in items -> println("apple is fine too")
        }
    }

    fun main(args:Array<String>){
        val fruits = listOf("banana","avocado","apple","kiwi")
        fruits.filter {
            it.startsWith('a')
        }.sortedBy {
            it
        }.map {
            it.toUpperCase()
        }.forEach{println(it)}

        val x = 10
        val y = 9
        if (x in 1..y+1) {
            println("fits in range")
        }

        val list = listOf<String>("a","b","c")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range too")
        }

        for(x in 1..5) {
            println(x)
        }

        for(x in 1..10 step 2) {
            print(x)
        }

        for(x in 9 downTo 0 step 3) {
            println(x)
        }
    }
}




