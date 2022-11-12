package soloworld.scalar.intermediate.problemsolving;

public class ArmstrongNumber {

    private  void findArmStrongNumber(int num) {

        for(int i=1;i<=num;i++) {
            int sum = calculate(i);

            if(sum == i ) {
                System.out.println(i);
            }

        }

    }

    public   int calculate(int num) {
        int sum =0 ;
        while(num !=0) {
            int current = num % 10;
            sum +=  Math.pow(current,3);
            num /=10;
        }
        return sum;
    }
}

