/* A class for calculating the min and max of a given array of numbers
 */
public class MinMaxCalculation {

    /* A method for finding the min of an array of numbers O(n)
     * @param double[] arr: An array of numbers to find the min of
     * @return The minimum value found in arr
     */
    static double min(double[] arr) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /* A method for finding the max of an array of numbers O(n)
     * @param double[] arr: An array of numbers to find the max of
     * @return The maximum value found in arr
     */
    static double max(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /* The main method for finding both the min and max of a given array O(n)
     * @param double[] arr: An array of numbers to find the min/max of
     * @return Prints both the maximum and the minimum values of arr
     */
    static void minMaxCalculation(double[] arr) {
        double maxNum = max(arr);
        double minNum = min(arr);
        System.out.println("Maximum: " + maxNum + "\nMinimum: " + minNum);
    }
}


