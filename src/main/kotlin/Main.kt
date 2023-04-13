fun main() {

    var userName = "alex"
    println( "hello $userName")
   userName = "john"
    println(userName)
     var age = 22
    println( "your age is $age")
//bite ,long, short and int
    val age2 = 22
    val maxIntegerValue = Int.MAX_VALUE
    val minIntegerValue = Int.MIN_VALUE
    println("Int minimum value is $minIntegerValue")
    println("Int maximum value is $maxIntegerValue")

// char
    val myCharValue = 'D'
//    chars can be used in a situation where you want to maybe see the last key pressed by the user.
    println(myCharValue)
    val myBooleanValue = "false"
    println("mycharValue = $myCharValue and myBooleanValue = $myBooleanValue")

//    operations
    var x = 5
    val i = 3
    val result = x + i
    var result2= x - i
    var results3 = x / i
    var results4 = x * i
    var results5 = x % i

    println(result)
    println(result2)
    println(results3)
    println(results4)
    println(results5)

//   an operand is an object which is affected by an operation.
// Eg: 4 + 5 then 4 and 5 are operands

 var  a = 10
 var b = 30

 println("a + b = ${a + b}")
 println("a - b = ${a - b}")
 println("a * b = ${a * b}")
 println("a / b = ${a / b}")
 println("a % b =  ${a % b}")

// assignment operators

 var sum = a + b

 sum = sum +2
 println("sum = $sum")
// the above can also be equal to
 sum += 2
 println("sum = $sum")

// logical and operators
 var student = true
 var score = 80

//         && this returs true if both operations are true

 if (student && score == 80){
  println("you are eligeable")
 }else{
  println("you are not eligeable")
 }

//   || logically or  returns true if one condition is true

 val num1 = 5
 val num2 = 9
 if (num1 > 0 || num2 > 9){
 println("the condition is true")
 }else{
 println("the condition is not true")
 }

// When expression(this executes the  statement if the left statement is true
// -> this means that execute the code on the right
 val alarm = 12

 when(alarm){
  12 -> println("the time is $alarm")
  7 -> println("the time is $alarm")
  14 -> println("the time is $alarm")
  else -> println("the time is $alarm")

 }



}
// ==  checks to see if two operatorand are the same
// = this assign the left side to the right side






