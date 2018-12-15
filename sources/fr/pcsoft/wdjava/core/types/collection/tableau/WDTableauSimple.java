package fr.pcsoft.wdjava.core.types.collection.tableau;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.poo.C0558c;
import fr.pcsoft.wdjava.core.poo.C0734p;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0817u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WDTableauSimple extends C0759o {
    /* renamed from: z */
    private static final String[] f1987z = new String[]{m3460z(m3461z("~Qr\u0012[\u0002E{\u0018E\u0018Lq\u000eZ\u0018")), m3460z(m3461z("~Hp\u0003A\u001eDa\u0013I\u001fM{\u0006]\u0002Hp\u0011I\u0011Hz\u0002")), m3460z(m3461z("~Ew\nM\u0013Rw\bF\u0002U\u0005D\u0018@k\u0018A\u0013W\u000bA\u0019D")), m3460z(m3461z("\u0001V\u0015")), m3460z(m3461z("~Ew\nM\u0013Rw\bF\u0002U\u0005D\u0018@k\u0018A\u0013W\u000bA\u0019Dau")), m3460z(m3461z("~U\u0005D\u0018@k\u0018]\u0013Da\u0003A\u0010Dp\u0014A\u0012Oa\u0012F\u0014Pk\u0002E\u0018Oj")), m3460z(m3461z("~Dl\u0015W\u0019Hs\u0002F\u000eHq\tW\t@|\u000bM\u001cTa\u0004D\u001cRm\u0002")), m3460z(m3461z("\txN\"(9d\u001e5m>i[5k5d\u001e+a3è_.z8!W)~<mW#m};\u001e")), m3460z(m3461z("~Dl\u0015M\bSa\u0013Z\u0014^j\u0006J\u0011D\u0012")), m3460z(m3461z("~Dl\u0015W\tSw\u0018[\bSa\u0013Q\rDa\u0014A\u0010Qr\u0002")), m3460z(m3461z("~Dl\u0015W\u0019Hs\u0002F\u000eHq\t")), m3460z(m3461z("~U\u0005D\u0018@k\u0018L\u0018^}\u000bI\u000eR{\u0018^\u0018Sm\u0018K\u0015@w\tM")), m3460z(m3461z("\u001aVz\u0004")), m3460z(m3461z("~Dl\u0015W\u000fD}\u000fM\u000fBv\u0002W\u0019H}\u000fG\tNs\u000eY\bD")), m3460z(m3461z("~Dl\u0015M\bSa\u0004G\rH{\u0018\\\u001cCr\u0002I\b^\f")), m3460z(m3461z("~Dl\u0015M\bSa\u0004G\rH{\u0018\\\u001cCr\u0002I\b^\r")), m3460z(m3461z("~Dl\u0015M\bSa\u0004G\rH{\u0018\\\u001cCr\u0002I\b")), m3460z(m3461z("~L\tA\r^j\u0006J\u0011D\u0012W\u001bHf\u0002")), m3460z(m3461z("~Dl\u0015M\bSa\u000bA\u001fDl\u0006\\\u0014Np\u0018\\\u001cCr\u0002I\b")), m3460z(m3461z("~Dl\u0015M\bSa\u0003A\u0010Dp\u0014A\u0012Oa\u0013Z\u0014")), m3460z(m3461z("~Hp\u0003A\u001eDa\u0004G\u0011Np\tM\u0002Hp\u0011I\u0011Hz\u0002")), m3460z(m3461z("~Dl\u0015W\u0013Ca\u0003A\u0010Dp\u0014A\u0012Oa\u0013Z\u0014^j\u0006J\u0011D\u0012W\u001e@r\u000bJ\u001cBu"))};

    public WDTableauSimple(int i, int[] iArr, int i2, int i3) {
        this(i, iArr, i2, i3, null);
    }

    private WDTableauSimple(int r10, int[] r11, int r12, int r13, fr.pcsoft.wdjava.core.allocation.IWDAllocateur r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.<init>(int, int[], int, int, fr.pcsoft.wdjava.core.allocation.IWDAllocateur):void. bs: [B:5:0x0020, B:8:0x002b, B:26:0x006b]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
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
        r0 = r11[r12];	 Catch:{ OutOfMemoryError -> 0x0043 }
        r0 = new fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple[r0];	 Catch:{ OutOfMemoryError -> 0x0043 }
        r9.q = r0;	 Catch:{ OutOfMemoryError -> 0x0043 }
        r1 = r10 + -1;
        r3 = r12 + 1;
        r7 = r6;
    L_0x002b:
        r0 = r9.q;	 Catch:{ OutOfMemoryError -> 0x0041 }
        r0 = r0.length;	 Catch:{ OutOfMemoryError -> 0x0041 }
        if (r7 >= r0) goto L_0x0058;	 Catch:{ OutOfMemoryError -> 0x0041 }
    L_0x0030:
        r8 = r9.q;	 Catch:{ OutOfMemoryError -> 0x0041 }
        r0 = new fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;	 Catch:{ OutOfMemoryError -> 0x0041 }
        r5 = r9.m;	 Catch:{ OutOfMemoryError -> 0x0041 }
        r2 = r11;	 Catch:{ OutOfMemoryError -> 0x0041 }
        r4 = r13;	 Catch:{ OutOfMemoryError -> 0x0041 }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ OutOfMemoryError -> 0x0041 }
        r8[r7] = r0;	 Catch:{ OutOfMemoryError -> 0x0041 }
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x002b;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        r0 = f1987z;
        r0 = r0[r6];
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
        r9.c = r0;	 Catch:{ OutOfMemoryError -> 0x0043 }
        goto L_0x0051;	 Catch:{ OutOfMemoryError -> 0x0043 }
    L_0x005c:
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x0043 }
        r9.q = r0;	 Catch:{ OutOfMemoryError -> 0x0043 }
        r1 = r11[r12];	 Catch:{ OutOfMemoryError -> 0x0043 }
        r0 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x0043 }
        r0.<init>(r1);	 Catch:{ OutOfMemoryError -> 0x0043 }
        r9.c = r0;	 Catch:{ OutOfMemoryError -> 0x0043 }
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
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0043 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.<init>(int, int[], int, int, fr.pcsoft.wdjava.core.allocation.IWDAllocateur):void");
    }

    public WDTableauSimple(int i, int[] iArr, int i2, int i3, boolean z) {
        this(i, iArr, i2, i3, null);
        if (z) {
            this.l |= 4;
        }
    }

    public WDTableauSimple(int i, int[] iArr, int i2, IWDAllocateur iWDAllocateur) {
        this(i, iArr, i2, iWDAllocateur.getTypeWL(), iWDAllocateur);
    }

    public WDTableauSimple(int i, int[] iArr, int i2, IWDAllocateur iWDAllocateur, boolean z) {
        this(i, iArr, i2, iWDAllocateur.getTypeWL(), iWDAllocateur);
        if (z) {
            this.l |= 4;
        }
    }

    public WDTableauSimple(List list, int i) {
        this.o = i;
        this.m = null;
        this.j = 1;
        this.i = 1;
        this.d = list.size();
        this.a = new int[]{this.d};
        try {
            this.q = null;
            this.c = new ArrayList(list);
        } catch (OutOfMemoryError e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[0], new String[0]));
        }
        this.l |= 1;
    }

    public WDTableauSimple(List list, IWDAllocateur iWDAllocateur) {
        this.o = iWDAllocateur.getTypeWL();
        this.m = iWDAllocateur;
        this.j = 1;
        this.i = 1;
        this.d = list.size();
        this.a = new int[]{this.d};
        try {
            this.q = null;
            this.c = new ArrayList(list);
        } catch (OutOfMemoryError e) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[0], new String[0]));
        }
        this.l |= 1;
        this.l |= 4;
    }

    /* renamed from: b */
    private int m3458b(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, int i2, int i3, WDCallback wDCallback) {
        WDObjet wDObjet = null;
        int i4 = -1;
        if (i > i2 || wDObjetArr2.length == 0) {
            return -1;
        }
        int i5 = (i + i2) / 2;
        if (i5 < 0 || i5 >= wDObjetArr.length) {
            return -1;
        }
        WDObjet wDObjet2;
        WDObjet wDObjet3;
        if (i3 != -1) {
            wDObjet2 = wDObjetArr[i].get(i3);
            wDObjet3 = wDObjetArr[i5].get(i3);
            if (i2 > i) {
                wDObjet = wDObjetArr[i2 - 1].get(i3);
            }
        } else {
            wDObjet2 = wDObjetArr[i];
            wDObjet3 = wDObjetArr[i5];
            if (i2 > i) {
                wDObjet = wDObjetArr[i2 - 1];
            }
        }
        if (wDCallback != null) {
            i4 = m3409a(wDObjet3, wDObjetArr2, wDCallback);
        } else {
            WDObjet wDObjet4 = wDObjetArr2[0];
            if (wDObjet2 != null && r0 != null && wDObjet2.opSup(r0)) {
                WDErreurManager.m2883a(C0745b.m3222b(f1987z[13], new String[0]));
                return -1;
            } else if (!wDObjet3.opInf(wDObjet4)) {
                i4 = wDObjet3.opSup(wDObjet4) ? 1 : 0;
            }
        }
        if (i4 < 0) {
            return m3458b(wDObjetArr, wDObjetArr2, i5 + 1, i2, i3, wDCallback);
        } else if (i4 <= 0) {
            return i5;
        } else {
            return m3458b(wDObjetArr, wDObjetArr2, i, i5 - 1, i3, wDCallback);
        }
    }

    /* renamed from: c */
    private int m3459c(int i, int i2) {
        switch (i) {
            case 2:
                return 0;
            case 3:
                return this.g + 1;
            case 4:
                return this.g - 1;
            case 5:
                return i2 - 1;
            default:
                C0691a.m2856a(f1987z[7] + i);
                return -1;
        }
    }

    /* renamed from: z */
    private static String m3460z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 93;
                    break;
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    i2 = 62;
                    break;
                case 3:
                    i2 = 71;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3461z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 8);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public synchronized int mo2646a(WDObjet wDObjet, int i) {
        int i2;
        int i3 = 0;
        synchronized (this) {
            if (this.j == 1) {
                if (i < 0 || i > this.d + 1) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1987z[1], "1", "" + this.d, "" + i));
                }
                int i4 = i == 0 ? this.d + 1 : i;
                int i5 = (wDObjet == null || !wDObjet.isTableau() || wDObjet.isTableauAssociatif()) ? 0 : 1;
                int h = i5 != 0 ? (int) ((C0759o) wDObjet).mo2483h() : 1;
                this.d += h;
                this.a[0] = this.d;
                this.c.ensureCapacity(this.d);
                int a = C0725i.m3011a(i4);
                WDObjet b;
                if (i5 != 0) {
                    while (i3 < h) {
                        WDObjet a2 = C0611a.m2294a(this.o, this.m);
                        b = ((C0759o) wDObjet).mo2633b((long) (i3 + 1));
                        if (b != null) {
                            a2.setValeur(b);
                        }
                        this.c.add(a + i3, a2);
                        i3++;
                    }
                } else {
                    b = C0611a.m2294a(this.o, this.m);
                    if (wDObjet != null) {
                        b.setValeur(wDObjet);
                    }
                    this.c.add(a, b);
                }
                i2 = i4;
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1987z[5], new String[0]));
                i2 = -1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public int mo2464a(WDObjet... wDObjetArr) {
        int i = this.d + 1;
        mo2466a(C0611a.m2308b(i), wDObjetArr);
        return i;
    }

    /* renamed from: a */
    public int m3464a(WDObjet[] wDObjetArr, WDObjet wDObjet, int i, int i2, C0761b c0761b) {
        if (i > i2) {
            return -1;
        }
        int i3 = (i + i2) / 2;
        if (i3 < 0 || i3 >= wDObjetArr.length) {
            return -1;
        }
        WDObjet a = c0761b.mo2671a((WDObjet) wDObjetArr[i].checkType(C0558c.class));
        WDObjet a2 = c0761b.mo2671a((WDObjet) wDObjetArr[i3].checkType(C0558c.class));
        WDObjet a3 = i2 > i ? c0761b.mo2671a((WDObjet) wDObjetArr[i2 - 1].checkType(C0558c.class)) : null;
        if (a != null && a3 != null && a.opSup(a3)) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[13], new String[0]));
            return -1;
        } else if (a2.opInf(wDObjet)) {
            return m3464a(wDObjetArr, wDObjet, i3 + 1, i2, c0761b);
        } else if (!a2.opSup(wDObjet)) {
            return i3;
        } else {
            return m3464a(wDObjetArr, wDObjet, i, i3 - 1, c0761b);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized int mo2647a(fr.pcsoft.wdjava.core.WDObjet[] r9, fr.pcsoft.wdjava.core.WDObjet[] r10, int r11, int r12, int r13, fr.pcsoft.wdjava.core.WDCallback r14) {
        /*
        r8 = this;
        r1 = 1;
        r2 = 0;
        r3 = -1;
        monitor-enter(r8);
        if (r9 != 0) goto L_0x000c;
    L_0x0006:
        r0 = -1;
        r8.g = r0;	 Catch:{ all -> 0x006a }
        r0 = r3;
    L_0x000a:
        monitor-exit(r8);
        return r0;
    L_0x000c:
        r0 = 4;
        if (r11 == r0) goto L_0x0021;
    L_0x000f:
        r0 = 5;
        if (r11 == r0) goto L_0x0021;
    L_0x0012:
        r7 = r1;
    L_0x0013:
        if (r12 != r3) goto L_0x0028;
    L_0x0015:
        r0 = r9.length;	 Catch:{ all -> 0x006a }
        r12 = r8.m3459c(r11, r0);	 Catch:{ all -> 0x006a }
        if (r12 >= 0) goto L_0x0028;
    L_0x001c:
        r0 = -1;
        r8.g = r0;	 Catch:{ all -> 0x006a }
        r0 = r3;
        goto L_0x000a;
    L_0x0021:
        r7 = r2;
        goto L_0x0013;
    L_0x0023:
        if (r7 == 0) goto L_0x0067;
    L_0x0025:
        r0 = r12 + 1;
    L_0x0027:
        r12 = r0;
    L_0x0028:
        if (r7 == 0) goto L_0x002d;
    L_0x002a:
        r0 = r9.length;	 Catch:{ all -> 0x006a }
        if (r12 >= r0) goto L_0x0031;
    L_0x002d:
        if (r7 != 0) goto L_0x0036;
    L_0x002f:
        if (r12 >= 0) goto L_0x0036;
    L_0x0031:
        r0 = -1;
        r8.g = r0;	 Catch:{ all -> 0x006a }
        r0 = r3;
        goto L_0x000a;
    L_0x0036:
        if (r13 == r3) goto L_0x0051;
    L_0x0038:
        r0 = r9[r12];	 Catch:{ all -> 0x006a }
        r0 = r0.get(r13);	 Catch:{ all -> 0x006a }
        r6 = r0;
    L_0x003f:
        if (r14 == 0) goto L_0x0057;
    L_0x0041:
        r0 = r8.m3409a(r6, r10, r14);	 Catch:{ all -> 0x006a }
        if (r0 != 0) goto L_0x0055;
    L_0x0047:
        r0 = r1;
    L_0x0048:
        if (r0 == 0) goto L_0x0023;
    L_0x004a:
        r8.g = r12;	 Catch:{ all -> 0x006a }
        r0 = fr.pcsoft.wdjava.core.C0725i.m3069e(r12);	 Catch:{ all -> 0x006a }
        goto L_0x000a;
    L_0x0051:
        r0 = r9[r12];	 Catch:{ all -> 0x006a }
        r6 = r0;
        goto L_0x003f;
    L_0x0055:
        r0 = r2;
        goto L_0x0048;
    L_0x0057:
        r4 = r2;
        r0 = r2;
    L_0x0059:
        r5 = r10.length;	 Catch:{ all -> 0x006a }
        if (r4 >= r5) goto L_0x0048;
    L_0x005c:
        r0 = r10[r4];	 Catch:{ all -> 0x006a }
        r5 = r6.opEgal(r0);	 Catch:{ all -> 0x006a }
        r0 = r4 + 1;
        r4 = r0;
        r0 = r5;
        goto L_0x0059;
    L_0x0067:
        r0 = r12 + -1;
        goto L_0x0027;
    L_0x006a:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.a(fr.pcsoft.wdjava.core.WDObjet[], fr.pcsoft.wdjava.core.WDObjet[], int, int, int, fr.pcsoft.wdjava.core.WDCallback):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized int mo2648a(fr.pcsoft.wdjava.core.WDObjet[] r7, fr.pcsoft.wdjava.core.WDObjet[] r8, int r9, int r10, int[] r11) {
        /*
        r6 = this;
        r0 = 0;
        r2 = 1;
        r1 = -1;
        monitor-enter(r6);
        if (r7 != 0) goto L_0x000c;
    L_0x0006:
        r0 = -1;
        r6.g = r0;	 Catch:{ all -> 0x0072 }
        r0 = r1;
    L_0x000a:
        monitor-exit(r6);
        return r0;
    L_0x000c:
        r3 = 4;
        if (r9 == r3) goto L_0x0021;
    L_0x000f:
        r3 = 5;
        if (r9 == r3) goto L_0x0021;
    L_0x0012:
        r4 = r2;
    L_0x0013:
        if (r10 != r1) goto L_0x0028;
    L_0x0015:
        r0 = r7.length;	 Catch:{ all -> 0x0072 }
        r10 = r6.m3459c(r9, r0);	 Catch:{ all -> 0x0072 }
        if (r10 >= 0) goto L_0x0028;
    L_0x001c:
        r0 = -1;
        r6.g = r0;	 Catch:{ all -> 0x0072 }
        r0 = r1;
        goto L_0x000a;
    L_0x0021:
        r4 = r0;
        goto L_0x0013;
    L_0x0023:
        if (r4 == 0) goto L_0x006f;
    L_0x0025:
        r0 = r10 + 1;
    L_0x0027:
        r10 = r0;
    L_0x0028:
        if (r4 == 0) goto L_0x002d;
    L_0x002a:
        r0 = r7.length;	 Catch:{ all -> 0x0072 }
        if (r10 >= r0) goto L_0x0031;
    L_0x002d:
        if (r4 != 0) goto L_0x0036;
    L_0x002f:
        if (r10 >= 0) goto L_0x0036;
    L_0x0031:
        r0 = -1;
        r6.g = r0;	 Catch:{ all -> 0x0072 }
        r0 = r1;
        goto L_0x000a;
    L_0x0036:
        r0 = r7[r10];	 Catch:{ all -> 0x0072 }
        r3 = 0;
        r3 = r11[r3];	 Catch:{ all -> 0x0072 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0072 }
        r3 = 1;
        r3 = r8[r3];	 Catch:{ all -> 0x0072 }
        r0 = r0.opEgal(r3);	 Catch:{ all -> 0x0072 }
        if (r0 == 0) goto L_0x0023;
    L_0x0048:
        r0 = r2;
        r3 = r2;
    L_0x004a:
        if (r0 == 0) goto L_0x0066;
    L_0x004c:
        r5 = r11.length;	 Catch:{ all -> 0x0072 }
        if (r3 >= r5) goto L_0x0066;
    L_0x004f:
        r0 = r10 + 1;
        r0 = r6.get(r0);	 Catch:{ all -> 0x0072 }
        r5 = r11[r3];	 Catch:{ all -> 0x0072 }
        r0 = r0.get(r5);	 Catch:{ all -> 0x0072 }
        r5 = r3 + 1;
        r5 = r8[r5];	 Catch:{ all -> 0x0072 }
        r0 = r0.opEgal(r5);	 Catch:{ all -> 0x0072 }
        r3 = r3 + 1;
        goto L_0x004a;
    L_0x0066:
        if (r0 == 0) goto L_0x0023;
    L_0x0068:
        r6.g = r10;	 Catch:{ all -> 0x0072 }
        r0 = fr.pcsoft.wdjava.core.C0725i.m3069e(r10);	 Catch:{ all -> 0x0072 }
        goto L_0x000a;
    L_0x006f:
        r0 = r10 + -1;
        goto L_0x0027;
    L_0x0072:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.a(fr.pcsoft.wdjava.core.WDObjet[], fr.pcsoft.wdjava.core.WDObjet[], int, int, int[]):int");
    }

    /* renamed from: a */
    public synchronized int mo2649a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, int i, WDCallback wDCallback) {
        int i2;
        if (wDObjetArr == null) {
            i2 = -1;
        } else {
            i2 = m3458b(wDObjetArr, wDObjetArr2, 0, wDObjetArr.length, i, wDCallback);
            i2 = i2 != -1 ? i2 + 1 : -1;
        }
        return i2;
    }

    /* renamed from: a */
    public synchronized int mo2650a(WDObjet[] wDObjetArr, WDObjet[] wDObjetArr2, String[] strArr) {
        int i;
        if (wDObjetArr == null) {
            i = -1;
        } else {
            if (mo2640l() > 1) {
                WDErreurManager.m2883a(C0745b.m3222b(f1987z[6], new String[0]));
            }
            WDObjet[] wDObjetArr3 = wDObjetArr;
            i = m3464a(wDObjetArr3, wDObjetArr2[0], 0, wDObjetArr.length, m3421a(this.m.getClasseWD(), strArr[0]));
            i = i != -1 ? i + 1 : -1;
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized int mo2651a(fr.pcsoft.wdjava.core.WDObjet[] r11, java.lang.String[] r12, fr.pcsoft.wdjava.core.WDObjet[] r13, int r14, int r15) {
        /*
        r10 = this;
        r4 = 1;
        r2 = 0;
        r1 = -1;
        monitor-enter(r10);
        r0 = r10.mo2640l();	 Catch:{ Exception -> 0x0021 }
        if (r0 <= r4) goto L_0x0019;
    L_0x000a:
        r0 = f1987z;	 Catch:{ Exception -> 0x0021 }
        r3 = 6;
        r0 = r0[r3];	 Catch:{ Exception -> 0x0021 }
        r3 = 0;
        r3 = new java.lang.String[r3];	 Catch:{ Exception -> 0x0021 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r3);	 Catch:{ Exception -> 0x0021 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ Exception -> 0x0021 }
    L_0x0019:
        if (r11 != 0) goto L_0x0028;
    L_0x001b:
        r0 = -1;
        r10.g = r0;	 Catch:{ Exception -> 0x0026 }
        r0 = r1;
    L_0x001f:
        monitor-exit(r10);
        return r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r10);
        throw r0;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x0028:
        r0 = r12.length;	 Catch:{ all -> 0x0023 }
        r6 = new fr.pcsoft.wdjava.core.types.collection.tableau.C0761b[r0];	 Catch:{ all -> 0x0023 }
        r0 = r2;
    L_0x002c:
        r3 = r12.length;	 Catch:{ Exception -> 0x0040 }
        if (r0 >= r3) goto L_0x0042;
    L_0x002f:
        r3 = r10.m;	 Catch:{ Exception -> 0x0040 }
        r3 = r3.getClasseWD();	 Catch:{ Exception -> 0x0040 }
        r5 = r12[r0];	 Catch:{ Exception -> 0x0040 }
        r3 = r10.m3421a(r3, r5);	 Catch:{ Exception -> 0x0040 }
        r6[r0] = r3;	 Catch:{ Exception -> 0x0040 }
        r0 = r0 + 1;
        goto L_0x002c;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x0042:
        r0 = 4;
        if (r14 == r0) goto L_0x0057;
    L_0x0045:
        r0 = 5;
        if (r14 == r0) goto L_0x0057;
    L_0x0048:
        r5 = r4;
    L_0x0049:
        if (r15 != r1) goto L_0x0060;
    L_0x004b:
        r0 = r11.length;	 Catch:{ all -> 0x0023 }
        r15 = r10.m3459c(r14, r0);	 Catch:{ all -> 0x0023 }
        if (r15 >= 0) goto L_0x0060;
    L_0x0052:
        r0 = -1;
        r10.g = r0;	 Catch:{ Exception -> 0x0059 }
        r0 = r1;
        goto L_0x001f;
    L_0x0057:
        r5 = r2;
        goto L_0x0049;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x005b:
        if (r5 == 0) goto L_0x00a6;
    L_0x005d:
        r0 = r15 + 1;
    L_0x005f:
        r15 = r0;
    L_0x0060:
        if (r5 == 0) goto L_0x0065;
    L_0x0062:
        r0 = r11.length;	 Catch:{ Exception -> 0x006e }
        if (r15 >= r0) goto L_0x0069;
    L_0x0065:
        if (r5 != 0) goto L_0x0074;
    L_0x0067:
        if (r15 >= 0) goto L_0x0074;
    L_0x0069:
        r0 = -1;
        r10.g = r0;	 Catch:{ all -> 0x0023 }
        r0 = r1;
        goto L_0x001f;
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x0074:
        r7 = r6.length;	 Catch:{ all -> 0x0023 }
        r3 = r2;
        r0 = r2;
    L_0x0077:
        if (r3 >= r7) goto L_0x0097;
    L_0x0079:
        r8 = r6[r3];	 Catch:{ Exception -> 0x00a0 }
        r0 = r11[r15];	 Catch:{ Exception -> 0x00a0 }
        r9 = fr.pcsoft.wdjava.core.poo.C0558c.class;
        r0 = r0.checkType(r9);	 Catch:{ Exception -> 0x00a0 }
        r0 = (fr.pcsoft.wdjava.core.WDObjet) r0;	 Catch:{ Exception -> 0x00a0 }
        r0 = r8.mo2671a(r0);	 Catch:{ Exception -> 0x00a0 }
        r8 = r13[r3];	 Catch:{ Exception -> 0x00a0 }
        r0 = r0.opEgal(r8);	 Catch:{ Exception -> 0x00a0 }
        if (r0 == 0) goto L_0x0096;
    L_0x0091:
        r0 = r3 + 1;
        r3 = r0;
        r0 = r4;
        goto L_0x0077;
    L_0x0096:
        r0 = r2;
    L_0x0097:
        if (r0 == 0) goto L_0x005b;
    L_0x0099:
        r10.g = r15;	 Catch:{ Exception -> 0x00a4 }
        r0 = fr.pcsoft.wdjava.core.C0725i.m3069e(r15);	 Catch:{ Exception -> 0x00a4 }
        goto L_0x001f;
    L_0x00a0:
        r0 = move-exception;
        r0 = r1;
        goto L_0x001f;
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x00a6:
        r0 = r15 + -1;
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.a(fr.pcsoft.wdjava.core.WDObjet[], java.lang.String[], fr.pcsoft.wdjava.core.WDObjet[], int, int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void mo2472a(int r8, int r9) {
        /*
        r7 = this;
        r3 = 3;
        r6 = 0;
        r5 = 2;
        r4 = 1;
        r0 = r7.j;	 Catch:{ o -> 0x0029 }
        if (r0 <= r5) goto L_0x0017;
    L_0x0008:
        r0 = f1987z;	 Catch:{ o -> 0x0029 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ o -> 0x0029 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ o -> 0x0029 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ o -> 0x0029 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ o -> 0x0029 }
    L_0x0017:
        r0 = r7.j;
        if (r0 != r4) goto L_0x0050;
    L_0x001b:
        r0 = r7.c;	 Catch:{ o -> 0x002b }
        r1 = fr.pcsoft.wdjava.core.C0725i.m3011a(r8);	 Catch:{ o -> 0x002b }
        r2 = fr.pcsoft.wdjava.core.C0725i.m3011a(r9);	 Catch:{ o -> 0x002b }
        fr.pcsoft.wdjava.core.utils.xb.m4186a(r0, r1, r2);	 Catch:{ o -> 0x002b }
    L_0x0028:
        return;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        r1 = f1987z;
        r1 = r1[r4];
        r2 = new java.lang.String[r3];
        r3 = "1";
        r2[r6] = r3;
        r3 = r7.d;
        r3 = java.lang.String.valueOf(r3);
        r2[r4] = r3;
        r0 = r0.m4106a();
        r0 = java.lang.String.valueOf(r0);
        r2[r5] = r0;
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
        goto L_0x0028;
    L_0x0050:
        if (r8 < r4) goto L_0x0056;
    L_0x0052:
        r0 = r7.d;	 Catch:{ o -> 0x00c3 }
        if (r8 <= r0) goto L_0x007a;
    L_0x0056:
        r0 = f1987z;	 Catch:{ o -> 0x00c3 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ o -> 0x00c3 }
        r1 = 3;
        r1 = new java.lang.String[r1];	 Catch:{ o -> 0x00c3 }
        r2 = 0;
        r3 = "1";
        r1[r2] = r3;	 Catch:{ o -> 0x00c3 }
        r2 = 1;
        r3 = r7.d;	 Catch:{ o -> 0x00c3 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ o -> 0x00c3 }
        r1[r2] = r3;	 Catch:{ o -> 0x00c3 }
        r2 = 2;
        r3 = java.lang.String.valueOf(r8);	 Catch:{ o -> 0x00c3 }
        r1[r2] = r3;	 Catch:{ o -> 0x00c3 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ o -> 0x00c3 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ o -> 0x00c3 }
    L_0x007a:
        if (r9 < r4) goto L_0x0080;
    L_0x007c:
        r0 = r7.d;	 Catch:{ o -> 0x00c5 }
        if (r9 <= r0) goto L_0x00a4;
    L_0x0080:
        r0 = f1987z;	 Catch:{ o -> 0x00c5 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ o -> 0x00c5 }
        r1 = 3;
        r1 = new java.lang.String[r1];	 Catch:{ o -> 0x00c5 }
        r2 = 0;
        r3 = "1";
        r1[r2] = r3;	 Catch:{ o -> 0x00c5 }
        r2 = 1;
        r3 = r7.d;	 Catch:{ o -> 0x00c5 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ o -> 0x00c5 }
        r1[r2] = r3;	 Catch:{ o -> 0x00c5 }
        r2 = 2;
        r3 = java.lang.String.valueOf(r9);	 Catch:{ o -> 0x00c5 }
        r1[r2] = r3;	 Catch:{ o -> 0x00c5 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ o -> 0x00c5 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ o -> 0x00c5 }
    L_0x00a4:
        if (r9 == r8) goto L_0x0028;
    L_0x00a6:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3011a(r8);
        r1 = fr.pcsoft.wdjava.core.C0725i.m3011a(r9);
        r2 = r7.q;
        r2 = r2[r0];
        if (r0 >= r1) goto L_0x00c9;
    L_0x00b4:
        if (r0 >= r1) goto L_0x00da;
    L_0x00b6:
        r3 = r7.q;	 Catch:{ o -> 0x00c7 }
        r4 = r7.q;	 Catch:{ o -> 0x00c7 }
        r5 = r0 + 1;
        r4 = r4[r5];	 Catch:{ o -> 0x00c7 }
        r3[r0] = r4;	 Catch:{ o -> 0x00c7 }
        r0 = r0 + 1;
        goto L_0x00b4;
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        if (r0 <= r1) goto L_0x00da;
    L_0x00cb:
        r3 = r7.q;	 Catch:{ o -> 0x00d8 }
        r4 = r7.q;	 Catch:{ o -> 0x00d8 }
        r5 = r0 + -1;
        r4 = r4[r5];	 Catch:{ o -> 0x00d8 }
        r3[r0] = r4;	 Catch:{ o -> 0x00d8 }
        r0 = r0 + -1;
        goto L_0x00c9;
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r0 = r7.q;
        r0[r1] = r2;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.a(int, int):void");
    }

    /* renamed from: a */
    public synchronized void mo2652a(int i, boolean z) {
        if (mo2635i()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[9], new String[0]));
        }
        if (mo2640l() == 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[19], new String[0]));
        }
        if (i < 1 || i > mo2643o()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[20], String.valueOf(i), String.valueOf(mo2643o())));
        }
        if (this.j > 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[8], new String[0]));
        } else if (this.q != null) {
            Arrays.sort(this.q, new C0764g(i, z));
        }
    }

    /* renamed from: a */
    protected void mo2669a(int r10, int[] r11, int r12, int r13, fr.pcsoft.wdjava.core.allocation.IWDAllocateur r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.a(int, int[], int, int, fr.pcsoft.wdjava.core.allocation.IWDAllocateur):void. bs: [B:7:0x0039, B:10:0x0044, B:30:0x0086]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r9 = this;
        r1 = 1;
        r6 = 0;
        r0 = 0;
        r9.q = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.c = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.i = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.d = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.j = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.o = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.h = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.a = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.g = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.o = r13;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.m = r14;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = r11.length;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.j = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = r12 + 1;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.i = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.a = r11;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = r9.j;	 Catch:{ OutOfMemoryError -> 0x005a }
        if (r0 <= r1) goto L_0x0033;	 Catch:{ OutOfMemoryError -> 0x005a }
    L_0x002e:
        r0 = 1;	 Catch:{ OutOfMemoryError -> 0x005a }
        r0 = r11[r0];	 Catch:{ OutOfMemoryError -> 0x005a }
        r9.h = r0;	 Catch:{ OutOfMemoryError -> 0x005a }
    L_0x0033:
        r0 = r11[r12];
        r9.d = r0;
        if (r10 <= r1) goto L_0x0077;
    L_0x0039:
        r0 = r11[r12];	 Catch:{ OutOfMemoryError -> 0x005e }
        r0 = new fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple[r0];	 Catch:{ OutOfMemoryError -> 0x005e }
        r9.q = r0;	 Catch:{ OutOfMemoryError -> 0x005e }
        r1 = r10 + -1;
        r3 = r12 + 1;
        r7 = r6;
    L_0x0044:
        r0 = r9.q;	 Catch:{ OutOfMemoryError -> 0x005c }
        r0 = r0.length;	 Catch:{ OutOfMemoryError -> 0x005c }
        if (r7 >= r0) goto L_0x0073;	 Catch:{ OutOfMemoryError -> 0x005c }
    L_0x0049:
        r8 = r9.q;	 Catch:{ OutOfMemoryError -> 0x005c }
        r0 = new fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;	 Catch:{ OutOfMemoryError -> 0x005c }
        r5 = r9.m;	 Catch:{ OutOfMemoryError -> 0x005c }
        r2 = r11;	 Catch:{ OutOfMemoryError -> 0x005c }
        r4 = r13;	 Catch:{ OutOfMemoryError -> 0x005c }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ OutOfMemoryError -> 0x005c }
        r8[r7] = r0;	 Catch:{ OutOfMemoryError -> 0x005c }
        r0 = r7 + 1;
        r7 = r0;
        goto L_0x0044;
    L_0x005a:
        r0 = move-exception;
        throw r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        r0 = f1987z;
        r0 = r0[r6];
        r1 = new java.lang.String[r6];
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
    L_0x006c:
        r0 = r9.l;
        r0 = r0 | 1;
        r9.l = r0;
        return;
    L_0x0073:
        r0 = 0;
        r9.c = r0;	 Catch:{ OutOfMemoryError -> 0x005e }
        goto L_0x006c;	 Catch:{ OutOfMemoryError -> 0x005e }
    L_0x0077:
        r0 = 0;	 Catch:{ OutOfMemoryError -> 0x005e }
        r9.q = r0;	 Catch:{ OutOfMemoryError -> 0x005e }
        r1 = r11[r12];	 Catch:{ OutOfMemoryError -> 0x005e }
        r0 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x005e }
        r0.<init>(r1);	 Catch:{ OutOfMemoryError -> 0x005e }
        r9.c = r0;	 Catch:{ OutOfMemoryError -> 0x005e }
        r0 = r6;
    L_0x0084:
        if (r0 >= r1) goto L_0x006c;
    L_0x0086:
        r2 = r9.c;	 Catch:{ OutOfMemoryError -> 0x0094 }
        r3 = r9.m;	 Catch:{ OutOfMemoryError -> 0x0094 }
        r3 = fr.pcsoft.wdjava.core.allocation.C0611a.m2294a(r13, r3);	 Catch:{ OutOfMemoryError -> 0x0094 }
        r2.add(r3);	 Catch:{ OutOfMemoryError -> 0x0094 }
        r0 = r0 + 1;
        goto L_0x0084;
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x005e }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.a(int, int[], int, int, fr.pcsoft.wdjava.core.allocation.IWDAllocateur):void");
    }

    /* renamed from: a */
    public synchronized void mo2653a(WDCallback wDCallback) {
        if (this.j != 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[21], new String[0]));
        } else if (this.c != null) {
            Collections.sort(this.c, new C0771t(wDCallback));
        }
    }

    /* renamed from: a */
    public void mo2465a(WDObjet wDObjet) {
        if (this.j > 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[2], new String[0]));
        }
        if (this.j == 1) {
            mo2663b(wDObjet.getInt());
            return;
        }
        int i = wDObjet.getInt();
        if (i <= 0 || i > this.q.length) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[1], "1", String.valueOf(this.q.length), String.valueOf(i)));
        }
        i = C0725i.m3011a(i);
        this.d--;
        int[] iArr = this.a;
        iArr[0] = iArr[0] - 1;
        Object obj = new WDTableauSimple[this.d];
        System.arraycopy(this.q, 0, obj, 0, i);
        if (i < this.q.length) {
            System.arraycopy(this.q, i + 1, obj, i, (this.q.length - i) - 1);
        }
        this.q = obj;
    }

    /* renamed from: a */
    public void mo2466a(WDObjet wDObjet, WDObjet... wDObjetArr) {
        if (this.j > 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[2], new String[0]));
        }
        if (this.j == 1) {
            mo2474a(wDObjetArr.length > 0 ? wDObjetArr[0] : null, wDObjet);
            return;
        }
        int i = wDObjet.getInt();
        if (i < 0 || i > this.q.length + 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[1], "1", String.valueOf(this.q.length), String.valueOf(i)));
        }
        int a = C0725i.m3011a(i);
        this.d++;
        int[] iArr = this.a;
        iArr[0] = iArr[0] + 1;
        Object obj = new WDTableauSimple[this.d];
        System.arraycopy(this.q, 0, obj, 0, a);
        if (a < this.q.length) {
            System.arraycopy(this.q, a, obj, a + 1, this.q.length - a);
        }
        WDTableauSimple wDTableauSimple = new WDTableauSimple(1, this.a, 1, this.o, this.m);
        int min = Math.min(wDObjetArr.length, this.a[1]);
        for (int i2 = 0; i2 < min; i2++) {
            ((WDObjet) wDTableauSimple.c.get(i2)).setValeur(wDObjetArr[i2]);
        }
        obj[a] = wDTableauSimple;
        this.q = obj;
    }

    /* renamed from: a */
    public synchronized void mo2654a(C0758k c0758k) {
        if (!(c0758k instanceof C0759o)) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[15], new String[0]));
        }
        C0759o c0759o = (C0759o) c0758k;
        if (this.j != c0759o.mo2640l()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[14], new String[0]));
        }
        if (this.o != c0759o.mo2487d()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[16], new String[0]));
        }
        if (c0759o.isTableauFixe()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[17], new String[0]));
        }
        mo2659a(c0759o.m3456v(), 0);
        m3489c(c0759o);
    }

    /* renamed from: a */
    public synchronized void mo2655a(String str) {
        String[] split = str.split(";");
        C0761b[] c0761bArr = new C0761b[split.length];
        boolean[] zArr = new boolean[split.length];
        Class classeWD = this.m.getClasseWD();
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (!str2.equals("")) {
                switch (str2.charAt(0)) {
                    case '+':
                        zArr[i] = true;
                        str2 = str2.substring(1, str2.length());
                        break;
                    case '-':
                        zArr[i] = false;
                        str2 = str2.substring(1, str2.length());
                        break;
                    default:
                        zArr[i] = true;
                        break;
                }
                c0761bArr[i] = m3421a(classeWD, str2);
            }
        }
        if (this.j != 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[6], new String[0]));
        } else if (this.c != null) {
            Collections.sort(this.c, new C0769n(c0761bArr, zArr));
        }
    }

    /* renamed from: a */
    public void mo2656a(String str, String str2, String str3) {
        String a;
        if (this.j > 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[2], new String[0]));
        }
        int i = this.o == 36 ? 1 : 0;
        if (i != 0 && this.j > 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[6], new String[0]));
        }
        if (this.m != null && i == 0) {
            a = C0735q.m3116a(this.m.getClasseWD());
            if (a.startsWith(f1987z[12])) {
                a = a.substring(f1987z[12].length(), a.length());
            }
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[11], a));
        }
        String[] a2 = C0808l.m4029a(str, str2);
        int length = a2.length;
        String[] a3 = C0808l.m4029a(a2[0], str3);
        int length2 = a3.length;
        i = i != 0 ? 1 : this.j;
        if (i != this.j || ((i == 1 && this.d != length) || (i == 2 && !(this.a[0] == length && this.a[1] == length2)))) {
            mo2659a(i == 1 ? new int[]{length} : new int[]{length, length2}, 0);
        }
        int i2 = 1;
        String[] strArr = a3;
        while (i2 <= length) {
            a3 = i2 > 1 ? C0808l.m4029a(a2[i2 - 1], str3) : strArr;
            if (this.o == 36) {
                if (this.j == 1) {
                    ((C0734p) get(i2)).chaineVersMembre(a3);
                }
            } else if (i > 1) {
                int i3 = 1;
                while (i3 <= length2 && i3 <= a3.length) {
                    a = a3[i3 - 1];
                    if (i3 == length2 && a3.length > length2) {
                        StringBuffer stringBuffer = new StringBuffer(a);
                        int i4 = i3 + 1;
                        while (i4 <= a3.length) {
                            stringBuffer.append(a3[i4 - 1]);
                            i4++;
                        }
                        i3 = i4;
                        a = stringBuffer.toString();
                    }
                    get(i2).get(i3).setValeur(a);
                    i3++;
                }
            } else {
                get(i2).setValeur(a2[i2 - 1]);
            }
            i2++;
            strArr = a3;
        }
    }

    /* renamed from: a */
    public synchronized void mo2657a(StringBuffer stringBuffer, String str, String str2) {
        int i = 0;
        synchronized (this) {
            if (this.j > 2) {
                WDErreurManager.m2883a(C0745b.m3222b(f1987z[2], new String[0]));
            }
            String str3 = mo2640l() == 1 ? str : str2;
            if (!(this.m == null || this.o == 36)) {
                String a = C0735q.m3116a(this.m.getClasseWD());
                if (a.startsWith(f1987z[12])) {
                    a = a.substring(f1987z[12].length(), a.length());
                }
                WDErreurManager.m2883a(C0745b.m3222b(f1987z[11], a));
            }
            int length;
            if (this.q != null) {
                length = this.q.length;
                while (i < length) {
                    if (i > 0) {
                        stringBuffer.append(str);
                    }
                    this.q[i].mo2657a(stringBuffer, str, str3);
                    i++;
                }
            } else if (this.c != null) {
                int size = this.c.size();
                for (length = 0; length < size; length++) {
                    if (length > 0) {
                        stringBuffer.append(str3);
                    }
                    switch (this.o) {
                        case 17:
                        case 81:
                            String string = ((WDObjet) this.c.get(length)).getString();
                            if (string.equals("")) {
                                string = String.valueOf('\u0000');
                            }
                            stringBuffer.append(string);
                            break;
                        case 27:
                            stringBuffer.append(((WDDuree) this.c.get(length)).m2406g());
                            break;
                        case 36:
                            stringBuffer.append(((C0734p) this.c.get(length)).membresVersChaine(str2));
                            break;
                        default:
                            stringBuffer.append(((WDObjet) this.c.get(length)).getString());
                            break;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo2658a(int[] iArr) {
        if (mo2635i()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[9], new String[0]));
        }
        if (mo2640l() == 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[19], new String[0]));
        }
        if (this.j > 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[8], new String[0]));
        } else if (this.q != null) {
            Arrays.sort(this.q, new C0766j(iArr));
        }
    }

    /* renamed from: a */
    public void mo2659a(int[] iArr, int i) {
        if (iArr.length != this.j) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[10], new String[0]));
        }
        if (this.j > 1) {
            this.h = iArr[1];
        }
        this.d = Math.max(0, iArr[i]);
        this.a = iArr;
        int size;
        if (this.i != this.j) {
            Object obj = new WDTableauSimple[this.d];
            System.arraycopy(this.q, 0, obj, 0, Math.min(this.q.length, obj.length));
            int i2 = i + 1;
            if (obj.length > this.q.length) {
                for (int length = this.q.length; length < obj.length; length++) {
                    obj[length] = new WDTableauSimple(this.j - i2, iArr, i2, this.o, this.m);
                }
            }
            for (WDTableauSimple a : obj) {
                a.mo2659a(iArr, i2);
            }
            this.q = obj;
        } else if (this.d > this.c.size()) {
            this.c.ensureCapacity(this.d);
            for (size = this.c.size(); size < this.d; size++) {
                this.c.add(C0611a.m2294a(this.o, this.m));
            }
        } else if (this.d < this.c.size()) {
            for (size = this.c.size(); size > this.d; size--) {
                this.c.remove(size - 1);
            }
        }
    }

    /* renamed from: a */
    protected boolean mo2660a(C0759o c0759o) {
        return c0759o instanceof WDTableauSimple;
    }

    public void allouerTableau(int i, int[] iArr, int i2, int i3) {
        mo2669a(i, iArr, i2, i3, null);
    }

    public void allouerTableau(int i, int[] iArr, int i2, IWDAllocateur iWDAllocateur) {
        mo2669a(i, iArr, i2, iWDAllocateur.getTypeWL(), iWDAllocateur);
    }

    /* renamed from: b */
    public synchronized int mo2663b(int i) {
        int i2 = 1;
        synchronized (this) {
            if (this.j == 1) {
                if (i < 1 || i > this.d) {
                    WDErreurManager.m2883a(C0745b.m3222b(f1987z[1], "1", "" + this.d, "" + i));
                }
                this.c.remove(C0725i.m3011a(i));
                this.d--;
                int[] iArr = this.a;
                iArr[0] = iArr[0] - 1;
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1987z[5], new String[0]));
                i2 = 0;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public synchronized int mo2475b(WDObjet wDObjet) {
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.j == 1) {
                int i3 = (wDObjet == null || !wDObjet.isTableau() || wDObjet.isTableauAssociatif()) ? 0 : 1;
                int h = i3 != 0 ? (int) ((C0759o) wDObjet).mo2483h() : 1;
                this.d += h;
                this.a[0] = this.d;
                this.c.ensureCapacity(this.d);
                WDObjet b;
                if (i3 != 0) {
                    while (i2 < h) {
                        WDObjet a = C0611a.m2294a(this.o, this.m);
                        b = ((C0759o) wDObjet).mo2633b((long) (i2 + 1));
                        if (b != null) {
                            a.setValeur(b);
                        }
                        this.c.add(a);
                        i2++;
                    }
                } else {
                    b = C0611a.m2294a(this.o, this.m);
                    if (wDObjet != null) {
                        b.setValeur(wDObjet);
                    }
                    this.c.add(b);
                }
                i = this.d;
            } else {
                WDErreurManager.m2883a(C0745b.m3222b(f1987z[5], new String[0]));
                i = -1;
            }
        }
        return i;
    }

    /* renamed from: b */
    public void mo2476b() {
        if (this.j == 1) {
            Collections.reverse(this.c);
            return;
        }
        for (int i = 0; i < this.q.length / 2; i++) {
            C0759o c0759o = this.q[i];
            this.q[i] = this.q[(this.q.length - i) - 1];
            this.q[(this.q.length - i) - 1] = c0759o;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public void mo2477b(int r8, int r9) {
        /*
        r7 = this;
        r3 = 3;
        r6 = 0;
        r5 = 2;
        r4 = 1;
        r0 = r7.j;	 Catch:{ o -> 0x0029 }
        if (r0 <= r5) goto L_0x0017;
    L_0x0008:
        r0 = f1987z;	 Catch:{ o -> 0x0029 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ o -> 0x0029 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ o -> 0x0029 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ o -> 0x0029 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ o -> 0x0029 }
    L_0x0017:
        r0 = r7.j;
        if (r0 != r4) goto L_0x0050;
    L_0x001b:
        r0 = r7.c;	 Catch:{ o -> 0x002b }
        r1 = fr.pcsoft.wdjava.core.C0725i.m3011a(r8);	 Catch:{ o -> 0x002b }
        r2 = fr.pcsoft.wdjava.core.C0725i.m3011a(r9);	 Catch:{ o -> 0x002b }
        fr.pcsoft.wdjava.core.utils.xb.m4188b(r0, r1, r2);	 Catch:{ o -> 0x002b }
    L_0x0028:
        return;
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        r1 = f1987z;
        r1 = r1[r4];
        r2 = new java.lang.String[r3];
        r3 = "1";
        r2[r6] = r3;
        r3 = r7.d;
        r3 = java.lang.String.valueOf(r3);
        r2[r4] = r3;
        r0 = r0.m4106a();
        r0 = java.lang.String.valueOf(r0);
        r2[r5] = r0;
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r1, r2);
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);
        goto L_0x0028;
    L_0x0050:
        if (r8 < r4) goto L_0x0056;
    L_0x0052:
        r0 = r7.d;	 Catch:{ o -> 0x00be }
        if (r8 <= r0) goto L_0x007a;
    L_0x0056:
        r0 = f1987z;	 Catch:{ o -> 0x00be }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ o -> 0x00be }
        r1 = 3;
        r1 = new java.lang.String[r1];	 Catch:{ o -> 0x00be }
        r2 = 0;
        r3 = "1";
        r1[r2] = r3;	 Catch:{ o -> 0x00be }
        r2 = 1;
        r3 = r7.d;	 Catch:{ o -> 0x00be }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ o -> 0x00be }
        r1[r2] = r3;	 Catch:{ o -> 0x00be }
        r2 = 2;
        r3 = java.lang.String.valueOf(r8);	 Catch:{ o -> 0x00be }
        r1[r2] = r3;	 Catch:{ o -> 0x00be }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ o -> 0x00be }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ o -> 0x00be }
    L_0x007a:
        if (r9 < r4) goto L_0x0080;
    L_0x007c:
        r0 = r7.d;	 Catch:{ o -> 0x00c0 }
        if (r9 <= r0) goto L_0x00a4;
    L_0x0080:
        r0 = f1987z;	 Catch:{ o -> 0x00c0 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ o -> 0x00c0 }
        r1 = 3;
        r1 = new java.lang.String[r1];	 Catch:{ o -> 0x00c0 }
        r2 = 0;
        r3 = "1";
        r1[r2] = r3;	 Catch:{ o -> 0x00c0 }
        r2 = 1;
        r3 = r7.d;	 Catch:{ o -> 0x00c0 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ o -> 0x00c0 }
        r1[r2] = r3;	 Catch:{ o -> 0x00c0 }
        r2 = 2;
        r3 = java.lang.String.valueOf(r9);	 Catch:{ o -> 0x00c0 }
        r1[r2] = r3;	 Catch:{ o -> 0x00c0 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ o -> 0x00c0 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ o -> 0x00c0 }
    L_0x00a4:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3011a(r8);
        r1 = fr.pcsoft.wdjava.core.C0725i.m3011a(r9);
        r2 = r7.q;
        r2 = r2[r0];
        r3 = r7.q;
        r4 = r7.q;
        r4 = r4[r1];
        r3[r0] = r4;
        r0 = r7.q;
        r0[r1] = r2;
        goto L_0x0028;
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple.b(int, int):void");
    }

    /* renamed from: b */
    public synchronized void mo2664b(boolean z) {
        if (mo2635i()) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[9], new String[0]));
        }
        if (this.j > 2) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[8], new String[0]));
        } else if (this.j == 1) {
            if (this.c != null) {
                Collections.sort(this.c, new C0772u(z));
            }
        } else if (this.q != null) {
            Arrays.sort(this.q, new C0764g(1, z));
        }
    }

    /* renamed from: c */
    public void mo2479c() {
        if (this.j == 1) {
            Collections.shuffle(this.c, C0817u.f2167a);
            return;
        }
        int i;
        int h = (int) mo2483h();
        Object arrayList = new ArrayList(h);
        for (i = 1; i <= h; i++) {
            arrayList.add(mo2633b((long) i));
        }
        Collections.shuffle(arrayList, C0817u.f2167a);
        for (i = 1; i <= h; i++) {
            m3424a((long) i, (WDObjet) arrayList.get(i - 1));
        }
    }

    /* renamed from: c */
    protected void m3489c(C0759o c0759o) {
        int min;
        int i;
        if (this.c != null) {
            ArrayList t = c0759o.m3455t();
            min = Math.min(t.size(), this.c.size());
            for (i = 0; i < min; i++) {
                ((WDObjet) this.c.get(i)).setValeur((WDObjet) t.get(i));
            }
        } else if (this.q != null) {
            C0759o[] w = c0759o.m3457w();
            min = Math.min(this.q.length, w.length);
            for (i = 0; i < min; i++) {
                ((WDTableauSimple) this.q[i]).m3489c(w[i]);
            }
        }
    }

    /* renamed from: c */
    public void mo2665c(String str) {
        if (this.j > 1) {
            WDErreurManager.m2883a(C0745b.m3222b(f1987z[4], new String[0]));
        }
        String[] split = str.split(f1987z[3]);
        int length = split.length;
        if (this.d != length) {
            mo2659a(new int[]{length}, 0);
        }
        for (int i = 0; i < length; i++) {
            ((WDObjet) this.c.get(i)).setValeur(split[i]);
        }
    }

    /* renamed from: d */
    public final void mo2666d(WDObjet wDObjet) {
        if (this.j == 1) {
            this.d++;
            this.a[0] = this.d;
            this.c.add(wDObjet);
        }
    }

    /* renamed from: e */
    public synchronized void mo2480e() {
        int i = 0;
        synchronized (this) {
            int i2;
            this.d = 0;
            this.h = 0;
            this.g = 0;
            if (this.a != null) {
                for (i2 = 0; i2 < this.a.length; i2++) {
                    this.a[i2] = 0;
                }
            }
            if (this.c != null) {
                this.c.clear();
            }
            if (this.q != null) {
                i2 = this.q.length;
                while (i < i2) {
                    this.q[i].mo2480e();
                    i++;
                }
                this.q = new C0759o[0];
            }
        }
    }

    /* renamed from: j */
    public boolean mo2667j() {
        return true;
    }

    public void liberer() {
        WDErreurManager.m2883a(C0745b.m3222b(f1987z[18], new String[0]));
    }

    /* renamed from: s */
    protected void mo2668s() {
        if (this.c != null) {
            this.c.clear();
        } else if (this.q != null) {
            for (C0759o s : this.q) {
                s.mo2668s();
            }
        }
    }
}
