package pl.zzpj2020.solid.srp.book.solution;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public class Book {


    private Map<Integer, String> pages = new HashMap<>();

    private String title;

    private String author;

    public Book(){
        this.title = "A Great Book";
        this.author = "John Doe";
    }
}
