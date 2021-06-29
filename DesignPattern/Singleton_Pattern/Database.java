package DesignPattern.Singleton_Pattern;

public class Database {
    private static Database database;


    private Database(){
        Integer curr = 0;
    }

    public static Database getInstance(){
        if(Database.database == null)
            Database.database = new Database();
        return database;
    }

    public void update(){
        System.out.println("Access Database");
    }

}