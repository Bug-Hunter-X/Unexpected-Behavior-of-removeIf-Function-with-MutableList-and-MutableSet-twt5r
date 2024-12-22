fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val newList = list.filter { it <=2 }
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 2]

    //Alternative solution using toMutableList for set
    val set2 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val newListFromSet = set2.toMutableList().filter {it <=2}
    println(set2) // Output: [1, 2, 3, 4, 5]
    println(newListFromSet) // Output: [1,2]
}