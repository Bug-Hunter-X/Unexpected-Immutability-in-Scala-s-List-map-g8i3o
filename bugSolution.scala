```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct way to get a modified list
  val doubledList = list.map(x => x * 2)
  println(list)  // Prints List(1, 2, 3, 4, 5)
  println(doubledList) // Prints List(2, 4, 6, 8, 10)
}
```