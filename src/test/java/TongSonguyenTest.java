import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongSonguyenTest {
    TongSonguyen div;
    @BeforeEach
    public void setUp(){
        div = new TongSonguyen();
    }
@Test
    public void HL_soBangmin(){
        int[] arr={0,4,2,6,8};
        int thucTe = div.tinhTong(arr);
        int mongMuon = 20;
        assertEquals(thucTe,mongMuon);
}
    @Test
    public void HL_soBangminCong1(){
        int[] arr={1,4,2,6,8};
        int thucTe = div.tinhTong(arr);
        int mongMuon = 21;
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_soBangmax(){
        int[] arr={100,4,2,6,8};
        int thucTe = div.tinhTong(arr);
        int mongMuon = 120;
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_soBangmaxtru1(){
        int[] arr={99,4,2,6,8};
        int thucTe = div.tinhTong(arr);
        int mongMuon = 119;
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void KHL_soBangmaxcong1(){
      assertThrows(IllegalArgumentException.class,()->div.tinhTong(new int[]{0,8,101}));
    }
    @Test
    public void KHL_soBangminTru1(){
        assertThrows(IllegalArgumentException.class,()->div.tinhTong(new int[]{0,8,-1}));
    }
}