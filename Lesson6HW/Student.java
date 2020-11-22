package Pics;

public class Student {
    private String first;
    private String last;
    private String gender;
    private double grade;
    private int year;


    public Student(String first, String last, int year, String gender, double grade) {
        this.first = first;
        this.last = last;
        this.gender = gender;
        this.grade = grade;
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }


    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void printName(Student[] data)
    {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getFirst());
        }
    }

    public static void printMale(Student[] data)
    {
        for (int i = 0; i < data.length; i++) {
            if(data[i].getGender().equals("m")){
                System.out.println(data[i].getFirst() + " " + data[i].getLast());
            }
        }
    }

    public static void printFemaleGreater54 (Student[] data)
    {
        for (int i = 0; i < data.length; i++) {
            if(data[i].getGrade() > 50.4 && data[i].getGender().equals("f")){
                System.out.println(data[i].getFirst() + " " + data[i].getLast());
            }
        }
    }

    public static void printStudentWithLowestGrade (Student[] data)
    {
        Student min = data[0];
        for (int i = 1; i < data.length; i++)
        {
            if(data[i].getGrade()<min.getGrade())
                min=data[i];
        }
        System.out.println(min.getFirst() + " " + min.getLast());
    }

    public static void biggestMale(Student[] data)
    {
        Student min = null;
        for(int i=0; i<data.length; ++i)
        {
            if(data[i].getGender().equals("m"))
            {
                min=data[i];
                break;
            }
        }
        for (int i = 0; i < data.length; i++)
        {
            if(data[i].getGender().equals("m") && data[i].getYear() < min.getYear())
                min=data[i];
        }
        System.out.println(min.getFirst() + " " + min.getLast());
    }

    public static void sortedByMark(Student[] data){
        Student[] arr = new Student[data.length];
        for (int i = 0; i < data.length; i++) {
            arr[i] = data[i];
        }
        int n = arr.length;
        int i, j;
        Student temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j].getGrade() > arr[j + 1].getGrade())
                {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        for (Student x: arr) {
            System.out.println(x.first + " " + x.last);
        }
    }

    public static void sortedByYear(Student[] data)
    {
        int cnt=0;
        for(int i=0; i<data.length; ++i)
        {
            if(data[i].getGender().equals("f"))
                ++cnt;
        }
        Student[] arr = new Student[cnt];
        int j=0;
        for (int i = 0; i < data.length; i++)
        {
            if(data[i].getGender().equals("f"))
            {
                arr[j] = data[i];
                ++j;
            }

        }
        int n = arr.length;
        int i;
        j=0;
        Student temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j].getYear() > arr[j + 1].getYear())
                {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        for (Student x: arr) {
            System.out.println(x.first + " " + x.last);
        }
    }
}
