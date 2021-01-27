public class BubbleSorter {

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public void sortTable(int[] table) {
        int swap;
        int change = 0;
        int counter = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length - 1; j++) {
                counter++;
                if (table[j] > table[j + 1]) {
                    swap = table[j + 1];
                    table[j + 1] = table[j];
                    table[j] = swap;
                    change++;
                }
            }
            if (change == 0) {
                break;
            }
        }

        System.out.println();
        System.out.println("Tablica po sortowaniu");
        for (int j : table) {
            System.out.printf("%d ", j);
        }
        System.out.printf("\nLiczba zmian: %d", change);
        System.out.printf("\nLiczba porównań: %d", counter);
    }

}
