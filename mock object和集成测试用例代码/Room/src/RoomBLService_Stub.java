
public interface RoomBLService_Stub implements RoomBLService{
	String roomType;//��������
	int roomTotalNumber;//����������
	int roomAccessNumber;//��Ԥ���ķ�������
	int roomPrice;//����۸�
	
	public RoomBLService_Stub(String rt,int rtn,int ran,int rp){
		roomType=rt;
		roomTotalNumber=rtn;
		roomAccessNumber=ran;
		roomPrice=rp;
	}
	public void changeRoom(RoomVO vo){
		roomType="���˷�";
		roomTotalNumber=13;
		roomAccessNumber=5;
		roomPrice=199;
	}
	public void addRoom(RoomVO vo){
		roomType="˫�˷�";
		roomTotalNumber=8;
		roomAccessNumber=3;
		roomPrice=398;
	}
}
