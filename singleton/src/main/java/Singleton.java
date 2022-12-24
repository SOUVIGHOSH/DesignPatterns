public class Singleton {

    public static Singleton Instance = null;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if(Instance==null) Instance=new Singleton();
        return Instance;
    }
}
