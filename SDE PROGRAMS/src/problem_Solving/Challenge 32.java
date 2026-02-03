import java.util.*;
public class Solution{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    StringBuilder result = new StringBuilder();
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(result.length()>0 && result.charAt(result.length()-1) == ch){
        result.deleteCharAt(result.length()-1);
      }
      else{
        result.append(ch);
      }
    }
    if(result.length()==0){
      System.out.println("Empty String");
    }
    else{
      System.out.println(result.toString());
    }
  }
}
