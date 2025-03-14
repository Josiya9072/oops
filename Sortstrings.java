import java.util.Arrays;
public class Sortstrings
{
public static void main(String[] args)
{
String[] strings ={"banana","apple","orange","kiwi","mango"};
Arrays.sort(strings);
System.out.println("sorted array is:");
for(String str : strings)
{
System.out.println(str);
}
}
}


