import java.util.*;
import java.sql.*;
class Userview {
    private Connection conn=null;
    Scanner in=new Scanner(System.in);
    public Userview(){
        if(conn==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/careerManagementSystem", "root", "GuruDev20**");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public int input(){
        int i=in.nextInt();
        in.nextLine();
        return i;
    }
    public int id(){
        int id=in.nextInt();
        in.nextLine();
        return id;
    }
    public String username(){
        String username=in.next();
        in.nextLine();
        return username;
    }
    public String email(){
        String email=in.next();
        in.nextLine();
        return email;
    }
    public String phone(){
        String phone=in.next();
        in.nextLine();
        return phone;
    }
    public String education(){
        String education=in.next();
        in.nextLine();
        return education;
    }
    public String skills(){
        String skills=in.next();
        in.nextLine();
        return skills;
    }
    public String experience(){
        String experience=in.next();
        in.nextLine();
        return experience;
    }
    public void display(int id) throws Exception{
        try{
            Statement s=conn.createStatement();
            String query="SELECT * FROM jobseekers WHERE id="+id;
            ResultSet rs=s.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}