/**
 * The class HeronsFormula to calculate the area of a triangle given its three sides.
 * <p>
 *
 * @author Graham Mitchell (modified my Mr. Gallo)
 */
public class HeronsFormula {
    public static void main(String[] args) {
        double a;
        
        a = triangleArea(3, 3, 3);
        System.out.println("A triangle with sides 3,3,3 has an area of " + a);

        a = triangleArea(3, 4, 5);
        System.out.println("A triangle with sides 3,4,5 has an area of " + a);
 
        a = triangleArea(7, 8, 9);
        System.out.println("A triangle with sides 7,8,9 has an area of " + a);

        System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13));
        System.out.println("A triangle with sides 10,9,11 has an area of " + triangleArea(10, 9, 11));
        System.out.println("A triangle with sides 8,15,17 has an area of " + triangleArea(8, 15, 17));
    }

    /**
     * Calculate the area of a triangle whose sides have lengths a, b, and c
     *
     * @param a
     *          Side A
     * @param b
     *          Side B
     * @param c
     *          Side C
     * @return the area
     * @see <a href="http://www.mathwarehouse.com/geometry/triangles/area/herons-formula-triangle-area.php">Heron's Formula</a>
     */
    public static double triangleArea(int a, int b, int c) {
        double s = (a+b+c) / 2;  // semi-perimeter

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
