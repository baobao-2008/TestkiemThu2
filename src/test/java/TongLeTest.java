import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongLeTest {
    TongLe tong;
    @BeforeEach
    public void setUp(){
        tong = new TongLe();
    }

    @Test
    public void HL_tongLeBang1min(){
      int[] soLe = {0,0,1};
      int thucTe = 1;
      int mongMuon = tong.tongLe(soLe);
      assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_tongLeBangmincong1(){
        int[] soLe = {2,1,0};
        int thucTe= 1;
        int mongMuon = tong.tongLe(soLe);
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_tongLeBangmax(){
        int[] soLe = {1000,0,3};
        int thucTe = 3;
        int mongMuon = tong.tongLe(soLe);
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_TongLeBangMaxTru1(){
        int[] soLe= { 999, 3,0};
        int thucTe = 1002;
        int mongMuon = tong.tongLe(soLe);
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void KHL_TongLeBangMaxCong1(){
        int[] soLe= { 1001, 3,0};
        assertThrows(IllegalArgumentException.class ,()-> tong.tongLe(soLe));
    }
    @Test
    public void KHL_TongLeBangMintru1(){
        int[] soLe= { -1, 3,0};
        assertThrows(IllegalArgumentException.class ,()-> tong.tongLe(soLe));
    }
}