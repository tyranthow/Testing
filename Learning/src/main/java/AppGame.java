
public class AppGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
               
            System.out.println("数据库驱动加载成功 ！");
    
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("初始化驱动成功");
        System.out.println( "Hello World!" );
	}

}
