
public interface HotelBLService_Stub implements HotelBLService{
	String hotelName;//�Ƶ�����
	String hotelLocation;//�Ƶ��ַ
	int[] hotelPhone;//�Ƶ���ϵ�绰
	int stars;//�Ƶ��Ǽ�
	ArrayList<evaluation> eva;//�Ƶ�����
	
	public HotelBLService_Stub(String hn,String hl,int[] hp,int st,ArrayList<evaluation> el){
		hotelName=hn;
		hotelLocation=hl;
		hotelPhone=hp;
		stars=st;
		eva=el;
		
	}
	public void addEvaluation(long id,String str){
		id=56776;
		str="����ܺ�";
	}
	public void changeHotel(HotelVO vo){
		hotelName="����";
		hotelLocation="�Ͼ���ѧ����";
		hotelPhone={2,3,2,2,1,3,2,2};
		stars=5;
		eva=el;
	}
}
