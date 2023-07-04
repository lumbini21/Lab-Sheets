object Q4{
    def main(args: Array[String]):Unit = {
        println("Best price for ticket : "+highestProfit())
    }

    def highestProfit():Int = {
        var profit = 0
        var check = 0
        var bestPrice = 0
        var ticket = 15
        for(i <- 1 to 7){
            check = income(i) - cost(i*20)
            if(check>profit){
                profit = check
                bestPrice = ticket+i*5
            }
        }

        for(i <- 1 to 4){
            check = income(-i) - cost(-i*20)
            if(check>profit){
                profit = check
                bestPrice = ticket-i*5
            }
        }

        return bestPrice
    }

    def cost(x:Int):Int = 500 + (3*(120-x))
    def income(x:Int):Int = (120-(x*20))*(15+(x*5))
}