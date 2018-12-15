package fr.pcsoft.wdjava.xml.classic;

import java.util.Stack;
import org.w3c.dom.Node;

/* renamed from: fr.pcsoft.wdjava.xml.classic.a */
public class C1528a {
    /* renamed from: a */
    private Stack f4683a = new Stack();
    /* renamed from: b */
    private int f4684b = 1;
    /* renamed from: c */
    private int f4685c = 0;
    /* renamed from: d */
    private int f4686d = 1;
    /* renamed from: e */
    private boolean f4687e = false;
    /* renamed from: f */
    private boolean f4688f = false;
    /* renamed from: g */
    private Node f4689g = null;
    /* renamed from: h */
    private String f4690h = null;

    public C1528a(String str, boolean z, int i, int i2, boolean z2, int i3) {
        this.f4690h = str;
        this.f4687e = z;
        this.f4686d = i;
        this.f4685c = i2;
        this.f4688f = z2;
        this.f4684b = i3;
    }

    /* renamed from: a */
    public int m10637a() {
        return this.f4686d;
    }

    /* renamed from: a */
    public void m10638a(String str) {
        this.f4690h = str;
    }

    /* renamed from: a */
    public void m10639a(Node node) {
        this.f4689g = node;
    }

    /* renamed from: a */
    public void m10640a(boolean z) {
        this.f4687e = z;
    }

    /* renamed from: b */
    public String m10641b() {
        return this.f4690h;
    }

    /* renamed from: c */
    public int m10642c() {
        return this.f4685c;
    }

    /* renamed from: d */
    public boolean m10643d() {
        return this.f4687e;
    }

    /* renamed from: e */
    public int m10644e() {
        return this.f4684b;
    }

    /* renamed from: f */
    public Node m10645f() {
        return this.f4689g;
    }

    /* renamed from: g */
    public boolean m10646g() {
        return this.f4688f;
    }

    /* renamed from: h */
    public Stack m10647h() {
        return this.f4683a;
    }

    /* renamed from: i */
    public void m10648i() {
        this.f4690h = null;
        if (this.f4683a != null) {
            this.f4683a.clear();
            this.f4683a = null;
        }
        this.f4689g = null;
    }
}
