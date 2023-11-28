package org.example.problems;

public class AddTwoLargeNumbers {

    public static void executeAddTwoLargeNumbers() {
        System.out.println(" AddTwoLargeNumbers ");


        // String s1= "8944394323791464"; String s1="14472334024676221";
        // String s1= "144"; String s2 ="89";
        // String s1= "1"; String s2 ="999";
        // String s1= "301"; String s2 ="5";
        // String s1= "222232244629420445529739893461909967206666939096499764000999000"; String s2 ="1";
        // String s1= "9";  String s2 ="1";

        String s1= "8944394323791464";
        String s2 ="14472334024676221";

        String result = addTwoNumbers(s1,s2);

        System.out.println("Results: " + result);
    }


    public static String addTwoNumbers(String s1, String s2) {

        String min = "";
        String max = "";

        if (s1.length() < s2.length()) {
            min = s1;
            max = s2;
        } else {
            min = s2;
            max = s1;
        }

        int i = min.length()-1;
        int j = max.length()-1;
        int carryForward = 0;

        StringBuffer stringBuffer = new StringBuffer();

        while (i >= 0 ){
            int x =  min.charAt(i)-'0';
            int y =  max.charAt(j)-'0';
            int sum = x+y+carryForward;
            if (sum>=10) {
                carryForward = sum/10;
            } else {
                carryForward = 0;
            }
            stringBuffer.append(sum%10);
            j--;
            i--;
        }

        while (carryForward>0 && j>=0) {
            int sum = max.charAt(j)-'0'+carryForward;
            if (sum>=10) {
                carryForward = sum/10;
            } else {
                carryForward = 0;
            }
            stringBuffer.append(sum%10);
            j--;
        }

        while (j>=0) {
            stringBuffer.append( max.charAt(j)-'0' );
            j--;
        }

        if (carryForward>0) {
            stringBuffer.append(carryForward);
        }

        String result = stringBuffer.reverse().toString();

        return result;
    }


}


