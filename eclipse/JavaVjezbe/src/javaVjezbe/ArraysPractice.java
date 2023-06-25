package javaVjezbe;

public class ArraysPractice {
	public static void main(String[] args) {
		
		boolean[][] tf= {{true,false,true},{false,true,true}};
		for (int i=0; i<= tf.length; i++) {
			for (int j=0; j<=tf.length; j++) {
				System.out.print((tf[i][j]) ? "t " : "f ");
			}
			System.out.println();
		}
	}
}
