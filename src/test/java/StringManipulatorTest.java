import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    StringManipulator div;
    @BeforeEach
    public void setUp(){
        div= new StringManipulator();
    }
    @Test
    public void HL_Cong2ChuoiLaBaoAndVan(){
        String thucTe = div.CongChuoi("Bao","Van");
        String mongMuon = "BaoVan";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_Cong2ChuoiRong(){
        String thucTe = div.CongChuoi("","");
        String mongMuon = "";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void KHL_CongChuoi1null(){
        assertThrows(NullPointerException.class,()->div.CongChuoi(null,"b"));
    }
    @Test
    public void KHL_CongChuoi2null(){
        assertThrows(NullPointerException.class,()->div.CongChuoi("c",null));
    }
    @Test
    public void KHL_CongChuoi1and2null(){
        assertThrows(NullPointerException.class,()->div.CongChuoi(null,null));
    }

}