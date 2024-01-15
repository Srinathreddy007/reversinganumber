public class Main {
    public static void main(String[] args)
    {
       int n =1998;
        System.out.println(reverseNumber(n));

    }
    public static int reverseNumber(int n) { //1998 1998%10 =199  8991
        String val = String.valueOf(n);
        int valSize= val.length();
        if(n == 0) {
            return 0;
        }
        int newVal = (int) (((n%10)*Math.pow(10,--valSize))+reverseNumber(n/10));
        return newVal;
    }
}