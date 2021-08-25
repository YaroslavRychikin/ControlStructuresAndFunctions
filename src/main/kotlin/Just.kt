fun main() {
    val time = 7200
    print(agoToText(time))
}

fun agoToText(time: Int) = when(time){
    in 0..60 -> "был(а) только что"
    in 61..(60 * 60) -> "был(а) ${endOfTheWordMinutes(time)} "
    in (60 * 60 + 1)..(24 * 60 * 60) -> "был(а) в сети ${endOfTheWordHour(time)}"
    in (24 * 60 * 60 + 1)..(2 * 24 * 60 * 60) -> "был(а) в сети сегодня"
    in (2 * 24 * 60 * 60 + 1)..(3 * 24 * 60 * 60) -> "был(а) в сети вчера"
    else -> "был(а) в сети давно"
}

fun endOfTheWordMinutes(time: Int) = when(time / 60 % 10){
    1 -> if (time / 60 % 100 != 11) "${time / 60} минуту назад" else "${time / 60} минут назад"
    2, 3, 4 -> when(time / 60 % 100) {
        12, 13, 14 -> "${time / 60} минут назад"
        else -> "${time / 60} минуты назад"
    }
    else -> "${time / 60} минут назад"
}

fun endOfTheWordHour(time: Int) = when(time / (60 * 60) % 10){
    1 -> if (time / (60 * 60) % 100 != 11) "${time / (60 * 60)} час назад" else "${time / (60 * 60)} часов назад"
    2, 3, 4 -> when(time / (60 * 60) % 100) {
        12, 13, 14 -> "${time / (60 * 60)} часов назад"
        else -> "${time / (60 * 60)} часа назад"
    }
    else -> "${time/(60 * 60)} часов назад"
}