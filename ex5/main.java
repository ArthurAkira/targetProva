package ex5;

public class main {
    public static void main(String[] args) {
        String reverso = "";
        char ch;
        String palavra = "teste";
        for (int i = 0; i < palavra.length(); i++) {
            ch = palavra.charAt(i);
            reverso = ch + reverso;
        }
        System.out.println(reverso);
    }
}
