package principal;

import java.util.Date;

import entities.Funcao;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		// criando um objeto da classe Funcionario
		Funcionario funcionario = new Funcionario(1, "Ricardo Pajuaba", "123.456.789-00", "12345", 2000.0, new Date());
		//criando um objeto da classe Funcao
		Funcao funcao = new Funcao(1, "PROG", "Programador JAVA");
		
		//associando o funcionario com a função
		funcionario.setFuncao(funcao);
		
		//imprimindo os dados de pessoa..
		System.out.println("\nDADOS DE FUNCIONARIO:\n");
		
		System.out.println("ID..............: " + funcionario.getId());
		System.out.println("NOME............: " + funcionario.getNome());
		System.out.println("CPF.............: " + funcionario.getCpf());
		System.out.println("MATRICULA.......: " + funcionario.getMatricula());
		System.out.println("SALARIO.........: " + funcionario.getSalario());
		System.out.println("ADMISSÃO........: " + funcionario.getDataAdmissao());
		
		System.out.println("ID DA FUNÇÃO....: " + funcionario.getFuncao().getId());
		System.out.println("SIGLA...........: " + funcionario.getFuncao().getSigla());
		System.out.println("DESCRIÇÃO.......: " + funcionario.getFuncao().getDescricao());
		
	}
}


