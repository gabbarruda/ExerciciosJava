public class Atv02 {
}
    public static void main(String[] args) {

        int senha = 2002;
    int num = sc.nextInt();

		while (senha != num) {

        System.out.println("Senha Invalida");

        num = sc.nextInt();

    }

		System.out.println("Acesso Permitido");

		sc.close();
    }