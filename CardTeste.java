package br.com.deb.vm_bioma;
import br.com.deb.vm_bioma.Model;
import java.util.Scanner;

public class CardTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model model = new Model();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o título:");
		model.setTitulo(scanner.nextLine());
		
		System.out.println("Insira o subtítulo:");
		model.setSubtitulo(scanner.nextLine());
		
		System.out.println("Insira a descrição:");
		model.setDescricao(scanner.nextLine());
		
		System.out.println("Insira o tipo:");
		model.setTipo(scanner.nextLine());
		
		System.out.println("Insira classificação:");
		model.setClassificacao(scanner.nextLine());
		
		System.out.println("Insira o nome da imagem/extensão:");
		model.setImagem(scanner.nextLine());
		
		System.out.println(model);
		scanner.close();
	}

}

//System.out.print( "Insira nome do Funcionario: " );
//funcionario = input.nextLine();