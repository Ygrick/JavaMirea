package pr6;
import java.util.*;
public class SortingStudentsByGPA {
    public void sorting(Student[] students, int right, int left){
        if (left >= right)
            return;
        int leftMarker = left, rightMarker = right;
        Student tmp = new Student();
        int pivot = students[(leftMarker + rightMarker) / 2].getGpa();
        do {// ������� ����� ������ ����� ������� ���� ������� ������, ��� pivot
            while (students[leftMarker].getGpa() < pivot) {
                leftMarker++;
            } // ������� ������ ������, ���� ������� ������, ��� pivot

            while (students[rightMarker].getGpa() > pivot) {
                rightMarker--;
            }// ��������, �� ����� �������� ������� ��������, �� ������� ��������� �������
            if (leftMarker <= rightMarker) {// ����� ������ ����� ������ ������� ������ ���� �� ������ ��������� swap
                if (leftMarker < rightMarker) {
                    tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                // �������� �������, ����� �������� ����� �������
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
