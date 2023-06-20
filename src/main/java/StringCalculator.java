public class StringCalculator {
    public static int add(String numbers) throws Exception {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int num = Integer.parseInt(number.trim());
                    if (num < 0) throw new IllegalArgumentException("Negatives not allowed");
                    else if (num < 1000) returnValue+=Integer.parseInt(number.trim()); // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
}