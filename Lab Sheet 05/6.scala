<<<<<<< HEAD
import scala.io.StdIn

def fibonacci(n:Int):Int = n match{
    case 0 => 0
    case 1 => 1
    case x => fibonacci(x-1) + fibonacci(x-2)
}

def fibonacciSeq(n:Int):Unit = {
    if(n>=0){
        fibonacciSeq(n-1)
        printf("%d ", fibonacci(n))
    }
}

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    fibonacciSeq(n)
=======
import scala.io.StdIn

def fibonacci(n:Int):Int = n match{
    case 0 => 0
    case 1 => 1
    case x => fibonacci(x-1) + fibonacci(x-2)
}

def fibonacciSeq(n:Int):Unit = {
    if(n>=0){
        fibonacciSeq(n-1)
        print("%d ", fibonacci(n))
    }
}

object main extends App{
    print("Enter an integer : ")
    val n = scala.io.StdIn.readInt()
    fibonacciSeq(n)
>>>>>>> 4fe65b4f090b24c0c52494e9d05ca31f679435d9
}