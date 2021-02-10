public class anagramSum {
    public static void main(String[] args){
        String s1 = "punishment";
        String s2 = "ninethumps";
        int count = 0;
        for(int i=0;i<s1.length();i++){
            count += s1.charAt(i);
            System.out.println(count);
        }
        for(int j=0;j<s2.length();j++){
            count -= s2.charAt(j);
            System.out.println(count);
        }
        if(count==0){
            System.out.println("Anagram Strings");
        } else {
            System.out.println("Not Anagram Strings");
        }
    }
}
