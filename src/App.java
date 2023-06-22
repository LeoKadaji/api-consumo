import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("****MENU TABELA FIPE****");
        System.out.println("o codigo deve conter 7 digitos\n");
        System.out.println("Digite o codigo: ");
        String codigo = sc.next();
        ConsumoApi consumoApi = new ConsumoApi();
        String resposta = consumoApi.buscaVeiculosCodigo(codigo);
        System.out.println("busca consulta: ");
        System.out.println(resposta);

        sc.close();


    }
}
