
public interface CustomerBLService_Stub implements CustomerBLService{
	String customerName;//�ͻ�������
	int[] customerPhone;//�ͻ�����ϵ�绰
	Long creditNumber;//�ͻ�������ֵ
	String customerBirthday;//��Ա�ͻ�������
	String companyName;//��ҵ�ͻ�����ҵ����
	ArrayList<order> orderList;//������¼
    public CustomerBLService_Stub(String cun,int[] cp,long crn,String cb,String con,ArrayList<order> or){
    	customerName=cun;
    	customerPhone=cp;
    	creditNumber=crn;
    	customerBirthday=cb;
    	companyName=con;
    	orderList=or;
    }
	public void changeCustomer(long id){
		customerName="��ǿ";
		customerPhone={1,3,2,1,2,2,2,1,3};
		creditNumber=2626;
		customerBirthday="19900523";
		companyName="���ǹ���";
		orderList=��
		
	}
}
