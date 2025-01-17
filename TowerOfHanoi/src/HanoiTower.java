import java.util.Scanner;


public class HanoiTower {
	private static int countRecursiveCalls=0;
	private static int numberOfMovesMade=0;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of disks: ");
		int diskNumber = input.nextInt();
		numberOfMovesMade=(int) (Math.pow(2, diskNumber)-1);
		System.out.println("The moves are: ");
		moveDisk(diskNumber, 'A', 'B', 'C');
		System.out.println("\nNumber of recursive calls: " + countRecursiveCalls);
		System.out.println("Number of Moves Made: " + numberOfMovesMade);
		input.close();
	}

	private static void moveDisk(int diskNumber, char fromTower, char toTower, char auxTower) {
		if(diskNumber==1){
			System.out.println("Move Disk " + diskNumber + " from " + fromTower + " to " + toTower);
		}else{
			countRecursiveCalls++;
			moveDisk(diskNumber-1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + diskNumber + " from " + fromTower + " to " + toTower);
			countRecursiveCalls++;
			moveDisk(diskNumber-1, auxTower, toTower, fromTower);
		}
		
	}

}
