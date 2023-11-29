public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive int to Integer (wrapper class)
        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt);

        // Display the values
        System.out.println("Original primitive int value: " + primitiveInt);
        System.out.println("Autoboxed Integer value: " + wrapperInt);

        // Unboxing: Converting Integer (wrapper class) to primitive int
        int newPrimitiveInt = wrapperInt.intValue();

        // Display the unboxed value
        System.out.println("Unboxed primitive int value: " + newPrimitiveInt);
    }
}
