public class ReverseWords{

public static void main(String []args){
String a="Hey I am Bhavik Upadhyay";
System.out.println("So after the reversing all the words * * * * * * *  :"+ reverseThis(a);
}

static String reverseThis(String b){
StringBuilder sb = new StringBuilder();

String arr[] = b.trim().split("\\s");

for(int i = arr.length-1;i>=0i--){
sb.append(arr[i]);

}
return sb.toString();

}


}
