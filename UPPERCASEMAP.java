import java.util.*;
class UPPERCASEMAP
{
    public static void main(String[] args)
    {
        List<String>list=Arrays.asList("gowtham","puji","raviteja");
        list.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);
    }
}