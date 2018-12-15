package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.C0612h;
import fr.pcsoft.wdjava.core.application.WDProcedureInterne;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDEntier1;
import fr.pcsoft.wdjava.core.types.WDEntier2;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.core.types.WDNull;
import fr.pcsoft.wdjava.core.types.WDProcedure;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.WDVoid;
import fr.pcsoft.wdjava.core.types.cb;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.ui.champs.db;
import java.math.BigDecimal;

public abstract class WDObjet implements Cloneable, C0486m {
    public static final WDVoid ElementCourant = new WDVoid();
    public static final WDBooleen ErreurDetectee = new C0746s(false);
    public static final WDNull NULL = WDNull.m3259c();
    /* renamed from: z */
    private static final String[] f804z;

    static {
        String[] strArr = new String[C0607n.Nr];
        strArr[0] = m1292z(m1293z("W\u0000v\\11\rl"));
        strArr[1] = m1292z(m1293z("W\u0000xV75\u0004|M31\u0011m[&5\u000f"));
        strArr[2] = m1292z(m1293z("W\u0013v^,7\u0006f[15\u000fpC01"));
        strArr[3] = m1292z(m1293z("W\u000fpS,'\fwM#=\u0000q[ &"));
        strArr[4] = m1292z(m1293z("W\u0015pA,6\u000f|M,:\nm[$8"));
        strArr[5] = m1292z(m1293z("W\u0006u^,$\u0010|"));
        strArr[6] = m1292z(m1293z("W\rv_:0\u0006z@, "));
        strArr[7] = m1292z(m1293z("W\u000el^1=\u000fpU+1"));
        strArr[8] = m1292z(m1293z("W\fiW75\u0017p]++\nwF &\u0007pF "));
        strArr[9] = m1292z(m1293z("9,]g\t\u001b"));
        strArr[10] = m1292z(m1293z("W\u0007vG'8\u0006fQ)=\u0000"));
        strArr[11] = m1292z(m1293z("W\u0001v@+1\u001ct[+"));
        strArr[12] = m1292z(m1293z("W\u0013k]5&\n|F +\u000f|Q1!\u0011|M61\u0016uW"));
        strArr[13] = m1292z(m1293z("W\u000fpU+1"));
        strArr[14] = m1292z(m1293z("W\u0013v^,7\u0006f\\*9"));
        strArr[15] = m1292z(m1293z("W\u0013x@1=\u0006fZ !\u0011|"));
        strArr[16] = m1292z(m1293z("W\u0001x@71\u001ctW6'\u0002~W"));
        strArr[17] = m1292z(m1293z("W\u000b|G71"));
        strArr[18] = m1292z(m1293z("W\rvG31\u000ffW+&\u0006~[6 \u0011|_ :\u0017"));
        strArr[19] = m1292z(m1293z("W\ntS\"1\u001c}W7;\u0016uW "));
        strArr[20] = m1292z(m1293z("W\u0010mK)1\u001c]+0"));
        strArr[21] = m1292z(m1293z("W\u000e|\\0+\u0000v\\11\u001bmG 8"));
        strArr[22] = m1292z(m1293z("W\u000bxG11\u0016kM,:\nm[$8\u0006"));
        strArr[23] = m1292z(m1293z("W\u0005pQ-=\u0006kM55\u0011z]0&\u0016"));
        strArr[24] = m1292z(m1293z("W\u000evV +\u000fpA11\u001cp_$3\u0006"));
        strArr[25] = m1292z(m1293z("W\u0000u[&+\u0007k], "));
        strArr[26] = m1292z(m1293z("W\u0010|Q0&\nmW:<\u0017t^"));
        strArr[27] = m1292z(m1293z("/\u0018\u0019O8"));
        strArr[28] = m1292z(m1293z("W\fiW75\u0017|G7+\nwQ*9\u0013xF,6\u000f|"));
        strArr[29] = m1292z(m1293z("W\u0002w[(5\u0017p]++\nw[1=\u0002uW"));
        strArr[30] = m1292z(m1293z("W\u0017x[)8\u0006"));
        strArr[31] = m1292z(m1293z("W\u0000l@61\u0016k"));
        strArr[32] = m1292z(m1293z("W\u0000v\\+1\u001bp]+"));
        strArr[33] = m1292z(m1293z("W\rvF "));
        strArr[34] = m1292z(m1293z("W\u0005v@(5\u0017f_ 9\fk[61"));
        strArr[35] = m1292z(m1293z("W\u0006wT*:\u0000|"));
        strArr[36] = m1292z(m1293z("8&\u0019b\u0017\u0011.Pw\u0017T3X`\u0004\u0019«M`\u0000T'\\2\t\u0015c_}\u000b\u00177P}\u000bT\u0014us\u000b\u0013\"^wE\u001ad\\a\u0011T3XaE\u0001-\u0019E!;!Sw\u0011Z"));
        strArr[37] = m1292z(m1293z("W\u0002uF, \u0016}W"));
        strArr[38] = m1292z(m1293z("W\u000bxG11\u0016k"));
        strArr[39] = m1292z(m1293z("W\u0002T 7\u0017xF,;\rf[($\fjA,6\u000f|"));
        strArr[40] = m1292z(m1293z("W\u000fx@\"1\u0016kM(=\r"));
        strArr[41] = m1292z(m1293z("W\u0015x^ !\u0011fV 2\u0002lF"));
        strArr[42] = m1292z(m1293z("W\u000el^1=\u0010|^ 7\u0017p]+"));
        strArr[43] = m1292z(m1293z("W\u0017k[$6\u000f|"));
        strArr[44] = m1292z(m1293z("W\u000bxG11\u0016kM(=\r"));
        strArr[45] = m1292z(m1293z("W\u0005pQ-=\u0006kM*&\n~[+1"));
        strArr[46] = m1292z(m1293z("W\u000fx@\"1\u0016kM,9\u0002~W"));
        strArr[47] = m1292z(m1293z("W\u0007wV&=\u0001uW"));
        strArr[48] = m1292z(m1293z("W\nwV,7\u0006"));
        strArr[49] = m1292z(m1293z("W\u000ep\\,5\u0017l@ "));
        strArr[50] = m1292z(m1293z("W\u0015pA,6\u000f|"));
        strArr[51] = m1292z(m1293z("W\rl_: \u0002{"));
        strArr[52] = m1292z(m1293z("W\u0013v^,7\u0006fP$&\u0011|W"));
        strArr[53] = m1292z(m1293z("W\r{M7!\u0001k[4!\u0006"));
        strArr[54] = m1292z(m1293z("W\u0000xV75\u0004|M-;\u0011pH*:\u0017x^"));
        strArr[55] = m1292z(m1293z("W\r{M&;\u000ei]65\rmW"));
        strArr[56] = m1292z(m1293z("W\u0015x^ !\u0011f_ 9\fk[61\u0006"));
        strArr[57] = m1292z(m1293z("W\u0002wQ75\u0004|"));
        strArr[58] = m1292z(m1293z("W\u0010|^ 7\u0017p]+:\u0006|"));
        strArr[59] = m1292z(m1293z("W\u0013uS+"));
        strArr[60] = m1292z(m1293z("W\rl^)+\u0010lB5;\u0011mW "));
        strArr[61] = m1292z(m1293z("W\u0013k]5&\n|F +\nwF &\u0007pF +p"));
        strArr[62] = m1292z(m1293z("W\u000evV,2\n|"));
        strArr[63] = m1292z(m1293z("W\u0007|B)5\u0000xP)1"));
        strArr[64] = m1292z(m1293z("W\r{M7!\u0001k[4!\u0006f_ 9\f"));
        strArr[65] = m1292z(m1293z("W\u001af[+=\u0017pS)"));
        strArr[66] = m1292z(m1293z("W\ntS\"1\u001c|\\7;\u0016uW "));
        strArr[67] = m1292z(m1293z("W\u0001p\\$=\u0011|"));
        strArr[68] = m1292z(m1293z("W\ntS\"1\u001c|F$ "));
        strArr[69] = m1292z(m1293z("W\u0000vQ-1\u0006"));
        strArr[70] = m1292z(m1293z("W\u0017xG=+\u0002wQ75\u0004|M'5\u0010"));
        strArr[71] = m1292z(m1293z("W\u0010vG6+\u000fpP 8\u000f|"));
        strArr[72] = m1292z(m1293z("W\u001af[(5\u0004|"));
        strArr[73] = m1292z(m1293z("W\u000ep\\0 \u0006"));
        strArr[74] = m1292z(m1293z("W\u000e|_*"));
        strArr[75] = m1292z(m1293z("W\u000fpP &\u0002m[*:\u001cvP/1\u0017f\\*:\u001c}K+5\u000epC01"));
        strArr[76] = m1292z(m1293z("W\fzQ0&\u0011|\\&1"));
        strArr[77] = m1292z(m1293z("W\u0002u[$'"));
        strArr[78] = m1292z(m1293z("W\rv_"));
        strArr[79] = m1292z(m1293z("W\u000fx@\"1\u0016kM(5\u001b"));
        strArr[80] = m1292z(m1293z("W\u000evF:$\u0002jA "));
        strArr[81] = m1292z(m1293z("W\u000ev[6"));
        strArr[82] = m1292z(m1293z("W\u0006mS1"));
        strArr[83] = m1292z(m1293z("W\u0000uW:7\ftB*'\u0006|"));
        strArr[84] = m1292z(m1293z("W\rl_ &\nhG "));
        strArr[85] = m1292z(m1293z("W\u0006mS1+\nw[1=\u0002u"));
        strArr[86] = m1292z(m1293z("W\rvM1-\u0013|M*6\t|F"));
        strArr[87] = m1292z(m1293z("W\u0000v^*:\r|"));
        strArr[88] = m1292z(m1293z("W\u0001l^)1\u001cm[1&\u0006"));
        strArr[89] = m1292z(m1293z("W\u0000vG)1\u0016kM/5\u0016~W"));
        strArr[90] = m1292z(m1293z("W\u0017xG=+\u0002wQ75\u0004|M-5\u0016mW0&"));
        strArr[91] = m1292z(m1293z("W\u0001xA +\u0007|M!;\rwW '"));
        strArr[92] = m1292z(m1293z("W\rl^)"));
        strArr[93] = m1292z(m1293z("W\u000fx@\"1\u0016kM,:\nm[$8\u0006"));
        strArr[94] = m1292z(m1293z("W\ntS\"1\u001ct]!1"));
        strArr[95] = m1292z(m1293z("W\u0005|\\  \u0011|M6;\u0016kQ "));
        strArr[96] = m1292z(m1293z("W\u0017k[ 1"));
        strArr[97] = m1292z(m1293z("W\u001bf[(5\u0004|"));
        strArr[98] = m1292z(m1293z("W\u0011lP7=\u0012lW:5\u0005[&<\u0006|"));
        strArr[99] = m1292z(m1293z("W\ntS\"1"));
        strArr[100] = m1292z(m1293z("W\u0017`B "));
        strArr[101] = m1292z(m1293z("W\u0013v^,7\u0006fF$=\u000fuW"));
        strArr[102] = m1292z(m1293z("W\u0007xF +\u0005p\\"));
        strArr[103] = m1292z(m1293z("W\u0001l^)1"));
        strArr[104] = m1292z(m1293z("W\u0001v@+1\u001ctS="));
        strArr[105] = m1292z(m1293z("W\u0017|J11"));
        strArr[106] = m1292z(m1293z("W\u0017`B +\u0017k["));
        strArr[107] = m1292z(m1293z("W\u0011lP7=\u0012lW:;\u0011pU,:\u0006"));
        strArr[108] = m1292z(m1293z("W\u0002w[(5\u0017p]+"));
        strArr[109] = m1292z(m1293z("W\u000bxG11\u0016kM)=\u0004wW"));
        strArr[110] = m1292z(m1293z("W\rvG31\u0002l"));
        strArr[111] = m1292z(m1293z("W\u000fx@\"1\u0016k"));
        strArr[112] = m1292z(m1293z("W\tvG7"));
        strArr[113] = m1292z(m1293z("W\u0007wV6;\u0016kQ "));
        strArr[114] = m1292z(m1293z("W\rv_:$\u000b`A,%\u0016|M!1\u0000k[1"));
        strArr[115] = m1292z(m1293z("W\u0000vG)1\u0016k"));
        strArr[116] = m1292z(m1293z("W\u000fpP 8\u000f|"));
        strArr[117] = m1292z(m1293z("W\u0015x^ !\u0011f@ :\u0015vK 1"));
        strArr[118] = m1292z(m1293z("W\u0017`B +\u0000uW"));
        strArr[119] = m1292z(m1293z("W\u0015|@1=\u0000x^"));
        strArr[C0607n.co] = m1292z(m1293z("W\u0017pF71"));
        strArr[121] = m1292z(m1293z("W\u0013v^,7\u0006fA*!\u000fpU+1\u0006"));
        strArr[122] = m1292z(m1293z("W\u0005p\\:7\u0016kA !\u0011"));
        strArr[123] = m1292z(m1293z("W\u000e|_*=\u0011|"));
        strArr[C0607n.Hn] = m1292z(m1293z("W\u001bf[+=\u0017pS)1"));
        strArr[125] = m1292z(m1293z("W\ntS\"1\u001c]+0"));
        strArr[126] = m1292z(m1293z("W\ntS\"1\u001c]+0\u001c|F$ "));
        strArr[C0607n.bx] = m1292z(m1293z("W\u001a"));
        strArr[128] = m1292z(m1293z("W\u0000v\\!=\u0017p]++\u0005p^1&\u0006"));
        strArr[C0607n.Wj] = m1292z(m1293z("W\rv_:7\ftB)1\u0017"));
        strArr[130] = m1292z(m1293z("W\u0007xF +\u0007|P0 "));
        strArr[131] = m1292z(m1293z("W\u0005p^1&\u0006"));
        strArr[C0538a.tb] = m1292z(m1293z("W\u0002{@ \"\nxF,;\r"));
        strArr[133] = m1292z(m1293z("W\u0002w\\ 1"));
        strArr[C0607n.Fb] = m1292z(m1293z("W\u0002zQ '"));
        strArr[C0538a.Nb] = m1292z(m1293z("W\u0002oS+7\u0006f@$$\n}W"));
        strArr[136] = m1292z(m1293z("W\u000ep^)=\u0010|Q*:\u0007|"));
        strArr[137] = m1292z(m1293z("W\u000exA4!\u0006fS#2\nzZ$3\u0006"));
        strArr[138] = m1292z(m1293z("W\u0000l@61\u0016kM6;\u0016k[6"));
        strArr[139] = m1292z(m1293z("W\nwT*'\u001c|F :\u0007lW6"));
        strArr[C0542t.f1193i] = m1292z(m1293z("W\u0013k]5&\n|F +\nwF &\u0007pF "));
        strArr[141] = m1292z(m1293z("W\nwV,7\u0002m[*:"));
        strArr[C0536n.f995G] = m1292z(m1293z("W\u0000v\\11\rlM,:\nm[$8"));
        strArr[143] = m1292z(m1293z("W\u001b"));
        strArr[C0538a.Lb] = m1292z(m1293z("W\u000bxG11\u0016kM)=\u0004wW:9\u0002a"));
        strArr[145] = m1292z(m1293z("W\fk[ :\u0017xF,;\rfD &\u0017pQ$8\u0006"));
        strArr[146] = m1292z(m1293z("W\u000bxG11\u0016kM,9\u0002~W"));
        strArr[147] = m1292z(m1293z("W\u0000l@ !\u0011"));
        strArr[148] = m1292z(m1293z("W\u0010|@31\u0016k"));
        strArr[149] = m1292z(m1293z("W\u000bxG11\u0016kM(5\u001b"));
        strArr[C0536n.f1006y] = m1292z(m1293z("W\rv_:$\u000b`A,%\u0016|"));
        strArr[151] = m1292z(m1293z("W\u0013x@1=\u0006fV$ \u0006"));
        strArr[152] = m1292z(m1293z("W\u0006w@*!\u000f|"));
        strArr[153] = m1292z(m1293z("W\u0011lP7=\u0012lW:$\u0002kQ*!\u0011lW"));
        strArr[154] = m1292z(m1293z("W\fiW75\u0017|G7+\nwF &\u0007pF"));
        strArr[155] = m1292z(m1293z("/cd"));
        strArr[156] = m1292z(m1293z("W\u0017xP)1\u0002l"));
        strArr[157] = m1292z(m1293z("W\u0000v\\31\u0011j[*:\u001cp_5;\u0010j['8\u0006"));
        strArr[158] = m1292z(m1293z("W\u0010vG77\u0006"));
        strArr[159] = m1292z(m1293z("W\u0011lP7=\u0012lW:2\nuF71\u0006"));
        strArr[160] = m1292z(m1293z("W\u0017xG=+\u0002wQ75\u0004|M)5\u0011~W0&"));
        strArr[C0607n.kh] = m1292z(m1293z("W\u0015x^ !\u0011f[+=\u0017pS)1"));
        strArr[C0607n.Ru] = m1292z(m1293z("W\r{M7!\u0001k[4!\u0006fQ)1"));
        strArr[C0607n.Ao] = m1292z(m1293z("W\u0017`B +\u0011|_58\njA$3\u0006"));
        strArr[164] = m1292z(m1293z("W\u0010|Q*:\u0007|"));
        strArr[165] = m1292z(m1293z("W\u0000vG)1\u0016kM#;\r}"));
        strArr[166] = m1292z(m1293z("W\u0005p^1&\u0006fS31\u0000fP*&\r|A"));
        strArr[167] = m1292z(m1293z("W\u000exA4!\u0006fA$=\u0010pW"));
        strArr[168] = m1292z(m1293z("W\u0016m[)=\u0010xF !\u0011"));
        strArr[169] = m1292z(m1293z("W\u0011lP7=\u0012lW:9\u0006t]7=\u0010|W"));
        strArr[C0536n.f1002n] = m1292z(m1293z("W\u0013k]3=\u0007|@"));
        strArr[171] = m1292z(m1293z("W\u0013v^,7\u0006fU75\u0010"));
        strArr[172] = m1292z(m1293z("W\u0015x^ !\u0011fS#2\nzZ 1"));
        strArr[173] = m1292z(m1293z("W\u0004k]0$\u0006"));
        strArr[174] = m1292z(m1293z("W\u0015pV "));
        strArr[C0607n.hu] = m1292z(m1293z("1 Qw\u0006T'L2\u0006\u0018,Ws\u0002\u0011c]5\u0010\u001acnV*\u0016)\\f"));
        strArr[C0607n.aw] = m1292z(m1293z("W\u0017xG=+\u0002wQ75\u0004|M!&\fpF "));
        f804z = strArr;
    }

