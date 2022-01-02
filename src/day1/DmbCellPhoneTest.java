package day1;

public class DmbCellPhoneTest {
    public static void main(String[] args) {

        DmbCellPhone cell1 = new DmbCellPhone("자바폰","검정",10);

        System.out.println("모델: " + cell1.model);
        System.out.println("색상: " + cell1.color);

        System.out.println("채널: " + cell1.channel);

    }
}
