package com.alibaba.fastjson.issue_3000;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Issue3075 {
    @Test
    public void test_for_issue() throws Exception {
        SerializerFeature[] features = {
                SerializerFeature.BrowserSecure,
                // 消除对同一对象重复引用的优化
                SerializerFeature.DisableCircularReferenceDetect,
                // 将中文都会序列化为\Uxxxx 格式
                // 超过 −9007199254740992 到 9007199254740992 区间使用字符串，如："9007199254740993"
                // FIXME: 序列化的时候会导致空指针。
                SerializerFeature.BrowserCompatible,
                // 不隐藏为空的字段
                SerializerFeature.IgnoreNonFieldGetter,
                // map为Null，置为{}
                SerializerFeature.WriteMapNullValue,
                // Long、Integer、Short等number类型为Null，置为0
                SerializerFeature.WriteNullNumberAsZero,
                // Boolean为Null，置为false
                SerializerFeature.WriteNullBooleanAsFalse,
                // List为Null，置为[]
                SerializerFeature.WriteNullListAsEmpty,
                // String为Null，置为""
                SerializerFeature.WriteNullStringAsEmpty
        };

        JSON.toJSONString(new TestBasicBO(), features);
        JSON.toJSONString(new TestBO(), features);
    }

    @NoArgsConstructor
    @Data
    public static class TestBasicBO {
        String udgxhkk;
        String dvbvgtm;
        String cegnjlhiz;
        String tmztsttazf;
        List<Integer> dszukwrs;
        String stymi;
        Float uwobf;
        Float dcvnlfo;
        Float bjlrxreby;
        Float sgljt;
        Float irqtbtgugfk;
        Float usnvv;
        Float gfeqybelageu;
        Float bccbcqtb;
        Float znkdwgblhji;
        Float uktxicvsrxui;
        Float sujnyvlz;
        Integer grihhxsxehct;
        Integer vqyqv;
        Integer wiipi;
        Float sxdihakgyuja;
        Integer xpspehqs;
        Integer aiysq;
        Integer zdzbdg;
        Float pzhjnnvzsujn;
        Float wdyfoawjsupo;
        List<Integer> rtfskvdd;
        String txwrimwo;
        List<Integer> rlsueycznbec;
        Integer wiboqxnnyjby;
        Integer tpjgzadsl;
        Integer ncwzji;
        Integer gxslparv;
        Integer zcioiclpkc;
        Integer esjloj;
        Integer jrmzi;
        Integer coqxh;
        Integer csdylng;
        Integer fliuk;
        List<Integer> rbnbk;
        String kqclmytapnfm;
        Integer dqlndt;
        String ciergywnviyc;
        Float qffnfbmg;
        String hzases;
        Integer yfywdwpckn;
        String mfhkzjjtac;
        String egldba;
        Integer dsnkiipg;
        String owllvncxwc;
        String umcnrocpnk;
        Integer pzjnnkxkpu;
        String cbepkbipiwy;
        String sidtoadm;
        Integer gbebsls;
        String qdmjhio;
        String qwhctpjrqzl;
        Integer asqxntoueop;
        String diffdush;
        Integer bkieoangrm;
        List<Integer> comyayjvkvw;
        List<Integer> ndvjktzzuzzu;
        List<Integer> dmncb;
        List<Integer> aicnh;
        List<Integer> noznm;
        List<Integer> mtovpqvrvt;
        List<Integer> cyoeso;
        List<Integer> xexcw;
        List<Integer> nhtdqd;
        List<Integer> lqrcqrsuobml;
        List<Integer> pbsdnbzzdw;
        List<Integer> yxlqyliyqvrg;
        List<Integer> tmlmaoycqtuw;
        Integer ldcirqriayn;
        Float yiqgeq;
        Float olqnefjnprtz;
        Float shkfyrpytfa;
        Float tzcmipuj;
        Integer fklflsx;
        Integer walrdei;
        Integer qwqtkuqmsla;
        String nzqduoel;
        Integer otpza;
        String cctxjwhjmyi;
        Integer mzsgtnyfk;
        String ftskxhjtcb;
        Integer gbrujvscq;
        String dzxmmw;
        Integer rhqdugvayl;
        Integer aookder;
        String qscvra;
        Integer upyubsp;
        String shzagw;
        Integer tweniwhxvjjn;
        Integer tzkuser;
        Integer vkbutizlvwvv;
        String qzvhgpew;
        Integer wwrrphmki;
        String xsvhkcmil;
        Integer cyseso;
        String uaqnzjmxru;
        Integer ydmvnvwidrb;
        String xppwn;
        Integer egamsuczb;
        String sdgcotcjilz;
        Integer kxjkjlxllhqm;
        String ycmkvjnwnxw;
        Integer dnzba;
        Integer gtxrnyzeeay;
        Integer snhxyanxkjd;
        String qcbcy;
        List<Integer> ahiatnsb;
        String zuetqpbl;
        Integer dmalnj;
        String rhvkww;
        Integer ccipz;
        String batjsa;
        Integer xilrdu;
        String zcddn;
        Integer savddhvsw;
        String wpfkrmo;
        Integer lxwqeglqg;
        String pzrsbjwftbn;
        String bksteu;
        Float uldnytaqnvj;
        Float tniiqgfvku;
        Float pojntm;
        String tfgkvrve;
        Float lwtesutqb;
        Float owqfxakmzooj;
        Float cmmtltk;
        Float hekkfyhn;
        Float liedzk;
        Float yvmiaa;
        Float kprftdvaqi;
        Float lqookvn;
        Float bxpchxhsweq;
        Float poqkjonoof;
        Float qaioeuzuohn;
        Float pifwzgq;
        Float cdzuozdqwbgm;
        Float lbifqqimiv;
        Float pxsgjlv;
        Float tttkh;
        Float mbufzjclnhx;
        Float scxuelvrmxsn;
        Float bdptli;
        Float xczxonza;
        Float ldwssjxb;
        Float wiouipwwqjbg;
        Float vniafvt;
        Float vssktgubhnx;
        Float kflyvz;
        Integer aknemh;
        Integer nidynr;
        Integer bpwizpukvh;
        Integer crskvy;
        String licwnil;
        Integer ckanqgwvq;
        Integer bxztcjyhgpw;
        Integer nplybxzhxtsw;
        Integer fqdcmqlq;
        Integer crikxhlpbw;
        Float ejegbhvhbqkp;
        Float rhsvcd;
        Float mtbpgsnbkfa;
        Float fghdkkdl;
        Float lvnmyj;
        Integer bgsakgxawgjh;
        String nzvgyrodtsr;
        String abdrwew;
        Float amvfspvwb;
        Integer dqvyvmnmj;
        Float xowqdimpyxmw;
        Integer fkrdbixfma;
        Float hhufuxqln;
        Float uebyr;
        Float syavzsxriebg;
        Float zovgafxv;
        Float ctdcbxbkwoll;
        Float rinfpkytok;
        Float gpulotiilxcr;
        Float aovpmxvxpfg;
        Float zigtcxcepxc;
        Float mmavfb;
        Float mczfhudqhqa;
        Float nfqdpdkbxt;
        Float lcjdxon;
        Float xcmmtzhwraox;
        Float bajzw;
        Float fymfzjnu;
        Float etkfygf;
        Float dqlepesaxea;
        Float lwsuvrnsf;
        Float vbndsascz;
        Float aoxujoci;
        Integer jflepnqlqfrc;
        String crmxb;
        String lfxwl;
        Integer aajylvzrzdhf;
        String upoymzbopmks;
        String wohec;
        String eqaqhqbz;
        Integer oblaryua;
        String ibjqnseq;
        String xhwwq;
        Integer iyoak;
        String mimgsfedn;
        String gvoadzr;
        List<Integer> zsicdjrekfe;
        String aghymcgm;
        List<Integer> szqwrym;
        String nzwpcvb;
        List<Integer> yaqvf;
        String oofni;
        List<Integer> gywrntf;
        String vpliqryy;
        List<Integer> xghtojazsz;
        String rlpvlptk;
        Integer egntvt;
        String awoqmlx;
        Integer zpppbvgi;
        String gaioivdrwz;
        Integer lqmaz;
        List<String> tdblj;
        List<Integer> mmtavpe;
        List<Integer> mzxphtilz;
        Integer xohrlfdgjq;
        String surbjsnsnz;
        String ibcsu;
        String limfokbgjgr;
    }

    @NoArgsConstructor
    @Data

    public static class TestBO
            extends TestBasicBO {
        public String mlbkyxy;
        public List<Integer> sqhgpd;
        public List<Integer> nikawljmoafb;
        public String rphau;
        public Integer iwhjp;
        public String pjevuugkw;
        public List<Integer> orpkgtuiz;
        public String jsbxdscp;
        public String epnrgnejvfm;
        public Integer poeihbdfwe;
        public List<Integer> mzzaoocfntzn;
        public List<Integer> lrvkotdxp;
        public List<Integer> udkknpqpey;
        public Float uibav;
        public Integer owuwykgifldl;
        public String cjyxckl;
        public String lkfkoddqme;
        public Integer dkcggnjzgdzj;
        public Float gerjcltp;
        public String gcfaiwj;
        public Float bmuniiladuu;
        public List<Integer> fsuahyioln;
        public Integer knpvvsju;
        public Integer bimvkoauvkdm;
        public List<Integer> fnuxllxfcc;
        public List<Integer> udkpqjtlhxy;
        public String xtsrpb;
        public List<Integer> pmxbc;
        public String rtkvfukhtca;
        public Integer vnxnxg;
        public Float gipmqit;
        public Integer dzufoeglnsl;
        public List<Integer> wahnlujq;
        public Float brqaxsksnpqn;
        public Float mohysv;
        public String jmodsimfpxp;
        public Integer ypfimuf;
        public List<Integer> mfdmuwlxe;
        public Float zmgqqr;
        public List<Integer> vuofhyfnh;
        public Float ybizdwlx;
        public String tfqvadbpzanx;
        public Float orxtn;
        public List<Integer> kifznybnfvo;
        public String pjsdytj;
        public Float jobisey;
        public List<Integer> cnzsytgsrmh;
        public List<Integer> rqjdxemd;
        public String bfxxethqvyo;
        public String wgkkexdy;
        public Integer giyeovmj;
        public List<Integer> unhholw;
        public List<String> anseshsvz;
        public List<Double> ribmewsfzwcp;
        public List<Integer> tpwfr;
        public List<Integer> pxjsnytfth;
        public List<Integer> txsbr;
        public Integer nrodwidtchl;
        public List<Integer> ocugbk;
        public List<Integer> cirelkacd;
        public Integer hpqgpicypp;
        public List<Integer> lftecbun;
        public Float ygewofr;
        public String tgjcrxk;
        public Float csujsjzm;
        public String vxsusbwz;
        public String rpnafceep;
        public List<Integer> ytwxyenb;
        public String auhvjywewmo;
        public List<Integer> bbvsrb;
        public List<Integer> vzuftloqaal;
        public List<Integer> krjwsd;
        public String gkihfkuve;
        public String jikuil;
        public String rhdmpjyccf;
        public Integer mhrnx;
        public String yobhtwzf;
        public List<Integer> xeyoj;
        public Float cojoaar;
        public Float bjfkxougmw;
        public String geoilga;
        public List<Integer> xllrjzafquyu;
        public Float xobveiffhsdo;
        public List<Integer> dknpewwdh;
        public String oztdynn;
        public Integer vgddb;
        public String apiqmm;
        public List<Integer> dwjdwz;
        public String wurbwztjp;
        public Integer bseiv;
        public Float zxlysfuokb;
        public String qyfowxe;
        public String iipwsfy;
        public List<Integer> owsejqfkehjn;
        public List<Integer> ztzcv;
        public List<Integer> keygodzfjjmr;
        public List<Integer> bfzfijxvwyb;
        public List<Integer> idhvg;
        public Float sgzgfoadud;
        public String mhzspwrd;
        public Float yuldcj;
        public String bjwnfb;
        public String tlzzjt;
        public List<Integer> tgmul;
        public Float pnsryayelzxt;
        public Float afmdfca;
        public String vxbalqkel;
        public String gaqrvygvjili;
        public Integer qhvoxqalg;
        public String hegjib;
        public String hvbxpgeqek;
        public List<Integer> lpkzkgnya;
        public List<Integer> tbtickvxvho;
        public String mvbciywiejs;
        public String ijcczoqij;
        public String vddps;
        public List<Integer> qomzusabz;
        public Float xqcsrts;
        public Float zqafkvntsh;
        public List<Integer> byygmcw;
        public Integer zwysdiaiev;
        public Float dstftqztrl;
        public List<Integer> wvybkavzf;
        public Integer ujoqlrrgflnf;
        public List<Integer> sbsmqzxj;
        public List<Integer> lkasladbez;
        public String ydmgeywpquba;
        public String vufcvrt;
        public Integer jzhbuueld;
        public List<Integer> nminfrgyts;
        public Integer rxtpyhghh;
        public List<Integer> xvncumabdfhq;
        public Float ftjrvcptykxx;
        public String torraglirgs;
        public Integer jomkavscsf;
        public String duvhc;
        public String czxnlbt;
        public List<Integer> qloaj;
        public String wlircmcfea;
        public String tpbcqj;
        public String otrjwwnsssd;
        public String vkofzdftinz;
        public Float ftinjqovg;
        public String innprvmyj;
        public String ynjqvcudywdy;
        public Float rpdtnenuwr;
        public List<Integer> xiywwxjjhlc;
        public Integer htuwbznbz;
        public String kzqkncbcdcu;
        public List<Integer> xzhor;
        public String sidrpoy;
        public Float ltpmidzjd;
        public List<Integer> lwyuyni;
        public List<Integer> rdsab;
        public List<Integer> kmmoxpxw;
        public Float qtcrtcarxhy;
        public String nvdqgvebdvxw;
        public List<Integer> brvmir;
        public List<Integer> lhfsw;
        public List<Integer> fobff;
        public Float wontvjkp;
        public List<Integer> vrsegwx;
        public List<Integer> mdbyf;
        public Float anpevc;
        public String krtrsevahzu;
    }
}
