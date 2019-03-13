public class ReverseMyString{
    public void reverseString(char[] s) {
        char tmp = 'a'; 
        int i=0, j=s.length-1; 
        if (j == -1) {
            System.out.println("empty string \n"); 
            return; 
        }
        while (i<j) {
            tmp = s[i]; 
            s[i] = s[j]; 
            s[j] = tmp;
            i++; 
            j--; 
        }
        for(int index=0; index<s.length; index++){
            System.out.print(s[index]+" "); 
        }
    }

     public static void main(String []args){
        char[] myString = {'h', 'e', 'l', 'l', 'o'}; 
        ReverseMyString reverseMyString = new ReverseMyString(); 
        reverseMyString.reverseString(myString); 
     }
}
