package edu.babcock.kotlinbasics

fun main() {
    //immutable variable
    val x = 1
    var myByte: Byte = 13
    var myFloat: Float = 2.5F
    //mutable variable
    var name = "Jayden"
    //TODO: Add new functionality
    println("Hello $name")
    println(x + 3)
    println(myByte)
    print(myFloat)
    println()

    //Data types
    /* *INTEGER_TYPES
    * Byte = 13 (8 bits)
    * Short = 125 (16 bits)
    * Int = 123123123 (32 bits)
    * Long = 12_039_812_309_487_120_394 (64 bits)
    *
    * *FLOATING_POINT
    * Float = 13.37F
    * Double = 3.1415926535897932846
    *
    * * Strings*/

    val myStr = "Hello Walter"
    var firstChar = myStr[0]
    var lastChar = myStr[myStr.length - 1]

    println()
    println("The pharse is $myStr")
    println("The first character is " + firstChar + " and the last character is " + lastChar)
    println()

    //BASICS_EXERCISE
    var topic: String = "Android Masterclasss"
    myFloat = 13.37F
    val pi: Double = 3.141592655358979
    myByte = 25
    var year: Short = 2020
    var myLong: Long = 18881234567
    var myBool: Boolean = true
    var myChar: Char = 'a'

    print("$topic\n$pi\n$myByte\n$year\n$myLong\n$myBool\n$myChar")
    println()
    //STRING_INTERPOLATION
    //Replacing string concatenation (+) with $ in between quotations
    //String template expression

    println()
    println("This is an example of a string template expression ${myStr.length}")
    println("This is an example of a string template expression ${myStr.length - 1}")
    println("This is an example of a string template expression $firstChar & $lastChar")
    println()

    //ARITHMETIC_OPERATORS
    //+, -, *, /, %
    var result = 0
    val a = 19
    val b = 3.0
    var resultDouble: Double

    resultDouble = a / b
    println(result)
    println(resultDouble)
    println()

    //COMPARISON_OPEARTORS
    //==, !=, <, >, <=, >=
    val isEqual = 5 == 7
    println("isEqual is $isEqual")

    //RUNNING_CODE_BETWEEN_CURLY_BRACES
    println("is 5 lower or equal to 3 ${5 <= 3}")
    println()

    //ASSIGNMENT_OPERATORS_AND_INCREMENT,DECREMENT_OPERATORS
    //ASSIGNMENT OPERATORS (+=, -=, /=, %=)
    result += 3
    println(result)

    //INCREMENT_AND_DECREMENT_OPERATORS
    result++
    println(result)
    --result
    println(result)
    println("Trying pre and post increment operators")
    println("Post result++ is ${result++} and pre ++result is ${++result}")
    println()

    //IF_STATEMENTS
    var heightPerson1 = 190
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("Use raw force")
    }else if(heightPerson1==heightPerson2){
        println("Use your power technique")
    }else{
        println("Use technique")
    }

    name = "Sarah"
    if(name == "Sarah"){
        println("Welcome Home Sarah")
    }else{
        println("Who are you?")
    }

    if(isEqual)
        println("isEqual is true")
    println()

    //WHEN_EXPRESSIONS
    var season = 3
    when (season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("invalid season")
    }

    var month = 3
    when (month){
        in 3..5 -> println("spring")
        in 6..8 -> println("summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("invalid season")
    }

    var age = 23
    when(age){
        !in 21..200 -> println("You're an adult")
        in 18..20 -> println("You may vote now")
        16, 17 -> println("You may drive now")
        else -> println("You're too young")
    }

    //IS_KEYWORD_WHEN_EXPRESSION
    var k : Any = 13.37f//Any means the object can have any data type
    when(k){
        is Int -> println("$k is an Int")
        !is Double -> println("$k is not a Double")
        is String -> println("$k is a String")
        else -> println("$k is none of the above")
    }
    println()

    //WHILE_LOOP
    while (age<25){
        println(age)
        age++
    }
    println("While loop is done")
    //TEST_EXERCISE
    var loop = 10
    while (loop>=0){
        print("$loop ")
        loop-=2
    }
    println("\n")

    //DO_WHILE_LOOPS
    do {
        loop+=1
        print("$loop ")
    }while (loop<=10)
    println("\n")

    //FOR_LOOPS
    for (num in 1..10){
        print("$num ")
    }
    println("\n")

    for (i in 0 until 11){
        print("$i ")
    }
    println()

    for (i in 10 downTo 0){
        print("$i ")
    }
    println()

    for (i in 20.downTo(0).step(2)){ //or i in 20 downTo step 2
        print("$i ")
    }
    println("\n")

    //LOOP_EXERCISE
    //For loop that loops from 0 to 1000; outputs it's over 9000 at 9001
    age-=25
    while (age<=10000){
        print("$age ")
        age+=1000
        if (age == 8000){
            age+=1001
            print("$age:\"IT'S OVER 9000!!!\" ")
            --age
        }
    }
    println()

    //While loop that checks the humidity
    var humidity = "humid"
    var humidityLevel = 80

    when(humidity){
        "humid" -> {
            humidityLevel-=5
            println("humidity decreased. Humidity level is $humidityLevel")
        }
    }

    humidityLevel-=15
    when(humidityLevel){
        in 1..60 ->{
            humidity = "comfy"
            println("It's $humidity now")
        }
    }
    println()

    //Cleaning exercise code with solution
    //1.
    for (i in 1..10000){
        if (i == 9001){
            println("IT'S OVER 9000!!!")
        }
    }

    //2.
    humidity = "humid"
    humidityLevel = 80
    while (humidity=="humid"){
        humidityLevel-=5
        println("Humidity decreased")
        humidity = "huumid"
        humidityLevel = 59
        if (humidityLevel<60){
            humidity = "comfy"
            println("it's $humidity now")
            humidityLevel++
        }
    }
    println()

    //BREAK_AND_CONTINUE_STATEMENTS
    //BREAK
    for (i in 1 until 20){
        print("$i ")
        if (i/2 == 5){
            break//once executed it leaves the for loop and moves to the next line
        }
    }
    println("Done with the loop")

    //CONTINUE
    for (i in 1 until 20){
        if (i/2 == 5){
            continue//once executed it continues after the condition is met
        }
        print("$i ")
    }
    println("Done with the loop")
    println()

    //calling Functions
    myFunction()
    result = addUp(3,4)
    println("sum is $result")
    avg(5.0,7.0)


    //NULLABLE_TYPES
    ///Tony Blair - 1965 - Produced for his Algo w language development
    ///He created the language and the null reference or null pointer exception
    var fName :String = "Joe"
    name = "Jane"
    //name = null -> COMPILATION ERROR
    var nullableFName : String? = "Valerie"
    //nullableFName = null

    var len = fName.length

    //old way
    if (nullableFName != null){
        var len2 = nullableFName.length
    }else{
        null
    }
    //shorter if/else statement
    nullableFName?.let { println(it.length) }

    //new way - safe call operator(?)
    var len2 = nullableFName?.length
    println(nullableFName?.uppercase())

    //Elvis operator - not null assertion
    //Elvis operator
    val fName2 = nullableFName ?: "Guest"
    println("name is $fName2")

    //Not null assertion operator
    //!! operator that converts nullable type a non null type
    //It throws a null pointer exception if the nullable type holds a null value
    println(nullableFName!!.lowercase())

    //Safe call operator in a chain
    //val wifesAge: String? = user?.wife?.age ?: 0
}

//FUNCTIONS_PARAMETERS_ARGUMENTS_AND_RETURN
//Method is a function within a class
fun myFunction(){
    println("Called from my function")
}

fun addUp(a: Int, b:Int) : Int{
    return a+b
}

fun avg(a: Double, b:Double) : Double{
    println("Average is ${(a+b)/2}")
    return 0.0
}