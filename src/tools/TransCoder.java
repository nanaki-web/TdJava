package tools;

import org.germain.tool.ManaBox;

import java.util.HashMap;
import java.util.Map;



public class TransCoder {
        private Map<Character, String> encode = new HashMap<Character, String>();
        private Map<String, Character> decode = new HashMap<String, Character>();

        public Map<Character, String> getEncode() {
                return encode;
        }

        public Map<String, Character> getDecode() {
                return decode;
        }

       /* public TransCoder(String cle)
        {
                String decrypte = ManaBox.decrypt(cle);
                int taille = decrypte.length();
                //boucles de génération de maps
                char[] code = key.toCharArray();
                for (int i = 0; i < taille; i++) {
                        char lettre = decrypte.charAt(i);
                        System.out.println("tour "+i);
                        System.out.println(lettre);
                        System.out.println(alpha++);
                        System.out.println("====================");

                }*/

        // }


        public TransCoder(String cleCrypter)
        {
                String cle = ManaBox.decrypt(cleCrypter);

                //boucles de génération de maps
                char[] code = cle.toCharArray();//initialise une chaine dans un tableau
                Character first = 'A';
                Character second = 'A';
                for (char lettre : code)
                {
                        //System.out.println(first.toString() + second.toString());
                        this.encode.put(lettre, first.toString() + second.toString());
                        this.decode.put(first.toString() + second.toString(), lettre);
                        if (second != 'Z')
                        {
                                second++;
                        }
                        else
                        {
                                first++;
                                second = 'A';
                        }


                }




        }

       public String encode(String msg){
                // méthode qui prend une string codée et qui renvoie
                // une string décodée
               return msg;
        }

        public String decode(String msg) {
                // méthode qui prend une string et qui renvoie
                // une string codée
                return msg;
        }



}













        /*char[] data = new char[52];
                        for (int i = 0; i < 26; i++) {
        data[i] = (char)(96 + (i/26)*6 + i);
        System.out.println(data[i]);
        }*/