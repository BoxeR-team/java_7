package homeWork1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleCace {
    public void circleTest() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("i - " + i);
            sum += i;
        }
        System.out.println("sum = " + sum);

        sum = 0;
        int count = 0;
        while (count <= 10) {
            sum += count;
            count++;
        }
      //  System.out.println("count = " + sum);
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  try {
      //      System.out.println("Please, enter first text");
        String text;
        //    while ((text = bufferedReader.readLine()) != null && !text.equals("exit")) {


               // System.out.println("text " + text);

           int sum1 = 0;
                while (true) {
                    try {
                        if (!((text = bufferedReader.readLine()) != null && !text.equals("exit")));
                    }
                    }
                    ;
                }
                if(text.equals("exit")) {
                    System.out.println(sum1);

                }
                  int y = Integer.parseInt(text);
                sum1 = sum1 +y;

           // for (int i = 0; i <=12; i++) {
           //     sum1 = i;

                System.out.println(sum1);
            }
            // ((sum1 = bufferedReader.readLine()) != null && !sum1.equals(12))

        }
    }
}