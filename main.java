package lesson2;

public class Main {
    public static void main(String[] args) {
        String [][] arr = new String [][] {{"2", "2", "3", "4",}, {"2", "5", "2", "3"}, {"1", "2", "10", "2"}, {"2", "2", "8", "2"}};
        try {
            int result = method(arr);
            System.out.println(result);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива превышен!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
            e.printStackTrace();
        }
    }
    public static int method(String [][] arr) throws MyArraySizeException, MyArrayDataException {
    int count = 0;
    if (arr.length != 4) {
        throw new MyArraySizeException();
    }
    for (int i = 0; i<arr.length; i++) {
        if (arr[i].length != 4) {
            throw new MyArraySizeException();
        }
        for (int j = 0; j < arr[i].length; j++) {
            try {count = count + Integer.parseInt(arr[i][j]);
            }
            catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j);
            }
        }

    }
    return count;
    }
}

