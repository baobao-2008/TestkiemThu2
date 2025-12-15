import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServicwTest {
SanPhamServicw div;
@BeforeEach
    public void setUp(){
    div = new SanPhamServicw();
}
@Test
    public void HL_themSanPhamHopLe(){
    SanPham sp = new SanPham("th06015","BaoBao",44,456,3,"khoogn biết");
    div.them(sp);
}
    @Test
    public void HL_themSoluongMin(){
        SanPham sp = new SanPham("th06015","BaoBao",44,456,1,"khoogn biết");
        div.them(sp);
    }
    @Test
    public void HL_themSoluongMinCong1(){
        SanPham sp = new SanPham("th06015","BaoBao",44,456,2,"khoogn biết");
        div.them(sp);
    }
    @Test
    public void HL_themSoluongMax(){
        SanPham sp = new SanPham("th06015","BaoBao",44,456,100,"khoogn biết");
        div.them(sp);
    }
    @Test
    public void HL_themSoluongMaxtru1(){
        SanPham sp = new SanPham("th06015","BaoBao",44,456,99,"khoogn biết");
        div.them(sp);
    }
    @Test
    public void KHL_themSoluongMaxCong1(){
        SanPham sp = new SanPham("th06015","BaoBao",44,456,101,"khoogn biết");
    assertThrows(IllegalArgumentException.class,()->div.them(sp));
    }
    @Test
    public void KHL_themSoluongMintru1(){
        SanPham sp1 = new SanPham("th06015","BaoBao",44,456,99,"khoogn biết");
        div.them(sp1);
        SanPham sp = new SanPham("th06015","BaoBao",44,456,-1,"khoogn biết");
        assertThrows(IllegalArgumentException.class,()->div.them(sp));
    }
    @Test
    public void HL_SuaSoLuongHopLe(){
    SanPham sp = new SanPham("TH06015","BaoBao",5,545234,3,"Không biết");
    div.them(sp);
        SanPham spm = new SanPham("TH06015","BaoBaoo",4,545234,37,"Không biết");
        div.sua(spm,"TH06015");
    }
    @Test
    public void HL_SuaMin(){
    SanPham sp = new SanPham("TH06015","Baobao",3,334,34,"Không biết");
    div.them(sp);
        SanPham sp1 = new SanPham("TH06015","Baobao",3,334,1,"Không biết");
        div.sua(sp1,"TH06015");
    }
    @Test
    public void HL_SuaMinCong1(){
        SanPham sp = new SanPham("TH06015","Baobao",3,334,34,"Không biết");
        div.them(sp);
        SanPham sp1 = new SanPham("TH06015","Baobao",3,334,2,"Không biết");
        div.sua(sp1,"TH06015");
    }
    @Test
    public void HL_SuaMax(){
        SanPham sp = new SanPham("TH06015","Baobao",3,334,34,"Không biết");
        div.them(sp);
        SanPham sp1 = new SanPham("TH06015","Baobao",3,334,100,"Không biết");
        div.sua(sp1,"TH06015");
    }
    @Test
    public void HL_SuaMaxTru1(){
        SanPham sp = new SanPham("TH06015","Baobao",3,334,34,"Không biết");
        div.them(sp);
        SanPham sp1 = new SanPham("TH06015","Baobao",3,334,99,"Không biết");
        div.sua(sp1,"TH06015");
    }
    @Test
    public void KHL_SuaMaxCong1(){
        SanPham sp = new SanPham("TH06015","Baobao",3,334,101,"Không biết");
        assertThrows(IllegalArgumentException.class,()->div.sua(sp,"TH06015"));
    }
    @Test
    public void KHL_SuaMintru1(){
        SanPham sp = new SanPham("TH06015","Baobao",3,334,-1,"Không biết");
        assertThrows(IllegalArgumentException.class,()->div.sua(sp,"TH06015"));
    }
    @Test
    public void KHL_SuaMaDaTonTai(){
        SanPham sp = new SanPham("TH06015","Baobao",3,334,34,"Không biết");
        div.them(sp);
        SanPham sp2 = new SanPham("TH06016","Baobao",3,334,34,"Không biết");
        div.them(sp2);
        SanPham sp1 = new SanPham("TH06015","Baobao",5,334,6,"Không biết");
        assertThrows(IllegalArgumentException.class,()->div.sua(sp1,"sp2"));
    }
}