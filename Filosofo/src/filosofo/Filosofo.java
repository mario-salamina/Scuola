package filosofo;



public class Filosofo extends Thread {
    
    private final Tavola m; 
    private final int i; 
    
    public  Filosofo(Tavola M, int id) {
        this.m=M;
        this.i=id;
    }
    
    @Override
    public void run() {
        try{
            while(true) {
                System.out.print("Filosofo "+ i+" pensa....\n");
                m.prendiForchette(i);
                System.out.print("Filosofo "+ i+" mangia....\n");
                sleep(8);
                m.rilasciaForchette(i); sleep(100);
            }
        }
        catch(InterruptedException e){}
    }
}
