import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraChanLeTest {
    KiemTraChanLe div;
    @BeforeEach
    public void setUp(){
        div = new KiemTraChanLe();
    }
@Test
    public void HL_So0min(){
        String thucTe = div.ChanLe(0);
        String mongMuon = "Chan";
        assertEquals(thucTe,mongMuon);
}
    @Test
    public void HL_Somax(){
        String thucTe = div.ChanLe(1000);
        String mongMuon = "Chan";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_SominCong1(){
        String thucTe = div.ChanLe(1);
        String mongMuon = "le";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void HL_Somaxtru1(){
        String thucTe = div.ChanLe(999);
        String mongMuon = "le";
        assertEquals(thucTe,mongMuon);
    }
    @Test
    public void KHL_SomaxCong1(){
        assertThrows(IllegalArgumentException.class,()-> div.ChanLe(1001));
    }
    @Test
    public void KHL_Somintru1(){
        assertThrows(IllegalArgumentException.class,()-> div.ChanLe(-1));
    }
}