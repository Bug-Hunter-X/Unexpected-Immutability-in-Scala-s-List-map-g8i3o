# Scala Immutability Gotcha
This example demonstrates a common error for programmers new to Scala: the immutability of collections.  The `map` function creates a *new* list; it does not modify the original list in place.

The `bug.scala` file shows the problematic code.  The `bugSolution.scala` file offers a corrected version.

This is a crucial concept in functional programming and understanding it is essential for writing correct and efficient Scala code.