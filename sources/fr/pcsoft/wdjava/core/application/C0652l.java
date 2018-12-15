package fr.pcsoft.wdjava.core.application;

import android.os.AsyncTask;

/* renamed from: fr.pcsoft.wdjava.core.application.l */
class C0652l extends AsyncTask<Object, String, Boolean> {
    final WDAbstractLanceur this$0;

    C0652l(WDAbstractLanceur wDAbstractLanceur) {
        this.this$0 = wDAbstractLanceur;
    }

    /* renamed from: a */
    protected Boolean m2649a(Object... objArr) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean demarrer = WDProjet.getInstance().demarrer();
        if (System.currentTimeMillis() - currentTimeMillis < 1000) {
            try {
                Thread.sleep((currentTimeMillis + 1000) - System.currentTimeMillis());
            } catch (InterruptedException e) {
            }
        }
        WDAppManager.m2598y();
        return Boolean.valueOf(demarrer);
    }

    /* renamed from: a */
    protected void m2650a(Boolean bool) {
        if (!this.this$0.isFinishing() && bool.booleanValue()) {
            this.this$0.run();
            this.this$0.finish();
        }
    }

    protected /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return m2649a(objArr);
    }

    protected /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        m2650a((Boolean) obj);
    }
}
