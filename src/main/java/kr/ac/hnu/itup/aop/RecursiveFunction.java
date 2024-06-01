package kr.ac.hnu.itup.aop;

import org.springframework.stereotype.Component;

@Component
public class RecursiveFunction implements Calculator{
    // test 하는 법 1
//    public static void main(String[] args) {
//        RecursiveFunction recursiveFunction = new RecursiveFunction();
//        long factorial = recursiveFunction.factorial(5);
//        System.out.println(factorial);
//    }

    @Override
    public long factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return factorial(n-1) * n;
    }
}
