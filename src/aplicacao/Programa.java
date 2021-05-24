package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaComercial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Conta> list = new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
		list.add(new ContaComercial(1002, "Bob", 1000.00, 400.00));
		list.add(new ContaPoupanca(1003, "Maria", 300.00, 0.01));
		list.add(new ContaComercial(1004, "Ana", 500.00, 500.00));
		
		double soma = 0.0;
		for (Conta c : list) {
			soma += c.getSaldo();
		}
		
		System.out.printf("Saldo total: %.2f%n", soma);

		for (Conta c : list) {
			c.deposito(10.0);
		}
		
		for (Conta c : list) {
			System.out.printf("Dados atualizados da conta %d: %.2f%n",c.getNumero(), c.getSaldo());
		}
		
		
		sc.close();
	}

}
