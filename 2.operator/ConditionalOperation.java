class RelationalOperation{
	 public static void main(String[] args) {
		int i = 10;
		System.out.println("Content of i" +i);
		int j = 5;
		System.out.println("Content of j"+j);
		boolean c = i > j;
		System.out.println("Is " +i+ " > " +j+ " : " +c );
		boolean d = i < j;
		System.out.println("Is " +i+ " < " +j+ " : " +d );

		//Conditional statement
		int r = c ? (i + j) : (i - j);
	    System.out.println("Content of r is : " +r);
	   // char e = c  ? 'J' : "Java";  //will throw error           // when we use indirect utilisation statement 1 and statement 2 should be of same type
	      //System.out.println(e);                      


	       // for direct utilisation  type compatibility does not matter
            System.out.println(c ? 'J' : "Java");

	}
}