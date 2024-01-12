import java.util.*;

public class Main {

    public static int minUnreachableWarehouses(int warehouseNodes, int warehouseEdges, int[] warehouseFrom, int[] warehouseTo) {
        // Count incoming edges for each warehouse
        int[] incomingEdges = new int[warehouseNodes + 1];
        for (int i = 0; i < warehouseEdges; i++) {
            int to = warehouseTo[i];
            incomingEdges[to]++;
        }

        // Count the number of unreachable warehouses
        int unreachableCount = 0;
        for (int edges : incomingEdges) {
            if (edges == 0) {
                unreachableCount++;
            }
        }

        return unreachableCount;
    }

    public static void main(String[] args) {
        int warehouseNodes = 6;
        int warehouseEdges = 5;
        int[] warehouseFrom = {1, 2, 4, 5, 4};
        int[] warehouseTo = {2, 3, 5, 6, 6};

        int result = minUnreachableWarehouses(warehouseNodes, warehouseEdges, warehouseFrom, warehouseTo);
        System.out.println(result);
    }
}