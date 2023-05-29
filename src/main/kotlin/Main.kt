package ru.netology
fun formatTimeAgo(seconds: Long): String {
    return when {
        seconds in 0..60 -> "только что"
        seconds in 61..(60 * 60) -> "${seconds / 60} минут назад"
        seconds in (60 * 60 + 1)..(24 * 60 * 60) -> "${seconds / 3600} часов назад"
        seconds in (24 * 60 * 60 + 1)..(2 * 24 * 60 * 60) -> "вчера"
        seconds in (2 * 24 * 60 * 60 + 1)..(3 * 24 * 60 * 60) -> "позавчера"
        else -> "давно"
    }
}

fun main() {
    val time_input =130  //передать время
    val seconds = 12345L

    val timeAgo = formatTimeAgo(seconds = time_input.toLong())
    println(timeAgo)
}
