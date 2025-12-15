import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemChuTrongMangTest {
    DemChuTrongMang div;
    @BeforeEach
    public void setUp(){
        div = new DemChuTrongMang();
    }

    @Test
    public void HL_ChuoiBang3(){
      assertEquals(3,div.Dem("Bao"));
    }
    @Test
    public void HL_ChuoiChuaSo(){
        assertEquals(3,div.Dem("Bao6"));
    }
    @Test
    public void HL_ChuoiBangChuaKyTuDacBiet(){
        assertEquals(3,div.Dem("Bao@#"));
    }
    @Test
    public void HL_ChuoiGomSovaKyTuDacBiet(){
        assertEquals(3,div.Dem("Bao5%%34"));
    }
    @Test
    public void HL_ChuoiRong(){
        assertEquals(0,div.Dem(""));
    }
    @Test
    public void KHL_ChuoiNull(){
        assertThrows(NullPointerException.class ,() -> div.Dem(null));
    }
}