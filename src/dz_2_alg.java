public class dz_2_alg {
    // Если необходимо, исправьте данный код
    //try {
    //    int d = 0;
    //    double catchedRes1 = intArray[8] / d;
    //    System.out.println("catchedRes1 = " + catchedRes1);
    //} catch (ArithmeticException e) {
    //    System.out.println("Catching exception: " + e);
    //}

    public static void main(String[] args){
        try {
            int d = 0;
            int[] intArray = new int[]{};
            int index = 8;
            if(intArray.length < index){
                throw new ArrayIndexOutOfBoundsException("индех за пределами массива");
            }
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Catching exception: " + e);
        }
    }


}
