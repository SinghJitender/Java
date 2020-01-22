package Problems;

public class TowerOfHanoi {
    public static void main(String[] args) {

        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.tower(4,'A','C','B');

    }

    public void tower(int n, char from,char to, char aux) {
        System.out.println("\n Recursion call "+ n );
        if(n==1) {
            System.out.println("Moving disk "+n+" from rod ["+from+"]  to rod ["+to+"]");
            return;
        }
        tower(n-1,from,aux,to);
        System.out.println("Moving disk "+(n)+" from rod ["+from+"]  to rod ["+to+"]");
        tower(n-1,aux,to,from);
    }
}
