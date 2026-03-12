public class MarsWeightAsanov {
    static float earthWeightAsanov = 70.0f;
    static float marsGravityAsanov = 0.38f;
    static float marsWeightAsanov;

    static double marsWeightDoubleAsanov;

    static int marsWeightIntAsanov;

    static char marsWeightCharAsanov;

    static int resultIntAsanov;

    public static void main(String[] args) {

        marsWeightAsanov = earthWeightAsanov * marsGravityAsanov;
        System.out.println("First I calculated the weight on Mars using float: " + marsWeightAsanov);

        marsWeightDoubleAsanov = marsWeightAsanov;
        System.out.printf("Now I saved the result in a double variable: %.4f\n", marsWeightDoubleAsanov);

        marsWeightIntAsanov = (int) marsWeightDoubleAsanov;
        System.out.println("Now I changed the double value to int: " + marsWeightIntAsanov);

        marsWeightCharAsanov = (char) marsWeightIntAsanov;
        System.out.println("Now I converted the int value to char: " + marsWeightCharAsanov);

        resultIntAsanov = marsWeightCharAsanov + 5;
        System.out.println("Then I did a math operation with the char value (+5) and stored it in int: " + resultIntAsanov);
    }
}
