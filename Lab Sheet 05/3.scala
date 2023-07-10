import scala.io.StdIn

def addition(n:Int):Int = n match{
    case 0 => 0
    case _ => n + addition(n-1)
}

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    print(addition(n))
}