import scala.math.min
import scala.io.Source

    object arrays {
        
        def arraySize(a: Array[Int]): Int = {
             a.length
   }
        def getIntsAsString(label: String, delimiter: String, a: Array[Int]): String = {
          val intstringfromarray = a.mkString(delimiter)
          label + intstringfromarray
   }
        def readFileIntoArray(filename: String, a: Array[Int]) {
             var fileneededtoberead = Source.fromFile(filename)
             var i = 0
                         for (line <- fileneededtoberead.getLines) {
             if (i < a.length)
                a(i) = line.toInt
                i = i + 1
    }
   }
        def minimum(a: Array[Int]): Int = {
           require(a.length > 0)
            val min = a.min
            return min
   }
    def countEven(a: Array[Int]): Int = {
            var i = 0
            for (x <- a) { if (x % 2 == 0) { i = i + 1 } }
                i
   }
        def countOdd(a: Array[Int]): Int = {
            var i = 0
            for (x <- a) { if (x % 2 == 1) { i = i + 1 } }
               i
   }
        def pairwiseAdd(a: Array[Int], b: Array[Int], c: Array[Int])= {
        for (n <- 0 until (min(a.length, b.length)))
            c(n) = (a(n) + b(n))
            c
    }
 
        def newPairwiseAdd(a: Array[Int], b: Array[Int]): Array[Int] = {
      
     val addSize = min(a.length, b.length)
     val newArray = Array.fill(addSize)(0)

     for ( i <- 0 to (addSize - 1) ) {
       newArray(i) = (a(i) + b(i))
    }  
      
      
     newArray
   
   }
        def isAscending(a: Array[Int]): Boolean = {
    
    var isitincreasing = true
    for (i <- 0 to (a.length-2)) {
      if (a(i) > a(i+1))
        isitincreasing = false
    }  
    isitincreasing
   }
        def getAscendingRun(a: Array[Int], position: Int): Int = {
     require(position < a.length)

    
    -1 // replace with your code, which should return Int
   }
    def getRunsAsString(a: Array[Int]): String = {
     ""
   }
    }