package tools;

import org.germain.tool.ManaBox;

import java.util.ArrayList;
import java.util.Map;

public class TransCoder
        {
                private Map<Character,String>encode;
                private Map<String,Character>decode;

                public TransCoder(String cle)
                {
                        String decrypte = ManaBox.decrypt(cle);
                        int taille = decrypte.length();
                        char alpha = 'A';
                        for (int i = 0; i < taille; i++) {
                                char lettre = decrypte.charAt(i);
                                System.out.println("tour "+i);
                                System.out.println(lettre);
                                System.out.println(alpha++);
                                System.out.println("====================");

                        }

                }







        }

            /*public String encode(String msg){
                // méthode qui prend une string codée et qui renvoie
                // une string décodée
            }

            public String decode(String msg){
                // méthode qui prend une string et qui renvoie
                // une string codée
            }*/



        /*char[] data = new char[52];
                        for (int i = 0; i < 26; i++) {
        data[i] = (char)(96 + (i/26)*6 + i);
        System.out.println(data[i]);
        }*/