fun main(){
   greeting("Susan Mary Nakimuli")
    funFact("about technology")
}
fun greeting(name:String){
    println("Hello $name")
    var x = modulus(20,6)
    println(x)
    var total = add(3,4,7,9)
    println(total)

}
fun modulus(num1:Int,num2:Int): Int{
    var remainder = (num1%num2)
    return remainder

}
fun add(a:Int,b:Int,c:Int,d:Int):Int{
    var sum = a+b+c+d
    return sum
}
fun funFact (interesting:String){
    println("Am passionate $interesting")
}