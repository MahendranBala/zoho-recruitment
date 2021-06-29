import java.util.Scanner;

public class ZohoRecruitment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int length = input.length();
		int mid = length / 2;

		int whiteSpace = length - 1;
		for (int i = 0; i < length; i++) {
			for (int k = 0; k < whiteSpace; k++) {
				System.out.print(" ");
			}
			whiteSpace--;
			
			for (int j = mid; j <= mid + i; j++) {
				int pos = j;
				if (pos >= length) {
					pos = pos - length;
				}
				System.out.print(input.charAt(pos));
			}
			System.out.println();
		}

	}
}
