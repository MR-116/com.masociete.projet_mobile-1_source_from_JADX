package fr.pcsoft.wdjava.database.hf;

import android.support.v4.view.InputDeviceCompat;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0539d;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.utils.ec;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.database.hf.p049c.C0843d;
import fr.pcsoft.wdjava.database.hf.p049c.C0844e;
import fr.pcsoft.wdjava.database.hf.p049c.C0845h;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJNIHelper;
import fr.pcsoft.wdjava.jni.WDJaugeJNI;
import java.math.BigDecimal;
import java.util.Iterator;

public class WDHF implements C0832f {
    /* renamed from: z */
    private static final String[] f2212z = new String[]{m4583z(m4584z("R*(o`L\u0005-LmY&$H")), m4583z(m4584z("R*(tIQ75YUY6 Q`L6$")), m4583z(m4584z("R*(tHQ7$}OW13n`I1$H`")), m4583z(m4584z("R*(oTt\u00143YhQ!3")), m4583z(m4584z("R*(tDV*4P`y((]v")), m4583z(m4584z("R*(oTt\u0016$Mp]0$")), m4583z(m4584z("R*({`L\b RbM!\u0005YfJ-5")), m4583z(m4584z("R*(tLV\".xwW-5o`J2$Iw")), m4583z(m4584z("R*(t@@!\"Iq]\u0016$Mp]0$oTt")), m4583z(m4584z("R*(tW]'.Rk]'5Y")), m4583z(m4584z("R*(tS]6(Zl]\u00175NpL13Y")), m4583z(m4584z("R*(tKZ\u0001/N")), m4583z(m4584z("R*(tGT+0I`v1,ykJ")), m4583z(m4584z("R*(t@L%5")), m4583z(m4584z("R*(oTt\u00013N`M6")), m4583z(m4584z("R*(pjY \tz")), m4583z(m4584z("R*(oTt\n#jT")), m4583z(m4584z("R*(tCQ(5N`k03Uk_\u00175NlV#")), m4583z(m4584z("J!0c")), m4583z(m4584z("R*(t@@!\"Iq]\u0016$Mp]0$")), m4583z(m4584z("R*(oTt\u0001/jM62")), m4583z(m4584z("R*({`L\u00143Suj1#NlI1$~jW($]k")), m4583z(m4584z("R*({`L\n.QJJ-&Uk]\u00164^wQ54Y")), m4583z(m4584z("R*(tLV\".iqQ((OdL!4N")), m4583z(m4584z("R*(tUY72Y")), m4583z(m4584z("R*(tB]6$o`J2$Iw")), m4583z(m4584z("R*(tIQ75YCQ')U`J")), m4583z(m4584z("R*(zw]!\tzFW*5Y}L")), m4583z(m4584z("R*(tW]'4L`J!\u0012]pN!&]w\\!")), m4583z(m4584z("R*(tQJ%/Od[0(Sk~-/")), m4583z(m4584z("R*(tVL%5rg}*3ukL!3JdT($")), m4583z(m4584z("R*(tQJ%/Od[0(Skt-#Yw]")), m4583z(m4584z("R*(plZ!3Ywq \u0013IgJ-0I`")), m4583z(m4584z("R*(tWY>")), m4583z(m4584z("R*(plZ!3Ywq \u0007UfP-$N")), m4583z(m4584z("R*(tIQ0\u0011N`[!%YkL")), m4583z(m4584z("R*(tIQ0\u0012IlN%/H")), m4583z(m4584z("R*(oTt\u00103]kK%\"HlW*\u0012Iw{+/R`@-.R")), m4583z(m4584z("R*(tUJ-.NlL!\u0002Pl]*5")), m4583z(m4584z("R*(tD[0(J`~--Hw]")), m4583z(m4584z("R*(tHW (Zl]\u00143SuJ-$H`z%2YA]\u0000.Rk]!2")), m4583z(m4584z("R*(tB]6$xjM&-Sk")), m4583z(m4584z("R*(o`L\u00164^wQ54YCT+ H")), m4583z(m4584z("R*(oTt\t$O@J6$Iw")), m4583z(m4584z("R*(tCQ(5N`{+,Q`V'$ldJ\u0006(R")), m4583z(m4584z("R*(tA]&-StM!\u0007UfP-$N")), m4583z(m4584z("R*(tVQ)4P`j!2YdM")), m4583z(m4584z("R*(oTt\b(HFW(")), m4583z(m4584z("R*(tIQ75YPL--UvY0$Iw")), m4583z(m4584z("R*(tVM41NlU!\u0014HlT-2]q]13")), m4583z(m4584z("R*(tIQ75YFT!")), m4583z(m4584z("R*(tLV\".lwW43U`L!\u0003]v]\u0000$xjV*$Yv")), m4583z(m4584z("R*(tLV\".zl[,(Yw")), m4583z(m4584z("R*({`L\n.QUP=2UtM!")), m4583z(m4584z("R*({`L\u00143Su~-\"Tl]6\u0003SjT")), m4583z(m4584z("R*(oTt\t.Xl^-$")), m4583z(m4584z("R*(tVM-7]kL")), m4583z(m4584z("R*(tUJ!\"Ya]*5")), m4583z(m4584z("R*(tCl\b(Oq]\t.H")), m4583z(m4584z("R*(tCQ(5N`q $RqQ54Y")), m4583z(m4584z("R*({`L\u00164^wQ54YCT+ H")), m4583z(m4584z("R*(tA]7 _qQ2$zlT03Y")), m4583z(m4584z("R*(o`L\u00164^wQ54YLV0$[`J")), m4583z(m4584z("R*(uvv1-P")), m4583z(m4584z("R*(tLV\".~iW' [`{+/R`@-.R")), m4583z(m4584z("R*(o`L\u00164^wQ54YGA0$}wJ%8")), m4583z(m4584z("R*(tA]'3Uql6([b]6\u0012YwN!4N")), m4583z(m4584z("R*(o`L\f\u0002Pl]*5")), m4583z(m4584z("R*(tA]'.Rk]'5YFT-$Rq")), m4583z(m4584z("R*(tIQ75Y@T!,YkL\u00175SfS!")), m4583z(m4584z("R*(tHW $hjM7")), m4583z(m4584z("R*(tLV\".~iW' [`")), m4583z(m4584z("R*(tVM&2HW]4")), m4583z(m4584z("R*(tIQ75YWM&3UtM!")), m4583z(m4584z("R*(oTt\u0010(Hw]\u0007.P")), m4583z(m4584z("R*(tHW (Zl]\u00143SuJ-$H`k!3J`M6")), m4583z(m4584z("R*(o`L\u00164^wQ54YIW*&")), m4583z(m4584z("R*({`L\u00164^wQ54YIW*&")), m4583z(m4584z("R*({`L\u00164^wQ54YGA0$")), m4583z(m4584z("R*(tLV\".npZ6(Mp]")), m4583z(m4584z("R*(tJM23YDV%-Ev]")), m4583z(m4584z("R*(o`L\u00164^wQ54YAW1#P`")), m4583z(m4584z("R*(tHW $")), m4583z(m4584z("R*({`L\u00164^wQ54YVL6(Rb")), m4583z(m4584z("R*({`L\u00164^wQ54YVP+3H")), m4583z(m4584z("L%#P`n-3HpY(\fSs]")), m4583z(m4584z("R*(tVL%5rg|+4^iW*")), m4583z(m4584z("R*(tJM23YFW*/Y}Q+/")), m4583z(m4584z("_!5rg}*3kmQ($zlT((Rb")), m4583z(m4584z("R*({`L\u00143Suj1#NlI1$pjV#")), m4583z(m4584z("R*(tIQ75YGY7$x`|+/R`]7")), m4583z(m4584z("R*(t@V2.U`u!2Od_!\u0017YwK\u0007-U`V0")), m4583z(m4584z("R*(tLV\".xwW-5zl[,(Yw")), m4583z(m4584z("R*({`L\r%npZ6(Mp]\f\u0007")), m4583z(m4584z("R*(tFP%/[`v+,")), m4583z(m4584z("R*(tCQ(5N`z-/oqJ-/[")), m4583z(m4584z("R*(tVM41NlU!\u0015]fP!")), m4583z(m4584z("R*(tVY17YUW7(HlW*")), m4583z(m4584z("R*(tW]75]pJ!\u0012]pN!&]w\\!")), m4583z(m4584z("R*(t@J6$Iwz(._d_!")), m4583z(m4584z("R*(oTt\u0007.Rk]'5Y")), m4583z(m4584z("R*(tS]62zl[,(Yw")), m4583z(m4584z("R*({`L\n.Is](\u0004Rw]#(OqJ!,YkL")), m4583z(m4584z("R*(tFP%/[`{+/R`@-.RQW12")), m4583z(m4584z("R*(tDT- OQW12")), m4583z(m4584z("R*(oTt\u0006 O`")), m4583z(m4584z("R*(tLV\".xwW-5jp]")), m4583z(m4584z("R*(tIQ75YLV $DCM(-h`@0")), m4583z(m4584z("R*(tUW7(HlW*\u0002SpJ%/H`")), m4583z(m4584z("R*(tIQ75YPL--UvY0$Iw{+/R`[0$")), m4583z(m4584z("R*(tIQ&$N`")), m4583z(m4584z("R*(tQJ%/Od[0(Sk|!#Iq")), m4583z(m4584z("R*(tS]6(Zl]\r/]iL!3Y")), m4583z(m4584z("R*({`L\u00143Su~-\"Tl]6\u0012HwQ*&")), m4583z(m4584z("R*(tVY17YUY6 Q`L6$")), m4583z(m4584z("R*(tLU4.Nq]\u0010$Dq]")), m4583z(m4584z("R*(o`L\u0012 NlY&-YM~")), m4583z(m4584z("R*(tVM41NlU!\u0003]v]\u0000$xjV*$Yv")), m4583z(m4584z("R*(tFJ!$hwQ#&Ywk!3J`M6")), m4583z(m4584z("R*(tDR+4H`6.Iu]")), m4583z(m4584z("R*(tQJ%/Od[0(Skq7.PdL-.R")), m4583z(m4584z("R*(tA]7 _qQ2$hwQ#&Ywk!3J`M6")), m4583z(m4584z("R*(tLV\".o`J2$Iw")), m4583z(m4584z("R*(tHW (Zl]\u00003SlL\u0006 O`|!\u0005SkV!$O")), m4583z(m4584z("R*(tLV\".odM2$[dJ $")), m4583z(m4584z("R*(tVY17YbY6%Y")), m4583z(m4584z("R*(t@@4.Nq]\u001c\fp")), m4583z(m4584z("R*(t@V6$[lK03Yh]*5j`J7\u0019qI")), m4583z(m4584z("R*(tCQ')U`J\u00019UvL!")), m4583z(m4584z("R*(tIQ75YIQ%(OjV")), m4583z(m4584z("R*(tA]'-]w]\u00019H`J*$iY72Uf")), m4583z(m4584z("R*(tIQ75YBJ+4L`")), m4583z(m4584z("R*(o`L\u00164^wQ54YGA0$")), m4583z(m4584z("R*(tHW (Zl]")), m4583z(m4584z("R*(tFP%/[`j!1")), m4583z(m4584z("R*(tQJ%/Od[0(Sky*/Ii]")), m4583z(m4584z("R*(tLV\".xwW-5~dK!\u0005YAW*/Y`K")), m4583z(m4584z("R*(tB]6$hwY*2]fL-.RQW12")), m4583z(m4584z("R*(tVM41NlU!\u0012]pN!&]w\\!")), m4583z(m4584z("R*(tS]62npZ6(Mp]")), m4583z(m4584z("R*(oTt\u00174UsY*5")), m4583z(m4584z("R*(tA]03IlL\u00103Ub_!3o`J2$Iw")), m4583z(m4584z("R*({`L\u00164^wQ54YLV0$[`J")), m4583z(m4584z("R*(tDV*4P`j!\"T`J')Y")), m4583z(m4584z("R*(tC]6,Y")), m4583z(m4584z("R*(tFW4(YCQ')U`J")), m4583z(m4584z("R*(o`L\u00164^wQ54YVL6(Rb")), m4583z(m4584z("R*(tIQ75YVA*.R|U!")), m4583z(m4584z("R*(oTt\u0014.OlL-.Rk]")), m4583z(m4584z("R*({`L\b RbM!")), m4583z(m4584z("R*(tHW (Zl]\u00175Np[04N`")), m4583z(m4584z("R*(tLV0$NaQ0\u0000_f]7\u0003]v]\u0000$xjV*$Yv")), m4583z(m4584z("R*(tA]'-]w]\u00019H`J*$V")), m4583z(m4584z("R*(tB]6$ukL!&NlL!")), m4583z(m4584z("R*(o`L\u00073YdL-.RDM0.zl[,(Yw|+/R`]7")), m4583z(m4584z("R*({`L\u00164^wQ54YGW+-YdV")), m4583z(m4584z("R*(tVM41NlU!")), m4583z(m4584z("R*(tC]6,YFW*/Y}Q+/")), m4583z(m4584z("R*(tFW*2HwM-5jdT\u0007-Y")), m4583z(m4584z("}63YpJd%Y%[(.Rd_!aX\"M*$\u001cfT%2O`\u0018 f]f[¬2\u001cå\u0018\f\u0007\u0012")), m4583z(m4584z("R*(t@J6$Iwu+5x`h%2O`")), m4583z(m4584z("R*({`L\u00143Suj1#NlI1$oqJ-/[")), m4583z(m4584z("R*(tWY=$")), m4583z(m4584z("R*(oTt\u0007.PjV*$\u0014QY&-Y,")), m4583z(m4584z("R*(tLV\".lwW43U`L!\u0007UfP-$N")), m4583z(m4584z("R*(oTt\b(HH]).")), m4583z(m4584z("R*(tIQ0\u0011N`U-$N")), m4583z(m4584z("R*(tIQ0\u0005YwV-$N")), m4583z(m4584z("R*(oTt\u0000$NkQ!3")), m4583z(m4584z("R*(tCQ(5N`z-/~lV")), m4583z(m4584z("R*(oTt\u0007.P")), m4583z(m4584z("R*(tDN%/_`")), m4583z(m4584z("R*(tW]'4P`")), m4583z(m4584z("R*(o`L\u00164^wQ54YVP+3H")), m4583z(m4584z("R*({`L\r%jV*$DlW*\tz")), m4583z(m4584z("R*(tVM41NlU!\u0002SiT!\"HlW*")), m4583z(m4584z("R*({`L\f\u0004RA],.Nv")), m4583z(m4584z("R*(plZ!3Ywq \u0002SkV!9UjV")), m4583z(m4584z("R*(tFP%/[`j!1oTt")), m4583z(m4584z("R*({`J!\thwY*2]fL-.R")), m4583z(m4584z("R*(tVL%5rg}*3")), m4583z(m4584z("R*(tAM4-UtM!\u0003]v]\u0000$xjV*$Yv")), m4583z(m4584z("R*(tVM41NlU!\u0015SpL")), m4583z(m4584z("R*(tW]'4L`J!\u0013IgJ-0I`")), m4583z(m4584z("R*(uv}63YpJ\u0002 HdT!")), m4583z(m4584z("R*(tW]-/X`@!")), m4583z(m4584z("R*(tIQ0")), m4583z(m4584z("R*(t@@!\"Iq]\u00143Sf] 4N`")), m4583z(m4584z("R*({`L\n.QWM&3UtM!")), m4583z(m4584z("R*(tHW (Zl]\u00033SpH!")), m4583z(m4584z("R*(o`L\u00164^wQ54YGW+-YdV")), m4583z(m4584z("R*(tVM41NlU!\u0013Yu]65SlJ!")), m4583z(m4584z("R*(t@J6$Iw|+4^iW*")), m4583z(m4584z("R*(oTt\u00019Yf")), m4583z(m4584z("R*(t@V6$[lK03Yh]*5j`J7\u000boJv")), m4583z(m4584z("R*(tFJ! HlW*")), m4583z(m4584z("R*(tLU4.Nq]\u000e\u0012sK")), m4583z(m4584z("R*(oTt\r/Zj!/Y")), m4583z(m4584z("R*(tIQ75YV]67YpJ")), m4583z(m4584z("R*(tA]'3Uq{+/R`@-.R")), m4583z(m4584z("R*(t@J6$Iw")), m4583z(m4584z("R*(tVM41NlU!\u0007UfP-$N")), m4583z(m4584z("R*(tIQ75YQY')Y")), m4583z(m4584z("R*(tLV\".lwW43U`L!\u0012YwN!4N")), m4583z(m4584z("R*(tW]0.Iwh+2UqQ+/")), m4583z(m4584z("R*(tHW (Zl]\u00115UiQ7 H`M6")), m4583z(m4584z("R*({`L\u00164^wQ54YAW1#P`")), m4583z(m4584z("R*(tWY>\u0014HlT-2]q]13")), m4583z(m4584z("R*(oTt\u0007.PjV*$\u0014W]5h")), m4583z(m4584z("R*(tWY>\u0002Pl]*5")), m4583z(m4584z("R*(tDT- O")), m4583z(m4584z("R*(oTt\u0002$Nh]")), m4583z(m4584z("Q7\u0002]k-7YKZ\u0001/NRP--YCQ(-Uk_")), m4583z(m4584z("Q7\u000f^@V6\u000fY`\\\u0014 Nv]")), m4583z(m4584z("R*(tHQ7$}OW13jT($_qQ+/")), m4583z(m4584z("R*(tDV*4P`k%4J`_%3X`")), m4583z(m4584z("R*(tWy\u001e\u0006NjM4$")), m4583z(m4584z("R*(tQJ%/Od[0(Skq*5YwJ+,Lp]")), m4583z(m4584z("R*(oTt\u00057]k[!")), m4583z(m4584z("R*(tLV\".{wW11Y")), m4583z(m4584z("R*(tVL%5t`M6$")), m4583z(m4584z("R*({`L\n.QCQ')U`J\u00164^wQ54Y")), m4583z(m4584z("R*(tVL%5dT'4P`")), m4583z(m4584z("R*(tIQ0\u0013YfP!3_m]\u0000$NkQ!3")), m4583z(m4584z("R*(tIQ0\u0013YfP!3_m]\u00143YhQ!3")), m4583z(m4584z("R*(oTt\u00103]kK%\"HlW*")), m4583z(m4584z("R*(tCQ(5N`{+,LwQ7\u0004RqJ!")), m4583z(m4584z("R*(oTt\n#pl_")), m4583z(m4584z("R*(oTt\u0016$_pH\u0001/jM62")), m4583z(m4584z("R*(t@[6(H")), m4583z(m4584z("R*(tDR+4H`m0(PlK%5YpJ")), m4583z(m4584z("R*(tFP%/[`u+5x`h%2O`")), m4583z(m4584z("R*(oTt\u0007.Rk]<(Sk")), m4583z(m4584z("R*(tVM41NlU!\u0013YtM!5Y")), m4583z(m4584z("R*(tUY72YVi\b")), m4583z(m4584z("R*({`L\u00108L`j1#NlI1$")), m4583z(m4584z("R*(tFJ! HlW*\u0012ULV!9UvL%/H")), m4583z(m4584z("R*({`L\f\u0015NjM2$")), m4583z(m4584z("R*(tHW (Zl]\u00003SlL\u0017$Ns]13")), m4583z(m4584z("R*({`L\u00143Su~-\"Tl]6\rSk_")), m4583z(m4584z("R*(tHY-/H`V%/_`k!3J`M6")), m4583z(m4584z("R*(tAY0$ykJ!&")), m4583z(m4584z("R*(tVM41NlU!\u0011]wY)$Hw]")), m4583z(m4584z("R*(tUW7(HlW*/Y")), m4583z(m4584z("R*(tW]')Yw[,$x`J*(Yw")), m4583z(m4584z("R*(tW]')Yw[,$lw])(Yw")), m4583z(m4584z("R*(tCQ(5N`{+,Q`V'$ldJ")), m4583z(m4584z("R*(oTt\b(Oq]\u0010 ^i]7")), m4583z(m4584z("R*(tIQ75YQJ-&[`J\u0017$Ns]13")), m4583z(m4584z("R*(tHW (Zl]\u00003SlL\u0002(_mQ!3")), m4583z(m4584z("R*(tV]'4NlL!")), m4583z(m4584z("R*({`L\u0012 NlY&-YM~")), m4583z(m4584z("R*(tCQ*\bRq]6%Uqy'\"Yvz%2YA]\u0000.Rk]!2")), m4583z(m4584z("R*(oTt\u00143Yf] $Rq")), m4583z(m4584z("R*(tAZ#")), m4583z(m4584z("R*(tDR+4H`")), m4583z(m4584z("R*({`L\r%zl[,(Ywp\u0002")), m4583z(m4584z("R*(tW]-/X`@%5UjV\u0001/jM62")), m4583z(m4584z("R*({`L\u00164^wQ54YGA0$}wJ%8")), m4583z(m4584z("R*(tVM41NlU!\u0006NjM4$")), m4583z(m4584z("R*(tUJ-.NlL!")), m4583z(m4584z("R*(tCQ(5N`q $RqQ54YGQ*")), m4583z(m4584z("R*(tCW6\"Y@[6(HpJ!")), m4583z(m4584z("R*(tD[0(J`l6([b]6\u0012YwN!4N")), m4583z(m4584z("R*(tB]6$d[,$")), m4583z(m4584z("R*(oTt\u0000$_jV*$_q]")), m4583z(m4584z("R*(tHW (Zl]\u00143SuJ-$H`~-\"Tl]6")), m4583z(m4584z("R*(tCQ(5N`k03Uk_\u0006(R")), m4583z(m4584z("R*(oTt\b(HH]).h`@0$")), m4583z(m4584z("R*(tFP%3[`h%3]h]03Y")), m4583z(m4584z("R*(tFP%/[`{($")), m4583z(m4584z("R*(tB]6$q`U+")), m4583z(m4584z("R*(tLV\".}kY(8O`")), m4583z(m4584z("R*(t@J6$Iwq*5YbJ-5Y")), m4583z(m4584z("R*(tDV*4P`|!\"PdJ%5UjV")), m4583z(m4584z("R*(tVL%5xdL!")), m4583z(m4584z("R*(o`L\u0012 P`M6\u000fIiT")), m4583z(m4584z("R*(tIQ&$N`h+2UqQ+/")), m4583z(m4584z("R*(tCQ(5N`")), m4583z(m4584z("R*(tFW)1]w]\u00164^wQ54Y")), m4583z(m4584z("R*(tS]6(Zl]\r/X`@")), m4583z(m4584z("R*(oTt\u0001/x`P+3O")), m4583z(m4584z("R*({`L\r%npZ6(Mp]\u0016$Mp]0$")), m4583z(m4584z("R*(tJM23Y")), m4583z(m4584z("R*(tUJ!,U`J")), m4583z(m4584z("R*(tA]6/U`J")), m4583z(m4584z("R*(tLV\".q`U+")), m4583z(m4584z("R*(tIQ75YHW0\u0017Ua]")), m4583z(m4584z("R*(tHW (Zl]\u00175Np[04N`l+4O")), m4583z(m4584z("R*(tS]62UjV")), m4583z(m4584z("R*(tGT+0I`~-\"Tl]6")), m4583z(m4584z("R*(tHW (Zl]\u00003SlL\u00124Y")), m4583z(m4584z("R*(t@@4.Nq]\u000e\u0012sK")), m4583z(m4584z("R*(tFP%/[`{+/R`@-.R")), m4583z(m4584z("R*(tQJ%/Od[0(Skt-2H`")), m4583z(m4584z("R*(tDL0 _m]\t$Qj")), m4583z(m4584z("R*(t@J6$Iwq*'S"))};
    /* renamed from: a */
    protected long f2213a;

