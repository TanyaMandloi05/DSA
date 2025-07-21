public class index{
    public static boolean isPrime(int num){
    boolean isPrime = true;
    if(num == 2){
        return true;
    }
     for(int i=2; i<num; i++){
        if(num % i == 0){
            isPrime = false;
            break;
        }
       
     }
      return isPrime;
    }
     
  public static void main(String args[]){
    System.out.println(isPrime(4));
    }
}