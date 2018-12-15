package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import java.lang.reflect.Constructor;

public class WDInstance extends C0729v {
    /* renamed from: z */
    private static final String f1856z = m3103z(m3104z("\\@\u001a_|fD\b\\j5I\u000f\u0010lgÄ\u000fB/`C\u000f\u0010azX\u001cUcyHJYafY\u000b^lp\r\u000eU/yLJSct^\u0019U!"));
    /* renamed from: b */
    protected C0558c f1857b;

    public WDInstance(C0558c c0558c) {
        this(c0558c, c0558c.getClass());
    }

    protected WDInstance(C0558c c0558c, Class cls) {
        super(c0558c, cls);
    }

    /* renamed from: z */
    private static String m3103z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 21;
                    break;
                case 1:
                    i2 = 45;
                    break;
                case 2:
                    i2 = 106;
                    break;
                case 3:
                    i2 = 48;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3104z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 15);
        }
        return toCharArray;
    }

    public C0729v creerInstanceNonAllouee() {
        return new WDInstance(null, this.a);
    }

    protected C0558c getReference() {
        return this.f1857b;
    }

    public void razVariable() {
        try {
            if (this.a == null || !C0733z.class.isAssignableFrom(this.a)) {
                super.razVariable();
                return;
            }
            this.f1857b = null;
            try {
                Constructor b = C0735q.m3125b(this.a);
                if (b != null) {
                    this.f1857b = (C0558c) b.newInstance(new Object[0]);
                }
            } catch (WDException e) {
                throw e;
            } catch (Exception e2) {
                C0691a.m2857a(f1856z, e2);
            } catch (Throwable e3) {
                WDErreurManager.m2888b(e3);
            }
        } catch (WDException e4) {
            throw e4;
        }
    }

    public void setReference(C0558c c0558c) {
        this.f1857b = c0558c;
    }
}
