package me.enkaja.firenotes;

public class Note {
    private String title;
    private int id;
    private String content;

    Note(String content, int id) {
        this.content = content;
        this.id = id;
    }

    Note(String title, String content, int id) {
        this.title = title;
        this.content = content;
        this.id = id;
    }

    public int getId() { return id; }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }
}
