public class NumberOfEmployeesWhoMetTarget {
    public static void main(String[] args) {

        int[] hours = {1,4,3,5,6,7};
        System.out.println(numberOfEmployeesWhoMetTarget(hours,5));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int qualifiers = 0;
        for(int i=0; i < hours.length; i++  ){
            if (hours[i] >= target)
            {
                qualifiers = qualifiers + 1;
            }
        }
        return qualifiers;
    }
}
