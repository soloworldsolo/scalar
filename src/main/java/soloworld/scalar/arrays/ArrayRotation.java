package soloworld.scalar.arrays;

public class ArrayRotation {

    public int[] rotate (int[] array , int noOfRotation) {

            int[] newArary = new int[array.length];
            int index =0;
            while (index <array.length) {
                int currIndex = (index+ noOfRotation) % array.length;
                newArary[currIndex] = array[index++];
            }
        return  newArary;
    }


}
