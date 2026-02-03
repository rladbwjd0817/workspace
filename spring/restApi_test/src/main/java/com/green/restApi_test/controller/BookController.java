package com.green.restApi_test.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
  private List<BookDTO> bookList;

//  생성자 생성
  public BookController(){
    bookList = new ArrayList<>();

    bookList.add(new BookDTO(1, "데미안", "헤르만 헤세", "선과 악", 15000));
    bookList.add(new BookDTO(2, "오늘 밤, 세계에서 이 사랑이 사라진다 해도", "이치조 미사키", "기억상실증", 20000));
    bookList.add(new BookDTO(3, "달러구트 꿈 백화점", "이미예", "꿈", 18000));
    bookList.add(new BookDTO(4, "어른의 행복은 조용하다", "태수", "행복", 22000));
    bookList.add(new BookDTO(5, "나는 나로 살기로 했다", "김수현", "나다움", 25000));
  }

//  2. 모든 도서정보 조회하는 API
//  url : (GET) localhost:8080/books
  @GetMapping("")
  public List<BookDTO> allBookData(){
    System.out.println("모든 도서의 정보를 조회합니다.");
    return bookList;
  }

// 3. 하나의 도서 정보를 조회하는 API
//  url : (GET) localhost:8080/books/{bookNum}
  @GetMapping("/{bookNum}")
  public BookDTO oneBookData(@PathVariable("bookNum") int bookNum){
    System.out.println(bookNum + "번 도서를 조회합니다.");

    BookDTO result = null;

    for (BookDTO book : bookList){
      if (book.getBookNum() == bookNum){
        result = book;
      }
    }
    return result;
  }

//  4. 하나의 도서정보를 등록하는 API
//  url : (POST) localhost:8080/books
  @PostMapping("")
  public void regBookData(@RequestBody BookDTO bookDTO){
    System.out.println("새로운 도서의 정보를 등록합니다.");
    bookList.add(bookDTO);
    System.out.println(bookDTO);
    System.out.println(bookList);
  }

//  5. 하나의 도서정보를 삭제하는 API
//  url : (DELETE) localhost:8080/books/1
  @DeleteMapping("/{bookNum}")
  public List<BookDTO> deleteOneData(@PathVariable("bookNum") int bookNum){
    System.out.println(bookNum + "번 도서의 정보를 삭제합니다.");

    for (int i = 0; i < bookList.size(); i++){
      if (bookList.get(i).getBookNum() == bookNum){
       bookList.remove(i);
      }
    }
    System.out.println(bookList);
    return bookList;
  }

//  6. 하나의 도서정보에서 도서명과 저자, 도서가격을 수정하는 API
//  url : (PUT) localhost:8080/books/1
  @PutMapping("/{bookNum}")
  public List<BookDTO> putOneData(@PathVariable("bookNum") int bookNum,
                                  @RequestBody BookDTO bookDTO){

//    수정 할 도서명 : 원피스, 저자 : 오다, 도서 가격 : 8000원
    System.out.println(bookNum + "번 도서의 정보를 수정합니다.");
    for (BookDTO b : bookList){
      if (b.getBookNum() == bookNum){
        b.setTitle(bookDTO.getTitle());
        b.setAuthor(bookDTO.getAuthor());
        b.setPrice(bookDTO.getPrice());
      }
    }

    System.out.println(bookNum + "번 도서의 정보가 수정되었습니다.");
    System.out.println(bookList);
    return bookList;
  }

}
