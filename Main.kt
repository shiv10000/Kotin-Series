fun main(){
    val tile :TILES  = TILES.yellow("red", 3)



    // The `when` block should be exhaustive
    val points: Int = when(tile) {
        is TILES.red -> tile.points * 3
        is TILES.yellow -> tile.points * 3
        else -> 0
    }

    println(points)  // This will print the computed points
}

// Correctly defined sealed class TILES
sealed class TILES {
    class red(var colour: String, var points: Int) : TILES()
    class yellow(var colour: String, var points: Int) : TILES()
}
