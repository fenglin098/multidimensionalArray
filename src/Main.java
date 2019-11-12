public class Main {
    public static void main(String[] args) {
        int[][] table = new int[10][5];
        for (int i=0; i<table.length; i++){
            for (int j=0; j<table[i].length; j++)
                System.out.print("row "+i+" col "+j+" ");
            System.out.println();
        }

        int[][] Mtable = new int [11][11];
        for (int r=1; r<13; r++){
            for (int c=1; c<13; c++)
                System.out.print(r*c+"\t");
                System.out.println();
        }
    }
}
