<<<<<<< HEAD
import scala.io.StdIn

def gcd(a:Int, b:Int):Int = b match{
    case 0 => a
    case b if b>a => gcd(b, a)
    case _ => gcd(b, a%b)
}

def isPrime(n:Int, a:Int=2):Boolean = a match{
    case x if(x==n) => true
    case x if(gcd(n,x)>1) => false
    case x => isPrime(n,x+1)
}

def primeSeq(n:Int):Unit = {
    if(n>1){
        primeSeq(n-1)
        if(isPrime(n)){
            printf("%d ", n)
        }
    }
}

object main extends App{
    print("Enter an integer greater than 1 : ")
    val n = scala.io.StdIn.readInt()
    primeSeq(n)
    
=======
import scala.io.StdIn

def gcd(a:Int, b:Int):Int = b match{
    case 0 => a
    case b if b>a => gcd(b, a)
    case _ => gcd(b, a%b)
}

def isPrime(n:Int, a:Int=2):Boolean = a match{
    case x if(x==n) => true
    case x if(gcd(n,x)>1) => false
    case x => isPrime(n,x+1)
}

def primeSeq(n:Int):Unit = {
    if(n>1){
        primeSeq(n-1)
        if(isPrime(n)){
            print("%d ", n)
        }
    }
}

object main extends App{
    print("Enter an integer greater than 1 : ")
    val n = scala.io.StdIn.readInt()
    primeSeq(n)
    
>>>>>>> 4fe65b4f090b24c0c52494e9d05ca31f679435d9
}