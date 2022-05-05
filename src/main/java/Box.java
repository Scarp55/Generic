public class Box<A, B, C> {

    private A key;
    private B valueInt;
    private C valueFloat;

    public A getKey() {
        return key;
    }

    public void setKey(A key) {
        this.key = key;
    }

    public B getValueInt() {
        return valueInt;
    }

    public void setValueInt(B valueInt) {
        this.valueInt = valueInt;
    }

    public C getValueFloat() {
        return valueFloat;
    }

    public void setValueFloat(C valueFloat) {
        this.valueFloat = valueFloat;
    }

    public Box(A key, B valueInt, C valueFloat) {
        this.key = key;
        this.valueInt = valueInt;
        this.valueFloat = valueFloat;
    }
}
