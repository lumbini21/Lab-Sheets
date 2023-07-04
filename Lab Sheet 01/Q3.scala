object Volume{
  def main(args: Array[String]): Unit={
    println("Volume of the sphere:"+ calculateVolume(5));
  }

  def calculateVolume(r:Int):Float={
    val pi=3.14f
    4/3*pi*r*r*r

  }
}