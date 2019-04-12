//Нужно прибавить к числу единицу и вернуть результирующую строку. Пользоваться методами преобразования строки в число нельзя
//I transform from characters to integers. This is allowed

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StartExamService startExam = new StartExamService();

        //extract characters from startExam.getStrInteger()
        ArrayList<Character> startExamString = new ArrayList<>();
        for (char c1 : startExam.getStrInteger().toCharArray()) {
            startExamString.add(c1);
        }

        //extract numbers from the startExamString to build one whole number
        long startExamLongFromString = 0;
        int currentIndex = 0;
        while (currentIndex != startExamString.size()) {
            startExamLongFromString =
                    startExamLongFromString * 10 + Character.getNumericValue(startExamString.get(currentIndex));
            currentIndex ++;
        }

        //return getStrInteger() + 1
        startExam.setReturnedStrLong(Long.toString(startExamLongFromString + 1));

        //check the result of the task
        System.out.println(startExam.getReturnedStrInteger());
    }
}
