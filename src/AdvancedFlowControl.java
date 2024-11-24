public class AdvancedFlowControl {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        OUTER_LOOP :for (int[] row : matrix) {
            INNER_LOOP : for (int i=0; i<row.length; i++) {
                System.out.print(row[i] + "\t");

            }
            System.out.println();
        }

        int x=20;
        while (x>0) {
            do {
                x-=2;
            }while (x>5);
            x--;
            System.out.println(x + "\t");
        }

        int [][] list = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int searchValue =4;
        int positionX =-1;
        int positionY =-1;

        PARENT_LOOP :for (int i=0; i<list.length; i++) {
            CHILD_LOOP :for (int j=0; j<list[i].length; j++) {
                if (list[i][j]==searchValue) {
                    positionX=i;
                    positionY=j;
                    break PARENT_LOOP;
                }
            }
        }
        if (positionX!=-1 && positionY!=-1) {
            System.out.println("search value found at position " + positionX + " and position " + positionY);
        }


    }
}
