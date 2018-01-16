import java.util.Scanner;
public class Purata_3Markah {
public static void main(String[]args){
    
    double purata;

Scanner input = new Scanner (System.in);
System.out.print("Masukkan Markah Bahasa Melayu : ");
int BM = input.nextInt();

System.out.print("Masukkan Markah Bahasa Inggeris : ");
int BI = input.nextInt();

System.out.print("Masukkan Markah Sejarah : ");
int SEJ = input.nextInt();

purata =(BM+BI+SEJ)/3;

if (purata>89){
    System.out.println("Gred adalah A");
    
}else if (purata>79){
    System.out.println("Gred adalah A-");
    
}else if(purata>69){
    System.out.println("Gred adalah B+");
    
}else if(purata>59){
    System.out.println("Gred adalah B");
    
}else if(purata>49){
    System.out.println("Gred adalah B-");
    
}else if(purata>39){
    System.out.println("Gred adalah C");
    
}else if(purata>29){
    System.out.println("Gred adalah D");
    
}else if(purata>19){
    System.out.println("Gred adalah E");
    
}else {
    System.out.println("Gred adalah F");
}
}   
}