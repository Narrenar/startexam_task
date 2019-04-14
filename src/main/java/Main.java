//Нужно прибавить к числу единицу и вернуть результирующую строку. Пользоваться методами преобразования строки в число нельзя
//This class can increase any number by 1 if it is collected in a String and tells you if you are trying to increase a non-figure character

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StartExam startExam = new StartExam();

        for (char character : startExam.getNumberAsString().toCharArray()) {
            startExamString.add(character);
        }

        currentIndex = startExamString.size() - 1;
        increaseStringByOne();

        currentIndex = 0;
        StringBuilder stringForReturn = new StringBuilder();
        for (char ignored : startExamString) {
            stringForReturn.append(startExamString.get(currentIndex));
            currentIndex++;
        }

        startExam.setNumberAsString(stringForReturn.toString());
        System.out.println("Current startExam.getReturnedNumberAsString() value is: '"
                + startExam.getReturnedNumberAsString() + "'");
    }

    private static ArrayList<Character> startExamString = new ArrayList<>();
    private static int currentIndex;

    private static void increaseStringByOne() {
        if (currentIndex >= 0) {
            switch(startExamString.get(currentIndex)) {
                case ('9'):
                    startExamString.set(currentIndex, '0');
                    currentIndex--;
                    increaseStringByOne();
                    break;
                case ('8'):
                    startExamString.set(currentIndex, '9');
                    break;
                case ('7'):
                    startExamString.set(currentIndex, '8');
                    break;
                case ('6'):
                    startExamString.set(currentIndex, '7');
                    break;
                case ('5'):
                    startExamString.set(currentIndex, '6');
                    break;
                case ('4'):
                    startExamString.set(currentIndex, '5');
                    break;
                case ('3'):
                    startExamString.set(currentIndex, '4');
                    break;
                case ('2'):
                    startExamString.set(currentIndex, '3');
                    break;
                case ('1'):
                    startExamString.set(currentIndex, '2');
                    break;
                case ('0'):
                    startExamString.set(currentIndex, '1');
                    break;
                default:
                    System.out.println("ERROR: Current character of 'startExamString' at index '" + currentIndex +
                            "' is not a figure. Impossible to increase any number in the string by one.");
                    break;
            }
        } else {
            currentIndex++;
            startExamString.set(currentIndex, '1');
            if (startExamString.size() != 1) {
                for (int i = 1; i < startExamString.size(); i++) {
                    currentIndex++;
                    startExamString.set(currentIndex, '0');
                }
            }
            startExamString.add('0');
        }
    }
}
