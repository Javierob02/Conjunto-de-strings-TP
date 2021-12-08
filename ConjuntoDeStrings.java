package com.company;
import java.util.*;

public class ConjuntoDeStrings {
    String[] data;

    public ConjuntoDeStrings (String...args) {
        if (args[0] == null) {
            this.data = new String[0];
        } else {
            String result = "";
            for (String element:args) {
                if (result.contains(element)) {
                    //pass
                } else {
                    result = result + " " + element;
                }
            }
            result = result.substring(1);
            this.data = result.split("\\s+");
        }
    }

    public int cardinal() {
        if (this.data.length == 0 || (this.data.length == 1 && this.data[0] == "")) {
            return 0;
        } else {
            return this.data.length;
        }
    }

    public boolean estáVacío() {
        if (this.data.length == 0 || (this.data.length == 1 && this.data[0] == "")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean añade(String text) {
        boolean result = true;
        boolean found = false;
        for (String element:this.data) {
            if (element == text) {
                found = true;
                break;
            }
        }
        if (found == false) {
            result = true;
            String[] new_list = new String[(this.data.length)+1];
            for (int i = 0; i < this.data.length; i++) {
                new_list[i] = this.data[i];
            }
            new_list[(new_list.length)-1] = text;
            this.data = new_list;
        } else {
            result = false;
        }
        return result;
    }

    public boolean pertenece(String text) {
        boolean found = false;
        for (String element:this.data) {
            if (element.equals(text)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public ConjuntoDeStrings unión(ConjuntoDeStrings other) {
        ConjuntoDeStrings o = (ConjuntoDeStrings) other;
        String[] new_list = new String[(this.data.length)+(o.data.length)];
        int index_this = 0;
        int index_o = 0;
        for (int i = 0; i < ((this.data.length)+(o.data.length)); i++) {
            if (i < (this.data.length)) {
                new_list[i] = this.data[index_this];
                index_this++;
            } else {
                new_list[i] = o.data[index_o];
                index_o++;
            }
        }
        ConjuntoDeStrings result = new ConjuntoDeStrings(new_list);
        return result;
    }

    public ConjuntoDeStrings intersección(ConjuntoDeStrings other) {
        ConjuntoDeStrings o = (ConjuntoDeStrings) other;
        int count = 0;
        for (String element:o.data) {
            if (this.pertenece(element)) {
                count++;
            }
        }
        int index_new_list = 0;
        String[] new_list = new String[count];
        for (int i = 0; i < new_list.length; i++) {
            if (this.pertenece(o.data[i])) {
                new_list[index_new_list] = o.data[i];
                index_new_list++;
            }
        }
        ConjuntoDeStrings resultado = new ConjuntoDeStrings(new_list);
        return resultado;
    }

    public ConjuntoDeStrings diferencia(ConjuntoDeStrings other) {
        ConjuntoDeStrings o = (ConjuntoDeStrings) other;
        int count = 0;
        for (String element:o.data) {
            if (this.pertenece(element)) {
                //pass
            } else {
                count++;
            }
        }
        for (String element:this.data) {
            if (o.pertenece(element)) {
                //pass
            } else {
                count++;
            }
        }
        int index_new_list = 0;
        String[] new_list = new String[count];
        for (String element:this.data) {
            if (o.pertenece(element)) {
                //pass
            } else {
                new_list[index_new_list] = element;
                index_new_list++;
            }
        }
        for (String element:o.data) {
            if (this.pertenece(element)) {
                //pass
            } else {
                new_list[index_new_list] = element;
                index_new_list++;
            }
        }
        ConjuntoDeStrings resultado = new ConjuntoDeStrings(new_list);
        return resultado;
    }

    public boolean equals(Object other) {
        ConjuntoDeStrings o = (ConjuntoDeStrings) other;
        boolean result = true;
        if (this.data.length == o.data.length) {
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i].equals(o.data[i])) {
                    //result = true
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public boolean contenido(ConjuntoDeStrings other) {
            ConjuntoDeStrings o = (ConjuntoDeStrings) other;
            int count = 0;
            for(String element:o.data) {
                for(String other_element:this.data) {
                    if (element.equals(other_element)) {
                        count++;
                    }
                }
            }
            if (count == o.data.length) {
                return true;
            } else {
                return false;
            }
        }

    public String[] elementos() { //String[] | String
        return this.data; // this.data | Arrays.toString(this.data)
    }
}