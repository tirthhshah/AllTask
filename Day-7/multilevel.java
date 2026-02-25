@SuppressWarnings("unused")
class multilevel{
    public static void main(String[] args){
       
       activa c = new activa(); 
        c.car();
        c.bike();
        c.activa();
     
    }
}
class car{
    void car(){
        System.out.println("THIS IS CAR");
    }
}

class bike extends car{
    void bike(){
        System.out.println("THIS IS BIKE");
    }
}

class activa extends bike{
    void activa(){
        System.out.println("THIS IS ACTIVA");
    }
} 
