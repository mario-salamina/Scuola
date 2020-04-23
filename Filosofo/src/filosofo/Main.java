package filosofo;

public class Main {
    public static void main(String[] args) {
        int i;
        Tavola M=new Tavola();
        Filosofo[] F=new Filosofo[M.getNF()];
        
        for(i=0;i<M.getNF();i++)
            F[i]=new Filosofo(M, i);
        
        for(i=0;i<M.getNF();i++)
            F[i].start();
    }
}