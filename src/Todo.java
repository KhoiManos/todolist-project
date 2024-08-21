public class Todo {
    private String todo;
    private int rank;
    private String time;
    private String quickNote;
    private boolean checked;


    public Todo(String todo, int rank, String time, String quickNote, boolean checked){
        this.todo = todo;
        this.rank = rank;
        this.time = time;
        this.quickNote = quickNote;
        this.checked = false;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "kurz='" + todo + '\'' +
                ", rank=" + rank +
                ", zeiti='" + time + '\'' +
                ", quickiNote='" + quickNote + '\'' +
                ", done=" + checked +
                '}';
    }
}