    /* renamed from: z */
    private static String m1292z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 116;
                    break;
                case 1:
                    i2 = 67;
                    break;
                case 2:
                    i2 = 57;
                    break;
                case 3:
                    i2 = 18;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1293z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected void mo2610a(EWDPropriete eWDPropriete, boolean z) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case 1:
                setValeur(z);
                return;
            case 2:
                setValeurInitiale(z);
                return;
            case 31:
                setPoliceGras(z);
                return;
            case 32:
                setPoliceItalique(z);
                return;
            case 33:
                setPoliceBarree(z);
                return;
            case 34:
                setPoliceSoulignee(z);
                return;
            case 45:
                setVisible(z);
                return;
            case 46:
                setVisibleInitial(z);
                return;
            case 49:
                setBarreDeMessage(z);
                return;
            case 57:
                setAnimation(z);
                return;
            case 58:
                setAnimationInitiale(z);
                return;
            case 59:
                setTriee(z);
                return;
            case 61:
                setSelectionnee(z);
                return;
            case 62:
                setDeplacable(z);
                return;
            case 63:
                setTriable(z);
                return;
            case 64:
                setEnfonce(z);
                return;
            case 77:
                setNouveau(z);
                return;
            case 78:
                setModifie(z);
                return;
            case 83:
                setVide(z);
                return;
            case 102:
                setMultiligne(z);
                return;
            case 103:
                setCochee(z);
                return;
            case 115:
                setModeListeImage(z);
                return;
            case 116:
                setMemoire(z);
                return;
            case 117:
                setOrientationVerticale(z);
                return;
            case 130:
                setNullSupporte(z);
                return;
            case C0538a.tb /*132*/:
                setBinaire(z);
                return;
            case 133:
                setCleComposee(z);
                return;
            case 137:
                setMemo(z);
                return;
            case 139:
                setNull(z);
                return;
            case 154:
                setVertical(z);
                return;
            case 160:
                setEnroule(z);
                return;
            case C0607n.Ao /*163*/:
                setNouvelEnregistrement(z);
                return;
            case 165:
                setMultiselection(z);
                return;
            case 169:
                setSecuriteHTML(z);
                return;
            case 172:
                setInfoTraficRoutier(z);
                return;
            case 173:
                setInfoRealiteAugmentee(z);
                return;
            case 174:
                setModeTest(z);
                return;
            case C0607n.hu /*175*/:
                setPubliciteChargee(z);
                return;
            case C0607n.aw /*176*/:
                setFocusAuClic(z);
                return;
            case C0607n.pw /*186*/:
                setBalayageActif(z);
                return;
            case 189:
                setEnSaisie(z);
                return;
            case C0607n.oq /*195*/:
                setDeplacementRDV(z);
                return;
            case C0607n.f1465w /*203*/:
                setVerifieOrthographe(z);
                return;
            case C0607n.f1441Y /*205*/:
                setAutoriseMasquageActionBar(z);
                return;
            case C0607n.Bs /*210*/:
                setSaisieDirecteRDV(z);
                return;
            case C0607n.lh /*211*/:
                setSelectionPeriode(z);
                return;
            case 214:
                setAjoutTermine(z);
                return;
            case C0607n.Tv /*220*/:
                setCompacteOption(z);
                return;
            case 224:
                setTimestampUTC(z);
                return;
            case 225:
                setPersistanceRubriqueCalculee(z);
                return;
            case 231:
                setScrollAuDoigt(z);
                return;
            case 232:
                setZoomAuDoigt(z);
                return;
            case 233:
                setRendezVousContinu(z);
                return;
            case C0607n.Jn /*234*/:
                setBalayageVertical(z);
                return;
            case 242:
                setAvecZoom(z);
                return;
            case C0607n.uw /*244*/:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return;
            default:
                setProp(eWDPropriete, new WDBooleen(z));
                return;
        }
    }

    /* renamed from: a */
    protected void mo2611a(EWDPropriete eWDPropriete, byte[] bArr) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case C0607n.uw /*244*/:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return;
            default:
                setProp(eWDPropriete, new WDBuffer(bArr));
                return;
        }
    }

    public void allouerTableau(int i, int[] iArr, int i2, int i3) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[157], getNomType(), C0745b.m3220a(f804z[156], new String[0])));
    }

    public void allouerTableau(int i, int[] iArr, int i2, IWDAllocateur iWDAllocateur) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[157], getNomType(), C0745b.m3220a(f804z[156], new String[0])));
    }

    public <T> T checkType(Class<T> cls) {
        return cls.isInstance(this) ? this : null;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void erreurAppelPropriete(EWDPropriete eWDPropriete) {
        erreurAppelPropriete(eWDPropriete.toString());
    }

    public void erreurAppelPropriete(String str) {
        WDErreurManager.m2883a(getMessageMauvaisePropriete(str));
    }

    public WDObjet executer(WDObjet... wDObjetArr) {
        return new WDVoid();
    }

    public WDObjet extraireChaine(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extraireChaine(int i, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extraireDebutChaine(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extraireDebutChaine(int i, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extraireFinChaine(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extraireFinChaine(int i, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extrairePartieChaine(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extrairePartieChaine(int i, int i2, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extraireSousChaine(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet extraireSousChaine(int i, int i2, WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[28], f804z[27], getNomType()));
        return null;
    }

    public WDObjet get(double d) {
        return get((int) d);
    }

    public WDObjet get(double d, int i) {
        return get((int) d, i);
    }

    public WDObjet get(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[154], f804z[155], getNomType()));
        return null;
    }

    public WDObjet get(int i, int i2) {
        return get(i).get(i2);
    }

    public WDObjet get(long j) {
        return get((int) j);
    }

    public WDObjet get(long j, int i) {
        return get((int) j, i);
    }

    public WDObjet get(WDObjet wDObjet) {
        if (wDObjet == null) {
            wDObjet = new WDChaine("");
        }
        return get(wDObjet.getInt());
    }

    public WDObjet get(WDObjet wDObjet, int i) {
        return get(wDObjet.getInt(), i);
    }

    public WDObjet get(String str) {
        return getElement(str);
    }

    public WDObjet get(String str, int i) {
        return get(C0725i.m3064d(str), i);
    }

    public WDObjet get(boolean z) {
        return get(z ? 1 : 0);
    }

    public WDObjet get(boolean z, int i) {
        return get(z ? 1 : 0, i);
    }

    public WDChaine getAbreviation() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0538a.tb]));
        return null;
    }

    public WDEntier4 getAcces() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Fb]));
        return null;
    }

    public WDObjet getAjoutTermine() {
        erreurAppelPropriete(EWDPropriete.PROP_AJOUTTERMINE);
        return null;
    }

    public WDChaine getAlias() {
        erreurAppelPropriete(C0745b.m3219a(f804z[77]));
        return null;
    }

    public WDObjet getAltitude() {
        erreurAppelPropriete(C0745b.m3219a(f804z[37]));
        return null;
    }

    public WDEntier4 getAncrage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[57]));
        return null;
    }

    public WDObjet getAncrageAuContenu() {
        erreurAppelPropriete(EWDPropriete.PROP_ANCRAGEAUCONTENU);
        return null;
    }

    public WDBooleen getAnimation() {
        erreurAppelPropriete(C0745b.m3219a(f804z[108]));
        return null;
    }

    public WDBooleen getAnimationInitiale() {
        erreurAppelPropriete(C0745b.m3219a(f804z[29]));
        return null;
    }

    public WDEntier4 getAnnee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[133]));
        return null;
    }

    public WDObjet getAutoriseMasquageActionBar() {
        erreurAppelPropriete(EWDPropriete.PROP_AUTORISEMASQUAGEACTIONBAR);
        return null;
    }

    public WDEntier4 getAvanceRapide() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0538a.Nb]));
        return null;
    }

    public WDObjet getAvecZoom() {
        erreurAppelPropriete(EWDPropriete.PROP_AVECZOOM);
        return null;
    }

    public WDReel getAxeXMax() {
        erreurAppelPropriete(EWDPropriete.PROP_AXEXMAX);
        return null;
    }

    public WDReel getAxeXMin() {
        erreurAppelPropriete(EWDPropriete.PROP_AXEXMIN);
        return null;
    }

    public WDReel getAxeYMax() {
        erreurAppelPropriete(EWDPropriete.PROP_AXEYMAX);
        return null;
    }

    public WDReel getAxeYMin() {
        erreurAppelPropriete(EWDPropriete.PROP_AXEYMIN);
        return null;
    }

    public WDBooleen getBalayageActif() {
        erreurAppelPropriete(EWDPropriete.PROP_BALAYAGEACTIF);
        return null;
    }

    public WDObjet getBalayageVertical() {
        erreurAppelPropriete(EWDPropriete.PROP_BALAYAGEVERTICAL);
        return null;
    }

    public WDBooleen getBarreDeMessage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[16]));
        return null;
    }

    public WDChaine getBaseDeDonnees() {
        erreurAppelPropriete(C0745b.m3219a(f804z[91]));
        return null;
    }

    public abstract BigDecimal getBigDecimal();

    public WDBooleen getBinaire() {
        erreurAppelPropriete(C0745b.m3219a(f804z[67]));
        return null;
    }

    public abstract boolean getBoolean();

    public WDObjet getBorneMax() {
        erreurAppelPropriete(C0745b.m3219a(f804z[104]));
        return null;
    }

    public WDObjet getBorneMin() {
        erreurAppelPropriete(C0745b.m3219a(f804z[11]));
        return null;
    }

    public WDEntier4 getBoutonSuppression() {
        erreurAppelPropriete(EWDPropriete.PROP_BOUTONSUPPRESSION);
        return null;
    }

    public WDChaine getBulle() {
        erreurAppelPropriete(C0745b.m3219a(f804z[103]));
        return null;
    }

    public WDChaine getBulleTitre() {
        erreurAppelPropriete(C0745b.m3219a(f804z[88]));
        return null;
    }

    public abstract byte getByte();

    public WDEntier4 getCadrageHorizontal() {
        erreurAppelPropriete(C0745b.m3219a(f804z[54]));
        return null;
    }

    public WDEntier4 getCadrageVertical() {
        erreurAppelPropriete(C0745b.m3219a(f804z[1]));
        return null;
    }

    public char getCharAt(int i) {
        return getString().charAt(i);
    }

    public WDObjet getClasse() {
        erreurAppelPropriete(EWDPropriete.PROP_CLASSE);
        return null;
    }

    public WDBooleen getCleComposee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[83]));
        return null;
    }

    public WDChaine getClicDroit() {
        erreurAppelPropriete(C0745b.m3219a(f804z[25]));
        return null;
    }

    public WDObjet getClone() {
        try {
            return (WDObjet) clone();
        } catch (Exception e) {
            C0691a.m2863b(f804z[C0607n.hu], e);
            return this;
        }
    }

    public WDBooleen getCochee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[69]));
        return null;
    }

    public WDEntier4 getColonne() {
        erreurAppelPropriete(C0745b.m3219a(f804z[87]));
        return null;
    }

    public WDObjet getCompacteOption() {
        erreurAppelPropriete(EWDPropriete.PROP_COMPACTEOPTION);
        return null;
    }

    public WDChaine getConditionFiltre() {
        erreurAppelPropriete(C0745b.m3219a(f804z[128]));
        return null;
    }

    public WDChaine getConnexion() {
        erreurAppelPropriete(C0745b.m3219a(f804z[32]));
        return null;
    }

    public WDObjet getContenu() {
        erreurAppelPropriete(C0745b.m3219a(f804z[0]));
        return null;
    }

    public WDChaine getContenuInitial() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0536n.f995G]));
        return null;
    }

    public WDEntier4 getCouleur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[115]));
        return null;
    }

    public WDObjet getCouleurBarreSysteme() {
        erreurAppelPropriete(EWDPropriete.PROP_COULEURBARRESYSTEME);
        return null;
    }

    public WDEntier4 getCouleurFond() {
        erreurAppelPropriete(C0745b.m3219a(f804z[165]));
        return null;
    }

    public WDObjet getCouleurFondTitre() {
        erreurAppelPropriete(EWDPropriete.PROP_COULEURFONDTITRE);
        return null;
    }

    public WDEntier4 getCouleurJauge() {
        erreurAppelPropriete(C0745b.m3219a(f804z[89]));
        return null;
    }

    public WDObjet getCouleurTexteAutomatique() {
        erreurAppelPropriete(EWDPropriete.PROP_COULEURTEXTEAUTOMATIQUE);
        return null;
    }

    public WDObjet getCryptage() {
        erreurAppelPropriete(EWDPropriete.PROP_CRYPTAGE);
        return null;
    }

    public BigDecimal getCurrency() {
        return getBigDecimal();
    }

    public WDEntier4 getCurseur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[31]));
        return null;
    }

    public WDChaine getCurseurSouris() {
        erreurAppelPropriete(C0745b.m3219a(f804z[138]));
        return null;
    }

    public abstract String getDate();

    public WDObjet getDateDebut() {
        erreurAppelPropriete(C0745b.m3219a(f804z[130]));
        return null;
    }

    public WDObjet getDateFin() {
        erreurAppelPropriete(C0745b.m3219a(f804z[102]));
        return null;
    }

    public abstract String getDateHeure();

    public WDObjet getDebutEtendueTotale() {
        erreurAppelPropriete(EWDPropriete.PROP_DEBUTETENDUETOTALE);
        return null;
    }

    public WDObjet getDebutEtendueVisible() {
        erreurAppelPropriete(EWDPropriete.PROP_DEBUTETENDUEVISIBLE);
        return null;
    }

    public WDBooleen getDeplacable() {
        erreurAppelPropriete(C0745b.m3219a(f804z[63]));
        return null;
    }

    public WDObjet getDeplacementRDV() {
        erreurAppelPropriete(EWDPropriete.PROP_DEPLACEMENTRDV);
        return null;
    }

    public WDEntier4 getDndCible() {
        erreurAppelPropriete(C0745b.m3219a(f804z[47]));
        return null;
    }

    public WDEntier4 getDndSource() {
        erreurAppelPropriete(C0745b.m3219a(f804z[113]));
        return null;
    }

    public abstract byte[] getDonneeBinaire();

    public abstract double getDouble();

    public WDChaine getDoubleClic() {
        erreurAppelPropriete(C0745b.m3219a(f804z[10]));
        return null;
    }

    public abstract long getDuree();

    public WDEntier4 getDureeAnimation() {
        erreurAppelPropriete(EWDPropriete.PROP_DUREEANIMATION);
        return null;
    }

    public abstract WDObjet getElement(String str);

    public abstract WDObjet getElement(String str, boolean z);

    public WDEntier4 getEllipse() {
        erreurAppelPropriete(C0745b.m3219a(f804z[5]));
        return null;
    }

    public WDReel getEnHeures() {
        erreurAppelPropriete(EWDPropriete.PROP_ENHEURES);
        return null;
    }

    public WDReel getEnJours() {
        erreurAppelPropriete(EWDPropriete.PROP_ENJOURS);
        return null;
    }

    public WDReel getEnMillisecondes() {
        erreurAppelPropriete(EWDPropriete.PROP_ENMILLISECONDES);
        return null;
    }

    public WDReel getEnMinutes() {
        erreurAppelPropriete(EWDPropriete.PROP_ENMINUTES);
        return null;
    }

    public WDBooleen getEnSaisie() {
        erreurAppelPropriete(EWDPropriete.PROP_ENSAISIE);
        return null;
    }

    public WDReel getEnSecondes() {
        erreurAppelPropriete(EWDPropriete.PROP_ENSECONDES);
        return null;
    }

    public WDBooleen getEnfonce() {
        erreurAppelPropriete(C0745b.m3219a(f804z[35]));
        return null;
    }

    public WDBooleen getEnroule() {
        erreurAppelPropriete(C0745b.m3219a(f804z[152]));
        return null;
    }

    public WDEntier4 getEtat() {
        erreurAppelPropriete(C0745b.m3219a(f804z[82]));
        return null;
    }

    public WDEntier4 getEtatInitial() {
        erreurAppelPropriete(C0745b.m3219a(f804z[85]));
        return null;
    }

    public WDChaine getFenetreSource() {
        erreurAppelPropriete(C0745b.m3219a(f804z[95]));
        return null;
    }

    public WDChaine getFichierOrigine() {
        erreurAppelPropriete(C0745b.m3219a(f804z[45]));
        return null;
    }

    public WDChaine getFichierParcouru() {
        erreurAppelPropriete(C0745b.m3219a(f804z[23]));
        return null;
    }

    public WDChaine getFiltre() {
        erreurAppelPropriete(C0745b.m3219a(f804z[131]));
        return null;
    }

    public WDBooleen getFiltreAvecBornes() {
        erreurAppelPropriete(C0745b.m3219a(f804z[166]));
        return null;
    }

    public WDEntier4 getFinCurseur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[122]));
        return null;
    }

    public WDObjet getFinEtendueTotale() {
        erreurAppelPropriete(EWDPropriete.PROP_FINETENDUETOTALE);
        return null;
    }

    public WDObjet getFinEtendueVisible() {
        erreurAppelPropriete(EWDPropriete.PROP_FINETENDUEVISIBLE);
        return null;
    }

    public WDBooleen getFocusAuClic() {
        erreurAppelPropriete(EWDPropriete.PROP_FOCUSAUCLIC);
        return null;
    }

    public WDChaine getFormatMemorise() {
        erreurAppelPropriete(C0745b.m3219a(f804z[34]));
        return null;
    }

    public WDObjet getFormuleRubriqueCalculee() {
        erreurAppelPropriete(EWDPropriete.PROP_FORMULERUBRIQUECALCULEE);
        return null;
    }

    public WDObjet getGranulariteDeplacement() {
        erreurAppelPropriete(EWDPropriete.PROP_GRANULARITEDEPLACEMENT);
        return null;
    }

    public WDObjet getGranulariteDuree() {
        erreurAppelPropriete(EWDPropriete.PROP_GRANULARITEDUREE);
        return null;
    }

    public WDChaine getGroupe() {
        erreurAppelPropriete(C0745b.m3219a(f804z[173]));
        return null;
    }

    public WDEntier4 getHauteur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[38]));
        return null;
    }

    public WDObjet getHauteurElement() {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURELEMENT);
        return null;
    }

    public WDEntier4 getHauteurImage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[146]));
        return null;
    }

    public WDEntier4 getHauteurInitiale() {
        erreurAppelPropriete(C0745b.m3219a(f804z[22]));
        return null;
    }

    public WDEntier4 getHauteurLigne() {
        erreurAppelPropriete(C0745b.m3219a(f804z[109]));
        return null;
    }

    public WDEntier4 getHauteurLigneMax() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0538a.Lb]));
        return null;
    }

    public WDEntier4 getHauteurMax() {
        erreurAppelPropriete(C0745b.m3219a(f804z[149]));
        return null;
    }

    public WDEntier4 getHauteurMin() {
        erreurAppelPropriete(C0745b.m3219a(f804z[44]));
        return null;
    }

    public WDEntier4 getHauteurRessource() {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURRESSOURCE);
        return null;
    }

    public WDObjet getHauteurTitre() {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURTITRE);
        return null;
    }

    public WDEntier4 getHauteurUtile() {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURUTILE);
        return null;
    }

    public abstract String getHeure();

    public WDObjet getHeureOuvrableDebut() {
        erreurAppelPropriete(EWDPropriete.PROP_HEUREOUVRABLEDEBUT);
        return null;
    }

    public WDObjet getHeureOuvrableFin() {
        erreurAppelPropriete(EWDPropriete.PROP_HEUREOUVRABLEFIN);
        return null;
    }

    public WDChaine getImage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[99]));
        return null;
    }

    public WDChaine getImageDeroulee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[19]));
        return null;
    }

    public WDChaine getImageEnroulee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[66]));
        return null;
    }

    public WDEntier4 getImageEtat() {
        erreurAppelPropriete(C0745b.m3219a(f804z[68]));
        return null;
    }

    public WDChaine getImageFond() {
        erreurAppelPropriete(C0745b.m3219a(f804z[125]));
        return null;
    }

    public WDEntier4 getImageFondEtat() {
        erreurAppelPropriete(C0745b.m3219a(f804z[126]));
        return null;
    }

    public WDObjet getImageFondLigne() {
        erreurAppelPropriete(EWDPropriete.PROP_IMAGEFONDLIGNE);
        return null;
    }

    public WDEntier4 getImageMode() {
        erreurAppelPropriete(C0745b.m3219a(f804z[94]));
        return null;
    }

    public WDChaine getIndication() {
        erreurAppelPropriete(C0745b.m3219a(f804z[141]));
        return null;
    }

    public WDEntier4 getIndice() {
        erreurAppelPropriete(C0745b.m3219a(f804z[48]));
        return null;
    }

    public WDBooleen getInfoRealiteAugmentee() {
        erreurAppelPropriete(EWDPropriete.PROP_INFOREALITEAUGMENTEE);
        return null;
    }

    public WDBooleen getInfoTraficRoutier() {
        erreurAppelPropriete(EWDPropriete.PROP_INFOTRAFICROUTIER);
        return null;
    }

    public WDChaine getInfosEtendues() {
        erreurAppelPropriete(C0745b.m3219a(f804z[139]));
        return null;
    }

    public abstract int getInt();

    public abstract Object getJSONValue();

    public WDEntier4 getJour() {
        erreurAppelPropriete(C0745b.m3219a(f804z[112]));
        return null;
    }

    public WDObjet getLangue() {
        erreurAppelPropriete(EWDPropriete.PROP_LANGUE);
        return null;
    }

    public WDObjet getLangueDecrit() {
        erreurAppelPropriete(EWDPropriete.PROP_LANGUEDECRIT);
        return null;
    }

    public WDEntier4 getLargeur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[111]));
        return null;
    }

    public WDEntier4 getLargeurColonne() {
        erreurAppelPropriete(EWDPropriete.PROP_LARGEURCOLONNE);
        return null;
    }

    public WDObjet getLargeurElement() {
        erreurAppelPropriete(EWDPropriete.PROP_LARGEURELEMENT);
        return null;
    }

    public WDEntier4 getLargeurImage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[46]));
        return null;
    }

    public WDEntier4 getLargeurInitiale() {
        erreurAppelPropriete(C0745b.m3219a(f804z[93]));
        return null;
    }

    public WDEntier4 getLargeurMax() {
        erreurAppelPropriete(C0745b.m3219a(f804z[79]));
        return null;
    }

    public WDEntier4 getLargeurMin() {
        erreurAppelPropriete(C0745b.m3219a(f804z[40]));
        return null;
    }

    public WDEntier4 getLargeurUtile() {
        erreurAppelPropriete(EWDPropriete.PROP_LARGEURUTILE);
        return null;
    }

    public WDChaine getLibelle() {
        erreurAppelPropriete(C0745b.m3219a(f804z[116]));
        return null;
    }

    public WDEntier4 getLigne() {
        erreurAppelPropriete(C0745b.m3219a(f804z[13]));
        return null;
    }

    public abstract long getLong();

    public WDObjet getMargeHauteur() {
        erreurAppelPropriete(EWDPropriete.PROP_MARGEHAUTEUR);
        return null;
    }

    public WDObjet getMargeInterCellules() {
        erreurAppelPropriete(EWDPropriete.PROP_MARGEINTERCELLULES);
        return null;
    }

    public WDObjet getMargeLargeur() {
        erreurAppelPropriete(EWDPropriete.PROP_MARGELARGEUR);
        return null;
    }

    public WDObjet getMasqueAffichage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[137]));
        return null;
    }

    public WDObjet getMasqueSaisie() {
        erreurAppelPropriete(C0745b.m3219a(f804z[167]));
        return null;
    }

    public WDObjet getMasqueTitreDate() {
        erreurAppelPropriete(EWDPropriete.PROP_MASQUETITREDATE);
        return null;
    }

    public WDObjet getMasqueTitreHeure() {
        erreurAppelPropriete(EWDPropriete.PROP_MASQUETITREHEURE);
        return null;
    }

    public WDObjet getMembre() {
        erreurAppelPropriete(EWDPropriete.PROP_MEMBRE);
        return null;
    }

    public abstract WDObjet getMembre(String str);

    public WDBooleen getMemo() {
        erreurAppelPropriete(C0745b.m3219a(f804z[74]));
        return null;
    }

    public WDBooleen getMemoire() {
        erreurAppelPropriete(C0745b.m3219a(f804z[123]));
        return null;
    }

    public WDChaine getMenuContextuel() {
        erreurAppelPropriete(C0745b.m3219a(f804z[21]));
        return null;
    }

    public String getMessageMauvaisePropriete(String str) {
        return C0745b.m3222b(f804z[61], str, getNomType());
    }

    public WDEntier4 getMilliSeconde() {
        erreurAppelPropriete(C0745b.m3219a(f804z[136]));
        return null;
    }

    public WDChaine getMiniature() {
        erreurAppelPropriete(C0745b.m3219a(f804z[49]));
        return null;
    }

    public WDEntier4 getMinute() {
        erreurAppelPropriete(C0745b.m3219a(f804z[73]));
        return null;
    }

    public WDEntier4 getModeCarte() {
        erreurAppelPropriete(EWDPropriete.PROP_MODECARTE);
        return null;
    }

    public WDBooleen getModeListeImage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[24]));
        return null;
    }

    public WDBooleen getModeTest() {
        erreurAppelPropriete(EWDPropriete.PROP_MODETEST);
        return null;
    }

    public WDBooleen getModifie() {
        erreurAppelPropriete(C0745b.m3219a(f804z[62]));
        return null;
    }

    public WDEntier4 getMois() {
        erreurAppelPropriete(C0745b.m3219a(f804z[81]));
        return null;
    }

    public WDObjet getMotDePasse() {
        erreurAppelPropriete(C0745b.m3219a(f804z[80]));
        return null;
    }

    public WDBooleen getMultiSelection() {
        return getMultiselection();
    }

    public WDBooleen getMultiligne() {
        erreurAppelPropriete(C0745b.m3219a(f804z[7]));
        return null;
    }

    public WDBooleen getMultiselection() {
        erreurAppelPropriete(C0745b.m3219a(f804z[42]));
        return null;
    }

    public int getNbCaractere() {
        return getString().length();
    }

    public WDEntier4 getNbComposante() {
        erreurAppelPropriete(C0745b.m3219a(f804z[55]));
        return null;
    }

    public WDObjet getNbJourAffiche() {
        erreurAppelPropriete(EWDPropriete.PROP_NBJOURAFFICHE);
        return null;
    }

    public WDEntier4 getNbRubrique() {
        erreurAppelPropriete(C0745b.m3219a(f804z[53]));
        return null;
    }

    public WDEntier4 getNbRubriqueCle() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Ru]));
        return null;
    }

    public WDEntier4 getNbRubriqueMemo() {
        erreurAppelPropriete(C0745b.m3219a(f804z[64]));
        return null;
    }

    public WDObjet getNbThreadAttente() {
        erreurAppelPropriete(EWDPropriete.PROP_NBTHREADATTENTE);
        return null;
    }

    public WDChaine getNom() {
        erreurAppelPropriete(C0745b.m3219a(f804z[78]));
        return null;
    }

    public WDChaine getNomComplet() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Wj]));
        return null;
    }

    public WDChaine getNomDecrit() {
        erreurAppelPropriete(C0745b.m3219a(f804z[6]));
        return null;
    }

    public WDChaine getNomPhysique() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0536n.f1006y]));
        return null;
    }

    public WDChaine getNomPhysiqueDecrit() {
        erreurAppelPropriete(C0745b.m3219a(f804z[114]));
        return null;
    }

    public abstract String getNomType();

    public WDEntier4 getNombreColonne() {
        erreurAppelPropriete(EWDPropriete.PROP_NOMBRECOLONNE);
        return null;
    }

    public WDObjet getNote() {
        erreurAppelPropriete(C0745b.m3219a(f804z[33]));
        return null;
    }

    public WDBooleen getNouveau() {
        erreurAppelPropriete(C0745b.m3219a(f804z[110]));
        return null;
    }

    public WDBooleen getNouvelEnregistrement() {
        erreurAppelPropriete(C0745b.m3219a(f804z[18]));
        return null;
    }

    public WDBooleen getNull() {
        erreurAppelPropriete(C0745b.m3219a(f804z[92]));
        return null;
    }

    public WDBooleen getNullSupporte() {
        erreurAppelPropriete(C0745b.m3219a(f804z[60]));
        return null;
    }

    public WDEntier4 getNum1erJourDeLaSemaine() {
        erreurAppelPropriete(EWDPropriete.PROP_NUM1ERJOURDELASEMAINE);
        return null;
    }

    public WDEntier4 getNumTab() {
        erreurAppelPropriete(C0745b.m3219a(f804z[51]));
        return null;
    }

    public WDBooleen getNumerique() {
        erreurAppelPropriete(C0745b.m3219a(f804z[84]));
        return null;
    }

    public WDEntier4 getOccurrence() {
        erreurAppelPropriete(C0745b.m3219a(f804z[76]));
        return null;
    }

    public WDObjet getOpacite() {
        erreurAppelPropriete(EWDPropriete.PROP_OPACITE);
        return null;
    }

    public WDObjet getOption() {
        erreurAppelPropriete(EWDPropriete.PROP_OPTION);
        return null;
    }

    public WDBooleen getOrientationVerticale() {
        erreurAppelPropriete(C0745b.m3219a(f804z[145]));
        return null;
    }

    public WDDate getPartieDate() {
        erreurAppelPropriete(C0745b.m3219a(f804z[151]));
        return null;
    }

    public WDHeure getPartieHeure() {
        erreurAppelPropriete(C0745b.m3219a(f804z[15]));
        return null;
    }

    public WDObjet getPersistanceRubriqueCalculee() {
        erreurAppelPropriete(EWDPropriete.PROP_PERSISTANCERUBRIQUECALCULEE);
        return null;
    }

    public WDObjet getPlan() {
        erreurAppelPropriete(C0745b.m3219a(f804z[59]));
        return null;
    }

    public WDBooleen getPoliceBarree() {
        erreurAppelPropriete(C0745b.m3219a(f804z[52]));
        return null;
    }

    public WDBooleen getPoliceGras() {
        erreurAppelPropriete(C0745b.m3219a(f804z[171]));
        return null;
    }

    public WDBooleen getPoliceItalique() {
        erreurAppelPropriete(C0745b.m3219a(f804z[2]));
        return null;
    }

    public WDChaine getPoliceNom() {
        erreurAppelPropriete(C0745b.m3219a(f804z[14]));
        return null;
    }

    public WDBooleen getPoliceSoulignee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[121]));
        return null;
    }

    public WDEntier4 getPoliceTaille() {
        erreurAppelPropriete(C0745b.m3219a(f804z[101]));
        return null;
    }

    public abstract WDProcedure getProcedure();

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case 1:
                return getValeur();
            case 2:
                return getValeurInitiale();
            case 3:
                return getValeurAffichee();
            case 4:
                return getValeurMemorisee();
            case 5:
                return getNom();
            case 6:
                return getNomComplet();
            case 7:
                return getType();
            case 8:
                return getLibelle();
            case 9:
                return getLigne();
            case 10:
                return getColonne();
            case 11:
                return getXInitial();
            case 12:
                return getYInitial();
            case 13:
                return getX();
            case 14:
                return getY();
            case 15:
                return getLargeur();
            case 16:
                return getLargeurInitiale();
            case 17:
                return getLargeurMax();
            case 18:
                return getLargeurMin();
            case 19:
                return getHauteur();
            case 20:
                return getHauteurInitiale();
            case 21:
                return getHauteurMax();
            case 22:
                return getHauteurMin();
            case 23:
                return getCouleur();
            case 24:
                return getCouleurFond();
            case 25:
                return getBulle();
            case 26:
                return getBulleTitre();
            case 27:
                return getCadrageHorizontal();
            case 28:
                return getCadrageVertical();
            case 29:
                return getPoliceNom();
            case 30:
                return getPoliceTaille();
            case 31:
                return getPoliceGras();
            case 32:
                return getPoliceItalique();
            case 33:
                return getPoliceBarree();
            case 34:
                return getPoliceSoulignee();
            case 35:
                return getAncrage();
            case 36:
                return getTauxAncrageBas();
            case 37:
                return getTauxAncrageHauteur();
            case 38:
                return getTauxAncrageLargeur();
            case 39:
                return getTauxAncrageDroite();
            case 40:
                return getNombreColonne();
            case 41:
                return getLargeurColonne();
            case 42:
                return getTitre();
            case 43:
                return getHauteurLigne();
            case 44:
                return getHauteurLigneMax();
            case 45:
                return getVisible();
            case 46:
                return getVisibleInitial();
            case 47:
                return getEtat();
            case 48:
                return getEtatInitial();
            case 49:
                return getBarreDeMessage();
            case 50:
                return getPlan();
            case 51:
                return getNumTab();
            case 52:
                return getImageMode();
            case 53:
                return getContenuInitial();
            case 54:
                return getCurseurSouris();
            case 55:
                return getClicDroit();
            case 56:
                return getDoubleClic();
            case 57:
                return getAnimation();
            case 58:
                return getAnimationInitiale();
            case 59:
                return getTriee();
            case 60:
                return getMotDePasse();
            case 61:
                return getSelectionnee();
            case 62:
                return getDeplacable();
            case 63:
                return getTriable();
            case 64:
                return getEnfonce();
            case 65:
                return getCurseur();
            case 66:
                return getFinCurseur();
            case 67:
                return getTaille();
            case 68:
                return getLargeurImage();
            case 69:
                return getHauteurImage();
            case 70:
                return getXImage();
            case 71:
                return getYImage();
            case 72:
                return getOccurrence();
            case 73:
                return getAltitude();
            case 74:
                return getGroupe();
            case 75:
                return getMenuContextuel();
            case 76:
                return getValeurRenvoyee();
            case 77:
                return getNouveau();
            case 78:
                return getModifie();
            case 79:
                return getImage();
            case 80:
                return getImageEtat();
            case 81:
                return getImageFond();
            case 82:
                return getImageFondEtat();
            case 83:
                return getVide();
            case 84:
                return getTypeSaisie();
            case 85:
                return getMasqueSaisie();
            case 86:
                return getMasqueAffichage();
            case 87:
                return getFormatMemorise();
            case 88:
                return getPartieDate();
            case 89:
                return getPartieHeure();
            case 90:
                return getAnnee();
            case 91:
                return getMois();
            case 92:
                return getJour();
            case 93:
                return getEnJours();
            case 94:
                return getTHeure();
            case 95:
                return getEnHeures();
            case 96:
                return getMinute();
            case 97:
                return getEnMinutes();
            case 98:
                return getSeconde();
            case 99:
                return getEnSecondes();
            case 100:
                return getMilliSeconde();
            case 101:
                return getEnMillisecondes();
            case 102:
                return getMultiligne();
            case 103:
                return getCochee();
            case 104:
                return getNote();
            case 105:
                return getFichierParcouru();
            case 106:
                return getRubriqueParcourue();
            case 107:
                return getRubriqueAffichee();
            case 108:
                return getRubriqueMemorisee();
            case 109:
                return getFiltre();
            case 110:
                return getPropLiaisonFichier();
            case 111:
                return getAlias();
            case 112:
                return getDndCible();
            case 113:
                return getDndSource();
            case 114:
                return getAvanceRapide();
            case 115:
                return getModeListeImage();
            case 116:
                return getMemoire();
            case 117:
                return getOrientationVerticale();
            case 118:
                return getMiniature();
            case 119:
                return getFenetreSource();
            case C0607n.co /*120*/:
                return getAbreviation();
            case 121:
                return getBaseDeDonnees();
            case 122:
                return getConditionFiltre();
            case 123:
                return getBorneMax();
            case C0607n.Hn /*124*/:
                return getBorneMin();
            case 125:
                return getFiltreAvecBornes();
            case 126:
                return getConnexion();
            case C0607n.bx /*127*/:
                return getNbRubrique();
            case 128:
                return getNbRubriqueCle();
            case C0607n.Wj /*129*/:
                return getNbRubriqueMemo();
            case 130:
                return getNullSupporte();
            case 131:
                return getRubriqueFiltree();
            case C0538a.tb /*132*/:
                return getBinaire();
            case 133:
                return getCleComposee();
            case C0607n.Fb /*134*/:
                return getFichierOrigine();
            case C0538a.Nb /*135*/:
                return getRubriqueOrigine();
            case 136:
                return getIndice();
            case 137:
                return getMemo();
            case 138:
                return getNbComposante();
            case 139:
                return getNull();
            case C0542t.f1193i /*140*/:
                return getNumerique();
            case 141:
                return getTexte();
            case C0536n.f995G /*142*/:
                return getTypeCle();
            case 143:
                return getTypeTri();
            case C0538a.Lb /*144*/:
                return getValeurParDefaut();
            case 145:
                return getSource();
            case 146:
                return getUtilisateur();
            case 147:
                return getProvider();
            case 148:
                return getAcces();
            case 149:
                return getServeur();
            case C0536n.f1006y /*150*/:
                return getInfosEtendues();
            case 151:
                return getNomDecrit();
            case 152:
                return getNomPhysiqueDecrit();
            case 153:
                return getNomPhysique();
            case 154:
                return getVertical();
            case 155:
                return getImageDeroulee();
            case 156:
                return getImageEnroulee();
            case 157:
                return getSousLibelle();
            case 158:
                return getContenu();
            case 159:
                return getStyleFond();
            case 160:
                return getEnroule();
            case C0607n.kh /*161*/:
                return getTypeRemplissage();
            case C0607n.Ru /*162*/:
                return getEllipse();
            case C0607n.Ao /*163*/:
                return getNouvelEnregistrement();
            case 164:
                return getCouleurJauge();
            case 165:
                return getMultiselection();
            case 166:
                return getDateDebut();
            case 167:
                return getDateFin();
            case 168:
                return getIndication();
            case 169:
                return getSecuriteHTML();
            case C0536n.f1002n /*170*/:
                return getZoom();
            case 171:
                return getModeCarte();
            case 172:
                return getInfoTraficRoutier();
            case 173:
                return getInfoRealiteAugmentee();
            case 174:
                return getModeTest();
            case C0607n.hu /*175*/:
                return getPubliciteChargee();
            case C0607n.aw /*176*/:
                return getFocusAuClic();
            case C0607n.Nr /*177*/:
                return getAxeXMin();
            case C0607n.Gk /*178*/:
                return getAxeXMax();
            case C0607n.yt /*179*/:
                return getAxeYMin();
            case 180:
                return getAxeYMax();
            case 181:
                return getDureeAnimation();
            case 182:
                return getLangue();
            case 183:
                return getLangueDecrit();
            case 184:
                return getValeurRecherche();
            case 185:
                return getOpacite();
            case C0607n.pw /*186*/:
                return getBalayageActif();
            case 187:
                return getHauteurUtile();
            case 188:
                return getLargeurUtile();
            case 189:
                return getEnSaisie();
            case 190:
                return getHauteurTitre();
            case 191:
                return getDebutEtendueTotale();
            case 192:
                return getDebutEtendueVisible();
            case 193:
                return getFinEtendueTotale();
            case C0607n.nn /*194*/:
                return getFinEtendueVisible();
            case C0607n.oq /*195*/:
                return getDeplacementRDV();
            case C0607n.Uk /*196*/:
                return getGranulariteDeplacement();
            case C0607n.Eg /*197*/:
                return getGranulariteDuree();
            case C0607n.jk /*198*/:
                return getHauteurRessource();
            case 199:
                return getHeureOuvrableDebut();
            case C0607n.Dt /*200*/:
                return getHeureOuvrableFin();
            case C0607n.Bf /*201*/:
                return getMasqueTitreDate();
            case C0607n.Ug /*202*/:
                return getMasqueTitreHeure();
            case C0607n.f1465w /*203*/:
                return getVerifieOrthographe();
            case 204:
                return getRessourceSelectionnee();
            case C0607n.f1441Y /*205*/:
                return getAutoriseMasquageActionBar();
            case C0607n.me /*206*/:
                return getTauxParallaxeHauteur();
            case C0607n.Px /*207*/:
                return getTauxParallaxeY();
            case C0607n.qj /*208*/:
                return getBoutonSuppression();
            case C0607n.af /*209*/:
                return getImageFondLigne();
            case C0607n.Bs /*210*/:
                return getSaisieDirecteRDV();
            case C0607n.lh /*211*/:
                return getSelectionPeriode();
            case C0607n.Ep /*212*/:
                return getRessource();
            case 213:
                return getNbThreadAttente();
            case 214:
                return getAjoutTermine();
            case 215:
                return getCouleurTexteAutomatique();
            case 216:
                return getLargeurElement();
            case 217:
                return getHauteurElement();
            case 218:
                return getMargeHauteur();
            case 219:
                return getMargeLargeur();
            case C0607n.Tv /*220*/:
                return getCompacteOption();
            case C0607n.Qt /*221*/:
                return getCryptage();
            case C0607n.Cv /*222*/:
                return getMembre();
            case 223:
                return getOption();
            case 224:
                return getTimestampUTC();
            case 225:
                return getPersistanceRubriqueCalculee();
            case 226:
                return getFormuleRubriqueCalculee();
            case 227:
                return getValeurParDefautCalculee();
            case 228:
                return getTimestampType();
            case C0607n.Yw /*229*/:
                return getTitreNote();
            case C0607n.no /*230*/:
                return getCouleurBarreSysteme();
            case 231:
                return getScrollAuDoigt();
            case 232:
                return getZoomAuDoigt();
            case 233:
                return getRendezVousContinu();
            case C0607n.Jn /*234*/:
                return getBalayageVertical();
            case 235:
                return getRetraitGauche();
            case 236:
                return getRetraitDroit();
            case C0607n.yk /*237*/:
                return getRetraitHaut();
            case 238:
                return getRetraitBas();
            case C0607n.Au /*239*/:
                return getCouleurFondTitre();
            case 240:
                return getAncrageAuContenu();
            case C0607n.bh /*241*/:
                return getMargeInterCellules();
            case 242:
                return getAvecZoom();
            case C0607n.Xn /*243*/:
                return getNum1erJourDeLaSemaine();
            case C0607n.uw /*244*/:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return null;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[61], eWDPropriete.getNom(), getNomType()));
                return null;
        }
    }

    public WDChaine getPropLiaisonFichier() {
        erreurAppelPropriete(C0745b.m3219a(f804z[3]));
        return null;
    }

    public WDChaine getProvider() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0536n.f1002n]));
        return null;
    }

    public WDBooleen getPubliciteChargee() {
        erreurAppelPropriete(EWDPropriete.PROP_PUBLICITECHARGEE);
        return null;
    }

    public WDObjet getRendezVousContinu() {
        erreurAppelPropriete(EWDPropriete.PROP_RENDEZVOUSCONTINU);
        return null;
    }

    public WDObjet getRessource() {
        erreurAppelPropriete(EWDPropriete.PROP_RESSOURCE);
        return null;
    }

    public WDObjet getRessourceSelectionnee() {
        erreurAppelPropriete(EWDPropriete.PROP_RESSOURCESELECTIONNEE);
        return null;
    }

    public WDObjet getRetraitBas() {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITBAS);
        return null;
    }

    public WDObjet getRetraitDroit() {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITDROIT);
        return null;
    }

    public WDObjet getRetraitGauche() {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITGAUCHE);
        return null;
    }

    public WDObjet getRetraitHaut() {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITHAUT);
        return null;
    }

    public WDChaine getRubriqueAffichee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[98]));
        return null;
    }

    public WDChaine getRubriqueFiltree() {
        erreurAppelPropriete(C0745b.m3219a(f804z[159]));
        return null;
    }

    public WDChaine getRubriqueMemorisee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[169]));
        return null;
    }

    public WDChaine getRubriqueOrigine() {
        erreurAppelPropriete(C0745b.m3219a(f804z[107]));
        return null;
    }

    public WDChaine getRubriqueParcourue() {
        erreurAppelPropriete(C0745b.m3219a(f804z[153]));
        return null;
    }

    public WDBooleen getSaisieDirecteRDV() {
        erreurAppelPropriete(EWDPropriete.PROP_SAISIEDIRECTERDV);
        return null;
    }

    public WDObjet getScrollAuDoigt() {
        erreurAppelPropriete(EWDPropriete.PROP_SCROLLAUDOIGT);
        return null;
    }

    public WDEntier4 getSeconde() {
        erreurAppelPropriete(C0745b.m3219a(f804z[164]));
        return null;
    }

    public WDBooleen getSecuriteHTML() {
        erreurAppelPropriete(C0745b.m3219a(f804z[26]));
        return null;
    }

    public WDBooleen getSelectionPeriode() {
        erreurAppelPropriete(EWDPropriete.PROP_SELECTIONPERIODE);
        return null;
    }

    public WDBooleen getSelectionnee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[58]));
        return null;
    }

    public WDChaine getServeur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[148]));
        return null;
    }

    public abstract short getShort();

    public WDObjet getSource() {
        erreurAppelPropriete(C0745b.m3219a(f804z[158]));
        return null;
    }

    public WDChaine getSousLibelle() {
        erreurAppelPropriete(C0745b.m3219a(f804z[71]));
        return null;
    }

    public abstract String getString();

    public WDEntier4 getStyleFond() {
        erreurAppelPropriete(C0745b.m3219a(f804z[20]));
        return null;
    }

    public WDEntier4 getTHeure() {
        erreurAppelPropriete(C0745b.m3219a(f804z[17]));
        return null;
    }

    public WDEntier4 getTaille() {
        erreurAppelPropriete(C0745b.m3219a(f804z[30]));
        return null;
    }

    public WDEntier4 getTauxAncrageBas() {
        erreurAppelPropriete(C0745b.m3219a(f804z[70]));
        return null;
    }

    public WDEntier4 getTauxAncrageDroite() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.aw]));
        return null;
    }

    public WDEntier4 getTauxAncrageHauteur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[90]));
        return null;
    }

    public WDEntier4 getTauxAncrageLargeur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[160]));
        return null;
    }

    public WDEntier4 getTauxParallaxeHauteur() {
        erreurAppelPropriete(EWDPropriete.PROP_TAUXPARALLAXEHAUTEUR);
        return null;
    }

    public WDEntier4 getTauxParallaxeY() {
        erreurAppelPropriete(EWDPropriete.PROP_TAUXPARALLAXEY);
        return null;
    }

    public WDObjet getTexte() {
        erreurAppelPropriete(C0745b.m3219a(f804z[105]));
        return null;
    }

    public WDObjet getTimestampType() {
        erreurAppelPropriete(EWDPropriete.PROP_TIMESTAMPTYPE);
        return null;
    }

    public WDObjet getTimestampUTC() {
        erreurAppelPropriete(EWDPropriete.PROP_TIMESTAMPUTC);
        return null;
    }

    public WDChaine getTitre() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.co]));
        return null;
    }

    public WDObjet getTitreNote() {
        erreurAppelPropriete(EWDPropriete.PROP_TITRENOTE);
        return null;
    }

    public WDBooleen getTriable() {
        erreurAppelPropriete(C0745b.m3219a(f804z[43]));
        return null;
    }

    public WDBooleen getTriee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[96]));
        return null;
    }

    public WDObjet getType() {
        erreurAppelPropriete(C0745b.m3219a(f804z[100]));
        return null;
    }

    public WDEntier4 getTypeCle() {
        erreurAppelPropriete(C0745b.m3219a(f804z[118]));
        return null;
    }

    public WDEntier4 getTypeRemplissage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Ao]));
        return null;
    }

    public WDEntier4 getTypeSaisie() {
        erreurAppelPropriete(EWDPropriete.PROP_TYPESAISIE);
        return null;
    }

    public WDEntier4 getTypeTri() {
        erreurAppelPropriete(C0745b.m3219a(f804z[106]));
        return null;
    }

    public abstract int getTypeVar();

    public int getTypeVarExt() {
        return getTypeVar();
    }

    public String getTypeXMLPourSerialisation() {
        return "";
    }

    public WDChaine getUtilisateur() {
        erreurAppelPropriete(C0745b.m3219a(f804z[168]));
        return null;
    }

    public abstract WDObjet getValeur();

    public cb getValeurAffichee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[172]));
        return null;
    }

    public WDObjet getValeurInitiale() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.kh]));
        return null;
    }

    public WDObjet getValeurMemorisee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[56]));
        return null;
    }

    public WDObjet getValeurParDefaut() {
        erreurAppelPropriete(C0745b.m3219a(f804z[41]));
        return null;
    }

    public WDObjet getValeurParDefautCalculee() {
        erreurAppelPropriete(EWDPropriete.PROP_VALEURPARDEFAUTCALCULEE);
        return null;
    }

    public WDObjet getValeurRecherche() {
        erreurAppelPropriete(EWDPropriete.PROP_VALEURRECHERCHE);
        return null;
    }

    public WDObjet getValeurRenvoyee() {
        erreurAppelPropriete(C0745b.m3219a(f804z[117]));
        return null;
    }

    public String getValeurXMLPourSerialisation() {
        return getString();
    }

    public WDObjet getVerifieOrthographe() {
        erreurAppelPropriete(EWDPropriete.PROP_VERIFIEORTHOGRAPHE);
        return null;
    }

    public WDBooleen getVertical() {
        erreurAppelPropriete(C0745b.m3219a(f804z[119]));
        return null;
    }

    public WDBooleen getVide() {
        return new WDBooleen(false);
    }

    public WDBooleen getVisible() {
        erreurAppelPropriete(C0745b.m3219a(f804z[50]));
        return null;
    }

    public WDBooleen getVisibleInitial() {
        erreurAppelPropriete(C0745b.m3219a(f804z[4]));
        return null;
    }

    public WDEntier4 getX() {
        erreurAppelPropriete(C0745b.m3219a(f804z[143]));
        return null;
    }

    public WDEntier4 getXImage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[97]));
        return null;
    }

    public WDEntier4 getXInitial() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Hn]));
        return null;
    }

    public WDEntier4 getY() {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.bx]));
        return null;
    }

    public WDEntier4 getYImage() {
        erreurAppelPropriete(C0745b.m3219a(f804z[72]));
        return null;
    }

    public WDEntier4 getYInitial() {
        erreurAppelPropriete(C0745b.m3219a(f804z[65]));
        return null;
    }

    public WDObjet getZoom() {
        erreurAppelPropriete(EWDPropriete.PROP_ZOOM);
        return null;
    }

    public WDObjet getZoomAuDoigt() {
        erreurAppelPropriete(EWDPropriete.PROP_ZOOMAUDOIGT);
        return null;
    }

    public abstract boolean hasProperty(String str);

    public final int indexOf(WDObjet wDObjet, int i, boolean z, boolean z2) {
        String string = getString();
        String string2 = wDObjet.getString();
        int length = string.length();
        int length2 = string2.length();
        if (length2 == 0 || length == 0) {
            return -1;
        }
        int i2 = i;
        while (i2 < length) {
            int i3 = 0;
            while (i3 < length2 && i3 + i2 < length && C0808l.m4025a(string.charAt(i2 + i3), string2.charAt(i3), z, z2)) {
                i3++;
            }
            if (i3 == length2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public WDObjet invoquerMethode(String str) {
        return invoquerMethode(str, new WDObjet[0]);
    }

    public WDObjet invoquerMethode(String str, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[86], ""));
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.core.WDObjet invoquerMethode(java.lang.String r27, java.lang.String[] r28, fr.pcsoft.wdjava.core.WDObjet... r29) {
        /*
        r26 = this;
        if (r28 == 0) goto L_0x0053;
    L_0x0002:
        r4 = 1;
        r5 = r4;
    L_0x0004:
        r0 = r28;
        r4 = r0.length;	 Catch:{ Exception -> 0x0056 }
        if (r4 <= 0) goto L_0x0058;
    L_0x0009:
        r4 = 1;
    L_0x000a:
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0243;
    L_0x000d:
        if (r29 == 0) goto L_0x005c;
    L_0x000f:
        r0 = r29;
        r4 = r0.length;	 Catch:{ Exception -> 0x005a }
        r4 = r4 + 1;
        r5 = r4;
    L_0x0015:
        r4 = r26.getClass();
        r6 = fr.pcsoft.wdjava.core.C0723g.class;
        r4 = r4.getAnnotation(r6);
        r4 = (fr.pcsoft.wdjava.core.C0723g) r4;
        if (r4 == 0) goto L_0x0243;
    L_0x0023:
        r13 = r4.m3008a();
        r14 = r13.length;
        r4 = 0;
        r12 = r4;
    L_0x002a:
        if (r12 >= r14) goto L_0x0243;
    L_0x002c:
        r4 = r13[r12];
        r15 = r4.getMethods();
        r6 = 0;
        r0 = r15.length;
        r16 = r0;
        r4 = 0;
        r7 = r4;
        r4 = r6;
    L_0x0039:
        r0 = r16;
        if (r7 >= r0) goto L_0x023e;
    L_0x003d:
        r11 = r15[r7];
        r6 = r11.getModifiers();
        r8 = java.lang.reflect.Modifier.isPublic(r6);	 Catch:{ Exception -> 0x005f }
        if (r8 == 0) goto L_0x004f;
    L_0x0049:
        r6 = java.lang.reflect.Modifier.isStatic(r6);	 Catch:{ Exception -> 0x0061 }
        if (r6 != 0) goto L_0x0063;
    L_0x004f:
        r6 = r7 + 1;
        r7 = r6;
        goto L_0x0039;
    L_0x0053:
        r4 = 0;
        r5 = r4;
        goto L_0x0004;
    L_0x0056:
        r4 = move-exception;
        throw r4;
    L_0x0058:
        r4 = 0;
        goto L_0x000a;
    L_0x005a:
        r4 = move-exception;
        throw r4;
    L_0x005c:
        r4 = 1;
        r5 = r4;
        goto L_0x0015;
    L_0x005f:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0061 }
    L_0x0061:
        r4 = move-exception;
        throw r4;
    L_0x0063:
        r6 = r11.getName();
        r17 = r6.toLowerCase();
        r18 = r11.getParameterTypes();
        r0 = r18;
        r0 = r0.length;
        r19 = r0;
        r0 = r28;
        r0 = r0.length;
        r20 = r0;
        r6 = 0;
        r8 = r6;
    L_0x007b:
        r0 = r20;
        if (r8 >= r0) goto L_0x004f;
    L_0x007f:
        r21 = r28[r8];
        r0 = r17;
        r1 = r21;
        r6 = r0.equals(r1);	 Catch:{ Exception -> 0x0091 }
        if (r6 == 0) goto L_0x008d;
    L_0x008b:
        if (r19 != 0) goto L_0x0095;
    L_0x008d:
        r6 = r8 + 1;
        r8 = r6;
        goto L_0x007b;
    L_0x0091:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0093 }
    L_0x0093:
        r4 = move-exception;
        throw r4;
    L_0x0095:
        r0 = r19;
        if (r0 != r5) goto L_0x00cd;
    L_0x0099:
        r6 = r11;
    L_0x009a:
        if (r6 == 0) goto L_0x023b;
    L_0x009c:
        r0 = r19;
        r0 = new java.lang.Object[r0];
        r22 = r0;
        r9 = 0;
        r0 = r18;
        r0 = r0.length;
        r23 = r0;
        r4 = 0;
        r10 = r9;
        r9 = r4;
    L_0x00ab:
        r0 = r23;
        if (r9 >= r0) goto L_0x01c3;
    L_0x00af:
        r4 = r18[r9];
        if (r10 != 0) goto L_0x00e5;
    L_0x00b3:
        r24 = fr.pcsoft.wdjava.core.WDObjet.class;
        r0 = r24;
        if (r4 != r0) goto L_0x00e3;
    L_0x00b9:
        r4 = 1;
    L_0x00ba:
        r24 = f804z;
        r25 = 36;
        r24 = r24[r25];
        r0 = r24;
        fr.pcsoft.wdjava.core.debug.C0691a.m2860a(r4, r0);
        r22[r10] = r26;
    L_0x00c7:
        r10 = r10 + 1;
        r4 = r9 + 1;
        r9 = r4;
        goto L_0x00ab;
    L_0x00cd:
        if (r19 <= 0) goto L_0x024e;
    L_0x00cf:
        r6 = r19 + -1;
        r6 = r18[r6];	 Catch:{ Exception -> 0x00df }
        r6 = r6.isArray();	 Catch:{ Exception -> 0x00df }
        if (r6 == 0) goto L_0x024e;
    L_0x00d9:
        r0 = r19;
        if (r5 < r0) goto L_0x024e;
    L_0x00dd:
        r6 = r11;
        goto L_0x009a;
    L_0x00df:
        r4 = move-exception;
        throw r4;
    L_0x00e1:
        r4 = move-exception;
        throw r4;
    L_0x00e3:
        r4 = 0;
        goto L_0x00ba;
    L_0x00e5:
        r24 = fr.pcsoft.wdjava.core.WDObjet.class;
        r0 = r24;
        if (r4 != r0) goto L_0x00f4;
    L_0x00eb:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x00f2 }
        r22[r10] = r4;	 Catch:{ Exception -> 0x00f2 }
        goto L_0x00c7;
    L_0x00f2:
        r4 = move-exception;
        throw r4;
    L_0x00f4:
        r24 = java.lang.String.class;
        r0 = r24;
        if (r4 != r0) goto L_0x0107;
    L_0x00fa:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x0105 }
        r4 = r4.getString();	 Catch:{ Exception -> 0x0105 }
        r22[r10] = r4;	 Catch:{ Exception -> 0x0105 }
        goto L_0x00c7;
    L_0x0105:
        r4 = move-exception;
        throw r4;
    L_0x0107:
        r24 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x011c }
        r0 = r24;
        if (r4 != r0) goto L_0x011e;
    L_0x010d:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x011c }
        r4 = r4.getInt();	 Catch:{ Exception -> 0x011c }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x011c }
        r22[r10] = r4;	 Catch:{ Exception -> 0x011c }
        goto L_0x00c7;
    L_0x011c:
        r4 = move-exception;
        throw r4;
    L_0x011e:
        r24 = java.lang.Long.TYPE;	 Catch:{ Exception -> 0x0133 }
        r0 = r24;
        if (r4 != r0) goto L_0x0135;
    L_0x0124:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x0133 }
        r24 = r4.getLong();	 Catch:{ Exception -> 0x0133 }
        r4 = java.lang.Long.valueOf(r24);	 Catch:{ Exception -> 0x0133 }
        r22[r10] = r4;	 Catch:{ Exception -> 0x0133 }
        goto L_0x00c7;
    L_0x0133:
        r4 = move-exception;
        throw r4;
    L_0x0135:
        r24 = java.lang.Double.TYPE;	 Catch:{ Exception -> 0x014b }
        r0 = r24;
        if (r4 != r0) goto L_0x014d;
    L_0x013b:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x014b }
        r24 = r4.getDouble();	 Catch:{ Exception -> 0x014b }
        r4 = java.lang.Double.valueOf(r24);	 Catch:{ Exception -> 0x014b }
        r22[r10] = r4;	 Catch:{ Exception -> 0x014b }
        goto L_0x00c7;
    L_0x014b:
        r4 = move-exception;
        throw r4;
    L_0x014d:
        r24 = java.lang.Boolean.TYPE;	 Catch:{ Exception -> 0x0163 }
        r0 = r24;
        if (r4 != r0) goto L_0x0165;
    L_0x0153:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x0163 }
        r4 = r4.getBoolean();	 Catch:{ Exception -> 0x0163 }
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ Exception -> 0x0163 }
        r22[r10] = r4;	 Catch:{ Exception -> 0x0163 }
        goto L_0x00c7;
    L_0x0163:
        r4 = move-exception;
        throw r4;
    L_0x0165:
        r24 = java.lang.Short.TYPE;	 Catch:{ Exception -> 0x017b }
        r0 = r24;
        if (r4 != r0) goto L_0x017d;
    L_0x016b:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x017b }
        r4 = r4.getShort();	 Catch:{ Exception -> 0x017b }
        r4 = java.lang.Short.valueOf(r4);	 Catch:{ Exception -> 0x017b }
        r22[r10] = r4;	 Catch:{ Exception -> 0x017b }
        goto L_0x00c7;
    L_0x017b:
        r4 = move-exception;
        throw r4;
    L_0x017d:
        r24 = java.lang.Byte.TYPE;	 Catch:{ Exception -> 0x0193 }
        r0 = r24;
        if (r4 != r0) goto L_0x0195;
    L_0x0183:
        r4 = r10 + -1;
        r4 = r29[r4];	 Catch:{ Exception -> 0x0193 }
        r4 = r4.getByte();	 Catch:{ Exception -> 0x0193 }
        r4 = java.lang.Byte.valueOf(r4);	 Catch:{ Exception -> 0x0193 }
        r22[r10] = r4;	 Catch:{ Exception -> 0x0193 }
        goto L_0x00c7;
    L_0x0193:
        r4 = move-exception;
        throw r4;
    L_0x0195:
        r9 = fr.pcsoft.wdjava.core.WDObjet[].class;
        if (r4 == r9) goto L_0x019d;
    L_0x0199:
        r9 = java.lang.Object[].class;
        if (r4 != r9) goto L_0x01d3;
    L_0x019d:
        r9 = r19 + -1;
        if (r10 != r9) goto L_0x01d3;
    L_0x01a1:
        r4 = r5 - r10;
        r9 = new fr.pcsoft.wdjava.core.WDObjet[r4];
        r4 = r9.length;
        if (r4 <= 0) goto L_0x01c1;
    L_0x01a8:
        r4 = 0;
    L_0x01a9:
        r0 = r9.length;	 Catch:{ Exception -> 0x01bf }
        r23 = r0;
        r0 = r23;
        if (r4 >= r0) goto L_0x01c1;
    L_0x01b0:
        r23 = r10 + -1;
        r23 = r23 + r4;
        r23 = r29[r23];	 Catch:{ Exception -> 0x01bf }
        r9[r4] = r23;	 Catch:{ Exception -> 0x01bf }
        r4 = r4 + 1;
        goto L_0x01a9;
    L_0x01bb:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x01bd }
    L_0x01bd:
        r4 = move-exception;
        throw r4;
    L_0x01bf:
        r4 = move-exception;
        throw r4;
    L_0x01c1:
        r22[r10] = r9;
    L_0x01c3:
        if (r6 == 0) goto L_0x023b;
    L_0x01c5:
        r4 = 0;
        r0 = r22;
        r4 = r6.invoke(r4, r0);	 Catch:{ Exception -> 0x0237 }
        r9 = r4 instanceof fr.pcsoft.wdjava.core.WDObjet;	 Catch:{ Exception -> 0x0237 }
        if (r9 == 0) goto L_0x022f;
    L_0x01d0:
        r4 = (fr.pcsoft.wdjava.core.WDObjet) r4;	 Catch:{ Exception -> 0x0237 }
    L_0x01d2:
        return r4;
    L_0x01d3:
        r9 = int[].class;
        if (r4 != r9) goto L_0x0200;
    L_0x01d7:
        r9 = r19 + -1;
        if (r10 != r9) goto L_0x0200;
    L_0x01db:
        r4 = r5 - r10;
        r9 = new int[r4];
        r4 = r9.length;
        if (r4 <= 0) goto L_0x01fd;
    L_0x01e2:
        r4 = 0;
    L_0x01e3:
        r0 = r9.length;	 Catch:{ Exception -> 0x01fb }
        r23 = r0;
        r0 = r23;
        if (r4 >= r0) goto L_0x01fd;
    L_0x01ea:
        r23 = r10 + -1;
        r23 = r23 + r4;
        r23 = r29[r23];	 Catch:{ Exception -> 0x01fb }
        r23 = r23.getInt();	 Catch:{ Exception -> 0x01fb }
        r9[r4] = r23;	 Catch:{ Exception -> 0x01fb }
        r4 = r4 + 1;
        goto L_0x01e3;
    L_0x01f9:
        r4 = move-exception;
        throw r4;
    L_0x01fb:
        r4 = move-exception;
        throw r4;
    L_0x01fd:
        r22[r10] = r9;
        goto L_0x01c3;
    L_0x0200:
        r9 = java.lang.String[].class;
        if (r4 != r9) goto L_0x022d;
    L_0x0204:
        r4 = r19 + -1;
        if (r10 != r4) goto L_0x022d;
    L_0x0208:
        r4 = r5 - r10;
        r9 = new java.lang.String[r4];
        r4 = r9.length;
        if (r4 <= 0) goto L_0x022a;
    L_0x020f:
        r4 = 0;
    L_0x0210:
        r0 = r9.length;	 Catch:{ Exception -> 0x0228 }
        r23 = r0;
        r0 = r23;
        if (r4 >= r0) goto L_0x022a;
    L_0x0217:
        r23 = r10 + -1;
        r23 = r23 + r4;
        r23 = r29[r23];	 Catch:{ Exception -> 0x0228 }
        r23 = r23.getString();	 Catch:{ Exception -> 0x0228 }
        r9[r4] = r23;	 Catch:{ Exception -> 0x0228 }
        r4 = r4 + 1;
        goto L_0x0210;
    L_0x0226:
        r4 = move-exception;
        throw r4;
    L_0x0228:
        r4 = move-exception;
        throw r4;
    L_0x022a:
        r22[r10] = r9;
        goto L_0x01c3;
    L_0x022d:
        r6 = 0;
        goto L_0x01c3;
    L_0x022f:
        r4 = new fr.pcsoft.wdjava.core.types.WDVoid;	 Catch:{ Exception -> 0x0237 }
        r0 = r21;
        r4.<init>(r0);	 Catch:{ Exception -> 0x0237 }
        goto L_0x01d2;
    L_0x0237:
        r4 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2888b(r4);
    L_0x023b:
        r4 = r6;
        goto L_0x008d;
    L_0x023e:
        r4 = r12 + 1;
        r12 = r4;
        goto L_0x002a;
    L_0x0243:
        r0 = r26;
        r1 = r27;
        r2 = r29;
        r4 = r0.invoquerMethode(r1, r2);
        goto L_0x01d2;
    L_0x024e:
        r6 = r4;
        goto L_0x009a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.WDObjet.invoquerMethode(java.lang.String, java.lang.String[], fr.pcsoft.wdjava.core.WDObjet[]):fr.pcsoft.wdjava.core.WDObjet");
    }

    public abstract boolean isAllloue();

    public boolean isArbre() {
        return false;
    }

    public boolean isAttributZR() {
        return false;
    }

    public boolean isBooleen() {
        return false;
    }

    public boolean isBouton() {
        return false;
    }

    public boolean isCalendrier() {
        return false;
    }

    public boolean isCaseACocher() {
        return false;
    }

    public boolean isChaine() {
        return false;
    }

    public boolean isChaineOptionnelle() {
        return false;
    }

    public boolean isChamp() {
        return false;
    }

    public boolean isChampCamera() {
        return false;
    }

    public boolean isChampFenetreInterne() {
        return false;
    }

    public boolean isChampImage() {
        return false;
    }

    public boolean isChampListe() {
        return false;
    }

    public boolean isChampSaisieMultiLigne() {
        return false;
    }

    public boolean isColonne() {
        return false;
    }

    public boolean isColonneCombo() {
        return false;
    }

    public boolean isColonneConteneur() {
        return false;
    }

    public boolean isColonneMultiligne() {
        return false;
    }

    public boolean isCombo() {
        return false;
    }

    public boolean isConnexion() {
        return false;
    }

    public boolean isDate() {
        return false;
    }

    public boolean isDateHeure() {
        return false;
    }

    public boolean isDuree() {
        return false;
    }

    public boolean isEntier() {
        return false;
    }

    public abstract boolean isEvaluable();

    public boolean isFenetre() {
        return false;
    }

    public boolean isFichier() {
        return false;
    }

    public boolean isForme() {
        return false;
    }

    public boolean isHeure() {
        return false;
    }

    public boolean isLibelle() {
        return false;
    }

    public boolean isListe() {
        return false;
    }

    public boolean isListeImage() {
        return false;
    }

    public boolean isMemoBinaire() {
        return false;
    }

    public boolean isMenuContextuel() {
        return false;
    }

    public boolean isNoeud() {
        return this instanceof db;
    }

    public final boolean isNotNull() {
        return !isNull();
    }

    public boolean isNull() {
        return false;
    }

    public boolean isNumerique() {
        return checkType(C0548s.class) != null;
    }

    public boolean isObjetAPCode() {
        return false;
    }

    public boolean isOnglet() {
        return false;
    }

    public boolean isOptionMenu() {
        return false;
    }

    public boolean isReel() {
        return false;
    }

    public abstract boolean isReleased();

    public boolean isRequete() {
        return false;
    }

    public boolean isRubrique() {
        return false;
    }

    public boolean isSerie() {
        return false;
    }

    public boolean isSourceDonnees() {
        return false;
    }

    public boolean isSplitter() {
        return false;
    }

    public boolean isSuperChamp() {
        return false;
    }

    public boolean isTable() {
        return false;
    }

    public boolean isTableHierarchique() {
        return false;
    }

    public boolean isTableau() {
        return false;
    }

    public boolean isTableauAssociatif() {
        return false;
    }

    public boolean isTableauFixe() {
        return false;
    }

    public abstract boolean isUnicode();

    public boolean isValeurNull() {
        return false;
    }

    public boolean isVarTemps() {
        return false;
    }

    public boolean isVariableInterne() {
        return false;
    }

    public boolean isVoid() {
        return false;
    }

    public boolean isVoletOnglet() {
        return false;
    }

    public boolean isZoneRepetee() {
        return false;
    }

    public void liberer() {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[75], new String[0]));
    }

    public final boolean opCommencePar(double d) {
        return opCommencePar(new WDReel(d));
    }

    public final boolean opCommencePar(int i) {
        return opCommencePar(new WDEntier4(i));
    }

    public final boolean opCommencePar(long j) {
        return opCommencePar(new WDEntier8(j));
    }

    public abstract boolean opCommencePar(WDObjet wDObjet);

    public final boolean opCommencePar(String str) {
        return opCommencePar(new WDChaine(str));
    }

    public final boolean opCommencePar(boolean z) {
        return opCommencePar(new WDBooleen(z));
    }

    public void opCopie(WDObjet wDObjet) {
        setValeur(wDObjet);
    }

    public final boolean opDans(WDObjet wDObjet, boolean z, WDObjet wDObjet2, boolean z2) {
        return (z && z2) ? opSup(wDObjet) && opInf(wDObjet2) : (z || !z2) ? (!z || z2) ? (z || z2) ? false : opSupEgal(wDObjet) && opInfEgal(wDObjet2) : opSup(wDObjet) && opInfEgal(wDObjet2) : opSupEgal(wDObjet) && opInf(wDObjet2);
    }

    public final boolean opDans(WDObjet[] wDObjetArr) {
        if (wDObjetArr == null) {
            return false;
        }
        for (WDObjet opEgal : wDObjetArr) {
            if (getValeur().opEgal(opEgal)) {
                return true;
            }
        }
        return false;
    }

    public abstract cb opDec();

    public void opDecProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        WDObjet prop = getProp(eWDPropriete);
        if (wDObjet == null) {
            prop.opDec();
        } else {
            prop = prop.opMoins(wDObjet);
        }
        setProp(eWDPropriete, prop);
    }

    public final cb opDecalageBinaireDroite(double d) {
        return opDecalageBinaireDroite((int) d);
    }

    public cb opDecalageBinaireDroite(int i) {
        return new WDEntier8(getLong() >> i);
    }

    public final cb opDecalageBinaireDroite(long j) {
        return opDecalageBinaireDroite((int) j);
    }

    public final cb opDecalageBinaireDroite(WDObjet wDObjet) {
        return opDecalageBinaireDroite(wDObjet.getInt());
    }

    public final cb opDecalageBinaireDroite(String str) {
        return opDecalageBinaireDroite(C0725i.m3064d(str));
    }

    public final cb opDecalageBinaireDroite(boolean z) {
        return opDecalageBinaireDroite(z ? 1 : 0);
    }

    public final cb opDecalageBinaireGauche(double d) {
        return opDecalageBinaireGauche((int) d);
    }

    public cb opDecalageBinaireGauche(int i) {
        return new WDEntier8(getLong() << i);
    }

    public final cb opDecalageBinaireGauche(long j) {
        return opDecalageBinaireGauche((int) j);
    }

    public final cb opDecalageBinaireGauche(WDObjet wDObjet) {
        return opDecalageBinaireGauche(wDObjet.getInt());
    }

    public final cb opDecalageBinaireGauche(String str) {
        return opDecalageBinaireGauche(C0725i.m3064d(str));
    }

    public final cb opDecalageBinaireGauche(boolean z) {
        return opDecalageBinaireGauche(z ? 1 : 0);
    }

    public boolean opDiff(double d) {
        return opDiff(new WDReel(d));
    }

    public boolean opDiff(int i) {
        return opDiff(new WDEntier4(i));
    }

    public boolean opDiff(long j) {
        return opDiff(new WDEntier8(j));
    }

    public abstract boolean opDiff(WDObjet wDObjet);

    public boolean opDiff(String str) {
        return opDiff(new WDChaine(str));
    }

    public boolean opDiff(boolean z) {
        return opDiff(new WDBooleen(z));
    }

    public cb opDiv(double d) {
        return opDiv(new WDReel(d));
    }

    public cb opDiv(int i) {
        return opDiv(new WDEntier4(i));
    }

    public cb opDiv(long j) {
        return opDiv(new WDEntier8(j));
    }

    public abstract cb opDiv(WDObjet wDObjet);

    public cb opDiv(String str) {
        return opDiv(new WDChaine(str));
    }

    public cb opDiv(boolean z) {
        return opDiv(new WDBooleen(z));
    }

    public final void opEchange(WDObjet wDObjet) {
        try {
            WDObjet wDObjet2 = (WDObjet) wDObjet.getValeur().clone();
            wDObjet.setValeur(getValeur());
            setValeur(wDObjet2);
        } catch (CloneNotSupportedException e) {
        }
    }

    public boolean opEgal(double d) {
        return opEgal(new WDReel(d));
    }

    public boolean opEgal(int i) {
        return opEgal(new WDEntier4(i));
    }

    public boolean opEgal(long j) {
        return opEgal(new WDEntier8(j));
    }

    public abstract boolean opEgal(WDObjet wDObjet);

    public boolean opEgal(String str) {
        return opEgal(new WDChaine(str));
    }

    public boolean opEgal(boolean z) {
        return opEgal(new WDBooleen(z));
    }

    public final boolean opEgalSouple(double d) {
        return opEgalSouple(new WDReel(d));
    }

    public final boolean opEgalSouple(int i) {
        return opEgalSouple(new WDEntier4(i));
    }

    public final boolean opEgalSouple(long j) {
        return opEgalSouple(new WDEntier8(j));
    }

    public abstract boolean opEgalSouple(WDObjet wDObjet);

    public final boolean opEgalSouple(String str) {
        return opEgalSouple(new WDChaine(str));
    }

    public final boolean opEgalSouple(boolean z) {
        return opEgalSouple(new WDBooleen(z));
    }

    public final boolean opEgalTresSouple(double d) {
        return opEgalSouple(new WDReel(d));
    }

    public final boolean opEgalTresSouple(int i) {
        return opEgalSouple(new WDEntier4(i));
    }

    public final boolean opEgalTresSouple(long j) {
        return opEgalTresSouple(new WDEntier8(j));
    }

    public abstract boolean opEgalTresSouple(WDObjet wDObjet);

    public final boolean opEgalTresSouple(String str) {
        return opEgalSouple(new WDChaine(str));
    }

    public final boolean opEgalTresSouple(boolean z) {
        return opEgalSouple(new WDBooleen(z));
    }

    public cb opEtBinaire(double d) {
        return new WDEntier8(getLong() & ((long) d));
    }

    public cb opEtBinaire(int i) {
        return new WDEntier4(getInt() & i);
    }

    public cb opEtBinaire(long j) {
        return new WDEntier8(getLong() & j);
    }

    public cb opEtBinaire(WDObjet wDObjet) {
        WDEntier4 wDEntier4 = (WDEntier4) wDObjet.checkType(WDEntier4.class);
        return wDEntier4 != null ? new WDEntier8(getLong() & wDEntier4.getLong()) : new WDEntier4(getLong() & wDObjet.getLong());
    }

    public cb opEtBinaire(String str) {
        return new WDEntier8(getLong() & C0725i.m3055c(str));
    }

    public cb opEtBinaire(boolean z) {
        return new WDEntier8(getLong() & ((long) (z ? 1 : 0)));
    }

    public abstract cb opInc();

    public void opIncProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        WDObjet prop = getProp(eWDPropriete);
        if (wDObjet == null) {
            prop.opInc();
        } else {
            prop = prop.opPlus(wDObjet);
        }
        setProp(eWDPropriete, prop);
    }

    public boolean opInf(double d) {
        return opInf(new WDReel(d));
    }

    public boolean opInf(int i) {
        return opInf(new WDEntier4(i));
    }

    public boolean opInf(long j) {
        return opInf(new WDEntier8(j));
    }

    public abstract boolean opInf(WDObjet wDObjet);

    public boolean opInf(String str) {
        return opInf(new WDChaine(str));
    }

    public boolean opInf(boolean z) {
        return opInf(new WDBooleen(z));
    }

    public boolean opInfEgal(double d) {
        return opInfEgal(new WDReel(d));
    }

    public boolean opInfEgal(int i) {
        return opInfEgal(new WDEntier4(i));
    }

    public boolean opInfEgal(long j) {
        return opInfEgal(new WDEntier8(j));
    }

    public abstract boolean opInfEgal(WDObjet wDObjet);

    public boolean opInfEgal(String str) {
        return opInfEgal(new WDChaine(str));
    }

    public boolean opInfEgal(boolean z) {
        return opInfEgal(new WDBooleen(z));
    }

    public boolean opInstanceOf(Class cls) {
        return false;
    }

    public final boolean opInstanceOf(String str) {
        try {
            return opInstanceOf(C0735q.m3130e(str));
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public final cb opMod(double d) {
        return opMod(new WDEntier8(d));
    }

    public final cb opMod(int i) {
        return opMod(new WDEntier4(i));
    }

    public final cb opMod(long j) {
        return opMod(new WDEntier8(j));
    }

    public cb opMod(WDObjet wDObjet) {
        WDObjet valeur = wDObjet.getValeur();
        WDErreurManager.m2883a(C0745b.m3222b(f804z[8], f804z[9], getNomType(), valeur.getNomType()));
        return null;
    }

    public cb opMoins(double d) {
        return opMoins(new WDReel(d));
    }

    public cb opMoins(int i) {
        return opMoins(new WDEntier4(i));
    }

    public cb opMoins(long j) {
        return opMoins(new WDEntier8(j));
    }

    public abstract cb opMoins(WDObjet wDObjet);

    public cb opMoins(String str) {
        return opMoins(new WDChaine(str));
    }

    public cb opMoins(boolean z) {
        return opMoins(new WDBooleen(z));
    }

    public cb opMoinsUnaire() {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[8], "-", getNomType(), getNomType()));
        return null;
    }

    public cb opMult(double d) {
        return opMult(new WDReel(d));
    }

    public cb opMult(int i) {
        return opMult(new WDEntier4(i));
    }

    public cb opMult(long j) {
        return opMult(new WDEntier8(j));
    }

    public abstract cb opMult(WDObjet wDObjet);

    public cb opMult(String str) {
        return opMult(new WDChaine(str));
    }

    public cb opMult(boolean z) {
        return opMult(new WDBooleen(z));
    }

    public cb opNonBinaire() {
        return new WDEntier8(getLong() ^ -1);
    }

    public cb opOuBinaire(double d) {
        return new WDEntier8(getLong() | ((long) d));
    }

    public cb opOuBinaire(int i) {
        return new WDEntier4(getInt() | i);
    }

    public cb opOuBinaire(long j) {
        return new WDEntier8(getLong() | j);
    }

    public cb opOuBinaire(WDObjet wDObjet) {
        WDEntier4 wDEntier4 = (WDEntier4) wDObjet.checkType(WDEntier4.class);
        return wDEntier4 != null ? new WDEntier8(getLong() | wDEntier4.getLong()) : new WDEntier4(getLong() | wDObjet.getLong());
    }

    public cb opOuBinaire(String str) {
        return new WDEntier8(getLong() | C0725i.m3055c(str));
    }

    public cb opOuBinaire(boolean z) {
        return new WDEntier8(getLong() | ((long) (z ? 1 : 0)));
    }

    public cb opOuExclusifBinaire(double d) {
        return new WDEntier8(getLong() ^ ((long) d));
    }

    public cb opOuExclusifBinaire(int i) {
        return new WDEntier4(getInt() ^ i);
    }

    public cb opOuExclusifBinaire(long j) {
        return new WDEntier8(getLong() ^ j);
    }

    public cb opOuExclusifBinaire(WDObjet wDObjet) {
        WDEntier4 wDEntier4 = (WDEntier4) wDObjet.checkType(WDEntier4.class);
        return wDEntier4 != null ? new WDEntier8(getLong() ^ wDEntier4.getLong()) : new WDEntier4(getLong() ^ wDObjet.getLong());
    }

    public cb opOuExclusifBinaire(String str) {
        return new WDEntier8(getLong() ^ C0725i.m3055c(str));
    }

    public cb opOuExclusifBinaire(boolean z) {
        return new WDEntier8(getLong() ^ ((long) (z ? 1 : 0)));
    }

    public cb opPlus(double d) {
        return opPlus(new WDReel(d));
    }

    public cb opPlus(int i) {
        return opPlus(new WDEntier4(i));
    }

    public cb opPlus(long j) {
        return opPlus(new WDEntier8(j));
    }

    public abstract cb opPlus(WDObjet wDObjet);

    public cb opPlus(String str) {
        return opPlus(new WDChaine(str));
    }

    public cb opPlus(boolean z) {
        return opPlus(new WDBooleen(z));
    }

    public void opPriseReference(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[39], new String[0]));
    }

    public final cb opPuissance(double d) {
        return new WDReel(Math.pow(getDouble(), d));
    }

    public final cb opPuissance(int i) {
        return new WDReel(Math.pow(getDouble(), (double) i));
    }

    public final cb opPuissance(long j) {
        return new WDReel(Math.pow(getDouble(), (double) j));
    }

    public cb opPuissance(WDObjet wDObjet) {
        return new WDReel(Math.pow(getDouble(), wDObjet.getDouble()));
    }

    public final cb opPuissance(String str) {
        return new WDReel(Math.pow(getDouble(), C0725i.m3084m(str)));
    }

    public final cb opPuissance(boolean z) {
        return new WDReel(Math.pow(getDouble(), z ? 1.0d : 0.0d));
    }

    public boolean opSup(double d) {
        return opSup(new WDReel(d));
    }

    public boolean opSup(int i) {
        return opSup(new WDEntier4(i));
    }

    public boolean opSup(long j) {
        return opSup(new WDEntier8(j));
    }

    public abstract boolean opSup(WDObjet wDObjet);

    public boolean opSup(String str) {
        return opSup(new WDChaine(str));
    }

    public boolean opSup(boolean z) {
        return opSup(new WDBooleen(z));
    }

    public boolean opSupEgal(double d) {
        return opSupEgal(new WDReel(d));
    }

    public boolean opSupEgal(int i) {
        return opSupEgal(new WDEntier4(i));
    }

    public boolean opSupEgal(long j) {
        return opSupEgal(new WDEntier8(j));
    }

    public abstract boolean opSupEgal(WDObjet wDObjet);

    public boolean opSupEgal(String str) {
        return opSupEgal(new WDChaine(str));
    }

    public boolean opSupEgal(boolean z) {
        return opSupEgal(new WDBooleen(z));
    }

    public abstract void razVariable();

    public abstract void release();

    public void setAbreviation(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0538a.tb]));
    }

    public void setAcces(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Fb]));
    }

    public void setAjoutTermine(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_AJOUTTERMINE);
    }

    public void setAlias(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[77]));
    }

    public void setAltitude(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[37]));
    }

    public void setAncrage(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[57]));
    }

    public void setAncrageAuContenu(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_ANCRAGEAUCONTENU);
    }

    public void setAnimation(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[108]));
    }

    public void setAnimationInitiale(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[29]));
    }

    public void setAnnee(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[133]));
    }

    public void setApres(WDObjet wDObjet) {
        erreurAppelPropriete(EWDPropriete.PROP_APRES);
    }

    public void setAutoriseMasquageActionBar(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_AUTORISEMASQUAGEACTIONBAR);
    }

    public void setAvanceRapide(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0538a.Nb]));
    }

    public void setAvant(WDObjet wDObjet) {
        erreurAppelPropriete(EWDPropriete.PROP_AVANT);
    }

    public void setAvecZoom(WDObjet wDObjet) {
        setAvecZoom(wDObjet.getBoolean());
    }

    public void setAvecZoom(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_AVECZOOM);
    }

    public void setAxeXMax(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_AXEXMAX);
    }

    public void setAxeXMin(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_AXEXMIN);
    }

    public void setAxeYMax(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_AXEYMAX);
    }

    public void setAxeYMin(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_AXEYMIN);
    }

    public void setBalayageActif(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_BALAYAGEACTIF);
    }

    public void setBalayageVertical(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_BALAYAGEVERTICAL);
    }

    public void setBarreDeMessage(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[16]));
    }

    public void setBaseDeDonnees(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[91]));
    }

    public void setBinaire(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[67]));
    }

    public void setBorneMax(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[104])));
    }

    public void setBorneMin(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[11])));
    }

    public void setBoutonSuppression(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_BOUTONSUPPRESSION);
    }

    public void setBulle(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[103]));
    }

    public void setBulleTitre(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[88]));
    }

    public void setCadrageHorizontal(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[54]));
    }

    public void setCadrageVertical(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[1]));
    }

    public void setClasse(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_CLASSE);
    }

    public void setCleComposee(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[83]));
    }

    public void setClicDroit(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[25]));
    }

    public void setCochee(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[69]));
    }

    public void setColonne(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[87]));
    }

    public void setCompacteOption(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_COMPACTEOPTION);
    }

    public void setConditionFiltre(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[128]));
    }

    public void setConnexion(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[32]));
    }

    public void setContenu(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[0]));
    }

    public void setContenuInitial(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0536n.f995G]));
    }

    public void setCouleur(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[115]));
    }

    public void setCouleurBarreSysteme(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_COULEURBARRESYSTEME);
    }

    public void setCouleurFond(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[165]));
    }

    public void setCouleurFondTitre(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_COULEURFONDTITRE);
    }

    public void setCouleurJauge(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[89]));
    }

    public void setCouleurTexteAutomatique(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_COULEURTEXTEAUTOMATIQUE);
    }

    public void setCryptage(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_CRYPTAGE);
    }

    public void setCurseur(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[147]));
    }

    public void setCurseurSouris(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[138]));
    }

    public final void setCurseurSouris(WDObjet wDObjet) {
        if (wDObjet.isNumerique()) {
            setCurseurSouris(wDObjet.getInt());
        } else {
            setCurseurSouris(wDObjet.getString());
        }
    }

    public void setCurseurSouris(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[138]));
    }

    public void setDateDebut(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[130]));
    }

    public void setDateFin(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[102]));
    }

    public void setDebutEtendueTotale(WDObjet wDObjet) {
        erreurAppelPropriete(EWDPropriete.PROP_DEBUTETENDUETOTALE);
    }

    public void setDebutEtendueVisible(WDObjet wDObjet) {
        erreurAppelPropriete(EWDPropriete.PROP_DEBUTETENDUEVISIBLE);
    }

    public void setDeplacable(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[63]));
    }

    public void setDeplacementRDV(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_DEPLACEMENTRDV);
    }

    public void setDndCible(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[47]));
    }

    public void setDndSource(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[113]));
    }

    public void setDoubleClic(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[10]));
    }

    public void setDureeAnimation(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_DUREEANIMATION);
    }

    public void setEllipse(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[5]));
    }

    public void setEnHeures(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_ENHEURES);
    }

    public void setEnJours(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_ENJOURS);
    }

    public void setEnMillisecondes(long j) {
        erreurAppelPropriete(EWDPropriete.PROP_ENMILLISECONDES);
    }

    public void setEnMinutes(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_ENMINUTES);
    }

    public void setEnSaisie(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_ENSAISIE);
    }

    public void setEnSecondes(double d) {
        erreurAppelPropriete(EWDPropriete.PROP_ENSECONDES);
    }

    public void setEnfonce(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[35]));
    }

    public void setEnroule(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[152]));
    }

    public void setEtat(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[82]));
    }

    public void setEtatInitial(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[85]));
    }

    public void setFenetreSource(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[95])));
    }

    public void setFichierOrigine(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[45]));
    }

    public void setFichierParcouru(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[23]));
    }

    public void setFiltre(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[131]));
    }

    public void setFiltreAvecBornes(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[166])));
    }

    public void setFinCurseur(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[122]));
    }

    public void setFinEtendueTotale(WDObjet wDObjet) {
        erreurAppelPropriete(EWDPropriete.PROP_FINETENDUETOTALE);
    }

    public void setFinEtendueVisible(WDObjet wDObjet) {
        erreurAppelPropriete(EWDPropriete.PROP_FINETENDUEVISIBLE);
    }

    public void setFocusAuClic(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_FOCUSAUCLIC);
    }

    public void setFormatMemorise(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[34]));
    }

    public void setFormuleRubriqueCalculee(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_FORMULERUBRIQUECALCULEE);
    }

    public void setGranulariteDeplacement(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_GRANULARITEDEPLACEMENT);
    }

    public void setGranulariteDuree(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_GRANULARITEDUREE);
    }

    public void setGroupe(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[173]));
    }

    public void setHauteur(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[38]));
    }

    public void setHauteurElement(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURELEMENT);
    }

    public void setHauteurImage(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[146]));
    }

    public void setHauteurInitiale(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[22]));
    }

    public void setHauteurLigne(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[109]));
    }

    public void setHauteurLigneMax(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0538a.Lb]));
    }

    public void setHauteurMax(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[149]));
    }

    public void setHauteurMin(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[44]));
    }

    public void setHauteurRessource(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURRESSOURCE);
    }

    public void setHauteurTitre(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURTITRE);
    }

    public void setHauteurUtile(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_HAUTEURUTILE);
    }

    public void setHeureOuvrableDebut(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_HEUREOUVRABLEDEBUT);
    }

    public void setHeureOuvrableFin(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_HEUREOUVRABLEFIN);
    }

    public void setImage(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[99]));
    }

    public void setImageDeroulee(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[19]));
    }

    public void setImageEnroulee(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[66]));
    }

    public void setImageEtat(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[68]));
    }

    public void setImageFond(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[125]));
    }

    public void setImageFondEtat(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[126]));
    }

    public void setImageFondLigne(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_IMAGEFONDLIGNE);
    }

    public void setImageMode(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[94]));
    }

    public void setIndication(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[141]));
    }

    public void setIndice(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[48]));
    }

    public void setInfoRealiteAugmentee(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_INFOREALITEAUGMENTEE);
    }

    public void setInfoTraficRoutier(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_INFOTRAFICROUTIER);
    }

    public void setInfosEtendues(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[139]));
    }

    public void setJSONValue(String str) {
        setValeur(str);
    }

    public void setJour(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[112]));
    }

    public void setLangue(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_LANGUE);
    }

    public void setLangueDecrit(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_LANGUEDECRIT);
    }

    public void setLargeur(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[111]));
    }

    public void setLargeurColonne(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_LARGEURCOLONNE);
    }

    public void setLargeurElement(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_LARGEURELEMENT);
    }

    public void setLargeurImage(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[46]));
    }

    public void setLargeurInitiale(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[93]));
    }

    public void setLargeurMax(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[79]));
    }

    public void setLargeurMin(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[40]));
    }

    public void setLargeurUtile(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_LARGEURUTILE);
    }

    public void setLibelle(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[116]));
    }

    public void setLigne(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[13]));
    }

    public void setMargeHauteur(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_MARGEHAUTEUR);
    }

    public void setMargeInterCellules(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_MARGEINTERCELLULES);
    }

    public void setMargeLargeur(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_MARGELARGEUR);
    }

    public void setMasqueAffichage(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[137]));
    }

    public void setMasqueSaisie(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[167]));
    }

    public void setMasqueTitreDate(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_MASQUETITREDATE);
    }

    public void setMasqueTitreHeure(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_MASQUETITREHEURE);
    }

    public void setMembre(WDObjet wDObjet) {
        erreurAppelPropriete(EWDPropriete.PROP_MEMBRE);
    }

    public void setMemo(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[74]));
    }

    public void setMemoire(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[11])));
    }

    public void setMenuContextuel(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[21]));
    }

    public void setMilliSeconde(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[136]));
    }

    public void setMiniature(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[49]));
    }

    public void setMinute(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[73]));
    }

    public void setModeCarte(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_MODECARTE);
    }

    public void setModeListeImage(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[24]));
    }

    public void setModeTest(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], EWDPropriete.PROP_MODETEST.toString()));
    }

    public void setModifie(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[62]));
    }

    public void setMois(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[81]));
    }

    public void setMotDePasse(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[80]));
    }

    public void setMultiSelection(boolean z) {
        setMultiselection(z);
    }

    public void setMultiligne(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[7]));
    }

    public void setMultiselection(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[42]));
    }

    public void setNbComposante(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[55]));
    }

    public void setNbJourAffiche(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_NBJOURAFFICHE);
    }

    public void setNbRubrique(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[53]));
    }

    public void setNbRubriqueCle(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Ru]));
    }

    public void setNbRubriqueMemo(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[64]));
    }

    public void setNom(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[78])));
    }

    public final void setNomComplet(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[C0607n.Wj])));
    }

    public void setNomDecrit(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[6]));
    }

    public void setNomPhysique(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0536n.f1006y]));
    }

    public void setNomPhysiqueDecrit(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[114]));
    }

    public void setNombreColonne(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_NOMBRECOLONNE);
    }

    public void setNote(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[33]));
    }

    public void setNouveau(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[110]));
    }

    public void setNouvelEnregistrement(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[18])));
    }

    public void setNull(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[92]));
    }

    public void setNullSupporte(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[60])));
    }

    public void setNum1erJourDeLaSemaine(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_NUM1ERJOURDELASEMAINE);
    }

    public void setNumTab(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[51]));
    }

    public void setNumerique(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[84]));
    }

    public void setOccurrence(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[76])));
    }

    public void setOpacite(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_OPACITE);
    }

    public void setOption(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_OPTION);
    }

    public void setOrientationVerticale(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[145]));
    }

    public void setPartieDate(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[151]));
    }

    public void setPartieHeure(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[15]));
    }

    public void setPersistanceRubriqueCalculee(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_PERSISTANCERUBRIQUECALCULEE);
    }

    public void setPlan(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[59]));
    }

    public void setPlan(WDObjet wDObjet) {
        if (wDObjet.checkType(C0548s.class) != null) {
            setPlan(wDObjet.getInt());
        } else {
            setPlan(wDObjet.getString());
        }
    }

    public void setPlan(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[59]));
    }

    public void setPoliceBarree(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[52]));
    }

    public void setPoliceGras(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[171]));
    }

    public void setPoliceItalique(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[2]));
    }

    public void setPoliceNom(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[14]));
    }

    public void setPoliceSoulignee(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[121]));
    }

    public void setPoliceTaille(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[101]));
    }

    public void setProp(EWDPropriete eWDPropriete, double d) {
        setPropDouble(eWDPropriete, d);
    }

    public void setProp(EWDPropriete eWDPropriete, int i) {
        setPropInt(eWDPropriete, i);
    }

    public void setProp(EWDPropriete eWDPropriete, long j) {
        setPropLong(eWDPropriete, j);
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case 1:
                setValeur(wDObjet);
                return;
            case 2:
                setValeurInitiale(wDObjet);
                return;
            case 3:
                setValeurAffichee(wDObjet);
                return;
            case 4:
                setValeurMemorisee(wDObjet.getString());
                return;
            case 5:
                setNom(wDObjet.getString());
                return;
            case 6:
                setNomComplet(wDObjet.getString());
                return;
            case 7:
                setType(wDObjet.getInt());
                return;
            case 8:
                setLibelle(wDObjet.getString());
                return;
            case 9:
                setLigne(wDObjet.getInt());
                return;
            case 10:
                setColonne(wDObjet.getInt());
                return;
            case 11:
                setXInitial(wDObjet.getInt());
                return;
            case 12:
                setYInitial(wDObjet.getInt());
                return;
            case 13:
                setX(wDObjet.getInt());
                return;
            case 14:
                setY(wDObjet.getInt());
                return;
            case 15:
                setLargeur(wDObjet.getInt());
                return;
            case 16:
                setLargeurInitiale(wDObjet.getInt());
                return;
            case 17:
                setLargeurMax(wDObjet.getInt());
                return;
            case 18:
                setLargeurMin(wDObjet.getInt());
                return;
            case 19:
                setHauteur(wDObjet.getInt());
                return;
            case 20:
                setHauteurInitiale(wDObjet.getInt());
                return;
            case 21:
                setHauteurMax(wDObjet.getInt());
                return;
            case 22:
                setHauteurMin(wDObjet.getInt());
                return;
            case 23:
                setCouleur(wDObjet.getInt());
                return;
            case 24:
                setCouleurFond(wDObjet.getInt());
                return;
            case 25:
                setBulle(wDObjet.getString());
                return;
            case 26:
                setBulleTitre(wDObjet.getString());
                return;
            case 27:
                setCadrageHorizontal(wDObjet.getInt());
                return;
            case 28:
                setCadrageVertical(wDObjet.getInt());
                return;
            case 29:
                setPoliceNom(wDObjet.getString());
                return;
            case 30:
                setPoliceTaille(wDObjet.getInt());
                return;
            case 31:
                setPoliceGras(wDObjet.getBoolean());
                return;
            case 32:
                setPoliceItalique(wDObjet.getBoolean());
                return;
            case 33:
                setPoliceBarree(wDObjet.getBoolean());
                return;
            case 34:
                setPoliceSoulignee(wDObjet.getBoolean());
                return;
            case 35:
                setAncrage(wDObjet.getInt());
                return;
            case 36:
                setTauxAncrageBas(wDObjet.getInt());
                return;
            case 37:
                setTauxAncrageHauteur(wDObjet.getInt());
                return;
            case 38:
                setTauxAncrageLargeur(wDObjet.getInt());
                return;
            case 39:
                setTauxAncrageDroite(wDObjet.getInt());
                return;
            case 40:
                setNombreColonne(wDObjet.getInt());
                return;
            case 41:
                setLargeurColonne(wDObjet.getInt());
                return;
            case 42:
                setTitre(wDObjet.getString());
                return;
            case 43:
                setHauteurLigne(wDObjet.getInt());
                return;
            case 44:
                setHauteurLigneMax(wDObjet.getInt());
                return;
            case 45:
                setVisible(wDObjet.getBoolean());
                return;
            case 46:
                setVisibleInitial(wDObjet.getBoolean());
                return;
            case 47:
                setEtat(wDObjet.getInt());
                return;
            case 48:
                setEtatInitial(wDObjet.getInt());
                return;
            case 49:
                setBarreDeMessage(wDObjet.getBoolean());
                return;
            case 50:
                setPlan(wDObjet.getInt());
                return;
            case 51:
                setNumTab(wDObjet.getInt());
                return;
            case 52:
                setImageMode(wDObjet.getInt());
                return;
            case 53:
                setContenuInitial(wDObjet.getString());
                return;
            case 54:
                setCurseurSouris(wDObjet);
                return;
            case 55:
                setClicDroit(wDObjet.getString());
                return;
            case 56:
                setDoubleClic(wDObjet.getString());
                return;
            case 57:
                setAnimation(wDObjet.getBoolean());
                return;
            case 58:
                setAnimationInitiale(wDObjet.getBoolean());
                return;
            case 59:
                setTriee(wDObjet.getBoolean());
                return;
            case 60:
                setMotDePasse(wDObjet);
                return;
            case 61:
                setSelectionnee(wDObjet.getBoolean());
                return;
            case 62:
                setDeplacable(wDObjet.getBoolean());
                return;
            case 63:
                setTriable(wDObjet.getBoolean());
                return;
            case 64:
                setEnfonce(wDObjet.getBoolean());
                return;
            case 65:
                setCurseur(wDObjet.getInt());
                return;
            case 66:
                setFinCurseur(wDObjet.getInt());
                return;
            case 67:
                setTaille(wDObjet.getInt());
                return;
            case 68:
                setLargeurImage(wDObjet.getInt());
                return;
            case 69:
                setHauteurImage(wDObjet.getInt());
                return;
            case 70:
                setXImage(wDObjet.getInt());
                return;
            case 71:
                setYImage(wDObjet.getInt());
                return;
            case 72:
                setOccurrence(wDObjet.getInt());
                return;
            case 73:
                setAltitude(wDObjet.getInt());
                return;
            case 74:
                setGroupe(wDObjet);
                return;
            case 75:
                setMenuContextuel(wDObjet);
                return;
            case 76:
                setValeurRenvoyee(wDObjet);
                return;
            case 77:
                setNouveau(wDObjet.getBoolean());
                return;
            case 78:
                setModifie(wDObjet.getBoolean());
                return;
            case 79:
                setImage(wDObjet.getString());
                return;
            case 80:
                setImageEtat(wDObjet.getInt());
                return;
            case 81:
                setImageFond(wDObjet.getString());
                return;
            case 82:
                setImageFondEtat(wDObjet.getInt());
                return;
            case 83:
                setVide(wDObjet.getBoolean());
                return;
            case 84:
                setTypeSaisie(wDObjet.getInt());
                return;
            case 85:
                setMasqueSaisie(wDObjet);
                return;
            case 86:
                setMasqueAffichage(wDObjet);
                return;
            case 87:
                setFormatMemorise(wDObjet.getString());
                return;
            case 88:
                setPartieDate(wDObjet);
                return;
            case 89:
                setPartieHeure(wDObjet);
                return;
            case 90:
                setAnnee(wDObjet.getInt());
                return;
            case 91:
                setMois(wDObjet.getInt());
                return;
            case 92:
                setJour(wDObjet.getInt());
                return;
            case 93:
                setEnJours(wDObjet.getDouble());
                return;
            case 94:
                setTHeure(wDObjet.getInt());
                return;
            case 95:
                setEnHeures(wDObjet.getDouble());
                return;
            case 96:
                setMinute(wDObjet.getInt());
                return;
            case 97:
                setEnMinutes(wDObjet.getDouble());
                return;
            case 98:
                setSeconde(wDObjet.getInt());
                return;
            case 99:
                setEnSecondes(wDObjet.getDouble());
                return;
            case 100:
                setMilliSeconde(wDObjet.getInt());
                return;
            case 101:
                setEnMillisecondes(wDObjet.getLong());
                return;
            case 102:
                setMultiligne(wDObjet.getBoolean());
                return;
            case 103:
                setCochee(wDObjet.getBoolean());
                return;
            case 104:
                setNote(wDObjet.getString());
                return;
            case 105:
                setFichierParcouru(wDObjet.getString());
                return;
            case 106:
                setRubriqueParcourue(wDObjet.getString());
                return;
            case 107:
                setRubriqueAffichee(wDObjet.getString());
                return;
            case 108:
                setRubriqueMemorisee(wDObjet.getString());
                return;
            case 109:
                setFiltre(wDObjet);
                return;
            case 110:
                setPropLiaisonFichier(wDObjet.getString());
                return;
            case 111:
                setAlias(wDObjet.getString());
                return;
            case 112:
                setDndCible(wDObjet.getInt());
                return;
            case 113:
                setDndSource(wDObjet.getInt());
                return;
            case 114:
                setAvanceRapide(wDObjet.getInt());
                return;
            case 115:
                setModeListeImage(wDObjet.getBoolean());
                return;
            case 116:
                setMemoire(wDObjet.getBoolean());
                return;
            case 117:
                setOrientationVerticale(wDObjet.getBoolean());
                return;
            case 118:
                setMiniature(wDObjet);
                return;
            case 119:
                setFenetreSource(wDObjet.getString());
                return;
            case C0607n.co /*120*/:
                setAbreviation(wDObjet.getString());
                return;
            case 121:
                setBaseDeDonnees(wDObjet.getString());
                return;
            case 122:
                setConditionFiltre(wDObjet.getString());
                return;
            case 123:
                setBorneMax(wDObjet);
                return;
            case C0607n.Hn /*124*/:
                setBorneMin(wDObjet);
                return;
            case 125:
                setFiltreAvecBornes(wDObjet);
                return;
            case 126:
                setConnexion(wDObjet.getString());
                return;
            case C0607n.bx /*127*/:
                setNbRubrique(wDObjet.getInt());
                return;
            case 128:
                setNbRubriqueCle(wDObjet.getInt());
                return;
            case C0607n.Wj /*129*/:
                setNbRubriqueMemo(wDObjet.getInt());
                return;
            case 130:
                setNullSupporte(wDObjet.getBoolean());
                return;
            case 131:
                setRubriqueFiltree(wDObjet.getString());
                return;
            case C0538a.tb /*132*/:
                setBinaire(wDObjet.getBoolean());
                return;
            case 133:
                setCleComposee(wDObjet.getBoolean());
                return;
            case C0607n.Fb /*134*/:
                setFichierOrigine(wDObjet.getString());
                return;
            case C0538a.Nb /*135*/:
                setRubriqueOrigine(wDObjet.getString());
                return;
            case 136:
                setIndice(wDObjet.getInt());
                return;
            case 137:
                setMemo(wDObjet.getBoolean());
                return;
            case 138:
                setNbComposante(wDObjet.getInt());
                return;
            case 139:
                setNull(wDObjet.getBoolean());
                return;
            case 141:
                setTexte(wDObjet.getString());
                return;
            case C0536n.f995G /*142*/:
                setTypeCle(wDObjet.getInt());
                return;
            case 143:
                setTypeTri(wDObjet.getInt());
                return;
            case C0538a.Lb /*144*/:
                setValeurParDefaut(wDObjet);
                return;
            case 145:
                setSource(wDObjet.getString());
                return;
            case 146:
                setUtilisateur(wDObjet.getString());
                return;
            case 147:
                setProvider(wDObjet.getString());
                return;
            case 148:
                setAcces(wDObjet.getInt());
                return;
            case 149:
                setServeur(wDObjet.getString());
                return;
            case C0536n.f1006y /*150*/:
                setInfosEtendues(wDObjet.getString());
                return;
            case 151:
                setNomDecrit(wDObjet.getString());
                return;
            case 152:
                setNomPhysiqueDecrit(wDObjet.getString());
                return;
            case 153:
                setNomPhysique(wDObjet.getString());
                return;
            case 154:
                setVertical(wDObjet.getBoolean());
                return;
            case 155:
                setImageDeroulee(wDObjet.getString());
                return;
            case 156:
                setImageEnroulee(wDObjet.getString());
                return;
            case 157:
                setSousLibelle(wDObjet.getString());
                return;
            case 158:
                setContenu(wDObjet);
                return;
            case 159:
                setStyleFond(wDObjet.getInt());
                return;
            case 160:
                setEnroule(wDObjet.getBoolean());
                return;
            case C0607n.kh /*161*/:
                setTypeRemplissage(wDObjet.getInt());
                return;
            case C0607n.Ru /*162*/:
                setEllipse(wDObjet.getInt());
                return;
            case C0607n.Ao /*163*/:
                setNouvelEnregistrement(wDObjet.getBoolean());
                return;
            case 164:
                setCouleurJauge(wDObjet.getInt());
                return;
            case 165:
                setMultiselection(wDObjet.getBoolean());
                return;
            case 166:
                setDateDebut(wDObjet.getString());
                return;
            case 167:
                setDateFin(wDObjet.getString());
                return;
            case 168:
                setIndication(wDObjet.getString());
                return;
            case 169:
                setSecuriteHTML(wDObjet.getBoolean());
                return;
            case C0536n.f1002n /*170*/:
                setZoom(wDObjet.getInt());
                return;
            case 171:
                setModeCarte(wDObjet.getInt());
                return;
            case 172:
                setInfoTraficRoutier(wDObjet.getBoolean());
                return;
            case 173:
                setInfoRealiteAugmentee(wDObjet.getBoolean());
                return;
            case 174:
                setModeTest(wDObjet.getBoolean());
                return;
            case C0607n.hu /*175*/:
                setPubliciteChargee(wDObjet.getBoolean());
                return;
            case C0607n.aw /*176*/:
                setFocusAuClic(wDObjet.getBoolean());
                return;
            case C0607n.Nr /*177*/:
                setAxeXMin(wDObjet.getDouble());
                return;
            case C0607n.Gk /*178*/:
                setAxeXMax(wDObjet.getDouble());
                return;
            case C0607n.yt /*179*/:
                setAxeYMin(wDObjet.getDouble());
                return;
            case 180:
                setAxeYMax(wDObjet.getDouble());
                return;
            case 181:
                setDureeAnimation(wDObjet.getInt());
                return;
            case 182:
                setLangue(wDObjet.getString());
                return;
            case 183:
                setLangueDecrit(wDObjet.getString());
                return;
            case 184:
                setValeurRecherche(wDObjet.getString());
                return;
            case 185:
                setOpacite(wDObjet.getInt());
                return;
            case C0607n.pw /*186*/:
                setBalayageActif(wDObjet.getBoolean());
                return;
            case 187:
                setHauteurUtile(wDObjet.getInt());
                return;
            case 188:
                setLargeurUtile(wDObjet.getInt());
                return;
            case 189:
                setEnSaisie(wDObjet.getBoolean());
                return;
            case 190:
                setHauteurTitre(wDObjet.getInt());
                return;
            case 191:
                setDebutEtendueTotale(wDObjet);
                return;
            case 192:
                setDebutEtendueVisible(wDObjet);
                return;
            case 193:
                setFinEtendueTotale(wDObjet);
                return;
            case C0607n.nn /*194*/:
                setFinEtendueVisible(wDObjet);
                return;
            case C0607n.oq /*195*/:
                setDeplacementRDV(wDObjet.getBoolean());
                return;
            case C0607n.Uk /*196*/:
                setGranulariteDeplacement(wDObjet.getInt());
                return;
            case C0607n.Eg /*197*/:
                setGranulariteDuree(wDObjet.getInt());
                return;
            case C0607n.jk /*198*/:
                setHauteurRessource(wDObjet.getInt());
                return;
            case 199:
                setHeureOuvrableDebut(wDObjet.getString());
                return;
            case C0607n.Dt /*200*/:
                setHeureOuvrableFin(wDObjet.getString());
                return;
            case C0607n.Bf /*201*/:
                setMasqueTitreDate(wDObjet.getString());
                return;
            case C0607n.Ug /*202*/:
                setMasqueTitreHeure(wDObjet.getString());
                return;
            case C0607n.f1465w /*203*/:
                setVerifieOrthographe(wDObjet.getBoolean());
                return;
            case 204:
                setRessourceSelectionnee(wDObjet.getString());
                return;
            case C0607n.f1441Y /*205*/:
                setAutoriseMasquageActionBar(wDObjet.getBoolean());
                return;
            case C0607n.me /*206*/:
                setTauxParallaxeHauteur(wDObjet.getInt());
                return;
            case C0607n.Px /*207*/:
                setTauxParallaxeY(wDObjet.getInt());
                return;
            case C0607n.qj /*208*/:
                setBoutonSuppression(wDObjet.getInt());
                return;
            case C0607n.af /*209*/:
                setImageFondLigne(wDObjet.getString());
                return;
            case C0607n.Bs /*210*/:
                setSaisieDirecteRDV(wDObjet.getBoolean());
                return;
            case C0607n.lh /*211*/:
                setSelectionPeriode(wDObjet.getBoolean());
                return;
            case 214:
                setAjoutTermine(wDObjet.getBoolean());
                return;
            case 215:
                setCouleurTexteAutomatique(wDObjet.getInt());
                return;
            case 216:
                setLargeurElement(wDObjet.getInt());
                return;
            case 217:
                setHauteurElement(wDObjet.getInt());
                return;
            case 218:
                setMargeHauteur(wDObjet.getInt());
                return;
            case 219:
                setMargeLargeur(wDObjet.getInt());
                return;
            case C0607n.Tv /*220*/:
                setCompacteOption(wDObjet.getBoolean());
                return;
            case C0607n.Qt /*221*/:
                setCryptage(wDObjet.getInt());
                return;
            case 223:
                setCryptage(wDObjet.getInt());
                return;
            case 224:
                setTimestampUTC(wDObjet.getBoolean());
                return;
            case 225:
                setPersistanceRubriqueCalculee(wDObjet.getBoolean());
                return;
            case 226:
                setFormuleRubriqueCalculee(wDObjet.getString());
                return;
            case 227:
                setValeurParDefautCalculee(wDObjet.getString());
                return;
            case 228:
                setTimestampType(wDObjet.getInt());
                return;
            case C0607n.Yw /*229*/:
                setTitreNote(wDObjet.getString());
                return;
            case C0607n.no /*230*/:
                setCouleurBarreSysteme(wDObjet.getInt());
                return;
            case 231:
                setScrollAuDoigt(wDObjet.getBoolean());
                return;
            case 232:
                setZoomAuDoigt(wDObjet.getBoolean());
                return;
            case 233:
                setRendezVousContinu(wDObjet.getBoolean());
                return;
            case C0607n.Jn /*234*/:
                setBalayageVertical(wDObjet.getBoolean());
                return;
            case 235:
                setRetraitGauche(wDObjet.getInt());
                return;
            case 236:
                setRetraitDroit(wDObjet.getInt());
                return;
            case C0607n.yk /*237*/:
                setRetraitHaut(wDObjet.getInt());
                return;
            case 238:
                setRetraitBas(wDObjet.getInt());
                return;
            case C0607n.Au /*239*/:
                setCouleurFondTitre(wDObjet.getInt());
                return;
            case 240:
                setAncrageAuContenu(wDObjet.getInt());
                return;
            case C0607n.bh /*241*/:
                setMargeInterCellules(wDObjet.getInt());
                return;
            case 242:
                setAvecZoom(wDObjet.getBoolean());
                return;
            case C0607n.Xn /*243*/:
                setNum1erJourDeLaSemaine(wDObjet.getInt());
                return;
            case 245:
                setAvant(wDObjet);
                return;
            case 246:
                setApres(wDObjet);
                return;
            default:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return;
        }
    }

    public void setProp(EWDPropriete eWDPropriete, WDProcedureInterne wDProcedureInterne) {
        setProp(eWDPropriete, new WDProcedure((C0612h) wDProcedureInterne));
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        setPropString(eWDPropriete, str);
    }

    public void setProp(EWDPropriete eWDPropriete, boolean z) {
        mo2610a(eWDPropriete, z);
    }

    public void setProp(EWDPropriete eWDPropriete, byte[] bArr) {
        mo2611a(eWDPropriete, bArr);
    }

    protected void setPropDouble(EWDPropriete eWDPropriete, double d) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case 1:
                setValeur(d);
                return;
            case 2:
                setValeurInitiale(d);
                return;
            case 93:
                setEnJours(d);
                return;
            case 95:
                setEnHeures(d);
                return;
            case 97:
                setEnMinutes(d);
                return;
            case 99:
                setEnSecondes(d);
                return;
            case C0607n.Nr /*177*/:
                setAxeXMin(d);
                return;
            case C0607n.Gk /*178*/:
                setAxeXMax(d);
                return;
            case C0607n.yt /*179*/:
                setAxeYMin(d);
                return;
            case 180:
                setAxeYMax(d);
                return;
            case C0607n.uw /*244*/:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return;
            default:
                setProp(eWDPropriete, new WDReel(d));
                return;
        }
    }

    protected void setPropInt(EWDPropriete eWDPropriete, int i) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case 1:
                setValeur(i);
                return;
            case 2:
                setValeurInitiale(i);
                return;
            case 7:
                setType(i);
                return;
            case 9:
                setLigne(i);
                return;
            case 10:
                setColonne(i);
                return;
            case 11:
                setXInitial(i);
                return;
            case 12:
                setYInitial(i);
                return;
            case 13:
                setX(i);
                return;
            case 14:
                setY(i);
                return;
            case 15:
                setLargeur(i);
                return;
            case 16:
                setLargeurInitiale(i);
                return;
            case 17:
                setLargeurMax(i);
                return;
            case 18:
                setLargeurMin(i);
                return;
            case 19:
                setHauteur(i);
                return;
            case 20:
                setHauteurInitiale(i);
                return;
            case 21:
                setHauteurMax(i);
                return;
            case 22:
                setHauteurMin(i);
                return;
            case 23:
                setCouleur(i);
                return;
            case 24:
                setCouleurFond(i);
                return;
            case 27:
                setCadrageHorizontal(i);
                return;
            case 28:
                setCadrageVertical(i);
                return;
            case 30:
                setPoliceTaille(i);
                return;
            case 35:
                setAncrage(i);
                return;
            case 36:
                setTauxAncrageBas(i);
                return;
            case 37:
                setTauxAncrageHauteur(i);
                return;
            case 38:
                setTauxAncrageLargeur(i);
                return;
            case 39:
                setTauxAncrageDroite(i);
                return;
            case 40:
                setNombreColonne(i);
                return;
            case 41:
                setLargeurColonne(i);
                return;
            case 43:
                setHauteurLigne(i);
                return;
            case 44:
                setHauteurLigneMax(i);
                return;
            case 47:
                setEtat(i);
                return;
            case 48:
                setEtatInitial(i);
                return;
            case 50:
                setPlan(i);
                return;
            case 51:
                setNumTab(i);
                return;
            case 52:
                setImageMode(i);
                return;
            case 65:
                setCurseur(i);
                return;
            case 66:
                setFinCurseur(i);
                return;
            case 67:
                setTaille(i);
                return;
            case 68:
                setLargeurImage(i);
                return;
            case 69:
                setHauteurImage(i);
                return;
            case 70:
                setXImage(i);
                return;
            case 71:
                setYImage(i);
                return;
            case 72:
                setOccurrence(i);
                return;
            case 73:
                setAltitude(i);
                return;
            case 80:
                setImageEtat(i);
                return;
            case 82:
                setImageFondEtat(i);
                return;
            case 84:
                setTypeSaisie(i);
                return;
            case 90:
                setAnnee(i);
                return;
            case 91:
                setMois(i);
                return;
            case 92:
                setJour(i);
                return;
            case 94:
                setTHeure(i);
                return;
            case 96:
                setMinute(i);
                return;
            case 98:
                setSeconde(i);
                return;
            case 100:
                setMilliSeconde(i);
                return;
            case 112:
                setDndCible(i);
                return;
            case 113:
                setDndSource(i);
                return;
            case 114:
                setAvanceRapide(i);
                return;
            case C0607n.bx /*127*/:
                setNbRubrique(i);
                return;
            case 128:
                setNbRubriqueCle(i);
                return;
            case C0607n.Wj /*129*/:
                setNbRubriqueMemo(i);
                return;
            case 136:
                setIndice(i);
                return;
            case 138:
                setNbComposante(i);
                return;
            case C0536n.f995G /*142*/:
                setTypeCle(i);
                return;
            case 143:
                setTypeTri(i);
                return;
            case 148:
                setAcces(i);
                return;
            case 159:
                setStyleFond(i);
                return;
            case C0607n.kh /*161*/:
                setTypeRemplissage(i);
                return;
            case C0607n.Ru /*162*/:
                setEllipse(i);
                return;
            case 164:
                setCouleurJauge(i);
                return;
            case C0536n.f1002n /*170*/:
                setZoom(i);
                return;
            case 171:
                setModeCarte(i);
                return;
            case 181:
                setDureeAnimation(i);
                return;
            case 185:
                setOpacite(i);
                return;
            case 187:
                setHauteurUtile(i);
                return;
            case 188:
                setHauteurUtile(i);
                return;
            case 190:
                setHauteurTitre(i);
                return;
            case C0607n.Uk /*196*/:
                setGranulariteDeplacement(i);
                return;
            case C0607n.Eg /*197*/:
                setGranulariteDuree(i);
                return;
            case C0607n.jk /*198*/:
                setHauteurRessource(i);
                return;
            case C0607n.me /*206*/:
                setTauxParallaxeHauteur(i);
                return;
            case C0607n.Px /*207*/:
                setTauxParallaxeY(i);
                return;
            case C0607n.qj /*208*/:
                setBoutonSuppression(i);
                return;
            case 215:
                setCouleurTexteAutomatique(i);
                return;
            case 216:
                setLargeurElement(i);
                return;
            case 217:
                setHauteurElement(i);
                return;
            case 218:
                setMargeHauteur(i);
                return;
            case 219:
                setMargeLargeur(i);
                return;
            case C0607n.Qt /*221*/:
                setCryptage(i);
                return;
            case 223:
                setOption(i);
                return;
            case 228:
                setTimestampType(i);
                return;
            case C0607n.no /*230*/:
                setCouleurBarreSysteme(i);
                return;
            case 235:
                setRetraitGauche(i);
                return;
            case 236:
                setRetraitDroit(i);
                return;
            case C0607n.yk /*237*/:
                setRetraitHaut(i);
                return;
            case 238:
                setRetraitBas(i);
                return;
            case C0607n.Au /*239*/:
                setCouleurFondTitre(i);
                return;
            case 240:
                setAncrageAuContenu(i);
                return;
            case C0607n.bh /*241*/:
                setMargeInterCellules(i);
                return;
            case C0607n.Xn /*243*/:
                setNum1erJourDeLaSemaine(i);
                return;
            case C0607n.uw /*244*/:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return;
            default:
                setProp(eWDPropriete, new WDEntier4(i));
                return;
        }
    }

    public void setPropLiaisonFichier(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[3]));
    }

    protected void setPropLong(EWDPropriete eWDPropriete, long j) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case 1:
                setValeur(j);
                return;
            case 2:
                setValeurInitiale(j);
                return;
            case 101:
                setEnMillisecondes(j);
                return;
            case C0607n.uw /*244*/:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return;
            default:
                setProp(eWDPropriete, new WDEntier8(j));
                return;
        }
    }

    protected void setPropString(EWDPropriete eWDPropriete, String str) {
        switch (C0724h.f1835a[eWDPropriete.ordinal()]) {
            case 1:
                setValeur(str);
                return;
            case 2:
                setValeurInitiale(str);
                return;
            case 4:
                setValeurMemorisee(str);
                return;
            case 5:
                setNom(str);
                return;
            case 6:
                setNomComplet(str);
                return;
            case 8:
                setLibelle(str);
                return;
            case 25:
                setBulle(str);
                return;
            case 26:
                setBulleTitre(str);
                return;
            case 29:
                setPoliceNom(str);
                return;
            case 42:
                setTitre(str);
                return;
            case 53:
                setContenuInitial(str);
                return;
            case 55:
                setClicDroit(str);
                return;
            case 56:
                setDoubleClic(str);
                return;
            case 79:
                setImage(str);
                return;
            case 81:
                setImageFond(str);
                return;
            case 87:
                setFormatMemorise(str);
                return;
            case 104:
                setNote(str);
                return;
            case 105:
                setFichierParcouru(str);
                return;
            case 106:
                setRubriqueParcourue(str);
                return;
            case 107:
                setRubriqueAffichee(str);
                return;
            case 108:
                setRubriqueMemorisee(str);
                return;
            case 110:
                setPropLiaisonFichier(str);
                return;
            case 111:
                setAlias(str);
                return;
            case 119:
                setFenetreSource(str);
                return;
            case C0607n.co /*120*/:
                setAbreviation(str);
                return;
            case 121:
                setBaseDeDonnees(str);
                return;
            case 122:
                setConditionFiltre(str);
                return;
            case 126:
                setConnexion(str);
                return;
            case 131:
                setRubriqueFiltree(str);
                return;
            case C0607n.Fb /*134*/:
                setFichierOrigine(str);
                return;
            case C0538a.Nb /*135*/:
                setRubriqueOrigine(str);
                return;
            case 141:
                setTexte(str);
                return;
            case 145:
                setSource(str);
                return;
            case 146:
                setUtilisateur(str);
                return;
            case 147:
                setProvider(str);
                return;
            case 149:
                setServeur(str);
                return;
            case C0536n.f1006y /*150*/:
                setInfosEtendues(str);
                return;
            case 151:
                setNomDecrit(str);
                return;
            case 152:
                setNomPhysiqueDecrit(str);
                return;
            case 153:
                setNomPhysique(str);
                return;
            case 155:
                setImageDeroulee(str);
                return;
            case 156:
                setImageEnroulee(str);
                return;
            case 157:
                setSousLibelle(str);
                return;
            case 166:
                setDateDebut(str);
                return;
            case 167:
                setDateFin(str);
                return;
            case 168:
                setIndication(str);
                return;
            case 182:
                setLangue(str);
                return;
            case 183:
                setLangueDecrit(str);
                return;
            case 184:
                setValeurRecherche(str);
                return;
            case 199:
                setHeureOuvrableDebut(str);
                return;
            case C0607n.Dt /*200*/:
                setHeureOuvrableFin(str);
                return;
            case C0607n.Bf /*201*/:
                setMasqueTitreDate(str);
                return;
            case C0607n.Ug /*202*/:
                setMasqueTitreHeure(str);
                return;
            case 204:
                setRessourceSelectionnee(str);
                return;
            case C0607n.af /*209*/:
                setImageFondLigne(str);
                return;
            case 226:
                setFormuleRubriqueCalculee(str);
                return;
            case 227:
                setValeurParDefautCalculee(str);
                return;
            case C0607n.Yw /*229*/:
                setTitreNote(str);
                return;
            case C0607n.uw /*244*/:
                WDErreurManager.m2883a(C0745b.m3222b(f804z[C0542t.f1193i], new String[0]));
                return;
            default:
                setProp(eWDPropriete, new WDChaine(str));
                return;
        }
    }

    public void setProvider(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0536n.f1002n]));
    }

    public void setPubliciteChargee(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], EWDPropriete.PROP_PUBLICITECHARGEE.toString()));
    }

    public void setRendezVousContinu(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_RENDEZVOUSCONTINU);
    }

    public void setRessourceSelectionnee(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_RESSOURCESELECTIONNEE);
    }

    public void setRetraitBas(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITBAS);
    }

    public void setRetraitDroit(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITDROIT);
    }

    public void setRetraitGauche(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITGAUCHE);
    }

    public void setRetraitHaut(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_RETRAITHAUT);
    }

    public void setRubriqueAffichee(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[98]));
    }

    public void setRubriqueFiltree(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[159]));
    }

    public void setRubriqueMemorisee(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[169]));
    }

    public void setRubriqueOrigine(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[107]));
    }

    public void setRubriqueParcourue(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[153]));
    }

    public void setSaisieDirecteRDV(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_SAISIEDIRECTERDV);
    }

    public void setScrollAuDoigt(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_SCROLLAUDOIGT);
    }

    public void setSeconde(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[164]));
    }

    public void setSecuriteHTML(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[26]));
    }

    public void setSelectionPeriode(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_SELECTIONPERIODE);
    }

    public void setSelectionnee(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[58]));
    }

    public void setServeur(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[148]));
    }

    public void setSource(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[158]));
    }

    public void setSousLibelle(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[71]));
    }

    public void setStyleFond(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[20]));
    }

    public void setTHeure(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[17]));
    }

    public void setTaille(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[30]));
    }

    public void setTauxAncrageBas(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[70]));
    }

    public void setTauxAncrageDroite(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.aw]));
    }

    public void setTauxAncrageHauteur(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[90]));
    }

    public void setTauxAncrageLargeur(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[160]));
    }

    public void setTauxParallaxeHauteur(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_TAUXPARALLAXEHAUTEUR);
    }

    public void setTauxParallaxeY(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_TAUXPARALLAXEY);
    }

    public void setTexte(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[105]));
    }

    public void setTimestampType(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_TIMESTAMPTYPE);
    }

    public void setTimestampUTC(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_TIMESTAMPUTC);
    }

    public void setTitre(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.co]));
    }

    public void setTitreNote(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_TITRENOTE);
    }

    public void setTriable(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[43]));
    }

    public void setTriee(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[96]));
    }

    public void setType(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[100]));
    }

    public void setTypeCle(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[118]));
    }

    public void setTypeRemplissage(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[C0607n.Ao])));
    }

    public void setTypeSaisie(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_TYPESAISIE);
    }

    public void setTypeTri(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[106]));
    }

    public void setUtilisateur(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[168]));
    }

    public void setValeur(byte b) {
        setValeur(new WDEntier1(b));
    }

    public void setValeur(double d) {
        setValeur(new WDReel(d));
    }

    public void setValeur(int i) {
        setValeur(new WDEntier4(i));
    }

    public void setValeur(long j) {
        setValeur(new WDEntier8(j));
    }

    public abstract void setValeur(WDObjet wDObjet);

    public void setValeur(WDProcedureInterne wDProcedureInterne) {
        setValeur(wDProcedureInterne.executer(new WDObjet[0]));
    }

    public void setValeur(String str) {
        setValeur(new WDChaine(str));
    }

    public void setValeur(BigDecimal bigDecimal) {
        setValeur(bigDecimal.doubleValue());
    }

    public void setValeur(short s) {
        setValeur(new WDEntier2(s));
    }

    public void setValeur(boolean z) {
        setValeur(new WDBooleen(z));
    }

    public void setValeur(byte[] bArr) {
        setValeur(C0725i.m3034a(bArr));
    }

    public void setValeurAffichee(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[172])));
    }

    public void setValeurInitiale(double d) {
        setValeurInitiale(new WDReel(d));
    }

    public void setValeurInitiale(int i) {
        setValeurInitiale(new WDEntier4(i));
    }

    public void setValeurInitiale(long j) {
        setValeurInitiale(new WDEntier8(j));
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.kh]));
    }

    public void setValeurInitiale(String str) {
        setValeurInitiale(new WDChaine(str));
    }

    public void setValeurInitiale(boolean z) {
        setValeurInitiale(new WDBooleen(z));
    }

    public void setValeurMemorisee(String str) {
        erreurAppelPropriete(C0745b.m3219a(f804z[56]));
    }

    public void setValeurParDefaut(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[41]));
    }

    public void setValeurParDefautCalculee(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_VALEURPARDEFAUTCALCULEE);
    }

    public void setValeurRecherche(String str) {
        erreurAppelPropriete(EWDPropriete.PROP_VALEURRECHERCHE);
    }

    public void setValeurRenvoyee(WDObjet wDObjet) {
        erreurAppelPropriete(C0745b.m3219a(f804z[117]));
    }

    public void setValeurXMLDeserialisation(String str) {
        setValeur(str);
    }

    public void setVerifieOrthographe(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_VERIFIEORTHOGRAPHE);
    }

    public void setVertical(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[119])));
    }

    public void setVide(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f804z[12], C0745b.m3219a(f804z[174])));
    }

    public void setVisible(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[50]));
    }

    public void setVisibleInitial(boolean z) {
        erreurAppelPropriete(C0745b.m3219a(f804z[4]));
    }

    public void setX(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[143]));
    }

    public void setXImage(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[97]));
    }

    public void setXInitial(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.Hn]));
    }

    public void setY(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[C0607n.bx]));
    }

    public void setYImage(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[72]));
    }

    public void setYInitial(int i) {
        erreurAppelPropriete(C0745b.m3219a(f804z[65]));
    }

    public void setZoom(int i) {
        erreurAppelPropriete(EWDPropriete.PROP_ZOOM);
    }

    public void setZoom(WDObjet wDObjet) {
        setZoom(wDObjet.getInt());
    }

    public void setZoomAuDoigt(boolean z) {
        erreurAppelPropriete(EWDPropriete.PROP_ZOOMAUDOIGT);
    }

    public String toString() {
        WDObjet valeur = getValeur();
        return valeur != null ? valeur.getString() : "";
    }
}
