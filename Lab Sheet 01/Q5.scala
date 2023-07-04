object Time {

  def main(args: Array[String]): Unit = {
    var a = easy(2)
    var b = tempo(3)
    println("Total time = " + (a+b+a));
  }

  def easy(d:Int):Int = d*8

  def tempo(d:Int):Int = d*7


}