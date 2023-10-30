import java.util.HashMap;

public class Main {
    public static void  main(String args[]) {
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ".", ",", "?", " "};

        String[] morseCode = {"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**",
                "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**",
                "*----", "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----", "*-*-*-",
                "--**--", "**--**", ";"};

        HashMap<Character, String> charToMorse = new HashMap<>();
        HashMap<String, Character> morseToChar = new HashMap<>();
        charToMorse.put('A', morseCode[0]);
        charToMorse.put('B', morseCode[1]);
        charToMorse.put('C', "-*-*");
        charToMorse.put('D', "-**");
        charToMorse.put('E', "*");
        charToMorse.put('F', "**-*");
        charToMorse.put('G', "--*");
        charToMorse.put('H', "****");
        charToMorse.put('I', "**");
        charToMorse.put('J', "*---");
        charToMorse.put('K', "-*-");
        charToMorse.put('L', "*-**");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-*");
        charToMorse.put('O', "---");
        charToMorse.put('P', "*--*");
        charToMorse.put('Q', "--*-");
        charToMorse.put('R', "*-*");
        charToMorse.put('S', "***");
        charToMorse.put('T', "-");
        charToMorse.put('U', "**-");
        charToMorse.put('V', "***-");
        charToMorse.put('W', "*--");
        charToMorse.put('X', "-**-");
        charToMorse.put('Y', "-*--");
        charToMorse.put('Z', "--**");
        charToMorse.put('1', "*----");
        charToMorse.put('2', "**---");
        charToMorse.put('3', "***--");
        charToMorse.put('4', "****-");
        charToMorse.put('5', "*****");
        charToMorse.put('6', "-****");
        charToMorse.put('7', "--***");
        charToMorse.put('8', "---**");
        charToMorse.put('9', "----*");
        charToMorse.put('0', "-----");
        charToMorse.put('.', "*-*-*-");
        charToMorse.put(',', "--**--");
        charToMorse.put('?', "**--**");
        charToMorse.put(' ', ";");

        // Providing values for morseToChar, which is the mirror of charToMorse.
        for (char c : charToMorse.keySet()) {
            morseToChar.put(charToMorse.get(c), c);
        }


        String inputChToMo = "HEJ HEJ";
        String inputMoToCh = "**** * *---";

        for(int i = 0; i < inputChToMo.length(); i++) {
            System.out.print(charToMorse.get(inputChToMo.charAt(i)) + " ");
        }

        System.out.println("\n");
        String[] s = inputMoToCh.split(" ");
        Character mSplit;
        for (String token : s) {
            mSplit = morseToChar.get(token);
            System.out.print(mSplit);
        }
        //for (int j = 0; j < inputMoToCh.length(); j++) {
        //    System.out.println(morseToChar.get(inputMoToCh.charAt(j)));
        //}

        //String s = String.valueOf(charToMorse<"*">);
        //System.out.println(s);
        //String input2 = "*---";
        //System.out.println(charToMorse.get('A'));

        //System.out.print(morseCodeConverter.get('T'));


    }
}
