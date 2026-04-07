public class vowels_consonants {
    public static void main(String[] args)
    {
        String s="kavya";
    int vowels=0;
    int consonants=0;
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            vowels++;
        }
        consonants++;
    }
    System.out.println("vowels="+vowels+"  " +"consonants="+consonants);

    }
    
}
