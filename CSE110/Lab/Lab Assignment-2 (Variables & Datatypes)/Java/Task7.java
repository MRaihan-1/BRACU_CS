public class Task7 {
    public static void main(String[] args) {
        double distance = 1204;
        double hrs = 5;
        double mins = 56;
        double seconds = 23;
        double totalhrs = hrs + (mins / 60) + (seconds / 3600);
        double distanceKm = distance / 1000;
        double distanceMiles = distance / 1609;
        double velocityKmh = distanceKm / totalhrs;
        double velocityMph = distanceMiles / totalhrs;

        System.out.println("Your velocity in km/h is " + velocityKmh);
        System.out.printf("Your velocity in km/h is %.7f%n", velocityKmh);
        System.out.printf("Your velocity in miles/h is %.7f%n", velocityMph);
    }
}
