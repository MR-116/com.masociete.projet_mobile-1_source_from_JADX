package fr.pcsoft.wdjava.ui.p069g;

import fr.pcsoft.wdjava.ui.activite.C0502g;
import fr.pcsoft.wdjava.ui.activite.WDActivityListener;

/* renamed from: fr.pcsoft.wdjava.ui.g.a */
final class C1401a extends WDActivityListener {
    final C0502g val$activite;
    final int val$nAnimationEnFermeture;

    C1401a(int i, C0502g c0502g) {
        this.val$nAnimationEnFermeture = i;
        this.val$activite = c0502g;
    }

    public void onFinish(android.app.Activity r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0034 in list [B:10:0x0023]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = 0;
        r2 = r5.getResources();	 Catch:{ all -> 0x0035 }
        r1 = r4.val$nAnimationEnFermeture;	 Catch:{ all -> 0x0035 }
        r3 = -1;	 Catch:{ all -> 0x0035 }
        if (r1 == r3) goto L_0x004c;	 Catch:{ all -> 0x0035 }
    L_0x000a:
        r0 = r4.val$nAnimationEnFermeture;	 Catch:{ all -> 0x0035 }
        r1 = 1;	 Catch:{ all -> 0x0035 }
        r1 = fr.pcsoft.wdjava.ui.p069g.C1404d.m9970a(r2, r0, r1);	 Catch:{ all -> 0x0035 }
        r0 = r4.val$nAnimationEnFermeture;	 Catch:{ all -> 0x0035 }
        r3 = 0;	 Catch:{ all -> 0x0035 }
        r0 = fr.pcsoft.wdjava.ui.p069g.C1404d.m9970a(r2, r0, r3);	 Catch:{ all -> 0x0035 }
    L_0x0018:
        if (r1 < 0) goto L_0x001f;	 Catch:{ all -> 0x0035 }
    L_0x001a:
        if (r0 < 0) goto L_0x001f;	 Catch:{ all -> 0x0035 }
    L_0x001c:
        r5.overridePendingTransition(r1, r0);	 Catch:{ all -> 0x0035 }
    L_0x001f:
        r0 = r4.val$activite;
        if (r0 == 0) goto L_0x0034;
    L_0x0023:
        r0 = r4.val$activite;
        r0 = r0.mo1766b();
        if (r0 == 0) goto L_0x0034;
    L_0x002b:
        r0 = r4.val$activite;
        r0 = r0.mo1766b();
        r0.supprimerEcouteurActivite(r4);
    L_0x0034:
        return;
    L_0x0035:
        r0 = move-exception;
        r1 = r4.val$activite;
        if (r1 == 0) goto L_0x004b;
    L_0x003a:
        r1 = r4.val$activite;
        r1 = r1.mo1766b();
        if (r1 == 0) goto L_0x004b;
    L_0x0042:
        r1 = r4.val$activite;
        r1 = r1.mo1766b();
        r1.supprimerEcouteurActivite(r4);
    L_0x004b:
        throw r0;
    L_0x004c:
        r1 = r0;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.g.a.onFinish(android.app.Activity):void");
    }
}
