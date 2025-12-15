import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimViTriChuoikyTuSoTest {
    TimViTriChuoikyTuSo div;
    @BeforeEach
    public void setUp(){
        div = new TimViTriChuoikyTuSo();
    }
@Test
    public void HL_ChuoiOViTri2(){
        String[] arr = {"bao","Van","Hoa"};
        int thuTe = div.findString(arr,"Van");
        int mongMuon = 1;
        assertEquals(thuTe,mongMuon);
}
    @Test
    public void HL_ChuoiRong(){
        String[] arr = {""};
        int thuTe = div.findString(arr,"");
        int mongMuon = 0;
        assertEquals(thuTe,mongMuon);
    }
    @Test
    public void HL_KhongTimThayChuoi(){
        String[] arr = {"bo","ba"};
        int thuTe = div.findString(arr,"bc");
        assertEquals(thuTe,-1);
    }
    @Test
    public void KHL_mangNull(){
        assertThrows(NullPointerException.class,()->div.findString(null,"bao"));
    }
    @Test
    public void KHL_chuoiNull(){
        assertThrows(NullPointerException.class,()->div.findString(new String[]{"Bao","van"},null));
    }
}