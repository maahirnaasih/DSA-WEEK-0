import java.util.Scanner;
public class primenumber{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number: ");
int number=sc.nextInt();
boolean isPrime=number>=2;
for (int i=2;i<=number/i;i++){
if (number % i == 0){
isPrime=false;
break;
}
}
if(isPrime){
System.out.println("Prime");
}else{
System.out.println("Not prime");
}
sc.close();
}
}