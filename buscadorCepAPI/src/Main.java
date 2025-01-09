import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Hello World!");

        System.out.println("-------------------------------------");
        System.out.println("Bem vindo ao menu de Busca de CEP");
        System.out.println("Poderia me informar o seu CEP?");
        var cep = leitura.nextLine();
        System.out.println(cep);


        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);

//            Gerar um arquivo escrito com o CEP em modelo json:
//            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
//            geradorDeArquivo.gerarJson(novoEndereco);

                              // | IOException
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação!");
        }

    }
}