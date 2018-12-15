package fr.pcsoft.wdjava.ui.p065b.p066b;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import fr.pcsoft.wdjava.core.debug.C0691a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fr.pcsoft.wdjava.ui.b.b.a */
public class C1085a extends AnimationDrawable {
    /* renamed from: a */
    private static Field f3294a;
    /* renamed from: d */
    private static Method f3295d;
    /* renamed from: e */
    private static Field f3296e;
    /* renamed from: g */
    private static Field f3297g;
    /* renamed from: z */
    private static final String[] f3298z = new String[]{C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002g0L\u0016Ëh$\u001cPj%\u0005\u000bL+!\r\u0016\u0002b?\u0018\u0016Mx!\t\u0007Vb>\u0002DFnq\u0000\u0005\u0002}0\u0000\u0001Wyq\b\u0011\u0002f4\u0001\u0006PnqP\ta~#%\nFn)R")), C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002gv\r\u0007Aâ\"L\u0014Cyq\u0005\nVy>\u001f\u0014Gh%\u0005\u000bL+0\u0019DOn<\u000e\u0016G+\u0010\u0002\rOj%\u0005\u000bLO#\r\u0013Ci=\tGOJ?\u0005\tC8\u0002\u0003")), C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002gv\r\u0007Aâ\"L\u0014Cyq\u0005\nVy>\u001f\u0014Gh%\u0005\u000bL+0\u0019DOn<\u000e\u0016G+\u0010\u0002\rOj%\u0005\u000bLO#\r\u0013Ci=\tGOY$\u0002\nKe6")), C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002gv\r\u0014Rn=L\u0014Cyq\u0005\nVy>\u001f\u0014Gh%\u0005\u000bL+5\tDNjq\u0001Vc>\b\u0001\u0002J?\u0005\tC8\u0003\nfy0\u001b\u0005@g4O\u0017G\u0017\u001e\u0005On"))};
    /* renamed from: b */
    private boolean f3299b = false;
    /* renamed from: c */
    private C1086b f3300c;
    /* renamed from: f */
    private boolean f3301f = false;

