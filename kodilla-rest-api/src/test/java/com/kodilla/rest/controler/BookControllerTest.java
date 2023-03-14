package com.kodilla.rest.controler;

import com.kodilla.rest.domian.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {
    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController =new BookController(bookServiceMock);
    List<BookDto> bookList = new ArrayList<>();

    @Test
    void shouldFetchBooks(){
        //given
        bookList.add(new BookDto("Title1","Author1"));
        bookList.add(new BookDto("Title2","Author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);

    }
    @Test
    public void shouldAddBooks(){
       Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        bookList.add(new BookDto("Title1","Author1"));
        bookList.add(new BookDto("Title2","Author2"));


        bookController.addBook(new BookDto("Title1","Author1"));
        bookController.addBook(new BookDto("Title2","Author2"));

        Mockito.verify(bookServiceMock).addBook(new BookDto("Title1","Author1"));
        Mockito.verify(bookServiceMock).addBook(new BookDto("Title2","Author2"));




    }


}