package tools;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TransCoder
        {
                public static void main(String[] args) {
                        Map<Character, String> decode = new Map<String,>() {
                                @Override
                                public int size() {
                                        return 0;
                                }

                                @Override
                                public boolean isEmpty() {
                                        return false;
                                }

                                @Override
                                public boolean containsKey(Object key) {
                                        return false;
                                }

                                @Override
                                public boolean containsValue(Object value) {
                                        return false;
                                }

                                @Override
                                public String get(Object key) {
                                        return null;
                                }

                                @Override
                                public String put(Character key, String value) {
                                        return null;
                                }

                                @Override
                                public String remove(Object key) {
                                        return null;
                                }

                                @Override
                                public void putAll(Map<? extends Character, ? extends String> m) {

                                }

                                @Override
                                public void clear() {

                                }

                                @Override
                                public Set<Character> keySet() {
                                        return null;
                                }

                                @Override
                                public Collection<String> values() {
                                        return null;
                                }

                                @Override
                                public Set<Entry<Character, String>> entrySet() {
                                        return null;
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
        }


