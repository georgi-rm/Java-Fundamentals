import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();
        int numberOfArticles = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfArticles; i++) {
            String[] initialArticle = scanner.nextLine().split(", ");
            Article myArticle = new Article(initialArticle[0], initialArticle[1], initialArticle[2]);
            articles.add(myArticle);
        }

        switch (scanner.nextLine()) {
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
        }

        for (Article article:articles) {
            System.out.println(article);
        }
    }
}
