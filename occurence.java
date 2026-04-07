class occurence{
    public static void main(String[] args)
    String s="swiss";
    for(int i=0; i<s.length();i++){
        char ch=s.charAt(i);
        int count=0;
        for(int j=0;j<s.length();j++){
            if(ch==s.charAt(j))
            {
                count++;
            }
        else{
            System.out.println(s.charAt(i));
            System.out.println(count);
            count=1;
            

        }
            }
        }
    }
