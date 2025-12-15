import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HocLucTest {
    HocLuc div;
    @BeforeEach
    public void setUp(){
        div = new HocLuc();
    }
 @Test
    public void HL_DiemBang9(){
        String thucTe = div.hocLuc(9.0);
        String mongMuong ="Xuất sắc";
        assertEquals(thucTe,mongMuong);
 }
    @Test
    public void HL_DiemBang7(){
        String thucTe = div.hocLuc(7.0);
        String mongMuong ="Giỏi";
        assertEquals(thucTe,mongMuong);
    }
    @Test
    public void HL_DiemBang5(){
        String thucTe = div.hocLuc(5.0);
        String mongMuong ="Trung Bình";
        assertEquals(thucTe,mongMuong);
    }
    @Test
    public void HL_DiemBang4(){
        String thucTe = div.hocLuc(4.0);
        String mongMuong ="yếu";
        assertEquals(thucTe,mongMuong);
    }
    @Test
    public void HL_DiemBang11(){
        assertThrows(IllegalArgumentException.class,()->div.hocLuc(11));
    }
}