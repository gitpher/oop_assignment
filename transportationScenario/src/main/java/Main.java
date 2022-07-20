public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(2);
        Bus bus2 = new Bus(2);

        // 각 Bus 번호 다른지 확인
        System.out.println("<각 Bus 번호 다른지 확인>");
        System.out.println("bus1의 번호: " + bus1.getNumber());
        System.out.println("bus2의 번호: " + bus2.getNumber());
        System.out.println();

        // 탑승 승객 수, 잔여 승객 수, 요금 확인
        System.out.println("<탑승 승객 수, 잔여 승객 수, 요금 확인>");
        System.out.println("탑승 승객 수: " + bus1.getNowPassenger());
        System.out.println("잔여 승객 수: " + (bus1.getMaxPassenger() - bus1.getNowPassenger()));
        System.out.println("요금 확인: " + bus1.getFare());
        System.out.println();

        // 주유량 -50
        System.out.println("<주유량 -50>");
        bus1.setFuel(bus1.getFuel() - 50);
        System.out.println("주유량: " + bus1.getFuel());
        System.out.println();

        // Bus 상태 변경(차고지 행) 후 주유량 +10
        System.out.println("<Bus 상태 변경(차고지 행) 후 주유량 +10>");
        bus1.setState("차고지 행");
        System.out.println("상태: " + bus1.getState());
        bus1.setFuel(bus1.getFuel() + 10);
        System.out.println("주유량: " + bus1.getFuel());
        System.out.println();

        // Bus 상태 변경(운행), 승객 +45(최대 승객 수 초과) 후 승객 +5
        System.out.println("<Bus 상태 변경(운행), 승객 +45(최대 승객 수 초과) 후 승객 +5>");
        bus1.setState("운행");
        bus1.setNowPassenger(bus1.getNowPassenger() + 45); // 승객 수 초과 시 탑승 승객 수 0으로 초기화
        bus1.setNowPassenger(bus1.getNowPassenger() + 5);
        System.out.println("탑승 승객 수: " + bus1.getNowPassenger());
        System.out.println("잔여 승객 수: " + (bus1.getMaxPassenger() - bus1.getNowPassenger()));
        System.out.println("요금: " + bus1.getFare());
        System.out.println();

        // 주유량 -55 후 주유량, 상태 출력
        System.out.println("<주유량 -55 후 주유량, 상태 출력>");
        bus1.setFuel(bus1.getFuel() - 55);
        System.out.println("주유량: " + bus1.getFuel());
        System.out.println("상태: " + bus1.getState());
        System.out.println();

        System.out.println("=============================================================");
        System.out.println();

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        // 각 Taxi 번호 다른지 확인
        System.out.println("<각 Taxi 번호 다른지 확인>");
        System.out.println("taxi1 번호: " + taxi1.getNumber());
        System.out.println("taxi2 번호: " + taxi2.getNumber());
        System.out.println();

        // 승객, 목적지와 목적지까지의 거리 설정한 새로운 Taxi 객체 생성 후 객체 요소 출력
        System.out.println("<승객, 목적지와 목적지까지의 거리 설정한 새로운 Taxi 객체 생성 후 객체 요소 출력>");
        Taxi taxi = new Taxi(2, "서울역", 2);
        System.out.println("탑승 승객 수: " + taxi.getNowPassenger());
        System.out.println("잔여 승객 수: " + (taxi.getMaxPassenger() - taxi.getNowPassenger()));
        System.out.println("기본 요금 확인: " + taxi.getFareDefault());
        System.out.println("목적지: " + taxi.getDestination());
        System.out.println("목적지까지의 거리: " + taxi.getDistanceToDestination() + "km");
        System.out.println("지불할 요금: " + taxi.getFare());
        System.out.println("상태: " + taxi.getState());
        System.out.println();

        // 주유량 -80 후 주유량과 누적요금 출력
        System.out.println("< 주유량 -80 후 주유량과 누적요금 출력>");
        taxi.setFuel(taxi.getFuel() -80);
        System.out.println("주유량: " + taxi.getFuel());
        System.out.println("누적 요금: " + taxi.getFareTotal(taxi.getFare()));
        System.out.println();

        // 최대 승객 수 초과 확인
        System.out.println("<최대 승객 수 초과 확인>");
        taxi.setNowPassenger(5);
        System.out.println();

        // 새로운 객체 생성 후 출력
        System.out.println("<새로운 객체 생성 후 출력>");
        taxi.setNowPassenger(3);
        taxi.setDestination("구로디지털단지역");
        taxi.setDistanceToDestination(12);
        System.out.println("탑승 승객 수: " + taxi.getNowPassenger());
        System.out.println("잔여 승객 수: " + (taxi.getMaxPassenger() - taxi.getNowPassenger()));
        System.out.println("기본 요금 확인: " + taxi.getFareDefault());
        System.out.println("목적지: " + taxi.getDestination());
        System.out.println("목적지까지의 거리: " + taxi.getDistanceToDestination() + "km");
        System.out.println("지불할 요금: " + taxi.getFare());
        System.out.println();

        // 주유량 -20 후 주유량, 상태, 누적 요금
        System.out.println("<주유량 -20 후 요금 결제>");
        taxi.setFuel(taxi.getFuel() - 20);
        System.out.println("주유량: " + taxi.getFuel());
        System.out.println("상태: " + taxi.getState());
        System.out.println("누적 요금: " + taxi.getFareTotal(taxi.getFare()));
        System.out.println();

    }
}
