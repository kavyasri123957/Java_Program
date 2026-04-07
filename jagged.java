import java.util.Scanner;
class jagged{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        int arr[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of columns for row " + i + ":");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            System.out.println("Enter elements:");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
