class Fach {
    private boolean lk;
    private String fach;
    private int note;

    public Fach(String name, boolean lk, int note) {
        this.lk = lk;
        this.fach = name;
        this.note = note;
    }

    public String getFach() {
        return fach;
    }

    public boolean getLk() {
        return lk;
    }

    public int getNote() {
        return note;
    }

}
