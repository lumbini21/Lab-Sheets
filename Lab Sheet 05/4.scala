<<<<<<< HEAD
import scala.io.StdIn

def isOdd(n:Int):Boolean = n match{
    case 0 => false
    case _ => isEven(n-1)
}

def isEven(n:Int):Boolean = !(isOdd(n))

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    if(isEven(n)){
        print("Even number")
    }else{
        print("Odd number")
    }
=======
import scala.io.StdIn

def isOdd(n:Int):Boolean = n match{
    case 0 => false
    case _ => isEven(n-1)
}

def isEven(n:Int):Boolean = !(isOdd(n))

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    if(isEven(n)){
        print("Even number")
    }else{
        print("Odd number")
    }
>>>>>>> 4fe65b4f090b24c0c52494e9d05ca31f679435d9
}