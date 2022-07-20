public class Taxi extends Transportation{
    // 목적지
    private String destination;
    // 목적지까지의 거리
    private int distanceToDestination;
    // 기본 거리
    private int distanceDefault;
    // 기본 요금
    private int fareDefault;
    // 거리당 요금
    private int farePerDistance;
    // 현재 승객 수
    private int nowPassenger;
    // 상태
    private String state;
    // 지불할 요금
    private int fare;
    // 누적 요금
    private int fareTotal;


    // -------------------------------- 생성자 시작 -----------------------------------
    public Taxi() {
        // 기본값: 기본 요금
        this.setFareDefault(3000);
        // 기본값: 거리당 요금
        this.setFarePerDistance(1000);
        // 기본값: 기본 거리
        this.setDistanceDefault(1);
        // 기본값: 상태
        this.setState("일반");
        // 기본값: 최대 승객 수
        this.setMaxPassenger(4);
    }


    public Taxi(int passenger, String destination, int distanceToDestination) {
        // 기본값: 기본 요금
        this.setFareDefault(3000);
        // 기본값: 거리당 요금
        this.setFarePerDistance(1000);
        // 기본값: 기본 거리
        this.setDistanceDefault(1);
        // 기본값: 상태
        this.setState("운행");
        // 기본값: 최대 승객 수
        this.setMaxPassenger(4);
        this.setNowPassenger(passenger);

        // 목적지와 목적지까지의 거리 설정
        this.setDestination(destination);
        this.setDistanceToDestination(distanceToDestination);
    }
    // -------------------------------- 생성자 끝 -----------------------------------

    // --------------------------------- getter 및 setter 시작 ------------------------------
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistanceToDestination() {
        return distanceToDestination;
    }

    public void setDistanceToDestination(int distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }

    public int getDistanceDefault() {
        return distanceDefault;
    }

    public void setDistanceDefault(int distanceDefault) {
        this.distanceDefault = distanceDefault;
    }

    public int getFareDefault() {
        return fareDefault;
    }

    public void setFareDefault(int fareDefault) {
        this.fareDefault = fareDefault;
    }

    public int getFarePerDistance() {
        return farePerDistance;
    }

    public void setFarePerDistance(int farePerDistance) {
        this.farePerDistance = farePerDistance;
    }

    public int getNowPassenger() {
        return nowPassenger;
    }

    public void setNowPassenger(int nowPassenger) {
        if (nowPassenger > this.getMaxPassenger()) {
            System.out.println("최대 승객 수 초과");
            this.nowPassenger = 0; // 최대 승객 수 초과 시 승객 수 0으로 초기화
        } else {
            this.nowPassenger = nowPassenger;
        }
    }

    public String getState() {
        if (this.getFuel() < 10) {
            this.state = "운행 불가";
            return "운행 불가\n주유 필요";
        } else {
            return state;
        }
    }

    public void setState(String state) {
        if (this.getFuel() < 10) {
            System.out.println("주유 필요");
            this.state = "운행 불가";
        } else {
            if (state == "운행" || state == "운행 불가" || state == "일반") {
                this.state = state;
            } else {
                System.out.println("'운행'과 '운행 불가', '일반' 중 하나의 값을 입력해주세요");
            }
        }
    }

    public int getFare() {
        fare = fareDefault + ((distanceToDestination - distanceDefault) * farePerDistance);
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getFareTotal(int fare) {
        return fareTotal += fare;
    }

    public void setFareTotal(int fareTotal) {
        this.fareTotal = fareTotal;
    }

    // --------------------------------- getter 및 setter 끝 ------------------------------
    // -------------------------------- 기능 시작 --------------------------------
    @Override
    void changeSpeed(int speed) {

    }

    void boardPassenger() {

    }


    // -------------------------------- 기능 끝 --------------------------------

}
