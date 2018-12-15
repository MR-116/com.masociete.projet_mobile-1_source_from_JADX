package fr.pcsoft.wdjava.ui.activite;

/* renamed from: fr.pcsoft.wdjava.ui.activite.f */
public enum C1054f {
    PAUSE,
    RESUME,
    START,
    SELECT_OPTION,
    CREATE,
    FINISH,
    STOP,
    NEW_INTENT,
    CONFIGURATION_CHANGED,
    SAVE_INSTANCE_STATE,
    LOW_MEMORY,
    DESTROY,
    ACTIVITY_RESULT;
    
    /* renamed from: a */
    private static final C1054f[] f3014a = null;

    static {
        PAUSE = new C1054f(C1054f.m7560z(C1054f.m7561z("?\u0015w<w")), 0);
        RESUME = new C1054f(C1054f.m7560z(C1054f.m7561z("=\u0011q:*")), 1);
        START = new C1054f(C1054f.m7560z(C1054f.m7561z("<\u0000c=f")), 2);
        SELECT_OPTION = new C1054f(C1054f.m7560z(C1054f.m7561z("<\u0011n*q;\u000bm?f&\u001bl")), 3);
        CREATE = new C1054f(C1054f.m7560z(C1054f.m7561z(",\u0006g.f*")), 4);
        FINISH = new C1054f(C1054f.m7560z(C1054f.m7561z(")\u001dl&a'")), 5);
        STOP = new C1054f(C1054f.m7560z(C1054f.m7561z("<\u0000m?")), 6);
        NEW_INTENT = new C1054f(C1054f.m7560z(C1054f.m7561z("!\u0011u0{!\u0000g!f")), 7);
        CONFIGURATION_CHANGED = new C1054f(C1054f.m7560z(C1054f.m7561z(",\u001bl){(\u0001p.f&\u001bl0q'\u0015l(w+")), 8);
        SAVE_INSTANCE_STATE = new C1054f(C1054f.m7560z(C1054f.m7561z("<\u0015t*m&\u001aq;s!\u0017g0a;\u0015v*")), 9);
        LOW_MEMORY = new C1054f(C1054f.m7560z(C1054f.m7561z("#\u001bu0*\u0019m=k")), 10);
        DESTROY = new C1054f(C1054f.m7560z(C1054f.m7561z("+\u0011q;` \r")), 11);
        ACTIVITY_RESULT = new C1054f(C1054f.m7560z(C1054f.m7561z(".\u0017v&d&\u0000{0`*\u0007w#f")), 12);
        f3014a = new C1054f[]{PAUSE, RESUME, START, SELECT_OPTION, CREATE, FINISH, STOP, NEW_INTENT, CONFIGURATION_CHANGED, SAVE_INSTANCE_STATE, LOW_MEMORY, DESTROY, ACTIVITY_RESULT};
    }

    /* renamed from: z */
    private static String m7560z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 111;
                    break;
                case 1:
                    i2 = 84;
                    break;
                case 2:
                    i2 = 34;
                    break;
                case 3:
                    i2 = 111;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m7561z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }
}
