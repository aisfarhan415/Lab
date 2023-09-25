fun main(args: Array<String>) {
    val openHours = 20
    val now = 20
//    val office: String
    val office = if (now > openHours) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}