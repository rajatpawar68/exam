package datasexam;

public class MainProgram {
    public static void main(String[] args) {
        DoublyLinkedList studentList = new DoublyLinkedList();

       
        studentList.insertStudent(new Student(1, "rajat", 25, "Medical", 8000, 96));
        studentList.insertStudent(new Student(2, "devendra", 28, "Engineering", 9000, 64));
        studentList.insertStudent(new Student(3, "Naveen", 24, "Media", 7800, 84));
        studentList.insertStudent(new Student(4, "mahesh", 27, "aeronautics", 9000, 67));
       
        Student student = studentList.searchStudent(3);
        studentList.printStudent(student);

       
        studentList.deleteStudent(4);
        studentList.printAllStudents();
    }
}
