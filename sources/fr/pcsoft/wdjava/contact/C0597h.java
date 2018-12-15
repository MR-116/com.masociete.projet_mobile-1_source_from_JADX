package fr.pcsoft.wdjava.contact;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentUris;
import android.database.Cursor;
import android.provider.ContactsContract.Contacts;
import android.provider.ContactsContract.RawContacts;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;
import fr.pcsoft.wdjava.ui.activite.C1056i;

/* renamed from: fr.pcsoft.wdjava.contact.h */
public class C0597h extends C0595f {
    /* renamed from: a */
    private static final int f1398a = 4;
    /* renamed from: b */
    private static final String f1399b = C0597h.m2193z(C0597h.m2194z("O__!GC_UcE"));
    /* renamed from: c */
    private static final int f1400c = 5;
    /* renamed from: d */
    private static final int f1401d = 1;
    /* renamed from: e */
    private static final int f1402e = 2;
    /* renamed from: f */
    private static final int f1403f = 3;
    /* renamed from: z */
    private static final String[] f1404z;

    static {
        r0 = new String[33];
        r0[0] = C0597h.m2193z(C0597h.m2194z("M^V}OET\u001cE^][|SE_\\!riqvPcc~fNcxc"));
        r0[1] = C0597h.m2193z(C0597h.m2194z("M^V}OET\u001cE^][|SE_\\!w~yfJo|[aoda"));
        r0[2] = C0597h.m2193z(C0597h.m2194z("\u000fu`]o_tioq@nxqq[e~dNletw"));
        r0[3] = C0597h.m2193z(C0597h.m2194z("XG[{TIB"));
        r0[4] = C0597h.m2193z(C0597h.m2194z("M^V}OET\u001cE^][|SE_\\!gidmNcogAt"));
        r0[5] = C0597h.m2193z(C0597h.m2194z("JQQjBC_Y"));
        r0[6] = C0597h.m2193z(C0597h.m2194z("MSQ`UBDmaAAU\u000f0\u0000m~v/AOS]zNXoFvPI\r\r"));
        r0[7] = C0597h.m2193z(C0597h.m2194z("sYV"));
        r0[8] = C0597h.m2193z(C0597h.m2194z("kUA{IC^\\nI^U\u0012kE\fS]bPXU\u0012aOB\u0010SlCICAfB@U\u001c"));
        r0[9] = C0597h.m2193z(C0597h.m2194z("\u000fu`]o|[aodmFnih{\\tm~f"));
        r0[10] = C0597h.m2193z(C0597h.m2194z("Z^V!ABT@`IH\u001eQzR__@!IXU_ O^WSaIVQFfOB"));
        r0[11] = C0597h.m2193z(C0597h.m2194z("HQFn\u0011"));
        r0[12] = C0597h.m2193z(C0597h.m2194z("\f\r\u0012"));
        r0[13] = C0597h.m2193z(C0597h.m2194z("HQFn\u0012"));
        r0[14] = C0597h.m2193z(C0597h.m2194z("HU^jTIT\u000f?"));
        r0[15] = C0597h.m2193z(C0597h.m2194z("MSQ`UBDm{Y\\U"));
        r0[16] = C0597h.m2193z(C0597h.m2194z("Z^V!ABT@`IH\u001eQzR__@!IXU_ EAQ[cZ\u0002"));
        r0[17] = C0597h.m2193z(C0597h.m2194z("\u0013\u0010q@l`qfJ\u0000bqNsi"));
        r0[18] = C0597h.m2193z(C0597h.m2194z("MSQ`UBDmaAAU"));
        r0[19] = C0597h.m2193z(C0597h.m2194z("HQFn\u0013"));
        r0[20] = C0597h.m2193z(C0597h.m2194z("AY_jTU@W"));
        r0[21] = C0597h.m2193z(C0597h.m2194z("\f\u000e\u000f/"));
        r0[22] = C0597h.m2193z(C0597h.m2194z("\f\f\u000f/"));
        r0[23] = C0597h.m2193z(C0597h.m2194z("\u0011\u0017"));
        r0[24] = C0597h.m2193z(C0597h.m2194z("O_\\{AODmfD"));
        r0[25] = C0597h.m2193z(C0597h.m2194z("HYALMImaAAU\u0012Lo`|s[e\f|}La`yhJd\fqaL"));
        r0[26] = C0597h.m2193z(C0597h.m2194z("Z^V!ABT@`IH\u001eQzR__@!IXU_ NM]W"));
        r0[27] = C0597h.m2193z(C0597h.m2194z("HYALMImaAAU"));
        r0[28] = C0597h.m2193z(C0597h.m2194z("^QEPCC^FnCXo[k"));
        r0[29] = C0597h.m2193z(C0597h.m2194z("_DS}RIT"));
        r0[30] = C0597h.m2193z(C0597h.m2194z("\fq|K\u0000"));
        r0[31] = C0597h.m2193z(C0597h.m2194z("Z^V!ABT@`IH\u001eQzR__@!IXU_ PD_\\jZ\u0002"));
        r0[32] = C0597h.m2193z(C0597h.m2194z("jY^{RI\u0010\\`N\fCGPCBFæ\u000e"));
        f1404z = r0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple m2184a(fr.pcsoft.wdjava.contact.WDContactSource r12, int r13, java.lang.String r14, java.lang.String r15) throws fr.pcsoft.wdjava.contact.C0606q {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.contact.h.a(fr.pcsoft.wdjava.contact.WDContactSource, int, java.lang.String, java.lang.String):fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple. bs: [B:66:0x017a, B:70:0x0183, B:75:0x018a]
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
        r8 = 0;
        r0 = 1;
        r7 = 0;
        r1 = 1;
        r1 = new java.lang.String[r1];	 Catch:{ m -> 0x00e6 }
        r2 = 0;	 Catch:{ m -> 0x00e6 }
        r3 = f1404z;	 Catch:{ m -> 0x00e6 }
        r4 = 0;	 Catch:{ m -> 0x00e6 }
        r3 = r3[r4];	 Catch:{ m -> 0x00e6 }
        r1[r2] = r3;	 Catch:{ m -> 0x00e6 }
        fr.pcsoft.wdjava.core.application.WDAppManager.m2565a(r1);	 Catch:{ m -> 0x00e6 }
        r10 = fr.pcsoft.wdjava.ui.activite.C1056i.m7562a();
        if (r12 == 0) goto L_0x001d;
    L_0x0017:
        r1 = r12.isValeurNull();	 Catch:{ m -> 0x00f4 }
        if (r1 == 0) goto L_0x0103;
    L_0x001d:
        r6 = r0;
    L_0x001e:
        if (r13 <= 0) goto L_0x02b7;
    L_0x0020:
        if (r14 == 0) goto L_0x02b7;
    L_0x0022:
        r1 = "";	 Catch:{ all -> 0x00f6 }
        r0 = "";	 Catch:{ all -> 0x00f6 }
        switch(r13) {
            case 1: goto L_0x0106;
            case 2: goto L_0x0114;
            case 3: goto L_0x0122;
            case 4: goto L_0x0130;
            case 5: goto L_0x013e;
            default: goto L_0x0029;
        };	 Catch:{ all -> 0x00f6 }
    L_0x0029:
        r2 = f1404z;	 Catch:{ all -> 0x00f6 }
        r3 = 32;	 Catch:{ all -> 0x00f6 }
        r2 = r2[r3];	 Catch:{ all -> 0x00f6 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2856a(r2);	 Catch:{ all -> 0x00f6 }
    L_0x0032:
        r2 = "";	 Catch:{ all -> 0x00f6 }
        r2 = r1.equals(r2);	 Catch:{ all -> 0x00f6 }
        if (r2 != 0) goto L_0x02b7;	 Catch:{ all -> 0x00f6 }
    L_0x003a:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f6 }
        r3.<init>();	 Catch:{ all -> 0x00f6 }
        if (r15 == 0) goto L_0x014c;	 Catch:{ all -> 0x00f6 }
    L_0x0041:
        r2 = r3.append(r1);	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 21;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 17;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2.append(r4);	 Catch:{ all -> 0x00f6 }
        r2 = f1404z;	 Catch:{ all -> 0x00f6 }
        r4 = 30;	 Catch:{ all -> 0x00f6 }
        r2 = r2[r4];	 Catch:{ all -> 0x00f6 }
        r2 = r3.append(r2);	 Catch:{ all -> 0x00f6 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x00f6 }
        r2 = f1404z;	 Catch:{ all -> 0x00f6 }
        r4 = 22;	 Catch:{ all -> 0x00f6 }
        r2 = r2[r4];	 Catch:{ all -> 0x00f6 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00f6 }
        r2 = f1404z;	 Catch:{ all -> 0x00f6 }
        r4 = 17;	 Catch:{ all -> 0x00f6 }
        r2 = r2[r4];	 Catch:{ all -> 0x00f6 }
        r1.append(r2);	 Catch:{ all -> 0x00f6 }
        r1 = 2;	 Catch:{ all -> 0x00f6 }
        r4 = new java.lang.String[r1];	 Catch:{ all -> 0x00f6 }
        r1 = 0;	 Catch:{ all -> 0x00f6 }
        r4[r1] = r14;	 Catch:{ all -> 0x00f6 }
        r1 = 1;	 Catch:{ all -> 0x00f6 }
        r4[r1] = r15;	 Catch:{ all -> 0x00f6 }
    L_0x0082:
        r1 = f1404z;	 Catch:{ m -> 0x016b }
        r2 = 30;	 Catch:{ m -> 0x016b }
        r1 = r1[r2];	 Catch:{ m -> 0x016b }
        r1 = r3.append(r1);	 Catch:{ m -> 0x016b }
        r2 = f1404z;	 Catch:{ m -> 0x016b }
        r5 = 20;	 Catch:{ m -> 0x016b }
        r2 = r2[r5];	 Catch:{ m -> 0x016b }
        r1 = r1.append(r2);	 Catch:{ m -> 0x016b }
        r2 = f1404z;	 Catch:{ m -> 0x016b }
        r5 = 23;	 Catch:{ m -> 0x016b }
        r2 = r2[r5];	 Catch:{ m -> 0x016b }
        r1 = r1.append(r2);	 Catch:{ m -> 0x016b }
        r0 = r1.append(r0);	 Catch:{ m -> 0x016b }
        r1 = "'";	 Catch:{ m -> 0x016b }
        r0.append(r1);	 Catch:{ m -> 0x016b }
        if (r6 == 0) goto L_0x016d;	 Catch:{ m -> 0x016b }
    L_0x00ab:
        r0 = f1404z;	 Catch:{ m -> 0x016b }
        r1 = 24;	 Catch:{ m -> 0x016b }
        r5 = r0[r1];	 Catch:{ m -> 0x016b }
    L_0x00b1:
        r0 = r10.getContentResolver();	 Catch:{ all -> 0x02af }
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;	 Catch:{ all -> 0x02af }
        r2 = 1;	 Catch:{ all -> 0x02af }
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x02af }
        r9 = 0;	 Catch:{ all -> 0x02af }
        r2[r9] = r5;	 Catch:{ all -> 0x02af }
        r3 = r3.toString();	 Catch:{ all -> 0x02af }
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x02af }
        r0 = r1.getCount();	 Catch:{ all -> 0x0177 }
        r8 = new long[r0];	 Catch:{ all -> 0x0177 }
        r3 = r1.getColumnIndex(r5);	 Catch:{ all -> 0x0177 }
        r1.moveToFirst();	 Catch:{ all -> 0x0177 }
        r0 = r7;
    L_0x00d3:
        r2 = r1.isAfterLast();	 Catch:{ m -> 0x0175 }
        if (r2 != 0) goto L_0x0188;	 Catch:{ m -> 0x0175 }
    L_0x00d9:
        r2 = r0 + 1;	 Catch:{ m -> 0x0175 }
        r4 = r1.getLong(r3);	 Catch:{ m -> 0x0175 }
        r8[r0] = r4;	 Catch:{ m -> 0x0175 }
        r1.moveToNext();	 Catch:{ m -> 0x0175 }
        r0 = r2;
        goto L_0x00d3;
    L_0x00e6:
        r0 = move-exception;
        r1 = new fr.pcsoft.wdjava.contact.q;
        r2 = 101791; // 0x18d9f float:1.4264E-40 double:5.02914E-319;
        r0 = r0.getMessage();
        r1.<init>(r2, r0);
        throw r1;
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
    L_0x00f7:
        if (r8 == 0) goto L_0x0102;
    L_0x00f9:
        r1 = r8.isClosed();	 Catch:{ m -> 0x02ad }
        if (r1 != 0) goto L_0x0102;	 Catch:{ m -> 0x02ad }
    L_0x00ff:
        r8.close();	 Catch:{ m -> 0x02ad }
    L_0x0102:
        throw r0;
    L_0x0103:
        r6 = r7;
        goto L_0x001e;
    L_0x0106:
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r1 = 11;	 Catch:{ all -> 0x00f6 }
        r1 = r0[r1];	 Catch:{ all -> 0x00f6 }
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r2 = 31;	 Catch:{ all -> 0x00f6 }
        r0 = r0[r2];	 Catch:{ all -> 0x00f6 }
        goto L_0x0032;	 Catch:{ all -> 0x00f6 }
    L_0x0114:
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r1 = 19;	 Catch:{ all -> 0x00f6 }
        r1 = r0[r1];	 Catch:{ all -> 0x00f6 }
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r2 = 26;	 Catch:{ all -> 0x00f6 }
        r0 = r0[r2];	 Catch:{ all -> 0x00f6 }
        goto L_0x0032;	 Catch:{ all -> 0x00f6 }
    L_0x0122:
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r1 = 13;	 Catch:{ all -> 0x00f6 }
        r1 = r0[r1];	 Catch:{ all -> 0x00f6 }
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r2 = 26;	 Catch:{ all -> 0x00f6 }
        r0 = r0[r2];	 Catch:{ all -> 0x00f6 }
        goto L_0x0032;	 Catch:{ all -> 0x00f6 }
    L_0x0130:
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r1 = 11;	 Catch:{ all -> 0x00f6 }
        r1 = r0[r1];	 Catch:{ all -> 0x00f6 }
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r2 = 16;	 Catch:{ all -> 0x00f6 }
        r0 = r0[r2];	 Catch:{ all -> 0x00f6 }
        goto L_0x0032;	 Catch:{ all -> 0x00f6 }
    L_0x013e:
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r1 = 11;	 Catch:{ all -> 0x00f6 }
        r1 = r0[r1];	 Catch:{ all -> 0x00f6 }
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r2 = 10;	 Catch:{ all -> 0x00f6 }
        r0 = r0[r2];	 Catch:{ all -> 0x00f6 }
        goto L_0x0032;	 Catch:{ all -> 0x00f6 }
    L_0x014c:
        r1 = r3.append(r1);	 Catch:{ all -> 0x00f6 }
        r2 = f1404z;	 Catch:{ all -> 0x00f6 }
        r4 = 12;	 Catch:{ all -> 0x00f6 }
        r2 = r2[r4];	 Catch:{ all -> 0x00f6 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00f6 }
        r2 = f1404z;	 Catch:{ all -> 0x00f6 }
        r4 = 17;	 Catch:{ all -> 0x00f6 }
        r2 = r2[r4];	 Catch:{ all -> 0x00f6 }
        r1.append(r2);	 Catch:{ all -> 0x00f6 }
        r1 = 1;	 Catch:{ all -> 0x00f6 }
        r4 = new java.lang.String[r1];	 Catch:{ all -> 0x00f6 }
        r1 = 0;	 Catch:{ all -> 0x00f6 }
        r4[r1] = r14;	 Catch:{ all -> 0x00f6 }
        goto L_0x0082;	 Catch:{ all -> 0x00f6 }
    L_0x016b:
        r0 = move-exception;	 Catch:{ all -> 0x00f6 }
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x016d:
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r1 = 28;	 Catch:{ all -> 0x00f6 }
        r5 = r0[r1];	 Catch:{ all -> 0x00f6 }
        goto L_0x00b1;
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
    L_0x0178:
        if (r1 == 0) goto L_0x0183;
    L_0x017a:
        r2 = r1.isClosed();	 Catch:{ m -> 0x0201 }
        if (r2 != 0) goto L_0x0183;	 Catch:{ m -> 0x0201 }
    L_0x0180:
        r1.close();	 Catch:{ m -> 0x0201 }
    L_0x0183:
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        r8 = r1;
        goto L_0x00f7;
    L_0x0188:
        if (r1 == 0) goto L_0x02b3;
    L_0x018a:
        r0 = r1.isClosed();	 Catch:{ m -> 0x01ff }
        if (r0 != 0) goto L_0x02b3;	 Catch:{ m -> 0x01ff }
    L_0x0190:
        r1.close();	 Catch:{ m -> 0x01ff }
        r9 = r8;
        r8 = r1;
    L_0x0195:
        if (r6 == 0) goto L_0x0203;
    L_0x0197:
        r0 = r10.getContentResolver();	 Catch:{ all -> 0x00f6 }
        r1 = android.provider.ContactsContract.Contacts.CONTENT_URI;	 Catch:{ all -> 0x00f6 }
        r2 = 3;	 Catch:{ all -> 0x00f6 }
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x00f6 }
        r3 = 0;	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 7;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2[r3] = r4;	 Catch:{ all -> 0x00f6 }
        r3 = 1;	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 27;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2[r3] = r4;	 Catch:{ all -> 0x00f6 }
        r3 = 2;	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 29;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2[r3] = r4;	 Catch:{ all -> 0x00f6 }
        r3 = 0;	 Catch:{ all -> 0x00f6 }
        r4 = 0;	 Catch:{ all -> 0x00f6 }
        r5 = f1404z;	 Catch:{ all -> 0x00f6 }
        r10 = 25;	 Catch:{ all -> 0x00f6 }
        r5 = r5[r10];	 Catch:{ all -> 0x00f6 }
        r8 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00f6 }
    L_0x01c6:
        r2 = r8.getCount();	 Catch:{ all -> 0x00f6 }
        r5 = new fr.pcsoft.wdjava.contact.WDContact[r2];	 Catch:{ all -> 0x00f6 }
        if (r6 == 0) goto L_0x0256;
    L_0x01ce:
        r0 = f1404z;	 Catch:{ m -> 0x0254 }
        r1 = 7;	 Catch:{ m -> 0x0254 }
        r0 = r0[r1];	 Catch:{ m -> 0x0254 }
        r0 = r8.getColumnIndex(r0);	 Catch:{ m -> 0x0254 }
        r4 = r0;
    L_0x01d8:
        r8.moveToFirst();	 Catch:{ all -> 0x00f6 }
        r0 = r7;
    L_0x01dc:
        r1 = r8.isAfterLast();	 Catch:{ m -> 0x0262 }
        if (r1 != 0) goto L_0x0272;
    L_0x01e2:
        if (r9 == 0) goto L_0x01ee;
    L_0x01e4:
        r10 = r8.getLong(r4);	 Catch:{ m -> 0x0266 }
        r1 = java.util.Arrays.binarySearch(r9, r10);	 Catch:{ m -> 0x0266 }
        if (r1 < 0) goto L_0x026f;
    L_0x01ee:
        r1 = r0 + 1;
        if (r6 == 0) goto L_0x026a;
    L_0x01f2:
        r3 = fr.pcsoft.wdjava.contact.WDContact.m1814d(r8);	 Catch:{ m -> 0x0268 }
    L_0x01f6:
        r5[r0] = r3;	 Catch:{ all -> 0x00f6 }
        r0 = r1;	 Catch:{ all -> 0x00f6 }
        r1 = r2;	 Catch:{ all -> 0x00f6 }
    L_0x01fa:
        r8.moveToNext();	 Catch:{ all -> 0x00f6 }
        r2 = r1;
        goto L_0x01dc;
    L_0x01ff:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x0201:
        r0 = move-exception;	 Catch:{ all -> 0x0184 }
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x0203:
        r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI;	 Catch:{ all -> 0x00f6 }
        r0 = r0.buildUpon();	 Catch:{ all -> 0x00f6 }
        r1 = f1404z;	 Catch:{ all -> 0x00f6 }
        r2 = 18;	 Catch:{ all -> 0x00f6 }
        r1 = r1[r2];	 Catch:{ all -> 0x00f6 }
        r2 = r12.f1283c;	 Catch:{ all -> 0x00f6 }
        r0 = r0.appendQueryParameter(r1, r2);	 Catch:{ all -> 0x00f6 }
        r1 = f1404z;	 Catch:{ all -> 0x00f6 }
        r2 = 15;	 Catch:{ all -> 0x00f6 }
        r1 = r1[r2];	 Catch:{ all -> 0x00f6 }
        r2 = r12.f1284d;	 Catch:{ all -> 0x00f6 }
        r0 = r0.appendQueryParameter(r1, r2);	 Catch:{ all -> 0x00f6 }
        r1 = r0.build();	 Catch:{ all -> 0x00f6 }
        r0 = r10.getContentResolver();	 Catch:{ all -> 0x00f6 }
        r2 = 3;	 Catch:{ all -> 0x00f6 }
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x00f6 }
        r3 = 0;	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 7;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2[r3] = r4;	 Catch:{ all -> 0x00f6 }
        r3 = 1;	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 24;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2[r3] = r4;	 Catch:{ all -> 0x00f6 }
        r3 = 2;	 Catch:{ all -> 0x00f6 }
        r4 = f1404z;	 Catch:{ all -> 0x00f6 }
        r5 = 29;	 Catch:{ all -> 0x00f6 }
        r4 = r4[r5];	 Catch:{ all -> 0x00f6 }
        r2[r3] = r4;	 Catch:{ all -> 0x00f6 }
        r3 = f1404z;	 Catch:{ all -> 0x00f6 }
        r4 = 14;	 Catch:{ all -> 0x00f6 }
        r3 = r3[r4];	 Catch:{ all -> 0x00f6 }
        r4 = 0;	 Catch:{ all -> 0x00f6 }
        r5 = 0;	 Catch:{ all -> 0x00f6 }
        r8 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00f6 }
        goto L_0x01c6;	 Catch:{ all -> 0x00f6 }
    L_0x0254:
        r0 = move-exception;	 Catch:{ all -> 0x00f6 }
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x0256:
        r0 = f1404z;	 Catch:{ all -> 0x00f6 }
        r1 = 7;	 Catch:{ all -> 0x00f6 }
        r0 = r0[r1];	 Catch:{ all -> 0x00f6 }
        r0 = r8.getColumnIndex(r0);	 Catch:{ all -> 0x00f6 }
        r4 = r0;
        goto L_0x01d8;
    L_0x0262:
        r0 = move-exception;
        throw r0;	 Catch:{ m -> 0x0264 }
    L_0x0264:
        r0 = move-exception;
        throw r0;	 Catch:{ m -> 0x0266 }
    L_0x0266:
        r0 = move-exception;
        throw r0;	 Catch:{ m -> 0x0268 }
    L_0x0268:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x026a:
        r3 = fr.pcsoft.wdjava.contact.WDContact.m1813c(r8);	 Catch:{ all -> 0x00f6 }
        goto L_0x01f6;
    L_0x026f:
        r1 = r2 + -1;
        goto L_0x01fa;
    L_0x0272:
        if (r6 != 0) goto L_0x027c;
    L_0x0274:
        r0 = new fr.pcsoft.wdjava.contact.i;	 Catch:{ m -> 0x029b }
        r0.<init>();	 Catch:{ m -> 0x029b }
        java.util.Arrays.sort(r5, r0);	 Catch:{ m -> 0x029b }
    L_0x027c:
        r0 = new fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple;	 Catch:{ all -> 0x00f6 }
        r1 = 1;	 Catch:{ all -> 0x00f6 }
        r3 = 1;	 Catch:{ all -> 0x00f6 }
        r3 = new int[r3];	 Catch:{ all -> 0x00f6 }
        r4 = 0;	 Catch:{ all -> 0x00f6 }
        r3[r4] = r2;	 Catch:{ all -> 0x00f6 }
        r4 = 0;	 Catch:{ all -> 0x00f6 }
        r6 = new fr.pcsoft.wdjava.contact.l;	 Catch:{ all -> 0x00f6 }
        r6.<init>();	 Catch:{ all -> 0x00f6 }
        r0.<init>(r1, r3, r4, r6);	 Catch:{ all -> 0x00f6 }
    L_0x028e:
        if (r7 >= r2) goto L_0x029f;
    L_0x0290:
        r1 = r7 + 1;
        r10 = (long) r1;
        r1 = r5[r7];	 Catch:{ m -> 0x029d }
        r0.m3424a(r10, r1);	 Catch:{ m -> 0x029d }
        r7 = r7 + 1;
        goto L_0x028e;
    L_0x029b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x029d:
        r0 = move-exception;	 Catch:{ all -> 0x00f6 }
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x029f:
        if (r8 == 0) goto L_0x02aa;
    L_0x02a1:
        r1 = r8.isClosed();	 Catch:{ m -> 0x02ab }
        if (r1 != 0) goto L_0x02aa;	 Catch:{ m -> 0x02ab }
    L_0x02a7:
        r8.close();	 Catch:{ m -> 0x02ab }
    L_0x02aa:
        return r0;
    L_0x02ab:
        r0 = move-exception;
        throw r0;
    L_0x02ad:
        r0 = move-exception;
        throw r0;
    L_0x02af:
        r0 = move-exception;
        r1 = r8;
        goto L_0x0178;
    L_0x02b3:
        r9 = r8;
        r8 = r1;
        goto L_0x0195;
    L_0x02b7:
        r9 = r8;
        goto L_0x0195;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.contact.h.a(fr.pcsoft.wdjava.contact.WDContactSource, int, java.lang.String, java.lang.String):fr.pcsoft.wdjava.core.types.collection.tableau.WDTableauSimple");
    }

    /* renamed from: a */
    public static final void m2185a(WDContact wDContact) throws C0606q {
        try {
            WDAppManager.m2565a(f1404z[0], f1404z[1]);
            wDContact.m1832j();
        } catch (C0653m e) {
            throw new C0606q((int) C0607n.Le, e.getMessage());
        }
    }

    /* renamed from: a */
    public static final void m2186a(WDContact wDContact, WDContactSource wDContactSource) throws C0606q {
        String str = null;
        try {
            String str2;
            WDAppManager.m2565a(f1404z[0], f1404z[1]);
            if (wDContactSource != null) {
                try {
                    if (!(wDContactSource.f1284d.equals("") && wDContactSource.f1283c.equals(""))) {
                        Account[] a = C0597h.m2188a();
                        int i = 0;
                        while (i < a.length) {
                            try {
                                if (a[i].type.equalsIgnoreCase(wDContactSource.f1284d) && a[i].name.equalsIgnoreCase(wDContactSource.f1283c)) {
                                    str2 = a[i].type;
                                    str = a[i].name;
                                    break;
                                }
                                i++;
                            } catch (C0653m e) {
                                throw e;
                            } catch (C0653m e2) {
                                throw e2;
                            }
                        }
                        str2 = null;
                        try {
                            if (str2.equals("")) {
                                if (str.equals("")) {
                                    throw new C0606q(C0745b.m3222b(f1404z[2], new String[0]));
                                }
                            }
                            wDContact.m1830a(str2, str);
                        } catch (C0653m e22) {
                            throw e22;
                        } catch (C0653m e222) {
                            throw e222;
                        }
                    }
                } catch (C0653m e2222) {
                    throw e2222;
                }
            }
            str2 = null;
            wDContact.m1830a(str2, str);
        } catch (C0653m e22222) {
            throw new C0606q((int) C0607n.Le, e22222.getMessage());
        }
    }

    /* renamed from: a */
    public static final boolean m2187a(WDContact wDContact, boolean z) throws C0606q {
        try {
            WDAppManager.m2565a(f1404z[0]);
            long a = C0595f.m2149a(Contacts.CONTENT_URI, z);
            if (a >= 0) {
                try {
                    wDContact.m1829a(a, true);
                } catch (C0653m e) {
                    throw e;
                }
            }
            return a >= 0;
        } catch (C0653m e2) {
            throw new C0606q((int) C0607n.Le, e2.getMessage());
        }
    }

    /* renamed from: a */
    private static final Account[] m2188a() {
        AccountManager accountManager = AccountManager.get(C1056i.m7562a());
        if (accountManager != null) {
            return accountManager.getAccounts();
        }
        C0691a.m2856a(f1404z[8]);
        return new Account[0];
    }

    /* renamed from: b */
    public static final WDTableauSimple m2189b() throws C0606q {
        int i = 0;
        try {
            Throwable th;
            Cursor cursor;
            WDAppManager.m2565a(f1404z[4]);
            Account[] a = C0597h.m2188a();
            Account[] accountArr = new Account[a.length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < a.length) {
                Account account = a[i2];
                try {
                    String toLowerCase = account.type != null ? account.type.toLowerCase() : "";
                    try {
                        int i4;
                        if (!toLowerCase.equalsIgnoreCase(f1399b)) {
                            if (toLowerCase.indexOf(f1404z[5]) < 0) {
                                try {
                                    if (toLowerCase.indexOf(f1404z[3]) < 0) {
                                        try {
                                            Cursor query = C1056i.m7562a().getContentResolver().query(RawContacts.CONTENT_URI, new String[]{f1404z[7]}, f1404z[6], new String[]{account.name, account.type}, null);
                                            if (query != null) {
                                                try {
                                                    if (query.getCount() > 0) {
                                                        i4 = i3 + 1;
                                                        accountArr[i3] = account;
                                                        if (query == null) {
                                                            try {
                                                                if (!query.isClosed()) {
                                                                    query.close();
                                                                }
                                                            } catch (C0653m e) {
                                                                throw e;
                                                            }
                                                        }
                                                        continue;
                                                        i2++;
                                                        i3 = i4;
                                                    }
                                                } catch (C0653m e2) {
                                                    throw e2;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cursor = query;
                                                }
                                            }
                                            i4 = i3;
                                            if (query == null) {
                                                continue;
                                            } else if (!query.isClosed()) {
                                                query.close();
                                            }
                                            i2++;
                                            i3 = i4;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor = null;
                                        }
                                    }
                                } catch (C0653m e22) {
                                    throw e22;
                                }
                            }
                        }
                        i4 = i3 + 1;
                        accountArr[i3] = account;
                        i2++;
                        i3 = i4;
                    } catch (C0653m e222) {
                        throw e222;
                    } catch (C0653m e2222) {
                        throw e2222;
                    }
                } catch (C0653m e22222) {
                    throw e22222;
                }
            }
            WDTableauSimple wDTableauSimple = new WDTableauSimple(1, new int[]{i3}, 0, new C0600k());
            if (i3 > 0) {
                while (i < i3) {
                    try {
                        wDTableauSimple.m3424a((long) (i + 1), new WDContactSource(accountArr[i]));
                        i++;
                    } catch (C0653m e222222) {
                        throw e222222;
                    }
                }
            }
            return wDTableauSimple;
            if (cursor != null) {
                try {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (C0653m e2222222) {
                    throw e2222222;
                }
            }
            throw th;
        } catch (C0653m e22222222) {
            throw new C0606q((int) C0607n.Le, e22222222.getMessage());
        }
    }

    /* renamed from: b */
    public static final void m2190b(WDContact wDContact) throws C0606q {
        try {
            WDAppManager.m2565a(f1404z[0]);
            long n = wDContact.m1835n();
            if (n < 0) {
                try {
                    throw new C0606q(C0745b.m3222b(f1404z[9], new String[0]));
                } catch (C0653m e) {
                    throw e;
                }
            }
            C0595f.m2151b(ContentUris.withAppendedId(Contacts.CONTENT_URI, n));
        } catch (C0653m e2) {
            throw new C0606q((int) C0607n.Le, e2.getMessage());
        }
    }

    /* renamed from: c */
    public static final void m2191c(WDContact wDContact) throws C0606q {
        try {
            WDAppManager.m2565a(f1404z[0], f1404z[1]);
            wDContact.m1837r();
        } catch (C0653m e) {
            throw new C0606q((int) C0607n.Le, e.getMessage());
        }
    }

    /* renamed from: d */
    public static final boolean m2192d(WDContact wDContact) throws C0606q {
        try {
            WDAppManager.m2565a(f1404z[1]);
            long n = wDContact.m1835n();
            if (n < 0) {
                try {
                    throw new C0606q(C0745b.m3222b(f1404z[9], new String[0]));
                } catch (C0653m e) {
                    throw e;
                }
            }
            try {
                return C0595f.m2150a(ContentUris.withAppendedId(Contacts.CONTENT_URI, n));
            } catch (C0653m e2) {
                throw e2;
            }
        } catch (C0653m e22) {
            throw new C0606q((int) C0607n.Le, e22.getMessage());
        }
    }

    /* renamed from: z */
    private static String m2193z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 44;
                    break;
                case 1:
                    i2 = 48;
                    break;
                case 2:
                    i2 = 50;
                    break;
                case 3:
                    i2 = 15;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2194z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 32);
        }
        return toCharArray;
    }
}
