import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HotelInfo {
	public class HotelInfoTest{
		@Test
        public void test1(){
            int ordertime=20161106;
            MockOrder mo=new MockOrder("С��",ordertime,"��ҾƵ����̫����");
            HotelLineItem hli=new HotelLineItem(mo);
            HotelList hl=new HotelList();
            hl.addHotelLineItem(hli);
            assertEquals("С��",hl.orderName);
            assertEquals(ordertime,hl.orderTime);
            assertEquals("��ҾƵ����̫����",hl.evaluate);
        }
	}
}
