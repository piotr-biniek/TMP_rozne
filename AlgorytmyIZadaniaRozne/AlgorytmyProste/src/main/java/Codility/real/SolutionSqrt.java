package Codility.real;


public class SolutionSqrt {
    public int solution(int A, int B) {
        
        int mainCounter=0;
        int []array=new int[B-A+1];
        
        for (int i = A; i <= B; i++) {
            int tmpCounter= getSqrt(i, 0);
          
            if(mainCounter<tmpCounter) mainCounter=tmpCounter;
            
            
        }
            
    return mainCounter;    
    }
        
    
    public int getSqrt(int number, int counter){
        int tmpSqrt = (int)Math.sqrt(number);
        if((tmpSqrt*tmpSqrt)==number) {
                      
            counter= getSqrt(tmpSqrt, ++counter);
         
    }
        return counter;
        
    }
    
    /*
    *zadanie też można by rozwiązać w oparciu o liczby piewsze (ich tablicę), podnoszac do kwadtatu je i sprawdzając czy jesteśmy w zakresie,
    *nie wiem czy nie było by szybciej
    *
    */
}