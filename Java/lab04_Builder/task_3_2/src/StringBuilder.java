public class StringBuilder {
    private String string = "";

    public StringBuilder add(String string) {
        this.string += string;
        return this;
    }

    public StringBuilder addToPosition(String string, int position) {
        if (position >= this.string.length()) {
            return add(string);
        }
        this.string = this.string.substring(0, position) + string + this.string.substring(position);
        return this;
    }

    public StringBuilder replace(String string, int start, int length) {
        if (start < 0 || start > this.string.length() || length < 0 || (start + length) > this.string.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.string = this.string.substring(0, start) + string + this.string.substring(start + length);
        return this;
    }

    public String build() {
        return this.string;
    }
}