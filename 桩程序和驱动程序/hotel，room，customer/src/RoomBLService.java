
public interface RoomBLService {
	//��ȡ������Ϣ
	public RoomVO getRoom(long id);
	//�ı䷿����Ϣ
	public void changeRoom(RoomVO vo);
	//�����Ըı䷿����Ϣ����������
	public void addRoom(RoomVO vo);
}
