
public interface HotelBLService {
	//��ȡ�Ƶ��ⲿ��Ϣ
	public HotelVO getHotel(HotelVO vo);
	//���ӶԾƵ������
	public void addEvaluation(long id,String str);
	//�ı�Ƶ���ⲿ��Ϣ
	public void changeHotel(HotelVO vo);
}
