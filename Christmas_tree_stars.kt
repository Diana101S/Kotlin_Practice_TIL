fun main() {
    var n = 10
    for(line in 1..n){
        for(space in 1..(n-line))
            print(" ")
        for(star in 1 until 2*line)
            print("*")
        println()
    }
}
