class mainClassStudent {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String firstName = scan.next();
//		String lastName = scan.next();
//		int id = scan.nextInt();
//		int numScores = scan.nextInt();
//		int[] testScores = new int[numScores];
//		for(int i = 0; i < numScores; i++){
//			testScores[i] = scan.nextInt();
//		}
//		scan.close();
		
		String firstName1 = "Tom";
		String lastName1 = "Brad";
		int id1 = 12345;
		int[] testScores1 = {55,90,80};
		
		String firstName2 = "bob";
		String lastName2 = "Gil";
		int id2 = 12345;
		int[] testScores2 = {100,100};
			
		Student s11 = new Student(firstName1, lastName1, id1, testScores1);
		Student s2 = new Student(firstName2, lastName2, id2, testScores2);
		
		int[] outputScore1 = s11.getTestScores();
		int[] outputScore2 = s2.getTestScores();
		
		System.out.println("outputScore1: " + outputScore1[0] );
		System.out.println("outputScore2: " + outputScore2[0] );
		
		s11.printPerson();
		s2.printPerson();
		
		System.out.println("Grade: " + s11.calculate() );
		System.out.println("Grade: " + s2.calculate() );
	}
}