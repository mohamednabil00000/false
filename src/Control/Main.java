package Control;

import java.util.Scanner;

import Features.Compare;
import Features.GetValue;
import Features.Tautology;
import Features.TruthTable;

public class Main {

	// And...........&
	// Or............+
	// not...........!
	// xor...........#
	// Iff...........=
	// implicant.....>
	// Nand..........|
	// Nor...........-
	// O((variable-1)*2^variable)<10^8
	// 26 variables maximum

	// priority of operations
	// 1- not
	// 2-and & nand
	// 3-Or & xor & nor
	// 4- implicant
	// 5- biconditional
	public static void main(String[] args) throws Throwable {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("If you want to create Truth Table press 1");
			System.out.println("If you want to check tautology press 2");
			System.out
					.println("If you want to compare between two expression press 3");
			System.out
					.println("If you want to get the value of expression press 4");
			System.out.println("If you want to exit press 0");
			try {
				int k = in.nextInt();
				in.nextLine();
				try {
					if (k == 1) {
						System.out.println("Enter the Expression :");
						String exp = in.nextLine();
						TruthTable tabl = new TruthTable(exp);
					} else if (k == 2) {
						System.out.println("Enter the Expression :");
						String exp = in.nextLine();
						Tautology tau = new Tautology(exp);

					} else if (k == 3) {
						System.out.println("Enter the First Expression :");
						String exp1 = in.nextLine();
						System.out.println("Enter the Second Expression :");
						String exp2 = in.nextLine();
						Compare comp = new Compare(exp1, exp2);

					} else if (k == 4) {
						System.out.println("Enter the First Expression :");
						String exp1 = in.nextLine();
						GetValue val = new GetValue(exp1);

					}
				} catch (Exception e) {
					System.out.println("Error !");
					// e.printStackTrace();

				}
			} catch (Exception e) {
				System.out.println("Error !");
				in.nextLine();

			}
		}

	}
}
