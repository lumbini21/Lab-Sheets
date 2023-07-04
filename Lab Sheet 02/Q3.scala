object Q3{
    def main(args: Array[String]):Unit = {
        println("Take home salary of an employee = "+calcSalary(40,30))
    }

    def calcSalary(hrs:Int, OThrs:Int):Double = income(hrs, OThrs) - tax(income(hrs, OThrs))

    def workingHrs(hrs:Int):Int = hrs*250
    def OT(Othrs:Int):Int = Othrs*85
    def income(hrs:Int, OThrs:Int):Int = workingHrs(hrs) + OT(OThrs)
    def tax(income:Int):Double = income * 0.12
} 