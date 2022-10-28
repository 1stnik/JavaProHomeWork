package university;

public class StudentsService {

    private String selectedFaculty;
    private int selectedYearOfStudy;
    private int selectedYearOfBirth;
    private String selectedGroup;

    public String getSelectedFaculty() {
        return selectedFaculty;
    }

    public void setSelectedFaculty(String selectedFaculty) {
        this.selectedFaculty = selectedFaculty;
    }

    public int getSelectedYearOfStudy() {
        return selectedYearOfStudy;
    }

    public void setSelectedYearOfStudy(int selectedYearOfStudy) {
        this.selectedYearOfStudy = selectedYearOfStudy;
    }

    public int getSelectedYearOfBirth() {
        return selectedYearOfBirth;
    }

    public void setSelectedYearOfBirth(int selectedYearOfBirth) {
        this.selectedYearOfBirth = selectedYearOfBirth;
    }

    public String getSelectedGroup() {
        return selectedGroup;
    }

    public void setSelectedGroup(String selectedGroup) {
        this.selectedGroup = selectedGroup;
    }


    public void facultySort(Student[] studentObj) {
        System.out.println("---------------------");
        System.out.println("Faculty (" + getSelectedFaculty() +"):");
        for (Student student : studentObj) {
            if (student.getFaculty().equals(getSelectedFaculty())) {
                System.out.println(student.getId() + " " + student.getSurname() + " " +
                        student.getName() + " " + student.getPatronymic() + " / Faculty - " + student.getFaculty());
            }
        }
    }


    public void facultyYearSort(Student[] studentObj) {
        System.out.println("---------------------");
        System.out.println("Faculty (" + getSelectedFaculty() + "), Year of study (" + getSelectedYearOfStudy() + "):");
        for (Student value : studentObj) {
            if (value.getFaculty().equals(getSelectedFaculty()) && value.getYearOfStudy() == getSelectedYearOfStudy()) {
                System.out.println(value.getId() + " " + value.getSurname() + " " + value.getName() + " " +
                        value.getPatronymic() + " / Faculty - " + value.getFaculty() + " / Year of study - " +
                        value.getYearOfStudy());
            }
        }
    }


    public void yearSort(Student[] studentObj) {
        System.out.println("---------------------");
        System.out.println("Year of birth after (" + getSelectedYearOfBirth() + "):");
        for (Student student : studentObj) {
            if ((student.getYearOfBirth() > getSelectedYearOfBirth() && getSelectedYearOfBirth() != 0))
                System.out.println(student.getId() + " " + student.getSurname() + " " + student.getName() + " " +
                        student.getPatronymic() + " " + student.getYearOfBirth());
        }
    }


    public void groupSort(Student[] studentObj) {
        System.out.println("---------------------");
        System.out.println("Group (" + getSelectedGroup() + "):");
        for (Student student : studentObj) {
            if (student.getGroup().equals(getSelectedGroup())) {
                System.out.println(student.getId() + " " + student.getSurname() + " " +
                        student.getName() + " " + student.getPatronymic() + " / Group - " + student.getGroup());
            }
        }
    }
}