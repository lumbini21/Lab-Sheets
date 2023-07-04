object Q1{
  def main(args: Array[String]):Unit = {
      //var i, j, m, n, k, f, g, c
      //variable types should be defined when declaring
      var k , i , j = 2 // cannot declare as k = i = j = 2
      var m , n = 5
      var f = 12.0f
      var g = 4.0f
      var c = 'X'

      println("k+12*m = "+(k+12*m))
      println("m/j = "+(m/j))
      println("n%j = "+(n%j))
      println("m/j*j = "+(m/j*j))
      println("f+10*5+g = "+(f+10*5)+g)
      println("(i+1) * n = "+((i+1) * n)) 
      // ++ is not an operator in scala
  }
}