import java.math.BigInteger

fun main(args : Array<String>){

    print(getfibnum(5, BigInteger("1"),BigInteger("0")))

}

tailrec fun getfibnum(n: Int, a:BigInteger,b:BigInteger) : BigInteger{
    if(n==0)
        return b
    else
        return getfibnum(n-1, a + b, a)

}