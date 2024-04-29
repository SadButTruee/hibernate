package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne()
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToMany
    @JoinTable(name = "books_readers"
    ,joinColumns = @JoinColumn(name = "book_id")
    ,inverseJoinColumns = @JoinColumn(name = "reader_id"))
    private List<Reader> readers;

    public Book(String title, Author author, List<Reader> readers) {
        this.title = title;
        this.author = author;
        this.readers = readers;
    }
}
