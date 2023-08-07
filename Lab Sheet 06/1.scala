object Q
{
    def main(args: Array[String]): Unit = {
        print("Enter to Encrypt : ")
        val str1=scala.io.StdIn.readLine()
        print("Enter to Decrypt : ")
        val str2=scala.io.StdIn.readLine()
        print("Shift key: ")
        val shift= scala.io.StdIn.readInt()
        val s1=Cipher(str1,shift,Encryption)
        println(s1)


        val s2=Cipher(str2,shift,Decryption)
        println(s2)
    }

    def Encryption(str : String , shift: Int) : String = {
        val res=new StringBuilder()

        for(i<-0 until str.length){
            val char=str(i)
        
            if(char>='a' && char<='z')
            {
                val shifted= ((char+shift-'a')%26 + 'a')
                res.append(shifted.toChar)
            }
            else if(char>='A' && char<='Z')
            {
                val shifted= ((char+shift-'A')%26 + 'A')
                res.append(shifted.toChar)
            }
            else{
                res.append(char)
            }
            
        }
        res.toString()
    }

    def Decryption(str : String , shift : Int) : String = {
        val res=new StringBuilder()

        for(i<-0 until str.length){
            val char=str(i)

             if(char>='a' && char<='z')
             {
               val shifted= ((char-shift-'a'+26) %26 )+'a'
                        res.append(shifted.toChar)
             }
             else if(char>='A' && char<='Z')
            {
                val shifted= ((char-shift-'A'+26)%26)+'A'
                 res.append(shifted.toChar)
             }
            else{
                res.append(char)
            }
            
        }
        res.toString()
    }
    

    def Cipher(str : String , shift: Int , Operation:(String,Int)=>String): String={
        Operation(str,shift)
    }

}