    static {
        try {
            WDJNIHelper.m6615a(false);
            if (loadHF()) {
                WDProjet instance = WDProjet.getInstance();
                setAlphabet(ec.m3869a(instance.getCharset()));
                instance.ajouterEcouteurProjet(new C0863p());
                if (instance.isCreationAutoFichierDonnees()) {
                    setCreationAutoFichierDonnees();
                    return;
                }
                return;
            }
            WDErreurManager.m2883a(WDJNIHelper.m6568a());
        } catch (C0841b e) {
            throw e;
        } catch (C0539d e2) {
            WDErreurManager.m2875a(e2);
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
        }
    }

    public WDHF() {
        this.f2213a = 0;
        this.f2213a = jniHFContext();
        if (this.f2213a == 0) {
            WDErreurManager.m2883a(WDJNIHelper.jniMessageErreur());
        }
    }

    public static native void jniSetAlphabet(int i);

    public static native void jniSetCreationAutoFichierDonnees();

    public static boolean loadHF() throws C0841b, WDJNIException {
        try {
            return WDJNIHelper.jniLoadHF();
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[15], e);
        }
    }

    /* renamed from: p */
    private long m4582p(String str) throws C0841b, WDJNIException {
        try {
            return jniGetIdFichierHF(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[256], e);
        }
    }

    public static void setAlphabet(int i) throws C0841b, WDJNIException {
        try {
            jniSetAlphabet(i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[0], e);
        }
    }

    public static void setCreationAutoFichierDonnees() throws C0841b, WDJNIException {
        try {
            jniSetCreationAutoFichierDonnees();
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[154], e);
        }
    }

    /* renamed from: z */
    private static String m4583z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 56;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 65;
                    break;
                case 3:
                    i2 = 60;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m4584z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 5);
        }
        return toCharArray;
    }

    /* renamed from: A */
    public boolean mo2762A(long j) throws C0841b, WDJNIException {
        try {
            return jniHActiveFiltre(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[39], e);
        }
    }

    /* renamed from: B */
    public long mo2763B(long j) throws C0841b, WDJNIException {
        try {
            return jniHNumEnr(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[11], e);
        }
    }

    /* renamed from: C */
    public boolean mo2764C(long j) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeTout(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[182], e);
        }
    }

    /* renamed from: D */
    public boolean mo2765D(long j) throws C0841b, WDJNIException {
        try {
            return jniHDebloqueFichier(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[45], e);
        }
    }

    /* renamed from: E */
    public boolean mo2766E(long j) throws C0841b, WDJNIException {
        try {
            return jniHAnnuleDeclaration(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.vk], e);
        }
    }

    /* renamed from: F */
    public String mo2767F(long j) throws C0841b, WDJNIException {
        try {
            return jniHListeTache(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Ug], e);
        }
    }

    /* renamed from: G */
    public String mo2768G(long j) throws C0841b, WDJNIException {
        try {
            return jniHListeUtilisateur(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[48], e);
        }
    }

    /* renamed from: H */
    public C0845h mo2769H(long j) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: I */
    public boolean mo2770I(long j) throws C0841b, WDJNIException {
        try {
            return jniHAjouteUtilisateur(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.no], e);
        }
    }

    /* renamed from: J */
    public long[] m4594J(long j) throws C0841b, WDJNIException {
        try {
            return jniGetIdRubriqueRequete(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[282], e);
        }
    }

    /* renamed from: K */
    public byte[] m4595K(long j) throws WDJNIException {
        try {
            return jniGetRubriqueByteArray(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[258], e);
        }
    }

    /* renamed from: L */
    public int m4596L(long j) throws WDJNIException {
        try {
            return jniGetRubriqueInteger(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0536n.f995G], e);
        }
    }

    /* renamed from: M */
    public short m4597M(long j) throws WDJNIException {
        try {
            return jniGetRubriqueShort(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[84], e);
        }
    }

    /* renamed from: N */
    public long m4598N(long j) throws WDJNIException {
        try {
            return jniGetRubriqueLong(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[77], e);
        }
    }

    /* renamed from: O */
    public byte m4599O(long j) throws WDJNIException {
        try {
            return jniGetRubriqueByte(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[78], e);
        }
    }

    /* renamed from: P */
    public double m4600P(long j) throws WDJNIException {
        try {
            return jniGetRubriqueDouble(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.me], e);
        }
    }

    /* renamed from: Q */
    public String m4601Q(long j) throws C0841b, WDJNIException {
        try {
            return jniGetNomOrigineRubrique(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[22], e);
        }
    }

    /* renamed from: R */
    public int m4602R(long j) throws C0841b, WDJNIException {
        try {
            return jniGetTypeRubrique(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[235], e);
        }
    }

    /* renamed from: S */
    public boolean m4603S(long j) throws WDJNIException {
        try {
            return jniHRazTous(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[33], e);
        }
    }

    /* renamed from: T */
    public String m4604T(long j) throws WDJNIException {
        try {
            return jniGetRubriqueString(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[83], e);
        }
    }

    /* renamed from: U */
    public String m4605U(long j) throws C0841b, WDJNIException {
        try {
            return jniGetNomFichierRubrique(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Qt], e);
        }
    }

    /* renamed from: V */
    public void m4606V(long j) throws WDJNIException {
        try {
            jniLibererIdFichier(this.f2213a, new long[]{j});
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[34], e);
        }
    }

    /* renamed from: W */
    public boolean m4607W(long j) throws WDJNIException {
        try {
            return jniGetHEnDehors(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.aw], e);
        }
    }

    /* renamed from: X */
    public float m4608X(long j) throws WDJNIException {
        try {
            return jniGetRubriqueFloat(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[60], e);
        }
    }

    /* renamed from: Y */
    public boolean m4609Y(long j) throws WDJNIException {
        try {
            return jniGetRubriqueBoolean(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[155], e);
        }
    }

    /* renamed from: Z */
    public String m4610Z(long j) throws C0841b, WDJNIException {
        try {
            return jniGetNomRubrique(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[188], e);
        }
    }

    /* renamed from: a */
    public int mo2771a(int i, int i2) throws C0841b, WDJNIException {
        try {
            return jniHModeTous(this.f2213a, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[70], e);
        }
    }

    /* renamed from: a */
    public int mo2772a(int i, long j, long j2, int i2) throws C0841b, WDJNIException {
        try {
            return jniHGereCache(this.f2213a, i, j, j2, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Fn], e);
        }
    }

    /* renamed from: a */
    public int mo2773a(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHEtat(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[13], e);
        }
    }

    /* renamed from: a */
    public int mo2774a(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHPositionCourante(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[108], e);
        }
    }

    /* renamed from: a */
    public int mo2775a(long j, long j2, WDObjet wDObjet, WDObjet wDObjet2) throws C0841b, WDJNIException {
        try {
            return jniHCompareRubrique(this.f2213a, j, j2, wDObjet, wDObjet2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[279], e);
        }
    }

    /* renamed from: a */
    public int mo2776a(long j, long j2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHVerifieIndex(this.f2213a, j, j2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[280], e);
        }
    }

    /* renamed from: a */
    public int mo2777a(long j, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHReindexationEnCours(this.f2213a, j, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[InputDeviceCompat.SOURCE_KEYBOARD], e);
        }
    }

    /* renamed from: a */
    public int mo2778a(long j, String str, String str2, boolean z, String str3, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHSauvegarde(this.f2213a, j, str, str2, z, str3, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[125], e);
        }
    }

    /* renamed from: a */
    public int mo2779a(String str, String str2, String str3, String str4, String str5, String str6, String str7) throws C0841b, WDJNIException {
        try {
            return jniSQLConnecte(this.f2213a, str, str2, str3, str4, str5, str6, str7);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[100], e);
        }
    }

    /* renamed from: a */
    public long mo2780a(long j, int i, boolean z) throws C0841b, WDJNIException {
        return 0;
    }

    /* renamed from: a */
    public long mo2781a(long j, long j2, long j3, int i) throws C0841b, WDJNIException {
        try {
            return tableVirtualMove(this.f2213a, j, j2, j3, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[85], e);
        }
    }

    /* renamed from: a */
    public long mo2782a(long j, long j2, WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2) throws C0841b, WDJNIException {
        try {
            return jniHStatNbEnrIntervalle(this.f2213a, j, j2, wDObjetArr, wDObjetArr2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[30], e);
        }
    }

    /* renamed from: a */
    public long mo2783a(String str, C0843d[] c0843dArr) throws C0841b {
        return 0;
    }

    /* renamed from: a */
    public WDObjet mo2784a(long j, int i, int i2) throws C0841b, WDJNIException {
        try {
            return jniHRecupereRubrique(this.f2213a, j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[183], e);
        }
    }

    /* renamed from: a */
    public WDObjet mo2785a(long j, String str, WDObjet[] wDObjetArr) throws C0841b, WDJNIException {
        try {
            return jniHExecuteProcedure(this.f2213a, j, str, wDObjetArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[187], e);
        }
    }

    /* renamed from: a */
    public C0845h mo2786a(C0845h c0845h, int i, long j, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: a */
    public C0845h mo2787a(C0845h c0845h, int i, long j, long j2, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: a */
    public C0845h mo2788a(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: a */
    public C0845h mo2789a(boolean z, long j, int i, long j2, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: a */
    public C0845h mo2790a(boolean z, long j, int i, String str, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: a */
    public C0845h mo2791a(boolean z, long j, int i, byte[] bArr, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: a */
    public Object m4632a(long j, eb ebVar) throws C0841b, WDJNIException {
        try {
            switch (ebVar.m5848f()) {
                case 3:
                case 9:
                    return new Short(m4597M(ebVar.m5852i()));
                case 4:
                case 36:
                    return new Byte(m4599O(ebVar.m5852i()));
                case 5:
                case 26:
                case 38:
                    return new Integer(m4596L(ebVar.m5852i()));
                case 6:
                    return new Float(m4608X(ebVar.m5852i()));
                case 7:
                    return new Double(m4600P(ebVar.m5852i()));
                case 17:
                case 41:
                    return new BigDecimal(m4604T(ebVar.m5852i()));
                case 24:
                case 25:
                case 27:
                    return new Long(m4598N(ebVar.m5852i()));
                case 28:
                case 30:
                    return new WDBuffer(m4595K(ebVar.m5852i()));
                case 29:
                    return new WDChaineA(m4595K(ebVar.m5852i()));
                case 37:
                    try {
                        return new Boolean(m4609Y(ebVar.m5852i()));
                    } catch (WDHF_Exception e) {
                        return null;
                    }
                case 40:
                    return new WDChaineU(m4604T(ebVar.m5852i()));
                case 99:
                case 100:
                    return null;
                default:
                    return m4604T(ebVar.m5852i());
            }
        } catch (C0841b e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    final Object m4633a(db dbVar, eb ebVar) throws C0841b, WDJNIException {
        long i = ebVar.m5852i();
        try {
            if (mo3038r(dbVar.m3693d(true), i)) {
                return null;
            }
            try {
                Object K;
                switch (ebVar.m5848f()) {
                    case 3:
                    case 9:
                        return new Short(m4597M(i));
                    case 4:
                    case 36:
                        return new Byte(m4599O(i));
                    case 5:
                    case 26:
                    case 38:
                        return new Integer(m4596L(i));
                    case 6:
                        return new Float(m4608X(i));
                    case 7:
                        return new Double(m4600P(i));
                    case 17:
                    case 41:
                        return new BigDecimal(m4604T(i));
                    case 24:
                    case 25:
                    case 27:
                        return new Long(m4598N(i));
                    case 28:
                    case 30:
                        K = m4595K(i);
                        return K == null ? new byte[0] : K;
                    case 29:
                        K = m4595K(i);
                        return K == null ? new byte[0] : K;
                    case 37:
                        return new Boolean(m4609Y(i));
                    case 99:
                    case 100:
                        return null;
                    default:
                        return m4604T(i);
                }
            } catch (C0841b e) {
                throw e;
            }
        } catch (C0841b e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public String mo2792a(int i, String str, boolean z) throws C0841b, WDJNIException {
        try {
            return jniSQLColonneTable(this.f2213a, i, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Ao], e);
        }
    }

    /* renamed from: a */
    public String mo2793a(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeFichier(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[26], e);
        }
    }

    /* renamed from: a */
    public String mo2794a(long j, int i, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return jniHGereServeur(this.f2213a, j, i, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[25], e);
        }
    }

    /* renamed from: a */
    public String mo2795a(long j, long j2, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return jniHFiltreStringString(this.f2213a, j, j2, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[17], e);
        }
    }

    /* renamed from: a */
    public String mo2796a(long j, long j2, String str, byte[] bArr, String str2) throws C0841b, WDJNIException {
        try {
            return jniHFiltreStringBin(this.f2213a, j, j2, str, bArr, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Cw], e);
        }
    }

    /* renamed from: a */
    public String mo2797a(long j, long j2, byte[] bArr) throws C0841b, WDJNIException {
        try {
            return jniHFiltreCommenceParBin(this.f2213a, j, j2, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[44], e);
        }
    }

    /* renamed from: a */
    public String mo2798a(long j, long j2, byte[] bArr, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHFiltreBinString(this.f2213a, j, j2, bArr, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[95], e);
        }
    }

    /* renamed from: a */
    public String mo2799a(long j, long j2, byte[] bArr, byte[] bArr2, String str) throws C0841b, WDJNIException {
        try {
            return jniHFiltreBinBin(this.f2213a, j, j2, bArr, bArr2, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[169], e);
        }
    }

    /* renamed from: a */
    public String mo2800a(long j, long j2, WDObjet[] wDObjetArr) throws C0841b, WDJNIException {
        try {
            return jniHFiltreComprisEntre(this.f2213a, j, j2, wDObjetArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[226], e);
        }
    }

    /* renamed from: a */
    public String mo2801a(long j, long j2, String[] strArr) throws C0841b, WDJNIException {
        try {
            return jniHFiltreIdentique(this.f2213a, j, j2, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[59], e);
        }
    }

    /* renamed from: a */
    public String mo2802a(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHListeTriggerServeur(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[248], e);
        }
    }

    /* renamed from: a */
    public String mo2803a(long j, String str, long j2) throws C0841b, WDJNIException {
        try {
            return jniHInfoBlocageConnexion(this.f2213a, j, str, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[64], e);
        }
    }

    /* renamed from: a */
    public String mo2804a(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeLiaison(this.f2213a, j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Wj], e);
        }
    }

    /* renamed from: a */
    public String mo2805a(long j, String str, String str2, String str3, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoDroitBaseDeDonnees(this.f2213a, j, str, str2, str3, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[136], e);
        }
    }

    /* renamed from: a */
    public String mo2806a(long j, String str, String str2, String str3, String str4, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoDroitFichier(this.f2213a, j, str, str2, str3, str4, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[92], e);
        }
    }

    /* renamed from: a */
    public String mo2807a(String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeFichier(this.f2213a, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[26], e);
        }
    }

    /* renamed from: a */
    public String mo2808a(String str, boolean z) throws C0841b, WDJNIException {
        try {
            return jniSQLColonne(this.f2213a, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.qj], e);
        }
    }

    /* renamed from: a */
    public String mo2809a(boolean z, boolean z2) throws C0841b, WDJNIException {
        try {
            return jniSQLListeTables(this.f2213a, z, z2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[247], e);
        }
    }

    /* renamed from: a */
    public void mo2810a(int i, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            jniSetVariableHF(this.f2213a, i, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[116], e);
        }
    }

    /* renamed from: a */
    public void m4653a(long j, byte b) throws WDJNIException {
        try {
            jniSetRubriqueByte(this.f2213a, j, b);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0538a.tb], e);
        }
    }

    /* renamed from: a */
    public void m4654a(long j, double d) throws WDJNIException {
        try {
            jniSetRubriqueDouble(this.f2213a, j, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[81], e);
        }
    }

    /* renamed from: a */
    public void m4655a(long j, float f) throws WDJNIException {
        try {
            jniSetRubriqueFloat(this.f2213a, j, f);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[42], e);
        }
    }

    /* renamed from: a */
    public void m4656a(long j, short s) throws WDJNIException {
        try {
            jniSetRubriqueShort(this.f2213a, j, s);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[173], e);
        }
    }

    /* renamed from: a */
    public void m4657a(long j, byte[] bArr) throws WDJNIException {
        try {
            jniSetRubriqueByteArray(this.f2213a, j, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[65], e);
        }
    }

    /* renamed from: a */
    public void mo2811a(String str, int i) throws C0841b, WDJNIException {
        try {
            jniSQLPositionne(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[148], e);
        }
    }

    /* renamed from: a */
    public void mo2812a(String str, int i, String str2) throws C0841b, WDJNIException {
        try {
            jniSQLModifie(this.f2213a, str, i, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[55], e);
        }
    }

    /* renamed from: a */
    public void m4660a(long[] jArr) throws WDJNIException {
        try {
            jniLibererIdRubrique(this.f2213a, jArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[32], e);
        }
    }

    /* renamed from: a */
    public boolean mo2813a() throws C0841b, WDJNIException {
        try {
            return jniHReconnecte(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[9], e);
        }
    }

    /* renamed from: a */
    public boolean mo2814a(int i) throws C0841b, WDJNIException {
        try {
            return jniHLiberePosition(this.f2213a, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[277], e);
        }
    }

    /* renamed from: a */
    public boolean mo2815a(int i, String str) throws C0841b, WDJNIException {
        try {
            return jniSQLTransactionSurConnexion(this.f2213a, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[37], e);
        }
    }

    /* renamed from: a */
    public boolean mo2816a(int i, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHModifieStructureTous(this.f2213a, i, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[288], e);
        }
    }

    /* renamed from: a */
    public boolean mo2817a(long j) throws C0841b, WDJNIException {
        try {
            return jniHChangeConnexionTous(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[103], e);
        }
    }

    /* renamed from: a */
    public boolean mo2818a(long j, int i, int i2, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return jniHVersRubrique(this.f2213a, j, i, i2, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[139], e);
        }
    }

    /* renamed from: a */
    public boolean mo2819a(long j, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHRestaureSauvegarde(this.f2213a, j, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[98], e);
        }
    }

    /* renamed from: a */
    public boolean mo2820a(long j, int i, WDJaugeJNI wDJaugeJNI, int i2) throws C0841b, WDJNIException {
        try {
            return jniHReindexe(this.f2213a, j, i, wDJaugeJNI, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[185], e);
        }
    }

    /* renamed from: a */
    public boolean mo2821a(long j, int i, String str) throws C0841b, WDJNIException {
        try {
            return jniHExecuteRequeteSQL(this.f2213a, j, 0, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[8], e);
        }
    }

    /* renamed from: a */
    public boolean mo2822a(long j, int i, String str, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return jniHVersRubrique(this.f2213a, j, i, str, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[139], e);
        }
    }

    /* renamed from: a */
    public boolean mo2823a(long j, int i, String str, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHRecupereSauvegarde(this.f2213a, j, i, str, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[28], e);
        }
    }

    /* renamed from: a */
    public boolean mo2824a(long j, int i, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHModifieStructure(this.f2213a, j, i, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0536n.f1006y], e);
        }
    }

    /* renamed from: a */
    public boolean mo2825a(long j, int i, String str, String str2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHRestaureSauvegarde(this.f2213a, j, i, str, str2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[98], e);
        }
    }

    /* renamed from: a */
    public boolean mo2826a(long j, int i, String[] strArr) throws C0841b, WDJNIException {
        try {
            return jniHExecuteRequete(this.f2213a, j, 0, i, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[19], e);
        }
    }

    /* renamed from: a */
    public boolean mo2827a(long j, long j2, int i, int i2) throws C0841b, WDJNIException {
        try {
            return jniHPositionne(this.f2213a, j, j2, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Xn], e);
        }
    }

    /* renamed from: a */
    public boolean mo2828a(long j, long j2, int i, String str) throws C0841b, WDJNIException {
        try {
            return jniHExecuteRequeteSQL(this.f2213a, j, j2, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[8], e);
        }
    }

    /* renamed from: a */
    public boolean mo2829a(long j, long j2, int i, String[] strArr) throws C0841b, WDJNIException {
        try {
            return jniHExecuteRequete(this.f2213a, j, j2, i, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[19], e);
        }
    }

    /* renamed from: a */
    public boolean mo2830a(long j, long j2, String str, int i, String str2) throws C0841b, WDJNIException {
        try {
            return jniHAttacheMemo(this.f2213a, j, j2, str, i, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[295], e);
        }
    }

    /* renamed from: a */
    public boolean mo2831a(long j, long j2, boolean z) throws C0841b, WDJNIException {
        try {
            return jniHGereDoublon(this.f2213a, j, j2, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[41], e);
        }
    }

    /* renamed from: a */
    public boolean mo2832a(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHOuvre(this.f2213a, j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[283], e);
        }
    }

    /* renamed from: a */
    public boolean mo2833a(long j, String str, long j2, String str2, int i, WDJaugeJNI wDJaugeJNI, String str3) throws C0841b, WDJNIException {
        try {
            return jniHCopieFichier(this.f2213a, j, str, j2, str2, i, wDJaugeJNI, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[145], e);
        }
    }

    /* renamed from: a */
    public boolean mo2834a(long j, String str, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return jniHSauveParametre(this.f2213a, j, str, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[114], e);
        }
    }

    /* renamed from: a */
    public boolean mo2835a(long j, String str, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHDupliqueBaseDeDonnees(this.f2213a, j, str, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[181], e);
        }
    }

    /* renamed from: a */
    public boolean mo2836a(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHModifieProprieteServeur(this.f2213a, j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[75], e);
        }
    }

    /* renamed from: a */
    public boolean mo2837a(long j, String str, String str2, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHExporteXML(this.f2213a, j, str, str2, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[126], e);
        }
    }

    /* renamed from: a */
    public boolean mo2838a(long j, String str, String str2, int i, String str3, String str4) throws C0841b, WDJNIException {
        if (j < 0) {
            return jniHDecritTriggerServeur(this.f2213a, str, str2, i, str3, str4);
        }
        try {
            return jniHDecritTriggerServeur(this.f2213a, j, str, str2, i, str3, str4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[66], e);
        }
    }

    /* renamed from: a */
    public boolean mo2839a(long j, String str, String str2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHRecupereSauvegarde(this.f2213a, j, str, str2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[28], e);
        }
    }

    /* renamed from: a */
    public boolean mo2840a(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return jniHModifieDroitServeur(this.f2213a, j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[238], e);
        }
    }

    /* renamed from: a */
    public boolean mo2841a(long j, String str, String str2, String str3, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHImporteJSON(this.f2213a, j, str, str2, str3, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Uk], e);
        }
    }

    /* renamed from: a */
    public boolean mo2842a(long j, String str, String str2, String str3, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHRestaureSauvegarde(this.f2213a, j, str, str2, str3, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[98], e);
        }
    }

    /* renamed from: a */
    public boolean mo2843a(long j, String str, String str2, String str3, String str4) throws C0841b, WDJNIException {
        try {
            return jniHModifieDroitBaseDeDonnees(this.f2213a, j, str, str2, str3, str4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[123], e);
        }
    }

    /* renamed from: a */
    public boolean mo2844a(long j, String str, String str2, String str3, String str4, String str5) throws C0841b, WDJNIException {
        try {
            return jniHModifieDroitVue(this.f2213a, j, str, str2, str3, str4, str5);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[291], e);
        }
    }

    /* renamed from: a */
    public boolean mo2845a(long j, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2) throws C0841b, WDJNIException {
        try {
            return jniHOuvreNouvelleConnexion(this.f2213a, j, str, str2, str3, str4, str5, i, str6, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[87], e);
        }
    }

    /* renamed from: a */
    public boolean mo2846a(long j, String str, boolean z) throws C0841b, WDJNIException {
        try {
            return jniHMiseAJourRequete(this.f2213a, j, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[2], e);
        }
    }

    /* renamed from: a */
    public boolean mo2847a(long j, boolean z) throws C0841b, WDJNIException {
        try {
            return jniHGereTransaction(this.f2213a, j, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.yt], e);
        }
    }

    /* renamed from: a */
    public boolean mo2848a(C0845h c0845h, long j, int i) throws C0841b, WDJNIException {
        return false;
    }

    /* renamed from: a */
    public boolean mo2849a(C0845h c0845h, long j, long j2, int i) throws C0841b, WDJNIException {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m4698a(fr.pcsoft.wdjava.database.hf.db r15, java.lang.Object[] r16, java.lang.Object[] r17) throws fr.pcsoft.wdjava.database.hf.p049c.C0841b, fr.pcsoft.wdjava.jni.WDJNIException {
        /*
        r14 = this;
        r7 = 524290; // 0x80002 float:7.34687E-40 double:2.590337E-318;
        r6 = 1;
        r5 = 0;
        r8 = r15.m3693d(r6);
        r4 = r5;
    L_0x000a:
        r0 = r16;
        r2 = r0.length;
        if (r4 >= r2) goto L_0x016f;
    L_0x000f:
        r2 = r16[r4];
        r2 = (fr.pcsoft.wdjava.database.hf.eb) r2;
        r10 = r2.m5852i();	 Catch:{ WDHF_Exception -> 0x0036 }
        r12 = 0;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 > 0) goto L_0x001e;
    L_0x001d:
        return r5;
    L_0x001e:
        r3 = r2.m5813P();	 Catch:{ b -> 0x0028 }
        if (r3 == 0) goto L_0x002a;
    L_0x0024:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x000a;
    L_0x0028:
        r2 = move-exception;
        throw r2;
    L_0x002a:
        r3 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r3 = r17[r3];	 Catch:{ WDHF_Exception -> 0x0036 }
        if (r3 != 0) goto L_0x0051;
    L_0x0032:
        r14.mo3007m(r8, r10);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x0036:
        r2 = move-exception;
        r2 = r2.m5048k();	 Catch:{ WDHF_Exception -> 0x0169 }
        r3 = 70202; // 0x1123a float:9.8374E-41 double:3.46844E-319;
        if (r2 != r3) goto L_0x001d;
    L_0x0040:
        r2 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ WDHF_Exception -> 0x016b }
        r2 = r2.m5036p();	 Catch:{ WDHF_Exception -> 0x016b }
        if (r2 == r7) goto L_0x0024;
    L_0x004a:
        r2 = r15.m3615T();	 Catch:{ WDHF_Exception -> 0x016d }
        if (r2 != r7) goto L_0x001d;
    L_0x0050:
        goto L_0x0024;
    L_0x0051:
        r3 = r2.m5848f();	 Catch:{ WDHF_Exception -> 0x0065 }
        switch(r3) {
            case 2: goto L_0x0059;
            case 3: goto L_0x0087;
            case 4: goto L_0x0077;
            case 5: goto L_0x0097;
            case 6: goto L_0x00b9;
            case 7: goto L_0x00ca;
            case 8: goto L_0x0058;
            case 9: goto L_0x0087;
            case 10: goto L_0x0058;
            case 11: goto L_0x0059;
            case 12: goto L_0x0059;
            case 13: goto L_0x0058;
            case 14: goto L_0x0059;
            case 15: goto L_0x0058;
            case 16: goto L_0x0058;
            case 17: goto L_0x00db;
            case 18: goto L_0x0058;
            case 19: goto L_0x0058;
            case 20: goto L_0x0058;
            case 21: goto L_0x0058;
            case 22: goto L_0x0058;
            case 23: goto L_0x0058;
            case 24: goto L_0x00a8;
            case 25: goto L_0x00a8;
            case 26: goto L_0x0097;
            case 27: goto L_0x00a8;
            case 28: goto L_0x00ea;
            case 29: goto L_0x0123;
            case 30: goto L_0x00ea;
            case 31: goto L_0x0058;
            case 32: goto L_0x0058;
            case 33: goto L_0x0058;
            case 34: goto L_0x0059;
            case 35: goto L_0x0059;
            case 36: goto L_0x0077;
            case 37: goto L_0x0067;
            case 38: goto L_0x0097;
            case 39: goto L_0x0059;
            case 40: goto L_0x0123;
            case 41: goto L_0x00db;
            default: goto L_0x0058;
        };	 Catch:{ WDHF_Exception -> 0x0065 }
    L_0x0058:
        goto L_0x0024;
    L_0x0059:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0065 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0065 }
        r2 = (java.lang.String) r2;	 Catch:{ WDHF_Exception -> 0x0065 }
        r14.m4934z(r10, r2);	 Catch:{ WDHF_Exception -> 0x0065 }
        goto L_0x0024;
    L_0x0065:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x0036 }
    L_0x0067:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.booleanValue();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4732b(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x0077:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = (java.lang.Number) r2;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.byteValue();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4653a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x0087:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = (java.lang.Number) r2;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.shortValue();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4656a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x0097:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = (java.lang.Number) r2;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.intValue();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4929x(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x00a8:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = (java.lang.Number) r2;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.longValue();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4909t(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x00b9:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = (java.lang.Number) r2;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.floatValue();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4655a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x00ca:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = (java.lang.Number) r2;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.doubleValue();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4654a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x00db:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r2.toString();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4934z(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x00ea:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r3 = r2 instanceof fr.pcsoft.wdjava.database.hf.C0862o;	 Catch:{ WDHF_Exception -> 0x0105 }
        if (r3 != 0) goto L_0x0024;
    L_0x00f4:
        r3 = r2 instanceof fr.pcsoft.wdjava.core.WDObjet;	 Catch:{ WDHF_Exception -> 0x0103 }
        if (r3 == 0) goto L_0x0107;
    L_0x00f8:
        r2 = (fr.pcsoft.wdjava.core.WDObjet) r2;	 Catch:{ WDHF_Exception -> 0x0103 }
        r2 = r2.getDonneeBinaire();	 Catch:{ WDHF_Exception -> 0x0103 }
        r14.m4657a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0103 }
        goto L_0x0024;
    L_0x0103:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x0036 }
    L_0x0105:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x0103 }
    L_0x0107:
        r3 = r2 instanceof byte[];	 Catch:{ WDHF_Exception -> 0x0114 }
        if (r3 == 0) goto L_0x0116;
    L_0x010b:
        r2 = (byte[]) r2;	 Catch:{ WDHF_Exception -> 0x0114 }
        r2 = (byte[]) r2;	 Catch:{ WDHF_Exception -> 0x0114 }
        r14.m4657a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0114 }
        goto L_0x0024;
    L_0x0114:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x0036 }
    L_0x0116:
        r2 = r2.toString();	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = fr.pcsoft.wdjava.core.C0725i.m3075f(r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4657a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x0123:
        r2 = r2.m5854k();	 Catch:{ WDHF_Exception -> 0x0036 }
        r3 = r17[r2];	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r3 instanceof fr.pcsoft.wdjava.core.WDObjet;	 Catch:{ WDHF_Exception -> 0x0144 }
        if (r2 == 0) goto L_0x0151;
    L_0x012d:
        r0 = r3;
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ WDHF_Exception -> 0x0142 }
        r2 = r0;
        r2 = r2.isUnicode();	 Catch:{ WDHF_Exception -> 0x0142 }
        if (r2 == 0) goto L_0x0146;
    L_0x0137:
        r3 = (fr.pcsoft.wdjava.core.WDObjet) r3;	 Catch:{ WDHF_Exception -> 0x0142 }
        r2 = r3.getString();	 Catch:{ WDHF_Exception -> 0x0142 }
        r14.m4934z(r10, r2);	 Catch:{ WDHF_Exception -> 0x0142 }
        goto L_0x0024;
    L_0x0142:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x0036 }
    L_0x0144:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x0142 }
    L_0x0146:
        r3 = (fr.pcsoft.wdjava.core.WDObjet) r3;	 Catch:{ WDHF_Exception -> 0x0036 }
        r2 = r3.getDonneeBinaire();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4657a(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x0151:
        r2 = r3 instanceof byte[];	 Catch:{ WDHF_Exception -> 0x015e }
        if (r2 == 0) goto L_0x0160;
    L_0x0155:
        r3 = (byte[]) r3;	 Catch:{ WDHF_Exception -> 0x015e }
        r3 = (byte[]) r3;	 Catch:{ WDHF_Exception -> 0x015e }
        r14.m4657a(r10, r3);	 Catch:{ WDHF_Exception -> 0x015e }
        goto L_0x0024;
    L_0x015e:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x0036 }
    L_0x0160:
        r2 = r3.toString();	 Catch:{ WDHF_Exception -> 0x0036 }
        r14.m4934z(r10, r2);	 Catch:{ WDHF_Exception -> 0x0036 }
        goto L_0x0024;
    L_0x0169:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x016b }
    L_0x016b:
        r2 = move-exception;
        throw r2;	 Catch:{ WDHF_Exception -> 0x016d }
    L_0x016d:
        r2 = move-exception;
        throw r2;
    L_0x016f:
        r5 = r6;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF.a(fr.pcsoft.wdjava.database.hf.db, java.lang.Object[], java.lang.Object[]):boolean");
    }

    /* renamed from: a */
    public boolean mo2850a(String str) throws C0841b, WDJNIException {
        try {
            return jniHTransactionInterrompue(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[217], e);
        }
    }

    /* renamed from: a */
    public boolean mo2851a(String str, long j, int i, boolean z) throws C0841b, WDJNIException {
        try {
            return jniHGereIntegrite(this.f2213a, str, j, i, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[153], e);
        }
    }

    /* renamed from: a */
    public boolean mo2852a(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHTransactionDebut(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[111], e);
        }
    }

    /* renamed from: a */
    public boolean mo2853a(String str, String str2, String str3, String str4, String str5) throws C0841b, WDJNIException {
        try {
            return jniHOuvreAnalyse(this.f2213a, str, str2, str3, str4, str5);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[80], e);
        }
    }

    /* renamed from: a */
    public boolean mo2854a(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2) throws C0841b, WDJNIException {
        try {
            return jniHDecritConnexion(this.f2213a, str, str2, str3, str4, str5, str6, i, str7, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[199], e);
        }
    }

    /* renamed from: a */
    public boolean m4704a(String str, byte[] bArr) throws C0841b, WDJNIException {
        try {
            return jniHOuvreAnalyse(this.f2213a, str, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[80], e);
        }
    }

    /* renamed from: a */
    public boolean mo2855a(boolean z) throws C0841b, WDJNIException {
        try {
            return jniHGereTransactionTous(this.f2213a, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[137], e);
        }
    }

    /* renamed from: a */
    public boolean m4706a(boolean z, long j, long j2, int i) throws WDJNIException {
        boolean jniHLitPremier;
        if (z) {
            try {
                jniHLitPremier = jniHLitPremier(this.f2213a, j, j2, i);
            } catch (WDJNIException e) {
                throw e;
            }
        }
        try {
            jniHLitPremier = jniHLitDernier(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e2) {
            UnsatisfiedLinkError unsatisfiedLinkError = e2;
            String str = f2212z[166];
            if (!z) {
                str = f2212z[167];
            }
            throw new WDJNIException(str, unsatisfiedLinkError);
        }
        return jniHLitPremier;
    }

    /* renamed from: a */
    public boolean m4707a(boolean z, long j, long j2, long j3, int i) throws WDJNIException {
        boolean jniHAvance;
        if (z) {
            try {
                jniHAvance = jniHAvance(this.f2213a, j, j2, j3, i);
            } catch (WDJNIException e) {
                throw e;
            }
        }
        try {
            jniHAvance = jniHRecule(this.f2213a, j, j2, j3, i);
        } catch (UnsatisfiedLinkError e2) {
            UnsatisfiedLinkError unsatisfiedLinkError = e2;
            String str = f2212z[171];
            if (!z) {
                str = f2212z[172];
            }
            throw new WDJNIException(str, unsatisfiedLinkError);
        }
        return jniHAvance;
    }

    /* renamed from: a */
    public boolean m4708a(boolean z, long j, long j2, WDObjet wDObjet, int i) throws WDJNIException {
        String str;
        if (z) {
            try {
                if (wDObjet.isMemoBinaire()) {
                    return jniHRecherchePremierBin(this.f2213a, j, j2, wDObjet.getDonneeBinaire(), i);
                }
                return jniHRecherchePremier(this.f2213a, j, j2, wDObjet.getString(), i);
            } catch (UnsatisfiedLinkError e) {
                UnsatisfiedLinkError unsatisfiedLinkError = e;
                str = f2212z[245];
                if (!z) {
                    str = f2212z[C0607n.uw];
                }
                throw new WDJNIException(str, unsatisfiedLinkError);
            }
        }
        try {
            if (wDObjet.isMemoBinaire()) {
                return jniHRechercheDernierBin(this.f2213a, j, j2, wDObjet.getDonneeBinaire(), i);
            }
            return jniHRechercheDernier(this.f2213a, j, j2, wDObjet.getString(), i);
        } catch (WDJNIException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public byte[] mo2856a(String str, String str2, long j) throws C0841b, WDJNIException {
        try {
            return jniHDeclareExterneCS(this.f2213a, str, str2, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[152], e);
        }
    }

    /* renamed from: a */
    public byte[] mo2857a(String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return jniHDeclareExterneClassic(this.f2213a, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[130], e);
        }
    }

    /* renamed from: a */
    public Object[] m4711a(db dbVar, Iterator it, int i) throws C0841b, WDJNIException {
        Object[] objArr = new Object[i];
        while (it.hasNext()) {
            eb ebVar = (eb) it.next();
            try {
                objArr[ebVar.m5854k()] = m4633a(dbVar, ebVar);
            } catch (WDHF_Exception e) {
                try {
                    if (e.m5048k() == 70202) {
                        if (WDHF_Contexte.getInstance().m5036p() != C0542t.f1159A) {
                            try {
                                if (dbVar.m3615T() == C0542t.f1159A) {
                                    continue;
                                }
                            } catch (WDHF_Exception e2) {
                                throw e2;
                            }
                        }
                        continue;
                    }
                    try {
                        if (ebVar.m5859r() != 2) {
                            return null;
                        }
                    } catch (WDHF_Exception e22) {
                        throw e22;
                    }
                } catch (WDHF_Exception e222) {
                    throw e222;
                } catch (WDHF_Exception e2222) {
                    throw e2222;
                }
            }
        }
        return objArr;
    }

    /* renamed from: a */
    public String[] mo2858a(String[] strArr) throws C0841b, WDJNIException {
        try {
            return jniSetHClient(this.f2213a, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[67], e);
        }
    }

    public boolean ab(long j) throws WDJNIException {
        try {
            return jniGetHTrouve(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.yk], e);
        }
    }

    /* renamed from: b */
    public int mo2859b(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHPriorite(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[260], e);
        }
    }

    /* renamed from: b */
    public int mo2860b(long j, int i, int i2) throws C0841b, WDJNIException {
        try {
            return jniHMode(this.f2213a, j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[82], e);
        }
    }

    /* renamed from: b */
    public long mo2861b(long j, long j2, WDObjet wDObjet, WDObjet wDObjet2) throws C0841b, WDJNIException {
        try {
            return jniHStatNbEnrIntervalle(this.f2213a, j, j2, wDObjet, wDObjet2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[30], e);
        }
    }

    /* renamed from: b */
    public WDObjet mo2862b(int i) throws C0841b, WDJNIException {
        try {
            return jniGetVariableHF(this.f2213a, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[251], e);
        }
    }

    /* renamed from: b */
    public WDObjet mo2863b(long j, String str, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return jniHChargeParametre(this.f2213a, j, str, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[269], e);
        }
    }

    /* renamed from: b */
    public C0832f mo2864b(boolean z) throws C0841b, WDJNIException {
        try {
            WDHF wdhf = (WDHF) super.clone();
            try {
                if (wdhf.f2213a == 0) {
                    wdhf.f2213a = jniHFContext();
                    if (wdhf.f2213a != 0) {
                        return wdhf;
                    }
                    WDErreurManager.m2883a(WDJNIHelper.jniMessageErreur());
                    return wdhf;
                }
                wdhf.f2213a = z ? jniHFCopieContextLight(this.f2213a) : jniHFCopieContext(this.f2213a);
                if (wdhf.f2213a != 0) {
                    return wdhf;
                }
                WDErreurManager.m2883a(WDJNIHelper.jniMessageErreur());
                return wdhf;
            } catch (CloneNotSupportedException e) {
                throw e;
            } catch (CloneNotSupportedException e2) {
                throw e2;
            }
        } catch (CloneNotSupportedException e22) {
            throw e22;
        } catch (CloneNotSupportedException e222) {
            throw e222;
        } catch (Exception e3) {
            C0691a.m2863b(f2212z[159], e3);
            return this;
        }
    }

    /* renamed from: b */
    public C0845h mo2865b(C0845h c0845h, int i, long j, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: b */
    public C0845h mo2866b(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: b */
    public C0845h mo2867b(boolean z, long j, int i, String str, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: b */
    public C0845h mo2868b(boolean z, long j, int i, byte[] bArr, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: b */
    public String mo2869b() throws C0841b, WDJNIException {
        try {
            String jniSQLErreur = jniSQLErreur(this.f2213a);
            return jniSQLErreur == null ? "" : jniSQLErreur;
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[14], e);
        }
    }

    /* renamed from: b */
    public String mo2870b(long j, int i, String str) throws C0841b, WDJNIException {
        try {
            return jniHDbg(this.f2213a, j, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[254], e);
        }
    }

    /* renamed from: b */
    public String mo2871b(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHStatDate(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.wf], e);
        }
    }

    /* renamed from: b */
    public String mo2872b(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeLiaison(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Wj], e);
        }
    }

    /* renamed from: b */
    public String mo2873b(long j, long j2, byte[] bArr) throws C0841b, WDJNIException {
        try {
            return jniHFiltreIdentiqueBin(this.f2213a, j, j2, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[261], e);
        }
    }

    /* renamed from: b */
    public String mo2874b(long j, long j2, String[] strArr) throws C0841b, WDJNIException {
        try {
            return jniHFiltreCommencePar(this.f2213a, j, j2, strArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[246], e);
        }
    }

    /* renamed from: b */
    public String mo2875b(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeIndexFullText(this.f2213a, j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[107], e);
        }
    }

    /* renamed from: b */
    public String mo2876b(long j, String str, String str2, String str3, String str4, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoDroitVue(this.f2213a, j, str, str2, str3, str4, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[106], e);
        }
    }

    /* renamed from: b */
    public String mo2877b(String str, int i) throws C0841b, WDJNIException {
        try {
            return jniSQLLitCol(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[47], e);
        }
    }

    /* renamed from: b */
    public void m4732b(long j, boolean z) throws WDJNIException {
        try {
            jniSetRubriqueBoolean(this.f2213a, j, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[190], e);
        }
    }

    /* renamed from: b */
    public void mo2878b(String str) throws C0841b, WDJNIException {
        try {
            jniSQLPrecedent(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[253], e);
        }
    }

    /* renamed from: b */
    public void m4734b(long[] jArr) throws WDJNIException {
        try {
            jniLibererIdFichier(this.f2213a, jArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[34], e);
        }
    }

    /* renamed from: b */
    public boolean mo2879b(long j) throws C0841b, WDJNIException {
        try {
            return jniHLibere(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[110], e);
        }
    }

    /* renamed from: b */
    public boolean mo2880b(long j, int i, WDObjet wDObjet) throws C0841b, WDJNIException {
        try {
            return jniHVersRubrique(this.f2213a, j, i, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[139], e);
        }
    }

    /* renamed from: b */
    public boolean mo2881b(long j, long j2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHVerifieInaltere(this.f2213a, j, j2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[112], e);
        }
    }

    /* renamed from: b */
    public boolean mo2882b(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeGroupe(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[259], e);
        }
    }

    /* renamed from: b */
    public boolean mo2883b(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeFichier(this.f2213a, j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Bf], e);
        }
    }

    /* renamed from: b */
    public boolean mo2884b(long j, String str, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHRestaureSauvegarde(this.f2213a, j, str, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[98], e);
        }
    }

    /* renamed from: b */
    public boolean mo2885b(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHDesactiveTriggerServeur(this.f2213a, j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[121], e);
        }
    }

    /* renamed from: b */
    public boolean mo2886b(long j, String str, String str2, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHExporteJSON(this.f2213a, j, str, str2, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[292], e);
        }
    }

    /* renamed from: b */
    public boolean mo2887b(long j, String str, String str2, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHRestaureSauvegarde(this.f2213a, j, str, str2, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[98], e);
        }
    }

    /* renamed from: b */
    public boolean mo2888b(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return jniHModifieProprieteBaseDeDonnees(this.f2213a, j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[40], e);
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
                            return jniHCreationSiInexistant(this.f2213a, j, str, str4, str5, i);
                        }
                    }
                    str5 = str3;
                    return jniHCreationSiInexistant(this.f2213a, j, str, str4, str5, i);
                }
            } catch (UnsatisfiedLinkError e) {
                throw e;
            } catch (UnsatisfiedLinkError e2) {
                throw new WDJNIException(f2212z[236], e2);
            }
        }
        str4 = str2;
        if (str3 != null) {
            if (str3.equals("")) {
                str5 = null;
                return jniHCreationSiInexistant(this.f2213a, j, str, str4, str5, i);
            }
        }
        str5 = str3;
        return jniHCreationSiInexistant(this.f2213a, j, str, str4, str5, i);
    }

    /* renamed from: b */
    public boolean mo2890b(long j, String str, String str2, String str3, int i, WDJaugeJNI wDJaugeJNI) throws C0841b, WDJNIException {
        try {
            return jniHImporteTexte(this.f2213a, j, str, str2, str3, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[115], e);
        }
    }

    /* renamed from: b */
    public boolean mo2891b(long j, String str, String str2, String str3, String str4) throws C0841b, WDJNIException {
        try {
            return jniHModifieProprieteFichier(this.f2213a, j, str, str2, str3, str4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Gu], e);
        }
    }

    /* renamed from: b */
    public boolean mo2892b(long j, String str, String str2, String str3, String str4, String str5) throws C0841b, WDJNIException {
        try {
            return jniHModifieDroitFichier(this.f2213a, j, str, str2, str3, str4, str5);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[249], e);
        }
    }

    /* renamed from: b */
    public boolean mo2893b(long j, String str, boolean z) throws C0841b, WDJNIException {
        try {
            return jniHMiseAJourCollection(this.f2213a, j, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[214], e);
        }
    }

    /* renamed from: b */
    public boolean mo2894b(C0845h c0845h, long j, int i) throws C0841b, WDJNIException {
        return false;
    }

    /* renamed from: b */
    public boolean mo2895b(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHDesactiveTriggerServeur(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[121], e);
        }
    }

    /* renamed from: b */
    public boolean m4752b(boolean z, long j, long j2, int i) throws WDJNIException {
        boolean jniHPremier;
        if (z) {
            try {
                jniHPremier = jniHPremier(this.f2213a, j, j2, i);
            } catch (WDJNIException e) {
                throw e;
            }
        }
        try {
            jniHPremier = jniHDernier(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e2) {
            UnsatisfiedLinkError unsatisfiedLinkError = e2;
            String str = f2212z[284];
            if (!z) {
                str = f2212z[285];
            }
            throw new WDJNIException(str, unsatisfiedLinkError);
        }
        return jniHPremier;
    }

    /* renamed from: b */
    public boolean m4753b(boolean z, long j, long j2, WDObjet wDObjet, int i) throws WDJNIException {
        String str;
        if (z) {
            try {
                if (wDObjet.isMemoBinaire()) {
                    return jniHLitRecherchePremierBin(this.f2213a, j, j2, wDObjet.getDonneeBinaire(), i);
                }
                return jniHLitRecherchePremier(this.f2213a, j, j2, wDObjet.getString(), i);
            } catch (UnsatisfiedLinkError e) {
                UnsatisfiedLinkError unsatisfiedLinkError = e;
                str = f2212z[224];
                if (!z) {
                    str = f2212z[223];
                }
                throw new WDJNIException(str, unsatisfiedLinkError);
            }
        }
        try {
            if (wDObjet.isMemoBinaire()) {
                return jniHLitRechercheDernierBin(this.f2213a, j, j2, wDObjet.getDonneeBinaire(), i);
            }
            return jniHLitRechercheDernier(this.f2213a, j, j2, wDObjet.getString(), i);
        } catch (WDJNIException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public WDObjet mo2896c(long j, int i, String str) throws C0841b, WDJNIException {
        try {
            return jniHRecupereRubrique(this.f2213a, j, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[183], e);
        }
    }

    /* renamed from: c */
    public WDObjet mo2897c(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoFichier(this.f2213a, j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[52], e);
        }
    }

    /* renamed from: c */
    public WDChaine mo2898c(long j, long j2, String[] strArr) throws C0841b, WDJNIException {
        try {
            return new WDChaine(jniHConstruitValCle(this.f2213a, j, j2, strArr));
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[158], e);
        }
    }

    /* renamed from: c */
    public C0845h mo2899c(long j, int i, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: c */
    public C0845h mo2900c(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: c */
    public String mo2901c() throws C0841b, WDJNIException {
        try {
            String jniSQLMesErreur = jniSQLMesErreur(this.f2213a);
            return jniSQLMesErreur == null ? "" : jniSQLMesErreur;
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[43], e);
        }
    }

    /* renamed from: c */
    public String mo2902c(long j) throws C0841b, WDJNIException {
        try {
            return jniGetNomPhysique(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[53], e);
        }
    }

    /* renamed from: c */
    public String mo2903c(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHInfoProprieteBaseDeDonnees(this.f2213a, j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[51], e);
        }
    }

    /* renamed from: c */
    public String mo2904c(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeRubrique(this.f2213a, j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[73], e);
        }
    }

    /* renamed from: c */
    public String mo2905c(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return jniHInfoProprieteFichier(this.f2213a, j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[164], e);
        }
    }

    /* renamed from: c */
    public String mo2906c(String str, int i) throws C0841b, WDJNIException {
        try {
            return jniSQLLitMemoTexte(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[268], e);
        }
    }

    /* renamed from: c */
    public void mo2907c(String str) throws C0841b, WDJNIException {
        try {
            if (this.f2213a != 0) {
                try {
                    jniSQLFerme(this.f2213a, str);
                } catch (UnsatisfiedLinkError e) {
                    throw new WDJNIException(f2212z[C0607n.lh], e);
                }
            }
        } catch (C0841b e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public boolean mo2908c(int i) throws C0841b, WDJNIException {
        try {
            return jniSQLTransaction(this.f2213a, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[225], e);
        }
    }

    /* renamed from: c */
    public boolean mo2909c(long j, int i) throws WDJNIException {
        try {
            return jniGetPropFichierBool(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[54], e);
        }
    }

    /* renamed from: c */
    public boolean mo2910c(long j, long j2) throws C0841b, WDJNIException {
        try {
            return isNbEnrNeedParse(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[213], e);
        }
    }

    /* renamed from: c */
    public boolean mo2911c(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHChangeCle(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.al], e);
        }
    }

    /* renamed from: c */
    public boolean mo2912c(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHModifieUtilisateur(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.f1441Y], e);
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
                            return jniHCreation(this.f2213a, j, str, str4, str5, i);
                        }
                    }
                    str5 = str3;
                    return jniHCreation(this.f2213a, j, str, str4, str5, i);
                }
            } catch (UnsatisfiedLinkError e) {
                throw e;
            } catch (UnsatisfiedLinkError e2) {
                throw new WDJNIException(f2212z[C0607n.oq], e2);
            }
        }
        str4 = str2;
        if (str3 != null) {
            if (str3.equals("")) {
                str5 = null;
                return jniHCreation(this.f2213a, j, str, str4, str5, i);
            }
        }
        str5 = str3;
        return jniHCreation(this.f2213a, j, str, str4, str5, i);
    }

    /* renamed from: c */
    public boolean mo2914c(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHChangeRepSQL(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Gk], e);
        }
    }

    /* renamed from: c */
    public boolean m4773c(boolean z, long j, long j2, int i) throws WDJNIException {
        boolean jniHLitSuivant;
        if (z) {
            try {
                jniHLitSuivant = jniHLitSuivant(this.f2213a, j, j2, i);
            } catch (WDJNIException e) {
                throw e;
            }
        }
        try {
            jniHLitSuivant = jniHLitPrecedent(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e2) {
            UnsatisfiedLinkError unsatisfiedLinkError = e2;
            String str = f2212z[36];
            if (!z) {
                str = f2212z[35];
            }
            throw new WDJNIException(str, unsatisfiedLinkError);
        }
        return jniHLitSuivant;
    }

    /* renamed from: d */
    public int mo2915d(int i) throws C0841b, WDJNIException {
        try {
            return jniHErreur(this.f2213a, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Dt], e);
        }
    }

    /* renamed from: d */
    public int mo2916d(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHGereMemo(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[271], e);
        }
    }

    /* renamed from: d */
    public long mo2917d(String str) throws C0841b, WDJNIException {
        return m4582p(str);
    }

    /* renamed from: d */
    public C0845h mo2918d(boolean z, long j, int i, int i2) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: d */
    public String mo2919d(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHInfoMemo(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[286], e);
        }
    }

    /* renamed from: d */
    public String mo2920d(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHEnregistrementVersXML(this.f2213a, j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.bx], e);
        }
    }

    /* renamed from: d */
    public String mo2921d(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeCle(this.f2213a, j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[50], e);
        }
    }

    /* renamed from: d */
    public String mo2922d(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return jniHListeSynonyme(this.f2213a, j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[147], e);
        }
    }

    /* renamed from: d */
    public String mo2923d(String str, int i) throws C0841b, WDJNIException {
        try {
            return jniSQLCol(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0536n.f1002n], e);
        }
    }

    /* renamed from: d */
    public boolean mo2924d() throws C0841b, WDJNIException {
        try {
            return jniHErreurDoublon(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[192], e);
        }
    }

    /* renamed from: d */
    public boolean mo2925d(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeTache(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[96], e);
        }
    }

    /* renamed from: d */
    public boolean m4785d(long j, int i, int i2) throws WDJNIException {
        try {
            return jniHRetourPosition(this.f2213a, j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[204], e);
        }
    }

    /* renamed from: d */
    public boolean mo2926d(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHChangeRep(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Fb], e);
        }
    }

    /* renamed from: d */
    public boolean mo2927d(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHDetruitTriggerServeur(this.f2213a, j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[141], e);
        }
    }

    /* renamed from: d */
    public boolean mo2928d(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHPasse(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[24], e);
        }
    }

    /* renamed from: d */
    public boolean m4789d(boolean z, long j, long j2, int i) throws WDJNIException {
        boolean jniHSuivant;
        if (z) {
            try {
                jniHSuivant = jniHSuivant(this.f2213a, j, j2, i);
            } catch (WDJNIException e) {
                throw e;
            }
        }
        try {
            jniHSuivant = jniHPrecedent(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e2) {
            UnsatisfiedLinkError unsatisfiedLinkError = e2;
            String str = f2212z[56];
            if (!z) {
                str = f2212z[57];
            }
            throw new WDJNIException(str, unsatisfiedLinkError);
        }
        return jniHSuivant;
    }

    /* renamed from: d */
    public C0844e[] mo2929d(long j) throws WDJNIException, C0841b {
        long[] J = m4594J(j);
        C0844e[] c0844eArr = new C0844e[J.length];
        for (int i = 0; i < J.length; i++) {
            long j2 = J[i];
            C0844e c0844e = new C0844e(j2);
            c0844e.m5749a(m4610Z(j2));
            c0844e.m5756c(m4601Q(j2));
            c0844e.m5755b(m4605U(j2));
            c0844e.m5748a(C0855h.m5975d(m4602R(j2)));
            c0844e.m5752b(i);
            c0844eArr[i] = c0844e;
        }
        return c0844eArr;
    }

    /* renamed from: e */
    public int mo2930e(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHSauvePosition(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[97], e);
        }
    }

    /* renamed from: e */
    public String mo2931e() throws C0841b, WDJNIException {
        try {
            return jniSQLBase(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[105], e);
        }
    }

    /* renamed from: e */
    public String mo2932e(int i) throws C0841b, WDJNIException {
        try {
            return jniHErreurInfo(this.f2213a, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[296], e);
        }
    }

    /* renamed from: e */
    public String mo2933e(long j, String str, String str2, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoDroitServeur(this.f2213a, j, str, str2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[7], e);
        }
    }

    /* renamed from: e */
    public String mo2934e(long j, String str, String str2, String str3) throws C0841b, WDJNIException {
        try {
            return jniHListeMotVide(this.f2213a, j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[287], e);
        }
    }

    /* renamed from: e */
    public String mo2935e(String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeServeur(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.jk], e);
        }
    }

    /* renamed from: e */
    public boolean mo2936e(long j) throws C0841b, WDJNIException {
        try {
            return jniHOuvreConnexion(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[87], e);
        }
    }

    /* renamed from: e */
    public boolean mo2937e(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHBloqueFichier(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[290], e);
        }
    }

    /* renamed from: e */
    public boolean mo2938e(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniGetPropRubriqueBoolean(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[21], e);
        }
    }

    /* renamed from: e */
    public boolean mo2939e(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeParametre(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[242], e);
        }
    }

    /* renamed from: e */
    public boolean mo2940e(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeBaseDeDonnees(this.f2213a, j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[117], e);
        }
    }

    /* renamed from: e */
    public boolean mo2941e(long j, String str, String str2) throws C0841b, WDJNIException {
        if (j < 0) {
            return jniHActiveTriggerServeur(this.f2213a, str, str2);
        }
        try {
            return jniHActiveTriggerServeur(this.f2213a, j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[263], e);
        }
    }

    /* renamed from: e */
    public boolean mo2942e(String str) throws C0841b, WDJNIException {
        try {
            return jniHAnnuleAlias(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[4], e);
        }
    }

    /* renamed from: e */
    public boolean mo2943e(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHPasseSQL(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Jn], e);
        }
    }

    /* renamed from: f */
    public int mo2944f(long j) throws C0841b, WDJNIException {
        try {
            return jniHVersion(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[289], e);
        }
    }

    /* renamed from: f */
    public long mo2945f(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniGetIdRubriqueHF(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[93], e);
        }
    }

    /* renamed from: f */
    public String mo2946f(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoSauvegarde(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Hn], e);
        }
    }

    /* renamed from: f */
    public String mo2947f(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHInfoBlocage(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[71], e);
        }
    }

    /* renamed from: f */
    public String mo2948f(long j, long j2, int i) throws WDJNIException {
        try {
            return jniGetPropRubriqueString(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.kh], e);
        }
    }

    /* renamed from: f */
    public String mo2949f(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHListeUtilisateurConnecte(this.f2213a, j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[109], e);
        }
    }

    /* renamed from: f */
    public boolean mo2950f() throws C0841b, WDJNIException {
        try {
            return jniHAliasTous(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[104], e);
        }
    }

    /* renamed from: f */
    public boolean mo2951f(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHEnvoieMessageVersClient(this.f2213a, j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[91], e);
        }
    }

    /* renamed from: f */
    public boolean mo2952f(String str) throws C0841b, WDJNIException {
        try {
            return jniHPasseSQL(this.f2213a, str, null);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Jn], e);
        }
    }

    /* renamed from: f */
    public boolean mo2953f(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHSubstRep(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[72], e);
        }
    }

    /* renamed from: f */
    public byte[] mo2954f(String str, int i) throws C0841b, WDJNIException {
        try {
            return jniSQLLitMemo(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[165], e);
        }
    }

    /* renamed from: g */
    public int mo2955g(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniSQLExec(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[193], e);
        }
    }

    /* renamed from: g */
    public String mo2956g(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeBaseDeDonnees(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[90], e);
        }
    }

    /* renamed from: g */
    public String mo2957g(String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeFichier(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[26], e);
        }
    }

    /* renamed from: g */
    public boolean mo2958g() throws C0841b, WDJNIException {
        try {
            return jniHErreurIntegrite(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Hw], e);
        }
    }

    /* renamed from: g */
    public boolean mo2959g(long j) throws C0841b, WDJNIException {
        try {
            return jniHTransactionLibere(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[31], e);
        }
    }

    /* renamed from: g */
    public boolean mo2960g(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHChangeConnexion(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[293], e);
        }
    }

    /* renamed from: g */
    public boolean mo2961g(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHStatCalcule(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Cv], e);
        }
    }

    /* renamed from: g */
    public boolean mo2962g(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHFinInterditAccesBaseDeDonnees(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[252], e);
        }
    }

    /* renamed from: g */
    public boolean mo2963g(long j, String str, int i) throws C0841b, WDJNIException {
        try {
            return jniHDeconnecteClient(this.f2213a, j, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[68], e);
        }
    }

    /* renamed from: g */
    public boolean mo2964g(long j, String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHTransactionDebutSurConnexion(this.f2213a, j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[111], e);
        }
    }

    /* renamed from: g */
    public boolean mo2965g(String str) throws C0841b, WDJNIException {
        try {
            return jniHPasseTous(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[24], e);
        }
    }

    public native long getNbEnrWhileFilling(long j, long j2);

    /* renamed from: h */
    public Object mo2966h(String str, String str2) throws C0841b, WDJNIException {
        long d = mo2917d(f2212z[18] + System.currentTimeMillis());
        try {
            if (!mo2828a(d, 0, 0, str)) {
                return null;
            }
            long f = mo2945f(d, str2);
            try {
                return !m4706a(true, d, f, 0) ? null : m4604T(f);
            } catch (C0841b e) {
                throw e;
            }
        } catch (C0841b e2) {
            throw e2;
        }
    }

    /* renamed from: h */
    public String mo2967h(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoServeur(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[122], e);
        }
    }

    /* renamed from: h */
    public void mo2968h(String str) throws C0841b, WDJNIException {
        try {
            jniSQLInfoGene(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Eg], e);
        }
    }

    /* renamed from: h */
    public void mo2969h(String str, int i) throws C0841b, WDJNIException {
        try {
            jniSQLPremier(this.f2213a, str, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[3], e);
        }
    }

    /* renamed from: h */
    public boolean mo2970h() throws C0841b, WDJNIException {
        try {
            return jniHErreurMotDePasse(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[160], e);
        }
    }

    /* renamed from: h */
    public boolean mo2971h(long j) throws C0841b, WDJNIException {
        try {
            return jniHSimuleReseau(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[46], e);
        }
    }

    /* renamed from: h */
    public boolean mo2972h(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHTransactionLibereEnreg(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[31], e);
        }
    }

    /* renamed from: h */
    public boolean mo2973h(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHBloqueNumEnr(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[12], e);
        }
    }

    /* renamed from: h */
    public boolean mo2974h(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHMaintenanceServeur(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[240], e);
        }
    }

    /* renamed from: i */
    public int mo2975i(String str) throws C0841b, WDJNIException {
        try {
            return jniSQLAvance(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[218], e);
        }
    }

    /* renamed from: i */
    public C0845h mo2976i(long j, int i) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: i */
    public String mo2977i(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniGetLangueDecrit(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[6], e);
        }
    }

    /* renamed from: i */
    public String mo2978i(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHInfoAnalyse(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.hp], e);
        }
    }

    /* renamed from: i */
    public void mo2979i(long j) throws C0841b, WDJNIException {
        if (j == -1) {
            try {
                jniHForceEcritureTous(this.f2213a);
                return;
            } catch (UnsatisfiedLinkError e) {
                throw new WDJNIException(f2212z[262], e);
            }
        }
        jniHForceEcriture(this.f2213a, j);
    }

    /* renamed from: i */
    public boolean mo2980i() throws C0841b, WDJNIException {
        try {
            return jniSQLEnDehors(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[281], e);
        }
    }

    /* renamed from: i */
    public boolean mo2981i(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHRaye(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Ru], e);
        }
    }

    /* renamed from: i */
    public boolean mo2982i(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHFichierExiste(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[128], e);
        }
    }

    public native boolean isCanGiveNbEnrWhileFilling(long j, long j2);

    public native boolean isNbEnrNeedParse(long j, long j2, long j3);

    /* renamed from: j */
    public int mo2983j() throws C0841b, WDJNIException {
        try {
            return jniSQLNbCol(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[16], e);
        }
    }

    /* renamed from: j */
    public long mo2984j(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHNbEnr(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[11], e);
        }
    }

    /* renamed from: j */
    public long mo2985j(String str) throws C0841b, WDJNIException {
        try {
            return jniGetIdConnexionHF(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[174], e);
        }
    }

    /* renamed from: j */
    public String mo2986j(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHDateEnreg(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.bh], e);
        }
    }

    /* renamed from: j */
    public boolean mo2987j(long j) throws C0841b, WDJNIException {
        try {
            return isCanGiveNbEnrWhileFilling(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Ep], e);
        }
    }

    /* renamed from: j */
    public boolean mo2988j(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHEcrit(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Yw], e);
        }
    }

    /* renamed from: j */
    public boolean mo2989j(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHModifieGroupe(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[189], e);
        }
    }

    /* renamed from: j */
    public boolean mo2990j(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHOuvreAnalyse(this.f2213a, str, str2, null, null, null);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[80], e);
        }
    }

    public native void jniFreeHFContext(long j);

    public native boolean jniGetHEnDehors(long j, long j2);

    public native boolean jniGetHTrouve(long j, long j2);

    public native long jniGetIdConnexionHF(long j, String str);

    public native long jniGetIdFichierHF(long j, String str);

    public native long jniGetIdRubriqueHF(long j, long j2, String str);

    public native long[] jniGetIdRubriqueRequete(long j, long j2);

    public native String jniGetLangue(long j, long j2, long j3);

    public native String jniGetLangueDecrit(long j, long j2, long j3);

    public native String jniGetNomFichierRubrique(long j, long j2);

    public native String jniGetNomOrigineRubrique(long j, long j2);

    public native String jniGetNomPhysique(long j, long j2);

    public native String jniGetNomRubrique(long j, long j2);

    public native boolean jniGetNouvelEnregistrement(long j, long j2);

    public native boolean jniGetPropFichierBool(long j, long j2, int i);

    public native long jniGetPropFichierLong(long j, long j2, int i);

    public native String jniGetPropFichierString(long j, long j2, int i);

    public native boolean jniGetPropRubriqueBoolean(long j, long j2, long j3, int i);

    public native long jniGetPropRubriqueLong(long j, long j2, long j3, int i);

    public native String jniGetPropRubriqueString(long j, long j2, long j3, int i);

    public native boolean jniGetRubriqueBoolean(long j, long j2);

    public native byte jniGetRubriqueByte(long j, long j2);

    public native byte[] jniGetRubriqueByteArray(long j, long j2);

    public native double jniGetRubriqueDouble(long j, long j2);

    public native float jniGetRubriqueFloat(long j, long j2);

    public native int jniGetRubriqueInteger(long j, long j2);

    public native long jniGetRubriqueLong(long j, long j2);

    public native short jniGetRubriqueShort(long j, long j2);

    public native String jniGetRubriqueString(long j, long j2);

    public native int jniGetTypeRubrique(long j, long j2);

    public native WDObjet jniGetVariableHF(long j, int i);

    public native boolean jniHActiveFiltre(long j, long j2);

    public native boolean jniHActiveTriggerServeur(long j, long j2, String str, String str2);

    public native boolean jniHActiveTriggerServeur(long j, String str, String str2);

    public native boolean jniHAjoute(long j, long j2, int i);

    public native boolean jniHAjouteGroupe(long j, long j2);

    public native boolean jniHAjouteUtilisateur(long j, long j2);

    public native boolean jniHAlias(long j, long j2, String str);

    public native boolean jniHAliasTous(long j);

    public native boolean jniHAnnuleAlias(long j, String str);

    public native boolean jniHAnnuleDeclaration(long j, long j2);

    public native boolean jniHAnnuleRecherche(long j, long j2, long j3);

    public native boolean jniHAnnuleSauvegarde(long j, long j2, int i);

    public native boolean jniHAttacheMemo(long j, long j2, long j3, String str, int i, String str2);

    public native boolean jniHAvance(long j, long j2, long j3, long j4, int i);

    public native boolean jniHBloqueFichier(long j, long j2, int i);

    public native boolean jniHBloqueNumEnr(long j, long j2, long j3, int i);

    public native boolean jniHChangeCle(long j, long j2, long j3, int i);

    public native boolean jniHChangeConnexion(long j, long j2, long j3);

    public native boolean jniHChangeConnexion(long j, String str, long j2);

    public native boolean jniHChangeConnexionTous(long j, long j2);

    public native boolean jniHChangeMotDePasse(long j, long j2, String str);

    public native boolean jniHChangeNom(long j, long j2, String str);

    public native boolean jniHChangeNom(long j, String str, String str2);

    public native boolean jniHChangeRep(long j, long j2, String str);

    public native boolean jniHChangeRep(long j, String str, String str2);

    public native boolean jniHChangeRepSQL(long j, String str, String str2);

    public native boolean jniHChangeRepTous(long j, String str);

    public native WDObjet jniHChargeParametre(long j, long j2, String str, WDObjet wDObjet);

    public native int jniHCompareRubrique(long j, long j2, long j3, WDObjet wDObjet, WDObjet wDObjet2);

    public native byte[] jniHConstruitValCle(long j, long j2, long j3, String[] strArr);

    public native boolean jniHCopieFichier(long j, long j2, String str, long j3, String str2, int i, WDJaugeJNI wDJaugeJNI, String str3);

    public native boolean jniHCreation(long j, long j2, String str, String str2, String str3, int i);

    public native boolean jniHCreationSiInexistant(long j, long j2, String str, String str2, String str3, int i);

    public native boolean jniHCreeTriggerServeur(long j, String str);

    public native String jniHDateEnreg(long j, long j2, long j3);

    public native String jniHDbg(long j, long j2, int i, String str);

    public native boolean jniHDebloqueFichier(long j, long j2);

    public native boolean jniHDebloqueNumEnr(long j, long j2, long j3);

    public native byte[] jniHDeclareExterneCS(long j, String str, String str2, long j2);

    public native byte[] jniHDeclareExterneClassic(long j, String str, String str2, String str3);

    public native boolean jniHDeconnecteClient(long j, long j2, String str, int i);

    public native boolean jniHDecritConnexion(long j, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2);

    public native boolean jniHDecritTriggerServeur(long j, long j2, String str, String str2, int i, String str3, String str4);

    public native boolean jniHDecritTriggerServeur(long j, String str, String str2, int i, String str3, String str4);

    public native boolean jniHDernier(long j, long j2, long j3, int i);

    public native boolean jniHDesactiveFiltre(long j, long j2);

    public native boolean jniHDesactiveTriggerServeur(long j, long j2, String str, String str2);

    public native boolean jniHDesactiveTriggerServeur(long j, String str, String str2);

    public native boolean jniHDetruitTriggerServeur(long j, long j2, String str, String str2);

    public native boolean jniHDetruitTriggerServeur(long j, String str, String str2);

    public native boolean jniHDupliqueBaseDeDonnees(long j, long j2, String str, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHEcrit(long j, long j2, long j3, int i);

    public native String jniHEnregistrementVersJSON(long j, long j2, String str);

    public native String jniHEnregistrementVersXML(long j, long j2, String str, int i);

    public native boolean jniHEnvoieMessageVersClient(long j, long j2, String str, int i);

    public native int jniHErreur(long j, int i);

    public native boolean jniHErreurBlocage(long j);

    public native boolean jniHErreurDoublon(long j);

    public native String jniHErreurInfo(long j, int i);

    public native boolean jniHErreurIntegrite(long j);

    public native boolean jniHErreurMotDePasse(long j);

    public native int jniHEtat(long j, long j2, long j3);

    public native WDObjet jniHExecuteProcedure(long j, long j2, String str, WDObjet[] wDObjetArr);

    public native boolean jniHExecuteRequete(long j, long j2, long j3, int i, String[] strArr);

    public native boolean jniHExecuteRequeteSQL(long j, long j2, long j3, int i, String str);

    public native boolean jniHExporteJSON(long j, long j2, String str, String str2, int i, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHExporteXML(long j, long j2, String str, String str2, int i, WDJaugeJNI wDJaugeJNI);

    public native long jniHFContext();

    public native long jniHFCopieContext(long j);

    public native long jniHFCopieContextLight(long j);

    public native String[] jniHFTListeMot(long j, long j2, String str);

    public native boolean jniHFerme(long j, long j2);

    public native boolean jniHFermeConnexion(long j, long j2);

    public native boolean jniHFermeTous(long j);

    public native boolean jniHFichierExiste(long j, long j2);

    public native boolean jniHFichierExiste(long j, long j2, String str);

    public native String jniHFiltreBinBin(long j, long j2, long j3, byte[] bArr, byte[] bArr2, String str);

    public native String jniHFiltreBinString(long j, long j2, long j3, byte[] bArr, String str, String str2);

    public native String jniHFiltreCommencePar(long j, long j2, long j3, String[] strArr);

    public native String jniHFiltreCommenceParBin(long j, long j2, long j3, byte[] bArr);

    public native String jniHFiltreComprisEntre(long j, long j2, long j3, WDObjet[] wDObjetArr);

    public native String jniHFiltreIdentique(long j, long j2, long j3, String[] strArr);

    public native String jniHFiltreIdentiqueBin(long j, long j2, long j3, byte[] bArr);

    public native String jniHFiltreStringBin(long j, long j2, long j3, String str, byte[] bArr, String str2);

    public native String jniHFiltreStringString(long j, long j2, long j3, String str, String str2, String str3);

    public native boolean jniHFinInterditAccesBaseDeDonnees(long j, long j2, String str);

    public native void jniHForceEcriture(long j, long j2);

    public native void jniHForceEcritureTous(long j);

    public native int jniHGereCache(long j, int i, long j2, long j3, int i2);

    public native boolean jniHGereDoublon(long j, long j2, long j3, boolean z);

    public native boolean jniHGereIntegrite(long j, String str, long j2, int i, boolean z);

    public native int jniHGereMemo(long j, long j2, long j3, int i);

    public native String jniHGereServeur(long j, long j2, int i);

    public native String jniHGereServeur(long j, long j2, int i, WDObjet wDObjet);

    public native boolean jniHGereTransaction(long j, long j2, boolean z);

    public native boolean jniHGereTransaction(long j, String str, boolean z);

    public native boolean jniHGereTransactionTous(long j, boolean z);

    public native boolean jniHImporteJSON(long j, long j2, String str, String str2, String str3, int i, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHImporteTexte(long j, long j2, String str, String str2, String str3, int i, WDJaugeJNI wDJaugeJNI);

    public native String jniHInfoAnalyse(long j, String str, String str2);

    public native String jniHInfoBlocage(long j, long j2, long j3);

    public native String jniHInfoBlocageConnexion(long j, long j2, String str, long j3);

    public native String jniHInfoDroitBaseDeDonnees(long j, long j2, String str, String str2, String str3, int i);

    public native String jniHInfoDroitFichier(long j, long j2, String str, String str2, String str3, String str4, int i);

    public native String jniHInfoDroitServeur(long j, long j2, String str, String str2, int i);

    public native String jniHInfoDroitVue(long j, long j2, String str, String str2, String str3, String str4, int i);

    public native WDObjet jniHInfoFichier(long j, long j2, int i);

    public native WDObjet jniHInfoFichier(long j, long j2, String str, int i);

    public native boolean jniHInfoGroupe(long j, long j2, String str);

    public native String jniHInfoMemo(long j, long j2, long j3);

    public native String jniHInfoProprieteBaseDeDonnees(long j, long j2, String str, String str2);

    public native String jniHInfoProprieteFichier(long j, long j2, String str, String str2, String str3);

    public native String jniHInfoProprieteServeur(long j, long j2, String str);

    public native String jniHInfoRubrique(long j, long j2, int i);

    public native String jniHInfoRubrique(long j, long j2, long j3);

    public native String jniHInfoSauvegarde(long j, long j2, int i);

    public native String jniHInfoServeur(long j, long j2, int i);

    public native boolean jniHInfoUtilisateur(long j, long j2, String str);

    public native boolean jniHInterditAccesBaseDeDonnees(long j, long j2, String str);

    public native boolean jniHLibere(long j, long j2);

    public native boolean jniHLiberePosition(long j, int i);

    public native String jniHListeBaseDeDonnees(long j, long j2, int i);

    public native String jniHListeCle(long j, long j2, String str, String str2, int i);

    public native String jniHListeElementStocke(long j, long j2, int i);

    public native String jniHListeFichier(long j, long j2, int i);

    public native String jniHListeFichier(long j, String str, int i);

    public native String jniHListeFichier(long j, String str, String str2, int i);

    public native String jniHListeGroupe(long j, long j2);

    public native String jniHListeIndexFullText(long j, long j2, String str, String str2, int i);

    public native String jniHListeLiaison(long j, long j2, long j3, int i);

    public native String jniHListeLiaison(long j, long j2, String str, String str2, int i);

    public native String jniHListeMotVide(long j, long j2, String str, String str2, String str3);

    public native String jniHListeParametre(long j, long j2);

    public native String jniHListeRubrique(long j, long j2, String str, String str2, int i);

    public native String jniHListeServeur(long j, String str, int i);

    public native String jniHListeSynonyme(long j, long j2, String str, String str2, String str3);

    public native String jniHListeTache(long j, long j2);

    public native String jniHListeTriggerServeur(long j, long j2, String str);

    public native String jniHListeUtilisateur(long j, long j2);

    public native String jniHListeUtilisateurConnecte(long j, long j2, String str, String str2);

    public native boolean jniHLit(long j, long j2, long j3, int i);

    public native boolean jniHLitDernier(long j, long j2, long j3, int i);

    public native boolean jniHLitPrecedent(long j, long j2, long j3, int i);

    public native boolean jniHLitPremier(long j, long j2, long j3, int i);

    public native boolean jniHLitRechercheDernier(long j, long j2, long j3, String str, int i);

    public native boolean jniHLitRechercheDernierBin(long j, long j2, long j3, byte[] bArr, int i);

    public native boolean jniHLitRecherchePremier(long j, long j2, long j3, String str, int i);

    public native boolean jniHLitRecherchePremierBin(long j, long j2, long j3, byte[] bArr, int i);

    public native boolean jniHLitSuivant(long j, long j2, long j3, int i);

    public native boolean jniHMaintenanceServeur(long j, long j2, String str);

    public native boolean jniHMiseAJourCollection(long j, long j2, String str, boolean z);

    public native boolean jniHMiseAJourRequete(long j, long j2, String str, boolean z);

    public native int jniHMode(long j, long j2, int i, int i2);

    public native int jniHMode(long j, String str, int i, int i2);

    public native int jniHModeTous(long j, int i, int i2);

    public native boolean jniHModifie(long j, long j2, int i);

    public native boolean jniHModifie(long j, long j2, long j3, int i);

    public native boolean jniHModifieDroitBaseDeDonnees(long j, long j2, String str, String str2, String str3, String str4);

    public native boolean jniHModifieDroitFichier(long j, long j2, String str, String str2, String str3, String str4, String str5);

    public native boolean jniHModifieDroitServeur(long j, long j2, String str, String str2, String str3);

    public native boolean jniHModifieDroitVue(long j, long j2, String str, String str2, String str3, String str4, String str5);

    public native boolean jniHModifieGroupe(long j, long j2, String str);

    public native boolean jniHModifieProprieteBaseDeDonnees(long j, long j2, String str, String str2, String str3);

    public native boolean jniHModifieProprieteFichier(long j, long j2, String str, String str2, String str3, String str4);

    public native boolean jniHModifieProprieteServeur(long j, long j2, String str, String str2);

    public native boolean jniHModifieStructure(long j, long j2, int i, String str, String str2);

    public native boolean jniHModifieStructureTous(long j, int i, String str, String str2);

    public native boolean jniHModifieUtilisateur(long j, long j2, String str);

    public native long jniHNbEnr(long j, long j2, int i);

    public native long jniHNumEnr(long j, long j2);

    public native boolean jniHOuvre(long j, long j2, String str, int i);

    public native boolean jniHOuvreAnalyse(long j, String str, String str2, String str3, String str4, String str5);

    public native boolean jniHOuvreAnalyse(long j, String str, byte[] bArr);

    public native boolean jniHOuvreConnexion(long j, long j2);

    public native boolean jniHOuvreNouvelleConnexion(long j, long j2, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2);

    public native boolean jniHOuvreTous(long j, String str, int i);

    public native boolean jniHPasse(long j, long j2, String str);

    public native boolean jniHPasse(long j, String str, String str2);

    public native boolean jniHPasseSQL(long j, String str, String str2);

    public native boolean jniHPasseTous(long j, String str);

    public native int jniHPositionCourante(long j, long j2, long j3, int i);

    public native boolean jniHPositionne(long j, long j2, long j3, int i, int i2);

    public native boolean jniHPrecedent(long j, long j2, long j3, int i);

    public native boolean jniHPremier(long j, long j2, long j3, int i);

    public native int jniHPriorite(long j, long j2);

    public native int jniHPriorite(long j, long j2, int i);

    public native boolean jniHPrioriteClient(long j, long j2, int i);

    public native boolean jniHRAZGroupe(long j);

    public native boolean jniHRaye(long j, long j2, long j3, int i);

    public native boolean jniHRaz(long j, long j2, long j3);

    public native boolean jniHRazClient(long j);

    public native boolean jniHRazTous(long j, long j2);

    public native boolean jniHRazUtilisateur(long j);

    public native boolean jniHRechercheDernier(long j, long j2, long j3, String str, int i);

    public native boolean jniHRechercheDernierBin(long j, long j2, long j3, byte[] bArr, int i);

    public native boolean jniHRecherchePremier(long j, long j2, long j3, String str, int i);

    public native boolean jniHRecherchePremierBin(long j, long j2, long j3, byte[] bArr, int i);

    public native boolean jniHReconnecte(long j);

    public native boolean jniHRecule(long j, long j2, long j3, long j4, int i);

    public native WDObjet jniHRecupereRubrique(long j, long j2, int i, int i2);

    public native WDObjet jniHRecupereRubrique(long j, long j2, int i, String str);

    public native boolean jniHRecupereSauvegarde(long j, long j2, int i, String str, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHRecupereSauvegarde(long j, long j2, String str, String str2, WDJaugeJNI wDJaugeJNI);

    public native int jniHReindexationEnCours(long j, long j2, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHReindexe(long j, long j2, int i, WDJaugeJNI wDJaugeJNI, int i2);

    public native boolean jniHRestaureSauvegarde(long j, long j2, int i, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHRestaureSauvegarde(long j, long j2, int i, String str, String str2, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHRestaureSauvegarde(long j, long j2, String str, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHRestaureSauvegarde(long j, long j2, String str, String str2, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHRestaureSauvegarde(long j, long j2, String str, String str2, String str3, WDJaugeJNI wDJaugeJNI);

    public native boolean jniHRetourPosition(long j, long j2, int i, int i2);

    public native boolean jniHSauveParametre(long j, long j2, String str, WDObjet wDObjet);

    public native int jniHSauvePosition(long j, long j2, long j3);

    public native int jniHSauvegarde(long j, long j2, String str, String str2, boolean z, String str3, WDJaugeJNI wDJaugeJNI);

    public native int jniHSecurite(long j, long j2, int i);

    public native boolean jniHSimuleReseau(long j, long j2);

    public native boolean jniHSimuleReseau(long j, long j2, int i);

    public native boolean jniHStatCalcule(long j, long j2, long j3, int i);

    public native String jniHStatDate(long j, long j2, long j3);

    public native String jniHStatHeure(long j, long j2, long j3);

    public native long jniHStatNbDoublon(long j, long j2, long j3);

    public native long jniHStatNbEnr(long j, long j2, long j3);

    public native long jniHStatNbEnrIntervalle(long j, long j2, long j3, WDObjet wDObjet, WDObjet wDObjet2);

    public native long jniHStatNbEnrIntervalle(long j, long j2, long j3, WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2);

    public native boolean jniHSubstRep(long j, String str, String str2);

    public native boolean jniHSuivant(long j, long j2, long j3, int i);

    public native boolean jniHSupprime(long j, long j2, long j3, int i);

    public native boolean jniHSupprimeBaseDeDonnees(long j, long j2, String str, int i);

    public native boolean jniHSupprimeCollection(long j, long j2, String str);

    public native boolean jniHSupprimeFichier(long j, long j2, String str, int i);

    public native boolean jniHSupprimeGroupe(long j, long j2, String str);

    public native boolean jniHSupprimeParametre(long j, long j2, String str);

    public native boolean jniHSupprimeRepertoire(long j, long j2, String str);

    public native boolean jniHSupprimeRequete(long j, long j2, String str);

    public native boolean jniHSupprimeSauvegarde(long j, long j2, int i);

    public native boolean jniHSupprimeTache(long j, long j2, int i);

    public native boolean jniHSupprimeTout(long j, long j2);

    public native boolean jniHSupprimeUtilisateur(long j, long j2, String str);

    public native boolean jniHTransactionAnnule(long j, String str);

    public native boolean jniHTransactionAnnuleSurConnexion(long j, long j2);

    public native boolean jniHTransactionDebut(long j, String str, String str2);

    public native boolean jniHTransactionDebutSurConnexion(long j, long j2, String str, String str2);

    public native boolean jniHTransactionFin(long j);

    public native boolean jniHTransactionFinSurConnexion(long j, long j2);

    public native boolean jniHTransactionInterrompue(long j, String str);

    public native boolean jniHTransactionIsolation(long j, long j2, int i);

    public native boolean jniHTransactionLibere(long j, long j2);

    public native boolean jniHTransactionLibereEnreg(long j, long j2, long j3);

    public native String jniHTransactionListe(long j, long j2);

    public native boolean jniHVerifieInaltere(long j, long j2, long j3, WDJaugeJNI wDJaugeJNI);

    public native int jniHVerifieIndex(long j, long j2, long j3, WDJaugeJNI wDJaugeJNI);

    public native int jniHVerifieStruture(long j, long j2, int i);

    public native int jniHVerifieStruture(long j, String str, int i);

    public native int jniHVerifieStrutureTous(long j, int i);

    public native boolean jniHVersFichier(long j, long j2, String str);

    public native boolean jniHVersRubrique(long j, long j2, int i, int i2, WDObjet wDObjet);

    public native boolean jniHVersRubrique(long j, long j2, int i, WDObjet wDObjet);

    public native boolean jniHVersRubrique(long j, long j2, int i, String str, WDObjet wDObjet);

    public native int jniHVersion(long j, long j2);

    public native boolean jniIsErreurFatale(long j);

    public native boolean jniIsNull(long j, long j2, long j3);

    public native void jniLibererIdConnexion(long j, long j2);

    public native void jniLibererIdFichier(long j, long[] jArr);

    public native void jniLibererIdRubrique(long j, long[] jArr);

    public native int jniSQLAvance(long j, String str);

    public native String jniSQLBase(long j);

    public native int jniSQLBloque(long j, String str, String str2);

    public native int jniSQLChangeConnexion(long j, int i);

    public native String jniSQLCol(long j, String str, int i);

    public native String jniSQLColonne(long j, String str, boolean z);

    public native String jniSQLColonneTable(long j, int i, String str, boolean z);

    public native int jniSQLConnecte(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public native int jniSQLConnexion(long j);

    public native int jniSQLDeconnecte(long j);

    public native void jniSQLDernier(long j, String str);

    public native int jniSQLEnCours(long j);

    public native boolean jniSQLEnDehors(long j);

    public native String jniSQLErreur(long j);

    public native int jniSQLExec(long j, String str, String str2);

    public native int jniSQLFerme(long j, String str);

    public native String jniSQLFormatColonne(long j);

    public native void jniSQLInfoGene(long j, String str);

    public native String jniSQLListeTables(long j, boolean z, boolean z2);

    public native String jniSQLLitCol(long j, String str, int i);

    public native byte[] jniSQLLitMemo(long j, String str, int i);

    public native String jniSQLLitMemoTexte(long j, String str, int i);

    public native String jniSQLMesErreur(long j);

    public native int jniSQLModifie(long j, String str, int i, String str2);

    public native int jniSQLNbCol(long j);

    public native int jniSQLNbLig(long j);

    public native void jniSQLPositionne(long j, String str, int i);

    public native void jniSQLPrecedent(long j, String str);

    public native void jniSQLPremier(long j, String str, int i);

    public native boolean jniSQLRecupEnCours(long j);

    public native int jniSQLReqExiste(long j, String str);

    public native int jniSQLRequete(long j);

    public native void jniSQLSuivant(long j, String str);

    public native String[] jniSQLTitreCol(long j);

    public native boolean jniSQLTransaction(long j, int i);

    public native boolean jniSQLTransactionSurConnexion(long j, int i, String str);

    public native String[] jniSetHClient(long j, String[] strArr);

    public native void jniSetRubriqueBoolean(long j, long j2, boolean z);

    public native void jniSetRubriqueByte(long j, long j2, byte b);

    public native void jniSetRubriqueByteArray(long j, long j2, byte[] bArr);

    public native void jniSetRubriqueDouble(long j, long j2, double d);

    public native void jniSetRubriqueFloat(long j, long j2, float f);

    public native void jniSetRubriqueInteger(long j, long j2, int i);

    public native void jniSetRubriqueLong(long j, long j2, long j3);

    public native void jniSetRubriqueShort(long j, long j2, short s);

    public native void jniSetRubriqueString(long j, long j2, String str);

    public native void jniSetValeurNull(long j, long j2, long j3);

    public native boolean jniSetVariableHF(long j, int i, WDObjet wDObjet);

    /* renamed from: k */
    public WDObjet mo2991k(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoFichier(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[52], e);
        }
    }

    /* renamed from: k */
    public C0845h mo2992k(long j, long j2, int i) throws C0841b, WDJNIException {
        return null;
    }

    /* renamed from: k */
    public String mo2993k(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniGetLangue(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[149], e);
        }
    }

    /* renamed from: k */
    public boolean mo2994k() throws C0841b {
        return false;
    }

    /* renamed from: k */
    public boolean mo2995k(long j) throws C0841b, WDJNIException {
        try {
            return jniHDesactiveFiltre(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[61], e);
        }
    }

    /* renamed from: k */
    public boolean mo2996k(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHInterditAccesBaseDeDonnees(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[151], e);
        }
    }

    /* renamed from: k */
    public boolean mo2997k(String str) throws C0841b, WDJNIException {
        try {
            return jniHTransactionAnnule(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0538a.Nb], e);
        }
    }

    /* renamed from: k */
    public boolean mo2998k(String str, String str2) throws C0841b, WDJNIException {
        try {
            return jniHDetruitTriggerServeur(this.f2213a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[141], e);
        }
    }

    /* renamed from: l */
    public long mo2999l(long j, long j2, int i) throws WDJNIException {
        try {
            return jniGetPropRubriqueLong(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[89], e);
        }
    }

    /* renamed from: l */
    public String mo3000l(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHInfoRubrique(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[79], e);
        }
    }

    /* renamed from: l */
    public boolean mo3001l() throws C0841b, WDJNIException {
        try {
            return jniHRazClient(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.af], e);
        }
    }

    /* renamed from: l */
    public boolean mo3002l(long j) throws C0841b, WDJNIException {
        try {
            return jniHAjouteGroupe(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[119], e);
        }
    }

    /* renamed from: l */
    public boolean mo3003l(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHTransactionIsolation(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.co], e);
        }
    }

    /* renamed from: l */
    public boolean mo3004l(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeRequete(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[233], e);
        }
    }

    /* renamed from: l */
    public boolean mo3005l(String str) throws C0841b, WDJNIException {
        try {
            return jniHCreeTriggerServeur(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[118], e);
        }
    }

    /* renamed from: m */
    public String mo3006m(long j, int i) throws WDJNIException {
        try {
            return jniGetPropFichierString(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[113], e);
        }
    }

    /* renamed from: m */
    public void mo3007m(long j, long j2) throws C0841b, WDJNIException {
        try {
            jniSetValeurNull(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[276], e);
        }
    }

    /* renamed from: m */
    public boolean mo3008m() throws C0841b, WDJNIException {
        try {
            return jniHTransactionFin(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[29], e);
        }
    }

    /* renamed from: m */
    public boolean mo3009m(long j) throws C0841b, WDJNIException {
        try {
            return jniGetNouvelEnregistrement(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[102], e);
        }
    }

    /* renamed from: m */
    public boolean mo3010m(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHSupprime(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[156], e);
        }
    }

    /* renamed from: m */
    public boolean mo3011m(String str) throws C0841b, WDJNIException {
        try {
            return jniHChangeRepTous(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Fb], e);
        }
    }

    /* renamed from: m */
    public String[] mo3012m(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHFTListeMot(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[58], e);
        }
    }

    /* renamed from: n */
    public int mo3013n(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHSecurite(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Ux], e);
        }
    }

    /* renamed from: n */
    public String mo3014n(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHFiltreStringString(this.f2213a, j, 0, null, null, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[278], e);
        }
    }

    /* renamed from: n */
    public void mo3015n(long j) throws C0841b, WDException {
    }

    /* renamed from: n */
    public void mo3016n(String str) throws C0841b, WDJNIException {
        try {
            jniSQLDernier(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[168], e);
        }
    }

    /* renamed from: n */
    public boolean mo3017n() throws C0841b, WDJNIException {
        try {
            return jniSQLRecupEnCours(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[228], e);
        }
    }

    /* renamed from: n */
    public boolean mo3018n(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHAnnuleRecherche(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[143], e);
        }
    }

    /* renamed from: n */
    public boolean m4880n(long j, long j2, int i) throws C0841b, WDJNIException {
        try {
            return jniHModifie(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[133], e);
        }
    }

    /* renamed from: o */
    public long mo3019o(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHStatNbEnr(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[180], e);
        }
    }

    /* renamed from: o */
    public void mo3020o() throws C0841b, WDJNIException {
        try {
            jniSQLDeconnecte(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[265], e);
        }
    }

    /* renamed from: o */
    public void mo3021o(long j) throws C0841b, WDJNIException {
        try {
            jniLibererIdConnexion(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Nr], e);
        }
    }

    /* renamed from: o */
    public void mo3022o(String str) throws C0841b, WDJNIException {
        try {
            jniSQLSuivant(this.f2213a, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0542t.f1193i], e);
        }
    }

    /* renamed from: o */
    public boolean mo3023o(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHPrioriteClient(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[38], e);
        }
    }

    /* renamed from: o */
    public boolean m4886o(long j, long j2, int i) throws WDJNIException {
        try {
            return jniHLit(this.f2213a, j, j2, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.pw], e);
        }
    }

    /* renamed from: o */
    public boolean mo3024o(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHChangeMotDePasse(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[231], e);
        }
    }

    /* renamed from: p */
    public int mo3025p() throws C0841b, WDJNIException {
        try {
            return jniSQLEnCours(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[20], e);
        }
    }

    /* renamed from: p */
    public String mo3026p(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHGereServeur(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[25], e);
        }
    }

    /* renamed from: p */
    public String mo3027p(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHStatHeure(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Tv], e);
        }
    }

    /* renamed from: p */
    public boolean mo3028p(long j) throws C0841b, WDJNIException {
        try {
            return jniHFerme(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0538a.Lb], e);
        }
    }

    /* renamed from: p */
    public boolean mo3029p(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHInfoUtilisateur(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[23], e);
        }
    }

    /* renamed from: q */
    public long mo3030q(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHStatNbDoublon(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[86], e);
        }
    }

    /* renamed from: q */
    public String mo3031q(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHInfoRubrique(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[79], e);
        }
    }

    /* renamed from: q */
    public boolean mo3032q(long j) throws C0841b, WDJNIException {
        try {
            return jniHTransactionFinSurConnexion(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[29], e);
        }
    }

    /* renamed from: q */
    public boolean mo3033q(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHChangeNom(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[94], e);
        }
    }

    /* renamed from: q */
    public String[] mo3034q() throws C0841b, WDJNIException {
        try {
            return jniSQLTitreCol(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[74], e);
        }
    }

    /* renamed from: r */
    public int mo3035r(long j) throws C0841b, WDJNIException {
        try {
            return jniHPriorite(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[260], e);
        }
    }

    /* renamed from: r */
    public long mo3036r(long j, int i) throws WDJNIException {
        try {
            return jniGetPropFichierLong(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Au], e);
        }
    }

    /* renamed from: r */
    public boolean mo3037r() throws C0841b, WDJNIException {
        try {
            return jniHRAZGroupe(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[216], e);
        }
    }

    /* renamed from: r */
    public boolean mo3038r(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniIsNull(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[63], e);
        }
    }

    /* renamed from: r */
    public boolean mo3039r(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeUtilisateur(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[49], e);
        }
    }

    /* renamed from: s */
    public String mo3040s(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHListeElementStocke(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[69], e);
        }
    }

    /* renamed from: s */
    public void mo3041s() throws C0841b, WDJNIException {
        if (this.f2213a != 0) {
            long j = this.f2213a;
            this.f2213a = 0;
            try {
                jniFreeHFContext(j);
            } catch (UnsatisfiedLinkError e) {
                throw new WDJNIException(f2212z[27], e);
            }
        }
    }

    /* renamed from: s */
    public boolean mo3042s(long j) throws C0841b, WDJNIException {
        try {
            return jniHFichierExiste(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[128], e);
        }
    }

    /* renamed from: s */
    public boolean mo3043s(long j, long j2) throws C0841b, WDJNIException {
        try {
            return jniHDebloqueNumEnr(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[12], e);
        }
    }

    /* renamed from: s */
    public boolean mo3044s(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeRepertoire(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[191], e);
        }
    }

    /* renamed from: t */
    public int mo3045t() throws C0841b, WDJNIException {
        try {
            return jniSQLNbLig(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[227], e);
        }
    }

    /* renamed from: t */
    public void m4909t(long j, long j2) throws WDJNIException {
        try {
            jniSetRubriqueLong(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[76], e);
        }
    }

    /* renamed from: t */
    public boolean mo3046t(long j) throws C0841b, WDJNIException {
        try {
            return jniHTransactionAnnuleSurConnexion(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0538a.Nb], e);
        }
    }

    /* renamed from: t */
    public boolean mo3047t(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeSauvegarde(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[138], e);
        }
    }

    /* renamed from: t */
    public boolean mo3048t(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHSupprimeCollection(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.hu], e);
        }
    }

    public native long tableVirtualMove(long j, long j2, long j3, long j4, int i);

    /* renamed from: u */
    public int mo3049u() throws C0841b, WDJNIException {
        try {
            return jniSQLRequete(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[5], e);
        }
    }

    /* renamed from: u */
    public int mo3050u(long j, int i) throws C0841b, WDJNIException {
        int jniHVerifieStrutureTous;
        if (j == -1) {
            try {
                jniHVerifieStrutureTous = jniHVerifieStrutureTous(this.f2213a, i);
            } catch (C0841b e) {
                throw e;
            }
        }
        try {
            jniHVerifieStrutureTous = jniHVerifieStruture(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e2) {
            throw new WDJNIException(f2212z[10], e2);
        }
        return jniHVerifieStrutureTous;
    }

    /* renamed from: u */
    public String mo3051u(long j) throws C0841b, WDJNIException {
        try {
            return jniHListeParametre(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[1], e);
        }
    }

    /* renamed from: u */
    public boolean m4916u(long j, long j2) throws WDJNIException {
        try {
            return jniHRaz(this.f2213a, j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[33], e);
        }
    }

    /* renamed from: u */
    public boolean mo3052u(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHVersFichier(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[101], e);
        }
    }

    /* renamed from: v */
    public long mo3053v(long j) throws C0841b, WDJNIException {
        try {
            return getNbEnrWhileFilling(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[88], e);
        }
    }

    /* renamed from: v */
    public boolean mo3054v() throws C0841b, WDJNIException {
        try {
            return jniHErreurBlocage(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[99], e);
        }
    }

    /* renamed from: v */
    public boolean mo3055v(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHSimuleReseau(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[46], e);
        }
    }

    /* renamed from: v */
    public boolean mo3056v(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHInfoGroupe(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[219], e);
        }
    }

    /* renamed from: w */
    public int mo3057w() throws C0841b, WDJNIException {
        try {
            return jniSQLConnexion(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[232], e);
        }
    }

    /* renamed from: w */
    public String mo3058w(long j) throws C0841b, WDJNIException {
        try {
            return jniHTransactionListe(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[294], e);
        }
    }

    /* renamed from: w */
    public boolean mo3059w(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHAnnuleSauvegarde(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[215], e);
        }
    }

    /* renamed from: w */
    public boolean mo3060w(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHAlias(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Bs], e);
        }
    }

    /* renamed from: x */
    public int mo3061x(long j) throws C0841b, WDJNIException {
        try {
            return jniHSauvePosition(this.f2213a, j, 0);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[97], e);
        }
    }

    /* renamed from: x */
    public final long mo3062x() {
        return this.f2213a;
    }

    /* renamed from: x */
    public String mo3063x(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHInfoProprieteServeur(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.f1465w], e);
        }
    }

    /* renamed from: x */
    public void m4929x(long j, int i) throws WDJNIException {
        try {
            jniSetRubriqueInteger(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[62], e);
        }
    }

    /* renamed from: y */
    public String mo3064y(long j) throws C0841b, WDJNIException {
        try {
            return jniHListeGroupe(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[131], e);
        }
    }

    /* renamed from: y */
    public String mo3065y(long j, String str) throws C0841b, WDJNIException {
        try {
            return jniHEnregistrementVersJSON(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.nn], e);
        }
    }

    /* renamed from: y */
    public boolean mo3066y() throws C0841b, WDJNIException {
        try {
            return jniIsErreurFatale(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[184], e);
        }
    }

    /* renamed from: y */
    public boolean m4933y(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHModifie(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[133], e);
        }
    }

    /* renamed from: z */
    public void m4934z(long j, String str) throws WDJNIException {
        try {
            jniSetRubriqueString(this.f2213a, j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[146], e);
        }
    }

    /* renamed from: z */
    public boolean mo3067z() throws C0841b, WDJNIException {
        try {
            return jniHRazUtilisateur(this.f2213a);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[C0607n.Px], e);
        }
    }

    /* renamed from: z */
    public boolean mo3068z(long j) throws C0841b, WDJNIException {
        try {
            return jniHFermeConnexion(this.f2213a, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[157], e);
        }
    }

    /* renamed from: z */
    public boolean m4937z(long j, int i) throws C0841b, WDJNIException {
        try {
            return jniHAjoute(this.f2213a, j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2212z[255], e);
        }
    }
}
