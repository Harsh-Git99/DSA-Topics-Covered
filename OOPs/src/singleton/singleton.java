package singleton;

public class singleton {
    //it's a class which can only create one object.

    private singleton(){

    }

    private  static singleton instance;

    public static  singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}
