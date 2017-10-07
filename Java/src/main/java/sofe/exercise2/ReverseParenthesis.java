package sofe.exercise2;

public class ReverseParenthesis {

    public static String reverseParenthesis(String text) {

        if (!text.contains("(")) {
            return text;
        }


        int abierto = 0;
        int cerrado = 0;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                abierto = i;
            }
            if (text.charAt(i) == ')') {
                cerrado = i;
                break;
            }
        }



        System.out.println(abierto);
        System.out.println(cerrado);

        String newText = text.substring(abierto+1,cerrado);
        StringBuilder reversado = new StringBuilder(newText);
        reversado = reversado.reverse();
        String viejo = text.substring(abierto,cerrado+1);
        text = text.replace(viejo,reversado.toString());

        return reverseParenthesis(text);
    }




}
