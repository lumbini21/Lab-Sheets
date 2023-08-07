<<<<<<< HEAD
import scala.io.StdIn

def addition(n:Int):Int = n match{
    case 0 => 0
    case _ => n + addition(n-1)
}

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    print(addition(n))
=======
import scala.io.StdIn

def addition(n:Int):Int = n match{
    case 0 => 0
    case _ => n + addition(n-1)
}

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    print(addition(n))
>>>>>>> 4fe65b4f090b24c0c52494e9d05ca31f679435d9
}