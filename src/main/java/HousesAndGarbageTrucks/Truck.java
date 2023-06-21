//package HousesAndGarbageTrucks;
//
//public class Truck {
//    private int timeRided;
//    private boolean atStartPoint;
//    private int houseIndex;
//    private int[] distances;
//    private int timeGarbageCollected;
//
//    public Truck(int [] distances) {
//        this.timeRided = 0;
//        this.atStartPoint = true;
//        this.houseIndex = 0;
//        this.distances=distances;
//    }
//
//    public int collectGarbage(int numberOfBins) {
//        timeGarbageCollected += numberOfBins;
//        return timeGarbageCollected;
//    }
//
//    public void driveToTheHouse(int houseIndex) {
//
//        if (atStartPoint) {
//            atStartPoint = false;
//            for (int i=0;i<=houseIndex;i++){
//                timeRided+=distances[i];
//            }
//            this.houseIndex=houseIndex;
//        } else {
//            for (int i=this.houseIndex;i<=houseIndex;i++){
//                timeRided+=distances[i];
//            }
//            this.houseIndex=houseIndex;
//        }
//        return;
//    }
//
//    public int driveBackToStart() {
//        timeRided += timeRided;
//        atStartPoint = true;
//        return timeRided;
//    }
//    public int timeSpent(){
//        return timeGarbageCollected+timeRided;
//    }
//
//}
