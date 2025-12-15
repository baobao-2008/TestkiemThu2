import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrungBinhCongTest {
    TrungBinhCong div;
    @BeforeEach
    public void setUp(){
        div = new TrungBinhCong();
    }
@Test
    public void HL_TrungBinhCong3DiemBang3(){
        double thucTe= div.tinhDiem(3,3,3);
        double mongMuon= 3.0;
        assertEquals(thucTe,mongMuon);
}
    @Test
    public void KHL_DiemToanDuoi0(){
        assertThrows(IllegalArgumentException.class,() -> div.tinhDiem(-5,4,5));
    }
    @Test
    public void KHL_DiemLyLonHon10(){
        assertThrows(IllegalArgumentException.class,() -> div.tinhDiem(5,4,13));
    }
    @Test
    public void KHL_DiemHoaBeHon0(){
        assertThrows(IllegalArgumentException.class,() -> div.tinhDiem(5,-3,5));
    }
    @Test
    public void KHL_3Diembang0(){
        assertEquals(0.0,div.tinhDiem(0,0,0));
    }
}