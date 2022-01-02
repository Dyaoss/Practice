package sec03;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("홍길동", "1111111-22222222",12121246);
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
