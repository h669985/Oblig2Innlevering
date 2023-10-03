package lab5.tabeller;

import static javax.swing.JOptionPane.*;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		// Bygger en streng pga jeg bruker showMessageDialog istedenfor System.out
		// Som blir lignende tilStreng() metoden, men der bruker jeg += istedenfor pga junittesten klager ellers
		StringBuilder utskrift = new StringBuilder();
		for (int i = 0; i < tabell.length; i++) {
			utskrift.append("Tall ").append(i).append(": ").append(tabell[i]).append("\n");
		}
		showMessageDialog(null, utskrift);
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String utskrift = "[";
		for (int i = 0; i < tabell.length; i++) {
			utskrift += tabell[i];
			if (i != tabell.length - 1) {
				utskrift += ",";
			}
		}
		utskrift += "]";
		return utskrift;
	}

	// c)
	public static int summerA(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
	public static int summerB(int[] tabell) {
		int i = 0;
		int sum = 0;
		int tabellengde = tabell.length;

		while ( i < tabellengde) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	public static int summerC(int[] tabell) {
		int sum = 0;
        for (int j : tabell) {
            sum += j;
        }
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean resultat = false;

        for (int j : tabell) {
            if (j == tall) {
                resultat = true;
                break;
            }
        }
		return resultat;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = - 1;

		for (int i = 0; i < tabell.length; i++ ) {
			if (tabell[i] == tall) {
				posisjon = i;
				break;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] revTabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			revTabell[i] = tabell[tabell.length - 1 - i];
		}

		return revTabell;
	}


	// g)
	public static boolean erSortert(int[] tabell) {
		boolean svar = true;

		for (int i = 0; i < tabell.length; i++) {
			if (i+1 == tabell.length) {
				break;
			}

			if(!(tabell[i+1] >= tabell[i])) {
				svar = false;
				break;
			}
		}
		return svar;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] combined = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			combined[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			combined[tabell1.length + i] = tabell2[i];
		}

		return combined;
	}

}
