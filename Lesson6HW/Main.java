package Pics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputStream = new Scanner(new FileInputStream("D:\\IntelIiJ\\PicsArt\\src\\Pics\\info.txt"));
        ArrayList<String> arr = new ArrayList<>();

        while (inputStream.hasNextLine()) {
            arr.add(inputStream.nextLine());

        }
        ArrayList<Student> el=new ArrayList<>();
    for(String s: arr)
    {
        String[] data= {"", "", "", "", ""};
        int j=0;
        for(int i=0; i<s.length(); ++i)
        {
            if(s.charAt(i)==',')
            {
                ++j;
                continue;
            }
            data[j]=data[j].concat(String.valueOf(s.charAt(i)));
        }

        el.add(new Student(data[0], data[1], Integer. parseInt(data[2]), data[3], Double.parseDouble(data[4])));
    }
        Student[] data=new Student[el.size()];
        data=el.toArray(data);

        Student.printName(data); // Task 1: Print full names of students
        System.out.println();

        Student.printMale(data); // Task 2: Print all male students
        System.out.println();

        Student.printFemaleGreater54(data); // Task 3: Print all female students who has mark greater then 50.4
        System.out.println();

        Student.printStudentWithLowestGrade(data); //Task 4: Print student information having the minimal mark
        System.out.println();

        Student.biggestMale(data); //Task 5: Print biggest male student information
        System.out.println();

        Student.sortedByMark(data); //Task 6: Print students sorted by mark
        System.out.println();

        Student.sortedByYear(data); //Task 7: Print female students sorted by year

    }
}
