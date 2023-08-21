public class FinalValueAfterOperartions {

    public static void main(String[] args) {
        String[] array = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(array));
    }
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for (int i=0;i<operations.length;i++){
            if (operations[i].contains("x++")){
                x++;
            }
            else if (operations[i].contains("++x")){
                ++x;
            }
            else if (operations[i].contains("x--")){
                x--;
            }
            else if (operations[i].contains("--x")){
                --x;
            }
        }
            return x;
    }
}
