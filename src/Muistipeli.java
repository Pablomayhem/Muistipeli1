import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;



public class Muistipeli {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] arvotutNumerot = new int[7]; 
        int[] kayttajanNumerot = new int[7];


        System.out.println("Muista seuraavat numerot:");
        
        for (int i=0 ; i<7 ; i++)
        {
            arvotutNumerot[i] = random.nextInt(5) + 1;
            System.out.println(arvotutNumerot[i] + " ");
        }

        Thread.sleep(3000);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Syötä näkemäsi numerot yksitellen:");

        for (int i=0 ; i<7; i++)
        {
            System.out.print("Syötä numero " + (i + 1) + ": ");
            kayttajanNumerot[i] = scanner.nextInt();
        }

        if(Arrays.equals(arvotutNumerot, kayttajanNumerot))
        {
            System.out.println("Loistavaa, muistit oikein.");
        } else {
            System.out.println("Valitettavasti jotain meni väärin. Oikeat numerot olivat: " + Arrays.toString(arvotutNumerot));
            System.out.println("Syöttämäsi numerot olivat: " + Arrays.toString(kayttajanNumerot));
        }

        scanner.close();
    }
}
