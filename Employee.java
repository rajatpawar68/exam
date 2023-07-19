package datasexam;

class Student {
    int studentId;
    String name;
    int age;
    String course;
    double fees;
    double percentage;

    public Student(int studentId, String name, int age, String course, double fees, double percentage) {
       
    	this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.fees = fees;
        this.percentage = percentage;
    }

    
}

class Node {
    Student student;
    Node prev;
    Node next;

    public Node(Student student) {
        this.student = student;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void insertStudent(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Student searchStudent(int studentId) {
        Node current = head;
        while (current != null) {
            if (current.student.studentId == studentId) {
                return current.student;
            }
            current = current.next;
        }
        return null; 
    }

    public void deleteStudent(int studentId) {
        Node current = head;
        while (current != null) {
            if (current.student.studentId == studentId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                 return;
            }
            current = current.next;
        }
    }

    public void printStudent(Student student) {
        if (student != null) {
            System.out.println("Student ID: " + student.studentId);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Course: " + student.course);
            System.out.println("Fees: " + student.fees);
            System.out.println("Percentage: " + student.percentage);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void printAllStudents() {
        Node current = head;
        while (current != null) {
            printStudent(current.student);
            current = current.next;
        }
    }
}
