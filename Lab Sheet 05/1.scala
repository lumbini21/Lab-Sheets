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

object main extends App{
    print("Enter an integer greater than 1 : ")
    val n = scala.io.StdIn.readInt()
    if(isPrime(n)){
        print("Prime number")
    }else{
        print("Not a prime number")
    }
}