package fr.pcsoft.wdjava.core.poo;

import fr.pcsoft.wdjava.core.C0550t;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;

/* renamed from: fr.pcsoft.wdjava.core.poo.v */
public abstract class C0729v extends C0550t {
    /* renamed from: z */
    private static final String[] f1854z = new String[]{C0729v.m3099z(C0729v.m3100z("\u000f!@3ei*X)fc*S7d`+Y3")), C0729v.m3099z(C0729v.m3100z("\u000f+N<mx;H/fm)E'}i;B9fs%@:gy!")), C0729v.m3099z(C0729v.m3100z("\u000f%J0mo0M\"ac*S?fx!^2ax!S5dm7_3")), C0729v.m3099z(C0729v.m3100z("\u000f+N<mx;M0ni'X3wb+B)i`(C#m")), C0729v.m3099z(C0729v.m3100z("\u000f!^$wo+B%|~1O\"my6S%ib7S&i~%A3|~!")), C0729v.m3099z(C0729v.m3100z("\u000f!^$wm(@9km0E9fs%Y\"g")), C0729v.m3099z(C0729v.m3100z("\u000f+N<mx;H/fm)E'}i")), C0729v.m3099z(C0729v.m3100z("x\u001d|\u0013\bHCe\u0018[X\u0005b\u0015M\f\rb\u0000I@\rh\u0013\u0006"))};
    /* renamed from: a */
    protected final Class<C0558c> f1855a;

    protected C0729v(C0558c c0558c, Class cls) {
        setReference(c0558c);
        this.f1855a = cls;
    }

    /* renamed from: a */
    private void m3098a(WDObjet wDObjet, int i) {
        if ((wDObjet instanceof C0559b) && wDObjet.isVariableInterne()) {
            ((C0559b) wDObjet).mo2435a(false);
            i = 2;
        } else if (i == 1 && isInstanceDynamique()) {
            i = 2;
        }
        if (wDObjet.isValeurNull()) {
            liberer();
        } else if (wDObjet.isAllloue()) {
            switch (i) {
                case 2:
                    C0558c c0558c = (C0558c) wDObjet.checkType(C0558c.class);
                    if (c0558c == null || c0558c.getTypeVar() != getTypeVar()) {
                        WDErreurManager.m2883a(C0745b.m3222b(f1854z[2], new String[0]));
                        return;
                    } else if (this.f1855a.isInstance(c0558c)) {
                        setReference(c0558c);
                        return;
                    } else {
                        liberer();
                        return;
                    }
                case 3:
                    super.opCopie(wDObjet);
                    return;
                default:
                    super.setValeur(wDObjet);
                    return;
            }
        } else if (i == 2) {
            liberer();
        } else {
            WDErreurManager.m2883a(C0745b.m3222b(f1854z[3], new String[0]));
        }
    }

    /* renamed from: z */
    private static String m3099z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 44;
                    break;
                case 1:
                    i2 = 100;
                    break;
                case 2:
                    i2 = 12;
                    break;
                case 3:
                    i2 = 118;
                    break;
                default:
                    i2 = 40;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3100z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 40);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public void m3101a() {
        if (this.f1855a != null) {
            try {
                setReference((C0558c) C0735q.m3118a(C0735q.m3116a(this.f1855a)).newInstance(new Object[0]));
            } catch (NoSuchMethodException e) {
                WDErreurManager.m2883a(C0745b.m3222b(f1854z[4], C0735q.m3129d(r1)));
            } catch (Exception e2) {
                WDErreurManager.m2883a(f1854z[5]);
            }
        }
    }

    /* renamed from: b */
    public Class m3102b() {
        return this.f1855a;
    }

    public <T> T checkType(Class<T> cls) {
        if (!isAllloue()) {
            if (cls.isInstance(this)) {
                return this;
            }
            if (!cls.isAssignableFrom(this.f1855a)) {
                return null;
            }
            if (C0559b.class.isAssignableFrom(this.f1855a)) {
                WDErreurManager.m2883a(C0745b.m3222b(f1854z[0], new String[0]));
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1854z[1], new String[0]));
            }
        }
        return super.checkType(cls);
    }

    public abstract C0729v creerInstanceNonAllouee();

    public WDObjet getClone() {
        WDObjet creerInstanceNonAllouee = creerInstanceNonAllouee();
        C0558c reference = getReference();
        if (reference != null) {
            creerInstanceNonAllouee.setReference((C0558c) ((WDObjet) reference).getClone());
        }
        return creerInstanceNonAllouee;
    }

    public String getNomType() {
        C0558c reference = getReference();
        return reference != null ? reference.getNomType() : C0745b.m3220a(f1854z[6], new String[0]);
    }

    public WDObjet getRefProxy() {
        C0558c reference = getReference();
        if (reference == null) {
            if (C0559b.class.isAssignableFrom(this.f1855a)) {
                WDErreurManager.m2883a(C0745b.m3222b(f1854z[0], new String[0]));
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1854z[1], new String[0]));
            }
        }
        return (WDObjet) reference;
    }

    protected abstract C0558c getReference();

    public int getTypeVar() {
        if (getReference() != null) {
            return super.getTypeVar();
        }
        if (C0734p.class.isAssignableFrom(this.f1855a)) {
            return 36;
        }
        if (C0733z.class.isAssignableFrom(this.f1855a)) {
            return 37;
        }
        if (C0559b.class.isAssignableFrom(this.f1855a)) {
            return 111;
        }
        C0691a.m2856a(f1854z[7]);
        return 37;
    }

    public WDObjet getValeur() {
        return getRefProxy();
    }

    public WDBooleen getVide() {
        return new WDBooleen(getReference() == null);
    }

    public boolean hasProperty(String str) {
        return !isAllloue() ? false : super.hasProperty(str);
    }

    public boolean isAllloue() {
        return getReference() != null;
    }

    protected boolean isInstanceDynamique() {
        return false;
    }

    public boolean isNull() {
        return getReference() == null;
    }

    public boolean isValeurNull() {
        return false;
    }

    public void liberer() {
        setReference(null);
    }

    public void opCopie(WDObjet wDObjet) {
        m3098a(wDObjet, 3);
    }

    public boolean opDiff(WDObjet wDObjet) {
        return !opEgal(wDObjet);
    }

    public boolean opEgal(WDObjet wDObjet) {
        C0729v c0729v = (C0729v) wDObjet.checkType(C0729v.class);
        if (c0729v == null) {
            return super.opEgal(wDObjet);
        }
        WDObjet wDObjet2 = (WDObjet) getReference();
        WDObjet wDObjet3 = (WDObjet) c0729v.getReference();
        return wDObjet2 == wDObjet3 ? true : (wDObjet2 == null || wDObjet3 == null) ? false : wDObjet2.getClass() == wDObjet3.getClass() ? wDObjet2.opEgal(wDObjet3) : false;
    }

    public boolean opInstanceOf(Class cls) {
        C0558c reference = getReference();
        return reference != null ? cls.isInstance(reference) : false;
    }

    public void opPriseReference(WDObjet wDObjet) {
        m3098a(wDObjet, 2);
    }

    public void release() {
        liberer();
    }

    protected abstract void setReference(C0558c c0558c);

    public void setValeur(WDObjet wDObjet) {
        m3098a(wDObjet, 1);
    }
}
