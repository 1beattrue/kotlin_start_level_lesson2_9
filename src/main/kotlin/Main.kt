fun main() {
    // циклы

    // цикл while ничем не отличается от java

    // цикл for в котлине по сути представлен только вариацией for each
    val array = arrayOf(1, 2, 3)
    for (i in array) {
        println(i)
    }

    // как проинициализировать массив числами от 0 до 100?
    val array1 = arrayOfNulls<Int?>(101)
    for (i in 0..100) { // или же for (i in 0 until array1.size)
        array1[i] = i
    }

    // вверх по массиву
    for (i in array1) {
        println(i)
    }

    // вниз по массиву с шагом 2
    for (i in array1.size - 1 downTo 0 step 2) {
        println(array1[i])
    }

    // задание: создать массив чисел от 0 до 100
    val arrayInt = arrayOfNulls<Int?>(101)
    for (i in 0..100) {
        arrayInt[i] = i
    }

    // проход по массиву с использованием индекса переменной и самой переменной
    for ((index, i) in arrayInt.withIndex()) {
        arrayInt[index] = i?.times(2) // безопасный метод увеличения переменной типа Int? в 2 раза
    }
    for (i in arrayInt) {
        println(i)
    }

    // домашнее задание
    val arrayHW = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) {
        arrayHW[index] = i
    }
    for (i in arrayHW.size - 1 downTo 0) {
        if ((arrayHW[i]?.rem(5) ?: 1) == 0) // null-safety % 5
            println(arrayHW[i])
    }

    // альтернативное решение
    for (i in arrayHW.size - 1 downTo 0 step 5)
        println(arrayHW[i])
}