object Cost {

  def main(args: Array[String]): Unit = {
    println("Total cost = " + cost(60));
  }

  def cost(c:Int) : Float = {
    val CoverP = 24.95f
    val Discount = 0.4f
    val sp1 = 3f
    val sp2 = 0.75f

    var cost = if(c<=50){
      (CoverP*(1-Discount)*c)+(sp1*c)
    }
    else{
      (CoverP*(1-Discount)*c)+(sp1*50)+(sp2*(c-50))
    }

    return cost

  }
}