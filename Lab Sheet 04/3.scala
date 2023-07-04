object cases{
    def main (args: Array[String]):Unit = {
        println(formatNames("Benny", toUpper))
        println(formatIndex("Niroshan", 0))
        println(formatNames("Saman", toLower))
        println(formatIndex("Kumara", 5))
    }

    def toUpper(str:String):String = {
        str.toUpperCase()
    }

    def toLower(str:String):String = {
        str.toLowerCase()
    }

    def formatNames(name:String, operation: String => String):String = {
        operation(name)
    }

    def formatIndex(name:String, i:Int):String = {
        if (i<0 || i > name.length()){
            return "Invalid index"
        }else{
            return name.updated(i, if(name(i).isLower) name(i).toUpper else name(i))
        }
    }
}