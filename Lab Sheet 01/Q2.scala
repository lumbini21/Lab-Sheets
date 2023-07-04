object Temp{
  def main (args:Array[String]): Unit = {
    println("Temperature in fahrenheit : " + tempF(35))
  }

  def tempF(temp:Int): Float = {
    val n1 = 1.80f
    val n2 = 32.00f
    (temp * n1) + n2

  }
}

