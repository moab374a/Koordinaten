public class Rechnen {

    public static void gibabstand(Punkt  p1 , Punkt p2){
        double distance = Math.sqrt((p1.getX() - p2.getX())^2 * (p1.getY() - p2.getY())^2);
        System.out.println(distance);
    }


}
