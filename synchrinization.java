class alternative{
    boolean turn=true;
    synchronized void printodd(int n) throws Exception{
        if(!turn)
        {
            wait();
        }
        System.out.println("odd:"+n);
        turn=false;
        notify();

    }
    synchronized void printeven(int n) throws Exception{

    }
}