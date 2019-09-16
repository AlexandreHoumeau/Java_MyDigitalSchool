package fr.mds.exo;

public class Launcher {
	public static void main(String[] args) {

		starLine(10);
		System.out.println("\n");
		System.out.println("carre plein :");
		carre_plein(10);
		System.out.println("\n");
		System.out.println("carre vide :");
		carre_vide(10);
		System.out.println("\n");
		System.out.println("triangle :");
		triangle(10);

	}

	private static void starLine(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("* ");
		}

	}

	private static void carre_plein(int n) {
		for (int i = 0; i < n; i++) {
			starLine(n);
			System.out.print("\n");
		}

	}

	// FIRST ATTEMPT
	private static void carre_vide(int n) {
		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				for (int k = 0; k < n; k++) {
					System.out.print("* ");

				}

			}

			else {

				for (int j = 0; j <= n; j++) {
					if (j == 0 || j == n) {
						System.out.print("*");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println("");
		}

	}

	// TRIANGLE
	private static void triangle(int n) {
		for (int i = 0; i < n; i++) {
			starLine(i);
			System.out.println("");
		}
	}
}