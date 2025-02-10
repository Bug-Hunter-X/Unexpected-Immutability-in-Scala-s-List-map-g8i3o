```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // This will throw an exception because map produces a new list
  // and doesn't modify the original list in place.
  list.map(x => x * 2) 
  println(list) // Still prints List(1, 2, 3, 4, 5)
}
```