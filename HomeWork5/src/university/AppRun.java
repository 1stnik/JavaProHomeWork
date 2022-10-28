package university;

import java.util.Scanner;

public class AppRun {


    public static void main(String[] args) {

        selectShowItem();

    }


    public static void selectShowItem() {

        StudentInit studentInit = new StudentInit();
        Student[] studentObj = (Student[]) studentInit.initValues();
        StudentsService studentsService = new StudentsService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Work with student list:
                * - see student list
                # - exit
                """);
        String firstInput = scanner.nextLine().trim();
        switch (firstInput) {
            case "*" -> {
                System.out.println("""
                        Select list option:
                        1 - sort by faculty
                        2 - sort by faculty and year of study
                        3 - sort by year of birth
                        4 - sort by group
                        9 - see full list
                        0 - exit program
                        """);
                firstInput = scanner.nextLine().trim();
                switch (firstInput) {
                    case "1" -> {
                        System.out.println("""
                                Select faculty:
                                M - Maths
                                P - Physics
                                C - Chemistry
                                X = Exit the program
                                """);
                        firstInput = scanner.nextLine().toUpperCase().trim();
                        switch (firstInput) {
                            case "M" -> studentsService.setSelectedFaculty("Maths");
                            case "P" -> studentsService.setSelectedFaculty("Physics");
                            case "C" -> studentsService.setSelectedFaculty("Сhemistry");
                            case "X" -> {
                                System.out.println("Al the best!");
                                scanner.close();
                            }
                            default -> {
                                System.out.println("Incorrect input...restart the program!");
                                scanner.close();
                            }
                        }
                        studentsService.facultySort(studentObj);
                    }

                    case "2" -> {
                        System.out.println("""
                                Select faculty:
                                M - Maths
                                P - Physics
                                C - Chemistry
                                X = Exit the program
                                """);
                        firstInput = scanner.nextLine().toUpperCase().trim();
                        switch (firstInput) {
                            case "M" -> studentsService.setSelectedFaculty("Maths");
                            case "P" -> studentsService.setSelectedFaculty("Physics");
                            case "C" -> studentsService.setSelectedFaculty("Сhemistry");
                            case "X" -> {
                                System.out.println("Al the best!");
                                scanner.close();
                            }

                            default -> {
                                System.out.println("Incorrect input...restart the program!");
                                scanner.close();
                            }
                        }
                        System.out.println("""
                                Select year of study:
                                1 , 2 , 3 or 4
                                0 - exit the program
                                """);
                        firstInput = scanner.nextLine().trim();
                        switch (firstInput) {
                            case "1" -> studentsService.setSelectedYearOfStudy(1);
                            case "2" -> studentsService.setSelectedYearOfStudy(2);
                            case "3" -> studentsService.setSelectedYearOfStudy(3);
                            case "4" -> studentsService.setSelectedYearOfStudy(4);
                            case "0" -> {
                                System.out.println("Al the best!");
                                scanner.close();
                            }
                            default -> {
                                System.out.println("Incorrect input...restart the program!");
                                scanner.close();
                            }
                        }
                        studentsService.facultyYearSort(studentObj);
                    }

                    case "3" -> {
                        System.out.println("""
                                Select year after which data is needed (1995 and more...)
                                0 - exit the program
                                """);
                        firstInput = scanner.nextLine().trim();
                        int inputtedYear = Integer.parseInt(firstInput);
                        if (inputtedYear < 1995 || inputtedYear > 1998) {
                            System.out.println("Only 1995 -1998. Incorrect input...restart the program!");
                            scanner.close();
                        }else {
                            studentsService.setSelectedYearOfBirth(inputtedYear);
                            scanner.close();
                        }
                        studentsService.yearSort(studentObj);
                    }

                    case "4" -> {
                        System.out.println("""
                                Select faculty:
                                A - 2M21
                                B - 3P20
                                C - 1P22
                                D - 4M19
                                X = Exit the program
                                """);
                        firstInput = scanner.nextLine().toUpperCase().trim();
                        switch (firstInput) {
                            case "A" -> studentsService.setSelectedGroup("2M21");
                            case "B" -> studentsService.setSelectedGroup("3P20");
                            case "C" -> studentsService.setSelectedGroup("1P22");
                            case "D" -> studentsService.setSelectedGroup("4M19");
                            case "X" -> {
                                System.out.println("Al the best!");
                                scanner.close();
                            }
                            default -> {
                                System.out.println("Incorrect input...restart the program!");
                            scanner.close();
                            }
                        }
                        studentsService.groupSort(studentObj);
                    }

                    case "9" -> {
                        for (Student std : studentObj) System.out.println(std);
                    }
                    case "0" -> {
                        System.out.println("Al the best!");
                        scanner.close();
                    }default -> {
                        System.out.println("Incorrect input...restart the program!");
                        scanner.close();
                    }
                }
            }
            case "#" -> {
                System.out.println("Have a nice day!");
                scanner.close();
            }
            default -> System.out.println("Incorrect input...restart the program!");
        }
    }
}
