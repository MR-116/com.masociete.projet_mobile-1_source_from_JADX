package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

public class WDTableauFixe extends C0759o {
    /* renamed from: z */
    private static final String[] f1990z = new String[]{m3500z(m3501z("\n\u0003\u000f\u000fpy\u0011\u001a\u0000{e\u000b\u000f\u0014fo\u0007\u0016\u0004")), m3500z(m3501z("\n\u000b\u001c\u0013||\u001c\u0011\u0011xz\u001d\u000f\u0006|v\u001e\u000f\u0013xd")), m3500z(m3501z("\n\r\u0001\fih\u001c\u000f\bjf\u0000\u0011\u000fle\u0002\u0011\bw}\u000b\u001c\u0005p}\u000b")), m3500z(m3501z("\n\u000b\u001c\u0013fm\u0007\u0003\u0004wz\u0007\u0001\u000ff\u001a")), m3500z(m3501z("\n\u001e\u0002\u0014jv\n\u000b\u001etl\u0003\u0001\bkl"))};

    public WDTableauFixe(int i, int[] iArr, int i2, int i3) {
        this(i, iArr, i2, i3, null);
    }

    private WDTableauFixe(int r10, int[] r11, int r12, int r13, fr.pcsoft.wdjava.core.allocation.IWDAllocateur r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauFixe.<init>(int, int[], int, int, fr.pcsoft.wdjava.core.allocation.IWDAllocateur):void. bs: [B:5:0x0020, B:8:0x002b, B:26:0x006b]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r9 = this;
        r1 = 1;
        r6 = 0;
        r9.<init>();
        r9.o = r13;
        r9.m = r14;
        r0 = r11.length;
        r9.j = r0;
        r0 = r12 + 1;
        r9.i = r0;
        r9.a = r11;
        r0 = r9.j;
        if (r0 <= r1) goto L_0x001a;
    L_0x0016:
        r0 = r11[r1];
        r9.h = r0;
    L_0x001a:
        r0 = r11[r12];
        r9.d = r0;
        if (r10 <= r1) goto L_0x005c;
    L_0x0020:
        r0 = r11[r12];	 Catch:{ OutOfMemoryError -> 0x0042 }
        r0 = new fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauFixe[r0];	 Catch:{ OutOfMemoryError -> 0x0042 }
        r9.q = r0;	 Catch:{ OutOfMemoryError -> 0x0042 }
        r1 = r10 + -1;
        r3 = r12 + 1;
        r7 = r6;
    L_0x002b:
        r0 = r9.q;	 Catch:{ OutOfMemoryError -> 0x0040 }
        r0 = r0.length;	 Catch:{ OutOfMemoryError -> 0x0040 }
        if (r7 >= r0) goto L_0x0058;	 Catch:{ OutOfMemoryError -> 0x0040 }
    L_0x0030:
        r8 = r9.q;	 Catch:{ OutOfMemoryError -> 0x0040 }
        r0 = new fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauFixe;	 Catch:{ OutOfMemoryError -> 0x0040 }
        r2 = r11;	 Catch:{ OutOfMemoryError -> 0x0040 }
        r4 = r13;	 Catch:{ OutOfMemoryError -> 0x0040 }
        r5 = r14;	 Catch:{ OutOfMemoryError -> 0x0040 }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ OutOfMemoryError -> 0x0040 }
        r8[r7] = r0;	 Catch:{ OutOfMemoryError -> 0x0040 }
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x002b;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        r0 = f1990z;
        r1 = 4;
        r0 = r0[r1];
        r1 = new java.lang.String[r6];
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
    L_0x0051:
        r0 = r9.l;
        r0 = r0 | 1;
        r9.l = r0;
        return;
    L_0x0058:
        r0 = 0;
        r9.c = r0;	 Catch:{ OutOfMemoryError -> 0x0042 }
        goto L_0x0051;	 Catch:{ OutOfMemoryError -> 0x0042 }
    L_0x005c:
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x0042 }
        r9.q = r0;	 Catch:{ OutOfMemoryError -> 0x0042 }
        r1 = r11[r12];	 Catch:{ OutOfMemoryError -> 0x0042 }
        r0 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x0042 }
        r0.<init>(r1);	 Catch:{ OutOfMemoryError -> 0x0042 }
        r9.c = r0;	 Catch:{ OutOfMemoryError -> 0x0042 }
        r0 = r6;
    L_0x0069:
        if (r0 >= r1) goto L_0x0051;
    L_0x006b:
        r2 = r9.c;	 Catch:{ OutOfMemoryError -> 0x0079 }
        r3 = r9.m;	 Catch:{ OutOfMemoryError -> 0x0079 }
        r3 = fr.pcsoft.wdjava.core.allocation.C0611a.m2294a(r13, r3);	 Catch:{ OutOfMemoryError -> 0x0079 }
        r2.add(r3);	 Catch:{ OutOfMemoryError -> 0x0079 }
        r0 = r0 + 1;
        goto L_0x0069;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0042 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauFixe.<init>(int, int[], int, int, fr.pcsoft.wdjava.core.allocation.IWDAllocateur):void");
    }

    public WDTableauFixe(int i, int[] iArr, int i2, IWDAllocateur iWDAllocateur) {
        this(i, iArr, i2, iWDAllocateur.getTypeWL(), iWDAllocateur);
    }

    /* renamed from: z */
    private static String m3500z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 41;
                    break;
                case 1:
                    i2 = 78;
                    break;
                case 2:
                    i2 = 78;
                    break;
                case 3:
                    i2 = 65;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3501z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 57);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo2646a(WDObjet wDObjet, int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return -1;
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return 0;
    }

    /* renamed from: a */
    public int mo2647a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, int i2, int i3, WDCallback wDCallback) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return -1;
    }

    /* renamed from: a */
    public int mo2648a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, int i2, int[] iArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return -1;
    }

    /* renamed from: a */
    public int mo2649a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, WDCallback wDCallback) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return -1;
    }

    /* renamed from: a */
    public int mo2650a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, String[] strArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return -1;
    }

    /* renamed from: a */
    public int mo2651a(WDObjet[] wDObjetArr, String[] strArr, WDObjet[] wDObjetArr2, int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return -1;
    }

    /* renamed from: a */
    public void mo2472a(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2652a(int i, boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2653a(WDCallback wDCallback) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2465a(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2654a(C0758k c0758k) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2655a(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2656a(String str, String str2, String str3) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2657a(StringBuffer stringBuffer, String str, String str2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2658a(int[] iArr) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: a */
    public void mo2659a(int[] iArr, int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[3], new String[0]));
    }

    /* renamed from: a */
    protected boolean mo2660a(C0759o c0759o) {
        return c0759o instanceof WDTableauFixe;
    }

    /* renamed from: b */
    public int mo2663b(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return 0;
    }

    /* renamed from: b */
    public int mo2475b(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
        return -1;
    }

    /* renamed from: b */
    public void mo2476b() {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: b */
    public void mo2477b(int i, int i2) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: b */
    public void mo2664b(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: c */
    public void mo2479c() {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: c */
    public void mo2665c(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: d */
    public void mo2666d(WDObjet wDObjet) {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    /* renamed from: e */
    public void mo2480e() {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[1], "1") + "\n" + C0745b.m3222b(f1990z[0], new String[0]));
    }

    public boolean isNull() {
        WDErreurManager.m2883a(C0745b.m3222b(f1990z[2], getNomType()));
        return false;
    }

    public boolean isTableauFixe() {
        return true;
    }

    /* renamed from: j */
    public boolean mo2667j() {
        return false;
    }
}
