<<<<<<< HEAD
import scala.io.StdIn

def isOdd(n:Int):Boolean = n match{
    case 0 => false
    case _ => isEven(n-1)
}

def isEven(n:Int):Boolean = !(isOdd(n))

def sumEven(n:Int):Int = n match{
    case 0 => 0
    case _ => if(isEven(n)) n + sumEven(n-1) else sumEven(n-1)  
}

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    print(sumEven(n))
=======
import scala.io.StdIn

def isOdd(n:Int):Boolean = n match{
    case 0 => false
    case _ => isEven(n-1)
}

def isEven(n:Int):Boolean = !(isOdd(n))

def sumEven(n:Int):Int = n match{
    case 0 => 0
    case _ => if(isEven(n)) n + sumEven(n-1) else sumEven(n-1)  
}

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    print(sumEven(n))
>>>>>>> 4fe65b4f090b24c0c52494e9d05ca31f679435d9
}