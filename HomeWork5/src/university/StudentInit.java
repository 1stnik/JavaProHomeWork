package university;

public class StudentInit {


    public Object[] initValues() {

        Student[] studentObj = new Student[10];
        studentObj[0] = new Student(10001, "Melnik", "Ivan", "Ivanovich", 1998,
                "Lviv", "(099)1230099", "Maths", 2, "2M21");
        studentObj[1] = new Student(10002, "Shevchenko", "Petro", "Petrovich", 1997,
                "Kyiv", "(099)1230088", "Physics", 3, "3P20");
        studentObj[2] = new Student(10003, "Kovalenko", "Sofia", "Petrivna", 1999,
                "Kyiv", "(099)1230077", "Physics", 1, "1P22");
        studentObj[3] = new Student(10004, "Bondar", "Larisa", "Maksimivna", 1996,
                "Odesa", "(099)1230066", "Сhemistry", 4, "4M19");
        studentObj[4] = new Student(10005, "Boyko", "Roman", "Ivanovich", 1997,
                "Dnipro", "(099)1230055", "Physics", 3, "3P20");
        studentObj[5] = new Student(10006, "Tkachenko", "Bogdan", "Oleksandrovich", 1998,
                "Kharkiv", "(099)1230044", "Maths", 2, "2M21");
        studentObj[6] = new Student(10007, "Kravchenko", "Hanna", "Dmitrivna", 1999,
                "Kyiv", "(099)1230077", "Physics", 1, "1P22");
        studentObj[7] = new Student(10008, "Kovalchuk", "Artem", "Maksimovich", 1996,
                "Odesa", "(099)1230066", "Сhemistry", 4, "4M19");
        studentObj[8] = new Student(10009, "Oliynik", "Oleksandr", "Ivanovich", 1996,
                "Dnipro", "(099)1230055", "Physics", 3, "3P20");
        studentObj[9] = new Student(10010, "Savchenko", "Nazar", "Oleksandrovich", 1997,
                "Kharkiv", "(099)1230044", "Maths", 2, "2M21");
        return studentObj;
    }
}