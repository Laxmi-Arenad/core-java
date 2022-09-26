class VesselTester{ 

 public static void main(String a[]){ 
  //Initialization through setter method
  Vessel.setVesselId(123);
  Vessel.setVesselName("Steel");
  Vessel.setBrandName("gk");
  
  System.out.println(Vessel.getVesselId());
  System.out.println(Vessel.getVesselName());
  System.out.println(Vessel.getBrandName());
  
   }
     }