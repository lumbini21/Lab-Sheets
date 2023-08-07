object matching{
    def main(args: Array[String]): Unit = {
        print("Enter the number : ")
        var n = scala.io.StdIn.readInt()
        printNo(n)
    }

    def printNo(n:Int): Unit = {
        var no:String = n match{
            case x if x <= 0 => "Negative/Zero is input"
            case x if x%2==0 => "Even numver is given"
            case x if x%2!=0 => "Odd number is given"
        }
        println(no)
    }
}              