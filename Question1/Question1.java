class qestion1{
    
        public void reverseNumber(int x){
            int reverse = 0;  
            while(x != 0)   
                {  
                int remainder = x % 10;  
                    reverse = reverse * 10 + remainder;  
                    x = x/10;  
                }  
                System.out.println("The reverse of the given number is: " + reverse);
            } 
}
class main{
        public static void main(String[] args) {
            qestion1 ref = new qestion1();
            ref.reverseNumber(123);
        }
}
