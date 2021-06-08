import java.util.ArrayList;

class LibMaterial {
    protected String id;
    protected Boolean available;
    protected String author;
    void changeState(String id,Boolean available,String author) {
        this.id = id;
        this.available = available;
        this.author = author;
    }
}

class  Text extends LibMaterial{
    int numPage;
    Text(int numPage){
        this.numPage = numPage;
    }
}

class  Audio extends LibMaterial{
    double duration;
    Audio(double duration){
        this.duration = duration;
    }
}

class  Video extends LibMaterial{
    double duration;
    Video(double duration){
        this.duration = duration;
    }
}

class LoanService {
    int numberOfLoans;
    int activeLoans;



    public static void main(String[] args) {
        LibMaterial[] library = {
                new Text(255),
                new Audio(12.56),
                new Video(60.21)
        };


    }
    static boolean isAvailable(LibMaterial m){
        return  m.available;
    }
    static void makeLoan(User u,LibMaterial m){
        m.changeState(u.id, true,u.name+" "+u.surname);
    }
}

class User {
    protected String  name;
    protected String surname;
    protected String id;
    public ArrayList<LibMaterial[]> shelf;
    LibMaterial[] loans(){
        return (LibMaterial[]) this.shelf.toArray();
    }
    LibMaterial[] activeBooking(){
        return null;
    }
}