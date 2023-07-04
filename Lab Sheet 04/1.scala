object interest {
  def main(args: Array[String]): Unit = {
    print("Enter the deposit amount : ")
    var deposit = scala.io.StdIn.readLine().toDouble
    printf("Interest for the year : %.2f" , interest(deposit))
  }

  def interest(deposit: Double): Double = {
    var interest:Double = 0
    if (deposit < 20000){
      interest = deposit * 0.02
    }else if(deposit < 200000){
      interest = deposit * 0.04
    }else if(deposit < 2000000){
      interest = deposit * 0.035
    }else{
      interest = deposit * 0.065
    }
    return interest
  }
}

