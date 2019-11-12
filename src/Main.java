public class Main {
    public static void main(String[] args) {
        int[][] table = new int[10][5];
        for (int i=0; i<table.length; i++){
            for (int j=0; j<table[i].length; j++)
                System.out.print("row "+i+" col "+j+" ");
            System.out.println();
        }

    }
}
