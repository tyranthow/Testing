
public class AppGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ������
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
               
            System.out.println("���ݿ��������سɹ� ��");
    
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("��ʼ�������ɹ�");
        System.out.println( "Hello World!" );
	}

}
