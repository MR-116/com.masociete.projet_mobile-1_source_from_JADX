package p000a.p001a.p002a;

/* renamed from: a.a.a.q */
public abstract class C0210q extends Exception {
    /* renamed from: a */
    protected static final StackTraceElement[] f785a = new StackTraceElement[0];
    /* renamed from: b */
    protected static final boolean f786b = (System.getProperty(C0210q.m1263z(C0210q.m1264z(">NK\u0006G$I\\MU(HMMB!ZJ\u0010\u000f=ZM\u000b"))) != null);

    C0210q() {
    }

    C0210q(Throwable th) {
        super(th);
    }

    /* renamed from: z */
    private static String m1263z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 77;
                    break;
                case 1:
                    i2 = 59;
                    break;
                case 2:
                    i2 = 57;
                    break;
                case 3:
                    i2 = 99;
                    break;
                default:
                    i2 = 33;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1264z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 33);
        }
        return toCharArray;
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
