class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int param){
        int sumDivParam = 0;

        for(int i=1; i <= param; i++){
            if(param%i == 0){
                sumDivParam += i;
            }
        }

        return sumDivParam;
    }
}