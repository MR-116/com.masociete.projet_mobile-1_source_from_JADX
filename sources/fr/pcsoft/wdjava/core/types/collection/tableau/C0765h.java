package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0558c;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import java.lang.reflect.Field;

/* renamed from: fr.pcsoft.wdjava.core.types.collection.tableau.h */
class C0765h implements C0761b {
    /* renamed from: z */
    private static final String[] f1997z = new String[]{C0765h.m3538z(C0765h.m3539z("\u0016\rc\u0005")), C0765h.m3538z(C0765h.m3539z("E\u001fu\b6+\u001fj\u0018;#\u0005d\u0016(5\tb\u0005 (\u001f\u0013:2\u001bi\u000e")), C0765h.m3538z(C0765h.m3539z("\u0010\rc\u0005")), C0765h.m3538z(C0765h.m3539z("\u000b\rc\u0005")), C0765h.m3538z(C0765h.m3539z("/7W5\u001a\u00153E6\fF>\u0000;\n\u0005³C?\u001bF;Rz\u0004\u00037E(\fF*F(I\u000f4S(\u0006\u0015*B9\u001d\u000f5It"))};
    /* renamed from: a */
    private Field f1998a;
    /* renamed from: b */
    private C0761b f1999b;
    final C0759o this$0;
    final Class val$classe;
    final String val$strLastFieldName;
    final String val$strParentFieldNames;

    C0765h(C0759o c0759o, Class cls, String str, String str2) {
        this.this$0 = c0759o;
        this.val$classe = cls;
        this.val$strParentFieldNames = str;
        this.val$strLastFieldName = str2;
    }

    /* renamed from: z */
    private static String m3538z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 102;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = 90;
                    break;
                default:
                    i2 = 105;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3539z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 105);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public WDObjet mo2671a(WDObjet wDObjet) {
        try {
            if (this.f1999b == null) {
                this.f1999b = this.this$0.m3421a(this.val$classe, this.val$strParentFieldNames);
            }
            WDObjet wDObjet2 = (WDObjet) this.f1999b.mo2671a(wDObjet).checkType(C0558c.class);
            try {
                if (this.f1998a == null) {
                    this.f1998a = C0735q.m3120a(wDObjet2.getClass(), this.val$strLastFieldName, f1997z[3]);
                    if (this.f1998a == null) {
                        this.f1998a = C0735q.m3120a(this.val$classe, this.val$strLastFieldName, f1997z[2]);
                    }
                    if (this.f1998a == null) {
                        this.f1998a = C0735q.m3120a(this.val$classe, this.val$strLastFieldName, f1997z[0]);
                    }
                    if (this.f1998a == null) {
                        WDErreurManager.m2883a(C0745b.m3222b(f1997z[1], this.val$strLastFieldName, C0735q.m3116a(this.val$classe)));
                    }
                    this.f1998a.setAccessible(true);
                }
                return (WDObjet) this.f1998a.get(wDObjet2);
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            C0691a.m2857a(f1997z[4], e2222);
            return null;
        }
    }
}
