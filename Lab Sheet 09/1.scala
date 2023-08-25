class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")

    val numer: Int = n
    val denom: Int = d

    def neg: Rational = new Rational(-numer, denom)

    override def toString: String = numer + "/" + denom
}

object Q01 extends App{
    val a = Rational(3, 4)
    
    println(a)
    println(a.neg)
}