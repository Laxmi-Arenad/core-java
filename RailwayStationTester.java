class RailwayStationTester{ 

 public static void main(String a[]){ 
  //Initialization through setter method
  RailwayStation.setPlaceName("Belagaum");
  RailwayStation.setPlatformNumber(5);
  RailwayStation.setSeatNumber(20);
  
  System.out.println(RailwayStation.getPlaceName());
  System.out.println(RailwayStation.getPlatformNumber());
  System.out.println(RailwayStation.getSeatNumber());
  
   }
     }