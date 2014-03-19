package scalatest1

object PrintPascalNumbers {
  def generatePascalNumber(row:Int, col:Int) : Int = {
    var val1 = 0
    var val2 = 0
  
	if (row==0 || col ==0 || row == col+1) {     
	      return  1
	} else {
	  val1 = generatePascalNumber(row-1, col-1)
	  val2 = generatePascalNumber(row-1, col)
	  return  val1+val2
	}
    
  	}
  
  
  def main(args: Array[String]): Unit = {
    var input = readLine("prompt> How many rows of pacal numbers do you want to print? ")
    var i=0
    var j=0
    while(!input.forall(_.isDigit)) {
      input = readLine("prompt> Please enter an integer :  ")
    }
    if(input.forall(_.isDigit))
    {
      for( i <- 0 until input.toInt + 1){
	      for(j <- 0 until i)  {
	        print(generatePascalNumber(i, j) + " ")
	      }
      println()
      }
    } 
  
    
    
  }
  
}