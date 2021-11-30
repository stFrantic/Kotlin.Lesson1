fun fibonacci(number: Int = 20): IntArray {
    val arr =
        IntArray(number + 1) // array length is number+1 is because number[0] is not included in number amount
    arr[0] = 0
    arr[1] = 1
    for (i in 2 until number + 1) {
        arr[i] = arr[i - 2] + arr[i - 1]
    }
    return arr
}
//fibonacci sequence with recurse
//fun fibonacci(number: Int = 0): Int { //this function will return only number in fibonacci sequence
//    if (number == 0) return 0
//    else if (number == 1) return 1
//    else return fibonacci(number - 1) + fibonacci(number - 2)
//}