    static {
        try {
            f3294a = DrawableContainer.class.getDeclaredField(C1085a.m7893z(C1085a.m7894z("f\u0012\u0019\u0016ke5\t\u001c")));
            f3294a.setAccessible(true);
        } catch (Exception e) {
            C0691a.m2857a(C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002gv\r\u0007Aâ\"L\u0005W+<\t\t@y4L\u0014Pb'D\u001ef\u0012\u0019\u0016ke5\t\u001c\u001c+5\tDNjq\u000f\bCx\"\tDce8\u0001\u0005Vb>\u0002 Pj&\r\u0006Nn")), e);
        }
        try {
            f3295d = AnimationDrawable.class.getDeclaredMethod(C1085a.m7893z(C1085a.m7894z("x4\u0018\"Pj<\t")), new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE});
            f3295d.setAccessible(true);
        } catch (Exception e2) {
            C0691a.m2857a(C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002gv\r\u0007Aâ\"L\u0002g0L\tË9\u0003\u0000G+!\u001e\rTâ4LXQn%*\u0016Cf4RDFnq\u0000\u0005\u0002h=\r\u0017Qnq-\nKf0\u0018\rMe\u0015\u001e\u0005Uj3\u0000\u0001")), e2);
        }
        try {
            f3296e = AnimationDrawable.class.getDeclaredField(C1085a.m7893z(C1085a.m7894z("f\u0010\u0002\rOj%\u0005\nE")));
            f3296e.setAccessible(true);
        } catch (Exception e22) {
            C0691a.m2857a(C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002gv\r\u0007Aâ\"L\u0005W+<\t\t@y4L\u0014Pb'D\u001ef\u0010\u0002\rOj%\u0005\nE5q\b\u0001\u0002g0L\u0007Nj\"\u001f\u0001\u0002J?\u0005\tC8\u0003\nfy0\u001b\u0005@g4")), e22);
        }
        try {
            f3297g = AnimationDrawable.class.getDeclaredField(C1085a.m7893z(C1085a.m7894z("f\u0003\u0019\nLb?\u000b")));
            f3297g.setAccessible(true);
        } catch (Exception e222) {
            C0691a.m2857a(C1085a.m7893z(C1085a.m7894z("N#\u001e\u0001Wyq\u0000\u000bPxq\b\u0001\u0002gv\r\u0007Aâ\"L\u0005W+<\t\t@y4L\u0014Pb'D\u001ef\u0003\u0019\nLb?\u000bZ\u0002o4L\bC+2\u0000\u0005Qx4L%Lb<\r\u0010Kd?(\u0016C|0\u000e\bG")), e222);
        }
    }

    public C1085a(Drawable[] drawableArr, int i, boolean z, boolean z2, boolean z3) {
        int i2 = 0;
        for (Drawable addFrame : drawableArr) {
            addFrame(addFrame, i);
        }
        setOneShot(!z3);
        m7897a(z2);
        if (z) {
            m7899c();
        }
        if (z2) {
            i2 = getNumberOfFrames() - 1;
        }
        selectDrawable(i2);
    }

    /* renamed from: a */
    public static final C1085a m7890a(AnimationDrawable animationDrawable, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        int i3 = 0;
        C1085a c1085a = new C1085a();
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (!(animationDrawable instanceof C1085a) || !((C1085a) animationDrawable).f3301f) {
            i2 = numberOfFrames;
        } else if (z) {
            c1085a.f3301f = true;
            i2 = numberOfFrames;
            z = false;
        } else {
            i2 = (numberOfFrames / 2) + 1;
        }
        numberOfFrames = i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (numberOfFrames < 0) {
                numberOfFrames = animationDrawable.getDuration(i4);
            }
            c1085a.addFrame(animationDrawable.getFrame(i4), numberOfFrames);
        }
        c1085a.setOneShot(!z3);
        c1085a.m7897a(z2);
        if (z) {
            c1085a.m7899c();
        }
        if (z2) {
            i3 = c1085a.getNumberOfFrames() - 1;
        }
        c1085a.selectDrawable(i3);
        return c1085a;
    }

    /* renamed from: a */
    private void m7891a(int i, boolean z, boolean z2) {
        try {
            f3295d.invoke(this, new Object[]{Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2)});
        } catch (Exception e) {
            C0691a.m2857a(f3298z[3], e);
        }
        if (!z2) {
            try {
                f3297g.set(this, Boolean.valueOf(false));
            } catch (Exception e2) {
                C0691a.m2857a(f3298z[2], e2);
            }
        }
    }

    /* renamed from: b */
    private void m7892b(boolean z) {
        boolean z2 = true;
        int a = m7895a() + (this.f3299b ? -1 : 1);
        int numberOfFrames = getNumberOfFrames();
        boolean z3 = isOneShot() && (this.f3299b ? a <= 0 : a >= numberOfFrames - 1);
        if (!isOneShot()) {
            if (a >= numberOfFrames) {
                a = 0;
            } else if (a < 0) {
                a = numberOfFrames - 1;
            }
        }
        if (z3) {
            z2 = false;
        }
        m7891a(a, z, z2);
        if (this.f3300c != null && z3) {
            this.f3300c.mo3409b(this);
        }
    }

    /* renamed from: z */
    private static String m7893z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 81;
                    break;
                case 2:
                    i2 = 108;
                    break;
                case 3:
                    i2 = 100;
                    break;
                default:
                    i2 = 34;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7894z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 34);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int m7895a() {
        try {
            return ((Integer) f3294a.get(this)).intValue();
        } catch (Exception e) {
            C0691a.m2857a(f3298z[0], e);
            return 0;
        }
    }

    /* renamed from: a */
    public void m7896a(C1086b c1086b) {
        this.f3300c = c1086b;
    }

    /* renamed from: a */
    public void m7897a(boolean z) {
        if (this.f3299b != z) {
            boolean isRunning = isRunning();
            if (isRunning) {
                stop();
            }
            this.f3299b = z;
            if (isRunning) {
                start();
            }
        }
    }

    /* renamed from: b */
    public final C1086b m7898b() {
        return this.f3300c;
    }

    /* renamed from: c */
    public void m7899c() {
        if (!this.f3301f) {
            boolean numberOfFrames = getNumberOfFrames() - 2;
            while (true) {
                if (numberOfFrames >= (!isOneShot())) {
                    addFrame(getFrame(numberOfFrames), getDuration(numberOfFrames));
                    numberOfFrames--;
                } else {
                    this.f3301f = true;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m7900d() {
        return this.f3301f;
    }

    /* renamed from: e */
    public boolean m7901e() {
        return this.f3299b;
    }

    public void run() {
        m7892b(false);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, false);
    }

    public void start() {
        boolean z = true;
        try {
            if (isRunning()) {
                stop();
            }
            try {
                f3296e.set(this, Boolean.valueOf(true));
            } catch (Exception e) {
                C0691a.m2857a(f3298z[1], e);
            }
            try {
                if (!isRunning()) {
                    if (isVisible()) {
                        try {
                            if (this.f3300c != null) {
                                this.f3300c.mo3408a(this);
                            }
                            try {
                                int numberOfFrames = this.f3299b ? getNumberOfFrames() - 1 : 0;
                                try {
                                    if (getNumberOfFrames() <= 1) {
                                        if (isOneShot()) {
                                            z = false;
                                        }
                                    }
                                    m7891a(numberOfFrames, false, z);
                                } catch (Exception e2) {
                                    throw e2;
                                } catch (Exception e22) {
                                    throw e22;
                                }
                            } catch (Exception e222) {
                                throw e222;
                            }
                        } catch (Exception e2222) {
                            throw e2222;
                        }
                    }
                }
            } catch (Exception e22222) {
                throw e22222;
            } catch (Exception e222222) {
                throw e222222;
            }
        } catch (Exception e2222222) {
            throw e2222222;
        }
    }
}
