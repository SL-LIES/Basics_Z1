fun main() {
    print("Введите строку символов: ")
    val inputVal = readln()
    var result = ""
    var countChar = 1

    var previousChar = inputVal[0]

    for (i in 1..< inputVal.length)
    {
        if (inputVal[i]==previousChar)
        {
            countChar++
        }
        else
        {
            result = if (countChar>1) {
                result + previousChar + countChar
            } else {
                result + previousChar
            }
            countChar = 1
            previousChar = inputVal[i]
        }
    }
    result = if (countChar > 1)
    {
        result + previousChar + countChar
    }
    else
    {
        result + previousChar
    }
    println(result)
}