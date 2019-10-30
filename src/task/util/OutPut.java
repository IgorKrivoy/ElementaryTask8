package task.util;

import java.util.List;

public class OutPut {

    public void startInfo() {
        System.out.println("Введите значения <граница_1> <граница_2>, или <длинну>: ");
    }


    public void outNumbers(List<Integer> numbers) {
        System.out.println("Числа Фибоначчи заданого диапазона/длинны: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + ", ");
            }
        }
        System.out.println();
    }

}
