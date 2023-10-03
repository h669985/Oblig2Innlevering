package lab6.matriser;

import static javax.swing.JOptionPane.showMessageDialog;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		StringBuilder utskrift = new StringBuilder();
        for (int[] rad : matrise) {
            for (int element : rad) {
                utskrift.append(element);
				utskrift.append(" ");
            }
			utskrift.append("\n");
        }
		showMessageDialog(null, utskrift);
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String utskrift = "";
		for (int[] rad : matrise) {
			for (int element : rad) {
				utskrift += element + " ";
			}
			utskrift += "\n";
		}
		return utskrift;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int [][] skalertMatrise = new int [matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j <matrise[i].length; j++) {
				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return skalertMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean svar = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					svar = false;
					break;
				}
			}
		}
		return svar;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int [][] speiletMatrise = new int [matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
					speiletMatrise[i][j] += matrise[j][i];
			}
		}
		return speiletMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int [][] c = new int [a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
}
