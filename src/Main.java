public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        float[] array1 = new float[3];
        array1[0] = (float) 1.57;
        array1[1] = (float) 7.654;
        array1[2] = (float) 9.986;
        int[] array2 = {11, 12};

        System.out.print(array[0] + " , " + array[1] + " , " + array[2] + "\n" + array1[0] + " , " + array1[1] + " , " + array1[2] + "\n" + array2[0] + " , " + array2[1] + "\n\n");
        System.out.print(array[2] + " , " + array[1] + " , " + array[0] + "\n" + array1[2] + " , " + array1[1] + " , " + array1[0] + "\n" + array2[1] + " , " + array2[0] + "\n\n");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
                System.out.print(array[i] + " ");
            }
        }


    }
}