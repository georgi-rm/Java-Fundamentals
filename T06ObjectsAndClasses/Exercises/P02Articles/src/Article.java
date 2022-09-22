public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String content) {
        if (!content.equals("")) {
            this.content = content;
        }
    }

    public void changeAuthor(String author) {
        if (!content.equals("")) {
            this.author = author;
        }
    }

    public void rename(String title) {
        if (!content.equals("")) {
            this.title = title;
        }
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
