package day1;

public class DmbCellPhone extends CellPhone {
    int channel;

    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
    }

}
