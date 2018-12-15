package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.application.C0535j;

/* renamed from: fr.pcsoft.wdjava.jni.b */
final class C0925b implements C0535j {
    /* renamed from: z */
    private static final String[] f2532z = new String[]{C0925b.m6738z(C0925b.m6739z("!6\"2+\u001b201=H?7}4\u00019»/=\u001a{>8x\u000b4<)=\u0010/7}<\r{><x>\u0016|")), C0925b.m6738z(C0925b.m6739z("-) 8-\u001a{6(*\t5&}4\r{6´;\u0000: :=\u0005><)x\f>!}4\u00019 <1\u001a27.x\u0006:&4.\r(|"))};

    C0925b() {
    }

    /* renamed from: z */
    private static String m6738z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 104;
                    break;
                case 1:
                    i2 = 91;
                    break;
                case 2:
                    i2 = 82;
                    break;
                case 3:
                    i2 = 93;
                    break;
                default:
                    i2 = 88;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6739z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 88);
        }
        return toCharArray;
    }

    public void onChangementTitre(String str) {
    }

    public void onCharsetChanged(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFermetureProjet() {
        /*
        r3 = this;
        r0 = fr.pcsoft.wdjava.jni.WDJNIHelper.m6643b();	 Catch:{ Exception -> 0x000b }
        fr.pcsoft.wdjava.jni.WDJNIHelper.jniReleaseThreadContext(r0);	 Catch:{ Exception -> 0x000b }
    L_0x0007:
        fr.pcsoft.wdjava.jni.WDJNIHelper.jniUnload();	 Catch:{ UnsatisfiedLinkError -> 0x0015 }
    L_0x000a:
        return;
    L_0x000b:
        r0 = move-exception;
        r1 = f2532z;	 Catch:{ UnsatisfiedLinkError -> 0x0015 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ UnsatisfiedLinkError -> 0x0015 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r1, r0);	 Catch:{ UnsatisfiedLinkError -> 0x0015 }
        goto L_0x0007;
    L_0x0015:
        r0 = move-exception;
        r0 = f2532z;
        r1 = 1;
        r0 = r0[r1];
        r1 = 0;
        fr.pcsoft.wdjava.core.debug.C0691a.m2857a(r0, r1);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.jni.b.onFermetureProjet():void");
    }

    public void onLowMemory() {
    }
}
