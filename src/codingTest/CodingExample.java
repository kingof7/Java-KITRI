package codingTest;

public final class CodingExample {
    public static int[]table;
    public static void main(String[] args) {
        table = new int[7+1];
        System.out.println(fibo(7));
        System.out.println(memoFibo(7));
        System.out.println(fact(5));
        
        randomQuiz();
    }
    
    //피보나치 
    public static int fibo(int data) {
        if(data <= 1) {
            return 1;
        }
            
        
        return fibo(data-1) + fibo(data-2);
    }
    // fibo(4)+fibo(3) + fibo(3)+1+1+1+1+1+1+1+1+1+1
    
    //피보나치 
    public static int memoFibo(int data) {
        if(data <= 1) {
            table[data] = 1;
            return 1;
        }
        
        if(table[data] > 0) {
            
            return table[data];
        }
            
        table[data] = memoFibo(data-1) + memoFibo(data-2);
        //table[7]=6+5
        //table[6]=5+4 table[5]= 4 + 3
        // table[5]=4+3 + 3+2 talbe[4] = 3+2 +2+1
        // 3+2 + 2+1 + 2+1 + 1+1 + 2+1 + 1+1 1+1 + 1+ 1
        
        return table[data];
    }
    
    //factorial
    public static int fact(int data) {
        if(data <= 1) 
            return 1;
        
        
        return fact(data-1) * data;
    }
    
    //Math.Random();
    public static void randomQuiz() {
        
        for(int i=0; i < 50; i++) {
            
            int randomValue = (int)(Math.random()*10)+1;
            System.out.println(randomValue);
        }
    }
}
