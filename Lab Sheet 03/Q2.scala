object Q2 {
  def main(args: Array[String]): Unit = {
    print("input strings separate with space :- ")
    val str = scala.io.StdIn.readLine()
    val myList = str.split(" ").toList
    val filteredList = newList(myList)
    print("Filtered List : ")
    print(filteredList)
  }
  def newList(list:List[String]):List[String] = {
    list.filter(_.length>5)
  }
}