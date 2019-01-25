package HW2;

public class ShortestWord {
    public static int count (String args){
        int i = 0;
        for (String new1 : args.split(" ")) {
            i++;
        }
        return i;
    }
}
