class IncrementOperation {
	public static void main(String[] args){
		int i = 34;
		System.out.println("Content of i " +i);
		int j = 75;
		System.out.println("Content of j " +j);
		int inc = i-- + --j + --i + j--;
		System.out.println("Content of inc" +inc);
		System.out.println();
		System.out.println("Content of i " +i);
		System.out.println("Content of j " +j);

	}
}