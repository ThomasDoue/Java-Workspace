
public class Fizzbuzz {

    public static void main(String args[]){
    	
    	int i;
    	int x=9;
    	
        for (i = 1; i <= 100; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("FizzBuzz" + " ");
            } else if(i==x) {
                System.out.print(i % 3 == 0 ? "fizz \n": x +"\n");
                x+= 10;
            } else if(i% 5 == 0){
                System.out.print("Buzz" + " ");
            }else if ( i%3==0) {
            } else {
                System.out.print(i+ " ");
            }
        }
    }

}


