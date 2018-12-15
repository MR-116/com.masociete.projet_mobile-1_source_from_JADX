package fr.pcsoft.wdjava.database.hf.p049c;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.WDHF;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJaugeJNI;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: fr.pcsoft.wdjava.database.hf.c.c */
public class C0842c implements Externalizable, C0832f {
    private static final long serialVersionUID = 1;
    /* renamed from: z */
    private static final String[] f2249z;
    /* renamed from: a */
    private C0846i f2250a;
    /* renamed from: b */
    private transient HashMap f2251b = new HashMap();
    /* renamed from: c */
    private transient WDHF f2252c;

    static {
        String[] strArr = new String[C0607n.Ux];
        strArr[0] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm/W\bJ8A/J<A\u001bM.A"));
        strArr[1] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/"));
        strArr[2] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>j\u0013so\"]\u000fwN?A"));
        strArr[3] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vi/V\u0015xV/m\u0012zZ2"));
        strArr[4] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vo8M\u0013lV>A"));
        strArr[5] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|%I\fM/v\t|M#U\t{"));
        strArr[6] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl+Q\n{o%W\u0015jV%J"));
        strArr[7] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{m?F\u000ewN?A"));
        strArr[8] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vp?R\u000e{|%J\u0012{G#K\u0012"));
        strArr[9] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vi/V\u000fLJ(V\u0015oJ/"));
        strArr[10] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006h\u0015mK/p\u001d|S/W"));
        strArr[11] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013LJ(V\u0015oJ/"));
        strArr[12] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl>E\b]^&G\trZ"));
        strArr[13] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm+]\u0019"));
        strArr[14] = C0842c.m5436z(C0842c.m5437z(" J\u0015RV(A\u000e{M\u0003@?qQ$A\u0004wP$"));
        strArr[15] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A;lP?T\u0019"));
        strArr[16] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vk8E\u0012m^)P\u0015qQ\u000bJ\u0012kS/"));
        strArr[17] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy/V\u0011{|%J\u0012{G#K\u0012"));
        strArr[18] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/P\u000ekV>p\u000ewX-A\u000eMZ8R\u0019kM"));
        strArr[19] = C0842c.m5436z(C0842c.m5437z(">E\u001erZ\u001cM\u000ejJ+H1qI/"));
        strArr[20] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006i\u0013zV,M\u0019"));
        strArr[21] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~>P\u001d}W/i\u0019sP"));
        strArr[22] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006a\u0012ZZ\"K\u000em"));
        strArr[23] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{?T\u0010wN?A>L/`\u0019ZP$J\u0019{L"));
        strArr[24] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/`\u000eqV>b\u0015}W#A\u000e"));
        strArr[25] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vi/V\u000fwP$"));
        strArr[26] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy%V\u001f{z)V\u0015jJ8A"));
        strArr[27] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz8V\u0019kM\u0003J\b{X8M\b{"));
        strArr[28] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u0012yZ\u0018A\fMn\u0006"));
        strArr[29] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006v\u0019}J:a\u0012]P?V\u000f"));
        strArr[30] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz)V\u0015j"));
        strArr[31] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006`\u0019lQ#A\u000e"));
        strArr[32] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$P\u0019l[#P=}\\/W>L/`\u0019ZP$J\u0019{L"));
        strArr[33] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vo+W\u000f{"));
        strArr[34] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#F\u0019lZ"));
        strArr[35] = C0842c.m5436z(C0842c.m5437z(" J\u0015MZ>r\u001drZ?V2kS&"));
        strArr[36] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|8A\u001djV%J/wv$A\u0004wL>E\u0012j"));
        strArr[37] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{+P\u0019[Q8A\u001b"));
        strArr[38] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~ K\tjZ\rV\u0013kO/"));
        strArr[39] = C0842c.m5436z(C0842c.m5437z("9U\u0010JM+J\u000f\\>M\u0013pl?V?qQ$A\u0004wP$"));
        strArr[40] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013XV)L\u0015{M"));
        strArr[41] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006t\u000e{R#A\u000e"));
        strArr[42] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006a\u0004{\\"));
        strArr[43] = C0842c.m5436z(C0842c.m5437z(" J\u0015WL\u0004Q\u0010r"));
        strArr[44] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl+Q\n{o+V\u001dsZ>V\u0019"));
        strArr[45] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr+M\u0012jZ$E\u0012}Z\u0019A\u000ehZ?V"));
        strArr[46] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>h\u001dpX?A"));
        strArr[47] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{y#G\u0014wZ8"));
        strArr[48] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vq(a\u0012l"));
        strArr[49] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/q\bwS#W\u001djZ?V"));
        strArr[50] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>t\u000eqO\u0018Q\u001elV;Q\u0019MK8M\u0012y"));
        strArr[51] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz2T\u0013lK/|1R"));
        strArr[52] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz$V\u0019yV9P\u000e{R/J\bHZ8W6Mp\u0004"));
        strArr[53] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr#W\u0019_u%Q\u000eLZ;Q\u0019jZ"));
        strArr[54] = C0842c.m5436z(C0842c.m5437z(" J\u0015MZ>r\u001dlV+F\u0010{w\f"));
        strArr[55] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl#I\trZ\u0018A\u000f{^?"));
        strArr[56] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{(C"));
        strArr[57] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006w\twI+J\b"));
        strArr[58] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A"));
        strArr[59] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vp?R\u000e{~$E\u0010gL/"));
        strArr[60] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ8A4JM+J\u000f\\>M\u0013p"));
        strArr[61] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006g\u0013rP$J\u00196m/UU"));
        strArr[62] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vk8E\u0012m^)P\u0015qQ\u0006M\u001e{M/"));
        strArr[63] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u0012yZ\tK\u0012pZ2M\u0013p"));
        strArr[64] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006f\u001dmZ"));
        strArr[65] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{j>M\u0010wL+P\u0019kM"));
        strArr[66] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm/G\tnZ8A.k]8M\rkZ"));
        strArr[67] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/t\u000eqO8M\u0019jZ\fM\u001fvV/V"));
        strArr[68] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/G\u0010M/a\u0004jZ8J\u0019]l"));
        strArr[69] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vk8E\u0012m^)P\u0015qQ\u0003J\b{M8K\u0011nJ/"));
        strArr[70] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013M^?R\u0019y^8@\u0019"));
        strArr[71] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vx/V\u0019ZP?F\u0010qQ"));
        strArr[72] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A?qS&A\u001fjV%J"));
        strArr[73] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\bM\u0012MK8M\u0012y"));
        strArr[74] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm/G\u0013pQ/G\b{"));
        strArr[75] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?F\u000fjm/T"));
        strArr[76] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/`\u000eqV>f\u001dmZ\u000eA8qQ$A\u0019m"));
        strArr[77] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vp?R\u000e{"));
        strArr[78] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vx/V\u0019WQ>A\u001blV>A"));
        strArr[79] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/W\u001d}K#R\u0019JM#C\u001b{M\u0019A\u000ehZ?V"));
        strArr[80] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013ZM%M\b\\^9A8{{%J\u0012{Z9"));
        strArr[81] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013NM%T\u000ewZ>A>L/`\u0019ZP$J\u0019{L"));
        strArr[82] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\tK\u0011nM#W9pK8A"));
        strArr[83] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~$J\trZ\u000eA\u001fr^8E\bwP$"));
        strArr[84] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{r%P*w[/"));
        strArr[85] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vk8E\u0012m^)P\u0015qQ\u0003W\u0013r^>M\u0013p"));
        strArr[86] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz2T\u0013lK/n/Qq"));
        strArr[87] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{k+G\u0014{"));
        strArr[88] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u0012yZ\u0018A\fJP?W"));
        strArr[89] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006m\u0012xP\rA\u0012{"));
        strArr[90] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm/G\tnZ8A/J<A\u001bM.A"));
        strArr[91] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{s#E\u0015mP$"));
        strArr[92] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006v\u0019oJ/P\u0019"));
        strArr[93] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/`\u000eqV>r\t{"));
        strArr[94] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A,M+I\u0019jM/"));
        strArr[95] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{|&A"));
        strArr[96] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{v$@\u0019fy?H\u0010JZ2P"));
        strArr[97] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|8A\u0019JM#C\u001b{M\u0019A\u000ehZ?V"));
        strArr[98] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl+Q\n{X+V\u0018{"));
        strArr[99] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz2A\u001fkK/v\u0019oJ/P\u0019"));
        strArr[100] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{x8K\tnZ"));
        strArr[101] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vk8E\u0012m^)P\u0015qQ\fM\u0012"));
        strArr[102] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vq?I9pM"));
        strArr[103] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>t\u000eqO\u0018Q\u001elV;Q\u0019\\P%H\u0019Q"));
        strArr[104] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006e\nQ)A"));
        strArr[105] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/w\blJ)P\tlZ\u001eK\tm"));
        strArr[106] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A)jV&M\u000fK/Q\u000e"));
        strArr[107] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vo%W\u0015jV%J?qJ8E\u0012jZ"));
        strArr[108] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A(\\\"A"));
        strArr[109] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz2A\u001fkK/v\u0019oJ/P\u0019Mn\u0006"));
        strArr[110] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>m\u0018LJ(V\u0015oJ/l:"));
        strArr[111] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|8A\u001djV%J"));
        strArr[112] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006h\u0015j|%H"));
        strArr[113] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>t\u000eqO\fM\u001fvV/V0qQ-"));
        strArr[114] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>t\u000eqO\u0018Q\u001elV;Q\u0019RP$C"));
        strArr[115] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013KK#H\u0015m^>A\tl"));
        strArr[116] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006g\u0013r"));
        strArr[117] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm/M\u0012zZ2A"));
        strArr[118] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006`\u0019}P$J\u0019}K/"));
        strArr[119] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vo8M\u0013lV>A?rV/J\b"));
        strArr[C0607n.co] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|%T\u0015{y#G\u0014wZ8"));
        strArr[121] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|%J\u000fjM?M\bH^&g\u0010{"));
        strArr[122] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vx/V\u0019SZ'K"));
        strArr[123] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy/V\u0011{"));
        strArr[C0607n.Hn] = C0842c.m5436z(C0842c.m5437z("-A\bP]\u000fJ\u000eIW#H\u0019XV&H\u0015pX"));
        strArr[125] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl>E\bZ^>A"));
        strArr[126] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006b\u0019lR/"));
        strArr[C0607n.bx] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz>E\b"));
        strArr[128] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013ZM%M\bHJ/"));
        strArr[C0607n.Wj] = C0842c.m5436z(C0842c.m5437z("#W?Q\rM\n{q(a\u0012lh\"M\u0010{y#H\u0010wQ-"));
        strArr[130] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006p\u0015jM/g\u0013r"));
        strArr[131] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{o+V\u001dsZ>V\u0019"));
        strArr[C0538a.tb] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl>E\bP]\u000eK\t|S%J"));
        strArr[133] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl>E\bP]\u000fJ\u000eWQ>A\u000eh^&H\u0019"));
        strArr[C0607n.Fb] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~&M\u001dm"));
        strArr[C0538a.Nb] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~ K\tjZ"));
        strArr[136] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy\u001eh\u0015mK/i\u0013j"));
        strArr[137] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\u0003@\u0019pK#U\t{"));
        strArr[138] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vx/V\u0019JM+J\u000f\\>M\u0013pk%Q\u000f"));
        strArr[139] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>r\u001dlV+F\u0010{w\f"));
        strArr[C0542t.f1193i] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz8V\u0019kM\u0003J\u001aq"));
        strArr[141] = C0842c.m5436z(C0842c.m5437z("\u000fV\u000e{J8\u0004\u0018{\u001f)H\u0013p^-A\\z\u0018?J\u0019>\\&E\u000fmZj@[\\)Ì\u000f>ßjl:0"));
        strArr[C0536n.f995G] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/t\u000eqO8M\u0019jZ\u0019A\u000ehZ?V"));
        strArr[143] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013ZM%M\bXV)L\u0015{M"));
        strArr[C0538a.Lb] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006a\u000elZ?V"));
        strArr[145] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr#W\u0019_u%Q\u000e]P&H\u0019}K#K\u0012"));
        strArr[146] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013\\S%G\u001dyZ\tK\u0012pZ2M\u0013p"));
        strArr[147] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>t\u000eqO\fM\u001fvV/V>qP&"));
        strArr[148] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{z&A\u0011{Q>w\bq\\!A"));
        strArr[149] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vo+W\u000f{l\u001bh"));
        strArr[C0536n.f1006y] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013MZ8R\u0019kM"));
        strArr[151] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz$R\u0013wZ\u0007A\u000fm^-A*{M9g\u0010wZ$P"));
        strArr[152] = C0842c.m5436z(C0842c.m5437z(" J\u0015V}&K\rkZ\u0004Q\u0011[Q8"));
        strArr[153] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>m\u0018]P$J\u0019fV%J4X"));
        strArr[154] = C0842c.m5436z(C0842c.m5437z("#W2|z$V2{Z.t\u001dlL/"));
        strArr[155] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\u0019P\u000ewQ-w\blV$C"));
        strArr[156] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{}+W\u0019ZZ\u000eK\u0012pZ/W"));
        strArr[157] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vx/V\u0019MZ8R\u0019kM"));
        strArr[158] = C0842c.m5436z(C0842c.m5437z(" J\u0015MZ>l?rV/J\b"));
        strArr[159] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A.{N?A\b{"));
        strArr[160] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm\u000b~;lP?T\u0019"));
        strArr[C0607n.kh] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006a\u0012]P?V\u000f"));
        strArr[C0607n.Ru] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A>L/`\u0019ZP$J\u0019{L"));
        strArr[C0607n.Ao] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#G\u0014wZ8a\u0004wL>A"));
        strArr[164] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/G\u0013pQ/G\b{|&M\u0019pK"));
        strArr[165] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u0012yZ\u0018A\f"));
        strArr[166] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~)P\u0015hZ\u001eV\u0015yX/V/{M<A\tl"));
        strArr[167] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm+^)jV&M\u000fK/Q\u000e"));
        strArr[168] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A:w\\\"M\u0019l"));
        strArr[169] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\u0003@\u0019pK#U\t{}#J"));
        strArr[C0536n.f1002n] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013SZ'K"));
        strArr[171] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vo%W\u0015jV%J\u0012{"));
        strArr[172] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz8V\u0019kM\bH\u0013}^-A"));
        strArr[173] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u000eyZ\u001aE\u000eR/P\u000e{"));
        strArr[174] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vi/V\u000fXV)L\u0015{M"));
        strArr[C0607n.hu] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm/M\u0012zZ2E\bwP$a\u0012]P?V\u000f"));
        strArr[C0607n.aw] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~)P\u0015hZ\fM\u0010jM/"));
        strArr[C0607n.Nr] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006g\u0013pQ/G\b{"));
        strArr[C0607n.Gk] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz8V\u0019kM\u0007K\bZZ\u001aE\u000fmZ"));
        strArr[C0607n.yt] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/W\u001d}K#R\u0019XV&P\u000e{"));
        strArr[180] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006t\u0013mV>M\u0013pQ/"));
        strArr[181] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vx/V\u0019]^)L\u0019"));
        strArr[182] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013NM%T\u000ewZ>A:w\\\"M\u0019l"));
        strArr[183] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv'T\u0013lK/p\u0019fK/"));
        strArr[184] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{l/V\n{J8"));
        strArr[185] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\tK\u0011sZ$G\u0019N^8"));
        strArr[C0607n.pw] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{k8M\u001byZ8w\u0019lI/Q\u000e"));
        strArr[187] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006p\u000eQ9E\u001fjV%J"));
        strArr[188] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~$J\trZ\u0018A\u001fvZ8G\u0014{"));
        strArr[189] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006t\u000e{\\/@\u0019pK"));
        strArr[190] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vk8E\u0012m^)P\u0015qQ\u000eA\u001ekK"));
        strArr[191] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vi/V\u0015xV/w\blJ>Q\u000e{"));
        strArr[192] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vo+W\u000f{k%Q\u000f"));
        strArr[193] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ"));
        strArr[C0607n.nn] = C0842c.m5436z(C0842c.m5437z(" J\u0015WL\u000fV\u000e{J8b\u001dj^&A"));
        strArr[C0607n.oq] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006h\u0015jr/I\u0013JZ2P\u0019"));
        strArr[C0607n.Uk] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl>E\bP]\u000fJ\u000e"));
        strArr[C0607n.Eg] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~ K\tjZ\u001fP\u0015rV9E\b{J8"));
        strArr[C0607n.jk] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vm+^?rV/J\b"));
        strArr[199] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\tK\u0011sZ$G\u0019N^8f\u0015p"));
        strArr[C0607n.Dt] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013_Q+H\u0005mZ"));
        strArr[C0607n.Bf] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz2A\u001fkK/t\u000eq\\/@\tlZ"));
        strArr[C0607n.Ug] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0019JP?W"));
        strArr[C0607n.f1465w] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#F\u0019lZ\u001aK\u000fwK#K\u0012"));
        strArr[204] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>h\u001dpX?A8{\\8M\b"));
        strArr[C0607n.f1441Y] = C0842c.m5436z(C0842c.m5437z(" J\u0015V}&K\rkZ\fM\u001fvV/V"));
        strArr[C0607n.me] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006j\u001e]P&"));
        strArr[C0607n.Px] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A/J<A\u001bM.A"));
        strArr[C0607n.qj] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz$V\u0019yV9P\u000e{R/J\bHZ8W$Ss"));
        strArr[C0607n.af] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006h\u0015jr/I\u0013"));
        strArr[C0607n.Bs] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>j\u0013kI/H9pM/C\u0015mK8A\u0011{Q>"));
        strArr[C0607n.lh] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~$J\trZ\u0019E\thZ-E\u000ezZ"));
        strArr[C0607n.Ep] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{j>M\u0010wL+P\u0019kM\tK\u0012pZ)P\u0019"));
        strArr[213] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A.{O/V\bqV8A"));
        strArr[214] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl?T\flV'A(qJ>"));
        strArr[215] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006j\u001eRV-"));
        strArr[216] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/t\u000eqO8M\u0019jZ\bE\u000f{{/`\u0013pQ/A\u000f"));
        strArr[217] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u0012yZ\u0004K\u0011"));
        strArr[218] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/c\u000eqJ:A"));
        strArr[219] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vk8E\u0012m^)P\u0015qQ\u0006M\u000fjZ"));
        strArr[C0607n.Tv] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u0012yZ\tH\u0019"));
        strArr[C0607n.Qt] = C0842c.m5436z(C0842c.m5437z(" J\u0015YZ>t\u000eqO\fM\u001fvV/V/jM#J\u001b"));
        strArr[C0607n.Cv] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013\\S%G\u001dyZ"));
        strArr[223] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv'T\u0013lK/n/Qq"));
        strArr[224] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013NM%T\u000ewZ>A/{M<A\tl"));
        strArr[225] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~$J\trZ\u000bH\u0015L"));
        strArr[226] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz8V\u0019kM\u000eK\t|S%J"));
        strArr[227] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013ZM%M\bMZ8R\u0019kM"));
        strArr[228] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vz8V\u0019kM"));
        strArr[C0607n.Yw] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/F\u0010qN?A2kR\u000fJ\u000e"));
        strArr[C0607n.no] = C0842c.m5436z(C0842c.m5437z(" J\u0015V~&M\u001dmk%Q\u000f"));
        strArr[231] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl>E\bVZ?V\u0019"));
        strArr[232] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006i\u0019mz8V\u0019kM"));
        strArr[233] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vv$B\u0013YM%Q\f{"));
        strArr[C0607n.Jn] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\bM\u0012\\V$"));
        strArr[235] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#J5pK/V\u0018wK\u000bG\u001f{L\bE\u000f{{/`\u0013pQ/A\u000f"));
        strArr[236] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006g\u0013rP$J\u00196k+F\u0010{\u0016"));
        strArr[C0607n.yk] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/G\u000ewK\u001eV\u0015yX/V/{M<A\tl"));
        strArr[238] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/F\u0010qN?A:w\\\"M\u0019l"));
        strArr[C0607n.Au] = C0842c.m5436z(C0842c.m5437z(" J\u0015V|\"E\u0012yZ\u0007K\bZZ\u001aE\u000fmZ"));
        strArr[240] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/w\blJ)P\tlZ"));
        strArr[C0607n.bh] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/G\u0010M/a\u0004jZ8J\u0019]S+W\u000fw\\"));
        strArr[242] = C0842c.m5436z(C0842c.m5437z(" J\u0015V{/G\u000ewK\tK\u0012pZ2M\u0013p"));
        strArr[C0607n.Xn] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vl/G\tlV>A"));
        strArr[C0607n.uw] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0019"));
        strArr[245] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vs#W\b{l3J\u0013pF'A"));
        strArr[246] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vi/V\u0015xV/m\u0012S>A\u000e{"));
        strArr[247] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vr%@\u0015xV/`\u000eqV>w\u0019lI/Q\u000e"));
        strArr[248] = C0842c.m5436z(C0842c.m5437z(" J\u0015Vy#H\blZ\u0019P\u000ewQ-f\u0015p"));
        strArr[249] = C0842c.m5436z(C0842c.m5437z(" J\u0015Mn\u0006g\u0013pQ/\\\u0015qQ"));
        f2249z = strArr;
    }

    public C0842c(C0846i c0846i) throws C0841b, WDJNIException {
        this.f2250a = c0846i;
        this.f2250a.m5768b();
        this.f2252c = new WDHF();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private fr.pcsoft.wdjava.database.hf.p049c.C0845h m5434a(long r10, fr.pcsoft.wdjava.database.hf.p049c.C0843d[] r12, boolean r13, boolean r14) throws fr.pcsoft.wdjava.database.hf.p049c.C0841b, fr.pcsoft.wdjava.jni.WDJNIException {
        /*
        r9 = this;
        r1 = new fr.pcsoft.wdjava.database.hf.c.h;
        r1.<init>();
        r0 = r9.f2252c;
        r2 = r9.mo3062x();
        r0 = r0.jniGetHTrouve(r2, r10);
        r1.m5764c(r0);
        r0 = r9.f2252c;
        r2 = r9.mo3062x();
        r0 = r0.jniGetHEnDehors(r2, r10);
        r1.m5762b(r0);
        if (r13 == 0) goto L_0x00fb;
    L_0x0021:
        r0 = r12.length;
        r2 = new java.lang.Object[r0];
        r0 = 0;
    L_0x0025:
        r3 = r2.length;
        if (r0 >= r3) goto L_0x00f4;
    L_0x0028:
        r3 = r12[r0];
        r4 = r9.f2252c;
        r4 = r3.m5751b(r4, r10);
        r6 = r3.m5754d();	 Catch:{ IllegalArgumentException -> 0x0058 }
        switch(r6) {
            case 3: goto L_0x0073;
            case 4: goto L_0x0061;
            case 5: goto L_0x0085;
            case 6: goto L_0x00a9;
            case 7: goto L_0x00bb;
            case 9: goto L_0x0073;
            case 17: goto L_0x00ce;
            case 24: goto L_0x0097;
            case 25: goto L_0x0097;
            case 26: goto L_0x0085;
            case 27: goto L_0x0097;
            case 28: goto L_0x00e1;
            case 29: goto L_0x00e1;
            case 30: goto L_0x00e1;
            case 36: goto L_0x0061;
            case 37: goto L_0x0046;
            case 38: goto L_0x0085;
            case 40: goto L_0x00e1;
            case 41: goto L_0x00ce;
            case 99: goto L_0x0043;
            case 100: goto L_0x0043;
            default: goto L_0x0037;
        };	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0037:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r7.m4604T(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r4;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0043:
        r0 = r0 + 1;
        goto L_0x0025;
    L_0x0046:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.lang.Boolean;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4609Y(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x0058:
        r4 = move-exception;
        r4 = r9.f2252c;
        r3.m5747a(r4, r10);
        r0 = r0 + -1;
        goto L_0x0043;
    L_0x0061:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.lang.Byte;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4599O(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x0073:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.lang.Short;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4597M(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x0085:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.lang.Integer;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4596L(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x0097:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.lang.Long;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4598N(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x00a9:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.lang.Float;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4608X(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x00bb:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.lang.Double;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4600P(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x00ce:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new java.math.BigDecimal;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4604T(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x00e1:
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7 = new fr.pcsoft.wdjava.core.types.WDChaine;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r8 = r9.f2252c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = r8.m4595K(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r7.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2[r6] = r7;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0043;
    L_0x00f4:
        r1.m5760a(r2);
    L_0x00f7:
        r1.m5759a(r14);
        return r1;
    L_0x00fb:
        r0 = 0;
        r1.m5760a(r0);
        goto L_0x00f7;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.c.c.a(long, fr.pcsoft.wdjava.database.hf.c.d[], boolean, boolean):fr.pcsoft.wdjava.database.hf.c.h");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m5435a(long r12, fr.pcsoft.wdjava.database.hf.p049c.C0845h r14, fr.pcsoft.wdjava.database.hf.p049c.C0843d[] r15) throws fr.pcsoft.wdjava.database.hf.p049c.C0841b, fr.pcsoft.wdjava.jni.WDJNIException {
        /*
        r11 = this;
        if (r14 == 0) goto L_0x00df;
    L_0x0002:
        r0 = r14.m5765c();	 Catch:{ IllegalArgumentException -> 0x0031 }
        if (r0 == 0) goto L_0x00df;
    L_0x0008:
        r2 = r14.m5765c();
        r0 = 0;
        r1 = r0;
    L_0x000e:
        r0 = r2.length;
        if (r1 >= r0) goto L_0x00df;
    L_0x0011:
        r3 = r15[r1];
        r0 = r11.f2252c;
        r4 = r3.m5751b(r0, r12);
        r0 = r3.m5754d();	 Catch:{ IllegalArgumentException -> 0x0045 }
        switch(r0) {
            case 3: goto L_0x0060;
            case 4: goto L_0x004e;
            case 5: goto L_0x0072;
            case 6: goto L_0x0096;
            case 7: goto L_0x00a8;
            case 9: goto L_0x0060;
            case 17: goto L_0x00bb;
            case 24: goto L_0x0084;
            case 25: goto L_0x0084;
            case 26: goto L_0x0072;
            case 27: goto L_0x0084;
            case 28: goto L_0x00cc;
            case 29: goto L_0x00cc;
            case 30: goto L_0x00cc;
            case 36: goto L_0x004e;
            case 37: goto L_0x0033;
            case 38: goto L_0x0072;
            case 40: goto L_0x00cc;
            case 41: goto L_0x00bb;
            case 99: goto L_0x002d;
            case 100: goto L_0x002d;
            default: goto L_0x0020;
        };	 Catch:{ IllegalArgumentException -> 0x0045 }
    L_0x0020:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.String) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4934z(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0045 }
    L_0x002d:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x000e;
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r0.booleanValue();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4732b(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x0045:
        r0 = move-exception;
        r0 = r11.f2252c;
        r3.m5747a(r0, r12);
        r1 = r1 + -1;
        goto L_0x002d;
    L_0x004e:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.Byte) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r0.byteValue();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4653a(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x0060:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.Short) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r0.shortValue();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4656a(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x0072:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r0.intValue();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4929x(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x0084:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.Long) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r8 = r0.longValue();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4909t(r4, r8);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x0096:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.Float) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r0.floatValue();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4655a(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x00a8:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (java.lang.Double) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r8 = r0.doubleValue();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4654a(r4, r8);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x00bb:
        r0 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6 = r2[r6];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6 = r6.toString();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0.m4934z(r4, r6);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x00cc:
        r6 = r11.f2252c;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r3.m5750b();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r2[r0];	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ IllegalArgumentException -> 0x0045 }
        r0 = r0.getDonneeBinaire();	 Catch:{ IllegalArgumentException -> 0x0045 }
        r6.m4657a(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0045 }
        goto L_0x002d;
    L_0x00df:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.c.c.a(long, fr.pcsoft.wdjava.database.hf.c.h, fr.pcsoft.wdjava.database.hf.c.d[]):void");
    }

    /* renamed from: z */
    private static String m5436z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 74;
                    break;
                case 1:
                    i2 = 36;
                    break;
                case 2:
                    i2 = C0607n.Hn;
                    break;
                case 3:
                    i2 = 30;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5437z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 63);
        }
        return toCharArray;
    }

    /* renamed from: A */
    public boolean mo2762A(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHActiveFiltre(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.aw], e);
        }
    }

    /* renamed from: B */
    public long mo2763B(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHNumEnr(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[102], e);
        }
    }

    /* renamed from: C */
    public boolean mo2764C(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeTout(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[214], e);
        }
    }

    /* renamed from: D */
    public boolean mo2765D(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDebloqueFichier(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[238], e);
        }
    }

    /* renamed from: E */
    public boolean mo2766E(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAnnuleDeclaration(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[83], e);
        }
    }

    /* renamed from: F */
    public String mo2767F(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeTache(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[87], e);
        }
    }

    /* renamed from: G */
    public String mo2768G(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeUtilisateur(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[65], e);
        }
    }

    /* renamed from: H */
    public C0845h mo2769H(long j) throws C0841b, WDJNIException {
        return m5434a(j, (C0843d[]) this.f2251b.get(new Long(j)), true, this.f2252c.jniHRazTous(mo3062x(), j));
    }

    /* renamed from: I */
    public boolean mo2770I(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAjouteUtilisateur(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Eg], e);
        }
    }

    /* renamed from: a */
    public int mo2771a(int i, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModeTous(mo3062x(), i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Ug], e);
        }
    }

    /* renamed from: a */
    public int mo2772a(int i, long j, long j2, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereCache(mo3062x(), i, j, j2, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[181], e);
        }
    }

    /* renamed from: a */
    public int mo2773a(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHEtat(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.bx], e);
        }
    }

    /* renamed from: a */
    public int mo2774a(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPositionCourante(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[107], e);
        }
    }

    /* renamed from: a */
    public int mo2775a(long j, long j2, WDObjet wDObjet, WDObjet wDObjet2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHCompareRubrique(mo3062x(), j, j2, wDObjet, wDObjet2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[5], e);
        }
    }

    /* renamed from: a */
    public int mo2776a(long j, long j2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHVerifieIndex(mo3062x(), j, j2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[3], e);
        }
    }

    /* renamed from: a */
    public int mo2777a(long j, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHReindexationEnCours(mo3062x(), j, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.hu], e);
        }
    }

    /* renamed from: a */
    public int mo2778a(long j, String str, String str2, boolean z, String str3, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSauvegarde(mo3062x(), j, str, str2, z, str3, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[98], e);
        }
    }

    /* renamed from: a */
    public int mo2779a(String str, String str2, String str3, String str4, String str5, String str6, String str7) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLConnecte(mo3062x(), str, str2, str3, str4, str5, str6, str7);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Nr], e);
        }
    }

    /* renamed from: a */
    public long mo2780a(long j, int i, boolean z) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        if (c0843dArr == null) {
            return -1;
        }
        long a;
        C0843d c0843d = c0843dArr[i];
        if (z) {
            c0843d.m5747a(this.f2252c, j);
            a = c0843d.m5746a();
        } else {
            a = c0843d.m5746a();
        }
        if (a != -1) {
            return a;
        }
        c0843d.m5747a(this.f2252c, j);
        return c0843d.m5746a();
    }

    /* renamed from: a */
    public long mo2781a(long j, long j2, long j3, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.tableVirtualMove(mo3062x(), j, j2, j3, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[19], e);
        }
    }

    /* renamed from: a */
    public long mo2782a(long j, long j2, WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHStatNbEnrIntervalle(mo3062x(), j, j2, wDObjetArr, wDObjetArr2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[133], e);
        }
    }

    /* renamed from: a */
    public long mo2783a(String str, C0843d[] c0843dArr) throws C0841b, WDJNIException {
        long d = this.f2252c.mo2917d(str);
        this.f2251b.put(new Long(d), c0843dArr);
        return d;
    }

    /* renamed from: a */
    public WDObjet mo2784a(long j, int i, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRecupereRubrique(mo3062x(), j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[66], e);
        }
    }

    /* renamed from: a */
    public WDObjet mo2785a(long j, String str, WDObjet[] wDObjetArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHExecuteProcedure(mo3062x(), j, str, wDObjetArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Bf], e);
        }
    }

    /* renamed from: a */
    public C0845h mo2786a(C0845h c0845h, int i, long j, int i2) throws C0841b, WDJNIException {
        if (c0845h != null) {
            try {
                if (c0845h.m5765c() != null) {
                    C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
                    m5435a(j, c0845h, c0843dArr);
                    try {
                        boolean jniHModifie = this.f2252c.jniHModifie(mo3062x(), j, i2);
                        if (c0843dArr[i] != null) {
                            Object[] objArr = new Object[]{m5468a(j, c0843dArr[i])};
                            c0845h.m5759a(jniHModifie);
                            c0845h.m5760a(objArr);
                            return c0845h;
                        }
                    } catch (UnsatisfiedLinkError e) {
                        throw new WDJNIException(f2249z[1], e);
                    }
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0845h mo2787a(C0845h c0845h, int i, long j, long j2, int i2) throws C0841b, WDJNIException {
        if (c0845h != null) {
            try {
                if (c0845h.m5765c() != null) {
                    C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
                    m5435a(j, c0845h, c0843dArr);
                    try {
                        boolean jniHModifie = this.f2252c.jniHModifie(mo3062x(), j, j2, i2);
                        if (c0843dArr[i] != null) {
                            Object[] objArr = new Object[]{m5468a(j, c0843dArr[i])};
                            c0845h.m5759a(jniHModifie);
                            c0845h.m5760a(objArr);
                            return c0845h;
                        }
                    } catch (UnsatisfiedLinkError e) {
                        throw new WDJNIException(f2249z[1], e);
                    }
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0845h mo2788a(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, true, z ? this.f2252c.jniHLitSuivant(mo3062x(), j, b, i2) : this.f2252c.jniHLitPrecedent(mo3062x(), j, b, i2));
    }

    /* renamed from: a */
    public C0845h mo2789a(boolean z, long j, int i, long j2, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, true, z ? this.f2252c.jniHAvance(mo3062x(), j, b, j2, i2) : this.f2252c.jniHRecule(mo3062x(), j, b, j2, i2));
    }

    /* renamed from: a */
    public C0845h mo2790a(boolean z, long j, int i, String str, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, true, z ? this.f2252c.jniHLitRecherchePremier(mo3062x(), j, b, str, i2) : this.f2252c.jniHLitRechercheDernier(mo3062x(), j, b, str, i2));
    }

    /* renamed from: a */
    public C0845h mo2791a(boolean z, long j, int i, byte[] bArr, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, true, z ? this.f2252c.jniHLitRecherchePremierBin(mo3062x(), j, b, bArr, i2) : this.f2252c.jniHLitRechercheDernierBin(mo3062x(), j, b, bArr, i2));
    }

    /* renamed from: a */
    public Object m5468a(long j, C0843d c0843d) throws C0841b, WDJNIException {
        try {
            switch (c0843d.m5754d()) {
                case 3:
                case 9:
                    return new Short(this.f2252c.m4597M(c0843d.m5746a()));
                case 4:
                case 36:
                    return new Byte(this.f2252c.m4599O(c0843d.m5746a()));
                case 5:
                case 26:
                case 38:
                    return new Integer(this.f2252c.m4596L(c0843d.m5746a()));
                case 6:
                    return new Float(this.f2252c.m4608X(c0843d.m5746a()));
                case 7:
                    return new Double(this.f2252c.m4600P(c0843d.m5746a()));
                case 17:
                case 41:
                    return new BigDecimal(this.f2252c.m4604T(c0843d.m5746a()));
                case 24:
                case 25:
                case 27:
                    return new Long(this.f2252c.m4598N(c0843d.m5746a()));
                case 28:
                case 29:
                case 30:
                case 40:
                    return new WDChaine(this.f2252c.m4595K(c0843d.m5746a()));
                case 37:
                    try {
                        return new Boolean(this.f2252c.m4609Y(c0843d.m5746a()));
                    } catch (IllegalArgumentException e) {
                        c0843d.m5747a(this.f2252c, j);
                        return m5468a(j, c0843d);
                    }
                case 99:
                case 100:
                    return null;
                default:
                    return this.f2252c.m4604T(c0843d.m5746a());
            }
            c0843d.m5747a(this.f2252c, j);
            return m5468a(j, c0843d);
        } catch (C0841b e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public String mo2792a(int i, String str, boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLColonneTable(mo3062x(), i, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[236], e);
        }
    }

    /* renamed from: a */
    public String mo2793a(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeFichier(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[47], e);
        }
    }

    /* renamed from: a */
    public String mo2794a(long j, int i, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereServeur(mo3062x(), j, i, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[157], e);
        }
    }

    /* renamed from: a */
    public String mo2795a(long j, long j2, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreStringString(mo3062x(), j, j2, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[155], e);
        }
    }

    /* renamed from: a */
    public String mo2796a(long j, long j2, String str, byte[] bArr, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreStringBin(mo3062x(), j, j2, str, bArr, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[248], e);
        }
    }

    /* renamed from: a */
    public String mo2797a(long j, long j2, byte[] bArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreCommenceParBin(mo3062x(), j, j2, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[199], e);
        }
    }

    /* renamed from: a */
    public String mo2798a(long j, long j2, byte[] bArr, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreBinString(mo3062x(), j, j2, bArr, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[73], e);
        }
    }

    /* renamed from: a */
    public String mo2799a(long j, long j2, byte[] bArr, byte[] bArr2, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreBinBin(mo3062x(), j, j2, bArr, bArr2, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Jn], e);
        }
    }

    /* renamed from: a */
    public String mo2800a(long j, long j2, WDObjet[] wDObjetArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreComprisEntre(mo3062x(), j, j2, wDObjetArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[82], e);
        }
    }

    /* renamed from: a */
    public String mo2801a(long j, long j2, String[] strArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreIdentique(mo3062x(), j, j2, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[137], e);
        }
    }

    /* renamed from: a */
    public String mo2802a(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeTriggerServeur(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.pw], e);
        }
    }

    /* renamed from: a */
    public String mo2803a(long j, String str, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoBlocageConnexion(mo3062x(), j, str, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[146], e);
        }
    }

    /* renamed from: a */
    public String mo2804a(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeLiaison(mo3062x(), j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[91], e);
        }
    }

    /* renamed from: a */
    public String mo2805a(long j, String str, String str2, String str3, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoDroitBaseDeDonnees(mo3062x(), j, str, str2, str3, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[80], e);
        }
    }

    /* renamed from: a */
    public String mo2806a(long j, String str, String str2, String str3, String str4, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoDroitFichier(mo3062x(), j, str, str2, str3, str4, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[143], e);
        }
    }

    /* renamed from: a */
    public String mo2807a(String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeFichier(mo3062x(), str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[47], e);
        }
    }

    /* renamed from: a */
    public String mo2808a(String str, boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLColonne(mo3062x(), str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[61], e);
        }
    }

    /* renamed from: a */
    public String mo2809a(boolean z, boolean z2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLListeTables(mo3062x(), z, z2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[10], e);
        }
    }

    /* renamed from: a */
    public void mo2810a(int i, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSetVariableHF(mo3062x(), i, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[54], e);
        }
    }

    /* renamed from: a */
    public void mo2811a(String str, int i) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLPositionne(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[180], e);
        }
    }

    /* renamed from: a */
    public void mo2812a(String str, int i, String str2) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLModifie(mo3062x(), str, i, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[20], e);
        }
    }

    /* renamed from: a */
    public boolean mo2813a() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHReconnecte(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[74], e);
        }
    }

    /* renamed from: a */
    public boolean mo2814a(int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHLiberePosition(mo3062x(), i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.f1465w], e);
        }
    }

    /* renamed from: a */
    public boolean mo2815a(int i, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLTransactionSurConnexion(mo3062x(), i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[39], e);
        }
    }

    /* renamed from: a */
    public boolean mo2816a(int i, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieStructureTous(mo3062x(), i, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[105], e);
        }
    }

    /* renamed from: a */
    public boolean mo2817a(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeConnexionTous(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[63], e);
        }
    }

    /* renamed from: a */
    public boolean mo2818a(long j, int i, int i2, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHVersRubrique(mo3062x(), j, i, i2, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[9], e);
        }
    }

    /* renamed from: a */
    public boolean mo2819a(long j, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRestaureSauvegarde(mo3062x(), j, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[0], e);
        }
    }

    /* renamed from: a */
    public boolean mo2820a(long j, int i, WDJaugeJNI wDJaugeJNI, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHReindexe(mo3062x(), j, i, wDJaugeJNI, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[117], e);
        }
    }

    /* renamed from: a */
    public boolean mo2821a(long j, int i, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHExecuteRequeteSQL(mo3062x(), j, 0, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[109], e);
        }
    }

    /* renamed from: a */
    public boolean mo2822a(long j, int i, String str, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHVersRubrique(mo3062x(), j, i, str, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[9], e);
        }
    }

    /* renamed from: a */
    public boolean mo2823a(long j, int i, String str, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRecupereSauvegarde(mo3062x(), j, i, str, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[90], e);
        }
    }

    /* renamed from: a */
    public boolean mo2824a(long j, int i, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieStructure(mo3062x(), j, i, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[240], e);
        }
    }

    /* renamed from: a */
    public boolean mo2825a(long j, int i, String str, String str2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRestaureSauvegarde(mo3062x(), j, i, str, str2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[0], e);
        }
    }

    /* renamed from: a */
    public boolean mo2826a(long j, int i, String[] strArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHExecuteRequete(mo3062x(), j, 0, i, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[99], e);
        }
    }

    /* renamed from: a */
    public boolean mo2827a(long j, long j2, int i, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPositionne(mo3062x(), j, j2, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[171], e);
        }
    }

    /* renamed from: a */
    public boolean mo2828a(long j, long j2, int i, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHExecuteRequeteSQL(mo3062x(), j, j2, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[109], e);
        }
    }

    /* renamed from: a */
    public boolean mo2829a(long j, long j2, int i, String[] strArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHExecuteRequete(mo3062x(), j, j2, i, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[99], e);
        }
    }

    /* renamed from: a */
    public boolean mo2830a(long j, long j2, String str, int i, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAttacheMemo(mo3062x(), j, j2, str, i, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[21], e);
        }
    }

    /* renamed from: a */
    public boolean mo2831a(long j, long j2, boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereDoublon(mo3062x(), j, j2, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[71], e);
        }
    }

    /* renamed from: a */
    public boolean mo2832a(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHOuvre(mo3062x(), j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[77], e);
        }
    }

    /* renamed from: a */
    public boolean mo2833a(long j, String str, long j2, String str2, int i, WDJaugeJNI wDJaugeJNI, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHCopieFichier(mo3062x(), j, str, j2, str2, i, wDJaugeJNI, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.co], e);
        }
    }

    /* renamed from: a */
    public boolean mo2834a(long j, String str, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSauveParametre(mo3062x(), j, str, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[44], e);
        }
    }

    /* renamed from: a */
    public boolean mo2835a(long j, String str, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDupliqueBaseDeDonnees(mo3062x(), j, str, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[23], e);
        }
    }

    /* renamed from: a */
    public boolean mo2836a(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieProprieteServeur(mo3062x(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0536n.f995G], e);
        }
    }

    /* renamed from: a */
    public boolean mo2837a(long j, String str, String str2, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHExporteXML(mo3062x(), j, str, str2, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[51], e);
        }
    }

    /* renamed from: a */
    public boolean mo2838a(long j, String str, String str2, int i, String str3, String str4) throws C0841b, WDJNIException {
        if (j < 0) {
            return this.f2252c.jniHDecritTriggerServeur(mo3062x(), str, str2, i, str3, str4);
        }
        try {
            return this.f2252c.jniHDecritTriggerServeur(mo3062x(), j, str, str2, i, str3, str4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.yk], e);
        }
    }

    /* renamed from: a */
    public boolean mo2839a(long j, String str, String str2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRecupereSauvegarde(mo3062x(), j, str, str2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[90], e);
        }
    }

    /* renamed from: a */
    public boolean mo2840a(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieDroitServeur(mo3062x(), j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[247], e);
        }
    }

    /* renamed from: a */
    public boolean mo2841a(long j, String str, String str2, String str3, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHImporteJSON(mo3062x(), j, str, str2, str3, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[223], e);
        }
    }

    /* renamed from: a */
    public boolean mo2842a(long j, String str, String str2, String str3, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRestaureSauvegarde(mo3062x(), j, str, str2, str3, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[0], e);
        }
    }

    /* renamed from: a */
    public boolean mo2843a(long j, String str, String str2, String str3, String str4) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieDroitBaseDeDonnees(mo3062x(), j, str, str2, str3, str4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[76], e);
        }
    }

    /* renamed from: a */
    public boolean mo2844a(long j, String str, String str2, String str3, String str4, String str5) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieDroitVue(mo3062x(), j, str, str2, str3, str4, str5);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[93], e);
        }
    }

    /* renamed from: a */
    public boolean mo2845a(long j, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHOuvreNouvelleConnexion(mo3062x(), j, str, str2, str3, str4, str5, i, str6, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[8], e);
        }
    }

    /* renamed from: a */
    public boolean mo2846a(long j, String str, boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHMiseAJourRequete(mo3062x(), j, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[53], e);
        }
    }

    /* renamed from: a */
    public boolean mo2847a(long j, boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereTransaction(mo3062x(), j, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[60], e);
        }
    }

    /* renamed from: a */
    public boolean mo2848a(C0845h c0845h, long j, int i) throws C0841b, WDJNIException {
        boolean z = false;
        if (c0845h != null) {
            try {
                if (c0845h.m5765c() != null) {
                    m5435a(j, c0845h, (C0843d[]) this.f2251b.get(new Long(j)));
                    try {
                        z = this.f2252c.jniHAjoute(mo3062x(), j, i);
                    } catch (UnsatisfiedLinkError e) {
                        throw new WDJNIException(f2249z[C0538a.Nb], e);
                    }
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2849a(C0845h c0845h, long j, long j2, int i) throws C0841b, WDJNIException {
        boolean z = false;
        if (c0845h != null) {
            try {
                if (c0845h.m5765c() != null) {
                    m5435a(j, c0845h, (C0843d[]) this.f2251b.get(new Long(j)));
                    try {
                        z = this.f2252c.jniHModifie(mo3062x(), j, j2, i);
                    } catch (UnsatisfiedLinkError e) {
                        throw new WDJNIException(f2249z[1], e);
                    }
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2850a(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionInterrompue(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[69], e);
        }
    }

    /* renamed from: a */
    public boolean mo2851a(String str, long j, int i, boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereIntegrite(mo3062x(), str, j, i, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[78], e);
        }
    }

    /* renamed from: a */
    public boolean mo2852a(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionDebut(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[190], e);
        }
    }

    /* renamed from: a */
    public boolean mo2853a(String str, String str2, String str3, String str4, String str5) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHOuvreAnalyse(mo3062x(), str, str2, str3, str4, str5);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[59], e);
        }
    }

    /* renamed from: a */
    public boolean mo2854a(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDecritConnexion(mo3062x(), str, str, str3, str4, str5, str6, i, str7, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[242], e);
        }
    }

    /* renamed from: a */
    public boolean mo2855a(boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereTransactionTous(mo3062x(), z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[138], e);
        }
    }

    /* renamed from: a */
    public byte[] mo2856a(String str, String str2, long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDeclareExterneCS(mo3062x(), str, str2, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[68], e);
        }
    }

    /* renamed from: a */
    public byte[] mo2857a(String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDeclareExterneClassic(mo3062x(), str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.bh], e);
        }
    }

    /* renamed from: a */
    public String[] mo2858a(String[] strArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSetHClient(mo3062x(), strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[158], e);
        }
    }

    /* renamed from: b */
    public int mo2859b(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPriorite(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[4], e);
        }
    }

    /* renamed from: b */
    public int mo2860b(long j, int i, int i2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHMode(mo3062x(), j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.uw], e);
        }
    }

    /* renamed from: b */
    public long mo2861b(long j, long j2, WDObjet wDObjet, WDObjet wDObjet2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHStatNbEnrIntervalle(mo3062x(), j, j2, wDObjet, wDObjet2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[133], e);
        }
    }

    /* renamed from: b */
    public WDObjet mo2862b(int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetVariableHF(mo3062x(), i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[139], e);
        }
    }

    /* renamed from: b */
    public WDObjet mo2863b(long j, String str, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChargeParametre(mo3062x(), j, str, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[173], e);
        }
    }

    /* renamed from: b */
    public C0832f mo2864b(boolean z) throws C0841b, WDJNIException {
        try {
            C0842c c0842c = (C0842c) super.clone();
            c0842c.f2251b = new HashMap();
            if (this.f2252c == null) {
                return c0842c;
            }
            c0842c.f2252c = (WDHF) this.f2252c.mo2864b(z);
            return c0842c;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, (C0832f) this);
            return null;
        } catch (Exception e3) {
            C0691a.m2863b(f2249z[141], e3);
            return this;
        } catch (Exception e32) {
            WDErreurManager.m2882a(e32);
            return null;
        }
    }

    /* renamed from: b */
    public C0845h mo2865b(C0845h c0845h, int i, long j, int i2) throws C0841b, WDJNIException {
        if (c0845h != null) {
            try {
                if (c0845h.m5765c() != null) {
                    C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
                    m5435a(j, c0845h, c0843dArr);
                    try {
                        boolean jniHAjoute = this.f2252c.jniHAjoute(mo3062x(), j, i2);
                        if (c0843dArr[i] != null) {
                            Object[] objArr = new Object[]{m5468a(j, c0843dArr[i])};
                            c0845h.m5759a(jniHAjoute);
                            c0845h.m5760a(objArr);
                            return c0845h;
                        }
                    } catch (UnsatisfiedLinkError e) {
                        throw new WDJNIException(f2249z[C0538a.Nb], e);
                    }
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0845h mo2866b(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, true, z ? this.f2252c.jniHLitPremier(mo3062x(), j, b, i2) : this.f2252c.jniHLitDernier(mo3062x(), j, b, i2));
    }

    /* renamed from: b */
    public C0845h mo2867b(boolean z, long j, int i, String str, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, false, z ? this.f2252c.jniHRecherchePremier(mo3062x(), j, b, str, i2) : this.f2252c.jniHRechercheDernier(mo3062x(), j, b, str, i2));
    }

    /* renamed from: b */
    public C0845h mo2868b(boolean z, long j, int i, byte[] bArr, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, false, z ? this.f2252c.jniHRecherchePremierBin(mo3062x(), j, b, bArr, i2) : this.f2252c.jniHRechercheDernierBin(mo3062x(), j, b, bArr, i2));
    }

    /* renamed from: b */
    public String mo2869b() throws C0841b, WDJNIException {
        try {
            String jniSQLErreur = this.f2252c.jniSQLErreur(mo3062x());
            return jniSQLErreur == null ? "" : jniSQLErreur;
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0538a.Lb], e);
        }
    }

    /* renamed from: b */
    public String mo2870b(long j, int i, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDbg(mo3062x(), j, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[56], e);
        }
    }

    /* renamed from: b */
    public String mo2871b(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHStatDate(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[125], e);
        }
    }

    /* renamed from: b */
    public String mo2872b(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeLiaison(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[91], e);
        }
    }

    /* renamed from: b */
    public String mo2873b(long j, long j2, byte[] bArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreIdentiqueBin(mo3062x(), j, j2, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[169], e);
        }
    }

    /* renamed from: b */
    public String mo2874b(long j, long j2, String[] strArr) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreCommencePar(mo3062x(), j, j2, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[185], e);
        }
    }

    /* renamed from: b */
    public String mo2875b(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeIndexFullText(mo3062x(), j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[96], e);
        }
    }

    /* renamed from: b */
    public String mo2876b(long j, String str, String str2, String str3, String str4, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoDroitVue(mo3062x(), j, str, str2, str3, str4, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[128], e);
        }
    }

    /* renamed from: b */
    public String mo2877b(String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLLitCol(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[112], e);
        }
    }

    /* renamed from: b */
    public void mo2878b(String str) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLPrecedent(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[189], e);
        }
    }

    /* renamed from: b */
    public boolean mo2879b(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHLibere(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[34], e);
        }
    }

    /* renamed from: b */
    public boolean mo2880b(long j, int i, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHVersRubrique(mo3062x(), j, i, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[9], e);
        }
    }

    /* renamed from: b */
    public boolean mo2881b(long j, long j2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHVerifieInaltere(mo3062x(), j, j2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[246], e);
        }
    }

    /* renamed from: b */
    public boolean mo2882b(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeGroupe(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[15], e);
        }
    }

    /* renamed from: b */
    public boolean mo2883b(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeFichier(mo3062x(), j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[168], e);
        }
    }

    /* renamed from: b */
    public boolean mo2884b(long j, String str, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRestaureSauvegarde(mo3062x(), j, str, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[0], e);
        }
    }

    /* renamed from: b */
    public boolean mo2885b(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDesactiveTriggerServeur(mo3062x(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[79], e);
        }
    }

    /* renamed from: b */
    public boolean mo2886b(long j, String str, String str2, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHExporteJSON(mo3062x(), j, str, str2, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[86], e);
        }
    }

    /* renamed from: b */
    public boolean mo2887b(long j, String str, String str2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRestaureSauvegarde(mo3062x(), j, str, str2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[0], e);
        }
    }

    /* renamed from: b */
    public boolean mo2888b(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieProprieteBaseDeDonnees(mo3062x(), j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[216], e);
        }
    }

    /* renamed from: b */
    public boolean mo2889b(long j, String str, String str2, String str3, int i) throws C0841b, WDJNIException {
        String str4;
        String str5;
        if (str2 != null) {
            try {
                if (str2.equals("")) {
                    str4 = null;
                    if (str3 != null) {
                        if (str3.equals("")) {
                            str5 = null;
                            return this.f2252c.jniHCreationSiInexistant(mo3062x(), j, str, str4, str5, i);
                        }
                    }
                    str5 = str3;
                    return this.f2252c.jniHCreationSiInexistant(mo3062x(), j, str, str4, str5, i);
                }
            } catch (UnsatisfiedLinkError e) {
                throw e;
            } catch (UnsatisfiedLinkError e2) {
                throw new WDJNIException(f2249z[36], e2);
            }
        }
        str4 = str2;
        if (str3 != null) {
            if (str3.equals("")) {
                str5 = null;
                return this.f2252c.jniHCreationSiInexistant(mo3062x(), j, str, str4, str5, i);
            }
        }
        str5 = str3;
        return this.f2252c.jniHCreationSiInexistant(mo3062x(), j, str, str4, str5, i);
    }

    /* renamed from: b */
    public boolean mo2890b(long j, String str, String str2, String str3, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHImporteTexte(mo3062x(), j, str, str2, str3, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[183], e);
        }
    }

    /* renamed from: b */
    public boolean mo2891b(long j, String str, String str2, String str3, String str4) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieProprieteFichier(mo3062x(), j, str, str2, str3, str4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[67], e);
        }
    }

    /* renamed from: b */
    public boolean mo2892b(long j, String str, String str2, String str3, String str4, String str5) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieDroitFichier(mo3062x(), j, str, str2, str3, str4, str5);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[24], e);
        }
    }

    /* renamed from: b */
    public boolean mo2893b(long j, String str, boolean z) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHMiseAJourCollection(mo3062x(), j, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[145], e);
        }
    }

    /* renamed from: b */
    public boolean mo2894b(C0845h c0845h, long j, int i) throws C0841b, WDJNIException {
        boolean z = false;
        if (c0845h != null) {
            try {
                if (c0845h.m5765c() != null) {
                    m5435a(j, c0845h, (C0843d[]) this.f2251b.get(new Long(j)));
                    try {
                        z = this.f2252c.jniHModifie(mo3062x(), j, i);
                    } catch (UnsatisfiedLinkError e) {
                        throw new WDJNIException(f2249z[1], e);
                    }
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo2895b(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDesactiveTriggerServeur(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[79], e);
        }
    }

    /* renamed from: c */
    public WDObjet mo2896c(long j, int i, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRecupereRubrique(mo3062x(), j, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[66], e);
        }
    }

    /* renamed from: c */
    public WDObjet mo2897c(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoFichier(mo3062x(), j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[40], e);
        }
    }

    /* renamed from: c */
    public WDChaine mo2898c(long j, long j2, String[] strArr) throws C0841b, WDJNIException {
        try {
            return new WDChaine(this.f2252c.jniHConstruitValCle(mo3062x(), j, j2, strArr));
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[121], e);
        }
    }

    /* renamed from: c */
    public C0845h mo2899c(long j, int i, int i2) throws C0841b, WDJNIException {
        return m5434a(j, (C0843d[]) this.f2251b.get(new Long(j)), true, this.f2252c.jniHRetourPosition(mo3062x(), j, i, i2));
    }

    /* renamed from: c */
    public C0845h mo2900c(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, false, z ? this.f2252c.jniHSuivant(mo3062x(), j, b, i2) : this.f2252c.jniHPrecedent(mo3062x(), j, b, i2));
    }

    /* renamed from: c */
    public String mo2901c() throws C0841b, WDJNIException {
        try {
            String jniSQLMesErreur = this.f2252c.jniSQLMesErreur(mo3062x());
            return jniSQLMesErreur == null ? "" : jniSQLMesErreur;
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[232], e);
        }
    }

    /* renamed from: c */
    public String mo2902c(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetNomPhysique(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[2], e);
        }
    }

    /* renamed from: c */
    public String mo2903c(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoProprieteBaseDeDonnees(mo3062x(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[81], e);
        }
    }

    /* renamed from: c */
    public String mo2904c(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeRubrique(mo3062x(), j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[7], e);
        }
    }

    /* renamed from: c */
    public String mo2905c(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoProprieteFichier(mo3062x(), j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[182], e);
        }
    }

    /* renamed from: c */
    public String mo2906c(String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLLitMemoTexte(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.oq], e);
        }
    }

    /* renamed from: c */
    public void mo2907c(String str) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLFerme(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[126], e);
        }
    }

    /* renamed from: c */
    public boolean mo2908c(int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLTransaction(mo3062x(), i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[187], e);
        }
    }

    /* renamed from: c */
    public boolean mo2909c(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetPropFichierBool(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[147], e);
        }
    }

    /* renamed from: c */
    public boolean mo2910c(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.isNbEnrNeedParse(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[154], e);
        }
    }

    /* renamed from: c */
    public boolean mo2911c(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeCle(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Tv], e);
        }
    }

    /* renamed from: c */
    public boolean mo2912c(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieUtilisateur(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[49], e);
        }
    }

    /* renamed from: c */
    public boolean mo2913c(long j, String str, String str2, String str3, int i) throws C0841b, WDJNIException {
        String str4;
        String str5;
        if (str2 != null) {
            try {
                if (str2.equals("")) {
                    str4 = null;
                    if (str3 != null) {
                        if (str3.equals("")) {
                            str5 = null;
                            return this.f2252c.jniHCreation(mo3062x(), j, str, str4, str5, i);
                        }
                    }
                    str5 = str3;
                    return this.f2252c.jniHCreation(mo3062x(), j, str, str4, str5, i);
                }
            } catch (UnsatisfiedLinkError e) {
                throw e;
            } catch (UnsatisfiedLinkError e2) {
                throw new WDJNIException(f2249z[111], e2);
            }
        }
        str4 = str2;
        if (str3 != null) {
            if (str3.equals("")) {
                str5 = null;
                return this.f2252c.jniHCreation(mo3062x(), j, str, str4, str5, i);
            }
        }
        str5 = str3;
        return this.f2252c.jniHCreation(mo3062x(), j, str, str4, str5, i);
    }

    /* renamed from: c */
    public boolean mo2914c(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeRepSQL(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[28], e);
        }
    }

    /* renamed from: d */
    public int mo2915d(int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHErreur(mo3062x(), i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[228], e);
        }
    }

    /* renamed from: d */
    public int mo2916d(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereMemo(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[122], e);
        }
    }

    /* renamed from: d */
    public long mo2917d(String str) throws C0841b, WDJNIException {
        return this.f2252c.mo2917d(str);
    }

    /* renamed from: d */
    public C0845h mo2918d(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        long b = c0843dArr[i].m5751b(this.f2252c, j);
        return m5434a(j, c0843dArr, false, z ? this.f2252c.jniHPremier(mo3062x(), j, b, i2) : this.f2252c.jniHDernier(mo3062x(), j, b, i2));
    }

    /* renamed from: d */
    public String mo2919d(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoMemo(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0536n.f1002n], e);
        }
    }

    /* renamed from: d */
    public String mo2920d(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHEnregistrementVersXML(mo3062x(), j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.qj], e);
        }
    }

    /* renamed from: d */
    public String mo2921d(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeCle(mo3062x(), j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[95], e);
        }
    }

    /* renamed from: d */
    public String mo2922d(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeSynonyme(mo3062x(), j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[245], e);
        }
    }

    /* renamed from: d */
    public String mo2923d(String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLCol(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[116], e);
        }
    }

    /* renamed from: d */
    public boolean mo2924d() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHErreurDoublon(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[226], e);
        }
    }

    /* renamed from: d */
    public boolean mo2925d(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeTache(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[108], e);
        }
    }

    /* renamed from: d */
    public boolean mo2926d(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeRep(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[165], e);
        }
    }

    /* renamed from: d */
    public boolean mo2927d(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDetruitTriggerServeur(mo3062x(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[18], e);
        }
    }

    /* renamed from: d */
    public boolean mo2928d(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPasse(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[33], e);
        }
    }

    /* renamed from: d */
    public C0844e[] mo2929d(long j) throws WDJNIException, C0841b {
        Object d = this.f2252c.mo2929d(j);
        this.f2251b.put(new Long(j), d);
        return d;
    }

    /* renamed from: e */
    public int mo2930e(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSauvePosition(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[6], e);
        }
    }

    /* renamed from: e */
    public String mo2931e() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLBase(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[64], e);
        }
    }

    /* renamed from: e */
    public String mo2932e(int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHErreurInfo(mo3062x(), i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0542t.f1193i], e);
        }
    }

    /* renamed from: e */
    public String mo2933e(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoDroitServeur(mo3062x(), j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[227], e);
        }
    }

    /* renamed from: e */
    public String mo2934e(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeMotVide(mo3062x(), j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[84], e);
        }
    }

    /* renamed from: e */
    public String mo2935e(String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeServeur(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[184], e);
        }
    }

    /* renamed from: e */
    public boolean mo2936e(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHOuvreConnexion(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[8], e);
        }
    }

    /* renamed from: e */
    public boolean mo2937e(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHBloqueFichier(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.f1441Y], e);
        }
    }

    /* renamed from: e */
    public boolean mo2938e(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetPropRubriqueBoolean(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[103], e);
        }
    }

    /* renamed from: e */
    public boolean mo2939e(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeParametre(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[94], e);
        }
    }

    /* renamed from: e */
    public boolean mo2940e(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeBaseDeDonnees(mo3062x(), j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Ru], e);
        }
    }

    /* renamed from: e */
    public boolean mo2941e(long j, String str, String str2) throws C0841b, WDJNIException {
        if (j < 0) {
            return this.f2252c.jniHActiveTriggerServeur(mo3062x(), str, str2);
        }
        try {
            return this.f2252c.jniHActiveTriggerServeur(mo3062x(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[166], e);
        }
    }

    /* renamed from: e */
    public boolean mo2942e(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAnnuleAlias(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[225], e);
        }
    }

    /* renamed from: e */
    public boolean mo2943e(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPasseSQL(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[149], e);
        }
    }

    /* renamed from: f */
    public int mo2944f(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHVersion(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[25], e);
        }
    }

    /* renamed from: f */
    public long mo2945f(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetIdRubriqueHF(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[110], e);
        }
    }

    /* renamed from: f */
    public String mo2946f(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoSauvegarde(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[70], e);
        }
    }

    /* renamed from: f */
    public String mo2947f(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoBlocage(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Cv], e);
        }
    }

    /* renamed from: f */
    public String mo2948f(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetPropRubriqueString(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[50], e);
        }
    }

    /* renamed from: f */
    public String mo2949f(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeUtilisateurConnecte(mo3062x(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Ep], e);
        }
    }

    /* renamed from: f */
    public boolean mo2950f() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAliasTous(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.no], e);
        }
    }

    /* renamed from: f */
    public boolean mo2951f(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHEnvoieMessageVersClient(mo3062x(), j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[151], e);
        }
    }

    /* renamed from: f */
    public boolean mo2952f(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPasseSQL(mo3062x(), str, null);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[149], e);
        }
    }

    /* renamed from: f */
    public boolean mo2953f(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSubstRep(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[75], e);
        }
    }

    /* renamed from: f */
    public byte[] mo2954f(String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLLitMemo(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.af], e);
        }
    }

    /* renamed from: g */
    public int mo2955g(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLExec(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[42], e);
        }
    }

    /* renamed from: g */
    public String mo2956g(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeBaseDeDonnees(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[156], e);
        }
    }

    /* renamed from: g */
    public String mo2957g(String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeFichier(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[47], e);
        }
    }

    /* renamed from: g */
    public boolean mo2958g() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHErreurIntegrite(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[27], e);
        }
    }

    /* renamed from: g */
    public boolean mo2959g(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionLibere(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[62], e);
        }
    }

    /* renamed from: g */
    public boolean mo2960g(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeConnexion(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[63], e);
        }
    }

    /* renamed from: g */
    public boolean mo2961g(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHStatCalcule(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[12], e);
        }
    }

    /* renamed from: g */
    public boolean mo2962g(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFinInterditAccesBaseDeDonnees(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[235], e);
        }
    }

    /* renamed from: g */
    public boolean mo2963g(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDeconnecteClient(mo3062x(), j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[164], e);
        }
    }

    /* renamed from: g */
    public boolean mo2964g(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionDebutSurConnexion(mo3062x(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[190], e);
        }
    }

    /* renamed from: g */
    public boolean mo2965g(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPasseTous(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[192], e);
        }
    }

    /* renamed from: h */
    public Object mo2966h(String str, String str2) throws C0841b, WDJNIException {
        return this.f2252c.mo2966h(str, str2);
    }

    /* renamed from: h */
    public String mo2967h(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoServeur(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0536n.f1006y], e);
        }
    }

    /* renamed from: h */
    public void mo2968h(String str) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLInfoGene(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[89], e);
        }
    }

    /* renamed from: h */
    public void mo2969h(String str, int i) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLPremier(mo3062x(), str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[41], e);
        }
    }

    /* renamed from: h */
    public boolean mo2970h() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHErreurMotDePasse(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Gk], e);
        }
    }

    /* renamed from: h */
    public boolean mo2971h(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSimuleReseau(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[55], e);
        }
    }

    /* renamed from: h */
    public boolean mo2972h(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionLibereEnreg(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[62], e);
        }
    }

    /* renamed from: h */
    public boolean mo2973h(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHBloqueNumEnr(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[152], e);
        }
    }

    /* renamed from: h */
    public boolean mo2974h(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHMaintenanceServeur(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[45], e);
        }
    }

    /* renamed from: i */
    public int mo2975i(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLAvance(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[104], e);
        }
    }

    /* renamed from: i */
    public C0845h mo2976i(long j, int i) throws C0841b, WDJNIException {
        return m5434a(j, new C0843d[]{r0[i]}, true, this.f2252c.jniHRaz(mo3062x(), j, ((C0843d[]) this.f2251b.get(new Long(j)))[i].m5751b(this.f2252c, j)));
    }

    /* renamed from: i */
    public String mo2977i(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetLangueDecrit(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[204], e);
        }
    }

    /* renamed from: i */
    public String mo2978i(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoAnalyse(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Dt], e);
        }
    }

    /* renamed from: i */
    public void mo2979i(long j) throws C0841b, WDJNIException {
        if (j == -1) {
            try {
                this.f2252c.jniHForceEcritureTous(mo3062x());
                return;
            } catch (UnsatisfiedLinkError e) {
                throw new WDJNIException(f2249z[26], e);
            }
        }
        this.f2252c.jniHForceEcriture(mo3062x(), j);
    }

    /* renamed from: i */
    public boolean mo2980i() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLEnDehors(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[22], e);
        }
    }

    /* renamed from: i */
    public boolean mo2981i(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRaye(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[13], e);
        }
    }

    /* renamed from: i */
    public boolean mo2982i(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFichierExiste(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Ao], e);
        }
    }

    /* renamed from: j */
    public int mo2983j() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLNbCol(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.me], e);
        }
    }

    /* renamed from: j */
    public long mo2984j(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHNbEnr(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[48], e);
        }
    }

    /* renamed from: j */
    public long mo2985j(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetIdConnexionHF(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[153], e);
        }
    }

    /* renamed from: j */
    public String mo2986j(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDateEnreg(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[37], e);
        }
    }

    /* renamed from: j */
    public boolean mo2987j(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.isCanGiveNbEnrWhileFilling(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Wj], e);
        }
    }

    /* renamed from: j */
    public boolean mo2988j(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHEcrit(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[30], e);
        }
    }

    /* renamed from: j */
    public boolean mo2989j(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHModifieGroupe(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[218], e);
        }
    }

    /* renamed from: j */
    public boolean mo2990j(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHOuvreAnalyse(mo3062x(), str, str2, null, null, null);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[59], e);
        }
    }

    /* renamed from: k */
    public WDObjet mo2991k(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoFichier(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[40], e);
        }
    }

    /* renamed from: k */
    public C0845h mo2992k(long j, long j2, int i) throws C0841b, WDJNIException {
        return m5434a(j, (C0843d[]) this.f2251b.get(new Long(j)), true, this.f2252c.jniHLit(mo3062x(), j, j2, i));
    }

    /* renamed from: k */
    public String mo2993k(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetLangue(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[46], e);
        }
    }

    /* renamed from: k */
    public boolean mo2994k() throws C0841b {
        return true;
    }

    /* renamed from: k */
    public boolean mo2995k(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDesactiveFiltre(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.yt], e);
        }
    }

    /* renamed from: k */
    public boolean mo2996k(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInterditAccesBaseDeDonnees(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[32], e);
        }
    }

    /* renamed from: k */
    public boolean mo2997k(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionAnnule(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[16], e);
        }
    }

    /* renamed from: k */
    public boolean mo2998k(String str, String str2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDetruitTriggerServeur(mo3062x(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[18], e);
        }
    }

    /* renamed from: l */
    public long mo2999l(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetPropRubriqueLong(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[114], e);
        }
    }

    /* renamed from: l */
    public String mo3000l(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoRubrique(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[11], e);
        }
    }

    /* renamed from: l */
    public boolean mo3001l() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRazClient(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.jk], e);
        }
    }

    /* renamed from: l */
    public boolean mo3002l(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAjouteGroupe(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[38], e);
        }
    }

    /* renamed from: l */
    public boolean mo3003l(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionIsolation(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[85], e);
        }
    }

    /* renamed from: l */
    public boolean mo3004l(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeRequete(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[159], e);
        }
    }

    /* renamed from: l */
    public boolean mo3005l(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHCreeTriggerServeur(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[97], e);
        }
    }

    /* renamed from: m */
    public String mo3006m(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetPropFichierString(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Qt], e);
        }
    }

    /* renamed from: m */
    public void mo3007m(long j, long j2) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSetValeurNull(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[35], e);
        }
    }

    /* renamed from: m */
    public boolean mo3008m() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionFin(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[101], e);
        }
    }

    /* renamed from: m */
    public boolean mo3009m(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetNouvelEnregistrement(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Bs], e);
        }
    }

    /* renamed from: m */
    public boolean mo3010m(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprime(mo3062x(), j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[58], e);
        }
    }

    /* renamed from: m */
    public boolean mo3011m(String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeRepTous(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[88], e);
        }
    }

    /* renamed from: m */
    public String[] mo3012m(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFTListeMot(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[136], e);
        }
    }

    /* renamed from: n */
    public int mo3013n(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSecurite(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Xn], e);
        }
    }

    /* renamed from: n */
    public String mo3014n(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFiltreStringString(mo3062x(), j, 0, null, null, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[193], e);
        }
    }

    /* renamed from: n */
    public void mo3015n(long j) throws C0841b, WDJNIException {
        int i = 0;
        C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(new Long(j));
        if (c0843dArr != null) {
            ArrayList arrayList = new ArrayList(20);
            for (C0843d a : c0843dArr) {
                long a2 = a.m5746a();
                if (a2 != -1) {
                    try {
                        arrayList.add(new Long(a2));
                    } catch (C0841b e) {
                        throw e;
                    }
                }
            }
            arrayList.trimToSize();
            long[] jArr = new long[arrayList.size()];
            while (i < arrayList.size()) {
                try {
                    jArr[i] = ((Long) arrayList.get(i)).longValue();
                    i++;
                } catch (C0841b e2) {
                    throw e2;
                }
            }
            this.f2251b.remove(new Long(j));
            this.f2252c.m4660a(jArr);
            this.f2252c.m4606V(j);
        }
    }

    /* renamed from: n */
    public void mo3016n(String str) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLDernier(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[31], e);
        }
    }

    /* renamed from: n */
    public boolean mo3017n() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLRecupEnCours(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[29], e);
        }
    }

    /* renamed from: n */
    public boolean mo3018n(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAnnuleRecherche(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[188], e);
        }
    }

    /* renamed from: o */
    public long mo3019o(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHStatNbEnr(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Uk], e);
        }
    }

    /* renamed from: o */
    public void mo3020o() throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLDeconnecte(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[118], e);
        }
    }

    /* renamed from: o */
    public void mo3021o(long j) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniLibererIdConnexion(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[14], e);
        }
    }

    /* renamed from: o */
    public void mo3022o(String str) throws C0841b, WDJNIException {
        try {
            this.f2252c.jniSQLSuivant(mo3062x(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[57], e);
        }
    }

    /* renamed from: o */
    public boolean mo3023o(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPrioriteClient(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[119], e);
        }
    }

    /* renamed from: o */
    public boolean mo3024o(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeMotDePasse(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Au], e);
        }
    }

    /* renamed from: p */
    public int mo3025p() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLEnCours(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.kh], e);
        }
    }

    /* renamed from: p */
    public String mo3026p(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHGereServeur(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[157], e);
        }
    }

    /* renamed from: p */
    public String mo3027p(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHStatHeure(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[231], e);
        }
    }

    /* renamed from: p */
    public boolean mo3028p(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFerme(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[123], e);
        }
    }

    /* renamed from: p */
    public boolean mo3029p(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoUtilisateur(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[115], e);
        }
    }

    /* renamed from: q */
    public long mo3030q(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHStatNbDoublon(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0538a.tb], e);
        }
    }

    /* renamed from: q */
    public String mo3031q(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoRubrique(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[11], e);
        }
    }

    /* renamed from: q */
    public boolean mo3032q(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionFinSurConnexion(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[101], e);
        }
    }

    /* renamed from: q */
    public boolean mo3033q(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHChangeNom(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[217], e);
        }
    }

    /* renamed from: q */
    public String[] mo3034q() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLTitreCol(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[130], e);
        }
    }

    /* renamed from: r */
    public int mo3035r(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHPriorite(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[4], e);
        }
    }

    /* renamed from: r */
    public long mo3036r(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniGetPropFichierLong(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[113], e);
        }
    }

    /* renamed from: r */
    public boolean mo3037r() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRAZGroupe(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[160], e);
        }
    }

    /* renamed from: r */
    public boolean mo3038r(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniIsNull(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[43], e);
        }
    }

    /* renamed from: r */
    public boolean mo3039r(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeUtilisateur(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[106], e);
        }
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
    }

    /* renamed from: s */
    public String mo3040s(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeElementStocke(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[148], e);
        }
    }

    /* renamed from: s */
    public void mo3041s() throws C0841b, WDJNIException {
        int i = 0;
        try {
            if (this.f2251b.size() > 0) {
                int i2;
                ArrayList arrayList = new ArrayList(30);
                ArrayList arrayList2 = new ArrayList(C0607n.Dt);
                for (Long l : this.f2251b.keySet()) {
                    arrayList.add(l);
                    C0843d[] c0843dArr = (C0843d[]) this.f2251b.get(l);
                    for (C0843d a : c0843dArr) {
                        long a2 = a.m5746a();
                        if (a2 != -1) {
                            arrayList2.add(new Long(a2));
                        }
                    }
                }
                arrayList.trimToSize();
                long[] jArr = new long[arrayList.size()];
                for (i2 = 0; i2 < arrayList.size(); i2++) {
                    jArr[i2] = ((Long) arrayList.get(i2)).longValue();
                }
                arrayList2.trimToSize();
                long[] jArr2 = new long[arrayList2.size()];
                while (i < arrayList2.size()) {
                    jArr2[i] = ((Long) arrayList2.get(i)).longValue();
                    i++;
                }
                this.f2251b.clear();
                this.f2252c.m4660a(jArr2);
                this.f2252c.m4734b(jArr);
            }
            this.f2252c.mo3041s();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e3) {
        }
        this.f2250a.m5771e();
        this.f2250a.m5769c();
        this.f2250a = null;
        this.f2252c = null;
    }

    /* renamed from: s */
    public boolean mo3042s(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFichierExiste(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Ao], e);
        }
    }

    /* renamed from: s */
    public boolean mo3043s(long j, long j2) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHDebloqueNumEnr(mo3062x(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Yw], e);
        }
    }

    /* renamed from: s */
    public boolean mo3044s(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeRepertoire(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[213], e);
        }
    }

    /* renamed from: t */
    public int mo3045t() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLNbLig(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[215], e);
        }
    }

    /* renamed from: t */
    public boolean mo3046t(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionAnnuleSurConnexion(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[16], e);
        }
    }

    /* renamed from: t */
    public boolean mo3047t(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeSauvegarde(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Px], e);
        }
    }

    /* renamed from: t */
    public boolean mo3048t(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSupprimeCollection(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[72], e);
        }
    }

    /* renamed from: u */
    public int mo3049u() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLRequete(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[92], e);
        }
    }

    /* renamed from: u */
    public int mo3050u(long j, int i) throws C0841b, WDJNIException {
        int jniHVerifieStrutureTous;
        if (j == -1) {
            try {
                jniHVerifieStrutureTous = this.f2252c.jniHVerifieStrutureTous(mo3062x(), i);
            } catch (C0841b e) {
                throw e;
            }
        }
        try {
            jniHVerifieStrutureTous = this.f2252c.jniHVerifieStruture(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e2) {
            throw new WDJNIException(f2249z[191], e2);
        }
        return jniHVerifieStrutureTous;
    }

    /* renamed from: u */
    public String mo3051u(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeParametre(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[131], e);
        }
    }

    /* renamed from: u */
    public boolean mo3052u(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHVersFichier(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[174], e);
        }
    }

    /* renamed from: v */
    public long mo3053v(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.getNbEnrWhileFilling(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Hn], e);
        }
    }

    /* renamed from: v */
    public boolean mo3054v() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHErreurBlocage(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[172], e);
        }
    }

    /* renamed from: v */
    public boolean mo3055v(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSimuleReseau(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[55], e);
        }
    }

    /* renamed from: v */
    public boolean mo3056v(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoGroupe(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[233], e);
        }
    }

    /* renamed from: w */
    public int mo3057w() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniSQLConnexion(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[249], e);
        }
    }

    /* renamed from: w */
    public String mo3058w(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHTransactionListe(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[219], e);
        }
    }

    /* renamed from: w */
    public boolean mo3059w(long j, int i) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAnnuleSauvegarde(mo3062x(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.lh], e);
        }
    }

    /* renamed from: w */
    public boolean mo3060w(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHAlias(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.Fb], e);
        }
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
    }

    /* renamed from: x */
    public int mo3061x(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHSauvePosition(mo3062x(), j, 0);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[6], e);
        }
    }

    /* renamed from: x */
    public long mo3062x() {
        return this.f2252c.mo3062x();
    }

    /* renamed from: x */
    public String mo3063x(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHInfoProprieteServeur(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[224], e);
        }
    }

    /* renamed from: y */
    public String mo3064y(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHListeGroupe(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[100], e);
        }
    }

    /* renamed from: y */
    public String mo3065y(long j, String str) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHEnregistrementVersJSON(mo3062x(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[52], e);
        }
    }

    /* renamed from: y */
    public boolean mo3066y() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniIsErreurFatale(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[C0607n.nn], e);
        }
    }

    /* renamed from: z */
    public boolean mo3067z() throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHRazUtilisateur(mo3062x());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[167], e);
        }
    }

    /* renamed from: z */
    public boolean mo3068z(long j) throws C0841b, WDJNIException {
        try {
            return this.f2252c.jniHFermeConnexion(mo3062x(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2249z[17], e);
        }
    }
}
