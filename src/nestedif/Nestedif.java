
package nestedif;

import java.util.Scanner;


public class Nestedif {

    public static void main(String[] args) {
        String kertas,jenis;
        int lembar;
        Scanner input = new Scanner(System.in);
        System.out.println("jenis printer apa?? hitam,warna,gambar : ");
        jenis = input.next();
        System.out.println("masukkan jenis kertas : ");
        kertas = input.next();
        System.out.println("berapa lembar yang ingin di print ");
        lembar = input.nextInt();
        if ("hitam".equalsIgnoreCase(jenis))
        {
            if ("a4".equalsIgnoreCase(kertas))
            {
                if (lembar > 0 && lembar <= 50)
                {
                    System.out.println( lembar * 1000 );
                }
                else if (lembar > 0 && lembar > 50)
                {
                    System.out.println(lembar * 750);
                }
            }
            else if ("f4".equalsIgnoreCase(kertas))
            {
                 if (lembar > 0 && lembar <= 50)
                {
                    System.out.println( lembar * 1250 );
                }
                else if (lembar > 0 && lembar > 50)
                {
                    System.out.println(lembar * 1000);
                }
            }
        }
        else if ("warna".equalsIgnoreCase(kertas))
        {
            if ("a4".equalsIgnoreCase(kertas))
            {
                if (lembar > 0 && lembar <= 30)
                {
                    System.out.println( lembar * 1500 );
                }
                else if (lembar > 0 && lembar > 30)
                {
                    System.out.println(lembar * 1100);
                }
            }
            else if ("f4".equalsIgnoreCase(kertas))
            {
                 if (lembar > 0 && lembar <= 30)
                {
                    System.out.println( lembar * 1750 );
                }
                else if (lembar > 0 && lembar > 30)
                {
                    System.out.println(lembar * 1550);
                }
            }
        }
        else if ("gambar".equalsIgnoreCase(kertas))
        {
            if ("a4".equalsIgnoreCase(kertas))
            {
                if (lembar > 0 && lembar <= 20)
                {
                    System.out.println( lembar * 2000 );
                }
                else if (lembar > 0 && lembar > 20)
                {
                    System.out.println(lembar * 1700);
                }
            }
            else if ("f4".equalsIgnoreCase(kertas))
            {
                 if (lembar > 0 && lembar <= 20)
                {
                    System.out.println( lembar * 2250 );
                }
                else if (lembar > 0 && lembar > 20)
                {
                    System.out.println(lembar * 2100);
                }
            }
        }
        else 
        {
            System.out.println("Maaf Inputan Anda Salah");
        }
    }
}
