
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static <T extends Comparable> T max(T[] a) {
        if(a == null || a.length == 0) return null;
        T max = a[0];
        for (int i = 1; i< a.length; i++){
            if(max.compareTo(a[i])< 0)
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {

        Boolean[] booleans = new Boolean[] {true,false,false,true};

        Lists<Boolean> listBooleans = new Lists<Boolean>(booleans);

        Character[] characters = new Character[] {'b','a','d','c'};

        Lists<Character> listCharacters = new Lists<Character>(characters);

        Byte[] bytes = new Byte[] {1,2,3};

        Lists<Byte> listBytes = new Lists<Byte>(bytes);

        Short[] shorts = new Short[] {100,142,132,122};

        Lists<Short> listShorts = new Lists<Short>(shorts);

        Integer[] integers = new Integer[] {1000,1200,1400,1300};

        Lists<Integer> listIntegers = new Lists<Integer>(integers);

        Long[] longs = new Long[] {1000000L, 100002L, 100L};

        Lists<Long> listLongs = new Lists<Long>(longs);

        Float[] floats = new Float[] {1.2f,3.1f,2.5f,1.1f};

        Lists<Float> listFloats = new Lists<Float>(floats);

        Double[] doubles = new Double[] {1000.05d,1200.15d,1200.1d,1200.3d};

        Lists<Double> listDoubles = new Lists<Double>(doubles);

        listBooleans.sortListIncrease();

        listBytes.sortListIncrease();

        listCharacters.sortListIncrease();

        listDoubles.sortListIncrease();

        listIntegers.sortListIncrease();

        listLongs.sortListIncrease();

        listShorts.sortListIncrease();

        listFloats.sortListIncrease();

        listDoubles.sortListIncrease();

        System.out.println(listBooleans);
        Boolean maxBoolean =  Main.max(booleans);
        System.out.println("Max = " + maxBoolean);

        System.out.println(listCharacters);
        Character maxCharacter =  Main.max(characters);
        System.out.println("Max = "+ maxCharacter);

        System.out.println(listBytes);
        Byte maxBytes =  Main.max(bytes);
        System.out.println("Max = " + maxBytes);

        System.out.println(listIntegers);
        Integer maxInteger =  Main.max(integers);
        System.out.println("Max = " + maxInteger);

        System.out.println(listShorts);
        Short maxShorts =  Main.max(shorts);
        System.out.println("Max = " + maxShorts);

        System.out.println(listFloats);
        Float maxFloat =  Main.max(floats);
        System.out.println("Max = " + maxFloat);

        System.out.println(listDoubles);
        Double maxDouble =  Main.max(doubles);
        System.out.println("Max = " + maxDouble);

    }
    
}