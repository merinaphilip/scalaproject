object Calculator {
  def add(a: Double, b: Double): Double = a + b
  def subtract(a: Double, b: Double): Double = a - b
  def multiply(a: Double, b: Double): Double = a * b
  def divide(a: Double, b: Double): Double = {
    if (b != 0) a / b
    else throw new IllegalArgumentException("Division by zero is not allowed")
  }

  def main(args: Array[String]): Unit = {
    println("Simple Calculator")

    val num1 = 10.0
    val num2 = 5.0

    println(s"$num1 + $num2 = ${add(num1, num2)}")
    println(s"$num1 - $num2 = ${subtract(num1, num2)}")
    println(s"$num1 * $num2 = ${multiply(num1, num2)}")
    
    try {
      println(s"$num1 / $num2 = ${divide(num1, num2)}")
    } catch {
      case e: IllegalArgumentException => println(e.getMessage)
    }
  }
}
