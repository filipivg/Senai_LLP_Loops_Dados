import java.util.Scanner;

public class dados {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int quantidadeDados = 1;
        String quantidade;

        System.out.print("Digite a quantidade de dados a serem lançados (ou pressione Enter para 1 dado): ");
        quantidade = leia.nextLine();

        if (!quantidade.isEmpty()) {
            try {
                quantidadeDados = Integer.parseInt(quantidade);
                if (quantidadeDados < 1) {
                    System.out.println("Quantidade inválida. Usando 1 dado por padrão.");
                    quantidadeDados = 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Usando 1 dado por padrão.");
                quantidadeDados = 1;
            }
        }

        for (int i = 1; i <= quantidadeDados; i++) {
            int resultado = (int)(Math.random() * 6) + 1;
            System.out.println("\nDado " + i + " sorteado: " + resultado);
            faceDado(resultado);
        }

        leia.close();
    }

    public static void faceDado(int numero) {
        String[] faces = new String[7];

        faces[1] =  """
                    -----
                    |   |
                    | o |
                    |   |
                    -----
                    """;

        faces[2] =  """
                    -----
                    |o  |
                    |   |
                    |  o|
                    -----
                    """;

        faces[3] =  """
                    -----
                    |o  |
                    | o |
                    |  o|
                    -----
                    """;

        faces[4] =  """
                    -----
                    |o o|
                    |   |
                    |o o|
                    -----
                    """;

        faces[5] =  """
                    -----
                    |o o|
                    | o |
                    |o o|
                    -----
                    """;

        faces[6] =  """
                    -----
                    |o o|
                    |o o|
                    |o o|
                    -----
                    """;

        System.out.println(faces[numero]);
    }
}
