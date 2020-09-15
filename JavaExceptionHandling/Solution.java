class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int base, int exponent) throws Exception{
        
        if(base == 0 && exponent == 0){
            throw new Exception("n and p should not be zero.");
        }else if(base < 0 || exponent < 0){
            throw new Exception("n or p should not be negative.");
        }

        return (long) Math.pow(base, exponent);
    }
    
}