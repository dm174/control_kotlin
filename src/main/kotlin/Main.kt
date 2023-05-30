package ru.netology
fun formatTimeAgo(seconds: Long): String {
    return when {
        seconds in 0..60 -> "только что"
        seconds in 61..(60 * 60) -> {
            val minutes = (seconds / 60).toInt()
            val minutesEnding = if (minutes % 10 == 1 && minutes % 100 != 11) "минуту" else "минуты"
            "$minutes $minutesEnding назад"
        }
        seconds in (60 * 60 + 1)..(24 * 60 * 60) -> {
            val hours = (seconds / 3600).toInt()
            val hoursEnding = if (hours % 10 == 1 && hours % 100 != 11) "час" else "часа"
            "$hours $hoursEnding назад"
        }
        seconds in (24 * 60 * 60 + 1)..(2 * 24 * 60 * 60) -> "вчера"
        seconds in (2 * 24 * 60 * 60 + 1)..(3 * 24 * 60 * 60) -> "позавчера"
        else -> "давно"
    }
}

fun main() {
    val time_input =61  //передать время
    val seconds = 12345L

    val timeAgo = formatTimeAgo(seconds = time_input.toLong())
    println(timeAgo)
}
