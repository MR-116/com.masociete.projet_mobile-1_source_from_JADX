package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.context.C0677k;
import fr.pcsoft.wdjava.core.context.WDContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.p047f.C0718g;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;
import fr.pcsoft.wdjava.core.types.database.C0776b;
import fr.pcsoft.wdjava.core.types.database.WDRequeteSQL;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.database.hf.WDEnregistrement;
import fr.pcsoft.wdjava.database.hf.WDHF_Connexion;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.ab;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.ui.champs.jauge.C1225d;
import fr.pcsoft.wdjava.ui.champs.nb;
import fr.pcsoft.wdjava.ui.p069g.C1409j;
import java.util.Arrays;

public class WDAPIHF implements C0542t {
    private static final String[] Rd;

    static {
        String[] strArr = new String[C0607n.Ep];
        strArr[0] = m1631z(m1632z("<8F-~M5F'~R?"));
        strArr[1] = m1631z(m1632z("<8F't[9_#~@ K%kM9\\>~@#\\8mZ%K"));
        strArr[2] = m1631z(m1632z("<8F)tQ#M8nV$F<zS/Z&~"));
        strArr[3] = m1631z(m1632z("<8F+wV1J"));
        strArr[4] = m1631z(m1632z("<8F8~\\%I/iZ/J+nI5^+i[5"));
        strArr[5] = m1631z(m1632z("<8F#vO?K>~@$\\2oZ"));
        strArr[6] = m1631z(m1632z("<8F,r\\8P/i@5A#hK5"));
        strArr[7] = m1631z(m1632z("<8F)tR X8~@\"L(iV!L/"));
        strArr[8] = m1631z(m1632z("<8F#uY?F'~R?"));
        strArr[9] = m1631z(m1632z("<8F$y@5W8"));
        strArr[10] = m1631z(m1632z("<8F&rK/K/xW5K)sZ/I8~R9\\8"));
        strArr[11] = m1631z(m1632z("<8F/cK\"X#o@=\\'t"));
        strArr[12] = m1631z(m1632z("<8F9nM/X:kZ<F9~M&\\?i"));
        strArr[13] = m1631z(m1632z("<8F(wP!L/dQ%T5~Q\""));
        strArr[14] = m1631z(m1632z("<8F#uY?F8n]\"P;nZ"));
        strArr[15] = m1631z(m1632z("<8F't[9_#~@#M8n\\$L8~"));
        strArr[16] = m1631z(m1632z("<8F+uQ%U/dM5Z\"~M3Q/"));
        strArr[17] = m1631z(m1632z("<8F8zE"));
        strArr[18] = m1631z(m1632z("<8F't[9_#~@ K%kM9\\>~@2X9~@4\\5P>W/~L"));
        strArr[19] = m1631z(m1632z("<8F)iZ1M#tQ"));
        strArr[20] = m1631z(m1632z("<8F/cZ3L>~@\"\\;nZ$\\"));
        strArr[21] = m1631z(m1632z("<8F/iM5L8dR?M5Z/I+hL5"));
        strArr[22] = m1631z(m1632z("<8F/iM5L8d]<V)zX5"));
        strArr[23] = m1631z(m1632z("<8F:tL9M#tQ>\\"));
        strArr[24] = m1631z(m1632z("<8F.~\\\"P>dK\"P-|Z\"F9~M&\\?i"));
        strArr[25] = m1631z(m1632z("<8F9nO K#vZ/M+xW5"));
        strArr[26] = m1631z(m1632z("<8F9nO K#vZ/K/kZ\"M%rM5"));
        strArr[27] = m1631z(m1632z("<8F,rS$K/dV4\\$oV!L/"));
        strArr[28] = m1631z(m1632z("<8F#uY?F+u^<@9~"));
        strArr[29] = m1631z(m1632z("<8F.yX"));
        strArr[30] = m1631z(m1632z("<8F,rS$K/d\\?T:iV/J/uK\"\\"));
        strArr[31] = m1631z(m1632z("<8F8~V>]/c^$P%u@5W5xP%K9"));
        strArr[32] = m1631z(m1632z("<8F+qP%M/dJ$P&rL1M/nM"));
        strArr[33] = m1631z(m1632z("<6P)sV5K5mZ\"J5o^2U/zJ"));
        strArr[34] = m1631z(m1632z("Z\u0013q\u000fX?\u0014|JW8\u0011i\u001a^sP}\u000f\u001bs\u00119\fTq\u0013m\u0003TqPQ)S~\u001e~\u000fiz\u00009\u001aTj\u00029\u0006^lPv\u0018_m\u0015jJhN<7"));
        strArr[35] = m1631z(m1632z("<8F)s^>^/dM5I"));
        strArr[36] = m1631z(m1632z("y\u00027\u001aXl\u001f\u001e\u0015h\u0014s\u000bM~^x\u001aR1']+kV#H&"));
        strArr[37] = m1631z(m1632z("w3q\u000bUx\u0015K\u000fKL!U"));
        strArr[38] = m1631z(m1632z("<8F9nM/\\8iZ%K"));
        strArr[39] = m1631z(m1632z("<8F/uM5^#hK\"\\'~Q$F<~M#F2vS"));
        strArr[40] = m1631z(m1632z("<8F.~K\"L#o@$K#|X5K5hZ\"O/nM"));
        strArr[41] = m1631z(m1632z("<8F9nO K#vZ/I+i^=\\>iZ"));
        strArr[42] = m1631z(m1632z("<8F+uQ%U/dL1L<~X1K.~"));
        strArr[43] = m1631z(m1632z("<8F:iV?K#oZ"));
        strArr[44] = m1631z(m1632z("<8F&rL$\\5oM9^-~M/J/iI5L8"));
        strArr[45] = m1631z(m1632z("<8F+m^>Z/"));
        strArr[46] = m1631z(m1632z("<8F9nO K#vZ/L>rS9J+oZ%K"));
        strArr[47] = m1631z(m1632z("<8F8~L$X?iZ/J+nI5^+i[5"));
        strArr[48] = m1631z(m1632z("<8F#uY?F9~M&\\?i"));
        strArr[49] = m1631z(m1632z("<8F<~M#F,r\\8P/i"));
        strArr[50] = m1631z(m1632z("<8F#uY?F.iP9M5y^#\\5Z/]%uQ5\\9"));
        strArr[51] = m1631z(m1632z("<8F,rS$K/"));
        strArr[52] = m1631z(m1632z("<8F/uI?P/dR5J9zX5\\5mZ\"J5xS9\\$o"));
        strArr[53] = m1631z(m1632z("<8F#uY?F?oV<P9zK5L8"));
        strArr[54] = m1631z(m1632z("<8F8~\\8\\8xW5F:iZ=P/i"));
        strArr[55] = m1631z(m1632z("<8F<~M9_#~@9W+wK5K/"));
        strArr[56] = m1631z(m1632z("<8F.~]<V;nZ/W?v@5W8"));
        strArr[57] = m1631z(m1632z("<8F&rL$\\5xP>W/cV?W"));
        strArr[58] = m1631z(m1632z("<8F9~\\%K#oZ"));
        strArr[59] = m1631z(m1632z("<8F&r]5K/dO?J#oV?W"));
        strArr[60] = m1631z(m1632z("<8F/uM5^#hK\"\\"));
        strArr[61] = m1631z(m1632z("<8F8zE/L>rS9J+oZ%K"));
        strArr[62] = m1631z(m1632z("<8F8~\\8\\8xW5F.~M>P/i"));
        strArr[63] = m1631z(m1632z("<8F't[9_#~@ K%kM9\\>~@6P)sV5K"));
        strArr[64] = m1631z(m1632z("<8F9nO K#vZ/^8tJ \\"));
        strArr[65] = m1631z(m1632z("<8F9zJ&\\5k^\"X'~K\"\\"));
        strArr[66] = m1631z(m1632z("<8F'zV>M/u^>Z/dL5K<~J\""));
        strArr[67] = m1631z(m1632z("<8F/iM5L8dV>M/|M9M/"));
        strArr[68] = m1631z(m1632z("<8F't[9_#~@4K%rK/_#xW9\\8"));
        strArr[69] = m1631z(m1632z("<8F+xK9O/dK\"P-|Z\"F9~M&\\?i"));
        strArr[70] = m1631z(m1632z("<8F9nV&X$o"));
        strArr[71] = m1631z(m1632z("<8F)tO9\\5}V3Q#~M"));
        strArr[72] = m1631z(m1632z("<8F,~M=\\"));
        strArr[73] = m1631z(m1632z("<8F8~\\8\\8xW5"));
        strArr[74] = m1631z(m1632z("<8F&r]5K/"));
        strArr[75] = m1631z(m1632z("<6P)sV5K5rQ3V$uJ"));
        strArr[76] = m1631z(m1632z("<6P)sV5K5mZ\"J5vZ=V#iZ"));
        strArr[77] = m1631z(m1632z("<$@:~@9W<zS9]/dO?L8dL5K#zS9J+oV?W"));
        strArr[78] = m1631z(m1632z("<8F#uY?F9zJ&\\-zM4\\"));
        strArr[79] = m1631z(m1632z("<8F9rR%U/dM5J/zJ"));
        strArr[80] = m1631z(m1632z("<8F&rK/I8~R9\\8"));
        strArr[81] = m1631z(m1632z("<8F<~M9_#~@#M8n\\$L8~"));
        strArr[82] = m1631z(m1632z("<8F-~M5F>i^>J+xK9V$"));
        strArr[83] = m1631z(m1632z("<8F9nO K#vZ/M%nK"));
        strArr[84] = m1631z(m1632z("<8F9o^$F\"~J\"\\"));
        strArr[85] = m1631z(m1632z("<8F%nI\"\\5xP>W/cV?W"));
        strArr[86] = m1631z(m1632z("<8F/cZ3L>~@ K%xZ4L8~"));
        strArr[87] = m1631z(m1632z("<8F&rL$\\5o^3Q/"));
        strArr[88] = m1631z(m1632z("<8F#uY?F.iP9M5hZ\"O/nM"));
        strArr[89] = m1631z(m1632z("<8F&rL$\\5k^\"X'~K\"\\"));
        strArr[90] = m1631z(m1632z("<8F$nR/\\$i"));
        strArr[91] = m1631z(m1632z("<8F&rK/K/xW5K)sZ"));
        strArr[92] = m1631z(m1632z("<8F.nO<P;nZ/[+hZ/]/d[?W$òZ#"));
        strArr[93] = m1631z(m1632z("<8F/iM5L8dV>_%"));
        strArr[94] = m1631z(m1632z("<8F'rL5F+dU?L8d\\?U&~\\$P%u"));
        strArr[95] = m1631z(m1632z("<8F9n]#M5iZ "));
        strArr[96] = m1631z(m1632z("<8F>i^>J+xK9V$dV>M/iM?T:nZ"));
        strArr[97] = m1631z(m1632z("<8F8~K?L8dO?J#oV?W"));
        strArr[98] = m1631z(m1632z("<8F&rL$\\5wV1P9tQ"));
        strArr[99] = m1631z(m1632z("<8F&rL$\\5|M?L:~"));
        strArr[100] = m1631z(m1632z("<8F#uY?F.iP9M5mJ5"));
        strArr[101] = m1631z(m1632z("<#H&dK\"X$h^3M#tQ"));
        strArr[102] = m1631z(m1632z("<8F:tL9M#tQ/Z%nM1W>~"));
        strArr[103] = m1631z(m1632z("<8F8zF5"));
        strArr[104] = m1631z(m1632z("<8F8~\\?W$~\\$\\"));
        strArr[105] = m1631z(m1632z("<8F>i^>J+xK9V$d[5[?o"));
        strArr[106] = m1631z(m1632z("<8F&rK/I8~\\5]/uK"));
        strArr[107] = m1631z(m1632z("<=\\'tV\"\\5mZ\"J5}V3Q#~M"));
        strArr[108] = m1631z(m1632z("<8F+qP%M/"));
        strArr[109] = m1631z(m1632z("<8F<~M9_#~@9W.~G"));
        strArr[110] = m1631z(m1632z("<8F#uY?F,r\\8P/i"));
        strArr[111] = m1631z(m1632z("<8F#uK5K.rK/X)xZ#F(zL5F.~@4V$uZ5J"));
        strArr[112] = m1631z(m1632z("<8F8zE/Z&rZ>M"));
        strArr[113] = m1631z(m1632z("<8F't[9_#~@%M#wV#X>~J\""));
        strArr[114] = m1631z(m1632z("<8F#uY?F(wP3X-~"));
        strArr[115] = m1631z(m1632z("<8F9nO K#vZ/J+nI5^+i[5"));
        strArr[116] = m1631z(m1632z("<8F8~\\%U/"));
        strArr[117] = m1631z(m1632z("<8F.~\\<X8~@5A>~M>\\"));
        strArr[118] = m1631z(m1632z("<8F<~M#P%u"));
        strArr[119] = m1631z(m1632z("<8F:iV?K#oZ/Z&rZ>M"));
        strArr[C0607n.co] = m1631z(m1632z("<8F+uQ%U/d[5Z&zM1M#tQ"));
        strArr[121] = m1631z(m1632z("<8F't[9_#~"));
        strArr[122] = m1631z(m1632z("<8F8~V>]/cZ"));
        strArr[123] = m1631z(m1632z("<8F&rK"));
        strArr[C0607n.Hn] = m1631z(m1632z("<8F+xK9O/dY9U>iZ"));
        strArr[125] = m1631z(m1632z("<8F't[9_#~@7K%nO5"));
        strArr[126] = m1631z(m1632z("<8F&rL$\\5y^#\\5Z/]%uQ5\\9"));
        strArr[C0607n.bx] = m1631z(m1632z("<8F>i^>J+xK9V$dS9[/iZ"));
        strArr[128] = m1631z(m1632z("<8F,rS$K/d\\?T'~Q3\\5k^\""));
        strArr[C0607n.Wj] = m1631z(m1632z("<8F.~\\\"P>d\\?W$~G9V$"));
        strArr[130] = m1631z(m1632z("<8F9nO K#vZ/_#xW9\\8"));
        strArr[131] = m1631z(m1632z("<8F't[9_#~@4K%rK/J/iI5L8"));
        strArr[C0538a.tb] = m1631z(m1632z("<8F%nI\"\\"));
        strArr[133] = m1631z(m1632z("<8F,~M=\\5xP>W/cV?W"));
        strArr[C0607n.Fb] = m1631z(m1632z("<8F-~M5F9~M&\\?i"));
        strArr[C0538a.Nb] = m1631z(m1632z("<8F:iZ3\\.~Q$"));
        strArr[136] = m1631z(m1632z("<8F&rL$\\5}V3Q#~M"));
        strArr[137] = m1631z(m1632z("<8F)s^>^/d\\<\\"));
        strArr[138] = m1631z(m1632z("<8F+oK1Z\"~@=\\'t"));
        strArr[139] = m1631z(m1632z("<8F8~\\%I/iZ/\\$iZ7P9oM5T/uK"));
        strArr[C0542t.f1193i] = m1631z(m1632z("<8F.~]<V;nZ/_#xW9\\8"));
        strArr[141] = m1631z(m1632z("<8F#uY?F-iP%I/"));
        strArr[C0536n.f995G] = m1631z(m1632z("<8F9o^$F$y@4V?yS?W"));
        strArr[143] = m1631z(m1632z("<8F&rL$\\5vP$F<r[5"));
        strArr[C0538a.Lb] = m1631z(m1632z("<8F&rL$\\5nK9U#h^$\\?i@3V$uZ3M/"));
        strArr[145] = m1631z(m1632z("<8F9o^$F.zK5"));
        strArr[146] = m1631z(m1632z("<8F&rL$\\5rQ4\\2dY%U&dK5A>"));
        strArr[147] = m1631z(m1632z("<8F9nO K#vZ/K/jJ5M/"));
        strArr[148] = m1631z(m1632z("<8F:zL#\\"));
        strArr[149] = m1631z(m1632z("Z\u0013q\u000fX?\u0014|JW8\u0011i\u001a^sP}\u000f\u001bs\u00119\fTq\u0013m\u0003TqPQ:Zl\u0003|JKp\u0005kJWz\u00039\u0005I{\u0002|\u0019\u001bL!UD"));
        strArr[C0536n.f1006y] = m1631z(m1632z("w x\u0019Hz#H&"));
        strArr[151] = m1631z(m1632z("<8F:iZ=P/i"));
        strArr[152] = m1631z(m1632z("<8F.~L1Z>rI5F,rS$K/"));
        strArr[153] = m1631z(m1632z("<8F&rL$\\5~S5T/uK/J>t\\;\\"));
        strArr[154] = m1631z(m1632z("<8F&rL$\\5xS5"));
        strArr[155] = m1631z(m1632z("<8F'rL5F+dU?L8dM5H?~K5"));
        strArr[156] = m1631z(m1632z("<8F&rL$\\5hF>V$bR5"));
        strArr[157] = m1631z(m1632z("<8F&r]5K/dM5H?~K5"));
        strArr[158] = m1631z(m1632z("<8F>iP%O/"));
        strArr[159] = m1631z(m1632z("<8F&rK/J?rI1W>"));
        strArr[160] = m1631z(m1632z("<8F8~\\%I/iZ/K?yM9H?~"));
        strArr[C0607n.kh] = m1631z(m1632z("<8F>i^>J+xK9V$d^>W?wZ"));
        strArr[C0607n.Ru] = m1631z(m1632z("<8F.zK5F/uM5^"));
        strArr[C0607n.Ao] = m1631z(m1632z("<8F#uY?F:iP K#~K5F(zL5F.~@4V$uZ5J"));
        strArr[164] = m1631z(m1632z("<8F)tO9\\5~Q\"\\-"));
        strArr[165] = m1631z(m1632z("<8F#uY?F:iP K#òK¹F9~M&\\?i"));
        strArr[166] = m1631z(m1632z("<8F.~L1Z>rI5F>iV7^/i@#\\8mZ%K"));
        strArr[167] = m1631z(m1632z("<8F)s^>^/dQ?T"));
        strArr[168] = m1631z(m1632z("<8F't[5"));
        strArr[169] = m1631z(m1632z("<8F)s^>^/dR?M5Z/I+hL5"));
        strArr[C0536n.f1002n] = m1631z(m1632z("<8F-~M5F#uK5^8rK5"));
        strArr[171] = m1631z(m1632z("<8F9o^$F)zS3L&~"));
        strArr[172] = m1631z(m1632z("<8F#uY?F.iP9M5}V3Q#~M"));
        strArr[173] = m1631z(m1632z("<8F<~M#F8n]\"P;nZ"));
        strArr[174] = m1631z(m1632z("<8F/iM5L8"));
        strArr[C0607n.hu] = m1631z(m1632z("<8F9zJ&\\-zM4\\"));
        strArr[C0607n.aw] = m1631z(m1632z("<8F)iZ1M#tQ/J#dV>\\2rL$X$o"));
        strArr[C0607n.Nr] = m1631z(m1632z("<8F8zE/^8tJ \\"));
        strArr[C0607n.Gk] = m1631z(m1632z("<8F9nO K#vZ/Z%wS5Z>rP>"));
        strArr[C0607n.yt] = m1631z(m1632z("<8F.~\\?W$~\\$\\5xS9\\$o"));
        strArr[180] = m1631z(m1632z("<8F>i^>J+xK9V$dY9W"));
        strArr[181] = m1631z(m1632z("<8F/u@4\\\"tM#"));
        strArr[182] = m1631z(m1632z("<8F&rL$\\5nK9U#h^$\\?i"));
        strArr[183] = m1631z(m1632z("<8F-~M5F.tJ2U%u"));
        strArr[184] = m1631z(m1632z("<8F't[9_#~@4K%rK/[+hZ/]/d[?W$~Z#"));
        strArr[185] = m1631z(m1632z("<8F&rK/]/iQ9\\8"));
        strArr[C0607n.pw] = m1631z(m1632z("<8F-~M5F)z\\8\\"));
        strArr[187] = m1631z(m1632z("<8F/cO?K>~@(T&"));
        strArr[188] = m1631z(m1632z("<8F)iZ5F>iV7^/i@#\\8mZ%K"));
        strArr[189] = m1631z(m1632z("<8F't[9_#~@4K%rK/O?~"));
        strArr[190] = m1631z(m1632z("<8F/o^$"));
        strArr[191] = m1631z(m1632z("<8F)s^\"^/dO1K+vZ$K/"));
        strArr[192] = m1631z(m1632z("<8F9nO K#vZ"));
        strArr[193] = m1631z(m1632z("<8F/xM9M"));
        strArr[C0607n.nn] = m1631z(m1632z("<8F>i^>J+xK9V$dS9J>~"));
        strArr[C0607n.oq] = m1631z(m1632z("<8F9o^$F$y@5W8"));
        strArr[C0607n.Uk] = m1631z(m1632z("<8F&rK/K/xW5K)sZ/]/iQ9\\8"));
        strArr[C0607n.Eg] = m1631z(m1632z("<8F(wP!L/dY9Z\"rZ\""));
        strArr[C0607n.jk] = m1631z(m1632z("<8F9nO K#vZ/[+hZ/]/d[?W$~Z#"));
        strArr[199] = m1631z(m1632z("<8F9o^$F$y@5W8dV>M/iI1U&~"));
        strArr[C0607n.Dt] = m1631z(m1632z("<8F#uY?F:iP K#~K5F,r\\8P/i"));
        strArr[C0607n.Bf] = m1631z(m1632z("<8F.~M>P/i"));
        strArr[C0607n.Ug] = m1631z(m1632z("<8F,o@<P9oZ/T%o"));
        strArr[C0607n.f1465w] = m1631z(m1632z("<8F+qP%M/dX\"V?kZ"));
        strArr[204] = m1631z(m1632z("<8F>i^>J+xK9V$dV#V&zK9V$"));
        strArr[C0607n.f1441Y] = m1631z(m1632z("<8F&rL$\\5iJ2K#jJ5"));
        strArr[C0607n.me] = m1631z(m1632z("<8F,rS$K/d\\?W>rZ>M"));
        strArr[C0607n.Px] = m1631z(m1632z("<8F,rQ/P$oZ\"]#o@1Z)~L/[+hZ/]/d[?W$~Z#"));
        strArr[C0607n.qj] = m1631z(m1632z("<8F&rL$\\5hZ\"O/nM"));
        strArr[C0607n.af] = m1631z(m1632z("<8F,tM3\\5~\\\"P>nM5"));
        strArr[C0607n.Bs] = m1631z(m1632z("<8F9zJ&\\5kP#P>rP>"));
        strArr[C0607n.lh] = m1631z(m1632z("<8F)s^>^/d\\?W$~G9V$"));
        Rd = strArr;
    }

