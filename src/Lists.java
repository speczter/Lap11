/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Tuan An
 */
public class Lists<T> {
    private T[] list;

    public Lists(T[] list){
        this.list = list;
    }
    public T[] getList() {
        return list;
    }

    public void sortListIncrease() {
        Arrays.sort(list);
    }

    @Override
    public String toString() {
        return "Lists{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
