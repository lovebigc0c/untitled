fun main() {

    for (i in 100..999) {
        var one = i / 100
        var three = i % 10
        var two = i / 10
        two = two % 10
        if (one != two && two != three && three != one) {
            println(i)
        }
    }
}



