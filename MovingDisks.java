import java.util.Scanner;
public class MovingDisks {

	public static void moveDisks(int n, int fromPin, int toPin, int intermediatePin) {
		if (n == 1) {
			System.out.println("Move 1 disk from pin "+fromPin+" to pin "+toPin);
		}
		else {
			moveDisks(n-1, fromPin, intermediatePin, toPin);
			moveDisks(1, fromPin, toPin, intermediatePin);
			moveDisks(n-1, intermediatePin, toPin, fromPin);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of disks to move from pin 1 to pin 3: ");
		int num = input.nextInt();
		moveDisks(num, 1, 3, 2);
	}

}
