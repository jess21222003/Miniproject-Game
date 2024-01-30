
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Gpsjdbc1 {
	static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
    static String dbUname="root";
    static String dbPassword="";
    static String dbDriver="com.mysql.cj.jdbc.Driver";
    
   int userinput,rn; 
   static String hname,name,number,email,password,name1,password1,result; 
   
    static int n=1;
    Gpsjdbc1(String name,String number,String email,String password){
	   this.name=name;
	   this.number=number;
	   this.email=email;
	   this.password=password;
   }
    
    Gpsjdbc1(String name1,String password1){
 	   this.name1=name1; 
 	   this.password1=password1;
 	   //System.out.print(name1+" "+password1);
    }

//    Gpsjdbc1(int n){
//    	this.n=n;
//    }
    
    Gpsjdbc1(String hname,int userinput,int rn){
    	this.hname=hname;
    	this.userinput=userinput;
    	this.rn=rn;
    }
    
    
    void validate() {
    	
    	Connection con = null;
   		try {
			Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
			String sql = "insert into sample (name,number,email,password)"
					+ "values('"+name+"','"+number+"','"+email+"','"+password+"')";
			
			Statement s = con.createStatement();
			s.execute(sql);
		   	con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
boolean login() {
		Connection con = null;
//		System.out.println(name1);
//		Scanner sc=new Scanner(System.in); 
   		try {
		Class.forName(dbDriver);  //class not found exception
		con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);  
		String sql="select * from sample where name='"+name1+"' and password='"+password1+"'" ;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next())  
		   return true; 
	    else  {
		   return false; 
		}	
//		con.close(); 
   		}

   		catch (Exception e) {
			e.printStackTrace();
		}
   		return false;
	}      
        

    void update(int us) {
	  
	   Connection con = null;

  		try {
			Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword); 
			
			String sql = "insert into score (name,count)"
					+ "values('"+hname+"','"+us+"')";
			
			Statement s = con.createStatement();
			s.execute(sql);
		   	con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	   }
	   
	  
    


}