    public static final WDEntier4 HEtat() {
        return HEtat(null, 0);
    }

    public static final WDEntier4 HEtat(WDObjet wDObjet) {
        return HEtat(wDObjet, 0);
    }

    public static final WDEntier4 HEtat(WDObjet wDObjet, long j) {
        WDContexte a = C0677k.m2779a(Rd[190], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5124b(wDObjet, j));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet HPriorite(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[43], true, true);
        try {
            WDObjet b = C0611a.m2308b(WDHF_Manager.m5221g(wDObjet));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet HPriorite(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[43], true, true);
        try {
            WDObjet b = C0611a.m2308b(WDHF_Manager.m5270t(wDObjet, i));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet HRecupereRubrique(WDObjet wDObjet, int i) {
        return HRecupereRubrique(wDObjet, i, new WDChaine(C0607n.Gc));
    }

    public static final WDObjet HRecupereRubrique(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[160], true, true);
        try {
            WDObjet a2 = WDHF_Manager.m5054a(wDObjet, i, wDObjet2);
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet HSupprimeCollection(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Gk], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5276v(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet HSupprimeRequete(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[147], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5236i(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen _hAvance(WDObjet wDObjet, long j) {
        return hAvance(wDObjet, null, j, 0);
    }

    public static WDBooleen _hAvance(WDObjet wDObjet, long j, int i) {
        return hAvance(wDObjet, null, j, i);
    }

    public static WDChaine _hConstruitValCle(String[] strArr) {
        WDContexte a = C0677k.m2779a(Rd[2], true, true);
        try {
            WDChaine b = WDHF_Manager.m5128b(null, null, strArr);
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen _hRecule(WDObjet wDObjet, long j) {
        return hRecule(wDObjet, null, j, 0);
    }

    public static WDBooleen _hRecule(WDObjet wDObjet, long j, int i) {
        return hRecule(wDObjet, null, j, i);
    }

    public static void fichierVersMemoire(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(Rd[76]);
        try {
            ab abVar;
            if (wDObjet2.isSourceDonnees()) {
                C0776b sourceDonnees = ((C0776b) wDObjet2).getSourceDonnees();
                abVar = sourceDonnees instanceof db ? (db) sourceDonnees : null;
            } else {
                Object a2 = WDHF_Contexte.getInstance().m4991a(wDObjet2.getString(), false);
            }
            if (abVar == null) {
                WDErreurManager.m2883a(C0745b.m3222b(Rd[75], wDObjet2.getString()));
            }
            C0718g c0718g = (C0718g) wDObjet.checkType(C0718g.class);
            if (c0718g != null) {
                c0718g.binderFichier(abVar, true);
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(Rd[77], new String[0]));
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final void fichierVersTableau(WDObjet wDObjet, WDObjet wDObjet2) {
        fichierVersTableau(wDObjet, wDObjet2, null);
    }

    public static final void fichierVersTableau(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[33], true, true);
        try {
            WDHF_Manager.m5212f(wDObjet, wDObjet2, wDObjet3);
        } finally {
            a.m2735v();
        }
    }

    public static WDHF_Connexion getConnexion(String str) {
        return WDHF_Manager.m5163c(str);
    }

    public static db getFichierSansCasseNiAccent(String str) {
        return WDHF_Manager.m5199e(str);
    }

    public static WDObjet getProxyVariableHF(int i) {
        return new C0551f(i);
    }

    public static C0778b getRequeteSansCasseNiAccent(String str) {
        return WDHF_Manager.m5184d(str);
    }

    public static eb getRubriqueSansCasseNiAccent(String str) {
        return WDHF_Manager.m5060a(WDHF_Contexte.getInstance(), str);
    }

    public static WDBooleen hActiveFiltre() {
        return hActiveFiltre(null);
    }

    public static WDBooleen hActiveFiltre(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Hn], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5247l(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hActiveTriggerServeur(WDObjet wDObjet, String str) {
        return hActiveTriggerServeur(wDObjet, str, null);
    }

    public static final WDObjet hActiveTriggerServeur(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[69], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5149b(wDObjet, str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAjoute() {
        return hAjoute(null, null, 128);
    }

    public static WDBooleen hAjoute(WDObjet wDObjet) {
        return hAjoute(wDObjet, null, 128);
    }

    public static WDBooleen hAjoute(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(WDEnregistrement.class) != null ? hAjoute(wDObjet, wDObjet2, 128) : hAjoute(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hAjoute(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDBooleen wDBooleen = true;
        WDContexte a = C0677k.m2779a(Rd[108], true, true);
        try {
            wDBooleen = new WDBooleen(WDHF_Manager.m5102a(wDObjet, wDObjet2 != null ? (WDEnregistrement) wDObjet2.checkType(WDEnregistrement.class) : null, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hAjouteGroupe(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.f1465w], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5214f(wDObjet));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hAjouteUtilisateur(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[32], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5243k(wDObjet));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAlias(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[3], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5192d(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAlias(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[3], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5141b(wDObjet, wDObjet2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAnnuleAlias(String str) {
        WDContexte a = C0677k.m2779a(Rd[3], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5157b(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAnnuleDeclaration(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.co], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5264r(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAnnuleRecherche() {
        return hAnnuleRecherche(null, null);
    }

    public static WDBooleen hAnnuleRecherche(WDObjet wDObjet) {
        return hAnnuleRecherche(wDObjet, null);
    }

    public static WDBooleen hAnnuleRecherche(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[16], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5090a(wDObjet, wDObjet2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hAnnuleSauvegarde(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[42], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5224g());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAttacheMemo(WDObjet wDObjet, WDObjet wDObjet2) {
        return hAttacheMemo(wDObjet, wDObjet2, "", 0, "");
    }

    public static WDBooleen hAttacheMemo(WDObjet wDObjet, WDObjet wDObjet2, String str) {
        return hAttacheMemo(wDObjet, wDObjet2, str, 0, "");
    }

    public static WDBooleen hAttacheMemo(WDObjet wDObjet, WDObjet wDObjet2, String str, int i) {
        return hAttacheMemo(wDObjet, wDObjet2, str, i, "");
    }

    public static WDBooleen hAttacheMemo(WDObjet wDObjet, WDObjet wDObjet2, String str, int i, String str2) {
        WDContexte a = C0677k.m2779a(Rd[138], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5096a(wDObjet, wDObjet2, str, i, str2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hAvance() {
        return hAvance(null, null, 1, 0);
    }

    public static WDBooleen hAvance(WDObjet wDObjet) {
        return hAvance(wDObjet, null, 1, 0);
    }

    public static WDBooleen hAvance(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hAvance(wDObjet, wDObjet2, 1, 0) : _hAvance(wDObjet, (long) wDObjet2.getInt());
    }

    public static WDBooleen hAvance(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hAvance(wDObjet, wDObjet2, j, 0) : _hAvance(wDObjet, (long) wDObjet2.getInt(), (int) j);
    }

    public static WDBooleen hAvance(WDObjet wDObjet, WDObjet wDObjet2, long j, int i) {
        WDContexte a = C0677k.m2779a(Rd[45], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5142b(wDObjet, wDObjet2, j, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hBloqueFichier() {
        return hBloqueFichier(null, 16);
    }

    public static final WDBooleen hBloqueFichier(WDObjet wDObjet) {
        return wDObjet.isNumerique() ? hBloqueFichier(null, wDObjet.getInt()) : hBloqueFichier(wDObjet, 16);
    }

    public static final WDBooleen hBloqueFichier(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Eg], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5225g(wDObjet, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hBloqueNumEnr() {
        return hBloqueNumEnr(null, 0, 16);
    }

    public static WDBooleen hBloqueNumEnr(WDObjet wDObjet) {
        return hBloqueNumEnr(wDObjet, 0, 16);
    }

    public static WDBooleen hBloqueNumEnr(WDObjet wDObjet, long j) {
        return hBloqueNumEnr(wDObjet, j, 16);
    }

    public static WDBooleen hBloqueNumEnr(WDObjet wDObjet, long j, int i) {
        WDContexte a = C0677k.m2779a(Rd[13], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5173c(wDObjet, j, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hChangeCle(WDObjet wDObjet) {
        return hChangeCle(wDObjet, null, 0);
    }

    public static WDBooleen hChangeCle(WDObjet wDObjet, WDObjet wDObjet2) {
        return hChangeCle(wDObjet, wDObjet2, 0);
    }

    public static WDBooleen hChangeCle(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDContexte a = C0677k.m2779a(Rd[137], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5091a(wDObjet, wDObjet2, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hChangeConnexion(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.lh], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5175c(wDObjet, wDObjet2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hChangeMotDePasse(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[169], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5232h(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hChangeNom(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[167], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5274u(wDObjet, str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hChangeRep(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[35], true, true);
        try {
            Class.forName(Rd[36]).getMethod(Rd[37], new Class[]{String.class, String.class}).invoke(null, new Object[]{wDObjet.getString(), str});
        } catch (Exception e) {
            C0691a.m2857a(Rd[34], e);
        } catch (Throwable th) {
            a.m2735v();
        }
        WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5269s(wDObjet, str));
        a.m2735v();
        return wDBooleen;
    }

    public static final WDObjet hChargeParametre(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[191], true, true);
        try {
            WDObjet c = WDHF_Manager.m5161c(wDObjet, str, wDObjet2);
            return c;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hCompareRubrique(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4) {
        WDContexte a = C0677k.m2779a(Rd[7], true, true);
        try {
            WDObjet b = C0611a.m2308b(WDHF_Manager.m5052a(wDObjet, wDObjet2, wDObjet3, wDObjet4));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hConstruitValCle(WDObjet wDObjet, WDObjet wDObjet2, String[] strArr) {
        WDContexte a = C0677k.m2779a(Rd[2], true, true);
        try {
            WDChaine b = WDHF_Manager.m5128b(wDObjet, wDObjet2, strArr);
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hCopieEnreg(WDObjet wDObjet, WDObjet wDObjet2) {
        return hCopieEnreg(wDObjet, wDObjet2, null, null, 0);
    }

    public static WDBooleen hCopieEnreg(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return wDObjet3.isNumerique() ? hCopieEnreg(wDObjet, wDObjet2, null, null, wDObjet3.getInt()) : hCopieEnreg(wDObjet, wDObjet2, wDObjet3.getString(), null, 0);
    }

    public static WDBooleen hCopieEnreg(WDObjet wDObjet, WDObjet wDObjet2, String str, WDObjet wDObjet3) {
        return wDObjet3.isNumerique() ? hCopieEnreg(wDObjet, wDObjet2, str, null, wDObjet3.getInt()) : hCopieEnreg(wDObjet, wDObjet2, str, wDObjet3.getString(), 0);
    }

    public static WDBooleen hCopieEnreg(WDObjet wDObjet, WDObjet wDObjet2, String str, String str2, int i) {
        WDContexte a = C0677k.m2779a(Rd[164], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5098a(wDObjet, wDObjet2, str, str2, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hCopieFichier(WDObjet wDObjet, String str, WDObjet wDObjet2, String str2) {
        return hCopieFichier(wDObjet, str, wDObjet2, str2, 0, null, "");
    }

    public static final WDBooleen hCopieFichier(WDObjet wDObjet, String str, WDObjet wDObjet2, String str2, int i, WDObjet wDObjet3) {
        return hCopieFichier(wDObjet, str, wDObjet2, str2, i, wDObjet3, "");
    }

    public static final WDBooleen hCopieFichier(WDObjet wDObjet, String str, WDObjet wDObjet2, String str2, int i, WDObjet wDObjet3, String str3) {
        WDContexte a = C0677k.m2779a(Rd[71], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5106a(wDObjet, str, wDObjet2, str2, i, wDObjet3, str3));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hCreation(WDObjet wDObjet) {
        return hCreation(wDObjet, "", "", "", 0);
    }

    public static WDBooleen hCreation(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hCreation(wDObjet, "", "", "", wDObjet2.getInt()) : hCreation(wDObjet, wDObjet2.getString(), "", "", 0);
    }

    public static WDBooleen hCreation(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hCreation(wDObjet, str, "", "", wDObjet2.getInt()) : hCreation(wDObjet, str, wDObjet2.getString(), "", 0);
    }

    public static WDBooleen hCreation(WDObjet wDObjet, String str, String str2, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hCreation(wDObjet, str, "", "", wDObjet2.getInt()) : hCreation(wDObjet, str, str2, wDObjet2.getString(), 0);
    }

    public static WDBooleen hCreation(WDObjet wDObjet, String str, String str2, String str3, int i) {
        WDContexte a = C0677k.m2779a(Rd[19], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5180c(wDObjet, str, str2, str3, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hCreationSiInexistant() {
        return hCreationSiInexistant(null, null, null, null, 0);
    }

    public static WDBooleen hCreationSiInexistant(WDObjet wDObjet) {
        return hCreationSiInexistant(wDObjet, null, null, null, 0);
    }

    public static WDBooleen hCreationSiInexistant(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hCreationSiInexistant(wDObjet, null, null, null, wDObjet2.getInt()) : hCreationSiInexistant(wDObjet, wDObjet2.getString(), null, null, 0);
    }

    public static WDBooleen hCreationSiInexistant(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hCreationSiInexistant(wDObjet, str, null, null, wDObjet2.getInt()) : hCreationSiInexistant(wDObjet, str, wDObjet2.getString(), null, 0);
    }

    public static WDBooleen hCreationSiInexistant(WDObjet wDObjet, String str, String str2, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hCreationSiInexistant(wDObjet, str, str2, null, wDObjet2.getInt()) : hCreationSiInexistant(wDObjet, str, str2, wDObjet2.getString(), 0);
    }

    public static WDBooleen hCreationSiInexistant(WDObjet wDObjet, String str, String str2, String str3, int i) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.aw], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5111a(wDObjet, str, str2, str3, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hCreeTriggerServeur(String str) {
        WDContexte a = C0677k.m2779a(Rd[188], true, true);
        try {
            WDBooleen a2 = C0611a.m2298a(WDHF_Manager.m5227g(str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDChaine hDateEnreg() {
        return hDateEnreg(null, 0);
    }

    public static final WDChaine hDateEnreg(WDObjet wDObjet) {
        return hDateEnreg(wDObjet, 0);
    }

    public static final WDChaine hDateEnreg(WDObjet wDObjet, long j) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Ru], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5185d(wDObjet, j));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hDbg(WDObjet wDObjet, int i) {
        return hDbg(wDObjet, i, "");
    }

    public static final WDObjet hDbg(WDObjet wDObjet, int i, String str) {
        WDContexte a = C0677k.m2779a(Rd[29], true, true);
        try {
            WDObjet wDChaine = new WDChaine(WDHF_Manager.m5061a(wDObjet, i, str));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hDebloqueFichier() {
        return hDebloqueFichier(null);
    }

    public static final WDBooleen hDebloqueFichier(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[C0542t.f1193i], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5279x(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hDebloqueNumEnr() {
        return hDebloqueNumEnr(null, 0);
    }

    public static WDBooleen hDebloqueNumEnr(WDObjet wDObjet) {
        return hDebloqueNumEnr(wDObjet, 0);
    }

    public static WDBooleen hDebloqueNumEnr(WDObjet wDObjet, long j) {
        WDContexte a = C0677k.m2779a(Rd[56], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5172c(wDObjet, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hDeclareExterne(String str, WDObjet wDObjet) {
        return hDeclareExterne(str, wDObjet, null);
    }

    public static final WDBooleen hDeclareExterne(String str, WDObjet wDObjet, String str2) {
        WDContexte a = C0677k.m2779a(Rd[117], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5120a(str, wDObjet, str2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hDeconnecteClient(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.yt], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5211e(wDObjet, str, C0725i.m3013a(wDObjet2, C0782g.SECOND)));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hDecritConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5) {
        return hDecritConnexion(wDObjet, str, str2, str3, str4, str5, 3);
    }

    public static WDBooleen hDecritConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Wj], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5155b(wDObjet, str, str2, str3, str4, str5, i, "", 0));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hDecritConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        return hDecritConnexion(wDObjet, str, str2, str3, str4, str5, i, str6, 0);
    }

    public static WDBooleen hDecritConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Wj], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5155b(wDObjet, str, str2, str3, str4, str5, i, str6, i2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hDecritTriggerServeur(WDObjet wDObjet, String str, String str2, int i) {
        return hDecritTriggerServeur(wDObjet, str, str2, i, "", "");
    }

    public static final WDObjet hDecritTriggerServeur(WDObjet wDObjet, String str, String str2, int i, String str3) {
        return hDecritTriggerServeur(wDObjet, str, str2, i, str3, "");
    }

    public static final WDObjet hDecritTriggerServeur(WDObjet wDObjet, String str, String str2, int i, String str3, String str4) {
        WDContexte a = C0677k.m2779a(Rd[24], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5109a(wDObjet, str, str2, i, str3, str4));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hDernier() {
        return hDernier(null, null, 0);
    }

    public static WDBooleen hDernier(WDObjet wDObjet) {
        return hDernier(wDObjet, null, 0);
    }

    public static WDBooleen hDernier(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hDernier(wDObjet, wDObjet2, 0) : hDernier(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hDernier(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Bf], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5177c(wDObjet, wDObjet2, false, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hDesactiveFiltre() {
        return hDesactiveFiltre(null);
    }

    public static WDBooleen hDesactiveFiltre(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[152], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5235i(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hDesactiveTriggerServeur(WDObjet wDObjet, String str) {
        return hDesactiveTriggerServeur(wDObjet, str, null);
    }

    public static final WDObjet hDesactiveTriggerServeur(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[166], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5219f(wDObjet, str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hDetruitTriggerServeur(WDObjet wDObjet, String str) {
        return hDetruitTriggerServeur(wDObjet, str, null);
    }

    public static final WDObjet hDetruitTriggerServeur(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[40], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5107a(wDObjet, str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hDupliqueBaseDeDonnees(WDObjet wDObjet, String str) {
        return hDupliqueBaseDeDonnees(wDObjet, str, null);
    }

    public static final WDObjet hDupliqueBaseDeDonnees(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[92], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5148b(wDObjet, str, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hEcrit() {
        return hEcrit(null, 0, 128);
    }

    public static WDBooleen hEcrit(WDObjet wDObjet) {
        return hEcrit(wDObjet, 0, 128);
    }

    public static WDBooleen hEcrit(WDObjet wDObjet, long j) {
        return hEcrit(wDObjet, j, 128);
    }

    public static final WDBooleen hEcrit(WDObjet wDObjet, long j, long j2) {
        WDContexte a = C0677k.m2779a(Rd[193], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5087a(wDObjet, j, (int) j2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hEnDehors() {
        return hEnDehors(null);
    }

    public static WDBooleen hEnDehors(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[181], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5231h(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hEnregistre() {
        return hEnregistre(null, 128);
    }

    public static WDBooleen hEnregistre(WDObjet wDObjet) {
        return hEnregistre(wDObjet, 128);
    }

    public static WDBooleen hEnregistre(WDObjet wDObjet, long j) {
        WDContexte a = C0677k.m2779a(Rd[60], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5086a(wDObjet, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hEnvoieMessageVersClient(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[52], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5147b(wDObjet, str, C0725i.m3013a(wDObjet2, C0782g.SECOND)));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 hErreur() {
        return hErreur(2000);
    }

    public static WDEntier4 hErreur(int i) {
        WDContexte a = C0677k.m2779a(Rd[174], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5049a(i));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hErreurBlocage() {
        WDContexte a = C0677k.m2779a(Rd[22], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5171c());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hErreurInfo() {
        return hErreurInfo(C0542t.mb);
    }

    public static WDChaine hErreurInfo(int i) {
        WDContexte a = C0677k.m2779a(Rd[93], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Contexte.getInstance().mo3084a(i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hErreurIntegrite() {
        WDContexte a = C0677k.m2779a(Rd[67], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5077a());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hErreurMotDePasse() {
        WDContexte a = C0677k.m2779a(Rd[21], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5137b());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hExecuteProcedure(WDObjet wDObjet, String str) {
        return hExecuteProcedure(wDObjet, str, new WDObjet[0]);
    }

    public static final WDObjet hExecuteProcedure(WDObjet wDObjet, String str, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2779a(Rd[86], true, true);
        try {
            WDObjet a2 = WDHF_Manager.m5056a(wDObjet, str, wDObjetArr);
            if (a2 == null) {
                a2 = new WDChaine("");
            }
            a.m2735v();
            return a2;
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static WDBooleen hExecuteRequete(WDObjet wDObjet) {
        return hExecuteRequete(wDObjet, "", 0, null);
    }

    public static WDBooleen hExecuteRequete(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hExecuteRequete(wDObjet, "", wDObjet2.getInt(), null) : hExecuteRequete(wDObjet, wDObjet2.getString(), 0, null);
    }

    public static WDBooleen hExecuteRequete(WDObjet wDObjet, WDObjet wDObjet2, WDObjet[] wDObjetArr) {
        return wDObjet2.isNumerique() ? hExecuteRequete(wDObjet, "", wDObjet2.getInt(), wDObjetArr) : hExecuteRequete(wDObjet, wDObjet2.getString(), wDObjetArr[0].getInt(), null);
    }

    public static WDBooleen hExecuteRequete(WDObjet wDObjet, String str, int i, WDObjet[] wDObjetArr) {
        WDContexte a = C0677k.m2779a(Rd[20], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5104a(wDObjet, str, i, wDObjetArr));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hExecuteRequeteSQL(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((WDRequeteSQL) wDObjet.checkType(WDRequeteSQL.class)) != null ? wDObjet2.isNumerique() ? hExecuteRequete(wDObjet, "", wDObjet2.getInt(), null) : hExecuteRequete(wDObjet, wDObjet2.getString(), 0, null) : hExecuteRequeteSQL(wDObjet, "", 0, wDObjet2.getString());
    }

    public static WDBooleen hExecuteRequeteSQL(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDRequeteSQL wDRequeteSQL = (WDRequeteSQL) wDObjet.checkType(WDRequeteSQL.class);
        return wDRequeteSQL != null ? hExecuteRequete(wDRequeteSQL, wDObjet2.getString(), wDObjet3.getInt(), null) : wDObjet2.isNumerique() ? hExecuteRequeteSQL(wDObjet, "", wDObjet2.getInt(), wDObjet3.getString()) : hExecuteRequeteSQL(wDObjet, wDObjet2.getString(), 0, wDObjet3.getString());
    }

    public static WDBooleen hExecuteRequeteSQL(WDObjet wDObjet, String str, int i, String str2) {
        WDContexte a = C0677k.m2779a(Rd[20], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5103a(wDObjet, str, i, str2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hExporteXML(WDObjet wDObjet) {
        return hExporteXML(wDObjet, "", "", 2, null);
    }

    public static final WDObjet hExporteXML(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hExporteXML(wDObjet, "", "", wDObjet2.getInt(), null) : hExporteXML(wDObjet, wDObjet2.getString(), "", 2, null);
    }

    public static final WDObjet hExporteXML(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return wDObjet2.checkType(C0548s.class) != null ? hExporteXML(wDObjet, "", "", wDObjet2.getInt(), wDObjet3) : wDObjet3.checkType(C0548s.class) != null ? hExporteXML(wDObjet, wDObjet2.getString(), "", wDObjet3.getInt(), null) : hExporteXML(wDObjet, wDObjet2.getString(), wDObjet3.getString(), 2, null);
    }

    public static final WDObjet hExporteXML(WDObjet wDObjet, String str, WDObjet wDObjet2, WDObjet wDObjet3) {
        return wDObjet2.checkType(C0548s.class) != null ? hExporteXML(wDObjet, str, "", wDObjet2.getInt(), wDObjet3) : hExporteXML(wDObjet, str, wDObjet2.getString(), wDObjet3.getInt(), null);
    }

    public static final WDObjet hExporteXML(WDObjet wDObjet, String str, String str2, int i, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[187], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5108a(wDObjet, str, str2, i, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hExtraitMemo(WDObjet wDObjet, WDObjet wDObjet2, String str) {
        WDContexte a = C0677k.m2779a(Rd[11], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5095a(wDObjet, wDObjet2, str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hExtraitMemo(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[11], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5217f(wDObjet, str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hFTListeMot(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Ug], true, true);
        try {
            WDObjet wDTableauSimple = new WDTableauSimple(Arrays.asList(WDHF_Manager.m5244k(wDObjet, str)), WDChaine.m2421c());
            return wDTableauSimple;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hFerme() {
        return hFerme(new WDChaine(C0607n.Vc));
    }

    public static WDBooleen hFerme(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[72], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5262q(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hFermeConnexion(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[133], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5271t(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hFichierExiste() {
        return hFichierExiste(null);
    }

    public static final WDObjet hFichierExiste(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[6], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5277w(wDObjet));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hFichierExiste(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[6], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5210e(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hFiltre(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hFiltre(wDObjet, wDObjet2, wDObjet3, null, "");
    }

    public static WDChaine hFiltre(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4) {
        return hFiltre(wDObjet, wDObjet2, wDObjet3, wDObjet4, "");
    }

    public static WDChaine hFiltre(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, String str) {
        WDContexte a = C0677k.m2779a(Rd[51], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5063a(wDObjet, wDObjet2, wDObjet3, wDObjet4, str));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hFiltre(WDObjet wDObjet, String str) {
        return hFiltre(wDObjet, null, null, null, str);
    }

    public static WDChaine hFiltreCommencePar(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[128], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5201e(wDObjet, wDObjet2, wDObjet3));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hFiltreCommencePar(WDObjet wDObjet, WDObjet wDObjet2, String[] strArr) {
        WDContexte a = C0677k.m2779a(Rd[128], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5167c(wDObjet, wDObjet2, strArr));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hFiltreComprisEntre(WDObjet wDObjet, WDObjet wDObjet2, WDObjet... wDObjetArr) {
        WDContexte a = C0677k.m2779a(Rd[30], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5064a(wDObjet, wDObjet2, wDObjetArr));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hFiltreContient(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.me], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5187d(wDObjet, wDObjet2, wDObjet3));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hFiltreIdentique(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[27], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5062a(wDObjet, wDObjet2, wDObjet3));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hFiltreIdentique(WDObjet wDObjet, WDObjet wDObjet2, String[] strArr) {
        WDContexte a = C0677k.m2779a(Rd[27], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5065a(wDObjet, wDObjet2, strArr));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hFinInterditAccesBaseDeDonnees(WDObjet wDObjet) {
        return hFinInterditAccesBaseDeDonnees(wDObjet, null);
    }

    public static final WDObjet hFinInterditAccesBaseDeDonnees(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Px], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5280x(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static void hForceEcriture() {
        hForceEcriture(null);
    }

    public static void hForceEcriture(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.af], true, true);
        try {
            WDHF_Manager.m5260p(wDObjet);
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hGereCache(int i, int i2) {
        return hGereCache(i, null, null, i2);
    }

    public static final WDObjet hGereCache(int i, WDObjet wDObjet, int i2) {
        return hGereCache(i, wDObjet, null, i2);
    }

    public static final WDObjet hGereCache(int i, WDObjet wDObjet, WDObjet wDObjet2, int i2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.pw], true, true);
        try {
            WDObjet b = C0611a.m2308b(WDHF_Manager.m5050a(i, wDObjet, wDObjet2, i2));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hGereDoublon(WDObjet wDObjet, WDObjet wDObjet2, boolean z) {
        WDContexte a = C0677k.m2779a(Rd[183], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5100a(wDObjet, wDObjet2, z));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hGereDoublon(WDObjet wDObjet, boolean z) {
        return hGereDoublon(wDObjet, null, z);
    }

    public static final WDObjet hGereDoublon(boolean z) {
        return hGereDoublon(null, null, z);
    }

    public static final WDObjet hGereIntegrite(WDObjet wDObjet, boolean z) {
        return wDObjet.checkType(C0548s.class) != null ? hGereIntegrite(null, null, wDObjet.getInt(), z) : hGereIntegrite(wDObjet.getString(), null, 8, z);
    }

    public static final WDObjet hGereIntegrite(String str, WDObjet wDObjet, int i, boolean z) {
        WDContexte a = C0677k.m2779a(Rd[C0536n.f1002n], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5119a(str, wDObjet, i, z));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hGereIntegrite(String str, WDObjet wDObjet, boolean z) {
        return wDObjet.checkType(C0548s.class) != null ? hGereIntegrite(str, null, wDObjet.getInt(), z) : hGereIntegrite(str, wDObjet, 8, z);
    }

    public static final WDObjet hGereIntegrite(boolean z) {
        return hGereIntegrite(null, null, 8, z);
    }

    public static final WDObjet hGereMemo(int i) {
        return hGereMemo(null, null, i);
    }

    public static final WDObjet hGereMemo(WDObjet wDObjet, int i) {
        return hGereMemo(wDObjet, null, i);
    }

    public static final WDObjet hGereMemo(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDContexte a = C0677k.m2779a(Rd[0], true, true);
        try {
            WDObjet b = C0611a.m2308b(WDHF_Manager.m5125b(wDObjet, wDObjet2, i));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hGereServeur(WDObjet wDObjet, int i) {
        return hGereServeur(wDObjet, i, null);
    }

    public static final WDObjet hGereServeur(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Fb], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5132b(wDObjet, i, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hGereTransaction(WDObjet wDObjet, boolean z) {
        WDContexte a = C0677k.m2779a(Rd[82], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5117a(wDObjet, z));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hGereTransaction(boolean z) {
        return hGereTransaction(new WDChaine(C0607n.Vc), z);
    }

    public static final WDObjet hImporteTexte(WDObjet wDObjet, String str) {
        return hImporteTexte(wDObjet, str, "", "", 1024, null);
    }

    public static final WDObjet hImporteTexte(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        if (wDObjet2.checkType(C0548s.class) != null) {
            return hImporteTexte(wDObjet, str, "", "", wDObjet2.getInt(), null);
        }
        return hImporteTexte(wDObjet, str, wDObjet2.getString(), "", 1024, null);
    }

    public static final WDObjet hImporteTexte(WDObjet wDObjet, String str, String str2, WDObjet wDObjet2) {
        if (wDObjet2.checkType(C0548s.class) != null) {
            return hImporteTexte(wDObjet, str, str2, "", wDObjet2.getInt(), null);
        }
        return hImporteTexte(wDObjet, str, str2, wDObjet2.getString(), 1024, null);
    }

    public static final WDObjet hImporteTexte(WDObjet wDObjet, String str, String str2, WDObjet wDObjet2, WDObjet wDObjet3) {
        if (wDObjet2.checkType(C0548s.class) != null) {
            return hImporteTexte(wDObjet, str, str2, "", wDObjet2.getInt(), wDObjet3);
        }
        return hImporteTexte(wDObjet, str, str2, wDObjet2.getString(), wDObjet3.getInt(), null);
    }

    public static final WDObjet hImporteTexte(WDObjet wDObjet, String str, String str2, String str3, int i, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[5], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5152b(wDObjet, str, str2, str3, i, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoAnalyse() {
        return hInfoAnalyse("", "");
    }

    public static final WDObjet hInfoAnalyse(String str) {
        return hInfoAnalyse(str, "");
    }

    public static final WDObjet hInfoAnalyse(String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[28], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5136b(str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoBlocage(WDObjet wDObjet) {
        return hInfoBlocage(wDObjet, null, 0);
    }

    public static final WDObjet hInfoBlocage(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hInfoBlocage(wDObjet, null, wDObjet2.getLong()) : hInfoBlocage(wDObjet, wDObjet2.getString(), 0);
    }

    public static final WDObjet hInfoBlocage(WDObjet wDObjet, String str, long j) {
        WDContexte a = C0677k.m2779a(Rd[114], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5067a(wDObjet, str, j));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoDroitBaseDeDonnees(WDObjet wDObjet, String str, String str2, String str3) {
        return hInfoDroitBaseDeDonnees(wDObjet, str, str2, str3, 0);
    }

    public static final WDObjet hInfoDroitBaseDeDonnees(WDObjet wDObjet, String str, String str2, String str3, int i) {
        WDContexte a = C0677k.m2779a(Rd[50], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5134b(wDObjet, str, str2, str3, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoDroitFichier(WDObjet wDObjet, String str, String str2, String str3, String str4) {
        return hInfoDroitFichier(wDObjet, str, str2, str3, str4, 0);
    }

    public static final WDObjet hInfoDroitFichier(WDObjet wDObjet, String str, String str2, String str3, String str4, int i) {
        WDContexte a = C0677k.m2779a(Rd[172], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5070a(wDObjet, str, str2, str3, str4, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoDroitServeur(WDObjet wDObjet, String str, String str2) {
        return hInfoDroitServeur(wDObjet, str, str2, 0);
    }

    public static final WDObjet hInfoDroitServeur(WDObjet wDObjet, String str, String str2, int i) {
        WDContexte a = C0677k.m2779a(Rd[88], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5133b(wDObjet, str, str2, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoDroitVue(WDObjet wDObjet, String str, String str2, String str3, String str4) {
        return hInfoDroitVue(wDObjet, str, str2, str3, str4, 0);
    }

    public static final WDObjet hInfoDroitVue(WDObjet wDObjet, String str, String str2, String str3, String str4, int i) {
        WDContexte a = C0677k.m2779a(Rd[100], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5135b(wDObjet, str, str2, str3, str4, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoFichier(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[110], true, true);
        try {
            WDObjet d = WDHF_Manager.m5182d(wDObjet, i);
            return d;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoFichier(WDObjet wDObjet, String str, int i) {
        WDContexte a = C0677k.m2779a(Rd[110], true, true);
        try {
            WDObjet a2 = WDHF_Manager.m5055a(wDObjet, str, i);
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoGroupe(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[141], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5257o(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDChaine hInfoMemo(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[8], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5186d(wDObjet, wDObjet2));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoProprieteBaseDeDonnees(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Ao], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5223g(wDObjet, str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoProprieteFichier(WDObjet wDObjet, String str, String str2, String str3) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Dt], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5069a(wDObjet, str, str2, str3));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoProprieteServeur(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[165], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5259p(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final String hInfoRubrique(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[14], true, true);
        try {
            String h;
            if (wDObjet2 instanceof C0548s) {
                h = WDHF_Manager.m5229h(wDObjet, wDObjet2.getInt());
            } else {
                h = WDHF_Manager.m5242k(wDObjet, wDObjet2);
                a.m2735v();
            }
            return h;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoSauvegarde(WDObjet wDObjet) {
        return hInfoSauvegarde(wDObjet, 0);
    }

    public static final WDObjet hInfoSauvegarde(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[78], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5233i(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoServeur(WDObjet wDObjet) {
        return hInfoServeur(wDObjet, C0607n.bx);
    }

    public static final WDObjet hInfoServeur(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[48], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5246l(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInfoUtilisateur(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[53], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5146b(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hInterditAccesBaseDeDonnees(WDObjet wDObjet) {
        return hInterditAccesBaseDeDonnees(wDObjet, null);
    }

    public static final WDObjet hInterditAccesBaseDeDonnees(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[111], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5240j(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLibere() {
        return hLibere(null);
    }

    public static WDBooleen hLibere(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[74], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5250m(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLiberePosition(int i) {
        WDContexte a = C0677k.m2779a(Rd[59], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5138b(i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLibereRequete() {
        return hLibereRequete(null);
    }

    public static WDBooleen hLibereRequete(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[157], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5264r(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeBaseDeDonnees(WDObjet wDObjet) {
        return hListeBaseDeDonnees(wDObjet, 256);
    }

    public static final WDObjet hListeBaseDeDonnees(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[126], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5258p(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeCle(WDObjet wDObjet) {
        return hListeCle(wDObjet, "", "", 256);
    }

    public static final WDObjet hListeCle(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hListeCle(wDObjet, "", "", wDObjet2.getInt()) : hListeCle(wDObjet, wDObjet2.getString(), "", 256);
    }

    public static final WDObjet hListeCle(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hListeCle(wDObjet, str, "", wDObjet2.getInt()) : hListeCle(wDObjet, str, wDObjet2.getString(), 256);
    }

    public static final WDObjet hListeCle(WDObjet wDObjet, String str, String str2, int i) {
        WDContexte a = C0677k.m2779a(Rd[154], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5189d(wDObjet, str, str2, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hListeConnexion() {
        return hListeConnexion(256);
    }

    public static WDChaine hListeConnexion(int i) {
        WDContexte a = C0677k.m2779a(Rd[57], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5165c(i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeElementStocke(WDObjet wDObjet) {
        return hListeElementStocke(wDObjet, 32);
    }

    public static final WDObjet hListeElementStocke(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[153], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5131b(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeFichier() {
        return hListeFichier("", "", 256);
    }

    public static final WDObjet hListeFichier(WDObjet wDObjet) {
        return wDObjet.checkType(C0548s.class) != null ? hListeFichier("", "", wDObjet.getInt()) : hListeFichier(wDObjet, C0611a.m2308b(256));
    }

    public static final WDObjet hListeFichier(WDObjet wDObjet, WDObjet wDObjet2) {
        if (wDObjet2.checkType(C0548s.class) == null) {
            return hListeFichier(wDObjet.getString(), wDObjet2.getString(), 256);
        }
        WDContexte a = C0677k.m2779a(Rd[136], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5241k(wDObjet, wDObjet2.getInt()));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeFichier(String str, String str2, int i) {
        WDContexte a = C0677k.m2779a(Rd[136], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5072a(str, str2, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeGroupe(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[99], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5281y(wDObjet));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeIndexFullText(WDObjet wDObjet) {
        return hListeIndexFullText(wDObjet, null, "", 256);
    }

    public static final WDObjet hListeIndexFullText(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hListeIndexFullText(wDObjet, null, "", wDObjet2.getInt()) : hListeIndexFullText(wDObjet, wDObjet2.getString(), "", 256);
    }

    public static final WDObjet hListeIndexFullText(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hListeIndexFullText(wDObjet, str, "", wDObjet2.getInt()) : hListeIndexFullText(wDObjet, str, wDObjet2.getString(), 256);
    }

    public static final WDObjet hListeIndexFullText(WDObjet wDObjet, String str, String str2, int i) {
        WDContexte a = C0677k.m2779a(Rd[146], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5203e(wDObjet, str, str2, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeLiaison() {
        return hListeLiaison(null, "", "", 256);
    }

    public static final WDObjet hListeLiaison(WDObjet wDObjet) {
        return wDObjet.checkType(C0548s.class) != null ? hListeLiaison(null, "", "", wDObjet.getInt()) : hListeLiaison(wDObjet, "", "", 256);
    }

    public static final WDObjet hListeLiaison(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hListeLiaison(wDObjet, "", "", wDObjet2.getInt()) : hListeLiaison(wDObjet, wDObjet2.getString(), "", 256);
    }

    public static final WDObjet hListeLiaison(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hListeLiaison(wDObjet, str, "", wDObjet2.getInt()) : hListeLiaison(wDObjet, str, wDObjet2.getString(), 256);
    }

    public static final WDObjet hListeLiaison(WDObjet wDObjet, String str, String str2, int i) {
        WDContexte a = C0677k.m2779a(Rd[98], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5068a(wDObjet, str, str2, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeMotVide(WDObjet wDObjet, String str) {
        return hListeMotVide(wDObjet, str, null, "");
    }

    public static final WDObjet hListeMotVide(WDObjet wDObjet, String str, String str2) {
        return hListeMotVide(wDObjet, str, str2, "");
    }

    public static final WDObjet hListeMotVide(WDObjet wDObjet, String str, String str2, String str3) {
        WDContexte a = C0677k.m2779a(Rd[143], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5170c(wDObjet, str, str2, str3));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeParametre() {
        return hListeParametre(null);
    }

    public static final WDObjet hListeParametre(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[89], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5166c(wDObjet));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hListeRubrique(WDObjet wDObjet) {
        return hListeRubrique(wDObjet, "", "", 256);
    }

    public static WDChaine hListeRubrique(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hListeRubrique(wDObjet, "", "", wDObjet2.getInt()) : hListeRubrique(wDObjet, wDObjet2.getString(), "", 256);
    }

    public static WDChaine hListeRubrique(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hListeRubrique(wDObjet, str, "", wDObjet2.getInt()) : hListeRubrique(wDObjet, str, wDObjet2.getString(), 256);
    }

    public static WDChaine hListeRubrique(WDObjet wDObjet, String str, String str2, int i) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.f1441Y], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5169c(wDObjet, str, str2, i));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeServeur(String str) {
        return hListeServeur(str, C1409j.f4184a);
    }

    public static final WDObjet hListeServeur(String str, int i) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.qj], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5071a(str, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeSynonyme(WDObjet wDObjet, String str) {
        return hListeSynonyme(wDObjet, str, null, "");
    }

    public static final WDObjet hListeSynonyme(WDObjet wDObjet, String str, String str2) {
        return hListeSynonyme(wDObjet, str, str2, "");
    }

    public static final WDObjet hListeSynonyme(WDObjet wDObjet, String str, String str2, String str3) {
        WDContexte a = C0677k.m2779a(Rd[156], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5204e(wDObjet, str, str2, str3));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeTache(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[87], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5238j(wDObjet));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeTriggerServeur(WDObjet wDObjet) {
        return hListeTriggerServeur(wDObjet, "");
    }

    public static final WDObjet hListeTriggerServeur(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[44], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5066a(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeUtilisateur(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[182], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5273u(wDObjet));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hListeUtilisateurConnecte(WDObjet wDObjet) {
        return hListeUtilisateurConnecte(wDObjet, null, null);
    }

    public static final WDObjet hListeUtilisateurConnecte(WDObjet wDObjet, String str) {
        return hListeUtilisateurConnecte(wDObjet, str, null);
    }

    public static final WDObjet hListeUtilisateurConnecte(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[C0538a.Lb], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5202e(wDObjet, str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLit(WDObjet wDObjet) {
        return hLit(wDObjet, 0, 0);
    }

    public static WDBooleen hLit(WDObjet wDObjet, long j) {
        return hLit(wDObjet, j, 0);
    }

    public static WDBooleen hLit(WDObjet wDObjet, long j, long j2) {
        WDContexte a = C0677k.m2779a(Rd[123], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5174c(wDObjet, j, j2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLitDernier() {
        return hLitDernier(null, null, 0);
    }

    public static WDBooleen hLitDernier(WDObjet wDObjet) {
        return hLitDernier(wDObjet, null, 0);
    }

    public static WDBooleen hLitDernier(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hLitDernier(wDObjet, wDObjet2, 0) : hLitDernier(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hLitDernier(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[185], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5177c(wDObjet, wDObjet2, true, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLitPrecedent() {
        return hLitPrecedent(null, null, 0);
    }

    public static WDBooleen hLitPrecedent(WDObjet wDObjet) {
        return hLitPrecedent(wDObjet, null, 0);
    }

    public static WDBooleen hLitPrecedent(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hLitPrecedent(wDObjet, wDObjet2, 0) : hLitPrecedent(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hLitPrecedent(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[106], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5101a(wDObjet, wDObjet2, true, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLitPremier() {
        return hLitPremier(null, null, 0);
    }

    public static WDBooleen hLitPremier(WDObjet wDObjet) {
        return hLitPremier(wDObjet, null, 0);
    }

    public static WDBooleen hLitPremier(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hLitPremier(wDObjet, wDObjet2, 0) : hLitPremier(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hLitPremier(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[80], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5145b(wDObjet, wDObjet2, true, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLitRecherche(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hLitRecherche(wDObjet, wDObjet2, wDObjet3, 0);
    }

    public static WDBooleen hLitRecherche(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, long j) {
        WDContexte a = C0677k.m2779a(Rd[91], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5144b(wDObjet, wDObjet2, wDObjet3, true, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLitRechercheDernier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hLitRechercheDernier(wDObjet, wDObjet2, wDObjet3, 0);
    }

    public static WDBooleen hLitRechercheDernier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, long j) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Uk], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5176c(wDObjet, wDObjet2, wDObjet3, true, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLitRecherchePremier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hLitRecherchePremier(wDObjet, wDObjet2, wDObjet3, 0);
    }

    public static WDBooleen hLitRecherchePremier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, long j) {
        WDContexte a = C0677k.m2779a(Rd[10], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5094a(wDObjet, wDObjet2, wDObjet3, true, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hLitSuivant() {
        return hLitSuivant(null, null, 0);
    }

    public static WDBooleen hLitSuivant(WDObjet wDObjet) {
        return hLitSuivant(wDObjet, null, 0);
    }

    public static WDBooleen hLitSuivant(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hLitSuivant(wDObjet, wDObjet2, 0) : hLitSuivant(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hLitSuivant(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[159], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5194d(wDObjet, wDObjet2, true, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hMaintenanceServeur(WDObjet wDObjet) {
        return hMaintenanceServeur(wDObjet, "");
    }

    public static final WDObjet hMaintenanceServeur(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[66], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5226g(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hMiseAJourCollection(WDObjet wDObjet, String str) {
        return hMiseAJourCollection(wDObjet, str, false);
    }

    public static final WDObjet hMiseAJourCollection(WDObjet wDObjet, String str, boolean z) {
        WDContexte a = C0677k.m2779a(Rd[94], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5116a(wDObjet, str, z));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hMiseAJourRequete(WDObjet wDObjet, String str) {
        return hMiseAJourRequete(wDObjet, str, false);
    }

    public static final WDObjet hMiseAJourRequete(WDObjet wDObjet, String str, boolean z) {
        WDContexte a = C0677k.m2779a(Rd[155], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5156b(wDObjet, str, z));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 hMode(int i) {
        return hMode(new WDChaine(C0607n.Vc), i, 1020);
    }

    public static WDEntier4 hMode(WDObjet wDObjet, int i) {
        return ((wDObjet instanceof eb) || !wDObjet.isNumerique()) ? hMode(wDObjet, i, 1020) : hMode(new WDChaine(C0607n.Vc), wDObjet.getInt(), i);
    }

    public static WDEntier4 hMode(WDObjet wDObjet, int i, int i2) {
        WDContexte a = C0677k.m2779a(Rd[168], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5051a(wDObjet, i, i2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hModifie() {
        return hModifie(null, 0, 0);
    }

    public static WDBooleen hModifie(WDObjet wDObjet) {
        return hModifie(wDObjet, 0, 0);
    }

    public static WDBooleen hModifie(WDObjet wDObjet, long j) {
        return hModifie(wDObjet, j, 0);
    }

    public static WDBooleen hModifie(WDObjet wDObjet, long j, long j2) {
        WDContexte a = C0677k.m2779a(Rd[121], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5088a(wDObjet, j, j2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieDroitBaseDeDonnees(WDObjet wDObjet, String str, String str2, String str3, String str4) {
        WDContexte a = C0677k.m2779a(Rd[184], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5153b(wDObjet, str, str2, str3, str4));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieDroitFichier(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5) {
        WDContexte a = C0677k.m2779a(Rd[68], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5154b(wDObjet, str, str2, str3, str4, str5));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieDroitServeur(WDObjet wDObjet, String str, String str2, String str3) {
        WDContexte a = C0677k.m2779a(Rd[131], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5197d(wDObjet, str, str2, str3));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieDroitVue(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5) {
        WDContexte a = C0677k.m2779a(Rd[189], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5114a(wDObjet, str, str2, str3, str4, str5));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieGroupe(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[125], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5248l(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieProprieteBaseDeDonnees(WDObjet wDObjet, String str, String str2, String str3) {
        WDContexte a = C0677k.m2779a(Rd[18], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5151b(wDObjet, str, str2, str3));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieProprieteFichier(WDObjet wDObjet, String str, String str2, String str3, String str4) {
        WDContexte a = C0677k.m2779a(Rd[63], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5113a(wDObjet, str, str2, str3, str4));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieProprieteServeur(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[1], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5196d(wDObjet, str, str2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hModifieStructure(WDObjet wDObjet) {
        return hModifieStructure(wDObjet, 0, null, "", "");
    }

    public static final WDBooleen hModifieStructure(WDObjet wDObjet, int i) {
        return hModifieStructure(wDObjet, i, null, "", "");
    }

    public static final WDBooleen hModifieStructure(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        return hModifieStructure(wDObjet, i, wDObjet2, "", "");
    }

    public static final WDBooleen hModifieStructure(WDObjet wDObjet, int i, WDObjet wDObjet2, String str) {
        return hModifieStructure(wDObjet, i, wDObjet2, str, "");
    }

    public static final WDBooleen hModifieStructure(WDObjet wDObjet, int i, WDObjet wDObjet2, String str, String str2) {
        WDBooleen wDBooleen = true;
        WDContexte a = C0677k.m2779a(Rd[15], true, true);
        try {
            String string = (wDObjet2 == null || wDObjet2.isValeurNull()) ? null : wDObjet2.getString();
            wDBooleen = new WDBooleen(WDHF_Manager.m5085a(wDObjet, i, string, str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hModifieUtilisateur(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[113], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5178c(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier8 hNbEnr() {
        return hNbEnr(null, 0);
    }

    public static WDEntier8 hNbEnr(WDObjet wDObjet) {
        return hNbEnr(wDObjet, 0);
    }

    public static WDEntier8 hNbEnr(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[9], true, true);
        try {
            WDEntier8 wDEntier8 = new WDEntier8(WDHF_Manager.m5160c(wDObjet, i));
            return wDEntier8;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier8 hNumEnr() {
        return hNumEnr(null);
    }

    public static WDEntier8 hNumEnr(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[90], true, true);
        try {
            WDEntier8 wDEntier8 = new WDEntier8(WDHF_Manager.m5198e(wDObjet));
            return wDEntier8;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hOuvre() {
        return hOuvre(null, null, 3);
    }

    public static WDBooleen hOuvre(WDObjet wDObjet) {
        return hOuvre(wDObjet, null, 3);
    }

    public static WDBooleen hOuvre(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.isNumerique() ? hOuvre(wDObjet, null, wDObjet2.getInt()) : hOuvre(wDObjet, wDObjet2, 3);
    }

    public static WDBooleen hOuvre(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDContexte a = C0677k.m2779a(Rd[C0538a.tb], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5193d(wDObjet, wDObjet2, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hOuvreConnexion(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[85], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5255o(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hOuvreConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4) {
        return hOuvreConnexion(wDObjet, str, str2, str3, str4, "", 3);
    }

    public static WDBooleen hOuvreConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5) {
        return hOuvreConnexion(wDObjet, str, str2, str3, str4, str5, 3);
    }

    public static WDBooleen hOuvreConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i) {
        WDContexte a = C0677k.m2779a(Rd[85], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5115a(wDObjet, str, str2, str3, str4, str5, i, "", 0));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hOuvreConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        return hOuvreConnexion(wDObjet, str, str2, str3, str4, str5, i, str6, 0);
    }

    public static WDBooleen hOuvreConnexion(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2) {
        WDContexte a = C0677k.m2779a(Rd[85], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5115a(wDObjet, str, str2, str3, str4, str5, i, str6, i2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hPasse(WDObjet wDObjet) {
        return hPasse(wDObjet, "");
    }

    public static final WDBooleen hPasse(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[148], true, true);
        try {
            Class.forName(Rd[36]).getMethod(Rd[C0536n.f1006y], new Class[]{String.class, String.class}).invoke(null, new Object[]{wDObjet.getString(), str});
        } catch (Exception e) {
            C0691a.m2857a(Rd[149], e);
        } catch (Throwable th) {
            a.m2735v();
        }
        WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5195d(wDObjet, str));
        a.m2735v();
        return wDBooleen;
    }

    public static WDEntier4 hPositionCourante() {
        return hPositionCourante(null, null, C0542t.f1184Z);
    }

    public static WDEntier4 hPositionCourante(WDObjet wDObjet) {
        return hPositionCourante(wDObjet, null, C0542t.f1184Z);
    }

    public static WDEntier4 hPositionCourante(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hPositionCourante(wDObjet, wDObjet2, C0542t.f1184Z) : hPositionCourante(wDObjet, null, wDObjet2.getInt());
    }

    public static WDEntier4 hPositionCourante(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDContexte a = C0677k.m2779a(Rd[102], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5158c(wDObjet, wDObjet2, i));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hPositionne(WDObjet wDObjet, int i) {
        return hPositionne(wDObjet, null, i, C0542t.f1184Z);
    }

    public static final WDObjet hPositionne(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        return wDObjet2.checkType(C0849z.class) != null ? hPositionne(wDObjet, wDObjet2, i, C0542t.f1184Z) : hPositionne(wDObjet, null, wDObjet2.getInt(), i);
    }

    public static final WDObjet hPositionne(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2) {
        WDContexte a = C0677k.m2779a(Rd[23], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5092a(wDObjet, wDObjet2, i, i2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hPrecedent() {
        return hPrecedent(null, null, 0);
    }

    public static WDBooleen hPrecedent(WDObjet wDObjet) {
        return hPrecedent(wDObjet, null, 0);
    }

    public static WDBooleen hPrecedent(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hPrecedent(wDObjet, wDObjet2, 0) : hPrecedent(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hPrecedent(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[C0538a.Nb], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5101a(wDObjet, wDObjet2, false, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hPremier() {
        return hPremier(null, null, 0);
    }

    public static WDBooleen hPremier(WDObjet wDObjet) {
        return hPremier(wDObjet, null, 0);
    }

    public static WDBooleen hPremier(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hPremier(wDObjet, wDObjet2, 0) : hPremier(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hPremier(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[151], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5145b(wDObjet, wDObjet2, false, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hPrioriteClient(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[119], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5207e(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hRAZGroupe() {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Nr], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5224g());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hRAZUtilisateur() {
        WDContexte a = C0677k.m2779a(Rd[61], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5230h());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hRaye() {
        return hRaye(null, 0, 0);
    }

    public static WDBooleen hRaye(WDObjet wDObjet) {
        return hRaye(wDObjet, 0, 0);
    }

    public static WDBooleen hRaye(WDObjet wDObjet, long j) {
        return hRaye(wDObjet, j, 0);
    }

    public static WDBooleen hRaye(WDObjet wDObjet, long j, int i) {
        WDContexte a = C0677k.m2779a(Rd[103], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5139b(wDObjet, j, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hRaz() {
        return hRaz(null, new WDChaine(C0607n.Vc));
    }

    public static WDBooleen hRaz(WDObjet wDObjet) {
        return hRaz(wDObjet, new WDChaine(C0607n.Vc));
    }

    public static WDBooleen hRaz(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[17], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5216f(wDObjet, wDObjet2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hRazClient() {
        WDContexte a = C0677k.m2779a(Rd[112], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5206e());
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hRecherche(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hRecherche(wDObjet, wDObjet2, wDObjet3, 0);
    }

    public static WDBooleen hRecherche(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, long j) {
        WDContexte a = C0677k.m2779a(Rd[73], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5144b(wDObjet, wDObjet2, wDObjet3, false, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hRechercheDernier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hRechercheDernier(wDObjet, wDObjet2, wDObjet3, 0);
    }

    public static WDBooleen hRechercheDernier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, long j) {
        WDContexte a = C0677k.m2779a(Rd[62], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5176c(wDObjet, wDObjet2, wDObjet3, false, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hRecherchePremier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hRecherchePremier(wDObjet, wDObjet2, wDObjet3, 0);
    }

    public static WDBooleen hRecherchePremier(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, long j) {
        WDContexte a = C0677k.m2779a(Rd[54], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5094a(wDObjet, wDObjet2, wDObjet3, false, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hReconnecte() {
        WDContexte a = C0677k.m2779a(Rd[104], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5213f());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hRecule() {
        return hRecule(null, null, 1, 0);
    }

    public static WDBooleen hRecule(WDObjet wDObjet) {
        return hRecule(wDObjet, null, 1, 0);
    }

    public static WDBooleen hRecule(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hRecule(wDObjet, wDObjet2, 1, 0) : _hRecule(wDObjet, (long) wDObjet2.getInt());
    }

    public static WDBooleen hRecule(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hRecule(wDObjet, wDObjet2, j, 0) : _hRecule(wDObjet, (long) wDObjet2.getInt(), (int) j);
    }

    public static WDBooleen hRecule(WDObjet wDObjet, WDObjet wDObjet2, long j, int i) {
        WDContexte a = C0677k.m2779a(Rd[116], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5093a(wDObjet, wDObjet2, j, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDChaine hRecupereEnregistrement() {
        return hRecupereEnregistrement(null, C0607n.Gc, C0607n.Gc);
    }

    public static WDChaine hRecupereEnregistrement(WDObjet wDObjet) {
        return hRecupereEnregistrement(wDObjet, C0607n.Gc, C0607n.Gc);
    }

    public static WDChaine hRecupereEnregistrement(WDObjet wDObjet, String str) {
        return hRecupereEnregistrement(wDObjet, str, C0607n.Gc);
    }

    public static WDChaine hRecupereEnregistrement(WDObjet wDObjet, String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[139], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5168c(wDObjet, str, str2));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hRecupereSauvegarde(WDObjet wDObjet, WDObjet wDObjet2, String str) {
        return hRecupereSauvegarde(wDObjet, wDObjet2, str, null);
    }

    public static final WDObjet hRecupereSauvegarde(WDObjet wDObjet, WDObjet wDObjet2, String str, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[4], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5097a(wDObjet, wDObjet2, str, wDObjet3));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 hReindexationEnCours() {
        return hReindexationEnCours(null, null);
    }

    public static final WDEntier4 hReindexationEnCours(WDObjet wDObjet) {
        return hReindexationEnCours(wDObjet, null);
    }

    public static final WDEntier4 hReindexationEnCours(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[31], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5228h(wDObjet, wDObjet2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hReindexe() {
        return hReindexe(null, 4, null, 80);
    }

    public static WDBooleen hReindexe(WDObjet wDObjet) {
        return hReindexe(wDObjet, 4, null, 80);
    }

    public static WDBooleen hReindexe(WDObjet wDObjet, int i) {
        return hReindexe(wDObjet, i, null, 80);
    }

    public static WDBooleen hReindexe(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        return hReindexe(wDObjet, i, wDObjet2, 80);
    }

    public static WDBooleen hReindexe(WDObjet wDObjet, int i, WDObjet wDObjet2, int i2) {
        WDContexte a = C0677k.m2779a(Rd[122], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5082a(wDObjet, i, wDObjet2, i2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hRestaureSauvegarde(WDObjet wDObjet, WDObjet wDObjet2) {
        return C0611a.m2298a(WDHF_Manager.m5143b(wDObjet, wDObjet2, null));
    }

    public static final WDObjet hRestaureSauvegarde(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return C0611a.m2298a(WDHF_Manager.m5143b(wDObjet, wDObjet2, wDObjet3));
    }

    public static final WDObjet hRestaureSauvegarde(WDObjet wDObjet, WDObjet wDObjet2, String str, WDObjet wDObjet3) {
        return wDObjet3.checkType(C1225d.class) != null ? C0611a.m2298a(WDHF_Manager.m5110a(wDObjet, wDObjet2.getString(), str, wDObjet3)) : C0611a.m2298a(WDHF_Manager.m5099a(wDObjet, wDObjet2, str, wDObjet3.getString(), null));
    }

    public static final WDObjet hRestaureSauvegarde(WDObjet wDObjet, WDObjet wDObjet2, String str, String str2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[47], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5099a(wDObjet, wDObjet2, str, str2, wDObjet3));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hRetourPosition(int i) {
        return hRetourPosition(i, 0);
    }

    public static WDBooleen hRetourPosition(int i, int i2) {
        WDContexte a = C0677k.m2779a(Rd[97], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5078a(i, i2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSauveParametre(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[65], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5105a(wDObjet, str, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 hSauvePosition() {
        return hSauvePosition(null, null);
    }

    public static WDEntier4 hSauvePosition(WDObjet wDObjet) {
        return hSauvePosition(wDObjet, null);
    }

    public static WDEntier4 hSauvePosition(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.Bs], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5237j(wDObjet, wDObjet2));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSauvegarde(WDObjet wDObjet, String str, String str2) {
        return hSauvegarde(wDObjet, str, str2, true, "", null);
    }

    public static final WDObjet hSauvegarde(WDObjet wDObjet, String str, String str2, boolean z) {
        return hSauvegarde(wDObjet, str, str2, z, "", null);
    }

    public static final WDObjet hSauvegarde(WDObjet wDObjet, String str, String str2, boolean z, String str3) {
        return hSauvegarde(wDObjet, str, str2, z, str3, null);
    }

    public static final WDObjet hSauvegarde(WDObjet wDObjet, String str, String str2, boolean z, String str3, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.hu], true, true);
        try {
            WDObjet b = C0611a.m2308b(WDHF_Manager.m5053a(wDObjet, str, str2, z, str3, wDObjet2));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSecurite(int i) {
        return hSecurite(null, i);
    }

    public static final WDObjet hSecurite(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[58], true, true);
        try {
            WDObjet b = C0611a.m2308b(WDHF_Manager.m5252n(wDObjet, i));
            return b;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSimuleReseau(int i) {
        return hSimuleReseau(null, i);
    }

    public static final WDObjet hSimuleReseau(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[79], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5268s(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hStatCalcule() {
        return hStatCalcule(null, null, 0);
    }

    public static final WDObjet hStatCalcule(WDObjet wDObjet) {
        return hStatCalcule(wDObjet, null, 0);
    }

    public static final WDObjet hStatCalcule(WDObjet wDObjet, WDObjet wDObjet2) {
        return hStatCalcule(wDObjet, wDObjet2, 0);
    }

    public static final WDObjet hStatCalcule(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDContexte a = C0677k.m2779a(Rd[171], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5209e(wDObjet, wDObjet2, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hStatDate() {
        return hStatDate(null, null);
    }

    public static final WDObjet hStatDate(WDObjet wDObjet) {
        return hStatDate(wDObjet, null);
    }

    public static final WDObjet hStatDate(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[145], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5200e(wDObjet, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hStatHeure() {
        return hStatHeure(null, null);
    }

    public static final WDObjet hStatHeure(WDObjet wDObjet) {
        return hStatHeure(wDObjet, null);
    }

    public static final WDObjet hStatHeure(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[84], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5234i(wDObjet, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hStatNbDoublon() {
        return hStatNbDoublon(null, null);
    }

    public static final WDObjet hStatNbDoublon(WDObjet wDObjet) {
        return hStatNbDoublon(wDObjet, null);
    }

    public static final WDObjet hStatNbDoublon(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[C0536n.f995G], true, true);
        try {
            WDObjet a2 = C0611a.m2303a(WDHF_Manager.m5222g(wDObjet, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hStatNbEnr() {
        return hStatNbEnr(null, null);
    }

    public static final WDObjet hStatNbEnr(WDObjet wDObjet) {
        return hStatNbEnr(wDObjet, null);
    }

    public static final WDObjet hStatNbEnr(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.oq], true, true);
        try {
            WDObjet a2 = C0611a.m2303a(WDHF_Manager.m5245l(wDObjet, wDObjet2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hStatNbEnrIntervalle(WDObjet wDObjet, WDObjet wDObjet2) {
        return hStatNbEnrIntervalle(wDObjet, null, null, wDObjet2);
    }

    public static final WDObjet hStatNbEnrIntervalle(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        return hStatNbEnrIntervalle(wDObjet, null, wDObjet2, wDObjet3);
    }

    public static final WDObjet hStatNbEnrIntervalle(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4) {
        WDContexte a = C0677k.m2779a(Rd[199], true, true);
        try {
            WDObjet a2 = C0611a.m2303a(WDHF_Manager.m5127b(wDObjet, wDObjet2, wDObjet3, wDObjet4));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hSubstRep(String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[95], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5121a(str, str2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hSuivant() {
        return hSuivant(null, null, 0);
    }

    public static WDBooleen hSuivant(WDObjet wDObjet) {
        return hSuivant(wDObjet, null, 0);
    }

    public static WDBooleen hSuivant(WDObjet wDObjet, WDObjet wDObjet2) {
        return ((wDObjet2 instanceof eb) || !wDObjet2.isNumerique()) ? hSuivant(wDObjet, wDObjet2, 0) : hSuivant(wDObjet, null, (long) wDObjet2.getInt());
    }

    public static WDBooleen hSuivant(WDObjet wDObjet, WDObjet wDObjet2, long j) {
        WDContexte a = C0677k.m2779a(Rd[70], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5194d(wDObjet, wDObjet2, false, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hSupprime() {
        return hSupprime(null, 0, 0);
    }

    public static WDBooleen hSupprime(WDObjet wDObjet) {
        return hSupprime(wDObjet, 0, 0);
    }

    public static WDBooleen hSupprime(WDObjet wDObjet, long j) {
        return hSupprime(wDObjet, j, 0);
    }

    public static WDBooleen hSupprime(WDObjet wDObjet, long j, long j2) {
        WDContexte a = C0677k.m2779a(Rd[192], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5140b(wDObjet, j, j2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSupprimeBaseDeDonnees(WDObjet wDObjet) {
        return hSupprimeBaseDeDonnees(wDObjet, null, 0);
    }

    public static final WDObjet hSupprimeBaseDeDonnees(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(C0548s.class) != null ? hSupprimeBaseDeDonnees(wDObjet, null, wDObjet2.getInt()) : hSupprimeBaseDeDonnees(wDObjet, wDObjet2.getString(), 0);
    }

    public static final WDObjet hSupprimeBaseDeDonnees(WDObjet wDObjet, String str, int i) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.jk], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5179c(wDObjet, str, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hSupprimeFichier(WDObjet wDObjet, String str) {
        return hSupprimeFichier(wDObjet, str, 0);
    }

    public static final WDBooleen hSupprimeFichier(WDObjet wDObjet, String str, int i) {
        WDContexte a = C0677k.m2779a(Rd[130], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5218f(wDObjet, str, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSupprimeGroupe(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[64], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5254n(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSupprimeParametre(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[41], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5272t(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hSupprimeRepertoire(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[26], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5278w(wDObjet, str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSupprimeSauvegarde(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[115], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5265r(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSupprimeTache(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[25], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5215f(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hSupprimeTout(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[83], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5080a(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSupprimeUtilisateur(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[46], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5251m(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hSurAppelServeur(int i) {
        return hSurAppelServeur(i, null, 0);
    }

    public static final WDObjet hSurAppelServeur(int i, C0486m c0486m) {
        return hSurAppelServeur(i, c0486m, 0);
    }

    public static final WDObjet hSurAppelServeur(int i, C0486m c0486m, int i2) {
        WDContexte a = C0677k.m2779a(Rd[12], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5079a(i, c0486m, i2));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hSurErreur(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[38], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5263q(wDObjet, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hSurErreur(WDObjet wDObjet, int i, C0486m c0486m) {
        WDContexte a = C0677k.m2779a(Rd[38], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5084a(wDObjet, i, c0486m));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hTransactionAnnule() {
        return hTransactionAnnule("");
    }

    public static final WDBooleen hTransactionAnnule(String str) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.kh], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5118a(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hTransactionDebut() {
        return hTransactionDebut(null, "");
    }

    public static final WDBooleen hTransactionDebut(String str) {
        return hTransactionDebut(str, "");
    }

    public static final WDBooleen hTransactionDebut(String str, String str2) {
        WDContexte a = C0677k.m2779a(Rd[105], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5181c(str, str2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hTransactionDebut(String str, String str2, String str3) {
        WDContexte a = C0677k.m2779a(Rd[105], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5122a(str, str2, str3));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hTransactionFin() {
        return hTransactionFin(null);
    }

    public static final WDBooleen hTransactionFin(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[180], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5275v(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hTransactionInterrompue() {
        return hTransactionInterrompue("");
    }

    public static final WDBooleen hTransactionInterrompue(String str) {
        WDContexte a = C0677k.m2779a(Rd[96], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5220f(str));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hTransactionIsolation(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[204], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5239j(wDObjet, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hTransactionLibere() {
        return hTransactionLibere(null, -1);
    }

    public static final WDBooleen hTransactionLibere(WDObjet wDObjet) {
        return hTransactionLibere(wDObjet, -1);
    }

    public static final WDBooleen hTransactionLibere(WDObjet wDObjet, long j) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.bx], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5208e(wDObjet, j));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDChaine hTransactionListe(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[C0607n.nn], true, true);
        try {
            WDChaine wDChaine = new WDChaine(WDHF_Manager.m5267s(wDObjet));
            return wDChaine;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen hTrouve() {
        return hTrouve(null);
    }

    public static WDBooleen hTrouve(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[158], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5253n(wDObjet));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDBooleen hVerifieInaltere() {
        return hVerifieInaltere(null, -1, null);
    }

    public static final WDBooleen hVerifieInaltere(WDObjet wDObjet) {
        return hVerifieInaltere(wDObjet, -1, null);
    }

    public static final WDBooleen hVerifieInaltere(WDObjet wDObjet, long j) {
        return hVerifieInaltere(wDObjet, j, null);
    }

    public static final WDBooleen hVerifieInaltere(WDObjet wDObjet, long j, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2779a(Rd[55], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5089a(wDObjet, j, wDObjet2));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static final WDEntier4 hVerifieIndex() {
        return hVerifieIndex(null, null, null);
    }

    public static final WDEntier4 hVerifieIndex(WDObjet wDObjet) {
        return hVerifieIndex(wDObjet, null, null);
    }

    public static final WDEntier4 hVerifieIndex(WDObjet wDObjet, WDObjet wDObjet2) {
        return wDObjet2.checkType(nb.class) != null ? hVerifieIndex(wDObjet, null, wDObjet2) : hVerifieIndex(wDObjet, wDObjet2, null);
    }

    public static final WDEntier4 hVerifieIndex(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[109], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5159c(wDObjet, wDObjet2, wDObjet3));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 hVerifieStructure(WDObjet wDObjet) {
        return hVerifieStructure(null, wDObjet.getInt());
    }

    public static WDEntier4 hVerifieStructure(WDObjet wDObjet, int i) {
        WDContexte a = C0677k.m2779a(Rd[81], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5249m(wDObjet, i));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static final WDObjet hVersFichier(WDObjet wDObjet, String str) {
        WDContexte a = C0677k.m2779a(Rd[49], true, true);
        try {
            WDObjet a2 = C0611a.m2298a(WDHF_Manager.m5266r(wDObjet, str));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    public static WDEntier4 hVersion(WDObjet wDObjet) {
        WDContexte a = C0677k.m2779a(Rd[118], true, true);
        try {
            WDEntier4 wDEntier4 = new WDEntier4(WDHF_Manager.m5123b(wDObjet));
            return wDEntier4;
        } finally {
            a.m2735v();
        }
    }

    public static WDBooleen herreurDoublon() {
        WDContexte a = C0677k.m2779a(Rd[11], true, true);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5191d());
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    public static void memoireVersFichier(WDObjet wDObjet, WDObjet wDObjet2) {
        WDContexte a = C0677k.m2775a(Rd[107]);
        try {
            ab abVar;
            if (wDObjet2.isSourceDonnees()) {
                C0776b sourceDonnees = ((C0776b) wDObjet2).getSourceDonnees();
                abVar = sourceDonnees instanceof db ? (db) sourceDonnees : null;
            } else {
                Object a2 = WDHF_Contexte.getInstance().m4991a(wDObjet2.getString(), false);
            }
            if (abVar == null) {
                WDErreurManager.m2883a(C0745b.m3222b(Rd[75], wDObjet2.getString()));
            }
            C0718g c0718g = (C0718g) wDObjet.checkType(C0718g.class);
            if (c0718g != null) {
                c0718g.binderFichier(abVar, false);
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(Rd[77], new String[0]));
            }
            a.m2735v();
        } catch (Throwable th) {
            a.m2735v();
        }
    }

    public static final WDBooleen sqlTransaction(int i, WDObjet wDObjet) {
        WDContexte a = C0677k.m2775a(Rd[101]);
        try {
            WDBooleen wDBooleen = new WDBooleen(WDHF_Manager.m5081a(wDObjet, i));
            return wDBooleen;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: z */
    private static String m1631z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 31;
                    break;
                case 1:
                    i2 = 112;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1632z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 59);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet m1633a(WDObjet wDObjet) {
        return m1635a(wDObjet, "", 0);
    }

    /* renamed from: a */
    public WDObjet m1634a(WDObjet wDObjet, String str) {
        return m1635a(wDObjet, str, 0);
    }

    /* renamed from: a */
    public WDObjet m1635a(WDObjet wDObjet, String str, int i) {
        WDContexte a = C0677k.m2779a(Rd[39], true, true);
        try {
            WDObjet a2 = C0611a.m2300a(WDHF_Manager.m5188d(wDObjet, str, i));
            return a2;
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: a */
    public WDBooleen m1636a() {
        return hAnnuleDeclaration(null);
    }

    /* renamed from: a */
    public void m1637a(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        m1638a(wDObjet, i, null, wDObjet2);
    }

    /* renamed from: a */
    public void m1638a(WDObjet wDObjet, int i, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDContexte a = C0677k.m2779a(Rd[173], true, true);
        try {
            WDHF_Manager.m5083a(wDObjet, i, wDObjet2, wDObjet3);
        } finally {
            a.m2735v();
        }
    }

    /* renamed from: b */
    public WDObjet m1639b() {
        return m1635a(null, "", 0);
    }
}
