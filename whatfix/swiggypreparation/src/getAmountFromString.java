public class getAmountFromString {
    public static void main(String[] args){
        String str = "Cost for two: 300";
        String extract = str.replaceAll("[^0-9]","");
        int num = Integer.parseInt(extract) + 50, reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.print(reversed);
    }
}
