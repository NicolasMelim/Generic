package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();
    public void addValue(T value){
        list.add(value);
    }
    public T firstNum(){
        if (list.isEmpty()){
            throw new IllegalArgumentException("Lista vazia");
        }
        return list.get(0);
    }
    public void print(){
        System.out.println("[");
        if(!list.isEmpty()){
            System.out.println(list.get(0));
        }
        for( int n = 1; n < list.size(); n++){
            System.out.println(", " + list.get(n));
        }
        System.out.println("]");
    }
}
