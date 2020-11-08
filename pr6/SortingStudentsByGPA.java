package pr6;
import java.util.*;
public class SortingStudentsByGPA {
    public void sorting(Student[] students, int right, int left){
        if (left >= right)
            return;
        int leftMarker = left, rightMarker = right;
        Student tmp = new Student();
        int pivot = students[(leftMarker + rightMarker) / 2].getGpa();
        do {// Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (students[leftMarker].getGpa() < pivot) {
                leftMarker++;
            } // Двигаем правый маркер, пока элемент больше, чем pivot

            while (students[rightMarker].getGpa() > pivot) {
                rightMarker--;
            }// Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {// Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right) {
            sorting(students, leftMarker, right);
        }
        if (0 < rightMarker) {
            sorting(students, left, rightMarker);
        }
    }
}
