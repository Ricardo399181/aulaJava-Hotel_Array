package aplicacaoArr;

import java.util.Locale;
import java.util.Scanner;

import entidadeArr.Hotel;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Hotel[] hotel = new Hotel[10];

		System.out.print("quantos quertos quer reservar ? ");
        int reserva = sc.nextInt();

		for (int i = 0; i < reserva; i++) {

			System.out.println("RESERVA " + (i + 1) + ":");
            System.out.print("Name : ");
			sc.nextLine();
			
			String nome = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.next();

			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			hotel[quarto] = new Hotel(nome, email);

		}
		System.out.println();
		System.out.println("quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (hotel[i] != null) {
 
				System.out.println(i + ": " + hotel[i]);
			}
		}

		sc.close();

	}

}
