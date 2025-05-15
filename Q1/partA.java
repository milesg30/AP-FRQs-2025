public class Main {
    public static void main(String [] args) {
        System.out.println("Hello, world!");
    }


    public int walkDogs(int hour) {
        int dogsToWalk = Math.min(maxDogs, company.numAvailableDogs(hour));
        company.updateDogs(hour, dogsToWalk);
        return dogsToWalk;
    }
}
