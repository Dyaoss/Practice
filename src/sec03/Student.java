package sec03;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn , int studentNo){
        super(name, ssn);
        this.studentNo = studentNo; // 슈퍼 생성자와 위치가 바뀌면 컴파일 오류발생
        System.out.println("자식 객체 생성 완료");
    }
    /*
    * 기본적으로 호출되는 생성자
    * public Student(){
    *   super();
    * 그러나 매개변수가 있기때문에 컴파일 오류 발생
    * }
    * */
}
